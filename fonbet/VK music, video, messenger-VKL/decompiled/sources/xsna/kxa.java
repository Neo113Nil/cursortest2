package xsna;

import androidx.compose.runtime.a;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewsResponseDto;
import com.vk.channels.api.Channel;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.user.UserProfile;
import kotlin.Pair;
import xsna.dcm;
import xsna.f6x0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kxa implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ kxa(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                Channel channel = (Channel) obj;
                Channel channel2 = (Channel) obj2;
                if (epx.f(channel, channel2) && epx.f(channel.P, channel2.P)) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 1:
                MarketGetCommunityReviewsResponseDto marketGetCommunityReviewsResponseDto = (MarketGetCommunityReviewsResponseDto) obj;
                ((Long) obj2).longValue();
                return marketGetCommunityReviewsResponseDto;
            case 2:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1851661893, intValue, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$AlbumsItemKt.lambda$-1851661893.<anonymous> (AlbumsItem.kt:177)");
                    }
                    q630 f = txj0.f(q630.a.a, 1.0f);
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new y40(21);
                        aVar.R(x);
                    }
                    lqy.a(f, null, null, null, null, null, false, null, (izs) x, aVar, 805306374, 510);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                dcm.a aVar2 = (dcm.a) obj2;
                return aVar2 != null ? dcm.a.a(aVar2, null, false, false, 7) : new dcm.a(20, 7);
            case 4:
                ((Integer) obj2).getClass();
                t8s.t(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                return Boolean.valueOf(obj.getClass() != obj2.getClass());
            case 6:
                return new Pair((UserProfile) obj, (UserProfile) obj2);
            case 7:
                return obj2;
            case 8:
                vkr0 vkr0Var = (vkr0) obj;
                vkr0 vkr0Var2 = (vkr0) obj2;
                return new kyo0(System.nanoTime(), new vkr0(vkr0Var.a - vkr0Var2.a, vkr0Var.b - vkr0Var2.b, vkr0Var.c - vkr0Var2.c));
            case 9:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(-783201765);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-783201765, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:193)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.e0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
            default:
                return new Pair((f6x0.b) obj, (Boolean) obj2);
        }
    }
}
