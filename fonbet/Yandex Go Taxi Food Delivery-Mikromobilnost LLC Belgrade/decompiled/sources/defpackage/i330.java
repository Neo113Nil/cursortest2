package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class i330 {
    public final xbu a;
    public final ArrayList b;
    public final ArrayList c;
    public final Object d;
    public final String e;

    public i330(xbu xbuVar, ArrayList arrayList, ArrayList arrayList2, Object obj, String str) {
        this.a = xbuVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = obj;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i330)) {
            return false;
        }
        i330 i330Var = (i330) obj;
        return jl40.l(this.a, i330Var.a) && this.b.equals(i330Var.b) && this.c.equals(i330Var.c) && jl40.l(this.d, i330Var.d) && jl40.l(this.e, i330Var.e);
    }

    public final int hashCode() {
        int b = ly3.b(ly3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Object obj = this.d;
        int hashCode = (b + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalViewState(header=");
        sb.append(this.a);
        sb.append(", contentItems=");
        sb.append(this.b);
        sb.append(", buttons=");
        sb.append(this.c);
        sb.append(", meta=");
        sb.append(this.d);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
