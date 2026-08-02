package defpackage;

import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class kps0 {
    public final String a;
    public final String b;
    public final String c;

    public kps0(String str, String str2, int i) {
        String uuid = UUID.randomUUID().toString();
        str2 = (i & 4) != 0 ? "" : str2;
        this.a = str;
        this.b = uuid;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kps0)) {
            return false;
        }
        kps0 kps0Var = (kps0) obj;
        return jl40.l(this.a, kps0Var.a) && jl40.l(this.b, kps0Var.b) && jl40.l(this.c, kps0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("SliderImage(url=", this.a, ", tag=", this.b, ", id="), this.c, Extension.C_BRAKE);
    }
}
