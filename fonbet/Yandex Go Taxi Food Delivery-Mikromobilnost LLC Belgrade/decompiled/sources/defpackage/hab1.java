package defpackage;

import android.net.Uri;
import android.view.View;
import com.ybsdk.deeplink.generated.BottomSheetAction;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public abstract class hab1 {
    public static Serializable a(y3x y3xVar) {
        switch (z3x.a[y3xVar.a.ordinal()]) {
            case 1:
                return Long.valueOf(((t6w) y3xVar).b);
            case 2:
                return Double.valueOf(((s5m) y3xVar).b);
            case 3:
                return ((ktu0) y3xVar).b;
            case 4:
                return Boolean.valueOf(((u96) y3xVar).b);
            case 5:
                return null;
            case 6:
                ArrayList arrayList = ((n53) y3xVar).b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(a((y3x) it.next()));
                }
                return arrayList2;
            case 7:
                Map map = ((wj00) y3xVar).b;
                LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), a((y3x) entry.getValue()));
                }
                return linkedHashMap;
            default:
                w511.b();
                return null;
        }
    }

    public static y3x b(Object obj) {
        if (obj == null) {
            return new cm60();
        }
        if (obj instanceof Integer) {
            return new t6w(((Number) obj).intValue(), true);
        }
        if (obj instanceof Long) {
            return new t6w(((Number) obj).longValue(), true);
        }
        if (obj instanceof Double) {
            return new s5m(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            return new ktu0((String) obj);
        }
        if (obj instanceof Boolean) {
            return new u96(((Boolean) obj).booleanValue());
        }
        if (obj instanceof List) {
            n53 n53Var = new n53(0);
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                n53Var.b.add(b(it.next()));
            }
            return n53Var;
        }
        if (!(obj instanceof Map)) {
            kbs.g(qv10.o("Unknown type of JSON value: ", obj));
            return null;
        }
        Set<Map.Entry> entrySet = ((Map) obj).entrySet();
        wj00 wj00Var = new wj00(0);
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            wj00Var.b.put((String) key, b(entry.getValue()));
        }
        return wj00Var;
    }

    public static BottomSheetAction c(Uri uri) {
        String queryParameter = uri.getQueryParameter("target");
        if (queryParameter == null) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("agreement_id");
        String queryParameter3 = uri.getQueryParameter("skeleton_id");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!j73.f0(new String[]{"target", "agreement_id", "skeleton_id"}).contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String queryParameter4 = uri.getQueryParameter((String) next);
            if (queryParameter4 == null) {
                queryParameter4 = "";
            }
            linkedHashMap.put(next, queryParameter4);
        }
        return new BottomSheetAction(queryParameter, queryParameter2, queryParameter3, linkedHashMap.isEmpty() ? null : linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((View) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        int i = 1;
        if (arrayList.size() > 1) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((View) it.next()).getId() != -1) {
                    }
                }
            }
            if (arrayList != null) {
                e5z0 e5z0Var = i5z0.a;
                e5z0Var.m("SetAccessibilityTraversal");
                e5z0Var.d("Accessibility traversal not set", new Object[0]);
                return;
            }
            ((View) arrayList.get(0)).setAccessibilityTraversalBefore(((View) arrayList.get(1)).getId());
            int f = scc.f(arrayList);
            while (i < f) {
                ((View) arrayList.get(i)).setAccessibilityTraversalAfter(((View) arrayList.get(i - 1)).getId());
                View view = (View) arrayList.get(i);
                i++;
                view.setAccessibilityTraversalBefore(((View) arrayList.get(i)).getId());
            }
            ((View) a.Z(arrayList)).setAccessibilityTraversalAfter(((View) arrayList.get(arrayList.size() - 2)).getId());
            return;
        }
        arrayList = null;
        if (arrayList != null) {
        }
    }
}
