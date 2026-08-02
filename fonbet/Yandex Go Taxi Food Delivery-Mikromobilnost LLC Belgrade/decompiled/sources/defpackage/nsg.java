package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nsg {
    public final String a;
    public final String b;
    public final String c;
    public final Calendar d;
    public final boolean e;

    public nsg(String str, String str2, String str3, Calendar calendar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = calendar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsg)) {
            return false;
        }
        nsg nsgVar = (nsg) obj;
        return jl40.l(this.a, nsgVar.a) && jl40.l(this.b, nsgVar.b) && this.c.equals(nsgVar.c) && this.d.equals(nsgVar.d) && this.e == nsgVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder v = b64.v("DaySelectorItem(title=", this.a, ", titleContentDescription=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", day=");
        v.append(this.d);
        v.append(", iconVisible=false, isSelected=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
