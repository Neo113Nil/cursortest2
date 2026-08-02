package xsna;

import android.content.Context;
import com.vk.dto.common.Image;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MarketFilterFields.kt */
/* loaded from: classes18.dex */
public final class ty00 {
    public static ArrayList a(Context context, List list, g22 g22Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MarketBridgeCategory marketBridgeCategory = (MarketBridgeCategory) it.next();
            int i = marketBridgeCategory.b;
            String str = marketBridgeCategory.c;
            Image image = marketBridgeCategory.d;
            ArrayList a = a(context, marketBridgeCategory.e, g22Var);
            if (!a.isEmpty()) {
                a.add(0, new wqd0(marketBridgeCategory.b, 101, context.getString(R.string.market_all_products_in_category)));
            }
            wqd0 wqd0Var = new wqd0(i, 100, str, image, a);
            g22Var.invoke(wqd0Var);
            arrayList.add(wqd0Var);
        }
        return arrayList;
    }
}
