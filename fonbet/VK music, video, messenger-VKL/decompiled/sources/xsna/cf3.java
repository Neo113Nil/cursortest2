package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import xsna.e8v0;
import xsna.lsv;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class cf3 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ cf3(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = 0;
        switch (this.b) {
            case 0:
                return new Pair((WebApiApplication) obj, (String) obj2);
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(191298847, intValue, -1, "com.vk.importcontacts.impl.presentation.details.view.ComposableSingletons$ImportContactsDetailsViewKt.lambda$191298847.<anonymous> (ImportContactsDetailsView.kt:142)");
                    }
                    q630 d = txj0.d(q630.a.a, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                    }
                    lg90 b = or.b(aVar, 861936997, R.drawable.vk_icon_cancel_outline_28, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(b, d370.N(R.string.import_contacts_details_close_description, 0, aVar), d, ylu0Var.getIcon().c, aVar, 392, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-275512799, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkSecondaryTabRowKt.lambda$-275512799.<anonymous> (VkSecondaryTabRow.kt:597)");
                    }
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        x = qq.h(0, aVar2);
                    }
                    wh50 wh50Var = (wh50) x;
                    ziv0.d(((Number) wh50Var.getValue()).intValue(), kai.c(1581272148, new eoi(wh50Var, i), aVar2), null, 0L, false, null, aVar2, 48, 60);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                return new lsv.b(((lsv.a) obj).a, (List) obj2);
            case 4:
                q7v0 q7v0Var = (q7v0) obj;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) obj2;
                q7v0Var.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.m.b);
                q7v0Var.b(vkOnboardingCampaign, false);
                return s3q0.a;
            case 5:
                List list = (List) obj2;
                if (((List) obj).isEmpty() && list.isEmpty()) {
                    r5 = false;
                }
                return Boolean.valueOf(r5);
            case 6:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(86534113);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(86534113, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:231)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.Q0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
            case 7:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar4.K(66992991);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(66992991, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:211)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.w0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var2;
            default:
                return new Pair((f.a) obj, (Float) obj2);
        }
    }
}
