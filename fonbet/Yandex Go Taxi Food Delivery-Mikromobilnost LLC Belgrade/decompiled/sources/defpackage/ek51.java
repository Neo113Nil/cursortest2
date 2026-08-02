package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ek51 {
    public final String a;
    public final boolean b;
    public final List c;

    public ek51(String str, List list, boolean z) {
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek51)) {
            return false;
        }
        ek51 ek51Var = (ek51) obj;
        return jl40.l(this.a, ek51Var.a) && this.b == ek51Var.b && this.c.equals(ek51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(oo31.l("YaDiskSpaceError(messageId=", this.a, ", isImage=", ", attachments=", this.b), this.c, Extension.C_BRAKE);
    }
}
