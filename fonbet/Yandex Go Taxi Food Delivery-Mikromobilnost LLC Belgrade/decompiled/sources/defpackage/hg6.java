package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hg6 {
    public final String a;
    public final String b;
    public final rr51 c;
    public final List d;
    public final List e;

    public hg6(String str, String str2, rr51 rr51Var, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = rr51Var;
        this.d = list;
        this.e = list2;
    }

    public static hg6 a(hg6 hg6Var, List list) {
        String str = hg6Var.a;
        String str2 = hg6Var.b;
        rr51 rr51Var = hg6Var.c;
        List list2 = hg6Var.e;
        hg6Var.getClass();
        return new hg6(str, str2, rr51Var, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg6)) {
            return false;
        }
        hg6 hg6Var = (hg6) obj;
        return jl40.l(this.a, hg6Var.a) && jl40.l(this.b, hg6Var.b) && jl40.l(this.c, hg6Var.c) && this.d.equals(hg6Var.d) && this.e.equals(hg6Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        rr51 rr51Var = this.c;
        return this.e.hashCode() + unr0.c((hashCode2 + (rr51Var != null ? rr51Var.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("BottomSheetPayloadEntity(title=", this.a, ", subtitle=", this.b, ", divkitData=");
        v.append(this.c);
        v.append(", items=");
        v.append(this.d);
        v.append(", additionalButtons=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }
}
