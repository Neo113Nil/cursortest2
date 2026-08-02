package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fsg {
    public final String a;
    public final String b;
    public final ArrayList c;

    public fsg(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsg)) {
            return false;
        }
        fsg fsgVar = (fsg) obj;
        return jl40.l(this.a, fsgVar.a) && jl40.l(this.b, fsgVar.b) && this.c.equals(fsgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, b64.v("Day(value=", this.a, ", descriptionTemplate=", this.b, ", hours="), this.c);
    }
}
