package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class bae extends s120 {
    public final g720 a;
    public final String b;
    public final String c;
    public final String d = "Messaging.Arguments.Key.ContactInfo";

    public bae(g720 g720Var, String str, String str2) {
        this.a = g720Var;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.d;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bae)) {
            return false;
        }
        bae baeVar = (bae) obj;
        return jl40.l(this.a, baeVar.a) && jl40.l(this.b, baeVar.b) && jl40.l(this.c, baeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactInfoArguments(source=");
        sb.append(this.a);
        sb.append(", sourceChatId=");
        sb.append(this.b);
        sb.append(", userId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
