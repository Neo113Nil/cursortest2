package yads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xsna.pft0;

/* loaded from: classes10.dex */
public final class rr implements p30 {
    public final nr a;
    public final p30 b;
    public final u63 c;
    public final p30 d;
    public final yr e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public Uri i;
    public u30 j;
    public u30 k;
    public p30 l;
    public long m;
    public long n;
    public long o;
    public c03 p;
    public boolean q;
    public boolean r;
    public long s;

    public rr(nr nrVar, p30 p30Var, dv0 dv0Var, pr prVar, yr yrVar, int i) {
        this.a = nrVar;
        this.b = dv0Var;
        this.e = yrVar == null ? yr.a : yrVar;
        this.f = (i & 1) != 0;
        this.g = false;
        this.h = false;
        if (p30Var != null) {
            this.d = p30Var;
            this.c = prVar != null ? new u63(p30Var, prVar) : null;
        } else {
            this.d = fe2.a;
            this.c = null;
        }
    }

    @Override // yads.p30
    public final void a(v93 v93Var) {
        v93Var.getClass();
        this.b.a(v93Var);
        this.d.a(v93Var);
    }

    @Override // yads.p30
    public final void close() {
        this.j = null;
        this.i = null;
        this.n = 0L;
        try {
            d();
        } catch (Throwable th) {
            if (g() || (th instanceof kr)) {
                this.q = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        p30 p30Var = this.l;
        if (p30Var == null) {
            return;
        }
        try {
            p30Var.close();
        } finally {
            this.k = null;
            this.l = null;
            c03 c03Var = this.p;
            if (c03Var != null) {
                ((zz2) this.a).a((zr) c03Var);
                this.p = null;
            }
        }
    }

    public final nr e() {
        return this.a;
    }

    public final yr f() {
        return this.e;
    }

    public final boolean g() {
        return this.l == this.b;
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return !g() ? this.d.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r18.m < r14) goto L26;
     */
    @Override // yads.l30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] bArr, int i, int i2) {
        long j;
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        u30 u30Var = this.j;
        u30Var.getClass();
        u30 u30Var2 = this.k;
        u30Var2.getClass();
        try {
            if (this.n >= this.s) {
                a(u30Var, true);
            }
            p30 p30Var = this.l;
            p30Var.getClass();
            int read = p30Var.read(bArr, i, i2);
            if (read == -1) {
                if (g()) {
                    j = -1;
                } else {
                    long j2 = u30Var2.g;
                    if (j2 != -1) {
                        j = -1;
                    }
                    String str = u30Var.h;
                    int i3 = mc3.a;
                    this.o = 0L;
                    if (this.l == this.c) {
                        rz rzVar = new rz();
                        rzVar.a.put("exo_len", Long.valueOf(this.n));
                        rzVar.b.remove("exo_len");
                        ((zz2) this.a).a(str, rzVar);
                        return read;
                    }
                }
                long j3 = this.o;
                if (j3 <= 0) {
                    if (j3 == j) {
                    }
                }
                d();
                a(u30Var, false);
                return read(bArr, i, i2);
            }
            long j4 = read;
            this.n += j4;
            this.m += j4;
            long j5 = this.o;
            if (j5 != -1) {
                this.o = j5 - j4;
                return read;
            }
            return read;
        } catch (Throwable th) {
            if (g() || (th instanceof kr)) {
                this.q = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:3:0x0004, B:8:0x004d, B:10:0x005a, B:14:0x006e, B:16:0x0074, B:17:0x009b, B:19:0x00a1, B:22:0x00ac, B:23:0x00a8, B:24:0x00ae, B:28:0x00bb, B:32:0x00c2, B:34:0x00b8, B:35:0x0077, B:37:0x0089, B:40:0x0093, B:41:0x009a, B:42:0x0061, B:44:0x0065, B:47:0x0046), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:3:0x0004, B:8:0x004d, B:10:0x005a, B:14:0x006e, B:16:0x0074, B:17:0x009b, B:19:0x00a1, B:22:0x00ac, B:23:0x00a8, B:24:0x00ae, B:28:0x00bb, B:32:0x00c2, B:34:0x00b8, B:35:0x0077, B:37:0x0089, B:40:0x0093, B:41:0x009a, B:42:0x0061, B:44:0x0065, B:47:0x0046), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {all -> 0x005f, blocks: (B:3:0x0004, B:8:0x004d, B:10:0x005a, B:14:0x006e, B:16:0x0074, B:17:0x009b, B:19:0x00a1, B:22:0x00ac, B:23:0x00a8, B:24:0x00ae, B:28:0x00bb, B:32:0x00c2, B:34:0x00b8, B:35:0x0077, B:37:0x0089, B:40:0x0093, B:41:0x009a, B:42:0x0061, B:44:0x0065, B:47:0x0046), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:3:0x0004, B:8:0x004d, B:10:0x005a, B:14:0x006e, B:16:0x0074, B:17:0x009b, B:19:0x00a1, B:22:0x00ac, B:23:0x00a8, B:24:0x00ae, B:28:0x00bb, B:32:0x00c2, B:34:0x00b8, B:35:0x0077, B:37:0x0089, B:40:0x0093, B:41:0x009a, B:42:0x0061, B:44:0x0065, B:47:0x0046), top: B:2:0x0004 }] */
    @Override // yads.p30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(u30 u30Var) {
        boolean z;
        long j;
        long j2;
        try {
            ((pft0) this.e).getClass();
            String b = yr.b(u30Var);
            u30Var.getClass();
            Uri uri = u30Var.a;
            long j3 = u30Var.b;
            int i = u30Var.c;
            byte[] bArr = u30Var.d;
            Map map = u30Var.e;
            long j4 = u30Var.f;
            long j5 = u30Var.g;
            int i2 = u30Var.i;
            Object obj = u30Var.j;
            ni.a(uri, "The uri must be set.");
            u30 u30Var2 = new u30(uri, j3, i, bArr, map, j4, j5, b, i2, obj);
            this.j = u30Var2;
            nr nrVar = this.a;
            Uri uri2 = u30Var2.a;
            String a = ((zz2) nrVar).b(b).a();
            Uri parse = a == null ? null : Uri.parse(a);
            if (parse != null) {
                uri2 = parse;
            }
            this.i = uri2;
            this.n = u30Var.f;
            if ((!this.g || !this.q) && (!this.h || u30Var.g != -1)) {
                z = false;
                this.r = z;
                if (!z) {
                    this.o = -1L;
                } else {
                    long a2 = qz.a(((zz2) this.a).b(b));
                    this.o = a2;
                    if (a2 != -1) {
                        long j6 = a2 - u30Var.f;
                        this.o = j6;
                        if (j6 < 0) {
                            throw new q30(2008);
                        }
                    }
                }
                j = u30Var.g;
                if (j != -1) {
                    long j7 = this.o;
                    if (j7 != -1) {
                        j = Math.min(j7, j);
                    }
                    this.o = j;
                }
                j2 = this.o;
                if (j2 <= 0 || j2 == -1) {
                    a(u30Var2, false);
                }
                long j8 = u30Var.g;
                return j8 == -1 ? j8 : this.o;
            }
            z = true;
            this.r = z;
            if (!z) {
            }
            j = u30Var.g;
            if (j != -1) {
            }
            j2 = this.o;
            if (j2 <= 0) {
            }
            a(u30Var2, false);
            long j82 = u30Var.g;
            if (j82 == -1) {
            }
        } catch (Throwable th) {
            if (g() || (th instanceof kr)) {
                this.q = true;
            }
            throw th;
        }
    }

    public final void a(u30 u30Var, boolean z) {
        c03 c;
        long j;
        u30 u30Var2;
        p30 p30Var;
        String str = u30Var.h;
        int i = mc3.a;
        if (this.r) {
            c = null;
        } else if (this.f) {
            try {
                nr nrVar = this.a;
                long j2 = this.n;
                long j3 = this.o;
                zz2 zz2Var = (zz2) nrVar;
                synchronized (zz2Var) {
                    zz2Var.a();
                    while (true) {
                        c = zz2Var.c(str, j2, j3);
                        if (c != null) {
                            break;
                        } else {
                            zz2Var.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            c = ((zz2) this.a).c(str, this.n, this.o);
        }
        if (c == null) {
            p30 p30Var2 = this.d;
            Uri uri = u30Var.a;
            long j4 = u30Var.b;
            int i2 = u30Var.c;
            byte[] bArr = u30Var.d;
            Map map = u30Var.e;
            String str2 = u30Var.h;
            int i3 = u30Var.i;
            j = -1;
            Object obj = u30Var.j;
            long j5 = this.n;
            long j6 = this.o;
            ni.a(uri, "The uri must be set.");
            u30Var2 = new u30(uri, j4, i2, bArr, map, j5, j6, str2, i3, obj);
            c = c;
            p30Var = p30Var2;
        } else {
            j = -1;
            if (c.e) {
                Uri fromFile = Uri.fromFile(c.f);
                long j7 = c.c;
                long j8 = this.n - j7;
                long j9 = c.d - j8;
                long j10 = this.o;
                if (j10 != -1) {
                    j9 = Math.min(j9, j10);
                }
                long j11 = j9;
                int i4 = u30Var.c;
                byte[] bArr2 = u30Var.d;
                Map map2 = u30Var.e;
                String str3 = u30Var.h;
                int i5 = u30Var.i;
                Object obj2 = u30Var.j;
                ni.a(fromFile, "The uri must be set.");
                u30Var2 = new u30(fromFile, j7, i4, bArr2, map2, j8, j11, str3, i5, obj2);
                p30Var = this.b;
            } else {
                long j12 = c.d;
                if (j12 == -1) {
                    j12 = this.o;
                } else {
                    long j13 = this.o;
                    if (j13 != -1) {
                        j12 = Math.min(j12, j13);
                    }
                }
                long j14 = j12;
                Uri uri2 = u30Var.a;
                long j15 = u30Var.b;
                int i6 = u30Var.c;
                byte[] bArr3 = u30Var.d;
                Map map3 = u30Var.e;
                String str4 = u30Var.h;
                int i7 = u30Var.i;
                Object obj3 = u30Var.j;
                long j16 = this.n;
                ni.a(uri2, "The uri must be set.");
                u30Var2 = new u30(uri2, j15, i6, bArr3, map3, j16, j14, str4, i7, obj3);
                p30Var = this.c;
                if (p30Var == null) {
                    p30Var = this.d;
                    ((zz2) this.a).a((zr) c);
                    c = null;
                }
            }
        }
        this.s = (this.r || p30Var != this.d) ? Long.MAX_VALUE : this.n + 102400;
        if (z) {
            p30 p30Var3 = this.l;
            p30 p30Var4 = this.d;
            if (p30Var3 != p30Var4) {
                throw new IllegalStateException();
            }
            if (p30Var == p30Var4) {
                return;
            }
            try {
                d();
            } catch (Throwable th) {
                if (!c.e) {
                    ((zz2) this.a).a((zr) c);
                }
                throw th;
            }
        }
        if (c != null && !c.e) {
            this.p = c;
        }
        this.l = p30Var;
        this.k = u30Var2;
        this.m = 0L;
        long a = p30Var.a(u30Var2);
        rz rzVar = new rz();
        if (u30Var2.g == j && a != j) {
            this.o = a;
            rzVar.a.put("exo_len", Long.valueOf(this.n + a));
            rzVar.b.remove("exo_len");
        }
        if (!g()) {
            Uri uri3 = p30Var.getUri();
            this.i = uri3;
            Uri uri4 = !u30Var.a.equals(uri3) ? this.i : null;
            if (uri4 == null) {
                rzVar.b.add("exo_redir");
                rzVar.a.remove("exo_redir");
            } else {
                String uri5 = uri4.toString();
                HashMap hashMap = rzVar.a;
                uri5.getClass();
                hashMap.put("exo_redir", uri5);
                rzVar.b.remove("exo_redir");
            }
        }
        if (this.l == this.c) {
            ((zz2) this.a).a(str, rzVar);
        }
    }
}
