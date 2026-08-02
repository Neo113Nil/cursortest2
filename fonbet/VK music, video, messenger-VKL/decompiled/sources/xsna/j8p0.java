package xsna;

import com.vk.core.compose.component.defaults.VkTooltipAppearance;
import com.vk.fullscreenvideo.ControlsState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j8p0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j8p0(ControlsState.b bVar, izs izsVar, q630 q630Var, izs izsVar2, int i) {
        this.c = bVar;
        this.d = izsVar;
        this.f = q630Var;
        this.e = izsVar2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                p8p0.j((ControlsState.b) this.c, (izs) this.d, (q630) this.f, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            default:
                ktv0 ktv0Var = (ktv0) this.c;
                gtv0 gtv0Var = (gtv0) this.d;
                VkTooltipAppearance vkTooltipAppearance = (VkTooltipAppearance) this.e;
                jai jaiVar = (jai) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-28725168, intValue, -1, "com.vk.core.compose.component.tooltip.TooltipImpl.<anonymous> (VkTooltip.kt:248)");
                    }
                    pq3.e().getClass();
                    aVar.K(-1986252306);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1986252306, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeTooltipDefaults.shadowElevation (MilkshakeTooltipDefaults.kt:36)");
                    }
                    float f = vkTooltipAppearance == VkTooltipAppearance.Transparent ? 0 : eo20.j;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar.j();
                    euv0.b(ktv0Var, gtv0Var, f, jaiVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ j8p0(ktv0 ktv0Var, gtv0 gtv0Var, VkTooltipAppearance vkTooltipAppearance, jai jaiVar) {
        this.c = ktv0Var;
        this.d = gtv0Var;
        this.e = vkTooltipAppearance;
        this.f = jaiVar;
    }
}
