package defpackage;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.SpannableString;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.SuggestItem;
import com.yandex.mapkit.search.SuggestResponse;
import com.yandex.mapkit.search.SuggestSession;
import com.yandex.runtime.Error;
import com.yandex.runtime.network.internal.NetworkErrorBinding;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class pup0 implements SuggestSession.SuggestListener {
    public final String a;
    public final /* synthetic */ qup0 b;

    public pup0(qup0 qup0Var, String str) {
        this.b = qup0Var;
        this.a = str;
    }

    @Override // com.yandex.mapkit.search.SuggestSession.SuggestListener
    public final void onError(Error error) {
        boolean z = error instanceof NetworkErrorBinding;
        HashMap hashMap = this.b.y;
        String str = this.a;
        if (z) {
            da20 da20Var = (da20) hashMap.remove(str);
            if (da20Var != null) {
                da20Var.error("network", null, null);
                return;
            }
            return;
        }
        da20 da20Var2 = (da20) hashMap.remove(str);
        if (da20Var2 != null) {
            da20Var2.error("unknown", null, null);
        }
    }

    @Override // com.yandex.mapkit.search.SuggestSession.SuggestListener
    public final void onResponse(SuggestResponse suggestResponse) {
        Map map;
        Object obj;
        Iterator it;
        Map map2;
        da20 da20Var = (da20) this.b.y.remove(this.a);
        if (da20Var != null) {
            List<SuggestItem> items = suggestResponse.getItems();
            ArrayList arrayList = new ArrayList(tcc.n(items, 10));
            Iterator it2 = items.iterator();
            while (it2.hasNext()) {
                SuggestItem suggestItem = (SuggestItem) it2.next();
                Pair pair = new Pair("title", ssq0.b(suggestItem.getTitle()));
                SpannableString subtitle = suggestItem.getSubtitle();
                if (subtitle != null) {
                    map = ssq0.b(subtitle);
                    obj = null;
                } else {
                    map = null;
                    obj = null;
                }
                Pair pair2 = new Pair("subtitle", map);
                Pair pair3 = new Pair("tags", suggestItem.getTags());
                Pair pair4 = new Pair("searchText", suggestItem.getSearchText());
                Pair pair5 = new Pair("displayText", suggestItem.getDisplayText());
                Pair pair6 = new Pair(LaunchBrowserActivity.KEY_URI, suggestItem.getUri());
                Pair pair7 = new Pair("isOffline", Boolean.valueOf(suggestItem.getIsOffline()));
                Pair pair8 = new Pair("isWordItem", Boolean.valueOf(suggestItem.getIsWordItem()));
                Pair pair9 = new Pair("properties", ssq0.a(suggestItem.getProperties()));
                LocalizedValue distance = suggestItem.getDistance();
                if (distance != null) {
                    it = it2;
                    map2 = b.i(new Pair("value", Double.valueOf(distance.getValue())), new Pair("text", distance.getText()));
                } else {
                    it = it2;
                    map2 = null;
                }
                Pair pair10 = new Pair("distance", map2);
                Point center = suggestItem.getCenter();
                arrayList.add(b.i(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair("center", center != null ? b.i(new Pair("lat", Double.valueOf(center.getLatitude())), new Pair("lon", Double.valueOf(center.getLongitude()))) : null)));
                it2 = it;
            }
            da20Var.success(gw00.e(new Pair("items", arrayList)));
        }
    }
}
