package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.lb7;
import defpackage.oa3;
import defpackage.pa3;
import defpackage.ua2;
import defpackage.y5e;
import defpackage.zij;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c {
    public static final ua2 h = new ua2(1);
    public final b a;
    public final lb7 b;
    public final ua2 c;
    public final CopyOnWriteArrayList d;
    public List e;
    public List f;
    public int g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(RecyclerView.Adapter adapter, zij zijVar) {
        this(r0, new lb7(9, y5e.b, zijVar));
        b bVar = new b(adapter);
        synchronized (y5e.a) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(List list, Runnable runnable) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((pa3) it.next()).a(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f;
        b bVar = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            bVar.onRemoved(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            ((Executor) this.b.b).execute(new oa3(this, list2, list, i, runnable));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        bVar.onInserted(0, list.size());
        a(list3, runnable);
    }

    public c(b bVar, lb7 lb7Var) {
        this.d = new CopyOnWriteArrayList();
        this.f = Collections.EMPTY_LIST;
        this.a = bVar;
        this.b = lb7Var;
        this.c = h;
    }
}
