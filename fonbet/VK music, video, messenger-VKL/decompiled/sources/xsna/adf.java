package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.generated.VkTypographyToken;
import xsna.ush;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class adf implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ adf(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = 7;
        switch (this.b) {
            case 0:
                ((Integer) obj).getClass();
                return "author_" + ((pgf) obj2).a().hashCode();
            case 1:
                return (ush.a) obj;
            case 2:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(732670603, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$ModalCardScreenContentKt.lambda$732670603.<anonymous> (ModalCardScreenContent.kt:343)");
                    }
                    ButtonStyle buttonStyle = ButtonStyle.Tertiary;
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new gc(i);
                        aVar.R(x);
                    }
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, "Подробнее", null, null, null, null, false, null, null, null, aVar, 3510, 384, 0, 4190192);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                eso.c(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                ((Integer) obj).getClass();
                return ((hv30) obj2).b.getId();
            case 5:
                f2h0 f2h0Var = (f2h0) obj;
                tjo0 tjo0Var = (tjo0) obj2;
                hik0 hik0Var = tjo0Var.a;
                fh9 fh9Var = i2h0.i;
                return e43.a(i2h0.a(hik0Var, fh9Var, f2h0Var), i2h0.a(tjo0Var.b, fh9Var, f2h0Var), i2h0.a(tjo0Var.c, fh9Var, f2h0Var), i2h0.a(tjo0Var.d, fh9Var, f2h0Var));
            default:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(1689218015);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1689218015, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:167)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.E;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
        }
    }
}
