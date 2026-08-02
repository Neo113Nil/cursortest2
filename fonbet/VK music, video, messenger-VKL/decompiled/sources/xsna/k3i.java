package xsna;

import android.view.View;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.view.components.cell.VkCell;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsViewState;
import com.vkontakte.android.R;
import java.util.List;
import xsna.q630;
import xsna.sjb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class k3i implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ k3i(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        if (xsna.brm0.w(r2, "en", true) != false) goto L43;
     */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i = 0;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                List list = (List) obj2;
                if (th != null) {
                    return new CommunitySuggestionsViewState.b(th, !list.isEmpty());
                }
                return null;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(998701827, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$BannerScreenContentKt.lambda$998701827.<anonymous> (BannerScreenContent.kt:181)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.v0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c("This is AD Banner", s200.E(hr80.m(q630.a.a, ylu0Var.getBackground().z, vog0.b(kqu0.e)), kqu0.r, kqu0.q), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar, 6, 0, 8188);
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
                        androidx.compose.runtime.b.f(-1623017259, intValue2, -1, "com.vk.profile.community.impl.ui.profile.content.holders.market.ComposableSingletons$CommunityProfileContentServicesViewHolderKt.lambda$-1623017259.<anonymous> (CommunityProfileContentServicesViewHolder.kt:290)");
                    }
                    tth.a(null, c4g0.c, aVar2, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1578284643, intValue3, -1, "com.vk.profile.core.onboarding.mvi.view.ComposableSingletons$OldUserOnBoardingStateContentViewKt.lambda$-1578284643.<anonymous> (OldUserOnBoardingStateContentView.kt:132)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                    }
                    lg90 b = or.b(aVar3, 1833859693, R.drawable.vk_icon_cancel_24, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vqv.a(b, d370.N(R.string.close, 0, aVar3), null, ylu0Var2.getIcon().l, aVar3, 8, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                View view = (View) obj;
                VkCell.f fVar = (VkCell.f) obj2;
                sjb0.a aVar4 = fVar instanceof sjb0.a ? (sjb0.a) fVar : null;
                if (aVar4 != null) {
                    view.setContentDescription(view.getContext().getString(aVar4.b));
                    view.setBackground(m33.a(aVar4.a, view.getContext()));
                }
                return s3q0.a;
            case 5:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (!brm0.w(str, "ru", true)) {
                    if (!brm0.w(str2, "ru", true)) {
                        if (!brm0.w(str, "en", true)) {
                            break;
                        }
                    }
                    i = 1;
                    return Integer.valueOf(i);
                }
                i = -1;
                return Integer.valueOf(i);
            case 6:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar5.K(917187747);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(917187747, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:229)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar5.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.O0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return frv0Var2;
            default:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar6.K(897646625);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(897646625, intValue5, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:209)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var3 = (wuv0) aVar6.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var3 = wuv0Var3.u0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
                return frv0Var3;
        }
    }
}
