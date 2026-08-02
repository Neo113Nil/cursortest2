package xsna;

import androidx.compose.runtime.a;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.TooltipsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.CellLeftTooltipType;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gkk implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ gzs d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Enum g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ gkk(String str, f7v0 f7v0Var, VkOnboarding$TintColor vkOnboarding$TintColor, VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType, l5g l5gVar, VkOnboardingStat$Delegate vkOnboardingStat$Delegate, gzs gzsVar, gzs gzsVar2) {
        this.e = str;
        this.f = f7v0Var;
        this.g = vkOnboarding$TintColor;
        this.h = vkOnboarding$HighlighterMarkerType;
        this.i = l5gVar;
        this.j = vkOnboardingStat$Delegate;
        this.c = gzsVar;
        this.d = gzsVar2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ikk.a((qow) this.e, (TooltipsData) this.f, (CellLeftTooltipType) this.g, this.c, this.d, (izs) this.h, (izs) this.i, (q630) this.j, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                String str = (String) this.e;
                f7v0 f7v0Var = (f7v0) this.f;
                VkOnboarding$TintColor vkOnboarding$TintColor = (VkOnboarding$TintColor) this.g;
                VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType = (VkOnboarding$HighlighterMarkerType) this.h;
                l5g l5gVar = (l5g) this.i;
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = (VkOnboardingStat$Delegate) this.j;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-642062853, intValue, -1, "com.vk.core.tool.compose.onboarding.VkOnboardingBanner.<anonymous> (VkOnboardingBanner.kt:79)");
                    }
                    boolean J = aVar.J(vkOnboardingStat$Delegate);
                    gzs gzsVar = this.c;
                    boolean J2 = J | aVar.J(gzsVar);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J2 || x == c0012a) {
                        x = new hc1(27, vkOnboardingStat$Delegate, gzsVar);
                        aVar.R(x);
                    }
                    gzs gzsVar2 = (gzs) x;
                    boolean J3 = aVar.J(vkOnboardingStat$Delegate);
                    gzs gzsVar3 = this.d;
                    boolean J4 = J3 | aVar.J(gzsVar3);
                    Object x2 = aVar.x();
                    if (J4 || x2 == c0012a) {
                        x2 = new fy0(27, vkOnboardingStat$Delegate, gzsVar3);
                        aVar.R(x2);
                    }
                    o7v0.a(str, f7v0Var, vkOnboarding$TintColor, vkOnboarding$HighlighterMarkerType, l5gVar, vkOnboardingStat$Delegate, q630.a.a, gzsVar2, (gzs) x2, aVar, 1572864);
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

    public /* synthetic */ gkk(qow qowVar, TooltipsData tooltipsData, CellLeftTooltipType cellLeftTooltipType, gzs gzsVar, gzs gzsVar2, izs izsVar, izs izsVar2, q630 q630Var, int i) {
        this.e = qowVar;
        this.f = tooltipsData;
        this.g = cellLeftTooltipType;
        this.c = gzsVar;
        this.d = gzsVar2;
        this.h = izsVar;
        this.i = izsVar2;
        this.j = q630Var;
    }
}
