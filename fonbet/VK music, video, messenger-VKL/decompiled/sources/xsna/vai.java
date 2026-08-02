package xsna;

import android.content.Context;
import androidx.compose.foundation.text.selection.SelectedTextType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class vai implements zzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vai(int i) {
        this.b = i;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long j;
        switch (this.b) {
            case 0:
                ilr0 ilr0Var = (ilr0) obj;
                Map map = (Map) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-869223072, intValue, -1, "androidx.compose.animation.graphics.res.ComposableSingletons$AnimatedVectorPainterResources_androidKt.lambda$-869223072.<anonymous> (AnimatedVectorPainterResources.android.kt:47)");
                }
                mlr0.a(ilr0Var, map, aVar, intValue & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= aVar2.l(booleanValue) ? 32 : 16;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1884257082, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkSecondaryTabRowKt.lambda$-1884257082.<anonymous> (VkSecondaryTabRow.kt:603)");
                    }
                    if (booleanValue) {
                        aVar2.K(1705148241);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getText().m;
                    } else {
                        aVar2.K(1705149427);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getText().p;
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c("Tab 1", null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.P, aVar2, 6, 0, 8186);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                return new fua0((kotlin.coroutines.d) obj, (Context) obj2, (SelectedTextType) obj3, (lwz) obj4);
        }
    }
}
