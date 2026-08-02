package xsna;

import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.tra0;

/* compiled from: Box.kt */
/* loaded from: classes11.dex */
public final class ma8 implements cp10 {
    public final dt1 a;
    public final boolean b;

    public ma8(dt1 dt1Var, boolean z) {
        this.a = dt1Var;
        this.b = z;
    }

    @Override // xsna.cp10
    public final dp10 b(final ep10 ep10Var, List<? extends zo10> list, long j) {
        int k;
        int j2;
        tra0 N;
        boolean isEmpty = list.isEmpty();
        jgp jgpVar = jgp.b;
        if (isEmpty) {
            return ep10Var.Q(o6j.k(j), o6j.j(j), jgpVar, new gv3(4));
        }
        long j3 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final zo10 zo10Var = list.get(0);
            ph50<dt1, cp10> ph50Var = ja8.a;
            Object c = zo10Var.c();
            ia8 ia8Var = c instanceof ia8 ? (ia8) c : null;
            if (ia8Var != null ? ia8Var.q : false) {
                k = o6j.k(j);
                j2 = o6j.j(j);
                int k2 = o6j.k(j);
                int j4 = o6j.j(j);
                if (!((j4 >= 0) & (k2 >= 0))) {
                    wzw.a("width and height must be >= 0");
                }
                N = zo10Var.N(s6j.h(k2, k2, j4, j4));
            } else {
                N = zo10Var.N(j3);
                k = Math.max(o6j.k(j), N.b);
                j2 = Math.max(o6j.j(j), N.c);
            }
            final int i = j2;
            final int i2 = k;
            final tra0 tra0Var = N;
            return ep10Var.Q(i2, i, jgpVar, new izs() { // from class: xsna.ka8
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    ja8.b((tra0.a) obj, tra0.this, zo10Var, ep10Var.getLayoutDirection(), i2, i, this.a);
                    return s3q0.a;
                }
            });
        }
        tra0[] tra0VarArr = new tra0[list.size()];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = o6j.k(j);
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = o6j.j(j);
        List<? extends zo10> list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            zo10 zo10Var2 = list.get(i3);
            ph50<dt1, cp10> ph50Var2 = ja8.a;
            Object c2 = zo10Var2.c();
            ia8 ia8Var2 = c2 instanceof ia8 ? (ia8) c2 : null;
            if (ia8Var2 != null ? ia8Var2.q : false) {
                z = true;
            } else {
                tra0 N2 = zo10Var2.N(j3);
                tra0VarArr[i3] = N2;
                ref$IntRef.element = Math.max(ref$IntRef.element, N2.b);
                ref$IntRef2.element = Math.max(ref$IntRef2.element, N2.c);
            }
        }
        if (z) {
            int i4 = ref$IntRef.element;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = ref$IntRef2.element;
            long a = s6j.a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                zo10 zo10Var3 = list.get(i7);
                ph50<dt1, cp10> ph50Var3 = ja8.a;
                Object c3 = zo10Var3.c();
                ia8 ia8Var3 = c3 instanceof ia8 ? (ia8) c3 : null;
                if (ia8Var3 != null ? ia8Var3.q : false) {
                    tra0VarArr[i7] = zo10Var3.N(a);
                }
            }
        }
        return ep10Var.Q(ref$IntRef.element, ref$IntRef2.element, jgpVar, new la8(tra0VarArr, list, ep10Var, ref$IntRef, ref$IntRef2, this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma8)) {
            return false;
        }
        ma8 ma8Var = (ma8) obj;
        return epx.f(this.a, ma8Var.a) && this.b == ma8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.a);
        sb.append(", propagateMinConstraints=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
