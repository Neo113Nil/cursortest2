package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hwc {
    public final boolean a;
    public final float b;

    public hwc(boolean z, float f) {
        this.a = z;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwc)) {
            return false;
        }
        hwc hwcVar = (hwc) obj;
        return this.a == hwcVar.a && Float.compare(this.b, hwcVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CompassButtonState(isVisible=" + this.a + ", azimuth=" + this.b + Extension.C_BRAKE;
    }

    public hwc() {
        this(0);
    }

    public /* synthetic */ hwc(int i) {
        this(false, 0.0f);
    }
}
