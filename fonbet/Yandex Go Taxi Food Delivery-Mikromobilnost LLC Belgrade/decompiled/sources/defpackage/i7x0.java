package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes9.dex */
public class i7x0 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public final void a(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.a.addAll(list);
        d();
    }

    public final void b(String str) {
        this.a.add(str);
        d();
    }

    public final ArrayList c() {
        return new ArrayList(this.a);
    }

    public final void d() {
        ArrayList c = c();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((wxl) it.next()).a(c);
        }
    }
}
