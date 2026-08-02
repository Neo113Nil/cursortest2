package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hzt {
    public final ArrayList a;
    public final double b;

    public hzt(double d, ArrayList arrayList) {
        this.a = arrayList;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzt)) {
            return false;
        }
        hzt hztVar = (hzt) obj;
        return this.a.equals(hztVar.a) && Double.compare(this.b, hztVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GradientState(stops=" + this.a + ", angleRadians=" + this.b + Extension.C_BRAKE;
    }
}
