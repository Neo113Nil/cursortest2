package xsna;

import com.vk.api.generated.market.dto.MarketGetCommunityReviewFriendsResponseDto;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vx7 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vx7(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Object ew60Var;
        switch (this.b) {
            case 0:
                ((Integer) obj).intValue();
                return Integer.valueOf(((BookingServicesScreenState.ServiceWrapper) obj2).b.m);
            case 1:
                ((Integer) obj2).getClass();
                v8c.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                e1l e1lVar = (e1l) obj2;
                Long g = e1lVar.g();
                Long f = e1lVar.f();
                Long valueOf = Long.valueOf(e1lVar.a());
                k9x k9xVar = e1lVar.a;
                return e43.l(g, f, valueOf, Integer.valueOf(k9xVar.b), Integer.valueOf(k9xVar.c), Integer.valueOf(e1lVar.e()));
            case 3:
                lu60 lu60Var = (lu60) obj2;
                NewsEntry newsEntry = (NewsEntry) j5g.a0((List) obj);
                if (newsEntry == null) {
                    return lu60Var;
                }
                List singletonList = Collections.singletonList(newsEntry);
                List<NewsEntry> a = lu60Var.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : a) {
                    if (!epx.f((NewsEntry) obj3, newsEntry)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList u0 = j5g.u0(arrayList, singletonList);
                if (lu60Var instanceof bl60) {
                    String b = lu60Var.b();
                    Boolean c = lu60Var.c();
                    bl60 bl60Var = (bl60) lu60Var;
                    ew60Var = new bl60(u0, b, c, bl60Var.d, bl60Var.e, bl60Var.f);
                } else {
                    if (!(lu60Var instanceof ew60)) {
                        return lu60Var;
                    }
                    String b2 = lu60Var.b();
                    Boolean c2 = lu60Var.c();
                    ew60 ew60Var2 = (ew60) lu60Var;
                    ew60Var = new ew60(u0, b2, c2, ew60Var2.d, ew60Var2.e);
                }
                return ew60Var;
            case 4:
                MarketGetCommunityReviewFriendsResponseDto marketGetCommunityReviewFriendsResponseDto = (MarketGetCommunityReviewFriendsResponseDto) obj;
                ((Long) obj2).longValue();
                return marketGetCommunityReviewFriendsResponseDto;
            case 5:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar.K(1669676893);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1669676893, intValue, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:147)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.k;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar2.K(-352978474);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-352978474, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:244)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.d1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var2;
        }
    }

    public /* synthetic */ vx7(int i) {
        this.b = 1;
    }
}
