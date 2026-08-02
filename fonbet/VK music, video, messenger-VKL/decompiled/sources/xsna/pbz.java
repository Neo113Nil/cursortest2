package xsna;

import xsna.sbz;

/* compiled from: LinkVKBidMviView.kt */
/* loaded from: classes18.dex */
public final class pbz extends i6v0<dcz, hbz> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((dcz) ao50Var, izsVar, aVar, 512);
    }

    public final void h(dcz dczVar, izs<? super hbz, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(976838130);
        int i2 = (M.J(dczVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(976838130, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.LinkVKBidMviView.ThemedContent (LinkVKBidMviView.kt:19)");
            }
            sbz sbzVar = (sbz) d(sbz.a.a, new n0u0[]{dczVar.a}, M, (i2 & 896) | 518).getValue();
            if (sbzVar instanceof sbz.b) {
                M.K(-1713322857);
                ccz.a((sbz.b) sbzVar, izsVar, M, ((i2 << 3) & 896) | 48);
                M.j();
            } else {
                M.K(-1856377354);
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
            s.d = new ar0(i, 3, this, dczVar, izsVar);
        }
    }
}
