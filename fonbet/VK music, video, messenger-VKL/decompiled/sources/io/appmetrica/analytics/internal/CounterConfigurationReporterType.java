package io.appmetrica.analytics.internal;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ironsource.X3;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes8.dex */
public enum CounterConfigurationReporterType {
    MAIN(X3.i.Z),
    MANUAL("manual"),
    SELF_SDK("self_sdk"),
    COMMUTATION("commutation"),
    SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
    SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
    CRASH(CrashHianalyticsData.EVENT_ID_CRASH);

    public static final Companion Companion = new Companion(null);
    private final String a;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CounterConfigurationReporterType fromStringValue(String str) {
            CounterConfigurationReporterType counterConfigurationReporterType;
            CounterConfigurationReporterType[] values = CounterConfigurationReporterType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    counterConfigurationReporterType = null;
                    break;
                }
                counterConfigurationReporterType = values[i];
                if (epx.f(counterConfigurationReporterType.getStringValue(), str)) {
                    break;
                }
                i++;
            }
            return counterConfigurationReporterType == null ? CounterConfigurationReporterType.MAIN : counterConfigurationReporterType;
        }

        private Companion() {
        }
    }

    CounterConfigurationReporterType(String str) {
        this.a = str;
    }

    public static final CounterConfigurationReporterType fromStringValue(String str) {
        return Companion.fromStringValue(str);
    }

    public final String getStringValue() {
        return this.a;
    }
}
