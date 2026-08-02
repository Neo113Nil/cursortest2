package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: EmptyState.kt */
/* loaded from: classes14.dex */
public final class ohp {

    /* compiled from: EmptyState.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InviteFriendsTabIndex.values().length];
            try {
                iArr[InviteFriendsTabIndex.NOT_INVITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InviteFriendsTabIndex.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InviteFriendsTabIndex.INVITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(int i, androidx.compose.runtime.a aVar, String str, q630 q630Var, lg90 lg90Var) {
        int i2;
        String str2;
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(-213305668);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= M.J(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-213305668, i2, -1, "com.vk.friends.groupinvite.impl.ui.EmptyState (EmptyState.kt:89)");
            }
            q630.a aVar2 = q630.a.a;
            q630 g = q630Var.g(txj0.c(txj0.f(aVar2, 1.0f), 1.0f));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            ty6 ty6Var = dt1.a.f;
            q630 b = ra8.a.b(aVar2, ty6Var);
            int i3 = i2;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, b);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 q = txj0.q(aVar2, 56);
            long j = wlb0.h(M).getIcon().l;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
            }
            vjw.a(lg90Var, null, q, ty6Var, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), M, 3512 | (i3 & 14), 48);
            yqv0.c(str2, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).X, M, ((i3 >> 3) & 14) | 48, 0, 8120);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mhf(i, 1, lg90Var, str, q630Var);
        }
    }

    public static final void b(final InviteFriendsTabIndex inviteFriendsTabIndex, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(356137223);
        if ((i & 6) == 0) {
            i2 = (M.o(inviteFriendsTabIndex.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(356137223, i2, -1, "com.vk.friends.groupinvite.impl.ui.EmptyState (EmptyState.kt:30)");
            }
            int i4 = a.$EnumSwitchMapping$0[inviteFriendsTabIndex.ordinal()];
            if (i4 == 1) {
                M.K(1114965169);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1251586012, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-UsersOutline56> (VkSdkIcons.kt:3648)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_users_outline_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a(((i2 << 3) & 896) | 8, M, d370.N(R.string.invite_friends_not_invited_tab_empty_message, 0, M), aVar2, a2);
                M.j();
            } else if (i4 == 2) {
                M.K(1115239829);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-296596278, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-InfoOutline56> (VkSdkIcons.kt:1292)");
                }
                lg90 b = or.b(M, -1151815463, R.drawable.vk_icon_info_outline_56, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a(((i2 << 3) & 896) | 8, M, d370.N(R.string.invite_friends_selected_tab_empty_message, 0, M), aVar2, b);
                M.j();
            } else {
                if (i4 != 3) {
                    throw alb0.c(-1349508077, M);
                }
                M.K(1115509560);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1791303582, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-InboxOutline28> (VkIcons.kt:4108)");
                }
                lg90 b2 = or.b(M, 243813955, R.drawable.vk_icon_inbox_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a(((i2 << 3) & 896) | 8, M, d370.N(R.string.invite_friends_invited_tab_empty_message, 0, M), aVar2, b2);
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
            s.d = new wzs() { // from class: xsna.nhp
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    ohp.b(InviteFriendsTabIndex.this, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(String str, q630 q630Var, s890 s890Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1694984812);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(s890Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1694984812, i2, -1, "com.vk.friends.groupinvite.impl.ui.SearchEmptyState (EmptyState.kt:61)");
            }
            q630.a aVar2 = q630.a.a;
            q630 g = q630Var.g(txj0.f(s200.C(aVar2, s890Var), 1.0f));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            k9q0.w(M, c, cri.a.d);
            q630 E = s200.E(txj0.f(aVar2, 1.0f), 32, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.X;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, E, ylu0Var.getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, i2 & 14, 0, 8120);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mhp(str, q630Var, s890Var, i);
        }
    }
}
