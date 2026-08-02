package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bjy {
    public final List a;
    public final double b;

    public bjy(List list, double d) {
        this.a = list;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjy)) {
            return false;
        }
        bjy bjyVar = (bjy) obj;
        return this.a.equals(bjyVar.a) && Double.compare(this.b, bjyVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LinearGradientState(colorStops=" + this.a + ", angleRadians=" + this.b + Extension.C_BRAKE;
    }
}
