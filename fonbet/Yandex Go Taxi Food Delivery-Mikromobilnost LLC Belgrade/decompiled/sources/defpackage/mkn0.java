package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes13.dex */
public final class mkn0 implements qkn0 {
    public final ScootersErrorCode a;

    public final boolean equals(Object obj) {
        if (obj instanceof mkn0) {
            return this.a == ((mkn0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Default(code=" + this.a + Extension.C_BRAKE;
    }
}
