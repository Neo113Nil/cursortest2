package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class bdo extends jdo {
    public final String d;
    public final ArrayList e;
    public jdo f;

    public bdo(String str) {
        super(str);
        this.d = str;
        this.e = rzo.c0(str);
    }

    @Override // defpackage.jdo
    public final Object a(mdo mdoVar) {
        if (this.f == null) {
            this.f = jl40.G(this.a, this.e);
        }
        jdo jdoVar = this.f;
        if (jdoVar == null) {
            jdoVar = null;
        }
        Object a = jdoVar.a(mdoVar);
        jdo jdoVar2 = this.f;
        d((jdoVar2 != null ? jdoVar2 : null).b);
        return a;
    }

    @Override // defpackage.jdo
    public final List b() {
        if (this.f == null) {
            this.f = jl40.G(this.a, this.e);
        }
        jdo jdoVar = this.f;
        if (jdoVar == null) {
            jdoVar = null;
        }
        return jdoVar.b();
    }

    @Override // defpackage.jdo
    public final List c() {
        jdo jdoVar = this.f;
        if (jdoVar != null) {
            return jdoVar.c();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof plz0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((plz0) it2.next()).a);
        }
        return arrayList2;
    }

    public final String toString() {
        return this.d;
    }
}
