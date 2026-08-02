package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.t7h;

/* compiled from: CommunityLeaveBottomView.kt */
/* loaded from: classes5.dex */
public final class x6h extends i6v0<t7h, t6h> {
    public final xqi<t7h.a> f;

    public x6h(Context context, u6h u6hVar, xqi xqiVar) {
        super(context, u6hVar);
        this.f = xqiVar;
        vq.b(-1, -2, this.d);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((t7h) ao50Var, izsVar, aVar, 512);
    }

    public final void h(t7h t7hVar, izs<? super t6h, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-511580504);
        int i2 = i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-511580504, i2, -1, "com.vk.profile.community.core.communityleave.CommunityLeaveBottomView.ThemedContent (CommunityLeaveBottomView.kt:42)");
            }
            t7h.a aVar2 = (t7h.a) ((zak0) this.f.e).getValue();
            if (aVar2 instanceof t7h.a.C3725a) {
                M.K(-1950534636);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getBackground().g;
                e.a aVar3 = androidx.compose.ui.graphics.e.a;
                q630.a aVar4 = q630.a.a;
                q630 E = s200.E(hr80.m(aVar4, j, aVar3), kqu0.b, kqu0.c);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, E);
                cri.h7.getClass();
                LayoutNode.a aVar5 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar5);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                String N = d370.N(R.string.community_leave_open_group_dialog_submit, 0, M);
                ButtonSize buttonSize = ButtonSize.Large;
                boolean z = true;
                ButtonStyle buttonStyle = ButtonStyle.Primary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                q630 f = txj0.f(aVar4, 1.0f);
                if ((i2 & 112) != 32) {
                    z = false;
                }
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new tq0(izsVar, 2);
                    M.R(x);
                }
                bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, f, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
                M.G();
                M.j();
            } else {
                if (!epx.f(aVar2, t7h.a.b.a)) {
                    throw alb0.c(-2002585319, M);
                }
                M.K(-1949644936);
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
            s.d = new w6h(i, 0, this, t7hVar, izsVar);
        }
    }
}
