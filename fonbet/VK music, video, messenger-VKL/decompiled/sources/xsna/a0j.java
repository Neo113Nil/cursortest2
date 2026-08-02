package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.zzi;

/* compiled from: ConfigureItemListReducer.kt */
/* loaded from: classes18.dex */
public final class a0j extends dm50<e0j, zzi, d0j> {
    public a0j() {
        super(new d0j(0));
    }

    @Override // xsna.dm50
    public final d0j c(d0j d0jVar, zzi zziVar) {
        d0j d0jVar2 = d0jVar;
        zzi zziVar2 = zziVar;
        if (!(zziVar2 instanceof zzi.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new d0j(d0jVar2.b, ((zzi.a) zziVar2).b);
    }

    @Override // xsna.dm50
    public final e0j d() {
        return new e0j(e(new fm0(this, 23)), e(new qt0(20)));
    }

    @Override // xsna.dm50
    public final void h(d0j d0jVar, e0j e0jVar) {
        d0j d0jVar2 = d0jVar;
        e0j e0jVar2 = e0jVar;
        List<yzi> list = d0jVar2.c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((yzi) it.next()).b) {
                    f(e0jVar2.a, d0jVar2);
                    return;
                }
            }
        }
        f(e0jVar2.b, d0jVar2);
    }
}
