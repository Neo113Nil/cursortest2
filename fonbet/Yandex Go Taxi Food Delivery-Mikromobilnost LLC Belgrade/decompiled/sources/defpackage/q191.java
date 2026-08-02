package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class q191 {
    public final Context a;
    public final jj71 b = new jj71();
    public final jm61 c = new jm61();

    public q191(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a(List list, Map map) {
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.a((String) it.next(), map));
        }
        this.c.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!jl40.l((String) next, "about:blank")) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            vv71 a = vv71.c.a(this.a);
            a.b.b(new yi71(a.a, str, new s581()));
        }
    }
}
