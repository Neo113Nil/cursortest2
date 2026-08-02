package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q0a implements t0a {
    public final az9 a;
    public final int b;
    public final Set c;
    public final boolean d;
    public final boolean e;

    public q0a(az9 az9Var, int i, Set set, boolean z, boolean z2) {
        this.a = az9Var;
        this.b = i;
        this.c = set;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0a)) {
            return false;
        }
        q0a q0aVar = (q0a) obj;
        return jl40.l(this.a, q0aVar.a) && this.b == q0aVar.b && jl40.l(this.c, q0aVar.c) && this.d == q0aVar.d && this.e == q0aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(g8e.e(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(completedOrder=");
        sb.append(this.a);
        sb.append(", initialRating=");
        sb.append(this.b);
        sb.append(", selectedChipIds=");
        sb.append(this.c);
        sb.append(", shouldShowRating=");
        sb.append(this.d);
        sb.append(", shouldShowChips=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
