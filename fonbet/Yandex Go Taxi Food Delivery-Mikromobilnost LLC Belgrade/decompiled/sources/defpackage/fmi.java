package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class fmi {
    public final ArrayList a;
    public final ArrayList b;
    public final String c;
    public final String d;

    public fmi(ArrayList arrayList, ArrayList arrayList2, String str, String str2) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmi)) {
            return false;
        }
        fmi fmiVar = (fmi) obj;
        return this.a.equals(fmiVar.a) && this.b.equals(fmiVar.b) && jl40.l(this.c, fmiVar.c) && jl40.l(this.d, fmiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(ly3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryRentalDetails(rentalDescriptions=");
        sb.append(this.a);
        sb.append(", counterValues=");
        sb.append(this.b);
        sb.append(", counterTrailText=");
        return g8e.r(sb, this.c, ", summaryListItemTrailTitle=", this.d, Extension.C_BRAKE);
    }
}
