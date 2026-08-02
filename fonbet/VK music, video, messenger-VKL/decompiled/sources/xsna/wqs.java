package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.q630;

/* compiled from: FriendsList.kt */
/* loaded from: classes14.dex */
public final class wqs {
    public static final void a(List list, izs izsVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        izs izsVar2;
        q630 q630Var2;
        List list2;
        androidx.compose.runtime.a M = aVar.M(727060320);
        int i2 = (M.y(list) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(727060320, i2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsList (FriendsList.kt:32)");
            }
            int i3 = (i2 >> 3) & 112;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1361616542, i3, -1, "com.vk.friends.groupinvite.impl.ui.lazyRememberState (FriendsList.kt:74)");
            }
            wh50 c = androidx.compose.runtime.k.c(gzsVar, M, (i3 >> 3) & 14);
            M.K(1451534874);
            xvy a = zvy.a(0, 3, M);
            M.K(1451536511);
            mtk0 c2 = c(a, M, 0);
            boolean J = M.J(c2) | M.J(a) | M.J(c);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new tqs(c2, a, c, null);
                M.R(x);
            }
            bap.g(c2, (wzs) x, M, 0);
            M.j();
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            izsVar2 = izsVar;
            b(list, izsVar2, a, q630Var, M, i2 & 7294);
            list2 = list;
            q630Var2 = q630Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            q630Var2 = q630Var;
            list2 = list;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hn7(list2, izsVar2, gzsVar, q630Var2, i);
        }
    }

    public static final void b(List list, izs izsVar, xvy xvyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        xvy xvyVar2;
        androidx.compose.runtime.a M = aVar.M(1841623705);
        if ((i & 6) == 0) {
            i2 = (M.y(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            xvyVar2 = xvyVar;
            i2 |= M.J(xvyVar2) ? 256 : 128;
        } else {
            xvyVar2 = xvyVar;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1841623705, i2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsList (FriendsList.kt:48)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 g = q630Var.g(hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a));
            a.j g2 = androidx.compose.foundation.layout.a.g(4);
            boolean y = M.y(list) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new mp3(14, list, izsVar);
                M.R(x);
            }
            lqy.a(g, xvyVar2, null, g2, null, null, false, null, (izs) x, M, ((i2 >> 3) & 112) | 24576, 492);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kkg(list, izsVar, xvyVar, q630Var, i);
        }
    }

    public static final mtk0 c(xvy xvyVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1969620803, i, -1, "com.vk.friends.groupinvite.impl.ui.collectIsEndAsState (FriendsList.kt:110)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && aVar.J(xvyVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && aVar.o(0)) || (i & 48) == 32);
        Object x = aVar.x();
        if (z || x == a.C0011a.a) {
            x = bbk0.b(new m3g(xvyVar, 18));
            aVar.R(x);
        }
        mtk0 mtk0Var = (mtk0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return mtk0Var;
    }

    public static final void d(xvy xvyVar, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1682087970);
        int i2 = (M.J(xvyVar) ? 4 : 2) | i | 48 | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1682087970, i2, -1, "com.vk.friends.groupinvite.impl.ui.onScrollToBottom (FriendsList.kt:94)");
            }
            wh50 c = androidx.compose.runtime.k.c(gzsVar, M, (i2 >> 6) & 14);
            int i3 = i2 & 14;
            mtk0 c2 = c(xvyVar, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            boolean J = M.J(c2) | (i3 == 4) | M.J(c);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new vqs(c2, xvyVar, c, null);
                M.R(x);
            }
            bap.g(c2, (wzs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xx9(xvyVar, gzsVar, i, 4);
        }
    }
}
