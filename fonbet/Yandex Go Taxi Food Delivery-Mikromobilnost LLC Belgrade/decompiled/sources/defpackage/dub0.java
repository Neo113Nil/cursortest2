package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class dub0 {
    public final a a;
    public final a b;

    public dub0(a aVar, a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dub0)) {
            return false;
        }
        dub0 dub0Var = (dub0) obj;
        return jl40.l(this.a, dub0Var.a) && jl40.l(this.b, dub0Var.b);
    }

    public final int hashCode() {
        a aVar = this.a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.b;
        return hashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PinAlertMessage(warningData=" + this.a + ", successData=" + this.b + Extension.C_BRAKE;
    }

    public dub0() {
        this(null, null);
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final Long c;

        public a(String str, String str2, Long l) {
            this.a = str;
            this.b = str2;
            this.c = l;
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
            Long l = this.c;
            return hashCode2 + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("PinData(title=", this.a, ", subtitle=", this.b, ", timeout=");
            v.append(this.c);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public a() {
            this(null, null, null);
        }
    }
}
