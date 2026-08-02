package defpackage;

import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.internal.measurement.zzou;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class cxa1 {
    public static final cxa1 c = new cxa1(0);
    public final g8b1 a = new g8b1();
    public boolean b;

    public cxa1(int i) {
        b();
        b();
    }

    public static cxa1 a() {
        return c;
    }

    public static void e(y0 y0Var, zzot zzotVar, int i, Object obj) {
        if (zzotVar == zzot.zzj) {
            p5b1 p5b1Var = (p5b1) obj;
            Charset charset = f1b1.a;
            if (p5b1Var instanceof oqa1) {
                throw null;
            }
            y0Var.c(i, 3);
            p5b1Var.c(y0Var);
            y0Var.c(i, 4);
            return;
        }
        y0Var.c(i, zzotVar.b());
        zzou zzouVar = zzou.zza;
        switch (zzotVar.ordinal()) {
            case 0:
                y0Var.q(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                y0Var.o(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                y0Var.p(((Long) obj).longValue());
                return;
            case 3:
                y0Var.p(((Long) obj).longValue());
                return;
            case 4:
                y0Var.m(((Integer) obj).intValue());
                return;
            case 5:
                y0Var.q(((Long) obj).longValue());
                return;
            case 6:
                y0Var.o(((Integer) obj).intValue());
                return;
            case 7:
                y0Var.l(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof zzlh) {
                    y0Var.j((zzlh) obj);
                    return;
                } else {
                    y0Var.s((String) obj);
                    return;
                }
            case 9:
                ((p5b1) obj).c(y0Var);
                return;
            case 10:
                y0Var.k((p5b1) obj);
                return;
            case 11:
                if (obj instanceof zzlh) {
                    y0Var.j((zzlh) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                y0Var.n(length);
                y0Var.r(length, bArr);
                return;
            case 12:
                y0Var.n(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof yza1) {
                    y0Var.m(((yza1) obj).zza());
                    return;
                } else {
                    y0Var.m(((Integer) obj).intValue());
                    return;
                }
            case 14:
                y0Var.o(((Integer) obj).intValue());
                return;
            case 15:
                y0Var.q(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                y0Var.n((intValue >> 31) ^ (intValue + intValue));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                y0Var.p((longValue >> 63) ^ (longValue + longValue));
                return;
            default:
                return;
        }
    }

    public static int f(zzot zzotVar, int i, Object obj) {
        int f;
        int t;
        int t2 = y0.t(i << 3);
        if (zzotVar == zzot.zzj) {
            Charset charset = f1b1.a;
            if (((p5b1) obj) instanceof oqa1) {
                throw null;
            }
            t2 += t2;
        }
        zzou zzouVar = zzou.zza;
        int i2 = 4;
        switch (zzotVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i2 = 8;
                return i2 + t2;
            case 1:
                ((Float) obj).getClass();
                return i2 + t2;
            case 2:
                i2 = y0.a(((Long) obj).longValue());
                return i2 + t2;
            case 3:
                i2 = y0.a(((Long) obj).longValue());
                return i2 + t2;
            case 4:
                i2 = y0.a(((Integer) obj).intValue());
                return i2 + t2;
            case 5:
                ((Long) obj).getClass();
                i2 = 8;
                return i2 + t2;
            case 6:
                ((Integer) obj).getClass();
                return i2 + t2;
            case 7:
                ((Boolean) obj).getClass();
                i2 = 1;
                return i2 + t2;
            case 8:
                if (!(obj instanceof zzlh)) {
                    i2 = y0.b((String) obj);
                    return i2 + t2;
                }
                f = ((zzlh) obj).f();
                t = y0.t(f);
                i2 = t + f;
                return i2 + t2;
            case 9:
                i2 = ((a1) ((p5b1) obj)).m();
                return i2 + t2;
            case 10:
                f = ((a1) ((p5b1) obj)).m();
                t = y0.t(f);
                i2 = t + f;
                return i2 + t2;
            case 11:
                if (obj instanceof zzlh) {
                    f = ((zzlh) obj).f();
                    t = y0.t(f);
                } else {
                    f = ((byte[]) obj).length;
                    t = y0.t(f);
                }
                i2 = t + f;
                return i2 + t2;
            case 12:
                i2 = y0.t(((Integer) obj).intValue());
                return i2 + t2;
            case 13:
                i2 = obj instanceof yza1 ? y0.a(((yza1) obj).zza()) : y0.a(((Integer) obj).intValue());
                return i2 + t2;
            case 14:
                ((Integer) obj).getClass();
                return i2 + t2;
            case 15:
                ((Long) obj).getClass();
                i2 = 8;
                return i2 + t2;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i2 = y0.t((intValue >> 31) ^ (intValue + intValue));
                return i2 + t2;
            case 17:
                long longValue = ((Long) obj).longValue();
                i2 = y0.a((longValue >> 63) ^ (longValue + longValue));
                return i2 + t2;
            default:
                kbs.g("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static void g() {
        throw null;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        g8b1 g8b1Var = this.a;
        int i = g8b1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = g8b1Var.b(i2).b;
            if (obj instanceof a1) {
                ((a1) obj).i();
            }
        }
        Iterator it = g8b1Var.c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof a1) {
                ((a1) value).i();
            }
        }
        if (!g8b1Var.w) {
            if (g8b1Var.b > 0) {
                g8b1Var.b(0).a.getClass();
                ny61.u();
                return;
            } else {
                Iterator it2 = g8b1Var.c().iterator();
                if (it2.hasNext()) {
                    throw g8e.j((Map.Entry) it2.next());
                }
            }
        }
        if (!g8b1Var.w) {
            g8b1Var.c = g8b1Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(g8b1Var.c);
            g8b1Var.y = g8b1Var.y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(g8b1Var.y);
            g8b1Var.w = true;
        }
        this.b = true;
    }

    public final Iterator c() {
        g8b1 g8b1Var = this.a;
        return g8b1Var.isEmpty() ? Collections.emptyIterator() : ((nxs0) g8b1Var.entrySet()).iterator();
    }

    public final Object clone() {
        cxa1 cxa1Var = new cxa1();
        g8b1 g8b1Var = this.a;
        if (g8b1Var.b > 0) {
            g8b1Var.b(0).a.getClass();
            ny61.u();
            return null;
        }
        Iterator it = g8b1Var.c().iterator();
        if (!it.hasNext()) {
            return cxa1Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            ny61.u();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final void d() {
        g8b1 g8b1Var = this.a;
        if (g8b1Var.b > 0) {
            g8b1Var.b(0).getKey().getClass();
            ny61.u();
        } else {
            Iterator it = g8b1Var.c().iterator();
            if (it.hasNext()) {
                throw g8e.j((Map.Entry) it.next());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cxa1) {
            return this.a.equals(((cxa1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public cxa1() {
    }
}
