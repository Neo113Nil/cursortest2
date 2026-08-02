package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.uyh0;

/* compiled from: InviteFriendsSearch.kt */
/* loaded from: classes14.dex */
public final class wrx {
    public static final void a(uyh0 uyh0Var, q630 q630Var, s890 s890Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        izs izsVar2;
        s890 s890Var2;
        q630 q630Var2;
        uyh0.a aVar2 = uyh0Var.d;
        androidx.compose.runtime.a M = aVar.M(-1464211569);
        if ((i & 6) == 0) {
            i2 = (M.J(uyh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= M.J(s890Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1464211569, i3, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsSearch (InviteFriendsSearch.kt:26)");
            }
            boolean z = uyh0Var.b;
            q630.a aVar3 = q630.a.a;
            if (z) {
                M.K(-638764005);
                b(aVar3, s890Var, M, (i3 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new urx(uyh0Var, s890Var, izsVar, i);
                    return;
                }
                return;
            }
            M.K(-639905549);
            M.j();
            if (aVar2 instanceof uyh0.a.b) {
                M.K(-638570503);
                ohp.c(d370.N(R.string.invite_friends_search_empty_message, 0, M), aVar3, s890Var, M, i3 & 1008);
                M.j();
                izsVar2 = izsVar;
                s890Var2 = s890Var;
            } else if (aVar2 instanceof uyh0.a.c) {
                M.K(-638310227);
                c(uyh0Var.c, (uyh0.a.c) aVar2, aVar3, s890Var, izsVar, M, (i3 << 3) & 65408);
                s890Var2 = s890Var;
                izsVar2 = izsVar;
                M.j();
            } else {
                izsVar2 = izsVar;
                s890Var2 = s890Var;
                M.K(-638040527);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            izsVar2 = izsVar;
            s890Var2 = s890Var;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new vrx(uyh0Var, q630Var2, s890Var2, izsVar2, i);
        }
    }

    public static final void b(q630 q630Var, s890 s890Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1227660290);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(s890Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1227660290, i2, -1, "com.vk.friends.groupinvite.impl.ui.LoadingState (InviteFriendsSearch.kt:91)");
            }
            q630.a aVar2 = q630.a.a;
            q630 c = txj0.c(txj0.f(s200.C(aVar2, s890Var), 1.0f), 1.0f);
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
            s.d = new xw5(q630Var, s890Var, i);
        }
    }

    public static final void c(String str, uyh0.a.c cVar, q630 q630Var, s890 s890Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2045043360);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(s890Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2045043360, i2, -1, "com.vk.friends.groupinvite.impl.ui.SuccessSearchResult (InviteFriendsSearch.kt:65)");
            }
            q630 g = q630Var.g(s200.H(s200.C(q630.a.a, s890Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            int i3 = i2;
            List<jis> list = cVar.a;
            int i4 = 57344 & i3;
            boolean z = i4 == 16384;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new ndh(izsVar, 1);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = ((i3 & 14) == 4) | (i4 == 16384) | ((i3 & 112) == 32);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new crf(izsVar, str, cVar, 1);
                M.R(x2);
            }
            wqs.a(list, izsVar2, (gzs) x2, g, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l48(str, cVar, q630Var, s890Var, izsVar, i);
        }
    }
}
