package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ah81 {
    public final String a;
    public final Bitmap b;

    public ah81(Bitmap bitmap, String str) {
        this.a = str;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah81)) {
            return false;
        }
        ah81 ah81Var = (ah81) obj;
        return this.a.equals(ah81Var.a) && jl40.l(this.b, ah81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageData(url=" + this.a + ", bitmap=" + this.b + Extension.C_BRAKE;
    }
}
