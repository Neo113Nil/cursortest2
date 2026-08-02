package xsna;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: ApplicationInfo.kt */
/* loaded from: classes.dex */
public final class a22 {
    public final String a;
    public final String b;
    public final String c;
    public final ngd0 d;
    public final ArrayList e;

    public a22(String str, String str2, String str3, ngd0 ngd0Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ngd0Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a22)) {
            return false;
        }
        a22 a22Var = (a22) obj;
        if (!this.a.equals(a22Var.a) || !epx.f(this.b, a22Var.b) || !epx.f(this.c, a22Var.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return epx.f(str, str) && this.d.equals(a22Var.d) && this.e.equals(a22Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidApplicationInfo(packageName=");
        sb.append(this.a);
        sb.append(", versionName=");
        sb.append(this.b);
        sb.append(", appBuildVersion=");
        sb.append(this.c);
        sb.append(", deviceManufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", currentProcessDetails=");
        sb.append(this.d);
        sb.append(", appProcessDetails=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
    }
}
