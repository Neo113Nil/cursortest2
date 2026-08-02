package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gwc {
    public static final gwc c = new gwc(false, 0.0f);
    public final boolean a;
    public final float b;

    public gwc(boolean z, float f) {
        this.a = z;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwc)) {
            return false;
        }
        gwc gwcVar = (gwc) obj;
        return this.a == gwcVar.a && Float.compare(this.b, gwcVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CompassButtonState(isVisible=" + this.a + ", azimuth=" + this.b + Extension.C_BRAKE;
    }
}
