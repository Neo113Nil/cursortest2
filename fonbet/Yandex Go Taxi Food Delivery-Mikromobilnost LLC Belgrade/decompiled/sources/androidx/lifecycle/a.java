package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.ny61;
import defpackage.pey;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class a {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public a(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
            List list = (List) this.a.get(event);
            if (list == null) {
                list = new ArrayList();
                this.a.put(event, list);
            }
            list.add((b) entry.getKey());
        }
    }

    public static void a(List list, pey peyVar, Lifecycle.Event event, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = (b) list.get(size);
                Method method = bVar.b;
                try {
                    int i = bVar.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, peyVar);
                    } else if (i == 2) {
                        method.invoke(obj, peyVar, event);
                    }
                } catch (IllegalAccessException e) {
                    ny61.j(e);
                    return;
                } catch (InvocationTargetException e2) {
                    ny61.n("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
