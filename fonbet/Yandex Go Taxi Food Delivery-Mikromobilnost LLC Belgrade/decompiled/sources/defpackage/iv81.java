package defpackage;

import android.view.View;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class iv81 {
    public final int a;
    public final int b;

    public iv81(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        this.a = width;
        this.b = height;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv81)) {
            return false;
        }
        iv81 iv81Var = (iv81) obj;
        return this.a == iv81Var.a && this.b == iv81Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ViewSize(width=", ", height=", Extension.C_BRAKE);
    }
}
