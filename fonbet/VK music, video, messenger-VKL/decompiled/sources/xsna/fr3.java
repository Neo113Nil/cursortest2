package xsna;

import android.content.Context;
import xsna.mr3;

/* compiled from: ArtistListBottomSheetContentView.kt */
/* loaded from: classes3.dex */
public final class fr3 extends i6v0<mr3, br3> {
    public final boolean f;

    public fr3(Context context, ar3 ar3Var, boolean z) {
        super(context, ar3Var);
        this.f = z;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((mr3) ao50Var, izsVar, aVar, 512);
    }

    public final void h(mr3.a aVar, izs<? super br3, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-275497125);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-275497125, i2, -1, "com.vk.music.bottomsheets.artistlist.presentation.ArtistListBottomSheetContentView.ArtistContent (ArtistListBottomSheetContentView.kt:47)");
            }
            if (epx.f(aVar, mr3.a.b.a)) {
                M.K(1535243711);
                M.j();
            } else {
                if (!(aVar instanceof mr3.a.C3368a)) {
                    throw alb0.c(1535241260, M);
                }
                M.K(1535246799);
                xr3.b((mr3.a.C3368a) aVar, null, izsVar, M, (i2 << 3) & 896);
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
            s.d = new er3(this, aVar, izsVar, i, 0);
        }
    }

    public final void i(mr3 mr3Var, izs<? super br3, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-851447899);
        int i2 = (M.J(mr3Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        int i3 = 0;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-851447899, i2, -1, "com.vk.music.bottomsheets.artistlist.presentation.ArtistListBottomSheetContentView.ThemedContent (ArtistListBottomSheetContentView.kt:26)");
            }
            wh50 d = d(mr3.a.b.a, new n0u0[]{mr3Var.a, mr3Var.b}, M, (i2 & 896) | 6);
            if (this.f) {
                M.K(592848623);
                aVar2 = M;
                rrv0.e(true, null, null, null, null, null, kai.c(347155107, new cr3(this, izsVar, d, i3), M), aVar2, 1572870, 62);
                aVar2.j();
            } else {
                M.K(592994602);
                rrv0.d(null, null, null, null, kai.c(-1692495122, new jk1(this, izsVar, d), M), M, 24576, 15);
                aVar2 = M;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new dr3(i, 0, this, mr3Var, izsVar);
        }
    }
}
