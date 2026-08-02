package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class l5c0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;

    public l5c0(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5c0)) {
            return false;
        }
        l5c0 l5c0Var = (l5c0) obj;
        return this.a.equals(l5c0Var.a) && jl40.l(this.b, l5c0Var.b) && this.c.equals(l5c0Var.c) && this.d.equals(l5c0Var.d) && this.e.equals(l5c0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(ly3.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("PlacesBookingItem(id=", this.a, ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", icon=");
        v.append(this.d);
        v.append(", url=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
