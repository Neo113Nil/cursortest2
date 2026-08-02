package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.a;

/* loaded from: classes9.dex */
public final class lsi {
    public final jsi a;
    public final ArrayList b = new ArrayList();
    public final i3y c = a.a(new sbc(10, this));

    public lsi(jsi jsiVar) {
        this.a = jsiVar;
    }

    public final void a(isi isiVar) {
        Object obj;
        tls v = ngd0.v(isiVar);
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Boolean) v.invoke(obj)).booleanValue()) {
                    break;
                }
            }
        }
        isi isiVar2 = (isi) obj;
        if (isiVar2 != null) {
            ycc.w(arrayList, ngd0.v(isiVar), true);
        }
        ngd0.l(c(), isiVar, isiVar2 != null ? Long.valueOf(isiVar2.getTimestamp()) : null);
        this.a.set(c());
    }

    public final ArrayList b() {
        ArrayList arrayList = this.b;
        ngd0.k(arrayList);
        if (ngd0.k(c())) {
            this.a.set(c());
        }
        return kotlin.collections.a.m0(c(), arrayList);
    }

    public final ArrayList c() {
        return (ArrayList) this.c.getValue();
    }
}
