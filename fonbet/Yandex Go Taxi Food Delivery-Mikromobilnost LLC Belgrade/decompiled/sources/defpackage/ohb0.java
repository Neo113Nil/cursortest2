package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ohb0 {
    public final Uri a;
    public final boolean b;

    public ohb0(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohb0)) {
            return false;
        }
        ohb0 ohb0Var = (ohb0) obj;
        return jl40.l(this.a, ohb0Var.a) && this.b == ohb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PhotoPickerResult(uri=" + this.a + ", isGalleryPhoto=" + this.b + Extension.C_BRAKE;
    }
}
