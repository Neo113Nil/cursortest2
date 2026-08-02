package xsna;

import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.generated.VkTypographyToken;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class u8c implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ u8c(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                v8c.d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(280450281, intValue, -1, "com.vk.ecomm.reviews.impl.communities.reviews.presentation.ComposableSingletons$CommunityReviewsFragmentKt.lambda$280450281.<anonymous> (CommunityReviewsFragment.kt:597)");
                    }
                    zfr0.d(SpinnerState.Loading, null, null, null, null, 0L, 0L, null, null, aVar, 6, 510);
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
                        androidx.compose.runtime.b.f(1922341163, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.ComposableSingletons$KidsPodcastBigPlayerControlsKt.lambda$1922341163.<anonymous> (KidsPodcastBigPlayerControls.kt:39)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                List list = (List) obj;
                list.addAll((List) obj2);
                return list;
            case 4:
                return Integer.valueOf(((u5s) obj2).a);
            case 5:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(-1730887490);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1730887490, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:247)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.g1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                if (!booleanValue) {
                    com.vk.voip.ui.c.b.r1();
                }
                if (!booleanValue2) {
                    com.vk.voip.ui.c.b.B0();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ u8c(int i) {
        this.b = 0;
    }
}
