package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lb80 {
    public final String a;
    public final ArrayList b;
    public final String c;

    public lb80(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb80)) {
            return false;
        }
        lb80 lb80Var = (lb80) obj;
        return this.a.equals(lb80Var.a) && this.b.equals(lb80Var.b) && jl40.l(this.c, lb80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(x4e.m("TariffSuggestsCommon(orderId=", this.a, ", tariffs=", ", suggestId=", this.b), this.c, Extension.C_BRAKE);
    }
}
