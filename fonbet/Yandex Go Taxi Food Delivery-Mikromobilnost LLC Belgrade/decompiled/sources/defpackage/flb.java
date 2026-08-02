package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lflb;", "", "Companion", "dlb", "elb", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class flb {
    public static final elb Companion = new elb();
    public final String a;
    public final String b;
    public final zzs c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Integer h;
    public final Object i;

    public /* synthetic */ flb(int i, String str, String str2, zzs zzsVar, String str3, String str4, String str5, String str6, Integer num, Object obj) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zzsVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flb)) {
            return false;
        }
        flb flbVar = (flb) obj;
        return jl40.l(this.a, flbVar.a) && jl40.l(this.b, flbVar.b) && jl40.l(this.c, flbVar.c) && jl40.l(this.d, flbVar.d) && jl40.l(this.e, flbVar.e) && jl40.l(this.f, flbVar.f) && jl40.l(this.g, flbVar.g) && jl40.l(this.h, flbVar.h) && jl40.l(this.i, flbVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        zzs zzsVar = this.c;
        int hashCode3 = (hashCode2 + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int b = unr0.b((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.g);
        Integer num = this.h;
        int hashCode6 = (b + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.i;
        return hashCode6 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CheckoutParam(id=", this.a, ", qrUrl=", this.b, ", location=");
        v.append(this.c);
        v.append(", startingStopId=");
        v.append(this.d);
        v.append(", destinationStopId=");
        g8e.D(v, this.e, ", directionId=", this.f, ", zoneName=");
        vfc.w(this.h, this.g, ", ticketsCount=", ", metaCheckoutInfo=", v);
        return x4e.h(v, this.i, Extension.C_BRAKE);
    }

    public flb(String str, String str2, zzs zzsVar, String str3, String str4, String str5, String str6, Integer num, Object obj) {
        this.a = str;
        this.b = str2;
        this.c = zzsVar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = num;
        this.i = obj;
    }

    public flb() {
        this("", null, null, null, null, null, "", null, null);
    }
}
