package xsna;

import com.vk.biometric.auth.api.domain.model.AuthMode;
import java.util.Arrays;

/* compiled from: CryptoWrappedData.kt */
/* loaded from: classes15.dex */
public final class vjk {
    public final AuthMode a;
    public final byte[] b;

    public vjk(AuthMode authMode, byte[] bArr) {
        this.a = authMode;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vjk.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        vjk vjkVar = (vjk) obj;
        return Arrays.equals(this.b, vjkVar.b) && this.a == vjkVar.a;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Arrays.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "CryptoWrappedData(authMode=" + this.a + ", data=" + Arrays.toString(this.b) + ')';
    }
}
