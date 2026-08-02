package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Ln6f;", "", "Companion", "a", "j6f", "k6f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class n6f {
    public static final k6f Companion = new k6f();
    public final String a;
    public final String b;
    public final a c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final Object h;

    public /* synthetic */ n6f(int i, String str, String str2, a aVar, int i2, String str3, String str4, String str5, Object obj) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = new a(0);
        } else {
            this.c = aVar;
        }
        if ((i & 8) == 0) {
            this.d = 1;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6f)) {
            return false;
        }
        n6f n6fVar = (n6f) obj;
        return jl40.l(this.a, n6fVar.a) && jl40.l(this.b, n6fVar.b) && jl40.l(this.c, n6fVar.c) && this.d == n6fVar.d && jl40.l(this.e, n6fVar.e) && jl40.l(this.f, n6fVar.f) && jl40.l(this.g, n6fVar.g) && jl40.l(this.h, n6fVar.h);
    }

    public final int hashCode() {
        int b = oyr.b(this.d, (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.h;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CreatePaymentParam(uuid=", this.a, ", transportId=", this.b, ", paymentInfo=");
        v.append(this.c);
        v.append(", count=");
        v.append(this.d);
        v.append(", aPoint=");
        g8e.D(v, this.e, ", bPoint=", this.f, ", zoneName=");
        return tse0.l(v, this.g, ", metaPaymentInfo=", this.h, Extension.C_BRAKE);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ln6f$a;", "", "Companion", "l6f", "m6f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final m6f Companion = new m6f();
        public final String a;
        public final String b;

        public /* synthetic */ a(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("PaymentInfo(type=", this.a, ", method=", this.b, Extension.C_BRAKE);
        }

        public a() {
            this(0);
        }

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public /* synthetic */ a(int i) {
            this("", "");
        }
    }

    public n6f() {
        this(null, null, null, 0, null, null, 255);
    }

    public n6f(String str, String str2, a aVar, int i, String str3, String str4, String str5, Object obj) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = obj;
    }

    public /* synthetic */ n6f(String str, String str2, a aVar, int i, String str3, String str4, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? new a(0) : aVar, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, null, null);
    }
}
