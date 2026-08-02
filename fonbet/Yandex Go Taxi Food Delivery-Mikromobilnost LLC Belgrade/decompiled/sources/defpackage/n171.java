package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import yads.h30;
import yads.wq;

/* loaded from: classes7.dex */
public final class n171 implements u871 {
    public no71 A;
    public no71 B;
    public u871 C;
    public long D;
    public long E;
    public long F;
    public c871 G;
    public long H;
    public final l291 a;
    public final qk71 b;
    public final qk81 c;
    public final u871 w;
    public final ee71 x = ee71.w5;
    public final boolean y;
    public Uri z;

    public n171(z171 z171Var, u871 u871Var, qk71 qk71Var, hn61 hn61Var, int i) {
        this.a = z171Var;
        this.b = qk71Var;
        this.y = (i & 1) != 0;
        if (u871Var != null) {
            this.w = u871Var;
            this.c = hn61Var != null ? new qk81(u871Var, hn61Var) : null;
        } else {
            this.w = es71.a;
            this.c = null;
        }
    }

    @Override // defpackage.u871
    public final long Q(no71 no71Var) {
        l291 l291Var = this.a;
        try {
            String b = ((yx61) this.x).b(no71Var);
            long j = no71Var.f;
            long j2 = no71Var.e;
            Uri uri = no71Var.a;
            long j3 = no71Var.b;
            byte[] bArr = no71Var.c;
            Map map = no71Var.d;
            int i = no71Var.h;
            cha1.b(uri, "The uri must be set.");
            no71 no71Var2 = new no71(uri, j3, bArr, map, j2, j, b, i);
            this.A = no71Var2;
            byte[] bArr2 = (byte[]) ((z171) l291Var).j(b).b.get("exo_redir");
            String str = bArr2 != null ? new String(bArr2, md81.c) : null;
            Uri parse = str == null ? null : Uri.parse(str);
            if (parse != null) {
                uri = parse;
            }
            this.z = uri;
            this.E = j2;
            long a = j571.a(((z171) l291Var).j(b));
            this.F = a;
            if (a != -1) {
                long j4 = a - j2;
                this.F = j4;
                if (j4 < 0) {
                    throw new h30();
                }
            }
            if (j != -1) {
                long j5 = this.F;
                this.F = j5 == -1 ? j : Math.min(j5, j);
            }
            long j6 = this.F;
            if (j6 > 0 || j6 == -1) {
                a(no71Var2, false);
            }
            return j != -1 ? j : this.F;
        } finally {
        }
    }

    @Override // defpackage.u871
    public final void S(mr81 mr81Var) {
        mr81Var.getClass();
        this.b.S(mr81Var);
        this.w.S(mr81Var);
    }

    public final void a(no71 no71Var, boolean z) {
        c871 m;
        long j;
        long j2;
        no71 no71Var2;
        u871 u871Var;
        String str = no71Var.g;
        int i = rf71.a;
        boolean z2 = this.y;
        l291 l291Var = this.a;
        long j3 = this.E;
        if (z2) {
            try {
                long j4 = this.F;
                z171 z171Var = (z171) l291Var;
                synchronized (z171Var) {
                    z171Var.c();
                    while (true) {
                        m = z171Var.m(j3, j4, str);
                        if (m != null) {
                            break;
                        } else {
                            z171Var.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            m = ((z171) l291Var).m(j3, this.F, str);
        }
        if (m == null) {
            u871Var = this.w;
            Uri uri = no71Var.a;
            long j5 = no71Var.b;
            byte[] bArr = no71Var.c;
            Map map = no71Var.d;
            String str2 = no71Var.g;
            int i2 = no71Var.h;
            j = -1;
            long j6 = this.E;
            long j7 = this.F;
            cha1.b(uri, "The uri must be set.");
            no71Var2 = new no71(uri, j5, bArr, map, j6, j7, str2, i2);
        } else {
            j = -1;
            if (m.w) {
                Uri fromFile = Uri.fromFile(m.x);
                long j8 = m.b;
                long j9 = this.E - j8;
                long j10 = m.c - j9;
                long j11 = this.F;
                if (j11 != -1) {
                    j10 = Math.min(j10, j11);
                }
                long j12 = j10;
                byte[] bArr2 = no71Var.c;
                Map map2 = no71Var.d;
                String str3 = no71Var.g;
                int i3 = no71Var.h;
                cha1.b(fromFile, "The uri must be set.");
                no71Var2 = new no71(fromFile, j8, bArr2, map2, j9, j12, str3, i3);
                u871Var = this.b;
            } else {
                long j13 = m.c;
                long j14 = this.F;
                if (j13 == -1) {
                    j2 = j14;
                } else {
                    if (j14 != -1) {
                        j13 = Math.min(j13, j14);
                    }
                    j2 = j13;
                }
                Uri uri2 = no71Var.a;
                long j15 = no71Var.b;
                byte[] bArr3 = no71Var.c;
                Map map3 = no71Var.d;
                String str4 = no71Var.g;
                int i4 = no71Var.h;
                long j16 = this.E;
                cha1.b(uri2, "The uri must be set.");
                no71Var2 = new no71(uri2, j15, bArr3, map3, j16, j2, str4, i4);
                u871Var = this.c;
                if (u871Var == null) {
                    u871Var = this.w;
                    ((z171) this.a).l(m);
                    m = null;
                }
            }
        }
        u871 u871Var2 = this.w;
        this.H = u871Var == u871Var2 ? this.E + 102400 : ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        if (z) {
            if (this.C != u871Var2) {
                ny61.k();
                return;
            } else {
                if (u871Var == u871Var2) {
                    return;
                }
                try {
                    g();
                } catch (Throwable th) {
                    if (!m.w) {
                        ((z171) this.a).l(m);
                    }
                    throw th;
                }
            }
        }
        if (m != null && !m.w) {
            this.G = m;
        }
        this.C = u871Var;
        this.B = no71Var2;
        this.D = 0L;
        long Q = u871Var.Q(no71Var2);
        g871 g871Var = new g871();
        if (no71Var2.f == j && Q != j) {
            this.F = Q;
            g871Var.a.put("exo_len", Long.valueOf(this.E + Q));
            g871Var.b.remove("exo_len");
        }
        if (!h()) {
            Uri d = u871Var.d();
            this.z = d;
            Uri uri3 = !no71Var.a.equals(d) ? this.z : null;
            if (uri3 == null) {
                g871Var.b.add("exo_redir");
                g871Var.a.remove("exo_redir");
            } else {
                String uri4 = uri3.toString();
                HashMap hashMap = g871Var.a;
                uri4.getClass();
                hashMap.put("exo_redir", uri4);
                g871Var.b.remove("exo_redir");
            }
        }
        if (this.C == this.c) {
            ((z171) this.a).g(str, g871Var);
        }
    }

    @Override // defpackage.u871
    public final Map b() {
        return !h() ? this.w.b() : Collections.EMPTY_MAP;
    }

    @Override // defpackage.u871
    public final void close() {
        this.A = null;
        this.z = null;
        this.E = 0L;
        try {
            g();
        } catch (Throwable th) {
            if (!h()) {
                boolean z = th instanceof wq;
            }
            throw th;
        }
    }

    @Override // defpackage.u871
    public final Uri d() {
        return this.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        l291 l291Var = this.a;
        u871 u871Var = this.C;
        if (u871Var == null) {
            return;
        }
        try {
            u871Var.close();
        } finally {
            this.B = null;
            this.C = null;
            c871 c871Var = this.G;
            if (c871Var != null) {
                ((z171) l291Var).l(c871Var);
                this.G = null;
            }
        }
    }

    public final boolean h() {
        return this.C == this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r17.D < r13) goto L26;
     */
    @Override // defpackage.jz61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int v(int i, int i2, byte[] bArr) {
        long j;
        if (i2 == 0) {
            return 0;
        }
        if (this.F == 0) {
            return -1;
        }
        no71 no71Var = this.A;
        no71Var.getClass();
        no71 no71Var2 = this.B;
        no71Var2.getClass();
        try {
            if (this.E >= this.H) {
                a(no71Var, true);
            }
            u871 u871Var = this.C;
            u871Var.getClass();
            int v = u871Var.v(i, i2, bArr);
            if (v == -1) {
                if (h()) {
                    j = -1;
                } else {
                    long j2 = no71Var2.f;
                    if (j2 != -1) {
                        j = -1;
                    }
                    String str = no71Var.g;
                    int i3 = rf71.a;
                    this.F = 0L;
                    if (this.C == this.c) {
                        g871 g871Var = new g871();
                        g871Var.a.put("exo_len", Long.valueOf(this.E));
                        g871Var.b.remove("exo_len");
                        ((z171) this.a).g(str, g871Var);
                        return v;
                    }
                }
                long j3 = this.F;
                if (j3 <= 0) {
                    if (j3 == j) {
                    }
                }
                g();
                a(no71Var, false);
                return v(i, i2, bArr);
            }
            long j4 = v;
            this.E += j4;
            this.D += j4;
            long j5 = this.F;
            if (j5 != -1) {
                this.F = j5 - j4;
                return v;
            }
            return v;
        } catch (Throwable th) {
            if (!h()) {
                boolean z = th instanceof wq;
            }
            throw th;
        }
    }
}
