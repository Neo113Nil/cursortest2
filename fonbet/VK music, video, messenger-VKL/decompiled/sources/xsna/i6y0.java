package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.zip.Inflater;
import xsna.aq90;

/* compiled from: ZipFileSystem.kt */
/* loaded from: classes8.dex */
public final class i6y0 extends tar {
    public static final aq90 e;
    public final aq90 b;
    public final tar c;
    public final LinkedHashMap d;

    static {
        String str = aq90.c;
        e = aq90.a.a(DomExceptionUtils.SEPARATOR, false);
    }

    public i6y0(aq90 aq90Var, tar tarVar, LinkedHashMap linkedHashMap) {
        this.b = aq90Var;
        this.c = tarVar;
        this.d = linkedHashMap;
    }

    @Override // xsna.tar
    public final void a(aq90 aq90Var, aq90 aq90Var2) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // xsna.tar
    public final void b(aq90 aq90Var) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // xsna.tar
    public final void c(aq90 aq90Var) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // xsna.tar
    public final n9r e(aq90 aq90Var) {
        n9r n9rVar;
        Throwable th;
        aq90 aq90Var2 = e;
        aq90Var2.getClass();
        h6y0 h6y0Var = (h6y0) this.d.get(d.b(aq90Var2, aq90Var, true));
        Throwable th2 = null;
        if (h6y0Var == null) {
            return null;
        }
        long j = h6y0Var.g;
        boolean z = h6y0Var.b;
        n9r n9rVar2 = new n9r(!z, z, z ? null : Long.valueOf(h6y0Var.d), null, h6y0Var.f, null);
        if (j == -1) {
            return n9rVar2;
        }
        y8r f = this.c.f(this.b);
        try {
            e8f0 e8f0Var = new e8f0(f.s(j));
            try {
                n9rVar = l6y0.f(e8f0Var, n9rVar2);
                try {
                    e8f0Var.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    e8f0Var.close();
                } catch (Throwable th5) {
                    mnh0.d(th4, th5);
                }
                th = th4;
                n9rVar = null;
            }
        } catch (Throwable th6) {
            if (f != null) {
                try {
                    f.close();
                } catch (Throwable th7) {
                    mnh0.d(th6, th7);
                }
            }
            n9rVar = null;
            th2 = th6;
        }
        if (th != null) {
            throw th;
        }
        try {
            f.close();
        } catch (Throwable th8) {
            th2 = th8;
        }
        if (th2 == null) {
            return n9rVar;
        }
        throw th2;
    }

    @Override // xsna.tar
    public final y8r f(aq90 aq90Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // xsna.tar
    public final y8r g(aq90 aq90Var) {
        throw new IOException("zip entries are not writable");
    }

    @Override // xsna.tar
    public final agk0 h(aq90 aq90Var) throws IOException {
        e8f0 e8f0Var;
        Throwable th;
        aq90 aq90Var2 = e;
        aq90Var2.getClass();
        h6y0 h6y0Var = (h6y0) this.d.get(d.b(aq90Var2, aq90Var, true));
        if (h6y0Var == null) {
            throw new FileNotFoundException("no such file: " + aq90Var);
        }
        long j = h6y0Var.d;
        y8r f = this.c.f(this.b);
        try {
            e8f0Var = new e8f0(f.s(h6y0Var.g));
            try {
                f.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (f != null) {
                try {
                    f.close();
                } catch (Throwable th4) {
                    mnh0.d(th3, th4);
                }
            }
            e8f0Var = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        l6y0.f(e8f0Var, null);
        return h6y0Var.e == 0 ? new bnr(e8f0Var, j, true) : new bnr(new evw(new bnr(e8f0Var, h6y0Var.c, true), new Inflater(true)), j, false);
    }
}
