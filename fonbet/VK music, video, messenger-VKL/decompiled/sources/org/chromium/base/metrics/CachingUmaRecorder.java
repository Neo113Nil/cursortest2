package org.chromium.base.metrics;

import android.annotation.SuppressLint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.chromium.base.Callback;
import org.chromium.base.Log;
import xsna.lhg;

/* loaded from: classes8.dex */
final class CachingUmaRecorder implements UmaRecorder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MAX_HISTOGRAM_COUNT = 256;
    static final int MAX_USER_ACTION_COUNT = 256;
    private static final String TAG = "CachingUmaRecorder";
    private UmaRecorder mDelegate;
    private int mDroppedUserActionCount;
    private List<Callback<String>> mUserActionCallbacksForTesting;
    private final ReentrantReadWriteLock mRwLock = new ReentrantReadWriteLock(false);
    private Map<String, Histogram> mHistogramByName = new HashMap();
    private final AtomicInteger mDroppedHistogramSampleCount = new AtomicInteger();
    private List<UserAction> mUserActions = new ArrayList();

    public static class Histogram {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final int MAX_SAMPLE_COUNT = 256;
        private final int mMax;
        private final int mMin;
        private final String mName;
        private final int mNumBuckets;
        private final List<Integer> mSamples = new ArrayList(1);
        private final int mType;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
            public static final int BOOLEAN = 1;
            public static final int EXPONENTIAL = 2;
            public static final int LINEAR = 3;
            public static final int SPARSE = 4;
        }

        public Histogram(int i, String str, int i2, int i3, int i4) {
            this.mType = i;
            this.mName = str;
            this.mMin = i2;
            this.mMax = i3;
            this.mNumBuckets = i4;
        }

        public synchronized boolean addSample(int i, String str, int i2, int i3, int i4, int i5) {
            if (this.mSamples.size() >= 256) {
                return false;
            }
            this.mSamples.add(Integer.valueOf(i2));
            return true;
        }

        public synchronized int flushTo(UmaRecorder umaRecorder) {
            int size;
            try {
                int i = this.mType;
                int i2 = 0;
                if (i == 1) {
                    for (int i3 = 0; i3 < this.mSamples.size(); i3++) {
                        umaRecorder.recordBooleanHistogram(this.mName, this.mSamples.get(i3).intValue() != 0);
                    }
                } else if (i == 2) {
                    UmaRecorder umaRecorder2 = umaRecorder;
                    while (i2 < this.mSamples.size()) {
                        UmaRecorder umaRecorder3 = umaRecorder2;
                        umaRecorder3.recordExponentialHistogram(this.mName, this.mSamples.get(i2).intValue(), this.mMin, this.mMax, this.mNumBuckets);
                        i2++;
                        umaRecorder2 = umaRecorder3;
                    }
                } else if (i == 3) {
                    while (i2 < this.mSamples.size()) {
                        UmaRecorder umaRecorder4 = umaRecorder;
                        umaRecorder4.recordLinearHistogram(this.mName, this.mSamples.get(i2).intValue(), this.mMin, this.mMax, this.mNumBuckets);
                        i2++;
                        umaRecorder = umaRecorder4;
                    }
                } else if (i == 4) {
                    while (i2 < this.mSamples.size()) {
                        umaRecorder.recordSparseHistogram(this.mName, this.mSamples.get(i2).intValue());
                        i2++;
                    }
                }
                size = this.mSamples.size();
                this.mSamples.clear();
            } catch (Throwable th) {
                throw th;
            }
            return size;
        }
    }

    public static class UserAction {
        private final long mElapsedRealtimeMillis;
        private final String mName;

        public UserAction(String str, long j) {
            this.mName = str;
            this.mElapsedRealtimeMillis = j;
        }

        public void flushTo(UmaRecorder umaRecorder) {
            umaRecorder.recordUserAction(this.mName, this.mElapsedRealtimeMillis);
        }
    }

    private void cacheHistogramSampleAlreadyWriteLocked(int i, String str, int i2, int i3, int i4, int i5) {
        int i6;
        String str2;
        int i7;
        int i8;
        int i9;
        Histogram histogram = this.mHistogramByName.get(str);
        if (histogram != null) {
            i6 = i;
            str2 = str;
            i7 = i3;
            i8 = i4;
            i9 = i5;
        } else {
            if (this.mHistogramByName.size() >= 256) {
                this.mDroppedHistogramSampleCount.incrementAndGet();
                return;
            }
            histogram = new Histogram(i, str, i3, i4, i5);
            this.mHistogramByName.put(str, histogram);
            i8 = i4;
            i9 = i5;
            i7 = i3;
            str2 = str;
            i6 = i;
        }
        if (histogram.addSample(i6, str2, i2, i7, i8, i9)) {
            return;
        }
        this.mDroppedHistogramSampleCount.incrementAndGet();
    }

    private void cacheOrRecordHistogramSample(int i, String str, int i2, int i3, int i4, int i5) {
        boolean tryAppendOrRecordSample = tryAppendOrRecordSample(i, str, i2, i3, i4, i5);
        CachingUmaRecorder cachingUmaRecorder = this;
        if (tryAppendOrRecordSample) {
            return;
        }
        cachingUmaRecorder.mRwLock.writeLock().lock();
        try {
            if (cachingUmaRecorder.mDelegate != null) {
                cachingUmaRecorder.mRwLock.readLock().lock();
                cachingUmaRecorder.mRwLock.writeLock().unlock();
                try {
                    recordHistogramSampleAlreadyLocked(i, str, i2, i3, i4, i5);
                    return;
                } finally {
                    this.mRwLock.readLock().unlock();
                }
            }
            try {
                cacheHistogramSampleAlreadyWriteLocked(i, str, i2, i3, i4, i5);
                this.mRwLock.writeLock().unlock();
            } catch (Throwable th) {
                th = th;
                cachingUmaRecorder = this;
                Throwable th2 = th;
                cachingUmaRecorder.mRwLock.writeLock().unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void flushHistogramsAlreadyLocked(Map<String, Histogram> map, int i) {
        int size = map.size();
        Iterator<Histogram> it = map.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().flushTo(this.mDelegate);
        }
        Log.i(TAG, "Flushed %d samples from %d histograms, %d samples were dropped.", Integer.valueOf(i2), Integer.valueOf(size), Integer.valueOf(i));
    }

    private void flushUserActionsAlreadyLocked(List<UserAction> list, int i) {
        Iterator<UserAction> it = list.iterator();
        while (it.hasNext()) {
            it.next().flushTo(this.mDelegate);
        }
        Log.i(TAG, "Flushed %d user action samples, %d samples were dropped.", Integer.valueOf(list.size()), Integer.valueOf(i));
    }

    private void recordHistogramSampleAlreadyLocked(int i, String str, int i2, int i3, int i4, int i5) {
        if (i == 1) {
            this.mDelegate.recordBooleanHistogram(str, i2 != 0);
            return;
        }
        if (i == 2) {
            this.mDelegate.recordExponentialHistogram(str, i2, i3, i4, i5);
        } else if (i == 3) {
            this.mDelegate.recordLinearHistogram(str, i2, i3, i4, i5);
        } else {
            if (i != 4) {
                throw new UnsupportedOperationException(lhg.a(i, "Unknown histogram type "));
            }
            this.mDelegate.recordSparseHistogram(str, i2);
        }
    }

    @SuppressLint({"VisibleForTests"})
    private void swapUserActionCallbacksForTesting(UmaRecorder umaRecorder, UmaRecorder umaRecorder2) {
        if (this.mUserActionCallbacksForTesting == null) {
            return;
        }
        for (int i = 0; i < this.mUserActionCallbacksForTesting.size(); i++) {
            if (umaRecorder != null) {
                umaRecorder.removeUserActionCallbackForTesting(this.mUserActionCallbacksForTesting.get(i));
            }
            if (umaRecorder2 != null) {
                umaRecorder2.addUserActionCallbackForTesting(this.mUserActionCallbacksForTesting.get(i));
            }
        }
    }

    private boolean tryAppendOrRecordSample(int i, String str, int i2, int i3, int i4, int i5) {
        CachingUmaRecorder cachingUmaRecorder;
        this.mRwLock.readLock().lock();
        try {
            if (this.mDelegate != null) {
                recordHistogramSampleAlreadyLocked(i, str, i2, i3, i4, i5);
                cachingUmaRecorder = this;
            } else {
                cachingUmaRecorder = this;
                try {
                    Histogram histogram = cachingUmaRecorder.mHistogramByName.get(str);
                    if (histogram == null) {
                        cachingUmaRecorder.mRwLock.readLock().unlock();
                        return false;
                    }
                    if (!histogram.addSample(i, str, i2, i3, i4, i5)) {
                        cachingUmaRecorder.mDroppedHistogramSampleCount.incrementAndGet();
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    cachingUmaRecorder.mRwLock.readLock().unlock();
                    throw th2;
                }
            }
            cachingUmaRecorder.mRwLock.readLock().unlock();
            return true;
        } catch (Throwable th3) {
            th = th3;
            cachingUmaRecorder = this;
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void addUserActionCallbackForTesting(Callback<String> callback) {
        this.mRwLock.writeLock().lock();
        try {
            if (this.mUserActionCallbacksForTesting == null) {
                this.mUserActionCallbacksForTesting = new ArrayList();
            }
            this.mUserActionCallbacksForTesting.add(callback);
            UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                umaRecorder.addUserActionCallbackForTesting(callback);
            }
            this.mRwLock.writeLock().unlock();
        } catch (Throwable th) {
            this.mRwLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List<org.chromium.base.metrics.HistogramBucket>] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    @Override // org.chromium.base.metrics.UmaRecorder
    public List<HistogramBucket> getHistogramSamplesForTesting(String str) {
        Integer[] numArr;
        ?? arrayList;
        this.mRwLock.readLock().lock();
        try {
            UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                arrayList = umaRecorder.getHistogramSamplesForTesting(str);
            } else {
                Histogram histogram = this.mHistogramByName.get(str);
                if (histogram == null) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    synchronized (histogram) {
                        numArr = (Integer[]) histogram.mSamples.toArray(new Integer[0]);
                    }
                    Arrays.sort(numArr);
                    arrayList = new ArrayList();
                    int i = 0;
                    while (i < numArr.length) {
                        int intValue = numArr[i].intValue();
                        int i2 = 0;
                        do {
                            i2++;
                            i++;
                            if (i < numArr.length) {
                            }
                            arrayList.add(new HistogramBucket(intValue, intValue + 1, i2));
                        } while (numArr[i].intValue() == intValue);
                        arrayList.add(new HistogramBucket(intValue, intValue + 1, i2));
                    }
                }
            }
            return arrayList;
        } finally {
            this.mRwLock.readLock().unlock();
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramTotalCountForTesting(String str) {
        int size;
        this.mRwLock.readLock().lock();
        try {
            UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                return umaRecorder.getHistogramTotalCountForTesting(str);
            }
            Histogram histogram = this.mHistogramByName.get(str);
            if (histogram == null) {
                this.mRwLock.readLock().unlock();
                return 0;
            }
            synchronized (histogram) {
                size = histogram.mSamples.size();
            }
            return size;
        } finally {
            this.mRwLock.readLock().unlock();
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramValueCountForTesting(String str, int i) {
        int i2;
        this.mRwLock.readLock().lock();
        try {
            UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                return umaRecorder.getHistogramValueCountForTesting(str, i);
            }
            Histogram histogram = this.mHistogramByName.get(str);
            if (histogram == null) {
                return 0;
            }
            synchronized (histogram) {
                i2 = 0;
                for (int i3 = 0; i3 < histogram.mSamples.size(); i3++) {
                    try {
                        if (((Integer) histogram.mSamples.get(i3)).intValue() == i) {
                            i2++;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return i2;
        } finally {
            this.mRwLock.readLock().unlock();
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordBooleanHistogram(String str, boolean z) {
        cacheOrRecordHistogramSample(1, str, z ? 1 : 0, 0, 0, 0);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordExponentialHistogram(String str, int i, int i2, int i3, int i4) {
        cacheOrRecordHistogramSample(2, str, i, i2, i3, i4);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordLinearHistogram(String str, int i, int i2, int i3, int i4) {
        cacheOrRecordHistogramSample(3, str, i, i2, i3, i4);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordSparseHistogram(String str, int i) {
        cacheOrRecordHistogramSample(4, str, i, 0, 0, 0);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordUserAction(String str, long j) {
        this.mRwLock.readLock().lock();
        try {
            UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                umaRecorder.recordUserAction(str, j);
                return;
            }
            this.mRwLock.readLock().unlock();
            this.mRwLock.writeLock().lock();
            try {
                if (this.mDelegate != null) {
                    this.mRwLock.readLock().lock();
                    this.mRwLock.writeLock().unlock();
                    try {
                        this.mDelegate.recordUserAction(str, j);
                        return;
                    } finally {
                    }
                }
                if (this.mUserActions.size() < 256) {
                    this.mUserActions.add(new UserAction(str, j));
                } else {
                    this.mDroppedUserActionCount++;
                }
                if (this.mUserActionCallbacksForTesting != null) {
                    for (int i = 0; i < this.mUserActionCallbacksForTesting.size(); i++) {
                        this.mUserActionCallbacksForTesting.get(i).lambda$bind$0(str);
                    }
                }
                this.mRwLock.writeLock().unlock();
            } catch (Throwable th) {
                this.mRwLock.writeLock().unlock();
                throw th;
            }
        } finally {
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void removeUserActionCallbackForTesting(Callback<String> callback) {
        this.mRwLock.writeLock().lock();
        try {
            List<Callback<String>> list = this.mUserActionCallbacksForTesting;
            if (list != null) {
                list.remove(callback);
                UmaRecorder umaRecorder = this.mDelegate;
                if (umaRecorder != null) {
                    umaRecorder.removeUserActionCallbackForTesting(callback);
                }
            }
        } finally {
            this.mRwLock.writeLock().unlock();
        }
    }

    public UmaRecorder setDelegate(UmaRecorder umaRecorder) {
        Map<String, Histogram> map;
        int i;
        this.mRwLock.writeLock().lock();
        try {
            UmaRecorder umaRecorder2 = this.mDelegate;
            this.mDelegate = umaRecorder;
            if (umaRecorder == null) {
                this.mRwLock.writeLock().unlock();
                return umaRecorder2;
            }
            List<UserAction> list = null;
            int i2 = 0;
            if (this.mHistogramByName.isEmpty()) {
                map = null;
                i = 0;
            } else {
                map = this.mHistogramByName;
                this.mHistogramByName = new HashMap();
                i = this.mDroppedHistogramSampleCount.getAndSet(0);
            }
            if (!this.mUserActions.isEmpty()) {
                list = this.mUserActions;
                this.mUserActions = new ArrayList();
                int i3 = this.mDroppedUserActionCount;
                this.mDroppedUserActionCount = 0;
                i2 = i3;
            }
            this.mRwLock.readLock().lock();
            this.mRwLock.writeLock().unlock();
            if (map != null) {
                try {
                    flushHistogramsAlreadyLocked(map, i);
                } catch (Throwable th) {
                    this.mRwLock.readLock().unlock();
                    throw th;
                }
            }
            if (list != null) {
                flushUserActionsAlreadyLocked(list, i2);
            }
            this.mRwLock.readLock().unlock();
            return umaRecorder2;
        } catch (Throwable th2) {
            this.mRwLock.writeLock().unlock();
            throw th2;
        }
    }
}
