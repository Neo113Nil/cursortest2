package defpackage;

import com.yandex.go.places.map.domain.entities.PlacesPinWarV2Config$LabelRenderingMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mdc0 {
    public final int a;
    public final int b;
    public final PlacesPinWarV2Config$LabelRenderingMode c;

    public mdc0(int i, int i2, PlacesPinWarV2Config$LabelRenderingMode placesPinWarV2Config$LabelRenderingMode) {
        this.a = i;
        this.b = i2;
        this.c = placesPinWarV2Config$LabelRenderingMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdc0)) {
            return false;
        }
        mdc0 mdc0Var = (mdc0) obj;
        return this.a == mdc0Var.a && this.b == mdc0Var.b && this.c == mdc0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "PinStyleConfig(titleMaxLines=", ", subtitleMaxLines=", ", labelRenderingMode=");
        s.append(this.c);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
