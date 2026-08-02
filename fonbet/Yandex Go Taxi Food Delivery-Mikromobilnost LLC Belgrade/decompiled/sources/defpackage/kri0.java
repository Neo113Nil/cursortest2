package defpackage;

import com.ybsdk.api.entities.YBProduct;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class kri0 extends zia1 {
    public final YBProduct a;

    public kri0(YBProduct yBProduct) {
        this.a = yBProduct;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kri0) && this.a == ((kri0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewUser(product=" + this.a + Extension.C_BRAKE;
    }
}
