package xsna;

import com.vk.api.generated.donut.dto.DonutGetSubscriptionsResponseDto;
import com.vk.api.generated.orders.dto.OrdersGetAllUserSubscriptionsResponseDto;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.search.integration.followers.api.FollowersSearchState;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatInfo;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class whd implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ whd(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj).intValue();
                return Long.valueOf(((ub5) obj2).a);
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1074658791, intValue, -1, "com.vk.profile.core.tabs.ui.pager.ComposableSingletons$CommunityProfileContentPagerViewHolderKt.lambda$1074658791.<anonymous> (CommunityProfileContentPagerViewHolder.kt:350)");
                    }
                    tth.a(null, sdi.b, aVar, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj).intValue();
                return Long.valueOf(((h8t) obj2).d.a.b);
            case 3:
                ((Integer) obj).intValue();
                return Integer.valueOf(((qa10) obj2).a.a);
            case 4:
                ((jid0) ((hnd0) obj).a.getAdapter()).A0(hld0.a((ikd0) obj2, 22));
                return s3q0.a;
            case 5:
                return !((Boolean) obj2).booleanValue() ? FollowersSearchState.ACTIVE_QUERY : ((Boolean) obj).booleanValue() ? FollowersSearchState.ACTIVE_EMPTY : FollowersSearchState.INACTIVE;
            case 6:
                return new Pair((DonutGetSubscriptionsResponseDto) obj, (OrdersGetAllUserSubscriptionsResponseDto) obj2);
            case 7:
                VideoPlayerState videoPlayerState = (VideoPlayerState) obj2;
                VideoPlayerStatInfo videoPlayerStatInfo = ((VideoPlayerState) obj).d;
                String str = videoPlayerStatInfo != null ? videoPlayerStatInfo.b : null;
                VideoPlayerStatInfo videoPlayerStatInfo2 = videoPlayerState.d;
                return Boolean.valueOf(epx.f(str, videoPlayerStatInfo2 != null ? videoPlayerStatInfo2.b : null));
            case 8:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(-753890082);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-753890082, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:223)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.I0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar3.K(-773431204);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-773431204, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:203)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.o0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var2;
        }
    }
}
