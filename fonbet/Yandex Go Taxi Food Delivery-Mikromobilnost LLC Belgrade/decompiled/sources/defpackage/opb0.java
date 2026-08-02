package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class opb0 {
    public final Bitmap a;
    public final Bitmap b;
    public final String c;
    public final boolean d;

    public opb0(Bitmap bitmap, Bitmap bitmap2, String str, boolean z) {
        this.a = bitmap;
        this.b = bitmap2;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opb0)) {
            return false;
        }
        opb0 opb0Var = (opb0) obj;
        return jl40.l(this.a, opb0Var.a) && jl40.l(this.b, opb0Var.b) && this.c.equals(opb0Var.c) && this.d == opb0Var.d;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Bitmap bitmap2 = this.b;
        return Boolean.hashCode(this.d) + unr0.b((hashCode + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraButtonState(image=");
        sb.append(this.a);
        sb.append(", highlightedImage=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        return nnm.i(this.c, ", enabled=", Extension.C_BRAKE, sb, this.d);
    }
}
