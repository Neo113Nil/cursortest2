package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class db50 {
    public final boolean a;
    public final List b;
    public final List c;

    public db50(List list, List list2, boolean z) {
        this.a = z;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db50)) {
            return false;
        }
        db50 db50Var = (db50) obj;
        return this.a == db50Var.a && jl40.l(this.b, db50Var.b) && jl40.l(this.c, db50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigatorControlsConfig(enabled=");
        sb.append(this.a);
        sb.append(", horizontalButtons=");
        sb.append(this.b);
        sb.append(", verticalButtons=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
