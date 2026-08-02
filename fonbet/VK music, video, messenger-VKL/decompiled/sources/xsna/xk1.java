package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: AlbumTitleSubtitleAvatar.kt */
/* loaded from: classes.dex */
public final class xk1 extends q2a<al1, yk1> {
    @Override // xsna.q2a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(a8a a8aVar, al1 al1Var, izs<? super yk1, s3q0> izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1396816441);
        if ((i & 48) == 0) {
            i2 = (M.J(al1Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1396816441, i2, -1, "com.vk.catalog.mvi.block.impl.albumauthor.AlbumTitleSubtitleAvatar.BlockView.ContentImpl (AlbumTitleSubtitleAvatar.kt:172)");
            }
            oi1.a(al1Var, izsVar, q630Var, M, (i2 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new wk1(this, a8aVar, al1Var, izsVar, q630Var, i));
        }
    }
}
