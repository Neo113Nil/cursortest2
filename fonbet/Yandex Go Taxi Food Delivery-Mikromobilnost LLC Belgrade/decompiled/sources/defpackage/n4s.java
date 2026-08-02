package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n4s {
    public final ArrayList a;
    public final long b;

    public n4s(long j, ArrayList arrayList) {
        this.a = arrayList;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4s)) {
            return false;
        }
        n4s n4sVar = (n4s) obj;
        return this.a.equals(n4sVar.a) && this.b == n4sVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormDescriptorsState(descriptors=" + this.a + ", timestamp=" + this.b + Extension.C_BRAKE;
    }
}
