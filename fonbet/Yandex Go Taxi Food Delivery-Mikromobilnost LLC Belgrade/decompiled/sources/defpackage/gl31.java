package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class gl31 extends kl31 {
    public final Bitmap a;

    public gl31(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gl31) && jl40.l(this.a, ((gl31) obj).a);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    public final String toString() {
        return "FinishState(cameraPreviewBitmap=" + this.a + Extension.C_BRAKE;
    }
}
