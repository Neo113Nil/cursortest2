package defpackage;

import android.os.Build;
import com.yandex.plus.core.config.Environment;
import java.util.List;

/* loaded from: classes2.dex */
public final class evg {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Environment f;
    public final List g;

    public evg(String str, String str2, String str3, String str4, String str5, Environment environment, List list) {
        String str6 = Build.VERSION.RELEASE;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = environment;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evg)) {
            return false;
        }
        evg evgVar = (evg) obj;
        if (!this.a.equals(evgVar.a) || !this.b.equals(evgVar.b) || !this.c.equals(evgVar.c)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return jl40.l(str, str) && this.d.equals(evgVar.d) && jl40.l(this.e, evgVar.e) && this.f == evgVar.f && this.g.equals(evgVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + unr0.e(unr0.b((((this.d.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.VERSION.RELEASE)) * 31) + 1986582806) * 31, 31, this.e), 31, false)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugInfo(puid=");
        sb.append(this.a);
        sb.append(", deviceId=");
        sb.append(this.b);
        sb.append(", deviceModel=");
        sb.append(this.c);
        sb.append(", osVersion=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(", appVersion=");
        sb.append(this.d);
        sb.append(", sdkVersion=110.0.2, serviceName=");
        sb.append(this.e);
        sb.append(", isBdui=false, environment=");
        sb.append(this.f);
        sb.append(", activeFlags=");
        return unr0.t(sb, this.g, ')');
    }
}
