package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class frz0 {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;

    public frz0(String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frz0)) {
            return false;
        }
        frz0 frz0Var = (frz0) obj;
        return jl40.l(this.a, frz0Var.a) && jl40.l(this.b, frz0Var.b) && jl40.l(this.c, frz0Var.c) && this.d == frz0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("TollRoadUiState(title=", this.a, ", description=", this.b, ", options=");
        v.append(this.c);
        v.append(", isLoading=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
