package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bz7 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final az7 d;

    public bz7(String str, String str2, ArrayList arrayList, az7 az7Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = az7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz7)) {
            return false;
        }
        bz7 bz7Var = (bz7) obj;
        return jl40.l(this.a, bz7Var.a) && jl40.l(this.b, bz7Var.b) && this.c.equals(bz7Var.c) && jl40.l(this.d, bz7Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = ly3.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        az7 az7Var = this.d;
        return b + (az7Var != null ? az7Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Group(id=", this.a, ", title=", this.b, ", cancelReasons=");
        v.append(this.c);
        v.append(", ratingBar=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
