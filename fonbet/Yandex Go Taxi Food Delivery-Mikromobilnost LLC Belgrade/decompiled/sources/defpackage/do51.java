package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class do51 {
    public final Uri a;
    public final Boolean b;

    public do51(Uri uri, Boolean bool) {
        this.a = uri;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do51)) {
            return false;
        }
        do51 do51Var = (do51) obj;
        return jl40.l(this.a, do51Var.a) && jl40.l(this.b, do51Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "YangoPayDeeplink(deeplinkUri=" + this.a + ", onboarding=" + this.b + Extension.C_BRAKE;
    }
}
