package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: PrimaryBlockGoodsHeaderRightActionsImpl.kt */
/* loaded from: classes17.dex */
public final class l8d0 implements znj {
    public final /* synthetic */ m8d0 b;
    public final /* synthetic */ qd00 c;

    public l8d0(m8d0 m8d0Var, qd00 qd00Var) {
        this.b = m8d0Var;
        this.c = qd00Var;
    }

    @Override // xsna.znj
    public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        znj znjVar2;
        androidx.compose.runtime.a M = aVar.M(1570256558);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1570256558, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsHeaderRightActionsImpl.OnViewSettings.<no name provided>.Content (PrimaryBlockGoodsHeaderRightActionsImpl.kt:240)");
            }
            q630 E = ahn.E(q630.a.a, "priority_block_header_action_menu_section_settings");
            lzo0 d = nzo.d(3072, 6, M, d370.N(R.string.community_priority_block_header_market_goods_settings_menu_add_modify_view_item_title, 0, M), false);
            qzu0.a.getClass();
            lg90 X0 = qzu0.X0(M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            lqv B = znk0.B(X0, ylu0Var.getIcon().a, 0L, M, 196616, 28);
            m8d0 m8d0Var = this.b;
            boolean J = M.J(m8d0Var);
            qd00 qd00Var = this.c;
            boolean J2 = J | M.J(qd00Var);
            Object x = M.x();
            if (J2 || x == a.C0011a.a) {
                x = new com.vk.newsfeed.common.recycler.holders.attachments.a(24, m8d0Var, qd00Var);
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
            s.d = new rig(this, znjVar2, i, 5);
        }
    }
}
