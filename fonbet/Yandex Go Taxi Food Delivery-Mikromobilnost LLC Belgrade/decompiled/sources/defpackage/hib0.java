package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class hib0 extends abo {
    public final Bitmap a;

    public hib0(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hib0) && jl40.l(this.a, ((hib0) obj).a);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    public final String toString() {
        return "TakePhotoEvent(bitmap=" + this.a + Extension.C_BRAKE;
    }
}
