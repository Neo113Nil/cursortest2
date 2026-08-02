package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryTreeDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryTreeViewDto;
import com.vk.dto.common.Image;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MarketCategoriesSource.kt */
/* loaded from: classes18.dex */
public final class uv00 {
    public final yd10 a;
    public final String b;
    public final io.reactivex.rxjava3.subjects.d<MarketBridgeCategory> c = io.reactivex.rxjava3.subjects.d.N0();

    /* compiled from: MarketCategoriesSource.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketMarketCategoryTreeViewDto.TypeDto.values().length];
            try {
                iArr[MarketMarketCategoryTreeViewDto.TypeDto.TAB_ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public uv00(yd10 yd10Var, String str) {
        this.a = yd10Var;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static MarketBridgeCategory a(MarketMarketCategoryTreeDto marketMarketCategoryTreeDto) {
        List list;
        Boolean d;
        int id = marketMarketCategoryTreeDto.getId();
        String f = marketMarketCategoryTreeDto.f();
        List<BaseImageDto> e = marketMarketCategoryTreeDto.e();
        Image f2 = e != null ? b210.f(e) : null;
        MarketMarketCategoryTreeViewDto g = marketMarketCategoryTreeDto.g();
        MarketMarketCategoryTreeViewDto.TypeDto e2 = g != null ? g.e() : null;
        MarketBridgeCategory.CategoryView.Type type = (e2 == null ? -1 : a.$EnumSwitchMapping$0[e2.ordinal()]) == 1 ? MarketBridgeCategory.CategoryView.Type.TAB_ROOT : MarketBridgeCategory.CategoryView.Type.SIMPLE;
        MarketMarketCategoryTreeViewDto g2 = marketMarketCategoryTreeDto.g();
        MarketBridgeCategory.CategoryView categoryView = new MarketBridgeCategory.CategoryView(type, Boolean.valueOf((g2 == null || (d = g2.d()) == null) ? false : d.booleanValue()));
        List<MarketMarketCategoryTreeDto> d2 = marketMarketCategoryTreeDto.d();
        if (d2 != null) {
            List<MarketMarketCategoryTreeDto> list2 = d2;
            list = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(a((MarketMarketCategoryTreeDto) it.next()));
            }
        } else {
            list = EmptyList.b;
        }
        return new MarketBridgeCategory(id, f, f2, list, categoryView);
    }
}
