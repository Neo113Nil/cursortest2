package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class x1c extends vcr<y1c<?>> {
    public final String e;
    public y1c<?> f;
    public final y1c<?> g;
    public List<? extends y1c<?>> h;

    public x1c(String str, y1c<?> y1cVar, y1c<?> y1cVar2, List<? extends y1c<?>> list) {
        super(7, null, null);
        this.e = str;
        this.f = y1cVar;
        this.g = y1cVar2;
        this.h = list;
    }

    @Override // xsna.vcr
    public final void a() {
        y1c<?> y1cVar = this.g;
        this.f = y1cVar;
        List<? extends y1c<?>> list = this.h;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            y1c y1cVar2 = (y1c) it.next();
            boolean f = epx.f(y1cVar2, y1cVar);
            String str = y1cVar2.a;
            T t = y1cVar2.b;
            y1cVar2.getClass();
            arrayList.add(new y1c(t, str, f));
        }
        this.h = arrayList;
    }

    @Override // xsna.vcr
    public final y1c<?> b() {
        return this.g;
    }

    @Override // xsna.vcr
    public final y1c<?> d() {
        return this.f;
    }

    @Override // xsna.vcr
    public final void e(y1c<?> y1cVar) {
        this.f = null;
    }
}
