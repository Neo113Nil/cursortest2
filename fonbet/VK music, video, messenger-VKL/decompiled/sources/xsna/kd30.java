package xsna;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: MovieDescriptionView.kt */
/* loaded from: classes.dex */
public final class kd30 extends q2a<md30, com.vk.catalog.mvi.block.video.impl.movies.detail.description.a> {
    @Override // xsna.q2a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(a8a a8aVar, md30 md30Var, izs<? super com.vk.catalog.mvi.block.video.impl.movies.detail.description.a, s3q0> izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1707622174);
        if ((i & 48) == 0) {
            i2 = (M.J(md30Var) ? 32 : 16) | i;
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
                androidx.compose.runtime.b.f(1707622174, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.description.MovieDescriptionView.MovieDescriptionBlockView.ContentImpl (MovieDescriptionView.kt:102)");
            }
            float f = kqu0.w;
            com.vk.catalog.mvi.block.video.impl.movies.detail.description.b.a(md30Var, izsVar, s200.G(q630Var, f, kqu0.t, f, kqu0.v), M, (i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new jd30(this, a8aVar, md30Var, izsVar, q630Var, i));
        }
    }
}
