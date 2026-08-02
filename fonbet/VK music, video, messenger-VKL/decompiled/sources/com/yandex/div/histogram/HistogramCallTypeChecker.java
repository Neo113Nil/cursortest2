package com.yandex.div.histogram;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: HistogramCallTypeChecker.kt */
/* loaded from: classes7.dex */
public abstract class HistogramCallTypeChecker {
    private final Lazy reportedHistograms$delegate = new bpn0(new gzs<ConcurrentHashMap<String, s3q0>>() { // from class: com.yandex.div.histogram.HistogramCallTypeChecker$reportedHistograms$2
        @Override // xsna.gzs
        public final ConcurrentHashMap<String, s3q0> invoke() {
            return new ConcurrentHashMap<>();
        }
    });

    private final ConcurrentHashMap<String, s3q0> getReportedHistograms() {
        return (ConcurrentHashMap) this.reportedHistograms$delegate.getValue();
    }

    public final boolean addReported(String str) {
        return !getReportedHistograms().containsKey(str) && getReportedHistograms().putIfAbsent(str, s3q0.a) == null;
    }
}
