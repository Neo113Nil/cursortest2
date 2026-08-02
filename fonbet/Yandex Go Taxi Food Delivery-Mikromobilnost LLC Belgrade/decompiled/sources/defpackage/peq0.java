package defpackage;

import java.util.LinkedHashSet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class peq0 {
    public final LinkedHashSet a;
    public final boolean b;

    public peq0(LinkedHashSet linkedHashSet, boolean z) {
        this.a = linkedHashSet;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof peq0)) {
            return false;
        }
        peq0 peq0Var = (peq0) obj;
        return this.a.equals(peq0Var.a) && this.b == peq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + unr0.e(this.a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "Config(sources=" + this.a + ", checkSpoofing=false, startWithLastKnown=" + this.b + Extension.C_BRAKE;
    }
}
