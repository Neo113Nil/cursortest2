package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class enj implements gnj {
    public final byte[] a;

    public enj(byte[] bArr) {
        this.a = bArr;
    }

    public final byte[] a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (enj.class.equals(obj != null ? obj.getClass() : null)) {
            return Arrays.equals(this.a, ((enj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return oyr.p("Binary(data=", Arrays.toString(this.a), Extension.C_BRAKE);
    }
}
