package xsna;

import androidx.compose.runtime.a;
import com.vk.superapp.api.dto.ad.AdInfo;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: SuperAppWidgetShowcaseSectionScrollHolder.kt */
/* loaded from: classes6.dex */
public final class cen0 implements znj {
    public final /* synthetic */ AdInfo b;
    public final /* synthetic */ zdn0 c;

    public cen0(AdInfo adInfo, zdn0 zdn0Var) {
        this.b = adInfo;
        this.c = zdn0Var;
    }

    @Override // xsna.znj
    public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        znj znjVar2;
        androidx.compose.runtime.a M = aVar.M(-1433800852);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1433800852, i2, -1, "com.vk.superapp.holders.SuperAppWidgetShowcaseSectionScrollHolder.showAdInfoContextMenu.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (SuperAppWidgetShowcaseSectionScrollHolder.kt:200)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_info_circle_outline_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            lqv B = znk0.B(a, ylu0Var.getIcon().a, 0L, M, 196616, 28);
            AdInfo adInfo = this.b;
            lzo0 d = nzo.d(3072, 6, M, d370.O(R.string.erid_template, new Object[]{adInfo.b}, M), false);
            q630 E = ahn.E(q630.a.a, "test_tag_context_menu_item_erid");
            zdn0 zdn0Var = this.c;
            boolean y = M.y(zdn0Var) | M.y(adInfo);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new ni0(22, zdn0Var, adInfo);
                M.R(x);
            }
            znjVar2 = znjVar;
            aou0.d(znjVar2, (gzs) x, E, null, false, B, d, null, M, (i2 & 14) | 384, 76);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            znjVar2 = znjVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new do7(this, znjVar2, i, 10);
        }
    }
}
