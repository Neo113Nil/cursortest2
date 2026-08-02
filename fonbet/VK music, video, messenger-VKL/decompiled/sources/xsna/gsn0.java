package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.asx;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: TabContent.kt */
/* loaded from: classes14.dex */
public final class gsn0 {
    public static final void a(InviteFriendsTabIndex inviteFriendsTabIndex, asx.a aVar, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(-1028643269);
        if ((i & 6) == 0) {
            i2 = (M.o(inviteFriendsTabIndex.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1028643269, i2, -1, "com.vk.friends.groupinvite.impl.ui.ContentState (TabContent.kt:82)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = pn00.k(new Pair(InviteFriendsTabIndex.NOT_INVITED, new xvy(0, 3, 0)), new Pair(InviteFriendsTabIndex.SELECTED, new xvy(0, 3, 0)), new Pair(InviteFriendsTabIndex.INVITED, new xvy(0, 3, 0)));
                M.R(x);
            }
            xvy xvyVar = (xvy) ((Map) x).get(inviteFriendsTabIndex);
            if (xvyVar == null) {
                xvyVar = new xvy(0, 3, 0);
            }
            xvy xvyVar2 = xvyVar;
            int i3 = i2 & 7168;
            boolean z = ((i2 & 112) == 32) | (i3 == 2048) | ((i2 & 14) == 4);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new l49(izsVar, inviteFriendsTabIndex, aVar, 9);
                M.R(x2);
            }
            wqs.d(xvyVar2, (gzs) x2, M, 0);
            q630 g = q630Var.g(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            List<jis> list = aVar.a;
            boolean z2 = i3 == 2048;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new x8j0(izsVar, 2);
                M.R(x3);
            }
            wqs.b(list, (izs) x3, xvyVar2, g, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j030(i, 1, inviteFriendsTabIndex, aVar, q630Var, izsVar);
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(651943867);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(651943867, i2, -1, "com.vk.friends.groupinvite.impl.ui.LoadingState (TabContent.kt:58)");
            }
            q630.a aVar2 = q630.a.a;
            q630 c = txj0.c(txj0.f(aVar2, 1.0f), 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630 g = q630Var.g(txj0.q(ra8.a.b(aVar2, dt1.a.f), 44));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            x2e0.b(g, ylu0Var.getIcon().f, 3, 0L, 0, M, 384, 24);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v26(q630Var, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(InviteFriendsTabIndex inviteFriendsTabIndex, yrx yrxVar, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        InviteFriendsTabIndex inviteFriendsTabIndex2;
        izs izsVar2;
        q630 q630Var2;
        asx asxVar = yrxVar.c;
        androidx.compose.runtime.a M = aVar.M(-134763767);
        if ((i & 6) == 0) {
            i2 = (M.o(inviteFriendsTabIndex.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(yrxVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-134763767, i3, -1, "com.vk.friends.groupinvite.impl.ui.TabContent (TabContent.kt:27)");
            }
            boolean z = asxVar instanceof asx.b;
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(-658953459);
                M.j();
            } else if (asxVar instanceof asx.c) {
                M.K(1047330558);
                ohp.b(inviteFriendsTabIndex, M, (i3 & 14) | ((i3 >> 3) & 112));
                M.j();
            } else if (asxVar instanceof asx.d) {
                M.K(1047497121);
                b(aVar2, M, (i3 >> 6) & 14);
                M.j();
            } else {
                if (!(asxVar instanceof asx.a)) {
                    throw alb0.c(-658954828, M);
                }
                M.K(1047633521);
                inviteFriendsTabIndex2 = inviteFriendsTabIndex;
                a(inviteFriendsTabIndex2, (asx.a) asxVar, aVar2, izsVar, M, i3 & 8078);
                izsVar2 = izsVar;
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = aVar2;
            }
            inviteFriendsTabIndex2 = inviteFriendsTabIndex;
            izsVar2 = izsVar;
            if (androidx.compose.runtime.b.d()) {
            }
            q630Var2 = aVar2;
        } else {
            inviteFriendsTabIndex2 = inviteFriendsTabIndex;
            izsVar2 = izsVar;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hrx(inviteFriendsTabIndex2, yrxVar, q630Var2, izsVar2, i);
        }
    }
}
