package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jll0 {
    public final a a;

    public jll0(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jll0) && jl40.l(this.a, ((jll0) obj).a);
    }

    public final int hashCode() {
        a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "SDKPaymentExternalAuthConfig(otpCodeEntryScreen=" + this.a + Extension.C_BRAKE;
    }

    public jll0() {
        this(null);
    }

    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g);
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
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("OtpCodeEntryScreen(title=", this.a, ", resendText=", this.b, ", phoneSubtitle=");
            g8e.D(v, this.c, ", wrongCodeText=", this.d, ", resendButtonTitle=");
            g8e.D(v, this.e, ", wrongCodeResendText=", this.f, ", authSucceedNotification=");
            return oyr.t(v, this.g, Extension.C_BRAKE);
        }

        public a() {
            this(null, null, null, null, null, null, null);
        }
    }
}
