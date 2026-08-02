package xsna;

import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import xsna.k5x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class eni implements zzs {
    public final /* synthetic */ int b;

    public /* synthetic */ eni(int i) {
        this.b = i;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long j;
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= aVar.l(booleanValue) ? 32 : 16;
                }
                if (aVar.t(intValue & 1, (intValue & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1507206169, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkAccentTabRowKt.lambda$1507206169.<anonymous> (VkAccentTabRow.kt:701)");
                    }
                    if (booleanValue) {
                        aVar.K(1021155172);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getText().m;
                    } else {
                        aVar.K(1021156358);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getText().p;
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c("Tab 4", null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.P, aVar, 6, 0, 8186);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                CallEffectsDependency.DynamicLibsState dynamicLibsState = (CallEffectsDependency.DynamicLibsState) obj;
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj3;
                k5x0.a aVar2 = (k5x0.a) obj4;
                dhw0 L = com.vk.voip.ui.c.b.L();
                boolean z = false;
                boolean z2 = ((L != null ? L.A : null) != null ? false : com.vk.voip.ui.c.R().getConfiguration().a()) && bool2.booleanValue() && !dynamicLibsState.h();
                boolean i = dynamicLibsState.i();
                if (bool.booleanValue() && dynamicLibsState.i()) {
                    z = true;
                }
                return new VoipActionsFeatureState.k(z2, i, z, aVar2);
        }
    }
}
