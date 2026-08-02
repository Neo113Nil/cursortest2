package xsna;

/* compiled from: TopshelfCardSkeleton.kt */
/* loaded from: classes2.dex */
public final class ibp0 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(24948909);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(24948909, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.skeleton.TopshelfCardSkeleton (TopshelfCardSkeleton.kt:15)");
            }
            ckv0.a(txj0.d(q630Var, 1.0f), null, uli.a, M, 384, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rbo(q630Var, i, 1);
        }
    }
}
