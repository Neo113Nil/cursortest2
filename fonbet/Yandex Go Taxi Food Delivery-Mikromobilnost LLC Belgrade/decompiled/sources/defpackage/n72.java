package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n72 {
    public final String a;
    public final String b;
    public final String c;
    public final s5f0 d;
    public final ArrayList e;

    public n72(String str, String str2, String str3, s5f0 s5f0Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = s5f0Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n72)) {
            return false;
        }
        n72 n72Var = (n72) obj;
        if (!this.a.equals(n72Var.a) || !jl40.l(this.b, n72Var.b) || !jl40.l(this.c, n72Var.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return jl40.l(str, str) && this.d.equals(n72Var.d) && this.e.equals(n72Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
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
        return smw0.m(sb, this.e, ')');
    }
}
