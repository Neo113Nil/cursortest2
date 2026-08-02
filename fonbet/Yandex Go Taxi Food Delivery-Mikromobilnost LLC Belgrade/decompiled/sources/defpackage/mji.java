package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.DeliveryPinType;

/* loaded from: classes5.dex */
public final class mji {
    public final DeliveryPinType a;
    public final Boolean b;
    public final kji c;
    public final n7v d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Boolean i;
    public final Boolean j;

    public mji(DeliveryPinType deliveryPinType, Boolean bool, kji kjiVar, n7v n7vVar, String str, String str2, String str3, String str4, Boolean bool2, Boolean bool3) {
        this.a = deliveryPinType;
        this.b = bool;
        this.c = kjiVar;
        this.d = n7vVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = bool2;
        this.j = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mji)) {
            return false;
        }
        mji mjiVar = (mji) obj;
        return this.a == mjiVar.a && jl40.l(this.b, mjiVar.b) && jl40.l(this.c, mjiVar.c) && jl40.l(this.d, mjiVar.d) && jl40.l(this.e, mjiVar.e) && jl40.l(this.f, mjiVar.f) && jl40.l(this.g, mjiVar.g) && jl40.l(this.h, mjiVar.h) && jl40.l(this.i, mjiVar.i) && jl40.l(this.j, mjiVar.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        kji kjiVar = this.c;
        int hashCode3 = (hashCode2 + (kjiVar == null ? 0 : kjiVar.hashCode())) * 31;
        n7v n7vVar = this.d;
        int hashCode4 = (hashCode3 + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.j;
        return hashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryPinModel(type=");
        sb.append(this.a);
        sb.append(", showOnSummary=");
        sb.append(this.b);
        sb.append(", lead=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", iconBackgroundColor=");
        g8e.D(sb, this.e, ", iconTintColor=", this.f, ", title=");
        g8e.D(sb, this.g, ", subtitle=", this.h, ", swapTexts=");
        sb.append(this.i);
        sb.append(", hasChevron=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
