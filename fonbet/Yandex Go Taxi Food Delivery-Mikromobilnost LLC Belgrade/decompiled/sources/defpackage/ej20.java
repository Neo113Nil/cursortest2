package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ej20 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final w4v d;

    public ej20(String str, String str2, ArrayList arrayList, w4v w4vVar) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = w4vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej20)) {
            return false;
        }
        ej20 ej20Var = (ej20) obj;
        return jl40.l(this.a, ej20Var.a) && jl40.l(this.b, ej20Var.b) && this.c.equals(ej20Var.c) && jl40.l(this.d, ej20Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = ly3.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        w4v w4vVar = this.d;
        return b + (w4vVar != null ? w4vVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MissionDescriptionBlockModel(title=", this.a, ", subtitle=", this.b, ", description=");
        v.append(this.c);
        v.append(", trailIcon=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
