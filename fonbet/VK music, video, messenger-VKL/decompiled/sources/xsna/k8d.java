package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.compose.generated.VkTypographyToken;
import java.util.List;
import kotlin.Result;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class k8d implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ k8d(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return new x0a(new e4((ViewGroup) obj2, 13), new rme0((View) obj, 20));
            case 1:
                return (Result) obj;
            case 2:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-426899134, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkAccentTabRowKt.lambda$-426899134.<anonymous> (VkAccentTabRow.kt:475)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                List list = (List) obj;
                list.addAll((List) obj2);
                return list;
            case 4:
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                cc70.c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(1318099355);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1318099355, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:250)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.j1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
        }
    }

    public /* synthetic */ k8d(int i) {
        this.b = 5;
    }
}
