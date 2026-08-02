package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class p9b0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public p9b0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final LinkedHashMap a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put("first_available_date", this.a);
        linkedHashMap.put("last_available_date", this.b);
        String str = this.c;
        if (str != null) {
            linkedHashMap.put("first_selected_date", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            linkedHashMap.put("last_selected_date", str2);
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9b0)) {
            return false;
        }
        p9b0 p9b0Var = (p9b0) obj;
        return this.a.equals(p9b0Var.a) && this.b.equals(p9b0Var.b) && jl40.l(this.c, p9b0Var.c) && jl40.l(this.d, p9b0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("PfmDateFilterPfm(firstAvailableDate=", this.a, ", lastAvailableDate=", this.b, ", firstSelectedDate="), this.c, ", lastSelectedDate=", this.d, Extension.C_BRAKE);
    }
}
