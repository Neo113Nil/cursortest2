package defpackage;

import android.graphics.Bitmap;
import android.util.Range;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mub0 {
    public final Bitmap a;
    public final boolean b;
    public final Range c;

    public mub0(Bitmap bitmap, boolean z, Range range) {
        this.a = bitmap;
        this.b = z;
        this.c = range;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mub0)) {
            return false;
        }
        mub0 mub0Var = (mub0) obj;
        return jl40.l(this.a, mub0Var.a) && this.b == mub0Var.b && this.c.equals(mub0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "PinAppearance(pinIcon=" + this.a + ", labelEnabled=" + this.b + ", zoomRange=" + this.c + Extension.C_BRAKE;
    }
}
