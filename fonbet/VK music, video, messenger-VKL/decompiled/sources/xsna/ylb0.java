package xsna;

import java.util.List;

/* compiled from: PointerInputEventProcessor.kt */
/* loaded from: classes11.dex */
public final class ylb0 {
    public final x500<a> a = new x500<>(0, 1, null);

    /* compiled from: PointerInputEventProcessor.kt */
    public static final class a {
        public final long a;
        public final long b;
        public final boolean c;

        public a(long j, long j2, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }
    }

    public final rkx a(q5o q5oVar, p52 p52Var) {
        int i;
        long p;
        long j;
        boolean z;
        x500 x500Var = new x500(((List) q5oVar.b).size());
        List list = (List) q5oVar.b;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            zlb0 zlb0Var = (zlb0) list.get(i2);
            long j2 = zlb0Var.a;
            x500<a> x500Var2 = this.a;
            a aVar = x500Var2.get(j2);
            if (aVar == null) {
                i = i2;
                j = zlb0Var.b;
                p = zlb0Var.d;
                z = false;
            } else {
                long j3 = aVar.a;
                boolean z2 = aVar.c;
                i = i2;
                p = p52Var.p(aVar.b);
                j = j3;
                z = z2;
            }
            long j4 = zlb0Var.a;
            List list2 = list;
            int i3 = size;
            x500Var.put(j4, new xlb0(j4, zlb0Var.b, zlb0Var.d, zlb0Var.e, zlb0Var.f, j, p, z, zlb0Var.g, zlb0Var.i, zlb0Var.j, zlb0Var.k, zlb0Var.l, zlb0Var.m));
            boolean z3 = zlb0Var.e;
            if (z3) {
                x500Var2.put(j2, new a(zlb0Var.b, zlb0Var.c, z3));
            } else {
                x500Var2.remove(j2);
            }
            i2 = i + 1;
            list = list2;
            size = i3;
        }
        return new rkx(x500Var, q5oVar);
    }
}
