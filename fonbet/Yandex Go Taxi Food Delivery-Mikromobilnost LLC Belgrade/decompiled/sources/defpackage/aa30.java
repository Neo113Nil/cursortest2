package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class aa30 implements ea30 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final da30 m;

    public aa30(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, String str7, boolean z, boolean z2, String str8, da30 da30Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = num2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = z;
        this.k = z2;
        this.l = str8;
        this.m = da30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa30)) {
            return false;
        }
        aa30 aa30Var = (aa30) obj;
        return jl40.l(this.a, aa30Var.a) && jl40.l(this.b, aa30Var.b) && jl40.l(this.c, aa30Var.c) && jl40.l(this.d, aa30Var.d) && jl40.l(this.e, aa30Var.e) && jl40.l(this.f, aa30Var.f) && jl40.l(this.g, aa30Var.g) && jl40.l(this.h, aa30Var.h) && jl40.l(this.i, aa30Var.i) && this.j == aa30Var.j && this.k == aa30Var.k && jl40.l(this.l, aa30Var.l) && jl40.l(this.m, aa30Var.m);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int e = unr0.e(unr0.e(unr0.b((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
        String str7 = this.l;
        return this.m.hashCode() + ((e + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Content(title=", this.a, ", phoneSubtitle=", this.b, ", phoneNumberMasked=");
        vfc.w(this.d, this.c, ", otpLength=", ", attemptCount=", v);
        tse0.w(this.e, ", expiresAt=", this.f, ", retriesAfter=", v);
        g8e.D(v, this.g, ", resendButtonTitle=", this.h, ", otp=");
        tse0.y(this.i, ", isResendEnabled=", ", isExchangeLoading=", v, this.j);
        unr0.A(", otpErrorText=", this.l, ", timerValue=", v, this.k);
        v.append(this.m);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public aa30() {
        this(null, null, null, null, null, null, null, null, "", false, false, null, new da30(null, null, null));
    }
}
