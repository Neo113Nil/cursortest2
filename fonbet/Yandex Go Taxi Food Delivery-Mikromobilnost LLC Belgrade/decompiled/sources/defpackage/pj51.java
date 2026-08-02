package defpackage;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class pj51 implements tsr, ca20 {
    public ea20 a;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        ea20 ea20Var = new ea20(ssrVar.c, "yx_system_proxy");
        this.a = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        if (!jl40.l(x920Var.a, "getProxySettings")) {
            ((ba20) da20Var).notImplemented();
        } else {
            ((ba20) da20Var).success(b.i(new Pair(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, System.getProperty("http.proxyHost")), new Pair(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, System.getProperty("http.proxyPort"))));
        }
    }
}
