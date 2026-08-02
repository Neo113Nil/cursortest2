package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class e9v {
    public final byte[] a;
    public final boolean b;

    public e9v(byte[] bArr, boolean z) {
        this.a = bArr;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9v)) {
            return false;
        }
        e9v e9vVar = (e9v) obj;
        return this.a.equals(e9vVar.a) && this.b == e9vVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xvz.k("CompressResult(bytes=", Arrays.toString(this.a), ", extensionWasChanged=", this.b, Extension.C_BRAKE);
    }
}
