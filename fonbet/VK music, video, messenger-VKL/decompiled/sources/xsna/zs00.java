package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketUserReviewsCommunitiesReviewDto;
import com.vk.api.generated.market.dto.MarketUserReviewsItemsReviewDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.allreviews.domain.model.ItemStatus;
import com.vk.ecomm.reviews.impl.allreviews.domain.model.ReviewStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MarketAllReviewsResponseMapper.kt */
/* loaded from: classes18.dex */
public final class zs00 {
    public static List a(List list) {
        ReviewStatus reviewStatus;
        if (list == null) {
            return EmptyList.b;
        }
        List<MarketUserReviewsCommunitiesReviewDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (MarketUserReviewsCommunitiesReviewDto marketUserReviewsCommunitiesReviewDto : list2) {
            int id = marketUserReviewsCommunitiesReviewDto.getId();
            int g = marketUserReviewsCommunitiesReviewDto.g();
            String l = marketUserReviewsCommunitiesReviewDto.l();
            ReviewStatus.a aVar = ReviewStatus.Companion;
            int n = marketUserReviewsCommunitiesReviewDto.n();
            aVar.getClass();
            ReviewStatus[] values = ReviewStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    reviewStatus = null;
                    break;
                }
                reviewStatus = values[i];
                if (reviewStatus.h() == n) {
                    break;
                }
                i++;
            }
            if (reviewStatus == null) {
                reviewStatus = ReviewStatus.DISABLED;
            }
            ReviewStatus reviewStatus2 = reviewStatus;
            String o = marketUserReviewsCommunitiesReviewDto.o();
            int k = marketUserReviewsCommunitiesReviewDto.k();
            int i2 = marketUserReviewsCommunitiesReviewDto.i();
            UsersUserDto u = marketUserReviewsCommunitiesReviewDto.u();
            String f = marketUserReviewsCommunitiesReviewDto.f();
            BaseImageDto j = marketUserReviewsCommunitiesReviewDto.j();
            List<List<BaseImageDto>> p = marketUserReviewsCommunitiesReviewDto.p();
            Boolean e = marketUserReviewsCommunitiesReviewDto.e();
            boolean booleanValue = e != null ? e.booleanValue() : false;
            Boolean d = marketUserReviewsCommunitiesReviewDto.d();
            arrayList.add(new cf10(id, g, l, reviewStatus2, o, k, i2, u, f, j, p, false, booleanValue, d != null ? d.booleanValue() : false, false));
        }
        return arrayList;
    }

    public static List b(List list) {
        ReviewStatus reviewStatus;
        Iterator it;
        MarketUserReviewsItemsReviewDto marketUserReviewsItemsReviewDto;
        ItemStatus itemStatus;
        if (list == null) {
            return EmptyList.b;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            MarketUserReviewsItemsReviewDto marketUserReviewsItemsReviewDto2 = (MarketUserReviewsItemsReviewDto) it2.next();
            String n = marketUserReviewsItemsReviewDto2.n();
            ReviewStatus.a aVar = ReviewStatus.Companion;
            int u = marketUserReviewsItemsReviewDto2.u();
            aVar.getClass();
            ReviewStatus[] values = ReviewStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    reviewStatus = null;
                    break;
                }
                reviewStatus = values[i];
                if (reviewStatus.h() == u) {
                    break;
                }
                i++;
            }
            if (reviewStatus == null) {
                reviewStatus = ReviewStatus.DISABLED;
            }
            ReviewStatus reviewStatus2 = reviewStatus;
            String B = marketUserReviewsItemsReviewDto2.B();
            StringBuilder sb = new StringBuilder();
            sb.append(marketUserReviewsItemsReviewDto2.getId());
            sb.append(marketUserReviewsItemsReviewDto2.k());
            String sb2 = sb.toString();
            int id = marketUserReviewsItemsReviewDto2.getId();
            long k = marketUserReviewsItemsReviewDto2.k();
            UserId q = marketUserReviewsItemsReviewDto2.q();
            int p = marketUserReviewsItemsReviewDto2.p();
            int i2 = marketUserReviewsItemsReviewDto2.i();
            UsersUserDto D = marketUserReviewsItemsReviewDto2.D();
            BaseImageDto j = marketUserReviewsItemsReviewDto2.j();
            String o = marketUserReviewsItemsReviewDto2.o();
            String g = marketUserReviewsItemsReviewDto2.g();
            Object obj = null;
            String f = marketUserReviewsItemsReviewDto2.f();
            List<List<BaseImageDto>> C = marketUserReviewsItemsReviewDto2.C();
            ItemStatus.a aVar2 = ItemStatus.Companion;
            Integer l = marketUserReviewsItemsReviewDto2.l();
            aVar2.getClass();
            if (l == null) {
                itemStatus = ItemStatus.DELETED;
                it = it2;
                marketUserReviewsItemsReviewDto = marketUserReviewsItemsReviewDto2;
            } else {
                Iterator<E> it3 = ItemStatus.h().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        it = it2;
                        marketUserReviewsItemsReviewDto = marketUserReviewsItemsReviewDto2;
                        break;
                    }
                    Object next = it3.next();
                    it = it2;
                    marketUserReviewsItemsReviewDto = marketUserReviewsItemsReviewDto2;
                    if (((ItemStatus) next).i() == l.intValue()) {
                        obj = next;
                        break;
                    }
                    it2 = it;
                    marketUserReviewsItemsReviewDto2 = marketUserReviewsItemsReviewDto;
                }
                itemStatus = (ItemStatus) obj;
                if (itemStatus == null) {
                    itemStatus = ItemStatus.DELETED;
                }
            }
            Boolean e = marketUserReviewsItemsReviewDto.e();
            boolean booleanValue = e != null ? e.booleanValue() : false;
            Boolean d = marketUserReviewsItemsReviewDto.d();
            arrayList.add(new df10(n, reviewStatus2, B, sb2, id, k, q, p, i2, D, j, o, g, f, C, itemStatus, false, booleanValue, d != null ? d.booleanValue() : false, false));
            it2 = it;
        }
        return arrayList;
    }
}
