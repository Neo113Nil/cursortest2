package defpackage;

import defpackage.f7u0;

/* loaded from: classes.dex */
public final class l84 extends f7u0.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final lb7 f;

    public l84(String str, String str2, String str3, String str4, int i, lb7 lb7Var) {
        if (str == null) {
            ny61.t("Null appIdentifier");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            ny61.t("Null versionCode");
            throw null;
        }
        this.b = str2;
        if (str3 == null) {
            ny61.t("Null versionName");
            throw null;
        }
        this.c = str3;
        if (str4 == null) {
            ny61.t("Null installUuid");
            throw null;
        }
        this.d = str4;
        this.e = i;
        this.f = lb7Var;
    }

    @Override // f7u0.a
    public final String a() {
        return this.a;
    }

    @Override // f7u0.a
    public final int b() {
        return this.e;
    }

    @Override // f7u0.a
    public final lb7 c() {
        return this.f;
    }

    @Override // f7u0.a
    public final String d() {
        return this.d;
    }

    @Override // f7u0.a
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f7u0.a)) {
            return false;
        }
        f7u0.a aVar = (f7u0.a) obj;
        return this.a.equals(aVar.a()) && this.b.equals(aVar.e()) && this.c.equals(aVar.f()) && this.d.equals(aVar.d()) && this.e == aVar.b() && this.f.equals(aVar.c());
    }

    @Override // f7u0.a
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
