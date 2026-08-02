package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ns8 {
    public final float a;
    public final String b;

    public ns8(float f, String str) {
        this.a = f;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns8)) {
            return false;
        }
        ns8 ns8Var = (ns8) obj;
        return Float.compare(this.a, ns8Var.a) == 0 && this.b.equals(ns8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CameraLensInfo(zoomRatio=" + this.a + ", label=" + this.b + Extension.C_BRAKE;
    }
}
