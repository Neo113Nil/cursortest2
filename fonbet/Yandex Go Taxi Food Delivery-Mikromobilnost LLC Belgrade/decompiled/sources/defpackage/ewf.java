package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ewf {
    public final byte[] a;
    public final int b;

    public ewf(byte[] bArr, int i) {
        this.a = rza1.b(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ewf)) {
            return false;
        }
        ewf ewfVar = (ewf) obj;
        if (ewfVar.b != this.b) {
            return false;
        }
        return Arrays.equals(this.a, ewfVar.a);
    }

    public final int hashCode() {
        return this.b ^ rza1.e(this.a);
    }
}
