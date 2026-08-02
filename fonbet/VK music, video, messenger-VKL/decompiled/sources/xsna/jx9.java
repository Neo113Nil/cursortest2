package xsna;

/* compiled from: CartMapLoadingForeground.kt */
/* loaded from: classes18.dex */
public final class jx9 {
    public static final void a(boolean z, final boolean z2, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final boolean z3;
        final q630 q630Var2;
        long j;
        androidx.compose.runtime.a M = aVar.M(-2082372167);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.l(z2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2082372167, i2, -1, "com.vk.ecomm.cart.impl.common.ui.compose.map.CartMapLoadingForeground (CartMapLoadingForeground.kt:22)");
            }
            if (z2) {
                M.K(558625171);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = l5g.c(14, ylu0Var.getBackground().g, 0.7f);
                M.j();
            } else {
                M.K(558715846);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getBackground().g;
                M.j();
            }
            mtk0 b = lwj0.b(j, null, "LoadingColor", M, 384, 10);
            z3 = z;
            q630Var2 = q630Var;
            mm2.f(z3, q630Var2, anp.e(null, 3), anp.f(null, 3), null, kai.c(1885956577, new hx9(b, 0), M), M, (i2 & 14) | 200112, 16);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z3 = z;
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z3, z2, q630Var2, i) { // from class: xsna.ix9
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    jx9.a(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
