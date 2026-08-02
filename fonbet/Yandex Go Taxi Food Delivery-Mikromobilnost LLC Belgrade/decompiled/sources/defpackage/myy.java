package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class myy {
    public final Bitmap a;
    public final Bitmap b;

    public myy(Bitmap bitmap, Bitmap bitmap2) {
        this.a = bitmap;
        this.b = bitmap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myy)) {
            return false;
        }
        myy myyVar = (myy) obj;
        return this.a.equals(myyVar.a) && jl40.l(this.b, myyVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Bitmap bitmap = this.b;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        return "LoadedPanoramaIconState(pinIcon=" + this.a + ", expandedIcon=" + this.b + Extension.C_BRAKE;
    }
}
