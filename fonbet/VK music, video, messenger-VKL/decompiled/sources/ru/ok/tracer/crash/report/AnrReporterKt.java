package ru.ok.tracer.crash.report;

import xsna.drm0;

/* compiled from: AnrReporter.kt */
/* loaded from: classes9.dex */
public final class AnrReporterKt {
    public static final int indexToInsertSnapshots(String str) {
        int K = drm0.K(0, 6, str, "\nDALVIK THREADS", false);
        if (K < 0) {
            return -1;
        }
        int K2 = drm0.K(K, 4, str, "\n\"main\"", false);
        if (K2 >= 0) {
            return drm0.K(K2 + 1, 4, str, "\n\n\"", false) + 2;
        }
        int K3 = drm0.K(K + 1, 4, str, "\n", false);
        if (K3 < 0) {
            return -1;
        }
        return K3 + 1;
    }
}
