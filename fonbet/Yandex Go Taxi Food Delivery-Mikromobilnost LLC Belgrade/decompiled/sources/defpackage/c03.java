package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c03 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public c03(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c03)) {
            return false;
        }
        c03 c03Var = (c03) obj;
        return jl40.l(this.a, c03Var.a) && jl40.l(this.b, c03Var.b) && jl40.l(this.c, c03Var.c) && this.d.equals(c03Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ApplicationInfo(id=", this.a, ", type=", this.b, ", documentGroup=");
        v.append(this.c);
        v.append(", photos=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
