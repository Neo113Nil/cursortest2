package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class f4j0 {
    public final String a;
    public final LinkedHashMap b;

    public f4j0(String str, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4j0)) {
            return false;
        }
        f4j0 f4j0Var = (f4j0) obj;
        return this.a.equals(f4j0Var.a) && this.b.equals(f4j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingEvent(methodName=" + this.a + ", arguments=" + this.b + Extension.C_BRAKE;
    }
}
