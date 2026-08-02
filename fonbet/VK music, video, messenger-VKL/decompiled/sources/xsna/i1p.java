package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.zra0;

/* compiled from: EditStorefrontAlbumEmptyPlaceholderContent.kt */
/* loaded from: classes18.dex */
public final class i1p {
    public static final void a(int i, androidx.compose.runtime.a aVar, q630 q630Var, boolean z) {
        androidx.compose.runtime.a M = aVar.M(1676461111);
        int i2 = (M.l(z) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1676461111, i2, -1, "com.vk.ecomm.market.album.compose.EditStorefrontAlbumEmptyPlaceholderContent (EditStorefrontAlbumEmptyPlaceholderContent.kt:16)");
            }
            q630Var = q630.a.a;
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ldv0.d(null, null, zra0.a.a(d370.N(z ? R.string.market_album_all_goods_empty_title : R.string.market_album_goods_empty_title, 0, M), null, d370.N(z ? R.string.market_album_all_goods_empty_subtitle : R.string.market_album_goods_empty_subtitle, 0, M), null, M, 196608, 26), null, null, null, false, M, 0, 123);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h1p(i, 0, q630Var, z);
        }
    }
}
