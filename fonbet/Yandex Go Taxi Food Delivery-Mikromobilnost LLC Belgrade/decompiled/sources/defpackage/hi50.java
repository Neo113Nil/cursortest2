package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hi50 extends ji50 {
    public final String a;
    public final d51 b;
    public final String c;
    public final String d;
    public final Address e;
    public final boolean f;
    public final boolean g;
    public final tls h;

    public hi50(String str, d51 d51Var, String str2, String str3, Address address, boolean z, boolean z2, tls tlsVar) {
        this.a = str;
        this.b = d51Var;
        this.c = str2;
        this.d = str3;
        this.e = address;
        this.f = z;
        this.g = z2;
        this.h = tlsVar;
    }

    @Override // defpackage.ji50
    public final boolean a() {
        return this.g;
    }

    @Override // defpackage.ji50
    public final d51 b() {
        return this.b;
    }

    @Override // defpackage.ji50
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi50)) {
            return false;
        }
        hi50 hi50Var = (hi50) obj;
        return jl40.l(this.a, hi50Var.a) && this.b.equals(hi50Var.b) && jl40.l(this.c, hi50Var.c) && this.d.equals(hi50Var.d) && jl40.l(this.e, hi50Var.e) && this.f == hi50Var.f && this.g == hi50Var.g && this.h.equals(hi50Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Address address = this.e;
        return this.h.hashCode() + unr0.e(unr0.e((b + (address != null ? address.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NddForm(tariffClass=");
        sb.append(this.a);
        sb.append(", routeType=");
        sb.append(this.b);
        sb.append(", currentMode=");
        g8e.D(sb, this.c, ", userState=", this.d, ", preselectedAddress=");
        sb.append(this.e);
        sb.append(", shouldSelectAddressInPlace=");
        sb.append(this.f);
        sb.append(", enableCourierFlow=");
        sb.append(this.g);
        sb.append(", onAddressSelected=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
