package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class kpm0 {
    public final Uri a;
    public final String b;

    public kpm0(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpm0)) {
            return false;
        }
        kpm0 kpm0Var = (kpm0) obj;
        return jl40.l(this.a, kpm0Var.a) && jl40.l(this.b, kpm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScooterPhoto(uri=" + this.a + ", uuid=" + this.b + Extension.C_BRAKE;
    }
}
