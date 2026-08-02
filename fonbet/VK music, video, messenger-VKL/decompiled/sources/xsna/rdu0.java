package xsna;

import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.core.compose.component.defaults.d;

/* compiled from: VkBadge.kt */
/* loaded from: classes17.dex */
public final class rdu0 {
    public static final void a(final q630 q630Var, final BadgeAppearance badgeAppearance, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        long j;
        androidx.compose.runtime.a M = aVar.M(1822366380);
        if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? M.J(badgeAppearance) : M.y(badgeAppearance) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                badgeAppearance = BadgeAppearance.Design.AccentRed;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1822366380, i3, -1, "com.vk.core.compose.component.VkBadge (VkBadge.kt:32)");
            }
            q630 d = rte0.d(txj0.q(q630Var, com.vk.core.compose.component.defaults.d.a), com.vk.core.compose.component.defaults.d.b);
            int i5 = ((i3 >> 3) & 14) | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(83234305, i5, -1, "com.vk.core.compose.component.defaults.VkBadgeDefaults.color (VkBadgeDefaults.kt:20)");
            }
            M.K(1437679517);
            if (badgeAppearance == BadgeAppearance.Design.Accent) {
                M.K(-1616188393);
                j = wlb0.h(M).getBackground().d;
                M.j();
            } else if (badgeAppearance == BadgeAppearance.Design.Neutral) {
                j = vcl0.a(M, -1616185426, M).l;
                M.j();
            } else if (badgeAppearance == BadgeAppearance.Design.AccentGreen) {
                M.K(-1616182548);
                j = wlb0.h(M).q().e;
                M.j();
            } else if (badgeAppearance == BadgeAppearance.Design.AccentRed) {
                M.K(-1616179798);
                j = wlb0.h(M).q().m;
                M.j();
            } else if (badgeAppearance == BadgeAppearance.Design.Contrast) {
                M.K(-1616177006);
                j = wlb0.h(M).getBackground().g;
                M.j();
            } else if (badgeAppearance instanceof BadgeAppearance.LegoDesign) {
                M.K(-1616174807);
                BadgeAppearance.LegoDesign legoDesign = (BadgeAppearance.LegoDesign) badgeAppearance;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2136442164, 48, -1, "com.vk.core.compose.component.defaults.VkBadgeDefaults.getMilkshakeColorThroughLego (VkBadgeDefaults.kt:55)");
                }
                int i6 = d.a.$EnumSwitchMapping$1[legoDesign.ordinal()];
                if (i6 == 1) {
                    M.K(126559005);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.q().m;
                    M.j();
                } else if (i6 == 2) {
                    M.K(126561610);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.getBackground().d;
                    M.j();
                } else {
                    if (i6 != 3) {
                        throw alb0.c(126556592, M);
                    }
                    M.K(126564522);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var3.getBackground().d;
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                if (!(badgeAppearance instanceof BadgeAppearance.a)) {
                    throw alb0.c(-1616190803, M);
                }
                j = vcl0.a(M, -1616171442, M).l;
                M.j();
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(d, j, androidx.compose.ui.graphics.e.a), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qdu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    rdu0.a(q630.this, badgeAppearance, (androidx.compose.runtime.a) obj, I, i2);
                    return s3q0.a;
                }
            };
        }
    }
}
