package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class piy {
    public final ArrayList a;
    public final double b;

    public piy(double d, ArrayList arrayList) {
        this.a = arrayList;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof piy)) {
            return false;
        }
        piy piyVar = (piy) obj;
        return this.a.equals(piyVar.a) && Double.compare(this.b, piyVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LinearGradient(stops=" + this.a + ", angleDeg=" + this.b + Extension.C_BRAKE;
    }
}
