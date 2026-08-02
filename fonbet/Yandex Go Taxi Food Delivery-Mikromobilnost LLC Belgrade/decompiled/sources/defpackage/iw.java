package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class iw implements jw {
    public final u1m a;
    public final String b;
    public final String c;

    public iw(u1m u1mVar, String str, String str2) {
        this.a = u1mVar;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final u1m b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!iw.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        iw iwVar = (iw) obj;
        return jl40.l(this.a, iwVar.a) && jl40.l(this.b, iwVar.b) && this.c.equals(iwVar.c);
    }

    public final int hashCode() {
        u1m u1mVar = this.a;
        int hashCode = (u1mVar != null ? u1mVar.hashCode() : 0) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Unsupported(query=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", actionType=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
