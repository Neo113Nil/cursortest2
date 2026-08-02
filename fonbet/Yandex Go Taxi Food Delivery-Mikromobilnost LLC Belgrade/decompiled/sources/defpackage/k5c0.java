package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class k5c0 {
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final List e;

    public k5c0(String str, List list, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5c0)) {
            return false;
        }
        k5c0 k5c0Var = (k5c0) obj;
        return jl40.l(this.a, k5c0Var.a) && this.b.equals(k5c0Var.b) && jl40.l(this.c, k5c0Var.c) && jl40.l(this.d, k5c0Var.d) && jl40.l(this.e, k5c0Var.e);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("PlacesBookingInfo(title=", this.a, ", subtitle=", this.b, ", icon=");
        g8e.D(r, this.c, ", url=", this.d, ", items=");
        return ly3.s(r, this.e, Extension.C_BRAKE);
    }
}
