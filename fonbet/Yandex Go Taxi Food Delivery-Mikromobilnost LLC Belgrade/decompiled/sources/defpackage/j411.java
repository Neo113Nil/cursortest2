package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lj411;", "Lhd90;", "Lc6z;", "Companion", "b", "a", "c", "k411", "g411", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class j411 implements hd90, c6z {
    public static final k411 Companion = new k411();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(19)), null};
    public final Map b;
    public final b c;

    static {
        new j411(0);
    }

    public /* synthetic */ j411(int i, Map map, b bVar) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = bVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j411)) {
            return false;
        }
        j411 j411Var = (j411) obj;
        return jl40.l(this.b, j411Var.b) && jl40.l(this.c, j411Var.c);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        b bVar = this.c;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "TransportPaymentExternalAuthConfigDto(l10n=" + this.b + ", externalAuth=" + this.c + Extension.C_BRAKE;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj411$b;", "", "Companion", "l411", "m411", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final m411 Companion = new m411();
        public final a a;
        public final c b;

        public /* synthetic */ b(int i, a aVar, c cVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = aVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = cVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b);
        }

        public final int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            c cVar = this.b;
            return hashCode + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            return "ExternalAuthDto(authOnboarding=" + this.a + ", otpCodeEntryScreen=" + this.b + Extension.C_BRAKE;
        }

        public b() {
            this.a = null;
            this.b = null;
        }
    }

    public j411() {
        this(0);
    }

    public j411(int i) {
        this.b = kotlin.collections.b.f();
        this.c = null;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj411$a;", "", "Companion", "h411", "i411", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final i411 Companion = new i411();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final FormattedText e;

        public /* synthetic */ a(int i, String str, String str2, String str3, String str4, FormattedText formattedText) {
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
                this.e = formattedText;
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
            StringBuilder v = b64.v("AuthOnboardingDto(title=", this.a, ", subtitle=", this.b, ", imageTag=");
            g8e.D(v, this.c, ", buttonTitle=", this.d, ", userAgreement=");
            return tse0.m(v, this.e, Extension.C_BRAKE);
        }

        public a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj411$c;", "", "Companion", "n411", "o411", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final o411 Companion = new o411();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c) && jl40.l(this.d, cVar.d) && jl40.l(this.e, cVar.e) && jl40.l(this.f, cVar.f) && jl40.l(this.g, cVar.g);
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
            StringBuilder v = b64.v("OtpCodeEntryScreenDto(title=", this.a, ", resendText=", this.b, ", phoneSubtitle=");
            g8e.D(v, this.c, ", wrongCodeText=", this.d, ", resendButtonTitle=");
            g8e.D(v, this.e, ", wrongCodeResendText=", this.f, ", authSucceedNotification=");
            return oyr.t(v, this.g, Extension.C_BRAKE);
        }

        public c() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
        }
    }
}
