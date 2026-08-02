package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gsc {
    public final kb5 a;
    public final Object b;

    public gsc(kb5 kb5Var, Object obj) {
        this.a = kb5Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsc)) {
            return false;
        }
        gsc gscVar = (gsc) obj;
        return jl40.l(this.a, gscVar.a) && jl40.l(this.b, gscVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "CommunicationItem(info=" + this.a + ", data=" + this.b + Extension.C_BRAKE;
    }
}
