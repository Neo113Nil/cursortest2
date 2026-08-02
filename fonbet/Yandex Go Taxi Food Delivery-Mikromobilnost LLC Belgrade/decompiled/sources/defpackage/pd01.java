package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pd01 {
    public static final pd01 e = new pd01(false, null, null, false, 31);
    public final boolean a;
    public final oov0 b;
    public final b c;
    public final boolean d;

    public pd01(boolean z, oov0 oov0Var, b bVar, boolean z2, int i) {
        z = (i & 1) != 0 ? false : z;
        oov0Var = (i & 2) != 0 ? null : oov0Var;
        bVar = (i & 4) != 0 ? null : bVar;
        z2 = (i & 16) != 0 ? false : z2;
        this.a = z;
        this.b = oov0Var;
        this.c = bVar;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd01)) {
            return false;
        }
        pd01 pd01Var = (pd01) obj;
        return this.a == pd01Var.a && jl40.l(this.b, pd01Var.b) && jl40.l(this.c, pd01Var.c) && this.d == pd01Var.d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        oov0 oov0Var = this.b;
        int hashCode2 = (hashCode + (oov0Var == null ? 0 : oov0Var.hashCode())) * 31;
        b bVar = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 961);
    }

    public final String toString() {
        return "TrainsFlowConfig(enabled=" + this.a + ", summary=" + this.b + ", stationSearch=" + this.c + ", aeroExpressFixes=null, shouldUseLegacyFlow=" + this.d + Extension.C_BRAKE;
    }

    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return oyr.t(b64.v("StationField(label=", this.a, ", placeholder=", this.b, ", defaultIconTag="), this.c, Extension.C_BRAKE);
        }

        public a() {
            this(null, null, null);
        }
    }

    public static final class b {
        public final a a;
        public final a b;
        public final String c;

        public b(a aVar, a aVar2, String str) {
            this.a = aVar;
            this.b = aVar2;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c);
        }

        public final int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            a aVar2 = this.b;
            int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            String str = this.c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StationSearch(toStation=");
            sb.append(this.a);
            sb.append(", fromStation=");
            sb.append(this.b);
            sb.append(", emptySuggestsMessage=");
            return oyr.t(sb, this.c, Extension.C_BRAKE);
        }

        public b() {
            this(null, null, null);
        }
    }

    public pd01() {
        this(false, null, null, false, 31);
    }
}
