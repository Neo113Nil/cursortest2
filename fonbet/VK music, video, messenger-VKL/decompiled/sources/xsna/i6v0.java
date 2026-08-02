package xsna;

import android.content.Context;
import xsna.ao50;
import xsna.kj50;

/* compiled from: VkMviComposeView.kt */
/* loaded from: classes3.dex */
public abstract class i6v0<VS extends ao50, A extends kj50> extends kk50<VS, A> implements xpo0<VS, A> {
    public final /* synthetic */ emi e;

    public i6v0(Context context, f5z f5zVar) {
        super(context, f5zVar);
        this.e = emi.e;
    }

    @Override // xsna.jj50
    public final void b(VS vs, izs<? super A, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(49301956);
        int i2 = (M.J(vs) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(49301956, i2, -1, "com.vk.mvi.compose.vk.VkMviComposeView.Content (VkMviComposeView.kt:19)");
            }
            g(((i2 >> 3) & 112) | 70, M, kai.c(2123308898, new lob0(this, vs, izsVar), M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qbj0(this, vs, izsVar, i, 1);
        }
    }

    public void g(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        aVar.K(-184520691);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-184520691, i, -1, "com.vk.mvi.compose.vk.VkMviComposeView.Theme (VkMviComposeView.kt:0)");
        }
        this.e.g(i & 14, aVar, jaiVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
