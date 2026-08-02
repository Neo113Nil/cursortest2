package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class oju0 implements dez {
    public Object a;
    public final dhz b;
    public final zjr c = new zjr(new hwn(), EmptyList.a);
    public final LinkedList w = new LinkedList();
    public final ArrayList x = new ArrayList();
    public final ygz y;
    public boolean z;

    public oju0(a3m a3mVar, dhz dhzVar, List list) {
        this.a = a3mVar;
        this.b = dhzVar;
        ygz ygzVar = new ygz(new ate0(20, this));
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                ygzVar = new ygz(new ga1(17, this, (yg20) listIterator.previous(), ygzVar));
            }
        }
        this.y = ygzVar;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.c;
    }

    public final void b(peo peoVar) {
        boolean z = this.z;
        LinkedList linkedList = this.w;
        if (z) {
            linkedList.add(peoVar);
            return;
        }
        if (z) {
            ny61.g("Concurrent dispatching is not allowed");
            return;
        }
        this.z = true;
        this.y.a.invoke(peoVar);
        this.z = false;
        if (!linkedList.isEmpty()) {
            do {
                b((peo) linkedList.remove());
            } while (!linkedList.isEmpty());
        } else {
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                ((tls) it.next()).invoke(this.a);
            }
        }
    }
}
