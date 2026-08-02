package defpackage;

import android.os.Build;
import defpackage.f7u0;

/* loaded from: classes.dex */
public final class n84 extends f7u0.c {
    public final String a;
    public final String b;
    public final boolean c;

    public n84(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            ny61.t("Null osRelease");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            ny61.t("Null osCodeName");
            throw null;
        }
        this.b = str2;
        this.c = z;
    }

    @Override // f7u0.c
    public final boolean a() {
        return this.c;
    }

    @Override // f7u0.c
    public final String b() {
        return this.b;
    }

    @Override // f7u0.c
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f7u0.c)) {
            return false;
        }
        f7u0.c cVar = (f7u0.c) obj;
        return this.a.equals(cVar.c()) && this.b.equals(cVar.b()) && this.c == cVar.a();
    }

    public final int hashCode() {
        return (this.c ? 1231 : 1237) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.a);
        sb.append(", osCodeName=");
        sb.append(this.b);
        sb.append(", isRooted=");
        return x4e.i(sb, this.c, "}");
    }
}
