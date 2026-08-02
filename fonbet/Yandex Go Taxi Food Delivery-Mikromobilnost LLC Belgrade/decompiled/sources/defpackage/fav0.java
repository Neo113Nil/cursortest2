package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.cashback.impl.dto.responses.CashbackSelectorCategoryResponse;
import com.ybsdk.feature.cashback.impl.dto.responses.SuggestedCashbackPromoResponse;
import com.ybsdk.feature.cashback.impl.dto.responses.SuggestedCategoriesResponse;
import com.ybsdk.feature.cashback.impl.entities.SuggestedCashbackPromoEntity;
import com.ybsdk.feature.cashback.impl.entities.types.PromoID;
import com.ybsdk.feature.cashback.impl.entities.types.PromoType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class fav0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final SuggestedCashbackPromoEntity a(SuggestedCashbackPromoResponse suggestedCashbackPromoResponse) {
        List<CashbackSelectorCategoryResponse> categories;
        Object failure;
        String m408constructorimpl = PromoID.m408constructorimpl(suggestedCashbackPromoResponse.getPromoId());
        String m418constructorimpl = PromoType.m418constructorimpl(suggestedCashbackPromoResponse.getPromoType());
        Text.Constant i = g8e.i(Text.Companion, suggestedCashbackPromoResponse.getTitle());
        Text.Constant constant = new Text.Constant(suggestedCashbackPromoResponse.getSubtitle());
        SuggestedCategoriesResponse selectorCategoriesInfo = suggestedCashbackPromoResponse.getSelectorCategoriesInfo();
        int maxCategories = selectorCategoriesInfo != null ? selectorCategoriesInfo.getMaxCategories() : 0;
        SuggestedCategoriesResponse selectorCategoriesInfo2 = suggestedCashbackPromoResponse.getSelectorCategoriesInfo();
        List list = 0;
        list = 0;
        if (selectorCategoriesInfo2 != null && (categories = selectorCategoriesInfo2.getCategories()) != null) {
            List<CashbackSelectorCategoryResponse> list2 = categories;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                try {
                    failure = f49.a((CashbackSelectorCategoryResponse) it.next());
                } catch (Exception e) {
                    trp0 trp0Var = trp0.a;
                    trp0.e(new jqp0(e, "Exception during mapCatching() in CommonExt", null, null));
                    failure = new Result.Failure(e);
                }
                arrayList.add(new Result(failure));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!(((Result) next).getValue() instanceof Result.Failure)) {
                    arrayList2.add(next);
                }
            }
            list = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object value = ((Result) it3.next()).getValue();
                b.b(value);
                list.add(value);
            }
        }
        if (list == 0) {
            list = EmptyList.a;
        }
        return new SuggestedCashbackPromoEntity(m408constructorimpl, m418constructorimpl, i, constant, maxCategories, list, null);
    }
}
