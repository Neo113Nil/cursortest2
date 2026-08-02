package coil3.disk;

import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.d8;
import defpackage.evu0;
import defpackage.fse;
import defpackage.g8e;
import defpackage.ici0;
import defpackage.ike;
import defpackage.jci0;
import defpackage.jl40;
import defpackage.jse;
import defpackage.ljo;
import defpackage.lxj;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.ocp;
import defpackage.oq90;
import defpackage.oxj;
import defpackage.oyr;
import defpackage.r1r;
import defpackage.sjh;
import defpackage.tje;
import defpackage.txj;
import defpackage.uyj;
import defpackage.w1r;
import defpackage.w511;
import defpackage.yxj;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class a implements AutoCloseable {
    public static final Regex K = new Regex("[a-z0-9_-]{1,120}");
    public final Object A;
    public long B;
    public int C;
    public ici0 D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final yxj J;
    public final oq90 a;
    public final long b;
    public final oq90 c;
    public final oq90 w;
    public final oq90 x;
    public final LinkedHashMap y;
    public final ike z;

    public a(r1r r1rVar, oq90 oq90Var, fse fseVar, long j) {
        this.a = oq90Var;
        this.b = j;
        if (j <= 0) {
            ny61.g("maxSize <= 0");
            throw null;
        }
        this.c = oq90Var.e("journal");
        this.w = oq90Var.e("journal.tmp");
        this.x = oq90Var.e("journal.bkp");
        this.y = new LinkedHashMap(0, 0.75f, true);
        fse plus = fseVar.plus(jl40.a());
        jse jseVar = (jse) fseVar.get(jse.a);
        if (jseVar == null) {
            sjh sjhVar = uyj.a;
            jseVar = mdh.b;
        }
        this.z = bvf0.a(plus.plus(jseVar.P(1)));
        this.A = new Object();
        this.J = new yxj(r1rVar);
    }

    public static void D(String str) {
        if (K.h(str)) {
            return;
        }
        w511.f(oyr.p("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
    
        if ((r10.C >= 2000) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103 A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:17:0x0032, B:27:0x0040, B:30:0x005a, B:31:0x0069, B:33:0x0077, B:35:0x007e, B:38:0x005e, B:40:0x009e, B:42:0x00a5, B:45:0x00aa, B:47:0x00b8, B:50:0x00bd, B:51:0x00f8, B:53:0x0103, B:59:0x010c, B:60:0x00d5, B:62:0x00ea, B:64:0x00f5, B:67:0x008e, B:69:0x0111, B:70:0x0118), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(a aVar, lxj lxjVar, boolean z) {
        synchronized (aVar.A) {
            oxj oxjVar = (oxj) lxjVar.c;
            if (!jl40.l(oxjVar.g, lxjVar)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || oxjVar.f) {
                for (int i = 0; i < 2; i++) {
                    aVar.J.k((oq90) oxjVar.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) lxjVar.a)[i2] && !aVar.J.n((oq90) oxjVar.d.get(i2))) {
                        lxjVar.c(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    oq90 oq90Var = (oq90) oxjVar.d.get(i3);
                    oq90 oq90Var2 = (oq90) oxjVar.c.get(i3);
                    boolean n = aVar.J.n(oq90Var);
                    yxj yxjVar = aVar.J;
                    if (n) {
                        yxjVar.c(oq90Var, oq90Var2);
                    } else {
                        w1r.a(yxjVar, (oq90) oxjVar.c.get(i3));
                    }
                    long j = oxjVar.b[i3];
                    Long l = aVar.J.v(oq90Var2).d;
                    long longValue = l != null ? l.longValue() : 0L;
                    oxjVar.b[i3] = longValue;
                    aVar.B = (aVar.B - j) + longValue;
                }
            }
            oxjVar.g = null;
            if (oxjVar.f) {
                aVar.w(oxjVar);
                return;
            }
            aVar.C++;
            ici0 ici0Var = aVar.D;
            if (!z && !oxjVar.e) {
                aVar.y.remove(oxjVar.a);
                ici0Var.p1("REMOVE");
                ici0Var.writeByte(32);
                ici0Var.p1(oxjVar.a);
                ici0Var.writeByte(10);
                ici0Var.flush();
                if (aVar.B <= aVar.b) {
                }
                aVar.k();
            }
            oxjVar.e = true;
            ici0Var.p1("CLEAN");
            ici0Var.writeByte(32);
            ici0Var.p1(oxjVar.a);
            for (long j2 : oxjVar.b) {
                ici0Var.writeByte(32);
                ici0Var.d0(j2);
            }
            ici0Var.writeByte(10);
            ici0Var.flush();
            if (aVar.B <= aVar.b) {
            }
            aVar.k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        w(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B() {
        while (this.B > this.b) {
            for (oxj oxjVar : this.y.values()) {
                if (!oxjVar.f) {
                    break;
                }
            }
            return;
        }
        this.H = false;
    }

    public final void G() {
        synchronized (this.A) {
            try {
                ici0 ici0Var = this.D;
                if (ici0Var != null) {
                    ici0Var.close();
                }
                ici0 ici0Var2 = new ici0(this.J.D(this.w, false));
                try {
                    ici0Var2.p1("libcore.io.DiskLruCache");
                    ici0Var2.writeByte(10);
                    ici0Var2.p1("1");
                    ici0Var2.writeByte(10);
                    ici0Var2.d0(3L);
                    ici0Var2.writeByte(10);
                    ici0Var2.d0(2L);
                    ici0Var2.writeByte(10);
                    ici0Var2.writeByte(10);
                    for (oxj oxjVar : this.y.values()) {
                        if (oxjVar.g != null) {
                            ici0Var2.p1("DIRTY");
                            ici0Var2.writeByte(32);
                            ici0Var2.p1(oxjVar.a);
                            ici0Var2.writeByte(10);
                        } else {
                            ici0Var2.p1("CLEAN");
                            ici0Var2.writeByte(32);
                            ici0Var2.p1(oxjVar.a);
                            for (long j : oxjVar.b) {
                                ici0Var2.writeByte(32);
                                ici0Var2.d0(j);
                            }
                            ici0Var2.writeByte(10);
                        }
                    }
                    try {
                        ici0Var2.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        ici0Var2.close();
                    } catch (Throwable th3) {
                        ljo.a(th, th3);
                    }
                }
                if (th != null) {
                    throw th;
                }
                boolean n = this.J.n(this.c);
                yxj yxjVar = this.J;
                if (n) {
                    yxjVar.c(this.c, this.x);
                    this.J.c(this.w, this.c);
                    this.J.k(this.x);
                } else {
                    yxjVar.c(this.w, this.c);
                }
                this.D = new ici0(new ocp(this.J.c.a(this.c), new d8(16, this)));
                this.C = 0;
                this.E = false;
                this.I = false;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final lxj c(String str) {
        synchronized (this.A) {
            if (this.G) {
                throw new IllegalStateException("cache is closed");
            }
            D(str);
            e();
            oxj oxjVar = (oxj) this.y.get(str);
            if ((oxjVar != null ? oxjVar.g : null) != null) {
                return null;
            }
            if (oxjVar != null && oxjVar.h != 0) {
                return null;
            }
            if (!this.H && !this.I) {
                ici0 ici0Var = this.D;
                ici0Var.p1("DIRTY");
                ici0Var.writeByte(32);
                ici0Var.p1(str);
                ici0Var.writeByte(10);
                ici0Var.flush();
                if (this.E) {
                    return null;
                }
                if (oxjVar == null) {
                    oxjVar = new oxj(this, str);
                    this.y.put(str, oxjVar);
                }
                lxj lxjVar = new lxj(this, oxjVar);
                oxjVar.g = lxjVar;
                return lxjVar;
            }
            k();
            return null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.A) {
            try {
                if (this.F && !this.G) {
                    for (oxj oxjVar : (oxj[]) this.y.values().toArray(new oxj[0])) {
                        lxj lxjVar = oxjVar.g;
                        if (lxjVar != null) {
                            oxj oxjVar2 = (oxj) lxjVar.c;
                            if (jl40.l(oxjVar2.g, lxjVar)) {
                                oxjVar2.f = true;
                            }
                        }
                    }
                    B();
                    bvf0.j(this.z, null);
                    this.D.close();
                    this.D = null;
                    this.G = true;
                    return;
                }
                this.G = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final txj d(String str) {
        txj a;
        synchronized (this.A) {
            if (this.G) {
                throw new IllegalStateException("cache is closed");
            }
            D(str);
            e();
            oxj oxjVar = (oxj) this.y.get(str);
            if (oxjVar != null && (a = oxjVar.a()) != null) {
                boolean z = true;
                this.C++;
                ici0 ici0Var = this.D;
                ici0Var.p1("READ");
                ici0Var.writeByte(32);
                ici0Var.p1(str);
                ici0Var.writeByte(10);
                ici0Var.flush();
                if (this.C < 2000) {
                    z = false;
                }
                if (z) {
                    k();
                }
                return a;
            }
            return null;
        }
    }

    public final void e() {
        synchronized (this.A) {
            try {
                if (this.F) {
                    return;
                }
                this.J.k(this.w);
                if (this.J.n(this.x)) {
                    boolean n = this.J.n(this.c);
                    yxj yxjVar = this.J;
                    oq90 oq90Var = this.x;
                    if (n) {
                        yxjVar.k(oq90Var);
                    } else {
                        yxjVar.c(oq90Var, this.c);
                    }
                }
                if (this.J.n(this.c)) {
                    try {
                        o();
                        n();
                        this.F = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            w1r.b(this.J, this.a);
                            this.G = false;
                        } catch (Throwable th) {
                            this.G = false;
                            throw th;
                        }
                    }
                }
                G();
                this.F = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        tje.N(this.z, null, null, new DiskLruCache$launchCleanup$1(this, null), 3);
    }

    public final void n() {
        Iterator it = this.y.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            oxj oxjVar = (oxj) it.next();
            int i = 0;
            if (oxjVar.g == null) {
                while (i < 2) {
                    j += oxjVar.b[i];
                    i++;
                }
            } else {
                oxjVar.g = null;
                while (i < 2) {
                    oq90 oq90Var = (oq90) oxjVar.c.get(i);
                    yxj yxjVar = this.J;
                    yxjVar.k(oq90Var);
                    yxjVar.k((oq90) oxjVar.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.B = j;
    }

    public final void o() {
        yxj yxjVar = this.J;
        r1r r1rVar = yxjVar.c;
        oq90 oq90Var = this.c;
        jci0 jci0Var = new jci0(r1rVar.G(oq90Var));
        try {
            String j1 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            String j12 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            String j13 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            String j14 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            String j15 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            if (!"libcore.io.DiskLruCache".equals(j1) || !"1".equals(j12) || !jl40.l(String.valueOf(3), j13) || !jl40.l(String.valueOf(2), j14) || j15.length() > 0) {
                throw new IOException("unexpected journal header: [" + j1 + Extension.FIX_SPACE + j12 + Extension.FIX_SPACE + j13 + Extension.FIX_SPACE + j14 + Extension.FIX_SPACE + j15 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    v(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
                    i++;
                } catch (EOFException unused) {
                    this.C = i - this.y.size();
                    if (jci0Var.I1()) {
                        this.D = new ici0(new ocp(yxjVar.c.a(oq90Var), new d8(16, this)));
                    } else {
                        G();
                    }
                    try {
                        jci0Var.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                jci0Var.close();
            } catch (Throwable th3) {
                ljo.a(th, th3);
            }
        }
    }

    public final void v(String str) {
        String substring;
        int G = evu0.G(str, HexString.CHAR_SPACE, 0, 6);
        if (G == -1) {
            ny61.v(g8e.o("unexpected journal line: ", str));
            return;
        }
        int i = G + 1;
        int G2 = evu0.G(str, HexString.CHAR_SPACE, i, 4);
        LinkedHashMap linkedHashMap = this.y;
        if (G2 == -1) {
            substring = str.substring(i);
            if (G == 6 && cvu0.x(str, "REMOVE", false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, G2);
        }
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new oxj(this, substring);
            linkedHashMap.put(substring, obj);
        }
        oxj oxjVar = (oxj) obj;
        if (G2 == -1 || G != 5 || !cvu0.x(str, "CLEAN", false)) {
            if (G2 == -1 && G == 5 && cvu0.x(str, "DIRTY", false)) {
                oxjVar.g = new lxj(this, oxjVar);
                return;
            } else {
                if (G2 == -1 && G == 4 && cvu0.x(str, "READ", false)) {
                    return;
                }
                ny61.v(g8e.o("unexpected journal line: ", str));
                return;
            }
        }
        List Y = evu0.Y(str.substring(G2 + 1), new char[]{HexString.CHAR_SPACE}, 0, 6);
        oxjVar.e = true;
        oxjVar.g = null;
        if (Y.size() != 2) {
            w511.h(Y, "unexpected journal line: ");
            return;
        }
        try {
            int size = Y.size();
            for (int i2 = 0; i2 < size; i2++) {
                oxjVar.b[i2] = Long.parseLong((String) Y.get(i2));
            }
        } catch (NumberFormatException unused) {
            w511.h(Y, "unexpected journal line: ");
        }
    }

    public final void w(oxj oxjVar) {
        ici0 ici0Var;
        int i = oxjVar.h;
        String str = oxjVar.a;
        if (i > 0 && (ici0Var = this.D) != null) {
            ici0Var.p1("DIRTY");
            ici0Var.writeByte(32);
            ici0Var.p1(str);
            ici0Var.writeByte(10);
            ici0Var.flush();
        }
        if (oxjVar.h > 0 || oxjVar.g != null) {
            oxjVar.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.J.k((oq90) oxjVar.c.get(i2));
            long j = this.B;
            long[] jArr = oxjVar.b;
            this.B = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.C++;
        ici0 ici0Var2 = this.D;
        if (ici0Var2 != null) {
            ici0Var2.p1("REMOVE");
            ici0Var2.writeByte(32);
            ici0Var2.p1(str);
            ici0Var2.writeByte(10);
            ici0Var2.flush();
        }
        this.y.remove(str);
        if (this.C >= 2000) {
            k();
        }
    }
}
