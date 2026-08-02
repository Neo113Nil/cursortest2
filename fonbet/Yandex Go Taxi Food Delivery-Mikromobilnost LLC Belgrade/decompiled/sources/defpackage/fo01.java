package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fo01 {
    public final int a;
    public final List b;

    public fo01(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo01)) {
            return false;
        }
        fo01 fo01Var = (fo01) obj;
        return this.a == fo01Var.a && this.b.equals(fo01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Phone(minQueryLen=" + this.a + ", maxDistanceRules=" + this.b + Extension.C_BRAKE;
    }
}
