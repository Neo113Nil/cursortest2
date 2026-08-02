package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fys0 implements hys0 {
    public final byte[] a;
    public final wbf b;

    public fys0(byte[] bArr, wbf wbfVar) {
        this.a = bArr;
        this.b = wbfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fys0)) {
            return false;
        }
        fys0 fys0Var = (fys0) obj;
        return jl40.l(this.a, fys0Var.a) && this.b.equals(fys0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PhotoTaken(photo=" + Arrays.toString(this.a) + ", cropInfo=" + this.b + Extension.C_BRAKE;
    }
}
