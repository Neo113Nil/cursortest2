package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class er0 {
    public final List a;
    public final int b;

    public er0(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er0)) {
            return false;
        }
        er0 er0Var = (er0) obj;
        return this.a.equals(er0Var.a) && this.b == er0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressClarificationContent(items=" + this.a + ", selectedIndex=" + this.b + Extension.C_BRAKE;
    }
}
