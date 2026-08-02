package defpackage;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.GeoObjectCollection;
import com.yandex.mapkit.search.Response;
import com.yandex.mapkit.search.Session;
import com.yandex.runtime.Error;
import com.yandex.runtime.network.internal.NetworkErrorBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes7.dex */
public final class oup0 implements Session.SearchListener {
    public final String a;
    public final /* synthetic */ qup0 b;

    public oup0(qup0 qup0Var, String str) {
        this.b = qup0Var;
        this.a = str;
    }

    @Override // com.yandex.mapkit.search.Session.SearchListener
    public final void onSearchError(Error error) {
        qup0 qup0Var = this.b;
        HashMap hashMap = qup0Var.w;
        String str = this.a;
        Session session = (Session) hashMap.remove(str);
        if (session != null) {
            session.cancel();
        }
        boolean z = error instanceof NetworkErrorBinding;
        HashMap hashMap2 = qup0Var.y;
        if (z) {
            da20 da20Var = (da20) hashMap2.remove(str);
            if (da20Var != null) {
                da20Var.error("network", null, null);
                return;
            }
            return;
        }
        da20 da20Var2 = (da20) hashMap2.remove(str);
        if (da20Var2 != null) {
            da20Var2.error("unknown", null, null);
        }
    }

    @Override // com.yandex.mapkit.search.Session.SearchListener
    public final void onSearchResponse(Response response) {
        qup0 qup0Var = this.b;
        HashMap hashMap = qup0Var.w;
        String str = this.a;
        Session session = (Session) hashMap.remove(str);
        if (session != null) {
            session.cancel();
        }
        da20 da20Var = (da20) qup0Var.y.remove(str);
        if (da20Var != null) {
            List<GeoObjectCollection.Item> children = response.getCollection().getChildren();
            ArrayList arrayList = new ArrayList(tcc.n(children, 10));
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                GeoObject obj = ((GeoObjectCollection.Item) it.next()).getObj();
                arrayList.add(gw00.e(new Pair("obj", obj != null ? rsq0.d(qup0Var.c.a(ReferenceType.GEO_OBJECT, obj), obj) : null)));
            }
            da20Var.success(gw00.e(new Pair("collection", gw00.e(new Pair("children", arrayList)))));
        }
    }
}
