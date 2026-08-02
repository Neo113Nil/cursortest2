package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityCreationRegularityOnboarding.kt */
/* loaded from: classes17.dex */
public final class n0h {
    /* JADX WARN: Removed duplicated region for block: B:151:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, androidx.compose.runtime.a aVar, List list, q630 q630Var) {
        long j;
        long j2;
        l5g l5gVar;
        int i2;
        lg90 a;
        int i3;
        int i4;
        int i5;
        long j3;
        androidx.compose.runtime.a M = aVar.M(-1673892409);
        int i6 = 4;
        int i7 = 2;
        int i8 = (M.J(list) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        int i9 = 0;
        if (M.t(i8 & 1, (i8 & 19) != 18)) {
            int i10 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1673892409, i8, -1, "com.vk.community.design.compose.onboarding.regularity.CommunityCreationRegularityOnboarding (CommunityCreationRegularityOnboarding.kt:31)");
            }
            q630 r = p490.r(txj0.f(q630Var, 1.0f), p490.x(M), 14);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.t);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, r);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a3 = yu50.a(M, c, cri.a.d, 746382682, list);
            int i11 = 0;
            while (a3.hasNext()) {
                Object next = a3.next();
                int i12 = i11 + 1;
                if (i11 < 0) {
                    e43.t();
                    throw null;
                }
                float f = 40;
                long b = byc0.b(f, f);
                q630.a aVar3 = q630.a.a;
                q630 r2 = txj0.r(b, aVar3);
                CommunityCreationOnboardingBlock.Item.Regularity.RegularityState regularityState = ((CommunityCreationOnboardingBlock.Item.Regularity) next).a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(752026439, 48, i10, "com.vk.community.design.compose.onboarding.regularity.CommunityCreationRegularityOnboardingDefaults.backgroundColor (CommunityCreationRegularityOnboardingDefaults.kt:15)");
                }
                int[] iArr = m0h.$EnumSwitchMapping$0;
                int i13 = iArr[regularityState.ordinal()];
                if (i13 == 1) {
                    M.K(1142908352);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i9, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getBackground().l;
                    M.j();
                } else if (i13 == i7) {
                    M.K(1142911921);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i9, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.getBackground().a;
                    M.j();
                } else if (i13 == 3) {
                    M.K(1142914872);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i9, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var3.getBackground().g;
                    M.j();
                } else {
                    if (i13 != i6) {
                        throw alb0.c(1142905775, M);
                    }
                    M.K(1142918072);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i9, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var4.getBackground().g;
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                uog0 uog0Var = vog0.a;
                q630 m = hr80.m(r2, j, uog0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1220101513, 48, -1, "com.vk.community.design.compose.onboarding.regularity.CommunityCreationRegularityOnboardingDefaults.borderColor (CommunityCreationRegularityOnboardingDefaults.kt:25)");
                }
                int i14 = iArr[regularityState.ordinal()];
                if (i14 == 1) {
                    M.K(-8511879);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = ylu0Var5.getImage().a;
                } else if (i14 == 2) {
                    M.K(-263792236);
                    M.j();
                    l5gVar = null;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    y18 a4 = aqw.a(1.0f, l5gVar == null ? l5gVar.a : l5g.k);
                    q630 E = ahn.E(r18.b(a4.a, a4.b, m, uog0Var), "community_creation_onboarding_item_regularity_progress_" + cqm0.m(regularityState.name()) + '_' + i11);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, E);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (M.N() != null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar4);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d, cri.a.f);
                    k9q0.w(M, D2, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c2, cri.a.d);
                    q630 b2 = ra8.a.b(s200.D(aVar3, kqu0.v), dt1.a.f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1813917103, 48, -1, "com.vk.community.design.compose.onboarding.regularity.CommunityCreationRegularityOnboardingDefaults.icon (CommunityCreationRegularityOnboardingDefaults.kt:45)");
                    }
                    int i15 = iArr[regularityState.ordinal()];
                    if (i15 == 1 || i15 == 2) {
                        M.K(-582379016);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            i2 = 0;
                            androidx.compose.runtime.b.f(-642579018, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-FireAlt16> (VkIcons.kt:2658)");
                        } else {
                            i2 = 0;
                        }
                        a = pg90.a(R.drawable.vk_icon_fire_alt_16, i2, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                    } else {
                        if (i15 != 3 && i15 != 4) {
                            throw alb0.c(-582383005, M);
                        }
                        M.K(-582374924);
                        qzu0.a.getClass();
                        a = qzu0.a(M);
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2001296412, 48, -1, "com.vk.community.design.compose.onboarding.regularity.CommunityCreationRegularityOnboardingDefaults.iconColor (CommunityCreationRegularityOnboardingDefaults.kt:35)");
                    }
                    int i16 = iArr[regularityState.ordinal()];
                    if (i16 != 1) {
                        i3 = 2;
                        if (i16 == 2) {
                            M.K(-899487895);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var6 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j3 = ylu0Var6.getIcon().l;
                            M.j();
                        } else if (i16 == 3) {
                            M.K(-899485049);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var7 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j3 = ylu0Var7.getIcon().j;
                            M.j();
                        } else {
                            if (i16 != 4) {
                                throw alb0.c(-899493291, M);
                            }
                            M.K(-899482234);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var8 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j3 = ylu0Var8.getIcon().f;
                            M.j();
                        }
                        i4 = 0;
                        i5 = -1;
                    } else {
                        i3 = 2;
                        M.K(-899490872);
                        if (androidx.compose.runtime.b.d()) {
                            i4 = 0;
                            i5 = -1;
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        } else {
                            i4 = 0;
                            i5 = -1;
                        }
                        ylu0 ylu0Var9 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j3 = ylu0Var9.getIcon().c;
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int i17 = i5;
                    pzu0.b(a, null, b2, j3, M, 56, 0);
                    M.G();
                    i9 = i4;
                    i11 = i12;
                    i10 = i17;
                    i7 = i3;
                    i6 = 4;
                } else if (i14 == 3) {
                    M.K(-8506823);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var10 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = ylu0Var10.r().b;
                } else {
                    if (i14 != 4) {
                        throw alb0.c(-8514345, M);
                    }
                    M.K(-8503815);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var11 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = ylu0Var11.r().b;
                }
                l5gVar = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j2, M);
                if (androidx.compose.runtime.b.d()) {
                }
                y18 a42 = aqw.a(1.0f, l5gVar == null ? l5gVar.a : l5g.k);
                q630 E2 = ahn.E(r18.b(a42.a, a42.b, m, uog0Var), "community_creation_onboarding_item_regularity_progress_" + cqm0.m(regularityState.name()) + '_' + i11);
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.b, false);
                int hashCode22 = Long.hashCode(n34.n(M));
                sy90 D22 = M.D();
                q630 c22 = qri.c(M, E2);
                cri.h7.getClass();
                LayoutNode.a aVar42 = cri.a.b;
                if (M.N() != null) {
                }
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jn7(list, q630Var, i, 4);
        }
    }
}
