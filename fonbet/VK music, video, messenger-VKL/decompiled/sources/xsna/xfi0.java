package xsna;

import java.util.Iterator;
import java.util.Map;

/* compiled from: SemanticsConfiguration.kt */
/* loaded from: classes11.dex */
public final class xfi0 implements tgi0, Iterable<Map.Entry<? extends sgi0<?>, ? extends Object>>, gcy {
    public final ph50<sgi0<?>, Object> b = h5h0.b();
    public um00 c;
    public boolean d;
    public boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.tgi0
    public final <T> void a(sgi0<T> sgi0Var, T t) {
        boolean z = t instanceof ck;
        ph50<sgi0<?>, Object> ph50Var = this.b;
        if (z && ph50Var.b(sgi0Var)) {
            ck ckVar = (ck) ph50Var.d(sgi0Var);
            ck ckVar2 = (ck) t;
            String str = ckVar2.a;
            if (str == null) {
                str = ckVar.a;
            }
            xzs xzsVar = ckVar2.b;
            if (xzsVar == null) {
                xzsVar = ckVar.b;
            }
            ph50Var.p(sgi0Var, new ck(str, xzsVar));
        } else {
            ph50Var.p(sgi0Var, t);
        }
        sgi0Var.getClass();
    }

    public final <T> boolean b(sgi0<T> sgi0Var) {
        return this.b.b(sgi0Var);
    }

    public final <T> T c(sgi0<T> sgi0Var) {
        T t = (T) this.b.d(sgi0Var);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + sgi0Var + " - consider getOrElse or getOrNull");
    }

    public final <T> T d(sgi0<T> sgi0Var, gzs<? extends T> gzsVar) {
        T t = (T) this.b.d(sgi0Var);
        return t == null ? gzsVar.invoke() : t;
    }

    public final void e(xfi0 xfi0Var) {
        ph50<sgi0<?>, Object> ph50Var = xfi0Var.b;
        Object[] objArr = ph50Var.b;
        Object[] objArr2 = ph50Var.c;
        long[] jArr = ph50Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        sgi0<?> sgi0Var = (sgi0) obj;
                        ph50<sgi0<?>, Object> ph50Var2 = this.b;
                        Object invoke = sgi0Var.b.invoke(ph50Var2.d(sgi0Var), obj2);
                        if (invoke != null) {
                            ph50Var2.p(sgi0Var, invoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfi0)) {
            return false;
        }
        xfi0 xfi0Var = (xfi0) obj;
        return epx.f(this.b, xfi0Var.b) && this.d == xfi0Var.d && this.e == xfi0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(this.b.hashCode() * 31, 31, this.d);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends sgi0<?>, ? extends Object>> iterator() {
        um00 um00Var = this.c;
        if (um00Var == null) {
            ph50<sgi0<?>, Object> ph50Var = this.b;
            ph50Var.getClass();
            um00 um00Var2 = new um00(ph50Var);
            this.c = um00Var2;
            um00Var = um00Var2;
        }
        return ((aqp) um00Var.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.d) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.e) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        ph50<sgi0<?>, Object> ph50Var = this.b;
        Object[] objArr = ph50Var.b;
        Object[] objArr2 = ph50Var.c;
        long[] jArr = ph50Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((sgi0) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return mnh0.z(this) + "{ " + ((Object) sb) + " }";
    }
}
