package xsna;

import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import java.util.List;
import xsna.q630;
import xsna.us2;

/* compiled from: InviteFriendsTabs.kt */
/* loaded from: classes14.dex */
public final class hsx {
    public static final void a(final jj jjVar, final String str, final String str2, final boolean z, final q630 q630Var, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        jj jjVar2;
        int i2;
        gzs gzsVar2;
        long j;
        androidx.compose.runtime.a M = aVar.M(2055571448);
        if ((i & 6) == 0) {
            jjVar2 = jjVar;
            i2 = (M.J(jjVar2) ? 4 : 2) | i;
        } else {
            jjVar2 = jjVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 131072 : 65536;
        } else {
            gzsVar2 = gzsVar;
        }
        int i3 = 1;
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2055571448, i2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsTab (InviteFriendsTabs.kt:104)");
            }
            if (z) {
                M.K(-114478402);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().f;
                M.j();
            } else {
                M.K(-114428647);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getText().p;
                M.j();
            }
            long j2 = j;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j3 = ylu0Var3.getText().p;
            us2.b bVar = new us2.b();
            int m = bVar.m(new hik0(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                bVar.g(str);
                s3q0 s3q0Var = s3q0.a;
                bVar.k(m);
                bVar.g(" ");
                m = bVar.m(new hik0(j3, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    bVar.g(str2);
                    bVar.k(m);
                    jjVar2.b(z, gzsVar2, kai.c(1189603270, new kjj(bVar.n(), i3), M), q630Var, M, ((i2 >> 9) & 14) | 384 | ((i2 >> 12) & 112) | ((i2 >> 3) & 7168) | ((i2 << 12) & 57344), 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } finally {
                }
            } finally {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.csx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hsx.a(jj.this, str, str2, z, q630Var, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final List list, final InviteFriendsTabIndex inviteFriendsTabIndex, final q630 q630Var, final wzs wzsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(402638803);
        int i2 = (M.y(list) ? 4 : 2) | i | (M.o(inviteFriendsTabIndex.ordinal()) ? 32 : 16) | (M.y(wzsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(402638803, i2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsTabs (InviteFriendsTabs.kt:33)");
            }
            c(inviteFriendsTabIndex.h(), 3072, M, kai.c(953808874, new dsx(list, inviteFriendsTabIndex, wzsVar, 0), M), q630Var.g(ahn.E(q630.a.a, "TABS")), list.size() > 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(list, inviteFriendsTabIndex, q630Var, wzsVar, i) { // from class: xsna.esx
                public final /* synthetic */ List b;
                public final /* synthetic */ InviteFriendsTabIndex c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ wzs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    hsx.b(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final int i, final int i2, androidx.compose.runtime.a aVar, final jai jaiVar, final q630 q630Var, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(1832632075);
        int i3 = i2 | (M.o(i) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1832632075, i3, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsTabsRow (InviteFriendsTabs.kt:64)");
            }
            if (z) {
                M.K(-1681902650);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                u6u0.c(i, jaiVar, q630Var, ylu0Var.getBackground().g, true, null, null, null, false, M, (i3 & 14) | 24624 | (i3 & 896), 480);
                M = M;
                M.j();
            } else {
                M.K(-1681629416);
                u6u0.e(i, jaiVar, q630Var, 0L, false, null, M, (i3 & 14) | 48 | (i3 & 896), 56);
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
            s.d = new wzs(i, i2, jaiVar, q630Var, z) { // from class: xsna.gsx
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ jai e;

                {
                    this.c = z;
                    this.d = q630Var;
                    this.e = jaiVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3073);
                    hsx.c(this.b, I, (androidx.compose.runtime.a) obj, this.e, this.d, this.c);
                    return s3q0.a;
                }
            };
        }
    }
}
