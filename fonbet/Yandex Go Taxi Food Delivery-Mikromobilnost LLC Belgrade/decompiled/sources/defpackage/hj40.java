package defpackage;

import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hj40 {
    public final String a;
    public final String b;
    public final String c;
    public final Point d;
    public final l911 e;

    public hj40(String str, String str2, String str3, Point point, l911 l911Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = point;
        this.e = l911Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj40)) {
            return false;
        }
        hj40 hj40Var = (hj40) obj;
        return jl40.l(this.a, hj40Var.a) && jl40.l(this.b, hj40Var.b) && jl40.l(this.c, hj40Var.c) && jl40.l(this.d, hj40Var.d) && jl40.l(this.e, hj40Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31;
        l911 l911Var = this.e;
        return hashCode2 + (l911Var != null ? l911Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtTransportStop(name=", this.a, ", additionalName=", this.b, ", id=");
        v.append(this.c);
        v.append(", point=");
        v.append(this.d);
        v.append(", exit=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
