package xsna;

import android.widget.TextView;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.im.engine.utils.StringMatchStrategy;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class woi implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ woi(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1543866092, intValue, -1, "com.vk.core.compose.component.tooltip.ComposableSingletons$VkTooltipKt.lambda$-1543866092.<anonymous> (VkTooltip.kt:81)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj).intValue();
                return ((zzc) obj2).a;
            case 2:
                ((TextView) obj).setTextColor(((kkm) obj2).f(R.attr.vk_ui_text_accent));
                return s3q0.a;
            case 3:
                StringMatchStrategy stringMatchStrategy = StringMatchStrategy.STRICT;
                return Boolean.valueOf(((String) obj).equalsIgnoreCase((String) obj2));
            default:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(-397186631);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-397186631, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:162)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.z;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
        }
    }
}
