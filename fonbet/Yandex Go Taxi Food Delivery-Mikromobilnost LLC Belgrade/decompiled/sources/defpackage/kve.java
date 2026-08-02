package defpackage;

import kotlin.collections.a;

/* loaded from: classes5.dex */
public final class kve {
    public static void a(String str) {
        IllegalStateException illegalStateException = new IllegalStateException();
        String th = illegalStateException.toString();
        xby.l(jst.e, a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", "bad_location_host"), ":", null, null, null, 62), null, new IllegalArgumentException(), unr0.r(b64.v("Bad host ", str, " ", th, " "), illegalStateException.getMessage(), " ", illegalStateException.getLocalizedMessage()), 2);
    }

    public static void b(IllegalArgumentException illegalArgumentException) {
        String th = illegalArgumentException.toString();
        xby.l(jst.e, a.X(scc.g("CORP_PERSONAL_ACCOUNT_ERROR_TOKEN", "errorWhenOpenExternalBrowser"), ":", null, null, null, 62), null, new IllegalArgumentException(), oyr.q(th, " ", illegalArgumentException.getMessage(), " ", illegalArgumentException.getLocalizedMessage()), 2);
    }
}
