package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class m6o {
    public final LinkedHashMap a = new LinkedHashMap();

    public final l6o a(omk omkVar, zmk zmkVar) {
        Object obj;
        l6o l6oVar;
        synchronized (this.a) {
            try {
                LinkedHashMap linkedHashMap = this.a;
                String str = zmkVar.a;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(str, obj2);
                }
                List list = (List) obj2;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((l6o) obj).c == omkVar) {
                        break;
                    }
                }
                l6oVar = (l6o) obj;
                if (l6oVar == null) {
                    l6oVar = new l6o(omkVar, zmkVar);
                    list.add(l6oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        l6oVar.c();
        return l6oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l6o b(omk omkVar, zmk zmkVar) {
        l6o l6oVar;
        synchronized (this.a) {
            try {
                List list = (List) this.a.get(zmkVar.a);
                l6oVar = null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((l6o) next).c == omkVar) {
                            l6oVar = next;
                            break;
                        }
                    }
                    l6oVar = l6oVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l6oVar != null) {
            l6oVar.c();
        }
        return l6oVar;
    }
}
