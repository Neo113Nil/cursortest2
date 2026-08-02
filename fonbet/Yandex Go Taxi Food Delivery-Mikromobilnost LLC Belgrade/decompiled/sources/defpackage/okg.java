package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class okg extends lr20 {
    public final o130 i;
    public final ArrayList j;
    public final ArrayList k;
    public final Object l;
    public final String m;

    public okg(o130 o130Var, ArrayList arrayList, ArrayList arrayList2, Object obj, String str) {
        this.i = o130Var;
        this.j = arrayList;
        this.k = arrayList2;
        this.l = obj;
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okg)) {
            return false;
        }
        okg okgVar = (okg) obj;
        return this.i.equals(okgVar.i) && this.j.equals(okgVar.j) && this.k.equals(okgVar.k) && jl40.l(this.l, okgVar.l) && jl40.l(this.m, okgVar.m);
    }

    public final int hashCode() {
        int b = ly3.b(ly3.b(this.i.hashCode() * 31, 31, this.j), 31, this.k);
        Object obj = this.l;
        int hashCode = (b + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.m;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(header=");
        sb.append(this.i);
        sb.append(", options=");
        sb.append(this.j);
        sb.append(", buttons=");
        sb.append(this.k);
        sb.append(", meta=");
        sb.append(this.l);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.m, Extension.C_BRAKE);
    }
}
