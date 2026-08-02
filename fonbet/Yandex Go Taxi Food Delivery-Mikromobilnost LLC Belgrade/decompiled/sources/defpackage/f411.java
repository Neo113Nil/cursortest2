package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class f411 {
    public static final f411 c = new f411(null, null);
    public final a a;
    public final b b;

    public f411(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f411)) {
            return false;
        }
        f411 f411Var = (f411) obj;
        return jl40.l(this.a, f411Var.a) && jl40.l(this.b, f411Var.b);
    }

    public final int hashCode() {
        a aVar = this.a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        b bVar = this.b;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "TransportPaymentExternalAuthConfig(authOnboarding=" + this.a + ", otpCodeEntryScreen=" + this.b + Extension.C_BRAKE;
    }

    public f411() {
        this(null, null);
    }

    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final FormattedText e;

        public a(String str, String str2, String str3, String str4, FormattedText formattedText) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = formattedText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e);
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
            FormattedText formattedText = this.e;
            return hashCode4 + (formattedText != null ? formattedText.a.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("AuthOnboarding(title=", this.a, ", subtitle=", this.b, ", imageTag=");
            g8e.D(v, this.c, ", buttonTitle=", this.d, ", userAgreement=");
            return tse0.m(v, this.e, Extension.C_BRAKE);
        }

        public a() {
            this(null, null, null, null, null);
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        public b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c) && jl40.l(this.d, bVar.d) && jl40.l(this.e, bVar.e) && jl40.l(this.f, bVar.f) && jl40.l(this.g, bVar.g);
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

        public b() {
            this(null, null, null, null, null, null, null);
        }
    }
}
