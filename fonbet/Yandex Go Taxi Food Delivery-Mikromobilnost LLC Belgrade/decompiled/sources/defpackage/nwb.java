package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nwb {
    public final int a;
    public final ArrayList b;
    public final String c;

    public nwb(int i, ArrayList arrayList, String str) {
        this.a = i;
        this.b = arrayList;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwb)) {
            return false;
        }
        nwb nwbVar = (nwb) obj;
        return this.a == nwbVar.a && this.b.equals(nwbVar.b) && jl40.l(this.c, nwbVar.c);
    }

    public final int hashCode() {
        int b = ly3.b(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CityTourChoiceState(optionId=");
        sb.append(this.a);
        sb.append(", route=");
        sb.append(this.b);
        sb.append(", routeDescription=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
