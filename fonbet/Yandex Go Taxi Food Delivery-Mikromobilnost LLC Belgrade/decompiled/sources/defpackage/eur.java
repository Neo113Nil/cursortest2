package defpackage;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class eur {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public long d;

    public eur(fur furVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.c = arrayList3;
        this.d = 5000L;
        arrayList.addAll(furVar.a);
        arrayList2.addAll(furVar.b);
        arrayList3.addAll(furVar.c);
        this.d = furVar.d;
    }

    public final void a(s920 s920Var, int i) {
        d6z.m("Invalid metering mode " + i, i >= 1 && i <= 7);
        if ((i & 1) != 0) {
            this.a.add(s920Var);
        }
        if ((i & 2) != 0) {
            this.b.add(s920Var);
        }
        if ((i & 4) != 0) {
            this.c.add(s920Var);
        }
    }

    public final void b(int i) {
        if ((i & 1) != 0) {
            this.a.clear();
        }
        if ((i & 2) != 0) {
            this.b.clear();
        }
        if ((i & 4) != 0) {
            this.c.clear();
        }
    }

    public eur(s920 s920Var, int i) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = 5000L;
        a(s920Var, i);
    }
}
