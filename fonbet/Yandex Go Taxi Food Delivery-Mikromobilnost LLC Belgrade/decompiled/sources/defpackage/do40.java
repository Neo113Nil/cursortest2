package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class do40 {
    public final hz40 a;

    public /* synthetic */ do40(hz40 hz40Var) {
        this.a = hz40Var;
    }

    public static final void a(hz40 hz40Var, Object obj, Object obj2) {
        int j = hz40Var.j(obj);
        boolean z = j < 0;
        Object obj3 = z ? null : hz40Var.c[j];
        if (obj3 != null) {
            if (obj3 instanceof xy40) {
                xy40 xy40Var = (xy40) obj3;
                xy40Var.g(obj2);
                obj2 = xy40Var;
            } else {
                Object[] objArr = np60.a;
                xy40 xy40Var2 = new xy40(2);
                xy40Var2.g(obj3);
                xy40Var2.g(obj2);
                obj2 = xy40Var2;
            }
        }
        if (!z) {
            hz40Var.c[j] = obj2;
            return;
        }
        int i = ~j;
        hz40Var.b[i] = obj;
        hz40Var.c[i] = obj2;
    }

    public static hz40 b() {
        return new hz40((Object) null);
    }

    public static final Object c(hz40 hz40Var, ib30 ib30Var) {
        Object d = hz40Var.d(ib30Var);
        if (d == null) {
            return null;
        }
        if (!(d instanceof xy40)) {
            hz40Var.m(ib30Var);
            return d;
        }
        xy40 xy40Var = (xy40) d;
        Object b = mia1.b(xy40Var);
        if (xy40Var.d()) {
            hz40Var.m(ib30Var);
        }
        if (xy40Var.b == 1) {
            hz40Var.o(ib30Var, xy40Var.a());
        }
        return b;
    }

    public static final void d(hz40 hz40Var, ib30 ib30Var, tls tlsVar) {
        Object d = hz40Var.d(ib30Var);
        if (d != null) {
            if (!(d instanceof xy40)) {
                if (((Boolean) tlsVar.invoke(d)).booleanValue()) {
                    hz40Var.m(ib30Var);
                    return;
                }
                return;
            }
            xy40 xy40Var = (xy40) d;
            int i = xy40Var.b;
            Object[] objArr = xy40Var.a;
            int i2 = 0;
            d6w n = y6i0.n(0, i);
            int i3 = n.a;
            int i4 = n.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) tlsVar.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            Arrays.fill(objArr, i - i2, i, (Object) null);
            xy40Var.b -= i2;
            if (xy40Var.d()) {
                hz40Var.m(ib30Var);
            }
            if (xy40Var.b == 0) {
                hz40Var.o(ib30Var, xy40Var.a());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof do40) {
            return this.a.equals(((do40) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
