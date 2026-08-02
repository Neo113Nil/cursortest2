package xsna;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* compiled from: MultiValueMap.kt */
@vby
/* loaded from: classes11.dex */
public final class s640<K, V> {
    public final ph50<Object, Object> a;

    public /* synthetic */ s640(ph50 ph50Var) {
        this.a = ph50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ph50<Object, Object> ph50Var, K k, V v) {
        int j = ph50Var.j(k);
        boolean z = j < 0;
        Object obj = z ? null : ph50Var.c[j];
        if (obj != null) {
            if (obj instanceof fh50) {
                fh50 fh50Var = (fh50) obj;
                fh50Var.j(v);
                v = fh50Var;
            } else {
                Object[] objArr = sp70.a;
                fh50 fh50Var2 = new fh50(2);
                fh50Var2.j(obj);
                fh50Var2.j(v);
                v = fh50Var2;
            }
        }
        if (!z) {
            ph50Var.c[j] = v;
            return;
        }
        int i = ~j;
        ph50Var.b[i] = k;
        ph50Var.c[i] = v;
    }

    public static ph50 b() {
        return new ph50((Object) null);
    }

    public static final Object c(ph50 ph50Var, fc30 fc30Var) {
        Object d = ph50Var.d(fc30Var);
        if (d == null) {
            return null;
        }
        if (!(d instanceof fh50)) {
            ph50Var.n(fc30Var);
            return d;
        }
        fh50 fh50Var = (fh50) d;
        if (fh50Var.f()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = fh50Var.b - 1;
        E d2 = fh50Var.d(i);
        fh50Var.o(i);
        if (fh50Var.f()) {
            ph50Var.n(fc30Var);
        }
        if (fh50Var.b == 1) {
            ph50Var.p(fc30Var, fh50Var.c());
        }
        return d2;
    }

    public static final void d(ph50 ph50Var, fc30 fc30Var, izs izsVar) {
        Object d = ph50Var.d(fc30Var);
        if (d != null) {
            if (!(d instanceof fh50)) {
                if (((Boolean) izsVar.invoke(d)).booleanValue()) {
                    ph50Var.n(fc30Var);
                    return;
                }
                return;
            }
            fh50 fh50Var = (fh50) d;
            int i = fh50Var.b;
            Object[] objArr = fh50Var.a;
            int i2 = 0;
            k9x q = swe0.q(0, i);
            int i3 = q.b;
            int i4 = q.c;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) izsVar.invoke(objArr[i3])).booleanValue()) {
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
            fh50Var.b -= i2;
            if (fh50Var.f()) {
                ph50Var.n(fc30Var);
            }
            if (fh50Var.b == 1) {
                ph50Var.p(fc30Var, fh50Var.c());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s640) {
            return epx.f(this.a, ((s640) obj).a);
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
