package xsna;

import android.content.Context;
import xsna.t9j0;

/* compiled from: ShareBottomSheetView.kt */
/* loaded from: classes7.dex */
public final class f7j0 extends txs0<t9j0, t6j0> {
    public final boolean f;

    public f7j0(Context context, v6j0 v6j0Var, boolean z) {
        super(context, v6j0Var, z);
        this.f = z;
        vq.b(-1, -2, this.d);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        g((t9j0) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(t9j0 t9j0Var, izs<? super t6j0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1930544278);
        int i2 = (M.J(t9j0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1930544278, i2, -1, "com.vk.video.ui.share.impl.presentation.views.ShareBottomSheetView.ThemedContent (ShareBottomSheetView.kt:33)");
            }
            fm50 fm50Var = (fm50) d(t9j0.a.a, new n0u0[]{t9j0Var.a}, M, (i2 & 896) | 518).getValue();
            if (fm50Var instanceof t9j0.a) {
                M.K(172831278);
                M.j();
            } else {
                if (fm50Var instanceof t9j0.b) {
                    M.K(1062855086);
                    d7j0.d((u9j0) jk50.c(((t9j0.b) fm50Var).a, M).getValue(), this.f, izsVar, M, (i2 << 3) & 896);
                } else {
                    M.K(1061532440);
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w2k(this, t9j0Var, izsVar, i, 6);
        }
    }
}
