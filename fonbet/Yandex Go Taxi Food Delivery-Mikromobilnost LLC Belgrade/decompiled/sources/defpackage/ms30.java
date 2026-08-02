package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ms30 {
    public static final ms30 e = new ms30(0);
    public final boolean a;
    public final e b;
    public final c c;
    public final f d;

    public ms30(boolean z, e eVar, c cVar, f fVar) {
        this.a = z;
        this.b = eVar;
        this.c = cVar;
        this.d = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms30)) {
            return false;
        }
        ms30 ms30Var = (ms30) obj;
        return this.a == ms30Var.a && jl40.l(this.b, ms30Var.b) && jl40.l(this.c, ms30Var.c) && jl40.l(this.d, ms30Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        e eVar = this.b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        c cVar = this.c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        f fVar = this.d;
        return hashCode3 + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "MtPurchaseAvailabilityConfig(enabled=" + this.a + ", spareButton=" + this.b + ", payButton=" + this.c + ", ticketButton=" + this.d + Extension.C_BRAKE;
    }

    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
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
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("IconBackgroundColor(light=", this.a, ", dark=", this.b, Extension.C_BRAKE);
        }

        public b() {
            this(null, null);
        }
    }

    public static final class c {
        public final List a;
        public final String b;

        public c(List list, String str) {
            this.a = list;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return xvz.i("PayButton(showPolicy=", ", multiScenariosTitle=", this.b, Extension.C_BRAKE, this.a);
        }

        public c() {
            this(EmptyList.a, null);
        }
    }

    public static final class e {
        public final String a;
        public final String b;

        public e(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return jl40.l(this.a, eVar.a) && jl40.l(this.b, eVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("SpareButton(deeplink=", this.a, ", iconTag=", this.b, Extension.C_BRAKE);
        }

        public e() {
            this(null, null);
        }
    }

    public static final class d {
        public final a a;
        public final String b;
        public final List c;

        public d(a aVar, String str, List list) {
            this.a = aVar;
            this.b = str;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b) && jl40.l(this.c, dVar.c);
        }

        public final int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.b;
            return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowPolicy(content=");
            sb.append(this.a);
            sb.append(", deeplink=");
            sb.append(this.b);
            sb.append(", allowedScenario=");
            return ly3.s(sb, this.c, Extension.C_BRAKE);
        }

        public d() {
            this(null, null, EmptyList.a);
        }
    }

    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final b d;

        public a(String str, String str2, String str3, b bVar) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = bVar;
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
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            b bVar = this.d;
            return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("ButtonContent(iconTag=", this.a, ", defaultTitle=", this.b, ", scenarioTitle=");
            v.append(this.c);
            v.append(", iconBackgroundColor=");
            v.append(this.d);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public a() {
            this(null, null, null, null);
        }
    }

    public static final class f {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;

        public f(String str, String str2, String str3, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return jl40.l(this.a, fVar.a) && jl40.l(this.b, fVar.b) && jl40.l(this.c, fVar.c) && this.d == fVar.d;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return Boolean.hashCode(this.d) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return nnm.i(this.c, ", showForDefaultScenario=", Extension.C_BRAKE, b64.v("TicketButton(title=", this.a, ", singleDeeplink=", this.b, ", historyDeeplink="), this.d);
        }

        public f() {
            this(null, null, null, false);
        }
    }

    public /* synthetic */ ms30(int i) {
        this(false, null, null, null);
    }

    public ms30() {
        this(0);
    }
}
