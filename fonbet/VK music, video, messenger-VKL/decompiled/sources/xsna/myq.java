package xsna;

import java.util.Locale;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class myq implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ myq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                tyq tyqVar = (tyq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1542963864, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.ItemList.<anonymous>.<anonymous>.<anonymous> (FeedEnhancedLinkCardScreenContent.kt:103)");
                    }
                    tyqVar.f(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                rco0 rco0Var = (rco0) this.c;
                va8 va8Var = (va8) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(va8Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-491427318, intValue2, -1, "com.vk.core.compose.component.image.content.TextContent.invoke.<anonymous> (TextContent.kt:50)");
                    }
                    azl azlVar = (azl) aVar2.r(uvi.h);
                    long b = wa8.b(0, 0, va8Var.f());
                    long I = azlVar.I((int) ((Math.min((int) (b >> 32), (int) (b & 4294967295L)) * 0.36d) + (r2 % 2)));
                    String upperCase = erm0.D0(2, (String) ((zak0) rco0Var.b).getValue()).toUpperCase(Locale.ROOT);
                    f870.A().getClass();
                    aVar2.K(-713198387);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-713198387, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeAvatarDefault.textContentColor (MilkshakeAvatarDefault.kt:59)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().d;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.a(upperCase, null, j, I, null, null, 0L, 3, I, null, 0, false, 0, 1, null, wuv0Var.b, aVar2, 0, 12582912, 390130);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
