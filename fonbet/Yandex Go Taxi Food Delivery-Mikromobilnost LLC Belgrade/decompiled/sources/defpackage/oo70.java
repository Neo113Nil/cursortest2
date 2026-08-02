package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Loo70;", "", "Companion", "mo70", "no70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class oo70 {
    public static final no70 Companion = new no70();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ oo70(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.a = null;
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
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str8;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: b, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: e, reason: from getter */
    public final String getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo70)) {
            return false;
        }
        oo70 oo70Var = (oo70) obj;
        return jl40.l(this.a, oo70Var.a) && jl40.l(this.b, oo70Var.b) && jl40.l(this.c, oo70Var.c) && jl40.l(this.d, oo70Var.d) && jl40.l(this.e, oo70Var.e) && jl40.l(this.f, oo70Var.f) && jl40.l(this.g, oo70Var.g) && jl40.l(this.h, oo70Var.h);
    }

    /* renamed from: f, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: g, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        return this.h.hashCode() + ((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderClickInfo(service=", this.a, ", widgetId=", this.b, ", buttonName=");
        g8e.D(v, this.c, ", buttonId=", this.d, ", orderId=");
        g8e.D(v, this.e, ", orderStatus=", this.f, ", actionType=");
        return g8e.r(v, this.g, ", uuid=", this.h, Extension.C_BRAKE);
    }

    public oo70() {
        this(255, null, null, null, null, null, null);
    }

    public oo70(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        str6 = (i & 128) != 0 ? "" : str6;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = null;
        this.e = str4;
        this.f = str5;
        this.g = null;
        this.h = str6;
    }
}
