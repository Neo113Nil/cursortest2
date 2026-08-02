package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.api.PinWarAnimationType;

/* loaded from: classes7.dex */
public final class o1c0 implements m1c0 {
    public final PinWarAnimationType b;
    public final float c;

    public o1c0(PinWarAnimationType pinWarAnimationType, float f) {
        this.b = pinWarAnimationType;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1c0)) {
            return false;
        }
        o1c0 o1c0Var = (o1c0) obj;
        return this.b == o1c0Var.b && Float.compare(this.c, o1c0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "PinWarAnimationImpl(type=" + this.b + ", duration=" + this.c + Extension.C_BRAKE;
    }
}
