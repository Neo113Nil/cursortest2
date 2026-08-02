package defpackage;

import android.os.Build;
import com.google.firebase.sessions.LogEnvironment;

/* loaded from: classes.dex */
public final class d03 {
    public final String a;
    public final LogEnvironment b;
    public final n72 c;

    public d03(String str, LogEnvironment logEnvironment, n72 n72Var) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        this.a = str;
        this.b = logEnvironment;
        this.c = n72Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d03)) {
            return false;
        }
        d03 d03Var = (d03) obj;
        if (!jl40.l(this.a, d03Var.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!jl40.l(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return jl40.l(str2, str2) && this.b == d03Var.b && this.c.equals(d03Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + unr0.b((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517562) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.3, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + this.b + ", androidAppInfo=" + this.c + ')';
    }
}
