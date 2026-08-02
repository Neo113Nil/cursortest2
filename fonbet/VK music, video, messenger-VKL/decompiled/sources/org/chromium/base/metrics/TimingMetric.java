package org.chromium.base.metrics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.chromium.base.TimeUtils;

/* loaded from: classes8.dex */
public class TimingMetric implements AutoCloseable {
    private final String mMetricName;
    private long mStartTime;
    private final int mTimerType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TimerType {
        public static final int MEDIUM_UPTIME = 1;
        public static final int SHORT_THREAD_TIME = 2;
        public static final int SHORT_UPTIME = 0;
    }

    private TimingMetric(String str, int i) {
        this.mMetricName = str;
        this.mTimerType = i;
    }

    public static TimingMetric mediumUptime(String str) {
        TimingMetric timingMetric = new TimingMetric(str, 1);
        timingMetric.mStartTime = TimeUtils.uptimeMillis();
        return timingMetric;
    }

    public static TimingMetric shortThreadTime(String str) {
        TimingMetric timingMetric = new TimingMetric(str, 2);
        timingMetric.mStartTime = TimeUtils.currentThreadTimeMillis();
        return timingMetric;
    }

    public static TimingMetric shortUptime(String str) {
        TimingMetric timingMetric = new TimingMetric(str, 0);
        timingMetric.mStartTime = TimeUtils.uptimeMillis();
        return timingMetric;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        String str = this.mMetricName;
        long j = this.mStartTime;
        if (j == 0) {
            return;
        }
        this.mStartTime = 0L;
        int i = this.mTimerType;
        if (i == 0) {
            RecordHistogram.recordTimesHistogram(str, TimeUtils.uptimeMillis() - j);
        } else if (i == 1) {
            RecordHistogram.deprecatedRecordMediumTimesHistogram(str, TimeUtils.uptimeMillis() - j);
        } else {
            if (i != 2) {
                return;
            }
            RecordHistogram.recordTimesHistogram(str, TimeUtils.currentThreadTimeMillis() - j);
        }
    }
}
