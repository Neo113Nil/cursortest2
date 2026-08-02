package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class f6v {
    public final h6v a;
    public final Object b;

    public f6v(h6v h6vVar, Object obj) {
        this.a = h6vVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6v)) {
            return false;
        }
        f6v f6vVar = (f6v) obj;
        return jl40.l(this.a, f6vVar.a) && jl40.l(this.b, f6vVar.b);
    }

    public final int hashCode() {
        h6v h6vVar = this.a;
        int hashCode = (h6vVar == null ? 0 : h6vVar.hashCode()) * 31;
        Object obj = this.b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "Identifiable(key=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
