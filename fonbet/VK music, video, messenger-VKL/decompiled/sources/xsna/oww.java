package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import com.vkontakte.android.R;
import xsna.ar20;
import xsna.q630;
import xsna.zq20;

/* compiled from: InfoWithImageHolder.kt */
/* loaded from: classes18.dex */
public final class oww {
    public static final void a(mww mwwVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1937611529);
        int i2 = i | (M.J(mwwVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1937611529, i2, -1, "com.vk.ecomm.market.good.ui.holder.InfoWithIconContent (InfoWithImageHolder.kt:55)");
            }
            mwwVar.getClass();
            M.K(975575433);
            zq20 a = zq20.a.a(pg90.a(R.drawable.vk_icon_report_outline_20, 0, M), null, null, M, 24584, 14);
            M.j();
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new l70(1, gzsVar);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 1, ojc.c(aVar2, false, null, null, (gzs) x, 15));
            ar20 a2 = ar20.a.a(d370.N(mwwVar.a, 0, M), false, false, false, null, M, 197040, 24);
            M = M;
            b4v0.a(a2, MiniInfoCell$Mode.Base, F, a, null, null, null, M, 48, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vy7(i, 4, mwwVar, gzsVar, q630Var2);
        }
    }
}
