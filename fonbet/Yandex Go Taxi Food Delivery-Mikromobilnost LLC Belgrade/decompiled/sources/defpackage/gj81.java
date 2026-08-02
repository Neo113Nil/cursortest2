package defpackage;

import android.graphics.RectF;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class gj81 {
    public final int a;
    public final RectF b;

    public gj81(RectF rectF, int i) {
        this.a = i;
        this.b = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj81)) {
            return false;
        }
        gj81 gj81Var = (gj81) obj;
        return this.a == gj81Var.a && jl40.l(this.b, gj81Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        RectF rectF = this.b;
        return hashCode + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        return "Exposure(exposedPercentage=" + this.a + ", visibleRectangle=" + this.b + Extension.C_BRAKE;
    }
}
