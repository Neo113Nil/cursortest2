package ru.ok.android.externcalls.sdk.urlsharing.external;

import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: UrlSharingManager.kt */
/* loaded from: classes9.dex */
public interface UrlSharingManager {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void start$default(UrlSharingManager urlSharingManager, String str, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        urlSharingManager.start(str, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void stop$default(UrlSharingManager urlSharingManager, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
        }
        if ((i & 1) != 0) {
            gzsVar = null;
        }
        if ((i & 2) != 0) {
            izsVar = null;
        }
        urlSharingManager.stop(gzsVar, izsVar);
    }

    void addListener(UrlSharingListener urlSharingListener);

    void removeListener(UrlSharingListener urlSharingListener);

    void start(String str, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void stop(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
