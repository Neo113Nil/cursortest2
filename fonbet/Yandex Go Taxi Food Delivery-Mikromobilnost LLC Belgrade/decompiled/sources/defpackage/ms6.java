package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ms6 implements os6 {
    public final String a;
    public final String b;
    public final Address c;

    public ms6(String str, String str2, Address address) {
        this.a = str;
        this.b = str2;
        this.c = address;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms6)) {
            return false;
        }
        ms6 ms6Var = (ms6) obj;
        return jl40.l(this.a, ms6Var.a) && jl40.l(this.b, ms6Var.b) && jl40.l(this.c, ms6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("Content(title=", this.a, ", etaAndDistance=", this.b, ", address=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
