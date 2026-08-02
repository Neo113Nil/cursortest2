package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class m9o implements mev {
    public final q7v a;
    public final gev b;
    public final Throwable c;

    public m9o(q7v q7vVar, gev gevVar, Throwable th) {
        this.a = q7vVar;
        this.b = gevVar;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9o)) {
            return false;
        }
        m9o m9oVar = (m9o) obj;
        return jl40.l(this.a, m9oVar.a) && jl40.l(this.b, m9oVar.b) && this.c.equals(m9oVar.c);
    }

    @Override // defpackage.mev
    public final q7v f() {
        return this.a;
    }

    @Override // defpackage.mev
    public final gev getRequest() {
        return this.b;
    }

    public final int hashCode() {
        q7v q7vVar = this.a;
        int hashCode = q7vVar == null ? 0 : q7vVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + Extension.C_BRAKE;
    }
}
