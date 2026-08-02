package xsna;

import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.log.L;
import xsna.q8z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class rc9 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ rc9(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        boolean z = true;
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                L.p("CallsAudioManagerWrapper", "isHeadsetPlugged: hasWiredHeadset=" + bool + ", hasBluetoothHeadset=" + bool2);
                if (!bool.booleanValue() && !bool2.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                ((Integer) obj).getClass();
                return "sharing_" + ((pgf) obj2).a().hashCode();
            case 2:
                ((Integer) obj2).getClass();
                ybo.n(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                q8z.b bVar = (q8z.b) obj2;
                return e43.a(bVar.a, i2h0.a(bVar.b, i2h0.j, (f2h0) obj));
            case 4:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar.K(-1999870533);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1999870533, intValue, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:226)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.L0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar2.K(-2019411655);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2019411655, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:206)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.r0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var2;
        }
    }
}
