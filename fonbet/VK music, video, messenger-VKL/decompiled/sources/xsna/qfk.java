package xsna;

/* compiled from: CropEditorContentView.kt */
/* loaded from: classes4.dex */
public final class qfk extends i6v0<l7a0, ofk> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((l7a0) ao50Var, izsVar, aVar, 512);
    }

    public final void h(l7a0 l7a0Var, izs<? super ofk, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(273146765);
        int i2 = (M.J(l7a0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(273146765, i2, -1, "com.vk.newsfeed.posting.crop_editor.presentation.base.view.CropEditorContentView.ThemedContent (CropEditorContentView.kt:26)");
            }
            fm50 fm50Var = (fm50) d(w6a0.a, new n0u0[]{l7a0Var.a, l7a0Var.b}, M, (i2 & 896) | 518).getValue();
            if (fm50Var instanceof w6a0) {
                M.K(-1647408927);
                rrv0.e(true, null, null, null, null, null, sei.a, M, 1572870, 62);
                M.j();
            } else {
                if (fm50Var instanceof v6a0) {
                    M.K(-1647034106);
                    rrv0.e(true, null, null, null, null, null, kai.c(-837844855, new ys0(2, (v6a0) fm50Var, izsVar), M), M, 1572870, 62);
                } else {
                    M.K(-1648779499);
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
            s.d = new wo7(this, l7a0Var, izsVar, i, 2);
        }
    }
}
