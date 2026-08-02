package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e4s {
    public final List a;
    public final r4f b;

    public e4s(List list, r4f r4fVar) {
        this.a = list;
        this.b = r4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4s)) {
            return false;
        }
        e4s e4sVar = (e4s) obj;
        return jl40.l(this.a, e4sVar.a) && jl40.l(this.b, e4sVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r4f r4fVar = this.b;
        return hashCode + (r4fVar == null ? 0 : r4fVar.hashCode());
    }

    public final String toString() {
        return "FormCreateDeliveryResult(localUUIDs=" + this.a + ", result=" + this.b + Extension.C_BRAKE;
    }
}
