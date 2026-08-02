package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.kzg;
import xsna.q630;

/* compiled from: CommunityCreationCountOnboarding.kt */
/* loaded from: classes17.dex */
public final class lzg {
    public static final void a(int i, androidx.compose.runtime.a aVar, List list, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        CommunityCreationOnboardingBlock.Item.Count count;
        long j;
        char c;
        long j2;
        boolean z;
        int i3;
        int i4;
        lg90 a;
        androidx.compose.runtime.a M = aVar.M(-496923970);
        int i5 = 2;
        int i6 = i | (M.J(list) ? 4 : 2) | (M.J(q630Var) ? 32 : 16);
        int i7 = 1;
        int i8 = 0;
        if (M.t(i6 & 1, (i6 & 19) != 18)) {
            int i9 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-496923970, i6, -1, "com.vk.community.design.compose.onboarding.count.CommunityCreationCountOnboarding (CommunityCreationCountOnboarding.kt:29)");
            }
            uog0 b = vog0.b(kqu0.w);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a3 = yu50.a(M, c2, cri.a.d, 1113947375, list);
            int i10 = 0;
            while (a3.hasNext()) {
                Object next = a3.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    e43.t();
                    throw null;
                }
                CommunityCreationOnboardingBlock.Item.Count count2 = (CommunityCreationOnboardingBlock.Item.Count) next;
                CommunityCreationOnboardingBlock.Item.Count.CountState countState = count2.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1865098347, 48, i9, "com.vk.community.design.compose.onboarding.count.CommunityCreationCountOnboardingDefaults.backgroundColor (CommunityCreationCountOnboardingDefaults.kt:16)");
                }
                int[] iArr = kzg.a.$EnumSwitchMapping$0;
                int i12 = iArr[countState.ordinal()];
                if (i12 == i7) {
                    count = count2;
                    M.K(-1358143378);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i8, i9, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getBackground().l;
                    M.j();
                } else {
                    if (i12 != i5) {
                        throw alb0.c(-1358145955, M);
                    }
                    M.K(-1358140540);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i8, i9, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    count = count2;
                    j = ylu0Var2.r().a;
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630.a aVar4 = q630.a.a;
                q630 m = hr80.m(aVar4, j, b);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-282242345, 48, i9, "com.vk.community.design.compose.onboarding.count.CommunityCreationCountOnboardingDefaults.borderColor (CommunityCreationCountOnboardingDefaults.kt:24)");
                }
                int i13 = iArr[countState.ordinal()];
                if (i13 != i7) {
                    c = 2;
                    if (i13 != 2) {
                        throw alb0.c(-651950944, M);
                    }
                    M.K(-651945529);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, i9, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = ylu0Var3.r().b;
                    M.j();
                } else {
                    c = 2;
                    M.K(-651948368);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, i9, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = ylu0Var4.getBackground().l;
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                y18 a4 = aqw.a(0.5f, j2);
                q630 E = ahn.E(txj0.w(r18.b(a4.a, a4.b, m, b), 38, 42), "community_creation_onboarding_count_progress_" + cqm0.m(countState.name()) + '_' + i10);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c3 = qri.c(M, E);
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
                k9q0.w(M, a5, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c3, cri.a.d);
                float f = kqu0.t;
                float f2 = kqu0.w;
                q630 H = s200.H(aVar4, f2, f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                long a6 = kzg.a(countState, M);
                if (androidx.compose.runtime.b.d()) {
                    z = false;
                    androidx.compose.runtime.b.f(-473561179, 0, i9, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                } else {
                    z = false;
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.a aVar6 = M;
                int i14 = i9;
                uog0 uog0Var = b;
                yqv0.c(count.b, H, a6, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.E, aVar6, 0, 0, 8120);
                M = aVar6;
                float f3 = 13;
                q630 G = s200.G(aVar4, f3, kqu0.r, f3, kqu0.v);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2019842451, 48, i14, "com.vk.community.design.compose.onboarding.count.CommunityCreationCountOnboardingDefaults.icon (CommunityCreationCountOnboardingDefaults.kt:40)");
                }
                int i15 = iArr[countState.ordinal()];
                if (i15 != 1) {
                    i3 = 2;
                    if (i15 != 2) {
                        throw alb0.c(256625116, M);
                    }
                    M.K(256629043);
                    if (androidx.compose.runtime.b.d()) {
                        i4 = 0;
                        androidx.compose.runtime.b.f(1888582236, 0, i14, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done16> (VkSdkIcons.kt:694)");
                    } else {
                        i4 = 0;
                    }
                    a = or.b(M, -1318018545, R.drawable.vk_icon_done_16, M, i4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    i3 = 2;
                    i4 = 0;
                    M.K(256627154);
                    qzu0.a.getClass();
                    a = qzu0.a(M);
                    M.j();
                }
                lg90 lg90Var = a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(lg90Var, null, G, kzg.a(countState, M), M, 56, 0);
                M.G();
                i9 = i14;
                i7 = 1;
                i5 = i3;
                i8 = i4;
                i10 = i11;
                b = uog0Var;
            }
            i2 = i7;
            aVar2 = M;
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i2 = 1;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new q85(list, q630Var, i, i2);
        }
    }
}
