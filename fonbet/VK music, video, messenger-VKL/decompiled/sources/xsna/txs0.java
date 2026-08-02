package xsna;

import android.content.Context;
import xsna.ao50;
import xsna.kj50;

/* compiled from: VideoMviComposeView.kt */
/* loaded from: classes7.dex */
public abstract class txs0<VS extends ao50, A extends kj50> extends kk50<VS, A> implements xpo0<VS, A> {
    public final /* synthetic */ bds0 e;

    public txs0(Context context, v6j0 v6j0Var, boolean z) {
        super(context, v6j0Var);
        this.e = new bds0(z);
    }

    @Override // xsna.jj50
    public final void b(VS vs, izs<? super A, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(863515345);
        int i2 = (M.J(vs) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(863515345, i2, -1, "com.vk.video.ui.share.impl.compose.VideoMviComposeView.Content (VideoMviComposeView.kt:20)");
            }
            jai c = kai.c(-1000764301, new qq0(this, vs, izsVar, 12), M);
            int i3 = ((i2 >> 3) & 112) | 70;
            M.K(2053139944);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2053139944, i3, -1, "com.vk.video.ui.share.impl.compose.VideoMviComposeView.Theme (VideoMviComposeView.kt:0)");
            }
            this.e.a(6, M, c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vb5(i, 9, this, vs, izsVar);
        }
    }
}
