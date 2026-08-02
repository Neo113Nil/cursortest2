package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class e3s implements h3s {
    public final Object a;
    public final cb3 b;

    public e3s(Object obj, cb3 cb3Var) {
        this.a = obj;
        this.b = cb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3s)) {
            return false;
        }
        e3s e3sVar = (e3s) obj;
        return jl40.l(this.a, e3sVar.a) && jl40.l(this.b, e3sVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cb3 cb3Var = this.b;
        return hashCode + (cb3Var == null ? 0 : cb3Var.hashCode());
    }

    public final String toString() {
        return "InProgress(formStateValue=" + this.a + ", communication=" + this.b + Extension.C_BRAKE;
    }
}
