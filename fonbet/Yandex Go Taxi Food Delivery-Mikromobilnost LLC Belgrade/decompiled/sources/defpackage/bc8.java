package defpackage;

import com.yandex.payment.sdk.core.data.BoundCard;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class bc8 extends cc8 {
    public final BoundCard a;

    public bc8(BoundCard boundCard) {
        this.a = boundCard;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc8) && this.a.equals(((bc8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NONE(boundCard=" + this.a + Extension.C_BRAKE;
    }
}
