package xsna;

import xsna.kyk0;

/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* loaded from: classes.dex */
public final class xn5 extends kyk0.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final s5m f;

    public xn5(String str, String str2, String str3, String str4, int i, s5m s5mVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = str4;
        this.e = i;
        this.f = s5mVar;
    }

    @Override // xsna.kyk0.a
    public final String a() {
        return this.a;
    }

    @Override // xsna.kyk0.a
    public final int b() {
        return this.e;
    }

    @Override // xsna.kyk0.a
    public final s5m c() {
        return this.f;
    }

    @Override // xsna.kyk0.a
    public final String d() {
        return this.d;
    }

    @Override // xsna.kyk0.a
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kyk0.a)) {
            return false;
        }
        kyk0.a aVar = (kyk0.a) obj;
        return this.a.equals(aVar.a()) && this.b.equals(aVar.e()) && this.c.equals(aVar.f()) && this.d.equals(aVar.d()) && this.e == aVar.b() && this.f.equals(aVar.c());
    }

    @Override // xsna.kyk0.a
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
