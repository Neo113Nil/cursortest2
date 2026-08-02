package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ofx extends lgi0 {
    public final byte[] a;

    public ofx(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.blq0
    public final boolean Q0(Object obj) {
        if (obj instanceof byte[]) {
            return Arrays.equals(this.a, (byte[]) obj);
        }
        if (obj instanceof qfx) {
            return ((qfx) obj).a.equals(this);
        }
        return false;
    }

    public final Object clone() {
        return new ofx(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ofx) {
            return Arrays.equals(this.a, ((ofx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return rza1.e(this.a);
    }
}
