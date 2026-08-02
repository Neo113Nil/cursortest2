package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class lgb0 extends cj91 {
    public final Bitmap b;

    public lgb0(Bitmap bitmap) {
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgb0) && jl40.l(this.b, ((lgb0) obj).b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.b;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    public final String toString() {
        return "CapturingState(bitmap=" + this.b + Extension.C_BRAKE;
    }
}
