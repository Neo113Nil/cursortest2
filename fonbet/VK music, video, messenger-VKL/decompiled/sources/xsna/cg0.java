package xsna;

/* compiled from: AdInstreamRedirectView.kt */
/* loaded from: classes16.dex */
public final class cg0 {
    public static final void a(dg0 dg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        String str;
        androidx.compose.runtime.a M = aVar.M(1483054573);
        if ((i & 6) == 0) {
            i2 = (M.J(dg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1483054573, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.autoplay.player.AdInstreamRedirectView (AdInstreamRedirectView.kt:28)");
            }
            sh0 sh0Var = dg0Var.a;
            q630Var2 = q630Var;
            mm2.f(((sh0Var == null || (str = sh0Var.d) == null) ? null : cqm0.a(str)) != null, q630Var2, anp.d(jq2.d(300, 0, null, 6), null, null, 14), anp.k(jq2.d(300, 0, null, 6), null, 14), null, kai.c(1968792261, new yf0(dg0Var, 0), M), M, (i2 & 112) | 200064, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zf0(dg0Var, q630Var2, i, 0);
        }
    }
}
