package xsna;

import com.vk.dto.common.Price;
import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelSubtype;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: ProductCardPageDataMapperExt.kt */
/* loaded from: classes18.dex */
public final class vld0 {
    public static final frd0 a(Price price, LinkedHashMap<String, lpd0> linkedHashMap) {
        Collection<lpd0> values;
        Object obj;
        String str = price.i;
        String str2 = price.e;
        String str3 = price.f;
        int i = price.g;
        String str4 = price.j;
        String str5 = null;
        if (linkedHashMap != null && (values = linkedHashMap.values()) != null) {
            Iterator<T> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((lpd0) obj).b == ProductLabelSubtype.CART_PRICE) {
                    break;
                }
            }
            lpd0 lpd0Var = (lpd0) obj;
            if (lpd0Var != null) {
                str5 = lpd0Var.d;
            }
        }
        return new frd0(i, str, str2, str3, str5, str4);
    }
}
