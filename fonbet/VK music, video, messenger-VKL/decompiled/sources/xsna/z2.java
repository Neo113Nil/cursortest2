package xsna;

import android.view.View;
import com.vk.api.generated.calls.dto.CallsStartResponseDto;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import java.util.WeakHashMap;
import kotlin.Pair;
import xsna.yqx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class z2 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ z2(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                a3.c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 2:
                sd80 sd80Var = (sd80) obj;
                ((Integer) obj2).intValue();
                return Boolean.valueOf(sd80Var != null);
            case 3:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1088711444, intValue, -1, "com.vk.profile.core.tabs.ui.pager.ComposableSingletons$CommunityProfileContentPagerViewHolderKt.lambda$-1088711444.<anonymous> (CommunityProfileContentPagerViewHolder.kt:349)");
                    }
                    rrv0.d(null, null, null, null, sdi.c, aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                aVar2.K(-288344386);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-288344386, intValue2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.FiltersBottomSheet.<anonymous> (FiltersBottomSheet.kt:65)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1596175702, 6, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:176)");
                }
                WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
                te2 te2Var = yqx0.a.c(aVar2).e;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return te2Var;
            case 5:
                ((Integer) obj2).getClass();
                t8s.m(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                zbb0.c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 7:
                ((Integer) obj).intValue();
                return ((ta10) obj2).a.a;
            case 8:
                ((jid0) ((hnd0) obj).a.getAdapter()).A0(hld0.a((lkd0) obj2, 23));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                kxe0.b(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 10:
                return Integer.valueOf(((b6s) obj2).b);
            case 11:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(-1169216899);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1169216899, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:224)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.J0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
            case 12:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar4.K(-1188758021);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1188758021, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:204)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.p0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var2;
            case 13:
                return new VoipActionsFeatureState.a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            default:
                return new Pair((ProfilesInfo) obj, (CallsStartResponseDto) obj2);
        }
    }
}
