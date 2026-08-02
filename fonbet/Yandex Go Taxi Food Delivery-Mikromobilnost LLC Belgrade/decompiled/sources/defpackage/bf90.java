package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bf90 {
    public final ArrayList a;
    public final ArrayList b;
    public final boolean c;

    public bf90(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf90)) {
            return false;
        }
        bf90 bf90Var = (bf90) obj;
        return this.a.equals(bf90Var.a) && this.b.equals(bf90Var.b) && this.c == bf90Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParksPage(parks=");
        sb.append(this.a);
        sb.append(", blackListedParks=");
        sb.append(this.b);
        sb.append(", hasNextPage=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
