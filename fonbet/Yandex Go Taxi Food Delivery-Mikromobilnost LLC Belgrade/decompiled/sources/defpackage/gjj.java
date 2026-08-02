package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class gjj {
    public final zij a;
    public final ArrayList b;
    public final ArrayList c;

    public gjj(zij zijVar) {
        this.a = zijVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
    }

    public final void a(List list, RecyclerView.Adapter adapter) {
        b bVar = new b(adapter);
        List list2 = this.c;
        if (ym11.g(list2)) {
            list2 = Collections.unmodifiableList(new ArrayList(list2));
        }
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.addAll(list);
        kp50.f(new pce(this, list2), true).a(bVar);
    }
}
