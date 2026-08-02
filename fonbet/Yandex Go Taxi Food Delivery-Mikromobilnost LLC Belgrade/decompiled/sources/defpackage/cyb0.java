package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public final class cyb0 {
    public final zxb0 a;
    public final PlacemarkType b;

    public cyb0(zxb0 zxb0Var, PlacemarkType placemarkType) {
        this.a = zxb0Var;
        this.b = placemarkType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyb0)) {
            return false;
        }
        cyb0 cyb0Var = (cyb0) obj;
        return this.a.equals(cyb0Var.a) && this.b == cyb0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlacemarkConfig(descriptor=" + this.a + ", placemarkType=" + this.b + Extension.C_BRAKE;
    }
}
