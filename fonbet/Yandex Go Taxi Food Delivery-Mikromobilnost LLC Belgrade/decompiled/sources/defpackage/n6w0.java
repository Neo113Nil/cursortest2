package defpackage;

import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class n6w0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final n0 b = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
    public final ArrayList c = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        return arrayList;
    }

    public final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) this.a.get((SuperAppRecenterPointRepository$Type) it.next());
            if (list2 != null) {
                arrayList.addAll(list2);
            }
        }
        return arrayList;
    }

    public final void c(SuperAppRecenterPointRepository$Type superAppRecenterPointRepository$Type, List list) {
        this.a.put(superAppRecenterPointRepository$Type, list);
        this.b.g(superAppRecenterPointRepository$Type);
    }

    public final void d(List list) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
    }
}
