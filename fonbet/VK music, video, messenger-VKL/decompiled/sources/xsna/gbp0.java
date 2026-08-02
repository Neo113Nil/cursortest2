package xsna;

import xsna.jbp0;

/* compiled from: TopshelfCardScrollPlaceholder.kt */
/* loaded from: classes2.dex */
public final class gbp0 {
    public static final void a(jbp0 jbp0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(661561284);
        int i2 = (M.J(jbp0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(661561284, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.card.TopshelfCardScrollPlaceholder (TopshelfCardScrollPlaceholder.kt:18)");
            }
            if (jbp0Var.equals(jbp0.b.a)) {
                M.K(-1032528131);
                ibp0.a(q630Var, M, 6);
                M.j();
                q630Var2 = q630Var;
            } else {
                if (!(jbp0Var instanceof jbp0.a)) {
                    throw alb0.c(105238902, M);
                }
                M.K(-1032409680);
                q630Var2 = q630Var;
                ua8.a(q630Var2, null, false, kai.c(903821883, new eoi(jbp0Var, 3), M), M, 3078, 6);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x2(jbp0Var, q630Var2, i, 11);
        }
    }
}
