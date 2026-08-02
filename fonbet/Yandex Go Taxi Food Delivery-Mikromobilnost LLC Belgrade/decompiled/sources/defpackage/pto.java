package defpackage;

import android.graphics.RectF;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pto {
    public final RectF a;
    public final float b;

    public pto(RectF rectF, float f) {
        this.a = rectF;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pto)) {
            return false;
        }
        pto ptoVar = (pto) obj;
        return this.a.equals(ptoVar.a) && Float.compare(this.b, ptoVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProgressGeometry(rect=" + this.a + ", radius=" + this.b + Extension.C_BRAKE;
    }
}
