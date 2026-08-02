package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ap81 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final LinkedHashMap e;

    public ap81(String str, String str2, String str3, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap81)) {
            return false;
        }
        ap81 ap81Var = (ap81) obj;
        return this.a.equals(ap81Var.a) && this.b.equals(ap81Var.b) && this.c.equals(ap81Var.c) && jl40.l(this.d, ap81Var.d) && jl40.l(this.e, ap81Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ArrayList arrayList = this.d;
        int hashCode = (b + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        LinkedHashMap linkedHashMap = this.e;
        return hashCode + (linkedHashMap != null ? linkedHashMap.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Design(type=", this.a, ", target=", this.b, ", layout=");
        v.append(this.c);
        v.append(", images=");
        v.append(this.d);
        v.append(", analyticsParameters=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
