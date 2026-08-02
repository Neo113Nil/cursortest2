package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class dyj implements Closeable, Flushable {
    public static final Regex M = new Regex("[a-z0-9_-]{1,120}");
    public static final String N = "CLEAN";
    public static final String O = "DIRTY";
    public static final String P = "REMOVE";
    public static final String Q = "READ";
    public ici0 A;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public long J;
    public final htx0 K;
    public final oq90 a;
    public final zxj b;
    public final long c;
    public final oq90 w;
    public final oq90 x;
    public final oq90 y;
    public long z;
    public final LinkedHashMap B = new LinkedHashMap(0, 0.75f, true);
    public final xxj L = new xxj(oyr.t(new StringBuilder(), bg61.b, " Cache"), 0, this);

    public dyj(r1r r1rVar, oq90 oq90Var, long j, mtx0 mtx0Var) {
        this.a = oq90Var;
        this.b = new zxj(r1rVar);
        this.c = j;
        this.K = mtx0Var.d();
        if (j <= 0) {
            ny61.g("maxSize <= 0");
            throw null;
        }
        this.w = oq90Var.e("journal");
        this.x = oq90Var.e("journal.tmp");
        this.y = oq90Var.e("journal.bkp");
    }

    public static void P(String str) {
        if (M.h(str)) {
            return;
        }
        w511.f(unr0.l(OpenList.CHAR_QUOTE, "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final synchronized void B() {
        try {
            ici0 ici0Var = this.A;
            if (ici0Var != null) {
                ici0Var.close();
            }
            ici0 ici0Var2 = new ici0(this.b.D(this.x, false));
            try {
                ici0Var2.p1("libcore.io.DiskLruCache");
                ici0Var2.writeByte(10);
                ici0Var2.p1("1");
                ici0Var2.writeByte(10);
                ici0Var2.d0(201105L);
                ici0Var2.writeByte(10);
                ici0Var2.d0(2L);
                ici0Var2.writeByte(10);
                ici0Var2.writeByte(10);
                for (rxj rxjVar : this.B.values()) {
                    if (rxjVar.g != null) {
                        ici0Var2.p1(O);
                        ici0Var2.writeByte(32);
                        ici0Var2.p1(rxjVar.a);
                        ici0Var2.writeByte(10);
                    } else {
                        ici0Var2.p1(N);
                        ici0Var2.writeByte(32);
                        ici0Var2.p1(rxjVar.a);
                        for (long j : rxjVar.b) {
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
            boolean n = this.b.n(this.w);
            zxj zxjVar = this.b;
            if (n) {
                zxjVar.c(this.w, this.y);
                this.b.c(this.x, this.w);
                zxj zxjVar2 = this.b;
                oq90 oq90Var = this.y;
                byte[] bArr = yf61.a;
                try {
                    zxjVar2.k(oq90Var);
                } catch (FileNotFoundException unused) {
                }
            } else {
                zxjVar.c(this.x, this.w);
            }
            ici0 ici0Var3 = this.A;
            if (ici0Var3 != null) {
                yf61.b(ici0Var3);
            }
            this.A = new ici0(new ncp(this.b.c.a(this.w), new d8(15, this)));
            this.D = false;
            this.I = false;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized void D(String str) {
        k();
        a();
        P(str);
        rxj rxjVar = (rxj) this.B.get(str);
        if (rxjVar == null) {
            return;
        }
        G(rxjVar);
        if (this.z <= this.c) {
            this.H = false;
        }
    }

    public final void G(rxj rxjVar) {
        ici0 ici0Var;
        String str = rxjVar.a;
        if (!this.E) {
            if (rxjVar.h > 0 && (ici0Var = this.A) != null) {
                ici0Var.p1(O);
                ici0Var.writeByte(32);
                ici0Var.p1(str);
                ici0Var.writeByte(10);
                ici0Var.flush();
            }
            if (rxjVar.h > 0 || rxjVar.g != null) {
                rxjVar.f = true;
                return;
            }
        }
        lxj lxjVar = rxjVar.g;
        if (lxjVar != null) {
            lxjVar.d();
        }
        for (int i = 0; i < 2; i++) {
            zxj zxjVar = this.b;
            oq90 oq90Var = (oq90) rxjVar.c.get(i);
            byte[] bArr = yf61.a;
            try {
                zxjVar.k(oq90Var);
            } catch (FileNotFoundException unused) {
            }
            long j = this.z;
            long[] jArr = rxjVar.b;
            this.z = j - jArr[i];
            jArr[i] = 0;
        }
        this.C++;
        ici0 ici0Var2 = this.A;
        if (ici0Var2 != null) {
            ici0Var2.p1(P);
            ici0Var2.writeByte(32);
            ici0Var2.p1(str);
            ici0Var2.writeByte(10);
        }
        this.B.remove(str);
        if (n()) {
            this.K.d(this.L, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        G(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        while (this.z > this.c) {
            for (rxj rxjVar : this.B.values()) {
                if (!rxjVar.f) {
                    break;
                }
            }
            return;
        }
        this.H = false;
    }

    public final synchronized void a() {
        if (this.G) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void c(lxj lxjVar, boolean z) {
        rxj rxjVar = (rxj) lxjVar.c;
        if (!jl40.l(rxjVar.g, lxjVar)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !rxjVar.e) {
            for (int i = 0; i < 2; i++) {
                if (!((boolean[]) lxjVar.a)[i]) {
                    lxjVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.b.n((oq90) rxjVar.d.get(i))) {
                    lxjVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            oq90 oq90Var = (oq90) rxjVar.d.get(i2);
            if (!z || rxjVar.f) {
                zxj zxjVar = this.b;
                byte[] bArr = yf61.a;
                try {
                    zxjVar.k(oq90Var);
                } catch (FileNotFoundException unused) {
                }
            } else if (this.b.n(oq90Var)) {
                oq90 oq90Var2 = (oq90) rxjVar.c.get(i2);
                this.b.c(oq90Var, oq90Var2);
                long j = rxjVar.b[i2];
                Long l = this.b.v(oq90Var2).d;
                long longValue = l != null ? l.longValue() : 0L;
                rxjVar.b[i2] = longValue;
                this.z = (this.z - j) + longValue;
            }
        }
        rxjVar.g = null;
        if (rxjVar.f) {
            G(rxjVar);
            return;
        }
        this.C++;
        ici0 ici0Var = this.A;
        if (!rxjVar.e && !z) {
            this.B.remove(rxjVar.a);
            ici0Var.p1(P);
            ici0Var.writeByte(32);
            ici0Var.p1(rxjVar.a);
            ici0Var.writeByte(10);
            ici0Var.flush();
            if (this.z <= this.c || n()) {
                this.K.d(this.L, 0L);
            }
        }
        rxjVar.e = true;
        ici0Var.p1(N);
        ici0Var.writeByte(32);
        ici0Var.p1(rxjVar.a);
        for (long j2 : rxjVar.b) {
            ici0Var.writeByte(32);
            ici0Var.d0(j2);
        }
        ici0Var.writeByte(10);
        if (z) {
            long j3 = this.J;
            this.J = 1 + j3;
            rxjVar.i = j3;
        }
        ici0Var.flush();
        if (this.z <= this.c) {
        }
        this.K.d(this.L, 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.F && !this.G) {
                for (rxj rxjVar : (rxj[]) this.B.values().toArray(new rxj[0])) {
                    lxj lxjVar = rxjVar.g;
                    if (lxjVar != null) {
                        lxjVar.d();
                    }
                }
                I();
                ici0 ici0Var = this.A;
                if (ici0Var != null) {
                    yf61.b(ici0Var);
                }
                this.A = null;
                this.G = true;
                return;
            }
            this.G = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized lxj d(long j, String str) {
        k();
        a();
        P(str);
        rxj rxjVar = (rxj) this.B.get(str);
        if (j != -1 && (rxjVar == null || rxjVar.i != j)) {
            return null;
        }
        if ((rxjVar != null ? rxjVar.g : null) != null) {
            return null;
        }
        if (rxjVar != null && rxjVar.h != 0) {
            return null;
        }
        if (!this.H && !this.I) {
            ici0 ici0Var = this.A;
            ici0Var.p1(O);
            ici0Var.writeByte(32);
            ici0Var.p1(str);
            ici0Var.writeByte(10);
            ici0Var.flush();
            if (this.D) {
                return null;
            }
            if (rxjVar == null) {
                rxjVar = new rxj(this, str);
                this.B.put(str, rxjVar);
            }
            lxj lxjVar = new lxj(this, rxjVar);
            rxjVar.g = lxjVar;
            return lxjVar;
        }
        this.K.d(this.L, 0L);
        return null;
    }

    public final synchronized vxj e(String str) {
        k();
        a();
        P(str);
        rxj rxjVar = (rxj) this.B.get(str);
        if (rxjVar == null) {
            return null;
        }
        vxj a = rxjVar.a();
        if (a == null) {
            return null;
        }
        this.C++;
        ici0 ici0Var = this.A;
        ici0Var.p1(Q);
        ici0Var.writeByte(32);
        ici0Var.p1(str);
        ici0Var.writeByte(10);
        if (n()) {
            this.K.d(this.L, 0L);
        }
        return a;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.F) {
            a();
            I();
            this.A.flush();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005e A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #4 {all -> 0x0027, blocks: (B:4:0x0003, B:9:0x000b, B:11:0x0015, B:14:0x0023, B:15:0x002a, B:16:0x002f, B:22:0x0062, B:28:0x006e, B:24:0x00af, B:33:0x0079, B:36:0x00a8, B:39:0x00ac, B:40:0x00ae, B:50:0x005e, B:51:0x00b6, B:62:0x004d, B:35:0x009e, B:59:0x0048, B:19:0x003b), top: B:3:0x0003, inners: #0, #6, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #4 {all -> 0x0027, blocks: (B:4:0x0003, B:9:0x000b, B:11:0x0015, B:14:0x0023, B:15:0x002a, B:16:0x002f, B:22:0x0062, B:28:0x006e, B:24:0x00af, B:33:0x0079, B:36:0x00a8, B:39:0x00ac, B:40:0x00ae, B:50:0x005e, B:51:0x00b6, B:62:0x004d, B:35:0x009e, B:59:0x0048, B:19:0x003b), top: B:3:0x0003, inners: #0, #6, #7, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void k() {
        boolean z;
        try {
            TimeZone timeZone = bg61.a;
            if (this.F) {
                return;
            }
            if (this.b.n(this.y)) {
                boolean n = this.b.n(this.w);
                zxj zxjVar = this.b;
                oq90 oq90Var = this.y;
                if (n) {
                    zxjVar.k(oq90Var);
                } else {
                    zxjVar.c(oq90Var, this.w);
                }
            }
            zxj zxjVar2 = this.b;
            oq90 oq90Var2 = this.y;
            byte[] bArr = yf61.a;
            uis0 D = zxjVar2.D(oq90Var2, false);
            try {
                zxjVar2.k(oq90Var2);
                if (D != null) {
                    try {
                        D.close();
                    } catch (Throwable unused) {
                    }
                }
                z = true;
            } catch (IOException unused2) {
                if (D != null) {
                    try {
                        D.close();
                    } catch (Throwable th) {
                        th = th;
                        th = th;
                        if (th != null) {
                            throw th;
                        }
                        zxjVar2.k(oq90Var2);
                        z = false;
                        this.E = z;
                        if (this.b.n(this.w)) {
                        }
                        B();
                        this.F = true;
                    }
                }
                th = null;
                th = th;
                if (th != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (D != null) {
                    try {
                        D.close();
                    } catch (Throwable th3) {
                        ljo.a(th, th3);
                    }
                }
                if (th != null) {
                }
            }
            this.E = z;
            if (this.b.n(this.w)) {
                try {
                    v();
                    o();
                    this.F = true;
                    return;
                } catch (IOException e) {
                    d72 d72Var = dvc0.a;
                    d72 d72Var2 = dvc0.a;
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(this.a);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    d72Var2.getClass();
                    kva1.d();
                    try {
                        close();
                        yf61.c(this.b, this.a);
                        this.G = false;
                    } catch (Throwable th4) {
                        this.G = false;
                        throw th4;
                    }
                }
            }
            B();
            this.F = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final boolean n() {
        int i = this.C;
        return i >= 2000 && i >= this.B.size();
    }

    public final void o() {
        zxj zxjVar = this.b;
        oq90 oq90Var = this.x;
        byte[] bArr = yf61.a;
        try {
            zxjVar.k(oq90Var);
        } catch (FileNotFoundException unused) {
        }
        Iterator it = this.B.values().iterator();
        while (it.hasNext()) {
            rxj rxjVar = (rxj) it.next();
            int i = 0;
            if (rxjVar.g == null) {
                while (i < 2) {
                    this.z += rxjVar.b[i];
                    i++;
                }
            } else {
                rxjVar.g = null;
                while (i < 2) {
                    try {
                        zxjVar.k((oq90) rxjVar.c.get(i));
                    } catch (FileNotFoundException unused2) {
                    }
                    try {
                        zxjVar.k((oq90) rxjVar.d.get(i));
                    } catch (FileNotFoundException unused3) {
                    }
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void v() {
        zxj zxjVar = this.b;
        r1r r1rVar = zxjVar.c;
        oq90 oq90Var = this.w;
        jci0 jci0Var = new jci0(r1rVar.G(oq90Var));
        try {
            String j1 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            String j12 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            String j13 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            String j14 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            String j15 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            if (!"libcore.io.DiskLruCache".equals(j1) || !"1".equals(j12) || !jl40.l(String.valueOf(201105), j13) || !jl40.l(String.valueOf(2), j14) || j15.length() > 0) {
                throw new IOException("unexpected journal header: [" + j1 + Extension.FIX_SPACE + j12 + Extension.FIX_SPACE + j14 + Extension.FIX_SPACE + j15 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    w(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
                    i++;
                } catch (EOFException unused) {
                    this.C = i - this.B.size();
                    if (jci0Var.I1()) {
                        ici0 ici0Var = this.A;
                        if (ici0Var != null) {
                            yf61.b(ici0Var);
                        }
                        this.A = new ici0(new ncp(zxjVar.c.a(oq90Var), new d8(15, this)));
                    } else {
                        B();
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

    public final void w(String str) {
        String substring;
        int G = evu0.G(str, HexString.CHAR_SPACE, 0, 6);
        if (G == -1) {
            ny61.v(g8e.o("unexpected journal line: ", str));
            return;
        }
        int i = G + 1;
        int G2 = evu0.G(str, HexString.CHAR_SPACE, i, 4);
        LinkedHashMap linkedHashMap = this.B;
        if (G2 == -1) {
            substring = str.substring(i);
            String str2 = P;
            if (G == str2.length() && cvu0.x(str, str2, false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, G2);
        }
        rxj rxjVar = (rxj) linkedHashMap.get(substring);
        if (rxjVar == null) {
            rxjVar = new rxj(this, substring);
            linkedHashMap.put(substring, rxjVar);
        }
        if (G2 != -1) {
            String str3 = N;
            if (G == str3.length() && cvu0.x(str, str3, false)) {
                List Y = evu0.Y(str.substring(G2 + 1), new char[]{HexString.CHAR_SPACE}, 0, 6);
                rxjVar.e = true;
                rxjVar.g = null;
                int size = Y.size();
                rxjVar.j.getClass();
                if (size != 2) {
                    w511.h(Y, "unexpected journal line: ");
                    return;
                }
                try {
                    int size2 = Y.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        rxjVar.b[i2] = Long.parseLong((String) Y.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    w511.h(Y, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (G2 == -1) {
            String str4 = O;
            if (G == str4.length() && cvu0.x(str, str4, false)) {
                rxjVar.g = new lxj(this, rxjVar);
                return;
            }
        }
        if (G2 == -1) {
            String str5 = Q;
            if (G == str5.length() && cvu0.x(str, str5, false)) {
                return;
            }
        }
        ny61.v(g8e.o("unexpected journal line: ", str));
    }
}
