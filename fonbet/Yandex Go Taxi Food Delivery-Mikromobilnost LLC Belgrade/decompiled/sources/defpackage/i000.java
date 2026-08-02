package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Li000;", "", "Companion", "a", "f000", "e000", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class i000 {
    public static final f000 Companion = new f000();
    public static final i000 c = new i000(0);
    public final a a;
    public final String b;

    public /* synthetic */ i000(int i, a aVar, String str) {
        this.a = (i & 1) == 0 ? a.e : aVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i000)) {
            return false;
        }
        i000 i000Var = (i000) obj;
        return jl40.l(this.a, i000Var.a) && jl40.l(this.b, i000Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Maas(menuButton=" + this.a + ", coupon=" + this.b + Extension.C_BRAKE;
    }

    public i000() {
        this(0);
    }

    public i000(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    public /* synthetic */ i000(int i) {
        this(a.e, "");
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Li000$a;", "", "Companion", "h000", "g000", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final h000 Companion = new h000();
        public static final a e = new a(0);
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ a(int i, String str, String str2, String str3, String str4) {
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
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
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
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return g8e.r(b64.v("MenuButton(title=", this.a, ", tripsInfo=", this.b, ", expiringInfo="), this.c, ", url=", this.d, Extension.C_BRAKE);
        }

        public a() {
            this(0);
        }

        public a(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public /* synthetic */ a(int i) {
            this("", "", "", "");
        }
    }
}
