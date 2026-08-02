package xsna;

import xsna.ddd0;

/* compiled from: PrivacyEditDonutLevelsBottomSheetView.kt */
/* loaded from: classes18.dex */
public final class fdd0 extends i6v0<ldd0, zcd0> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((ldd0) ao50Var, izsVar, aVar, 512);
    }

    public final void h(ldd0 ldd0Var, izs<? super zcd0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(912859546);
        int i2 = (M.J(ldd0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(912859546, i2, -1, "com.vk.donut.privacy.levels.levelsbottomsheet.PrivacyEditDonutLevelsBottomSheetView.ThemedContent (PrivacyEditDonutLevelsBottomSheetView.kt:61)");
            }
            ddd0.b bVar = ddd0.b.a;
            wh50 d = d(bVar, new n0u0[]{ldd0Var.a}, M, (i2 & 896) | 518);
            ddd0 ddd0Var = (ddd0) d.getValue();
            if (epx.f(ddd0Var, bVar)) {
                M.K(1084709470);
                M.j();
            } else {
                if (!(ddd0Var instanceof ddd0.a)) {
                    throw alb0.c(1084707225, M);
                }
                M.K(1084711865);
                kdd0.a((ddd0.a) ((ddd0) d.getValue()), izsVar, null, false, M, i2 & 112);
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
            s.d = new l8c(i, 8, this, ldd0Var, izsVar);
        }
    }
}
