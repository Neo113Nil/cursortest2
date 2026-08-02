package xsna;

/* compiled from: GradientCover.kt */
/* loaded from: classes5.dex */
public final class ebu {
    public static final void a(yk8 yk8Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1492245433);
        if ((i & 6) == 0) {
            i2 = (M.J(yk8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1492245433, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.cover.GradientCover (GradientCover.kt:10)");
            }
            f9t.e(hr80.l(txj0.f(q630Var, 1.0f), yk8Var, null, 2), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mka(yk8Var, q630Var, i, 1);
        }
    }
}
