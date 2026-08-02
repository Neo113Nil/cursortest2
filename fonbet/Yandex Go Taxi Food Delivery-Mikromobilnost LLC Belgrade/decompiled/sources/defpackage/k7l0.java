package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class k7l0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final s9e g;
    public final List h;

    public k7l0(int i, String str, String str2, String str3, String str4, String str5, s9e s9eVar, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = s9eVar;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7l0)) {
            return false;
        }
        k7l0 k7l0Var = (k7l0) obj;
        return this.a == k7l0Var.a && jl40.l(this.b, k7l0Var.b) && jl40.l(this.c, k7l0Var.c) && jl40.l(this.d, k7l0Var.d) && jl40.l(this.e, k7l0Var.e) && jl40.l(this.f, k7l0Var.f) && jl40.l(this.g, k7l0Var.g) && jl40.l(this.h, k7l0Var.h);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        s9e s9eVar = this.g;
        int hashCode7 = (hashCode6 + (s9eVar == null ? 0 : s9eVar.hashCode())) * 31;
        List list = this.h;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "RoutePointDetails(index=", ", entrance=", this.b, ", code=");
        g8e.D(v, this.c, ", floor=", this.d, ", room=");
        g8e.D(v, this.e, ", comment=", this.f, ", contact=");
        v.append(this.g);
        v.append(", photocomments=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
