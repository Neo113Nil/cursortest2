package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.profile.community.core.communityleave.LeaveAction;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityLeaveContent.kt */
/* loaded from: classes5.dex */
public final class a7h {
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(izs<? super t6h, s3q0> izsVar, LeaveAction leaveAction, boolean z, androidx.compose.runtime.a aVar, int i) {
        int i2;
        a.C0011a.C0012a c0012a;
        boolean z2;
        boolean z3;
        Object x;
        androidx.compose.runtime.a M = aVar.M(751938243);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(leaveAction.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(751938243, i2, -1, "com.vk.profile.community.core.communityleave.CommunityLeaveContent (CommunityLeaveContent.kt:31)");
            }
            float f = 2 * kqu0.c;
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f + 44, 7), 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.community_leave_open_group_dialog_admin_rights, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            String N = d370.N(R.string.accessibility_hide, 0, M);
            int i3 = i2 & 14;
            boolean z4 = i3 == 4;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z4 || x2 == c0012a2) {
                x2 = new b97(izsVar, 1);
                M.R(x2);
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.d.a.a(N, (gzs) x2, new l5g(wlb0.h(M).getIcon().a), null, M, 24576, 8), null, null, true, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 100663296, 0, 7902);
            String N2 = d370.N(R.string.community_leave_open_group_dialog_unsubscribe_action_text, 0, M);
            frv0 frv0Var = wlb0.l(M).i0;
            float f3 = kqu0.u + kqu0.r;
            float f4 = kqu0.b;
            yqv0.c(N2, s200.G(aVar2, f4, f3, f4, kqu0.q), wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8184);
            M = M;
            boolean z5 = leaveAction == LeaveAction.STAY_ADMIN;
            rci0 d = qci0.d(60, d370.N(R.string.community_leave_open_group_dialog_stay_admin_title, 0, M), d370.N(R.string.community_leave_open_group_dialog_stay_admin_subtitle, 0, M));
            boolean z6 = i3 == 4;
            Object x3 = M.x();
            if (z6) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
                if (x3 != c0012a) {
                    z2 = true;
                    a.C0011a.C0012a c0012a3 = c0012a;
                    boolean z7 = z2;
                    afv0.c(z5, d, (gzs) x3, null, false, M, 0, 56);
                    boolean z8 = leaveAction != LeaveAction.REJECT_ADMIN ? z7 : false;
                    String N3 = d370.N(R.string.community_leave_open_group_dialog_reject_admin_title, 0, M);
                    M.K(1535892436);
                    StringBuilder sb = new StringBuilder();
                    if (z) {
                        M.K(171992129);
                        sb.append(d370.N(R.string.community_leave_open_group_dialog_reject_admin_subtitle, 0, M));
                        M.j();
                    } else {
                        M.K(171814127);
                        sb.append(d370.N(R.string.community_leave_open_group_dialog_reject_admin_with_monetization_subtitle, 0, M));
                        M.j();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    String sb2 = sb.toString();
                    M.j();
                    rci0 d2 = qci0.d(60, N3, sb2);
                    z3 = i3 != 4 ? z7 : false;
                    x = M.x();
                    if (!z3 || x == c0012a3) {
                        x = new y6h(izsVar, 0);
                        M.R(x);
                    }
                    afv0.c(z8, d2, (gzs) x, null, false, M, 0, 56);
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            z2 = true;
            x3 = new wq0(izsVar, 1);
            M.R(x3);
            a.C0011a.C0012a c0012a32 = c0012a;
            boolean z72 = z2;
            afv0.c(z5, d, (gzs) x3, null, false, M, 0, 56);
            if (leaveAction != LeaveAction.REJECT_ADMIN) {
            }
            String N32 = d370.N(R.string.community_leave_open_group_dialog_reject_admin_title, 0, M);
            M.K(1535892436);
            StringBuilder sb3 = new StringBuilder();
            if (z) {
            }
            s3q0 s3q0Var2 = s3q0.a;
            String sb22 = sb3.toString();
            M.j();
            rci0 d22 = qci0.d(60, N32, sb22);
            if (i3 != 4) {
            }
            x = M.x();
            if (!z3) {
            }
            x = new y6h(izsVar, 0);
            M.R(x);
            afv0.c(z8, d22, (gzs) x, null, false, M, 0, 56);
            M.G();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z6h(i, 0, izsVar, leaveAction, z);
        }
    }
}
