package xsna;

import android.os.Build;
import com.google.firebase.sessions.LogEnvironment;

/* compiled from: ApplicationInfo.kt */
/* loaded from: classes.dex */
public final class ad3 {
    public final String a;
    public final LogEnvironment b;
    public final a22 c;

    public ad3(String str, LogEnvironment logEnvironment, a22 a22Var) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        this.a = str;
        this.b = logEnvironment;
        this.c = a22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad3)) {
            return false;
        }
        ad3 ad3Var = (ad3) obj;
        if (!epx.f(this.a, ad3Var.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!epx.f(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return epx.f(str2, str2) && this.b == ad3Var.b && this.c.equals(ad3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + urd0.a((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 47595001) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.1.2, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + this.b + ", androidAppInfo=" + this.c + ')';
    }
}
