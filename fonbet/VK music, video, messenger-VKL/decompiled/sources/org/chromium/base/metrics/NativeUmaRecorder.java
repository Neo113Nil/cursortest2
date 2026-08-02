package org.chromium.base.metrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.base.Callback;
import org.chromium.base.TimeUtils;

/* loaded from: classes8.dex */
final class NativeUmaRecorder implements UmaRecorder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Map<String, Long> mNativeHints = Collections.synchronizedMap(new HashMap());
    private Map<Callback<String>, Long> mUserActionTestingCallbackNativePtrs;

    public interface Natives {
        long addActionCallbackForTesting(Callback<String> callback);

        long createHistogramSnapshotForTesting();

        void destroyHistogramSnapshotForTesting(long j);

        long[] getHistogramSamplesForTesting(String str);

        int getHistogramTotalCountForTesting(String str, long j);

        int getHistogramValueCountForTesting(String str, int i, long j);

        long recordBooleanHistogram(String str, long j, boolean z);

        long recordExponentialHistogram(String str, long j, int i, int i2, int i3, int i4);

        long recordLinearHistogram(String str, long j, int i, int i2, int i3, int i4);

        long recordSparseHistogram(String str, long j, int i);

        void recordUserAction(String str, long j);

        void removeActionCallbackForTesting(long j);
    }

    private long getNativeHint(String str) {
        Long l = this.mNativeHints.get(str);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    private void maybeUpdateNativeHint(String str, long j, long j2) {
        if (j != j2) {
            this.mNativeHints.put(str, Long.valueOf(j2));
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void addUserActionCallbackForTesting(Callback<String> callback) {
        long addActionCallbackForTesting = NativeUmaRecorderJni.get().addActionCallbackForTesting(callback);
        if (this.mUserActionTestingCallbackNativePtrs == null) {
            this.mUserActionTestingCallbackNativePtrs = Collections.synchronizedMap(new HashMap());
        }
        this.mUserActionTestingCallbackNativePtrs.put(callback, Long.valueOf(addActionCallbackForTesting));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public List<HistogramBucket> getHistogramSamplesForTesting(String str) {
        long[] histogramSamplesForTesting = NativeUmaRecorderJni.get().getHistogramSamplesForTesting(str);
        ArrayList arrayList = new ArrayList(histogramSamplesForTesting.length);
        for (int i = 0; i < histogramSamplesForTesting.length; i += 3) {
            arrayList.add(new HistogramBucket((int) histogramSamplesForTesting[i], histogramSamplesForTesting[i + 1], (int) histogramSamplesForTesting[i + 2]));
        }
        return arrayList;
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramTotalCountForTesting(String str) {
        return NativeUmaRecorderJni.get().getHistogramTotalCountForTesting(str, 0L);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramValueCountForTesting(String str, int i) {
        return NativeUmaRecorderJni.get().getHistogramValueCountForTesting(str, i, 0L);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordBooleanHistogram(String str, boolean z) {
        long nativeHint = getNativeHint(str);
        maybeUpdateNativeHint(str, nativeHint, NativeUmaRecorderJni.get().recordBooleanHistogram(str, nativeHint, z));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordExponentialHistogram(String str, int i, int i2, int i3, int i4) {
        long nativeHint = getNativeHint(str);
        maybeUpdateNativeHint(str, nativeHint, NativeUmaRecorderJni.get().recordExponentialHistogram(str, nativeHint, i, i2, i3, i4));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordLinearHistogram(String str, int i, int i2, int i3, int i4) {
        long nativeHint = getNativeHint(str);
        maybeUpdateNativeHint(str, nativeHint, NativeUmaRecorderJni.get().recordLinearHistogram(str, nativeHint, i, i2, i3, i4));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordSparseHistogram(String str, int i) {
        long nativeHint = getNativeHint(str);
        maybeUpdateNativeHint(str, nativeHint, NativeUmaRecorderJni.get().recordSparseHistogram(str, nativeHint, i));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordUserAction(String str, long j) {
        NativeUmaRecorderJni.get().recordUserAction(str, TimeUtils.elapsedRealtimeMillis() - j);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void removeUserActionCallbackForTesting(Callback<String> callback) {
        Long remove;
        Map<Callback<String>, Long> map = this.mUserActionTestingCallbackNativePtrs;
        if (map == null || (remove = map.remove(callback)) == null) {
            return;
        }
        NativeUmaRecorderJni.get().removeActionCallbackForTesting(remove.longValue());
    }
}
