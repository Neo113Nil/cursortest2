package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: PrimaryBlockGoodsHeaderRightActionsImpl.kt */
/* loaded from: classes17.dex */
public final class k8d0 implements znj {
    public final /* synthetic */ m8d0 b;
    public final /* synthetic */ p8s c;

    public k8d0(m8d0 m8d0Var, p8s p8sVar) {
        this.b = m8d0Var;
        this.c = p8sVar;
    }

    @Override // xsna.znj
    public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        znj znjVar2;
        androidx.compose.runtime.a M = aVar.M(-1435851519);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1435851519, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsHeaderRightActionsImpl.OnAddBtn.<no name provided>.Content (PrimaryBlockGoodsHeaderRightActionsImpl.kt:221)");
            }
            q630 E = ahn.E(q630.a.a, "priority_block_header_action_menu_add_good");
            lzo0 d = nzo.d(3072, 6, M, d370.N(R.string.community_priority_block_header_market_goods_settings_menu_add_good_item_title, 0, M), false);
            qzu0.a.getClass();
            lg90 d2 = qzu0.d(M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            lqv B = znk0.B(d2, ylu0Var.getIcon().a, 0L, M, 196616, 28);
            m8d0 m8d0Var = this.b;
            boolean J = M.J(m8d0Var);
            p8s p8sVar = this.c;
            boolean J2 = J | M.J(p8sVar);
            Object x = M.x();
            if (J2 || x == a.C0011a.a) {
                x = new eg1(13, m8d0Var, p8sVar);
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
            s.d = new n85(this, znjVar2, i, 7);
        }
    }
}
