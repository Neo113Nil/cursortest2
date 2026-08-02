package defpackage;

import android.os.Build;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class nei0 {
    public final String a;
    public final String b;

    public nei0(String str, String str2) {
        String str3 = Build.VERSION.RELEASE;
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nei0)) {
            return false;
        }
        nei0 nei0Var = (nei0) obj;
        if (!jl40.l(this.a, nei0Var.a) || !jl40.l(this.b, nei0Var.b)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return jl40.l(str, str);
    }

    public final int hashCode() {
        return Build.VERSION.RELEASE.hashCode() + unr0.b(unr0.b(-868680815, 31, this.a), 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("RealtimeEventPlatformInfo(platformName=Android, applicationName=", this.a, ", appVersion=", this.b, ", osVersion="), Build.VERSION.RELEASE, Extension.C_BRAKE);
    }
}
