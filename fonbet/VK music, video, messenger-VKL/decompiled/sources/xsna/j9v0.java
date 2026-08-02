package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.theme.VkAppTheme;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class j9v0 implements yzs {
    public final /* synthetic */ VkTooltip$BalloonPosition b;
    public final /* synthetic */ VkTooltip$MarkerSize c;
    public final /* synthetic */ VkTooltip$MarkerStyle d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ etv0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ String k;
    public final /* synthetic */ VkOnboarding$TintColor l;
    public final /* synthetic */ VkTooltip$BalloonTilt m;
    public final /* synthetic */ gzs n;
    public final /* synthetic */ gzs o;
    public final /* synthetic */ gzs p;
    public final /* synthetic */ gzs q;
    public final /* synthetic */ gzs r;
    public final /* synthetic */ VkOnboardingStat$Delegate s;
    public final /* synthetic */ float t;

    public /* synthetic */ j9v0(VkTooltip$BalloonPosition vkTooltip$BalloonPosition, VkTooltip$MarkerSize vkTooltip$MarkerSize, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, boolean z, etv0 etv0Var, boolean z2, boolean z3, boolean z4, boolean z5, String str, VkOnboarding$TintColor vkOnboarding$TintColor, VkTooltip$BalloonTilt vkTooltip$BalloonTilt, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, gzs gzsVar4, gzs gzsVar5, VkOnboardingStat$Delegate vkOnboardingStat$Delegate, float f) {
        this.b = vkTooltip$BalloonPosition;
        this.c = vkTooltip$MarkerSize;
        this.d = vkTooltip$MarkerStyle;
        this.e = z;
        this.f = etv0Var;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = str;
        this.l = vkOnboarding$TintColor;
        this.m = vkTooltip$BalloonTilt;
        this.n = gzsVar;
        this.o = gzsVar2;
        this.p = gzsVar3;
        this.q = gzsVar4;
        this.r = gzsVar5;
        this.s = vkOnboardingStat$Delegate;
        this.t = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VkTooltip$BalloonPosition vkTooltip$BalloonPosition;
        wh50 wh50Var;
        wh50 wh50Var2;
        wh50 wh50Var3;
        wh50 wh50Var4;
        VkTooltip$MarkerStyle vkTooltip$MarkerStyle;
        int i;
        etv0 etv0Var;
        wh50 wh50Var5;
        q630 q630Var = (q630) obj;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
        int intValue = ((Integer) obj3).intValue();
        aVar.K(1541111146);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1541111146, intValue, -1, "com.vk.core.tool.compose.onboarding.tooltip.onboardingTooltip.<anonymous> (VkOnboardingTooltipWrapper.kt:113)");
        }
        Object x = aVar.x();
        Object obj4 = a.C0011a.a;
        if (x == obj4) {
            x = bap.j(EmptyCoroutineContext.b, aVar);
            aVar.R(x);
        }
        yvj yvjVar = (yvj) x;
        float density = ((azl) aVar.r(uvi.h)).getDensity();
        Object x2 = aVar.x();
        if (x2 == obj4) {
            x2 = androidx.compose.runtime.k.b(null);
            aVar.R(x2);
        }
        wh50 wh50Var6 = (wh50) x2;
        Object x3 = aVar.x();
        if (x3 == obj4) {
            x3 = androidx.compose.runtime.k.b(null);
            aVar.R(x3);
        }
        wh50 wh50Var7 = (wh50) x3;
        Object x4 = aVar.x();
        VkTooltip$BalloonPosition vkTooltip$BalloonPosition2 = this.b;
        if (x4 == obj4) {
            x4 = androidx.compose.runtime.k.b(vkTooltip$BalloonPosition2);
            aVar.R(x4);
        }
        wh50 wh50Var8 = (wh50) x4;
        Object x5 = aVar.x();
        VkTooltip$MarkerSize vkTooltip$MarkerSize = this.c;
        VkTooltip$MarkerStyle vkTooltip$MarkerStyle2 = this.d;
        if (x5 == obj4) {
            btv0 f = o9v0.f(zhf0.e, (VkTooltip$BalloonPosition) wh50Var8.getValue(), vkTooltip$MarkerStyle2, vkTooltip$MarkerSize, density, new csk0(4, yvjVar, wh50Var7));
            vkTooltip$MarkerStyle2 = vkTooltip$MarkerStyle2;
            vkTooltip$MarkerSize = vkTooltip$MarkerSize;
            density = density;
            x5 = androidx.compose.runtime.k.b(f);
            aVar.R(x5);
        }
        wh50 wh50Var9 = (wh50) x5;
        Object x6 = aVar.x();
        if (x6 == obj4) {
            x6 = o9v0.e(VkAppTheme.VkontakteAndroid.h());
            aVar.R(x6);
        }
        final wh50 wh50Var10 = (wh50) x6;
        Object x7 = aVar.x();
        if (x7 == obj4) {
            x7 = o9v0.e(VkAppTheme.VkontakteAndroidDark.h());
            aVar.R(x7);
        }
        final wh50 wh50Var11 = (wh50) x7;
        Object x8 = aVar.x();
        if (x8 == obj4) {
            x8 = androidx.compose.runtime.k.b(Boolean.FALSE);
            aVar.R(x8);
        }
        wh50 wh50Var12 = (wh50) x8;
        tny tnyVar = (tny) wh50Var6.getValue();
        boolean o = aVar.o(vkTooltip$BalloonPosition2.ordinal()) | aVar.o(vkTooltip$MarkerStyle2.ordinal()) | aVar.o(vkTooltip$MarkerSize.ordinal()) | aVar.n(density) | aVar.y(yvjVar);
        Object x9 = aVar.x();
        if (o || x9 == obj4) {
            float f2 = density;
            VkTooltip$MarkerSize vkTooltip$MarkerSize2 = vkTooltip$MarkerSize;
            VkTooltip$MarkerStyle vkTooltip$MarkerStyle3 = vkTooltip$MarkerStyle2;
            x9 = new p9v0(vkTooltip$BalloonPosition2, vkTooltip$MarkerStyle3, vkTooltip$MarkerSize2, f2, wh50Var6, wh50Var8, yvjVar, wh50Var7, wh50Var9, null);
            vkTooltip$BalloonPosition = vkTooltip$BalloonPosition2;
            vkTooltip$MarkerStyle2 = vkTooltip$MarkerStyle3;
            vkTooltip$MarkerSize = vkTooltip$MarkerSize2;
            density = f2;
            wh50Var = wh50Var6;
            wh50Var2 = wh50Var8;
            wh50Var3 = wh50Var7;
            wh50Var9 = wh50Var9;
            aVar.R(x9);
        } else {
            wh50Var2 = wh50Var8;
            wh50Var = wh50Var6;
            wh50Var3 = wh50Var7;
            vkTooltip$BalloonPosition = vkTooltip$BalloonPosition2;
        }
        bap.f(vkTooltip$MarkerSize, tnyVar, (wzs) x9, aVar, 0);
        VkTooltip$BalloonPosition vkTooltip$BalloonPosition3 = (VkTooltip$BalloonPosition) wh50Var2.getValue();
        boolean o2 = aVar.o(vkTooltip$MarkerStyle2.ordinal()) | aVar.o(vkTooltip$MarkerSize.ordinal()) | aVar.n(density) | aVar.y(yvjVar);
        Object x10 = aVar.x();
        if (o2 || x10 == obj4) {
            wh50 wh50Var13 = wh50Var3;
            x10 = new q9v0(vkTooltip$MarkerStyle2, vkTooltip$MarkerSize, density, wh50Var, wh50Var2, yvjVar, wh50Var13, wh50Var9, null);
            wh50Var3 = wh50Var13;
            wh50Var4 = wh50Var9;
            aVar.R(x10);
        } else {
            wh50Var4 = wh50Var9;
        }
        bap.g(vkTooltip$BalloonPosition3, (wzs) x10, aVar, 0);
        z4p0 z4p0Var = (z4p0) wh50Var3.getValue();
        VkTooltip$MarkerStyle vkTooltip$MarkerStyle4 = vkTooltip$MarkerStyle2;
        boolean z = this.e;
        boolean o3 = aVar.o(vkTooltip$BalloonPosition.ordinal()) | aVar.l(z) | aVar.n(density) | aVar.o(vkTooltip$MarkerStyle4.ordinal()) | aVar.o(vkTooltip$MarkerSize.ordinal());
        Object x11 = aVar.x();
        if (o3 || x11 == obj4) {
            wh50 wh50Var14 = wh50Var;
            wh50 wh50Var15 = wh50Var2;
            VkTooltip$MarkerSize vkTooltip$MarkerSize3 = vkTooltip$MarkerSize;
            x11 = new r9v0(z, vkTooltip$BalloonPosition, density, vkTooltip$MarkerStyle4, vkTooltip$MarkerSize3, wh50Var3, wh50Var14, wh50Var15, null);
            vkTooltip$MarkerStyle = vkTooltip$MarkerStyle4;
            vkTooltip$MarkerSize = vkTooltip$MarkerSize3;
            wh50Var = wh50Var14;
            wh50Var2 = wh50Var15;
            aVar.R(x11);
        } else {
            vkTooltip$MarkerStyle = vkTooltip$MarkerStyle4;
        }
        bap.g(z4p0Var, (wzs) x11, aVar, 0);
        final etv0 etv0Var2 = this.f;
        boolean isVisible = etv0Var2.isVisible();
        boolean z2 = this.g;
        if (!isVisible || (z2 && !((Boolean) wh50Var12.getValue()).booleanValue())) {
            i = 0;
            etv0Var = etv0Var2;
            wh50Var5 = wh50Var12;
            aVar.K(-1962928968);
        } else {
            aVar.K(-1955385459);
            btv0 btv0Var = (btv0) wh50Var4.getValue();
            final boolean z3 = this.j;
            final String str = this.k;
            final VkOnboarding$TintColor vkOnboarding$TintColor = this.l;
            final VkTooltip$BalloonTilt vkTooltip$BalloonTilt = this.m;
            final gzs gzsVar = this.n;
            final gzs gzsVar2 = this.o;
            final gzs gzsVar3 = this.p;
            final gzs gzsVar4 = this.q;
            final gzs gzsVar5 = this.r;
            final VkOnboardingStat$Delegate vkOnboardingStat$Delegate = this.s;
            final float f3 = this.t;
            final VkTooltip$MarkerStyle vkTooltip$MarkerStyle5 = vkTooltip$MarkerStyle;
            final VkTooltip$MarkerSize vkTooltip$MarkerSize4 = vkTooltip$MarkerSize;
            final wh50 wh50Var16 = wh50Var2;
            wzs wzsVar = new wzs() { // from class: xsna.k9v0
                @Override // xsna.wzs
                public final Object invoke(Object obj5, Object obj6) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj5;
                    int intValue2 = ((Integer) obj6).intValue();
                    if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(417294614, intValue2, -1, "com.vk.core.tool.compose.onboarding.tooltip.onboardingTooltip.<anonymous>.<anonymous> (VkOnboardingTooltipWrapper.kt:182)");
                        }
                        ylu0 ylu0Var = (ylu0) wh50Var10.getValue();
                        ylu0 ylu0Var2 = (ylu0) wh50Var11.getValue();
                        final etv0 etv0Var3 = etv0Var2;
                        final String str2 = str;
                        final VkTooltip$MarkerStyle vkTooltip$MarkerStyle6 = vkTooltip$MarkerStyle5;
                        final VkTooltip$MarkerSize vkTooltip$MarkerSize5 = vkTooltip$MarkerSize4;
                        final VkOnboarding$TintColor vkOnboarding$TintColor2 = vkOnboarding$TintColor;
                        final VkTooltip$BalloonTilt vkTooltip$BalloonTilt2 = vkTooltip$BalloonTilt;
                        final gzs gzsVar6 = gzsVar;
                        final gzs gzsVar7 = gzsVar2;
                        final gzs gzsVar8 = gzsVar3;
                        final gzs gzsVar9 = gzsVar4;
                        final gzs gzsVar10 = gzsVar5;
                        final VkOnboardingStat$Delegate vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
                        final float f4 = f3;
                        final wh50 wh50Var17 = wh50Var16;
                        rrv0.e(z3, ylu0Var2, ylu0Var, null, null, null, kai.c(222022969, new wzs() { // from class: xsna.i9v0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // xsna.wzs
                            public final Object invoke(Object obj7, Object obj8) {
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj7;
                                int intValue3 = ((Integer) obj8).intValue();
                                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(222022969, intValue3, -1, "com.vk.core.tool.compose.onboarding.tooltip.onboardingTooltip.<anonymous>.<anonymous>.<anonymous> (VkOnboardingTooltipWrapper.kt:187)");
                                    }
                                    g9v0.a(etv0.this, str2, null, vkTooltip$MarkerStyle6, vkTooltip$MarkerSize5, vkOnboarding$TintColor2, (VkTooltip$BalloonPosition) wh50Var17.getValue(), vkTooltip$BalloonTilt2, gzsVar6, gzsVar7, gzsVar8, gzsVar9, gzsVar10, vkOnboardingStat$Delegate2, f4, aVar3, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar2), aVar2, 1572864, 56);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            };
            etv0Var = etv0Var2;
            wh50Var5 = wh50Var12;
            i = 0;
            o9v0.b(btv0Var, etv0Var, yvjVar, this.h, this.i, kai.c(417294614, wzsVar, aVar), aVar, 1572864);
        }
        aVar.j();
        boolean y = aVar.y(etv0Var);
        Object x12 = aVar.x();
        if (y || x12 == obj4) {
            x12 = new l9v0(etv0Var, 0);
            aVar.R(x12);
        }
        bap.c(etv0Var, (izs) x12, aVar, i);
        boolean l = aVar.l(z2);
        Object x13 = aVar.x();
        if (l || x13 == obj4) {
            x13 = new thu(z2, wh50Var, wh50Var5);
            aVar.R(x13);
        }
        q630 o4 = egi.o(q630Var, (izs) x13);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return o4;
    }
}
