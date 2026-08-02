package xsna;

/* compiled from: EmptyCover.kt */
/* loaded from: classes5.dex */
public final class ofp {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var, boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1857957789);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1857957789, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.cover.EmptyCover (EmptyCover.kt:27)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ua8.a(hr80.m(f, ylu0Var.getImage().b, androidx.compose.ui.graphics.e.a), null, false, kai.c(1322793715, new nfp(z, gzsVar), M), M, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u38(i, 1, q630Var, gzsVar, z);
        }
    }
}
