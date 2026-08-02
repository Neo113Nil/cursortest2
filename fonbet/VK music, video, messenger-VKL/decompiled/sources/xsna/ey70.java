package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.g;

/* compiled from: OkHttpListenersFactory.kt */
/* loaded from: classes.dex */
public final class ey70 implements g.b {
    public final List<g.b> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ey70(List<? extends g.b> list) {
        this.a = list;
    }

    @Override // okhttp3.g.b
    public final okhttp3.g a(f8f0 f8f0Var) {
        List<g.b> list = this.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((g.b) it.next()).a(f8f0Var));
        }
        return new dy70(arrayList);
    }
}
