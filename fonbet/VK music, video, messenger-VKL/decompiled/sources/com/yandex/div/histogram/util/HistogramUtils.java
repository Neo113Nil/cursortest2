package com.yandex.div.histogram.util;

import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;

/* compiled from: HistogramUtils.kt */
/* loaded from: classes7.dex */
public final class HistogramUtils {
    public static final HistogramUtils INSTANCE = new HistogramUtils();

    private HistogramUtils() {
    }

    public final boolean shouldRecordHistogram(String str, HistogramRecordConfiguration histogramRecordConfiguration) {
        int hashCode = str.hashCode();
        if (hashCode != 2106116) {
            if (hashCode != 2106217) {
                if (hashCode == 2688677 && str.equals("Warm")) {
                    return histogramRecordConfiguration.isWarmRecordingEnabled();
                }
            } else if (str.equals("Cool")) {
                return histogramRecordConfiguration.isCoolRecordingEnabled();
            }
        } else if (str.equals("Cold")) {
            return histogramRecordConfiguration.isColdRecordingEnabled();
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (!Assert.isEnabled()) {
            return false;
        }
        Assert.fail("Unknown histogram call type: ".concat(str));
        return false;
    }
}
