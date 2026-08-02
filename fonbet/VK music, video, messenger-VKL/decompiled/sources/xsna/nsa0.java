package xsna;

/* compiled from: PlaceholderImage.kt */
/* loaded from: classes3.dex */
public final class nsa0 {
    public static final void a(final float f, final int i, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(173932804);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(173932804, i2, -1, "com.vk.music.stickyplayer.presentation.components.PlaceholderImage (PlaceholderImage.kt:15)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f9t.e(hr80.m(q630Var, ylu0Var.getBackground().z, vog0.b(f)), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.msa0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    nsa0.a(f, I, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
