package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class aj2 extends bj2 {
    public final g0c c;

    public aj2(g0c g0cVar, tls tlsVar) {
        super(tlsVar);
        this.c = g0cVar;
    }

    public static Object c(x1u x1uVar, g0c g0cVar) {
        Object obj;
        Iterator it = x1uVar.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(obj != null ? qoi0.a(obj.getClass()) : null, g0cVar)) {
                break;
            }
        }
        if (g0cVar.e(obj)) {
            return obj;
        }
        return null;
    }

    @Override // defpackage.bj2
    public final void a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((x1u) obj).c != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object c = c((x1u) it.next(), this.c);
            if (c != null) {
                arrayList2.add(c);
            }
        }
        this.b.addAll(a.N0(arrayList2));
    }

    @Override // defpackage.bj2
    public final boolean b(x1u x1uVar) {
        return (x1uVar.c == null || c(x1uVar, this.c) == null) ? false : true;
    }
}
