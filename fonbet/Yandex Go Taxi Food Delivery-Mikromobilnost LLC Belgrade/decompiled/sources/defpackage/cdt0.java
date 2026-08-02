package defpackage;

import java.io.File;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes10.dex */
public final class cdt0 extends zev {
    public final wev a;
    public boolean b;
    public qq6 c;
    public sls w;
    public oq90 x;

    public cdt0(qq6 qq6Var, sls slsVar, wev wevVar) {
        this.a = wevVar;
        this.c = qq6Var;
        this.w = slsVar;
    }

    @Override // defpackage.zev
    public final synchronized oq90 K0() {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        return this.x;
    }

    @Override // defpackage.zev
    public final synchronized oq90 a() {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        oq90 oq90Var = this.x;
        if (oq90Var != null) {
            return oq90Var;
        }
        File file = (File) this.w.invoke();
        if (!file.isDirectory()) {
            throw new IllegalStateException("cacheDirectory must be a directory.");
        }
        String str = oq90.b;
        oq90 e = sms.e(File.createTempFile(CSPDirectoryConstants.SUBDIRECTORY_TMP, null, file));
        ici0 ici0Var = new ici0(r1r.a.D(e, false));
        try {
            ici0Var.N1(this.c);
            try {
                ici0Var.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                ici0Var.close();
            } catch (Throwable th3) {
                ljo.a(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
        this.c = null;
        this.x = e;
        this.w = null;
        return e;
    }

    @Override // defpackage.zev
    public final wev c() {
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.b = true;
            qq6 qq6Var = this.c;
            if (qq6Var != null) {
                m.a(qq6Var);
            }
            oq90 oq90Var = this.x;
            if (oq90Var != null) {
                r1r.a.k(oq90Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.zev
    public final synchronized qq6 source() {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        qq6 qq6Var = this.c;
        if (qq6Var != null) {
            return qq6Var;
        }
        jci0 jci0Var = new jci0(r1r.a.G(this.x));
        this.c = jci0Var;
        return jci0Var;
    }
}
