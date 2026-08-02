package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketItemSkuReviewDto;
import com.vk.api.generated.market.dto.MarketReviewCommentDto;
import com.vk.api.generated.market.dto.MarketReviewCommentsDto;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.MarketItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: MarketItemReviewModel.kt */
/* loaded from: classes18.dex */
public final class o210 {
    public final iid a;

    /* compiled from: MarketItemReviewModel.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketItemSkuReviewDto.SourceDto.values().length];
            try {
                iArr[MarketItemSkuReviewDto.SourceDto.VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketItemSkuReviewDto.SourceDto.OZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o210(iid iidVar) {
        this.a = iidVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    public final n210 a(MarketItemSkuReviewDto marketItemSkuReviewDto) {
        ?? r6;
        Float f;
        boolean z;
        int i;
        boolean z2;
        MarketItemType marketItemType;
        List<MarketReviewCommentDto> e;
        MarketReviewCommentsDto g = marketItemSkuReviewDto.g();
        boolean z3 = g != null && g.c0();
        MarketReviewCommentsDto g2 = marketItemSkuReviewDto.g();
        List list = null;
        List<GroupsGroupFullDto> d = g2 != null ? g2.d() : null;
        MarketReviewCommentsDto g3 = marketItemSkuReviewDto.g();
        Map t = pn00.t(d370.o(d, g3 != null ? g3.f() : null));
        int id = marketItemSkuReviewDto.getId();
        long k = marketItemSkuReviewDto.k();
        int j = marketItemSkuReviewDto.j();
        big0 u = tci.u(marketItemSkuReviewDto.u());
        Float n = marketItemSkuReviewDto.n();
        String l = marketItemSkuReviewDto.l();
        String i2 = marketItemSkuReviewDto.i();
        String f2 = marketItemSkuReviewDto.f();
        List<List<BaseImageDto>> p = marketItemSkuReviewDto.p();
        if (p != null) {
            List<List<BaseImageDto>> list2 = p;
            r6 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                List<BaseImageDto> list3 = (List) it.next();
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                for (BaseImageDto baseImageDto : list3) {
                    arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                }
                r6.add(new y2u0(arrayList, null));
            }
        } else {
            r6 = 0;
        }
        if (r6 == 0) {
            r6 = EmptyList.b;
        }
        List list4 = r6;
        Boolean e2 = marketItemSkuReviewDto.e();
        if (e2 != null) {
            f = n;
            z = e2.booleanValue();
        } else {
            f = n;
            z = false;
        }
        Boolean d2 = marketItemSkuReviewDto.d();
        if (d2 != null) {
            i = id;
            z2 = d2.booleanValue();
        } else {
            i = id;
            z2 = false;
        }
        MarketReviewCommentsDto g4 = marketItemSkuReviewDto.g();
        int count = g4 != null ? g4.getCount() : 0;
        MarketReviewCommentsDto g5 = marketItemSkuReviewDto.g();
        if (g5 != null && (e = g5.e()) != null) {
            List<MarketReviewCommentDto> list5 = e;
            list = new ArrayList(c5g.u(list5, 10));
            for (MarketReviewCommentDto marketReviewCommentDto : list5) {
                ?? r24 = list;
                r24.add(this.a.e(marketReviewCommentDto, marketItemSkuReviewDto.getId(), (big0) t.get(new UserId(marketReviewCommentDto.e())), z3, false, false));
                list = r24;
            }
        }
        boolean z4 = z3;
        if (list == null) {
            list = EmptyList.b;
        }
        int i3 = a.$EnumSwitchMapping$0[marketItemSkuReviewDto.o().ordinal()];
        if (i3 == 1) {
            marketItemType = MarketItemType.VK;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            marketItemType = MarketItemType.OZON;
        }
        return new n210(i, k, j, u, f, l, i2, f2, false, list4, z, z2, false, list, z4, count, marketItemType);
    }
}
