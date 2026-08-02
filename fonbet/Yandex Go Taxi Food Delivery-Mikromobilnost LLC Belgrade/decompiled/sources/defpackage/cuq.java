package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cuq {
    public final String a;
    public final String b;
    public final List c;
    public final usq d;
    public final boolean e;

    public cuq(String str, String str2, List list, usq usqVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = usqVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuq)) {
            return false;
        }
        cuq cuqVar = (cuq) obj;
        return jl40.l(this.a, cuqVar.a) && jl40.l(this.b, cuqVar.b) && jl40.l(this.c, cuqVar.c) && jl40.l(this.d, cuqVar.d) && this.e == cuqVar.e;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        usq usqVar = this.d;
        return Boolean.hashCode(this.e) + ((c + (usqVar == null ? 0 : usqVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("FeedbackReasonModel(reasonId=", this.a, ", title=", this.b, ", scores=");
        v.append(this.c);
        v.append(", icon=");
        v.append(this.d);
        v.append(", isChecked=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
