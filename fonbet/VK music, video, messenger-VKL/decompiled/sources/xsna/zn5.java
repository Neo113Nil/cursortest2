package xsna;

import android.os.Build;
import xsna.kyk0;

/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* loaded from: classes.dex */
public final class zn5 extends kyk0.c {
    public final String a;
    public final String b;
    public final boolean c;

    public zn5(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.b = str2;
        this.c = z;
    }

    @Override // xsna.kyk0.c
    public final boolean a() {
        return this.c;
    }

    @Override // xsna.kyk0.c
    public final String b() {
        return this.b;
    }

    @Override // xsna.kyk0.c
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kyk0.c)) {
            return false;
        }
        kyk0.c cVar = (kyk0.c) obj;
        return this.a.equals(cVar.c()) && this.b.equals(cVar.b()) && this.c == cVar.a();
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.a);
        sb.append(", osCodeName=");
        sb.append(this.b);
        sb.append(", isRooted=");
        return n23.b(sb, this.c, "}");
    }
}
