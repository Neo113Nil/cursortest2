package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mqp0 extends crp0 {
    public final String c;
    public final Object d;
    public final String e;

    public mqp0(String str, String str2, Object obj) {
        super("Logic", str);
        this.c = str;
        this.d = obj;
        this.e = str2;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqp0)) {
            return false;
        }
        mqp0 mqp0Var = (mqp0) obj;
        return jl40.l(this.c, mqp0Var.c) && jl40.l(this.d, mqp0Var.d) && jl40.l(this.e, mqp0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Object obj = this.d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Logic(message=");
        sb.append(this.c);
        sb.append(", payload=");
        sb.append(this.d);
        sb.append(", tags=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ mqp0(String str, Object obj) {
        this(str, null, obj);
    }
}
