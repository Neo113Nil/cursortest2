package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ojt0 implements AutoCloseable {
    public final qq6 a;

    public final void a(r1r r1rVar, oq90 oq90Var) {
        qq6 qq6Var = this.a;
        ici0 ici0Var = new ici0(r1rVar.D(oq90Var, false));
        try {
            new Long(qq6Var.y0(ici0Var));
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
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ojt0) {
            return this.a.equals(((ojt0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.a + Extension.C_BRAKE;
    }
}
