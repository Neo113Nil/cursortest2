package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport.java */
/* loaded from: classes.dex */
public final class uk5 extends j5k {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final j5k.e k;
    public final j5k.d l;
    public final j5k.a m;

    /* compiled from: AutoValue_CrashlyticsReport.java */
    public static final class a extends j5k.b {
        public String a;
        public String b;
        public int c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public j5k.e j;
        public j5k.d k;
        public j5k.a l;
        public byte m;

        public final uk5 a() {
            if (this.m == 1 && this.a != null && this.b != null && this.d != null && this.h != null && this.i != null) {
                return new uk5(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" sdkVersion");
            }
            if (this.b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.m) == 0) {
                sb.append(" platform");
            }
            if (this.d == null) {
                sb.append(" installationUuid");
            }
            if (this.h == null) {
                sb.append(" buildVersion");
            }
            if (this.i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException(t9c.b("Missing required properties:", sb));
        }
    }

    public uk5(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, j5k.e eVar, j5k.d dVar, j5k.a aVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = eVar;
        this.l = dVar;
        this.m = aVar;
    }

    @Override // xsna.j5k
    @Nullable
    public final j5k.a a() {
        return this.m;
    }

    @Override // xsna.j5k
    @Nullable
    public final String b() {
        return this.h;
    }

    @Override // xsna.j5k
    @NonNull
    public final String c() {
        return this.i;
    }

    @Override // xsna.j5k
    @NonNull
    public final String d() {
        return this.j;
    }

    @Override // xsna.j5k
    @Nullable
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k)) {
            return false;
        }
        j5k j5kVar = (j5k) obj;
        if (!this.b.equals(j5kVar.k()) || !this.c.equals(j5kVar.g()) || this.d != j5kVar.j() || !this.e.equals(j5kVar.h())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (j5kVar.f() != null) {
                return false;
            }
        } else if (!str.equals(j5kVar.f())) {
            return false;
        }
        String str2 = this.g;
        if (str2 == null) {
            if (j5kVar.e() != null) {
                return false;
            }
        } else if (!str2.equals(j5kVar.e())) {
            return false;
        }
        String str3 = this.h;
        if (str3 == null) {
            if (j5kVar.b() != null) {
                return false;
            }
        } else if (!str3.equals(j5kVar.b())) {
            return false;
        }
        if (!this.i.equals(j5kVar.c()) || !this.j.equals(j5kVar.d())) {
            return false;
        }
        j5k.e eVar = this.k;
        if (eVar == null) {
            if (j5kVar.l() != null) {
                return false;
            }
        } else if (!eVar.equals(j5kVar.l())) {
            return false;
        }
        j5k.d dVar = this.l;
        if (dVar == null) {
            if (j5kVar.i() != null) {
                return false;
            }
        } else if (!dVar.equals(j5kVar.i())) {
            return false;
        }
        j5k.a aVar = this.m;
        return aVar == null ? j5kVar.a() == null : aVar.equals(j5kVar.a());
    }

    @Override // xsna.j5k
    @Nullable
    public final String f() {
        return this.f;
    }

    @Override // xsna.j5k
    @NonNull
    public final String g() {
        return this.c;
    }

    @Override // xsna.j5k
    @NonNull
    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        j5k.e eVar = this.k;
        int hashCode5 = (hashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        j5k.d dVar = this.l;
        int hashCode6 = (hashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        j5k.a aVar = this.m;
        return hashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // xsna.j5k
    @Nullable
    public final j5k.d i() {
        return this.l;
    }

    @Override // xsna.j5k
    public final int j() {
        return this.d;
    }

    @Override // xsna.j5k
    @NonNull
    public final String k() {
        return this.b;
    }

    @Override // xsna.j5k
    @Nullable
    public final j5k.e l() {
        return this.k;
    }

    @Override // xsna.j5k
    public final a m() {
        a aVar = new a();
        aVar.a = this.b;
        aVar.b = this.c;
        aVar.c = this.d;
        aVar.d = this.e;
        aVar.e = this.f;
        aVar.f = this.g;
        aVar.g = this.h;
        aVar.h = this.i;
        aVar.i = this.j;
        aVar.j = this.k;
        aVar.k = this.l;
        aVar.l = this.m;
        aVar.m = (byte) 1;
        return aVar;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
