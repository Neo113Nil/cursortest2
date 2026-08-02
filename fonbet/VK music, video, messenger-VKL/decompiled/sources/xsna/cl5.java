package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* loaded from: classes.dex */
public final class cl5 extends j5k.e.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public cl5(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    @Override // xsna.j5k.e.a
    @Nullable
    public final String a() {
        return this.e;
    }

    @Override // xsna.j5k.e.a
    @Nullable
    public final String b() {
        return this.f;
    }

    @Override // xsna.j5k.e.a
    @Nullable
    public final String c() {
        return this.c;
    }

    @Override // xsna.j5k.e.a
    @NonNull
    public final String d() {
        return this.a;
    }

    @Override // xsna.j5k.e.a
    @Nullable
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.a)) {
            return false;
        }
        j5k.e.a aVar = (j5k.e.a) obj;
        if (!this.a.equals(aVar.d()) || !this.b.equals(aVar.g())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (aVar.c() != null) {
                return false;
            }
        } else if (!str.equals(aVar.c())) {
            return false;
        }
        if (aVar.f() != null) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (aVar.e() != null) {
                return false;
            }
        } else if (!str2.equals(aVar.e())) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!str3.equals(aVar.a())) {
            return false;
        }
        String str4 = this.f;
        return str4 == null ? aVar.b() == null : str4.equals(aVar.b());
    }

    @Override // xsna.j5k.e.a
    @Nullable
    public final j5k.e.a.AbstractC3096a f() {
        return null;
    }

    @Override // xsna.j5k.e.a
    @NonNull
    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return hashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", displayVersion=");
        sb.append(this.c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.d);
        sb.append(", developmentPlatform=");
        sb.append(this.e);
        sb.append(", developmentPlatformVersion=");
        return i5s.a(sb, this.f, "}");
    }
}
