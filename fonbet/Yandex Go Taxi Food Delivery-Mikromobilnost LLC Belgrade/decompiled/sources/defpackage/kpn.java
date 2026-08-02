package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kpn {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final Integer e;

    public kpn(String str, String str2, String str3, List list, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpn)) {
            return false;
        }
        kpn kpnVar = (kpn) obj;
        return jl40.l(this.a, kpnVar.a) && jl40.l(this.b, kpnVar.b) && jl40.l(this.c, kpnVar.c) && jl40.l(this.d, kpnVar.d) && jl40.l(this.e, kpnVar.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int c = unr0.c((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        return c + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("EducationsV2Entity(name=", this.a, ", eventId=", this.b, ", defaultsGroup=");
        tse0.x(this.c, ", steps=", ", showingDelay=", v, this.d);
        return oo31.j(v, this.e, Extension.C_BRAKE);
    }
}
