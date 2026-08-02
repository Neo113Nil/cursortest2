package ru.ok.android.externcalls.sdk.stat.signaling;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.j5g;
import xsna.s3q0;

/* compiled from: SignalingTracker.kt */
/* loaded from: classes9.dex */
public final class SignalingTracker {
    private final TimeProvider timeProvider;
    private final Object lock = new Object();
    private final ConcurrentHashMap<String, Long> requestTimestampMs = new ConcurrentHashMap<>();
    private final Map<String, StatisticsInfo> requestInfos = new LinkedHashMap();

    /* compiled from: SignalingTracker.kt */
    public static final class StatisticsInfo {
        private final OnlineQuantilesApproximator approximator50;
        private final OnlineQuantilesApproximator approximator95;
        private int count = 1;
        private final String name;
        private double sum;

        public StatisticsInfo(String str, long j) {
            this.name = str;
            this.sum = j;
            float f = j;
            this.approximator50 = new OnlineQuantilesApproximator(f, 0.5f, 0, 4, null);
            this.approximator95 = new OnlineQuantilesApproximator(f, 0.95f, 0, 4, null);
        }

        public final long getAverage() {
            return (long) (this.sum / this.count);
        }

        public final int getCount() {
            return this.count;
        }

        public final long getMaxValue() {
            return (long) this.approximator50.getMax();
        }

        public final Long getMedian() {
            Float valueOf = Float.valueOf(this.approximator50.get());
            if (Math.abs(valueOf.floatValue()) > Float.MAX_VALUE) {
                valueOf = null;
            }
            if (valueOf != null) {
                return Long.valueOf((long) valueOf.floatValue());
            }
            return null;
        }

        public final long getMinValue() {
            return (long) this.approximator50.getMin();
        }

        public final String getName() {
            return this.name;
        }

        public final Long getQuantile95() {
            Float valueOf = Float.valueOf(this.approximator95.get());
            if (Math.abs(valueOf.floatValue()) > Float.MAX_VALUE) {
                valueOf = null;
            }
            if (valueOf != null) {
                return Long.valueOf((long) valueOf.floatValue());
            }
            return null;
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public final void update(long j) {
            this.count++;
            this.sum += j;
            float f = j;
            this.approximator50.submit(f);
            this.approximator95.submit(f);
        }
    }

    public SignalingTracker(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public final Collection<StatisticsInfo> extractStatistics() {
        List list;
        synchronized (this.lock) {
            List O0 = j5g.O0(this.requestInfos.values());
            this.requestInfos.clear();
            this.requestTimestampMs.clear();
            list = O0;
        }
        return list;
    }

    public final void onAnswer(String str) {
        Long remove = this.requestTimestampMs.remove(str);
        if (remove != null) {
            long msSinceBoot = this.timeProvider.getMsSinceBoot() - remove.longValue();
            synchronized (this.lock) {
                try {
                    StatisticsInfo statisticsInfo = this.requestInfos.get(str);
                    if (statisticsInfo != null) {
                        statisticsInfo.update(msSinceBoot);
                    } else {
                        this.requestInfos.put(str, new StatisticsInfo(str, msSinceBoot));
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void onRequest(String str) {
        this.requestTimestampMs.put(str, Long.valueOf(this.timeProvider.getMsSinceBoot()));
    }
}
