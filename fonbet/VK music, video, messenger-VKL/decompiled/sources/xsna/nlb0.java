package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.nlb0.a;

/* compiled from: PointQuadTree.java */
/* loaded from: classes13.dex */
public final class nlb0<T extends a> {
    public final z98 a;
    public final int b;
    public LinkedHashSet c;
    public ArrayList d;

    /* compiled from: PointQuadTree.java */
    public interface a {
        dlb0 a();
    }

    public nlb0(int i, double d, double d2, double d3, double d4) {
        this(new z98(d, d2, d3, d4), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(double d, double d2, T t) {
        int i;
        nlb0<T> nlb0Var = this;
        ArrayList arrayList = nlb0Var.d;
        z98 z98Var = nlb0Var.a;
        if (arrayList != null) {
            double d3 = z98Var.f;
            double d4 = z98Var.e;
            if (d2 < d3) {
                if (d < d4) {
                    ((nlb0) arrayList.get(0)).a(d, d2, t);
                    return;
                } else {
                    ((nlb0) arrayList.get(1)).a(d, d2, t);
                    return;
                }
            }
            if (d < d4) {
                ((nlb0) arrayList.get(2)).a(d, d2, t);
                return;
            } else {
                ((nlb0) arrayList.get(3)).a(d, d2, t);
                return;
            }
        }
        if (nlb0Var.c == null) {
            nlb0Var.c = new LinkedHashSet();
        }
        nlb0Var.c.add(t);
        if (nlb0Var.c.size() <= 50 || (i = nlb0Var.b) >= 40) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(4);
        nlb0Var.d = arrayList2;
        int i2 = i + 1;
        arrayList2.add(new nlb0(i2, z98Var.a, z98Var.e, z98Var.b, z98Var.f));
        nlb0Var.d.add(new nlb0(i2, z98Var.e, z98Var.c, z98Var.b, z98Var.f));
        nlb0Var.d.add(new nlb0(i2, z98Var.a, z98Var.e, z98Var.f, z98Var.d));
        nlb0Var.d.add(new nlb0(i2, z98Var.e, z98Var.c, z98Var.f, z98Var.d));
        LinkedHashSet<a> linkedHashSet = nlb0Var.c;
        nlb0Var.c = null;
        nlb0 nlb0Var2 = nlb0Var;
        for (a aVar : linkedHashSet) {
            nlb0Var2.a(aVar.a().a, aVar.a().b, aVar);
            nlb0Var2 = this;
        }
    }

    public final void b(z98 z98Var, ArrayList arrayList) {
        z98 z98Var2 = this.a;
        z98Var2.getClass();
        double d = z98Var.a;
        double d2 = z98Var.c;
        double d3 = z98Var.b;
        double d4 = z98Var.d;
        double d5 = z98Var2.c;
        if (d < d5) {
            double d6 = z98Var2.a;
            if (d6 < d2) {
                double d7 = z98Var2.d;
                if (d3 < d7) {
                    double d8 = z98Var2.b;
                    if (d8 < d4) {
                        ArrayList arrayList2 = this.d;
                        if (arrayList2 != null) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                ((nlb0) it.next()).b(z98Var, arrayList);
                            }
                            return;
                        }
                        LinkedHashSet<a> linkedHashSet = this.c;
                        if (linkedHashSet != null) {
                            if (d6 >= d && d5 <= d2 && d8 >= d3 && d7 <= d4) {
                                arrayList.addAll(linkedHashSet);
                                return;
                            }
                            for (a aVar : linkedHashSet) {
                                dlb0 a2 = aVar.a();
                                if (z98Var.a(a2.a, a2.b)) {
                                    arrayList.add(aVar);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public nlb0(z98 z98Var, int i) {
        this.d = null;
        this.a = z98Var;
        this.b = i;
    }
}
