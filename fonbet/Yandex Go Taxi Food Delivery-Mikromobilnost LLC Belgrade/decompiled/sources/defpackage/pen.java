package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pen {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final qen e;
    public final Map f;

    public pen(String str, String str2, String str3, String str4, qen qenVar, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = qenVar;
        this.f = map;
    }

    public final String a() {
        return this.d;
    }

    public final Map b() {
        return this.f;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pen)) {
            return false;
        }
        pen penVar = (pen) obj;
        return jl40.l(this.a, penVar.a) && jl40.l(this.b, penVar.b) && jl40.l(this.c, penVar.c) && jl40.l(this.d, penVar.d) && jl40.l(this.e, penVar.e) && this.f.equals(penVar.f);
    }

    public final qen f() {
        return this.e;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        qen qenVar = this.e;
        return this.f.hashCode() + ((hashCode4 + (qenVar != null ? qenVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Button(title=", this.a, ", titleLeadImageTag=", this.b, ", titleLeadImageColor=");
        g8e.D(v, this.c, ", deeplink=", this.d, ", webCustomTabsAction=");
        v.append(this.e);
        v.append(", payload=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
