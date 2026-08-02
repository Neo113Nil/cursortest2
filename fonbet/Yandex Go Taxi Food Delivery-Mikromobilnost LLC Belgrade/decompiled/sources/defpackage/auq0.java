package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class auq0 {
    public final String a;
    public final String b;
    public final String c;
    public final euq0 d;
    public final Integer e;

    public auq0(String str, String str2, String str3, euq0 euq0Var, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = euq0Var;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auq0)) {
            return false;
        }
        auq0 auq0Var = (auq0) obj;
        return jl40.l(this.a, auq0Var.a) && jl40.l(this.b, auq0Var.b) && jl40.l(this.c, auq0Var.c) && this.d.equals(auq0Var.d) && jl40.l(this.e, auq0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        Integer num = this.e;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ServerTooltipEntity(name=", this.a, ", eventId=", this.b, ", defaultsGroup=");
        v.append(this.c);
        v.append(", model=");
        v.append(this.d);
        v.append(", showingDelayMs=");
        return oo31.j(v, this.e, Extension.C_BRAKE);
    }
}
