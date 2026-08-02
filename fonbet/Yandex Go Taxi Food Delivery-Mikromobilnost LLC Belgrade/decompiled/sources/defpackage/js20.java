package defpackage;

import java.util.LinkedHashSet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class js20 {
    public final omk a;
    public final LinkedHashSet b;

    public js20(omk omkVar, LinkedHashSet linkedHashSet) {
        this.a = omkVar;
        this.b = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof js20) {
            js20 js20Var = (js20) obj;
            if (this.a == js20Var.a && this.b.equals(js20Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ParsedNativeDivCard(divData=" + this.a + ", expectedRoles=" + this.b + Extension.C_BRAKE;
    }
}
