package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import java.util.List;
import xsna.q630;
import xsna.zc5;

/* compiled from: AuthorSelectionView.kt */
/* loaded from: classes4.dex */
public final class qc5 extends i6v0<zc5, ec5> {
    @Override // xsna.xpo0
    public final void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        zc5 zc5Var = (zc5) ao50Var;
        aVar.K(-208280483);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-208280483, 512, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.author_selection.AuthorSelectionView.ThemedContent (AuthorSelectionView.kt:49)");
        }
        fm50 fm50Var = (fm50) d(zc5.b.a, new n0u0[]{zc5Var.b, zc5Var.a}, aVar, 518).getValue();
        if (fm50Var instanceof zc5.a) {
            aVar.K(1344299082);
            zc5.a aVar2 = (zc5.a) fm50Var;
            wh50 c = jk50.c(aVar2.a, aVar);
            wh50 c2 = jk50.c(aVar2.b, aVar);
            List list = (List) c.getValue();
            PostingAuthorUiModel postingAuthorUiModel = (PostingAuthorUiModel) c2.getValue();
            boolean J = aVar.J(izsVar);
            Object x = aVar.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new pc5(izsVar, 0);
                aVar.R(x);
            }
            izs izsVar2 = (izs) x;
            qcy<Object>[] qcyVarArr = yc5.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-40522352, 0, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.author_selection.AuthorSelectionContent (AuthorSelectionView.kt:81)");
            }
            q630 E = ahn.E(n34.t(txj0.f(q630.a.a, 1.0f), dz5.I(0, 1, aVar, false), null), "author_selection_bottom_sheet");
            u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.x, 7);
            boolean y = aVar.y(list) | aVar.J(postingAuthorUiModel) | aVar.J(izsVar2);
            Object x2 = aVar.x();
            if (y || x2 == c0012a) {
                x2 = new sc5(list, postingAuthorUiModel, izsVar2, 0);
                aVar.R(x2);
            }
            lqy.a(E, null, n, null, null, null, false, null, (izs) x2, aVar, 0, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else {
            aVar.K(fm50Var instanceof zc5.b ? 1705947905 : 1341638693);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
