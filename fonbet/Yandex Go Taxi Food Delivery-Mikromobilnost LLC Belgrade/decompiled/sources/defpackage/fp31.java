package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class fp31 {
    public zv5 a = new zv5(null, zmk.b);
    public final ArrayList b = new ArrayList();

    public final void a(omk omkVar, zmk zmkVar) {
        if (jl40.l(zmkVar, this.a.a) && this.a.b == omkVar) {
            return;
        }
        this.a = new zv5(omkVar, zmkVar);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(this.a);
        }
    }
}
