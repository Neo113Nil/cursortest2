package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class dtf {
    public final List a;
    public final int b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Map g;
    public final String h;

    public dtf(int i, String str, String str2, String str3, String str4, List list, Map map, boolean z) {
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = map;
        this.h = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    public static dtf a(dtf dtfVar, ArrayList arrayList, String str, int i) {
        ArrayList arrayList2 = arrayList;
        if ((i & 1) != 0) {
            arrayList2 = dtfVar.a;
        }
        ArrayList arrayList3 = arrayList2;
        int i2 = dtfVar.b;
        boolean z = dtfVar.c;
        String str2 = dtfVar.d;
        String str3 = dtfVar.e;
        String str4 = dtfVar.f;
        Map map = dtfVar.g;
        if ((i & 128) != 0) {
            str = dtfVar.h;
        }
        dtfVar.getClass();
        return new dtf(i2, str2, str3, str4, str, arrayList3, map, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtf)) {
            return false;
        }
        dtf dtfVar = (dtf) obj;
        return this.a.equals(dtfVar.a) && this.b == dtfVar.b && this.c == dtfVar.c && jl40.l(this.d, dtfVar.d) && jl40.l(this.e, dtfVar.e) && jl40.l(this.f, dtfVar.f) && jl40.l(this.g, dtfVar.g) && jl40.l(this.h, dtfVar.h);
    }

    public final int hashCode() {
        int e = unr0.e(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.g;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.h;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DKPaymentMethods(paymentMethodsList=");
        sb.append(this.a);
        sb.append(", selectedMethod=");
        sb.append(this.b);
        sb.append(", shouldOpenPlusCard=");
        unr0.A(", orderAmount=", this.d, ", orderAmountCurrency=", sb, this.c);
        g8e.D(sb, this.e, ", metaJson=", this.f, ", legalUrlsMap=");
        sb.append(this.g);
        sb.append(", payload=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
