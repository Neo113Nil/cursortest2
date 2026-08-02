package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: AutoValue_InstallIdProvider_InstallIds.java */
/* loaded from: classes.dex */
public final class wm5 extends d6x {
    public final String a;
    public final String b;
    public final String c;

    public wm5(String str, @Nullable String str2, @Nullable String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // xsna.d6x
    @NonNull
    public final String a() {
        return this.a;
    }

    @Override // xsna.d6x
    @Nullable
    public final String b() {
        return this.c;
    }

    @Override // xsna.d6x
    @Nullable
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d6x)) {
            return false;
        }
        d6x d6xVar = (d6x) obj;
        if (!this.a.equals(d6xVar.a())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (d6xVar.c() != null) {
                return false;
            }
        } else if (!str.equals(d6xVar.c())) {
            return false;
        }
        String str2 = this.c;
        return str2 == null ? d6xVar.b() == null : str2.equals(d6xVar.b());
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", firebaseAuthenticationToken=");
        return i5s.a(sb, this.c, "}");
    }
}
