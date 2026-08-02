package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class do01 {
    public final int a;
    public final List b;

    public do01(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do01)) {
            return false;
        }
        do01 do01Var = (do01) obj;
        return this.a == do01Var.a && this.b.equals(do01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Name(minQueryLen=" + this.a + ", maxDistanceRules=" + this.b + Extension.C_BRAKE;
    }
}
