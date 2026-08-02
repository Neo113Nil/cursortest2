package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.bap;
import xsna.c6j;
import xsna.dp10;
import xsna.e4p0;
import xsna.e7v0;
import xsna.ep10;
import xsna.gzs;
import xsna.izs;
import xsna.jgp;
import xsna.jys;
import xsna.op10;
import xsna.owu0;
import xsna.pwu0;
import xsna.q630;
import xsna.qwu0;
import xsna.rc90;
import xsna.rwu0;
import xsna.s3q0;
import xsna.s5j;
import xsna.swu0;
import xsna.tgi0;
import xsna.tra0;
import xsna.twu0;
import xsna.wh50;
import xsna.wzs;
import xsna.yjl;
import xsna.zo10;

/* compiled from: VkFullscreenOnboarding.kt */
/* loaded from: classes17.dex */
public final class twu0 {
    public static final void a(e7v0 e7v0Var, gys gysVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-923604767);
        int i2 = (M.J(e7v0Var) ? 4 : 2) | i | (M.J(gysVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-923604767, i2, -1, "com.vk.core.tool.compose.onboarding.BottomContent (VkFullscreenOnboarding.kt:114)");
            }
            q630Var2 = q630Var;
            e7v0Var.a(s200.H(q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24, 5), gysVar, M, (i2 & 112) | ((i2 << 6) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xwl(e7v0Var, gysVar, q630Var2, i, 5);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        gzs gzsVar2;
        androidx.compose.runtime.a M = aVar.M(737911155);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(737911155, i2, -1, "com.vk.core.tool.compose.onboarding.CloseIcon (VkFullscreenOnboarding.kt:78)");
            }
            if (gzsVar == null) {
                M.K(1468728685);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new zo80(14);
                    M.R(x);
                }
                gzsVar2 = (gzs) x;
                M.j();
            } else {
                M.K(463019938);
                M.j();
                gzsVar2 = gzsVar;
            }
            boolean z = gzsVar != null;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
            }
            lg90 b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 28;
            String N = d370.N(R.string.vk_accessibility_fullscreen_onboarding_close, 0, M);
            q630 D = s200.D(q630Var, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            nzu0.c(gzsVar2, b, N, D, f, ylu0Var.getIcon().f, false, null, z, null, null, aVar2, 24640, 1728);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new pmg(gzsVar, q630Var, i, 6);
        }
    }

    public static final void c(final jys jysVar, mc90 mc90Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1741488457);
        int i2 = i | (M.J(jysVar) ? 4 : 2) | (M.J(mc90Var) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1741488457, i2, -1, "com.vk.core.tool.compose.onboarding.Pager (VkFullscreenOnboarding.kt:95)");
            }
            int i3 = i2 >> 3;
            aVar2 = M;
            nb90.a(mc90Var, q630Var, null, null, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, null, kai.c(-945741960, new zzs() { // from class: xsna.mwu0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-945741960, intValue2, -1, "com.vk.core.tool.compose.onboarding.Pager.<anonymous> (VkFullscreenOnboarding.kt:97)");
                    }
                    Object x = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new oys(intValue);
                        aVar3.R(x);
                    }
                    oys oysVar = (oys) x;
                    jys jysVar2 = jys.this;
                    mc90 b = jysVar2.b();
                    Integer valueOf = b != null ? Integer.valueOf(b.k()) : null;
                    boolean J = ((((intValue2 & 112) ^ 48) > 32 && aVar3.o(intValue)) || (intValue2 & 48) == 32) | aVar3.J(jysVar2);
                    Object x2 = aVar3.x();
                    if (J || x2 == c0012a) {
                        x2 = new nwu0(jysVar2, oysVar, intValue, null);
                        aVar3.R(x2);
                    }
                    bap.g(valueOf, (wzs) x2, aVar3, 0);
                    jysVar2.b.get(intValue).a.invoke(txj0.d(q630.a.a, 1.0f), oysVar, aVar3, 54);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, (i3 & 14) | 24576 | (i3 & 112), 24576, 16364);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new w70(jysVar, mc90Var, q630Var, i, 9);
        }
    }

    public static final void d(izs izsVar, final af90 af90Var, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        gzs gzsVar2;
        int i4;
        gzs gzsVar3;
        androidx.compose.runtime.a M = aVar.M(769761797);
        if ((i & 6) == 0) {
            i3 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (M.J(af90Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i5 |= M.J(q630Var) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            gzsVar2 = gzsVar;
        } else {
            gzsVar2 = gzsVar;
            i4 = i5 | (M.y(gzsVar2) ? 2048 : 1024);
        }
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            final gzs gzsVar4 = i6 != 0 ? null : gzsVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(769761797, i4, -1, "com.vk.core.tool.compose.onboarding.VkFullscreenOnboarding (VkFullscreenOnboarding.kt:35)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = new jys();
                M.R(x);
            }
            final jys jysVar = (jys) x;
            jysVar.a.clear();
            izsVar.invoke(jysVar);
            SnapshotStateList<q0l0> snapshotStateList = jysVar.b;
            snapshotStateList.clear();
            ArrayList arrayList = jysVar.a;
            snapshotStateList.addAll(arrayList);
            arrayList.clear();
            M.K(-1003410150);
            M.K(212064437);
            M.j();
            azl azlVar = (azl) M.r(uvi.h);
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = new op10(azlVar);
                M.R(x2);
            }
            final op10 op10Var = (op10) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = new c6j();
                M.R(x3);
            }
            final c6j c6jVar = (c6j) x3;
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x4);
            }
            final wh50 wh50Var = (wh50) x4;
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = new h6j(c6jVar);
                M.R(x5);
            }
            final h6j h6jVar = (h6j) x5;
            Object x6 = M.x();
            if (x6 == obj) {
                x6 = androidx.compose.runtime.k.a(s3q0.a, w65.e);
                M.R(x6);
            }
            final wh50 wh50Var2 = (wh50) x6;
            boolean y = M.y(op10Var) | M.o(257);
            Object x7 = M.x();
            if (y || x7 == obj) {
                x7 = new cp10() { // from class: com.vk.core.tool.compose.onboarding.VkFullscreenOnboardingKt$VkFullscreenOnboarding$$inlined$ConstraintLayout$2
                    @Override // xsna.cp10
                    public final dp10 b(ep10 ep10Var, final List<? extends zo10> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        wh50.this.getValue();
                        long f = op10Var.f(j, ep10Var.getLayoutDirection(), h6jVar, list, linkedHashMap);
                        wh50Var.getValue();
                        final op10 op10Var2 = op10Var;
                        return ep10Var.Q((int) (f >> 32), (int) (f & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.core.tool.compose.onboarding.VkFullscreenOnboardingKt$VkFullscreenOnboarding$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // xsna.izs
                            public final s3q0 invoke(tra0.a aVar2) {
                                op10.this.e(aVar2, list, linkedHashMap);
                                return s3q0.a;
                            }
                        });
                    }
                };
                M.R(x7);
            }
            cp10 cp10Var = (cp10) x7;
            Object x8 = M.x();
            if (x8 == obj) {
                x8 = new gzs<s3q0>() { // from class: com.vk.core.tool.compose.onboarding.VkFullscreenOnboardingKt$VkFullscreenOnboarding$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.gzs
                    public final s3q0 invoke() {
                        wh50.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        h6jVar.e = true;
                        return s3q0.a;
                    }
                };
                M.R(x8);
            }
            final gzs gzsVar5 = (gzs) x8;
            boolean y2 = M.y(op10Var);
            Object x9 = M.x();
            if (y2 || x9 == obj) {
                x9 = new izs<tgi0, s3q0>() { // from class: com.vk.core.tool.compose.onboarding.VkFullscreenOnboardingKt$VkFullscreenOnboarding$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public final s3q0 invoke(tgi0 tgi0Var) {
                        e4p0.a(tgi0Var, op10.this);
                        return s3q0.a;
                    }
                };
                M.R(x9);
            }
            joy.a(egi0.b(q630Var, false, (izs) x9), kai.c(1200550679, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.core.tool.compose.onboarding.VkFullscreenOnboardingKt$VkFullscreenOnboarding$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // xsna.wzs
                public final s3q0 invoke(a aVar2, Integer num) {
                    a aVar3 = aVar2;
                    int intValue = num.intValue();
                    if ((intValue & 3) == 2 && aVar3.e()) {
                        aVar3.h();
                    } else {
                        if (b.d()) {
                            b.f(1200550679, intValue, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        wh50.this.setValue(s3q0.a);
                        c6j c6jVar2 = c6jVar;
                        int i7 = c6jVar2.b;
                        c6jVar2.l();
                        c6j c6jVar3 = c6jVar;
                        aVar3.K(-340610992);
                        c6j c6jVar4 = c6j.this;
                        s5j j = c6jVar4.j();
                        s5j j2 = c6jVar4.j();
                        s5j j3 = c6jVar4.j();
                        boolean J = aVar3.J(jysVar);
                        Object x10 = aVar3.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (J || x10 == c0012a) {
                            x10 = new swu0(jysVar);
                            aVar3.R(x10);
                        }
                        yjl b = rc90.b(0, (gzs) x10, aVar3, 0, 3);
                        boolean J2 = aVar3.J(jysVar) | aVar3.J(b);
                        Object x11 = aVar3.x();
                        if (J2 || x11 == c0012a) {
                            x11 = new owu0(jysVar, b, null);
                            aVar3.R(x11);
                        }
                        bap.g(b, (wzs) x11, aVar3, 0);
                        jys jysVar2 = jysVar;
                        boolean J3 = aVar3.J(j2);
                        Object x12 = aVar3.x();
                        if (J3 || x12 == c0012a) {
                            x12 = new pwu0(j2);
                            aVar3.R(x12);
                        }
                        q630.a aVar4 = q630.a.a;
                        twu0.c(jysVar2, b, c6j.i(aVar4, j, (izs) x12), aVar3, 0);
                        e7v0 e7v0Var = af90Var;
                        jys jysVar3 = jysVar;
                        Object x13 = aVar3.x();
                        if (x13 == c0012a) {
                            x13 = qwu0.b;
                            aVar3.R(x13);
                        }
                        twu0.a(e7v0Var, jysVar3, c6j.i(aVar4, j2, (izs) x13), aVar3, 0);
                        gzs gzsVar6 = gzsVar4;
                        Object x14 = aVar3.x();
                        if (x14 == c0012a) {
                            x14 = rwu0.b;
                            aVar3.R(x14);
                        }
                        twu0.b(0, aVar3, gzsVar6, c6j.i(aVar4, j3, (izs) x14));
                        aVar3.j();
                        if (c6jVar.b != i7) {
                            bap.i(gzsVar5, aVar3, 6);
                        }
                        if (b.d()) {
                            b.e();
                        }
                    }
                    return s3q0.a;
                }
            }, M), cp10Var, M, 48, 0);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            gzsVar3 = gzsVar4;
        } else {
            M.h();
            gzsVar3 = gzsVar2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gmf0(izsVar, af90Var, q630Var, gzsVar3, i, i2);
        }
    }
}
