package xsna;

import android.content.Context;
import xsna.ao50;
import xsna.kj50;

/* compiled from: ClipsMviComposeView.kt */
/* loaded from: classes16.dex */
public abstract class ame<VS extends ao50, A extends kj50> extends kk50<VS, A> implements xpo0<VS, A> {
    public final /* synthetic */ xnd e;

    public ame(Context context, f5z f5zVar, boolean z) {
        super(context, f5zVar);
        this.e = new xnd(z);
    }

    @Override // xsna.jj50
    public final void b(VS vs, izs<? super A, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1710631918);
        int i2 = (M.J(vs) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1710631918, i2, -1, "com.vk.clips.compose.ClipsMviComposeView.Content (ClipsMviComposeView.kt:20)");
            }
            jai c = kai.c(49424656, new zle(this, vs, izsVar, 0), M);
            int i3 = ((i2 >> 3) & 112) | 70;
            M.K(-1835037883);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1835037883, i3, -1, "com.vk.clips.compose.ClipsMviComposeView.Theme (ClipsMviComposeView.kt:0)");
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
            s.d = new ar0(i, 2, this, vs, izsVar);
        }
    }
}
