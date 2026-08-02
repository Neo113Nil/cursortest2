package com.yandex.div.histogram;

import com.yandex.div.histogram.util.Cancelable;
import xsna.jq;

/* compiled from: CpuUsageHistogramReporter.kt */
/* loaded from: classes7.dex */
public interface CpuUsageHistogramReporter {
    Cancelable startReporting(String str, int i);

    /* compiled from: CpuUsageHistogramReporter.kt */
    public static final class NoOp implements CpuUsageHistogramReporter {
        @Override // com.yandex.div.histogram.CpuUsageHistogramReporter
        public Cancelable startReporting(String str, int i) {
            return new jq(11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startReporting$lambda$0() {
        }
    }
}
