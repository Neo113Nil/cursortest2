package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class luo {
    public final ArrayList a;
    public final ArrayList b;

    public luo(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luo)) {
            return false;
        }
        luo luoVar = (luo) obj;
        return this.a.equals(luoVar.a) && this.b.equals(luoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExplorerPolygonWithHoles(outerRing=" + this.a + ", holes=" + this.b + Extension.C_BRAKE;
    }
}
