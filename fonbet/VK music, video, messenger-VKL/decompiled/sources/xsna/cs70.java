package xsna;

import xsna.fs70;

/* compiled from: ObtainVerificationMviView.kt */
/* loaded from: classes18.dex */
public final class cs70 extends i6v0<qs70, mr70> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((qs70) ao50Var, izsVar, aVar, 512);
    }

    public final void h(qs70 qs70Var, izs<? super mr70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1996760158);
        int i2 = (M.J(qs70Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1996760158, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.ObtainVerificationMviView.ThemedContent (ObtainVerificationMviView.kt:19)");
            }
            fs70 fs70Var = (fs70) d(fs70.a.a, new n0u0[]{qs70Var.a}, M, (i2 & 896) | 518).getValue();
            if (fs70Var instanceof fs70.b) {
                M.K(-184437378);
                os70.b((fs70.b) fs70Var, izsVar, M, ((i2 << 3) & 896) | 48);
                M.j();
            } else {
                M.K(963888454);
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
            s.d = new k71(i, 9, this, qs70Var, izsVar);
        }
    }
}
