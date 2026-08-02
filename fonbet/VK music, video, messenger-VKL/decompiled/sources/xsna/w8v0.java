package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dak0;
import xsna.dt1;
import xsna.q630;
import xsna.wlp0;

/* compiled from: VkOnboardingTooltipBalloon.kt */
/* loaded from: classes17.dex */
public final class w8v0 {
    public static final bpn0 a = new bpn0(new n8v0(0));

    /* compiled from: VkOnboardingTooltipBalloon.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkTooltip$BalloonPosition.values().length];
            try {
                iArr[VkTooltip$BalloonPosition.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.TopLeft.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.TopRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.BottomRight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.BottomLeft.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final VkTooltip$BalloonPosition vkTooltip$BalloonPosition, final VkTooltip$BalloonTilt vkTooltip$BalloonTilt, final c700 c700Var, final gzs gzsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        Object B;
        int i2;
        Object B2;
        Object B3;
        float f;
        androidx.compose.runtime.a M = aVar.M(-1520618793);
        int i3 = i | (M.J(str) ? 4 : 2) | (M.o(vkTooltip$BalloonPosition.ordinal()) ? 32 : 16) | (M.o(vkTooltip$BalloonTilt.ordinal()) ? 256 : 128) | (M.J(c700Var) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536);
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1520618793, i3, -1, "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipBalloon (VkOnboardingTooltipBalloon.kt:47)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = Float.valueOf(vkTooltip$BalloonTilt == VkTooltip$BalloonTilt.Left ? -3.0f : 3.0f);
                M.R(x);
            }
            float floatValue = ((Number) x).floatValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                switch (a.$EnumSwitchMapping$0[vkTooltip$BalloonPosition.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        f = 40.0f;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        f = -40.0f;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                x2 = Float.valueOf(f);
                M.R(x2);
            }
            float floatValue2 = ((Number) x2).floatValue();
            wlp0 e = ump0.e(c700Var, "", M, ((i3 >> 9) & 14) | 48, 0);
            z46 z46Var = e.a;
            float f2 = floatValue2;
            jtp0 jtp0Var = rte0.e;
            if (e.g()) {
                M.K(1666827533);
                M.j();
                B = z46Var.B();
            } else {
                M.K(1666573488);
                boolean J = M.J(e);
                B = M.x();
                if (J || B == c0012a) {
                    dak0 a2 = dak0.a.a();
                    izs<Object, s3q0> e2 = a2 != null ? a2.e() : null;
                    dak0 b = dak0.a.b(a2);
                    try {
                        Object B4 = z46Var.B();
                        dak0.a.d(a2, b, e2);
                        M.R(B4);
                        B = B4;
                    } finally {
                    }
                }
                M.j();
            }
            c700 c700Var2 = (c700) B;
            M.K(408018943);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(408018943, 0, -1, "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipBalloon.<anonymous> (VkOnboardingTooltipBalloon.kt:74)");
            }
            float f3 = c700Var2.getProgress() >= 0.2f ? 0.0f : f2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            Float valueOf = Float.valueOf(f3);
            boolean J2 = M.J(e);
            Object x3 = M.x();
            if (J2 || x3 == c0012a) {
                x3 = bbk0.b(new p8v0(e));
                M.R(x3);
            }
            c700 c700Var3 = (c700) ((mtk0) x3).getValue();
            M.K(408018943);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(408018943, 0, -1, "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipBalloon.<anonymous> (VkOnboardingTooltipBalloon.kt:74)");
            }
            if (c700Var3.getProgress() >= 0.2f) {
                f2 = 0.0f;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            Float valueOf2 = Float.valueOf(f2);
            boolean J3 = M.J(e);
            Object x4 = M.x();
            if (J3 || x4 == c0012a) {
                x4 = bbk0.b(new q8v0(e));
                M.R(x4);
            }
            M.K(-1260606626);
            if (androidx.compose.runtime.b.d()) {
                i2 = 0;
                androidx.compose.runtime.b.f(-1260606626, 0, -1, "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipBalloon.<anonymous> (VkOnboardingTooltipBalloon.kt:68)");
            } else {
                i2 = 0;
            }
            bpn0 bpn0Var = a;
            dtp0 d = jq2.d(400, i2, (nkk) bpn0Var.getValue(), 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            boolean z = i2;
            wlp0.d c = ump0.c(e, valueOf, valueOf2, d, jtp0Var, M, 196608);
            if (e.g()) {
                M.K(1666827533);
                M.j();
                B2 = z46Var.B();
            } else {
                M.K(1666573488);
                boolean J4 = M.J(e);
                B2 = M.x();
                if (J4 || B2 == c0012a) {
                    dak0 a3 = dak0.a.a();
                    izs<Object, s3q0> e3 = a3 != null ? a3.e() : null;
                    dak0 b2 = dak0.a.b(a3);
                    try {
                        Object B5 = z46Var.B();
                        dak0.a.d(a3, b2, e3);
                        M.R(B5);
                        B2 = B5;
                    } finally {
                    }
                }
                M.j();
            }
            c700 c700Var4 = (c700) B2;
            M.K(-2043806643);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2043806643, z ? 1 : 0, -1, "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipBalloon.<anonymous> (VkOnboardingTooltipBalloon.kt:82)");
            }
            float f4 = c700Var4.getProgress() >= 0.2f ? 1.0f : 0.0f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            Float valueOf3 = Float.valueOf(f4);
            boolean J5 = M.J(e);
            Object x5 = M.x();
            if (J5 || x5 == c0012a) {
                x5 = bbk0.b(new r8v0(e));
                M.R(x5);
            }
            c700 c700Var5 = (c700) ((mtk0) x5).getValue();
            M.K(-2043806643);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2043806643, z ? 1 : 0, -1, "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipBalloon.<anonymous> (VkOnboardingTooltipBalloon.kt:82)");
            }
            float f5 = c700Var5.getProgress() >= 0.2f ? 1.0f : 0.0f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            Float valueOf4 = Float.valueOf(f5);
            boolean J6 = M.J(e);
            Object x6 = M.x();
            if (J6 || x6 == c0012a) {
                x6 = bbk0.b(new s8v0(e));
                M.R(x6);
            }
            M.K(-1620962452);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1620962452, z ? 1 : 0, -1, "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipBalloon.<anonymous> (VkOnboardingTooltipBalloon.kt:80)");
            }
            dtp0 d2 = jq2.d(400, z ? 1 : 0, null, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            wlp0.d c2 = ump0.c(e, valueOf3, valueOf4, d2, jtp0Var, M, 196608);
            if (e.g()) {
                M.K(1666827533);
                M.j();
                B3 = z46Var.B();
            } else {
                M.K(1666573488);
                boolean J7 = M.J(e);
                B3 = M.x();
                if (J7 || B3 == c0012a) {
                    dak0 a4 = dak0.a.a();
                    izs<Object, s3q0> e4 = a4 != null ? a4.e() : null;
                    dak0 b3 = dak0.a.b(a4);
                    try {
                        Object B6 = z46Var.B();
                        dak0.a.d(a4, b3, e4);
                        M.R(B6);
                        B3 = B6;
                    } finally {
                    }
                }
                M.j();
            }
            c700 c700Var6 = (c700) B3;
            M.K(-873261444);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-873261444, z ? 1 : 0, -1, "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipBalloon.<anonymous> (VkOnboardingTooltipBalloon.kt:95)");
            }
            float f6 = c700Var6.getProgress() >= 0.2f ? floatValue : 0.0f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            Float valueOf5 = Float.valueOf(f6);
            boolean J8 = M.J(e);
            Object x7 = M.x();
            if (J8 || x7 == c0012a) {
                x7 = bbk0.b(new t8v0(e));
                M.R(x7);
            }
            c700 c700Var7 = (c700) ((mtk0) x7).getValue();
            M.K(-873261444);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-873261444, z ? 1 : 0, -1, "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipBalloon.<anonymous> (VkOnboardingTooltipBalloon.kt:95)");
            }
            float f7 = c700Var7.getProgress() >= 0.2f ? floatValue : 0.0f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            Float valueOf6 = Float.valueOf(f7);
            boolean J9 = M.J(e);
            Object x8 = M.x();
            if (J9 || x8 == c0012a) {
                x8 = bbk0.b(new u8v0(e));
                M.R(x8);
            }
            M.K(-649993411);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-649993411, z ? 1 : 0, -1, "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipBalloon.<anonymous> (VkOnboardingTooltipBalloon.kt:89)");
            }
            dtp0 d3 = jq2.d(400, z ? 1 : 0, (nkk) bpn0Var.getValue(), 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            wlp0.d c3 = ump0.c(e, valueOf5, valueOf6, d3, jtp0Var, M, 196608);
            float f8 = 10;
            q630 m = hr80.m(rdu.c(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) c2.getValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) c.getValue()).floatValue(), ((Number) c3.getValue()).floatValue(), null, 524011), wlb0.h(M).getBackground().s, vog0.b(f8));
            dt1.a.getClass();
            cp10 d4 = ja8.d(dt1.a.b, z);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c4 = qri.c(M, m);
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
            k9q0.w(M, d4, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c4, cri.a.d);
            float f9 = 12;
            q630 G = s200.G(q630.a.a, f9, 8, f9, f8);
            Object x9 = M.x();
            if (x9 == c0012a) {
                x9 = new quz(27);
                M.R(x9);
            }
            yqv0.a(str, egi0.b(G, z, (izs) x9), wlb0.h(M).getText().e, l2l0.l(13), null, null, 0L, 0, l2l0.l(16), null, 0, false, 0, 3, null, wlb0.l(M).s, M, (i3 & 14) | 3072, 12582960, 391152);
            M = M;
            if (((Number) c2.getValue()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                M.K(697289728);
                s3q0 s3q0Var = s3q0.a;
                boolean z2 = (i3 & 57344) == 16384;
                Object x10 = M.x();
                if (z2 || x10 == c0012a) {
                    x10 = new v8v0(gzsVar, null);
                    M.R(x10);
                }
                bap.g(s3q0Var, (wzs) x10, M, 6);
            } else {
                M.K(693084485);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, c700Var, gzsVar, q630Var, i) { // from class: xsna.o8v0
                public final /* synthetic */ String b;
                public final /* synthetic */ VkTooltip$BalloonPosition c;
                public final /* synthetic */ VkTooltip$BalloonTilt d;
                public final /* synthetic */ c700 e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    w8v0.a(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
