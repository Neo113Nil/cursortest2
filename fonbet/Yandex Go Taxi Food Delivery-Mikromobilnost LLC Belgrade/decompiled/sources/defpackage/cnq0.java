package defpackage;

import androidx.compose.ui.semantics.g;
import java.util.Iterator;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class cnq0 implements mnq0, Iterable, xfx {
    public final hz40 a = cmm0.b();
    public Map b;
    public boolean c;
    public boolean w;

    @Override // defpackage.mnq0
    public final void a(g gVar, Object obj) {
        boolean z = obj instanceof ag;
        hz40 hz40Var = this.a;
        if (z && hz40Var.b(gVar)) {
            ag agVar = (ag) hz40Var.d(gVar);
            ag agVar2 = (ag) obj;
            String b = agVar2.b();
            if (b == null) {
                b = agVar.b();
            }
            cms a = agVar2.a();
            if (a == null) {
                a = agVar.a();
            }
            hz40Var.o(gVar, new ag(b, a));
        } else {
            hz40Var.o(gVar, obj);
        }
        gVar.getClass();
    }

    public final cnq0 b() {
        cnq0 cnq0Var = new cnq0();
        cnq0Var.c = this.c;
        cnq0Var.w = this.w;
        hz40 hz40Var = cnq0Var.a;
        hz40Var.getClass();
        hz40 hz40Var2 = this.a;
        Object[] objArr = hz40Var2.b;
        Object[] objArr2 = hz40Var2.c;
        long[] jArr = hz40Var2.a;
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
                            hz40Var.o(objArr[i4], objArr2[i4]);
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
        return cnq0Var;
    }

    public final Object d(g gVar) {
        Object d = this.a.d(gVar);
        if (d != null) {
            return d;
        }
        vg10.p("Key not present: ", gVar, " - consider getOrElse or getOrNull");
        return null;
    }

    public final Object e(g gVar, sls slsVar) {
        Object d = this.a.d(gVar);
        return d == null ? slsVar.invoke() : d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnq0)) {
            return false;
        }
        cnq0 cnq0Var = (cnq0) obj;
        return jl40.l(this.a, cnq0Var.a) && this.c == cnq0Var.c && this.w == cnq0Var.w;
    }

    public final void f(cnq0 cnq0Var) {
        hz40 hz40Var = cnq0Var.a;
        Object[] objArr = hz40Var.b;
        Object[] objArr2 = hz40Var.c;
        long[] jArr = hz40Var.a;
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
                        g gVar = (g) obj;
                        hz40 hz40Var2 = this.a;
                        Object invoke = gVar.b.invoke(hz40Var2.d(gVar), obj2);
                        if (invoke != null) {
                            hz40Var2.o(gVar, invoke);
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

    public final int hashCode() {
        return Boolean.hashCode(this.w) + unr0.e(this.a.hashCode() * 31, 31, this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.b;
        if (map == null) {
            hz40 hz40Var = this.a;
            du00 du00Var = hz40Var.f;
            if (du00Var == null) {
                du00Var = new du00(hz40Var);
                hz40Var.f = du00Var;
            }
            map = du00Var;
            this.b = map;
        }
        return map.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("mergeDescendants=true");
            str = Extension.FIX_SPACE;
        } else {
            str = "";
        }
        if (this.w) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = Extension.FIX_SPACE;
        }
        hz40 hz40Var = this.a;
        Object[] objArr = hz40Var.b;
        Object[] objArr2 = hz40Var.c;
        long[] jArr = hz40Var.a;
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
                            sb.append(((g) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = Extension.FIX_SPACE;
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
        return xbb1.f(this) + "{ " + ((Object) sb) + " }";
    }
}
