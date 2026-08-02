package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gb40 {
    public static final gb40 f = new gb40("", 62, null, null, null, null);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;

    public gb40(String str, int i, String str2, String str3, String str4, Map map) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        map = (i & 32) != 0 ? b.f() : map;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb40)) {
            return false;
        }
        gb40 gb40Var = (gb40) obj;
        return jl40.l(this.a, gb40Var.a) && jl40.l(this.b, gb40Var.b) && jl40.l(this.c, gb40Var.c) && jl40.l(this.d, gb40Var.d) && jl40.l(this.e, gb40Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtTrainCheckoutPayload(price=", this.a, ", startingStopId=", this.b, ", destinationStopId=");
        g8e.D(v, this.c, ", lineId=null, date=", this.d, ", payload=");
        return b64.r(v, this.e, Extension.C_BRAKE);
    }
}
