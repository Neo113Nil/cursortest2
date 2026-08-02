package defpackage;

import android.widget.ImageView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mf61 {
    public float a;
    public float b;
    public float c;
    public ImageView.ScaleType d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf61)) {
            return false;
        }
        mf61 mf61Var = (mf61) obj;
        return Float.compare(this.a, mf61Var.a) == 0 && Float.compare(this.b, mf61Var.b) == 0 && Float.compare(this.c, mf61Var.c) == 0 && this.d == mf61Var.d;
    }

    public final int hashCode() {
        int c = g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
        ImageView.ScaleType scaleType = this.d;
        return c + (scaleType == null ? 0 : scaleType.hashCode());
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        ImageView.ScaleType scaleType = this.d;
        StringBuilder k = oo31.k("ZoomVariables(scale=", f, ", focusX=", f2, ", focusY=");
        k.append(f3);
        k.append(", scaleType=");
        k.append(scaleType);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
