package defpackage;

import com.yandex.delivery.mapper.model.PinStrategy$PinType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class i0c0 extends rm91 {
    public final PinStrategy$PinType b;

    public i0c0(PinStrategy$PinType pinStrategy$PinType) {
        this.b = pinStrategy$PinType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0c0) && this.b == ((i0c0) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Default(pinType=" + this.b + Extension.C_BRAKE;
    }
}
