package coil.disk;

import defpackage.ayj;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.cvw;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.ici0;
import defpackage.ike;
import defpackage.jci0;
import defpackage.jl40;
import defpackage.jse;
import defpackage.kzo;
import defpackage.ljo;
import defpackage.ny61;
import defpackage.oq90;
import defpackage.r1r;
import defpackage.sxj;
import defpackage.tga1;
import defpackage.tje;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wxj;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class a implements Closeable, Flushable {
    public static final Regex J = new Regex("[a-z0-9_-]{1,120}");
    public long A;
    public int B;
    public ici0 C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final ayj I;
    public final oq90 a;
    public final long b;
    public final oq90 c;
    public final oq90 w;
    public final oq90 x;
    public final LinkedHashMap y;
    public final ike z;

    public a(long j, jse jseVar, r1r r1rVar, oq90 oq90Var) {
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
        this.z = bvf0.a(cvw.U(jl40.a(), jseVar.P(1)));
        this.I = new ayj(r1rVar);
    }

    public static void D(String str) {
        if (J.h(str)) {
            return;
        }
        w511.f(unr0.l(OpenList.CHAR_QUOTE, "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
    
        if ((r9.B >= 2000) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111 A[Catch: all -> 0x003b, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0013, B:11:0x001c, B:13:0x0024, B:16:0x0036, B:26:0x0044, B:29:0x0062, B:30:0x0073, B:32:0x0083, B:34:0x008a, B:37:0x0066, B:39:0x00ae, B:41:0x00b8, B:44:0x00bd, B:46:0x00cb, B:49:0x00d2, B:50:0x0106, B:52:0x0111, B:58:0x011a, B:59:0x00ee, B:62:0x009c, B:64:0x011f, B:65:0x0126), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(a aVar, kzo kzoVar, boolean z) {
        synchronized (aVar) {
            sxj r = kzoVar.r();
            if (!jl40.l(r.b(), kzoVar)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || r.h()) {
                for (int i = 0; i < 2; i++) {
                    aVar.I.k((oq90) r.c().get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (kzoVar.t()[i2] && !aVar.I.n((oq90) r.c().get(i2))) {
                        kzoVar.h();
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    oq90 oq90Var = (oq90) r.c().get(i3);
                    oq90 oq90Var2 = (oq90) r.a().get(i3);
                    boolean n = aVar.I.n(oq90Var);
                    ayj ayjVar = aVar.I;
                    if (n) {
                        ayjVar.c(oq90Var, oq90Var2);
                    } else {
                        tga1.a(ayjVar, (oq90) r.a().get(i3));
                    }
                    long j = r.e()[i3];
                    Long l = aVar.I.v(oq90Var2).d;
                    long longValue = l != null ? l.longValue() : 0L;
                    r.e()[i3] = longValue;
                    aVar.A = (aVar.A - j) + longValue;
                }
            }
            r.i(null);
            if (r.h()) {
                aVar.w(r);
                return;
            }
            aVar.B++;
            ici0 ici0Var = aVar.C;
            if (!z && !r.g()) {
                aVar.y.remove(r.d());
                ici0Var.p1("REMOVE");
                ici0Var.writeByte(32);
                ici0Var.p1(r.d());
                ici0Var.writeByte(10);
                ici0Var.flush();
                if (aVar.A <= aVar.b) {
                }
                aVar.k();
            }
            r.k();
            ici0Var.p1("CLEAN");
            ici0Var.writeByte(32);
            ici0Var.p1(r.d());
            r.n(ici0Var);
            ici0Var.writeByte(10);
            ici0Var.flush();
            if (aVar.A <= aVar.b) {
            }
            aVar.k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        w(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B() {
        while (this.A > this.b) {
            for (sxj sxjVar : this.y.values()) {
                if (!sxjVar.h()) {
                    break;
                }
            }
            return;
        }
        this.G = false;
    }

    public final synchronized void G() {
        try {
            ici0 ici0Var = this.C;
            if (ici0Var != null) {
                ici0Var.close();
            }
            ici0 ici0Var2 = new ici0(this.I.D(this.w, false));
            try {
                ici0Var2.p1("libcore.io.DiskLruCache");
                ici0Var2.writeByte(10);
                ici0Var2.p1("1");
                ici0Var2.writeByte(10);
                ici0Var2.d0(1L);
                ici0Var2.writeByte(10);
                ici0Var2.d0(2L);
                ici0Var2.writeByte(10);
                ici0Var2.writeByte(10);
                for (sxj sxjVar : this.y.values()) {
                    if (sxjVar.b() != null) {
                        ici0Var2.p1("DIRTY");
                        ici0Var2.writeByte(32);
                        ici0Var2.p1(sxjVar.d());
                        ici0Var2.writeByte(10);
                    } else {
                        ici0Var2.p1("CLEAN");
                        ici0Var2.writeByte(32);
                        ici0Var2.p1(sxjVar.d());
                        sxjVar.n(ici0Var2);
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
            boolean n = this.I.n(this.c);
            ayj ayjVar = this.I;
            if (n) {
                ayjVar.c(this.c, this.x);
                this.I.c(this.w, this.c);
                this.I.k(this.x);
            } else {
                ayjVar.c(this.w, this.c);
            }
            ayj ayjVar2 = this.I;
            this.C = new ici0(new b(ayjVar2.c.a(this.c), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
            this.B = 0;
            this.D = false;
            this.H = false;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized kzo c(String str) {
        if (this.F) {
            throw new IllegalStateException("cache is closed");
        }
        D(str);
        e();
        sxj sxjVar = (sxj) this.y.get(str);
        if ((sxjVar != null ? sxjVar.b() : null) != null) {
            return null;
        }
        if (sxjVar != null && sxjVar.f() != 0) {
            return null;
        }
        if (!this.G && !this.H) {
            ici0 ici0Var = this.C;
            ici0Var.p1("DIRTY");
            ici0Var.writeByte(32);
            ici0Var.p1(str);
            ici0Var.writeByte(10);
            ici0Var.flush();
            if (this.D) {
                return null;
            }
            if (sxjVar == null) {
                sxjVar = new sxj(this, str);
                this.y.put(str, sxjVar);
            }
            kzo kzoVar = new kzo(this, sxjVar);
            sxjVar.i(kzoVar);
            return kzoVar;
        }
        k();
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.E && !this.F) {
                for (sxj sxjVar : (sxj[]) this.y.values().toArray(new sxj[0])) {
                    kzo b = sxjVar.b();
                    if (b != null) {
                        b.p();
                    }
                }
                B();
                bvf0.j(this.z, null);
                this.C.close();
                this.C = null;
                this.F = true;
                return;
            }
            this.F = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized wxj d(String str) {
        wxj m;
        if (this.F) {
            throw new IllegalStateException("cache is closed");
        }
        D(str);
        e();
        sxj sxjVar = (sxj) this.y.get(str);
        if (sxjVar != null && (m = sxjVar.m()) != null) {
            boolean z = true;
            this.B++;
            ici0 ici0Var = this.C;
            ici0Var.p1("READ");
            ici0Var.writeByte(32);
            ici0Var.p1(str);
            ici0Var.writeByte(10);
            if (this.B < 2000) {
                z = false;
            }
            if (z) {
                k();
            }
            return m;
        }
        return null;
    }

    public final synchronized void e() {
        try {
            if (this.E) {
                return;
            }
            this.I.k(this.w);
            if (this.I.n(this.x)) {
                boolean n = this.I.n(this.c);
                ayj ayjVar = this.I;
                oq90 oq90Var = this.x;
                if (n) {
                    ayjVar.k(oq90Var);
                } else {
                    ayjVar.c(oq90Var, this.c);
                }
            }
            if (this.I.n(this.c)) {
                try {
                    o();
                    n();
                    this.E = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        tga1.c(this.I, this.a);
                        this.F = false;
                    } catch (Throwable th) {
                        this.F = false;
                        throw th;
                    }
                }
            }
            G();
            this.E = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.E) {
            if (this.F) {
                throw new IllegalStateException("cache is closed");
            }
            B();
            this.C.flush();
        }
    }

    public final void k() {
        tje.N(this.z, null, null, new DiskLruCache$launchCleanup$1(this, null), 3);
    }

    public final void n() {
        Iterator it = this.y.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            sxj sxjVar = (sxj) it.next();
            int i = 0;
            if (sxjVar.b() == null) {
                while (i < 2) {
                    j += sxjVar.e()[i];
                    i++;
                }
            } else {
                sxjVar.i(null);
                while (i < 2) {
                    oq90 oq90Var = (oq90) sxjVar.a().get(i);
                    ayj ayjVar = this.I;
                    ayjVar.k(oq90Var);
                    ayjVar.k((oq90) sxjVar.c().get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.A = j;
    }

    public final void o() {
        ayj ayjVar = this.I;
        r1r r1rVar = ayjVar.c;
        oq90 oq90Var = this.c;
        jci0 jci0Var = new jci0(r1rVar.G(oq90Var));
        try {
            String j1 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            String j12 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            String j13 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            String j14 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            String j15 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            if (!"libcore.io.DiskLruCache".equals(j1) || !"1".equals(j12) || !jl40.l(String.valueOf(1), j13) || !jl40.l(String.valueOf(2), j14) || j15.length() > 0) {
                throw new IOException("unexpected journal header: [" + j1 + Extension.FIX_SPACE + j12 + Extension.FIX_SPACE + j13 + Extension.FIX_SPACE + j14 + Extension.FIX_SPACE + j15 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    v(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
                    i++;
                } catch (EOFException unused) {
                    this.B = i - this.y.size();
                    if (jci0Var.I1()) {
                        this.C = new ici0(new b(ayjVar.c.a(oq90Var), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
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
            obj = new sxj(this, substring);
            linkedHashMap.put(substring, obj);
        }
        sxj sxjVar = (sxj) obj;
        if (G2 != -1 && G == 5 && cvu0.x(str, "CLEAN", false)) {
            List Y = evu0.Y(str.substring(G2 + 1), new char[]{HexString.CHAR_SPACE}, 0, 6);
            sxjVar.k();
            sxjVar.i(null);
            sxjVar.j(Y);
            return;
        }
        if (G2 == -1 && G == 5 && cvu0.x(str, "DIRTY", false)) {
            sxjVar.i(new kzo(this, sxjVar));
        } else {
            if (G2 == -1 && G == 4 && cvu0.x(str, "READ", false)) {
                return;
            }
            ny61.v(g8e.o("unexpected journal line: ", str));
        }
    }

    public final void w(sxj sxjVar) {
        ici0 ici0Var;
        if (sxjVar.f() > 0 && (ici0Var = this.C) != null) {
            ici0Var.p1("DIRTY");
            ici0Var.writeByte(32);
            ici0Var.p1(sxjVar.d());
            ici0Var.writeByte(10);
            ici0Var.flush();
        }
        if (sxjVar.f() > 0 || sxjVar.b() != null) {
            sxjVar.l();
            return;
        }
        for (int i = 0; i < 2; i++) {
            this.I.k((oq90) sxjVar.a().get(i));
            this.A -= sxjVar.e()[i];
            sxjVar.e()[i] = 0;
        }
        this.B++;
        ici0 ici0Var2 = this.C;
        if (ici0Var2 != null) {
            ici0Var2.p1("REMOVE");
            ici0Var2.writeByte(32);
            ici0Var2.p1(sxjVar.d());
            ici0Var2.writeByte(10);
        }
        this.y.remove(sxjVar.d());
        if (this.B >= 2000) {
            k();
        }
    }
}
