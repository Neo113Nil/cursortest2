package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class dh7 {
    public final String a;
    public final int b;
    public final Set c;
    public final Set d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Boolean h;
    public final Long i;

    public dh7(String str, int i, Set set, Set set2, String str2, String str3, Integer num, Boolean bool, Long l) {
        this.a = str;
        this.b = i;
        this.c = set;
        this.d = set2;
        this.e = str2;
        this.f = str3;
        this.g = num;
        this.h = bool;
        this.i = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh7)) {
            return false;
        }
        dh7 dh7Var = (dh7) obj;
        return jl40.l(this.a, dh7Var.a) && this.b == dh7Var.b && this.c.equals(dh7Var.c) && this.d.equals(dh7Var.d) && jl40.l(this.e, dh7Var.e) && jl40.l(this.f, dh7Var.f) && jl40.l(this.g, dh7Var.g) && jl40.l(this.h, dh7Var.h) && jl40.l(this.i, dh7Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        int e = g8e.e(this.d, g8e.e(this.c, oyr.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31);
        String str2 = this.e;
        int hashCode = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.g;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.h;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.i;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "CallFeedback(callGuid=", this.a, ", score=", ", audioReasons=");
        u.append(this.c);
        u.append(", videoReasons=");
        u.append(this.d);
        u.append(", details=");
        g8e.D(u, this.e, ", meetingId=", this.f, ", meetingEndReason=");
        u.append(this.g);
        u.append(", isInitiator=");
        u.append(this.h);
        u.append(", timestamp=");
        u.append(this.i);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
