package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.locationsdk.core.priority.InputSourcePriority$Active;

/* loaded from: classes4.dex */
public final class hz60 {
    public final InputSourcePriority$Active a;
    public final InputSourcePriority$Active b;
    public final long c;

    public hz60(InputSourcePriority$Active inputSourcePriority$Active, InputSourcePriority$Active inputSourcePriority$Active2, long j) {
        this.a = inputSourcePriority$Active;
        this.b = inputSourcePriority$Active2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz60)) {
            return false;
        }
        hz60 hz60Var = (hz60) obj;
        return this.a == hz60Var.a && this.b == hz60Var.b && e3n.d(this.c, hz60Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        o430 o430Var = e3n.b;
        return Long.hashCode(this.c) + hashCode;
    }

    public final String toString() {
        String p = e3n.p(this.c);
        StringBuilder sb = new StringBuilder("SourcePriority(referencePriority=");
        sb.append(this.a);
        sb.append(", coldAlternativePriority=");
        sb.append(this.b);
        sb.append(", alternativeCooldown=");
        return oyr.t(sb, p, Extension.C_BRAKE);
    }
}
