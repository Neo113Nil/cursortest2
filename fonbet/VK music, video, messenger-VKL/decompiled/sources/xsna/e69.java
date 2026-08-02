package xsna;

import android.widget.EditText;
import com.vk.channels.api.Channel;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsViewState;
import java.util.List;
import xsna.mqq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class e69 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ e69(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                if (!booleanValue) {
                    com.vk.voip.ui.c.b.r1();
                }
                if (!booleanValue2) {
                    com.vk.voip.ui.c.b.B0();
                }
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((Channel) obj).t == ((Channel) obj2).t);
            case 2:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                List list = (List) obj2;
                if (booleanValue3 && list.isEmpty()) {
                    return CommunitySuggestionsViewState.LoadingState.LOADING;
                }
                if (booleanValue3) {
                    return CommunitySuggestionsViewState.LoadingState.FOOTER_LOADING;
                }
                return null;
            case 3:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(240392109, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.podcast.ComposableSingletons$CommunityProfileContentPodcastViewHolderKt.lambda$240392109.<anonymous> (CommunityProfileContentPodcastViewHolder.kt:112)");
                    }
                    rrv0.d(null, null, null, null, s200.c, aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                EditText editText = (EditText) obj;
                editText.setInputType(139265);
                editText.addTextChangedListener(new mqq.a());
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                cv70.e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                y6p0 y6p0Var = (y6p0) obj2;
                return e43.l(Float.valueOf(y6p0Var.a), Float.valueOf(y6p0Var.b()), Float.valueOf(((vak0) y6p0Var.b).getFloatValue()));
            case 7:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(-768305291);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-768305291, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:245)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.e1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar3.K(1728300259);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1728300259, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:207)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.s0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var2;
        }
    }

    public /* synthetic */ e69(int i) {
        this.b = 5;
    }
}
