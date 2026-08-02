package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class c4z {
    public final List a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public c4z(List list, ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        this.a = list;
        this.b = arrayList;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4z)) {
            return false;
        }
        c4z c4zVar = (c4z) obj;
        return jl40.l(this.a, c4zVar.a) && jl40.l(this.b, c4zVar.b) && this.c == c4zVar.c && this.d == c4zVar.d && this.e == c4zVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return Boolean.hashCode(this.e) + unr0.e(unr0.e((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = qv10.v("LocalNotificationTriggers(modes=", this.a, ", entryPoints=", this.b, ", requirePointA=");
        nnm.v(", requirePointB=", ", isPvzPoints=", v, this.c, this.d);
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
