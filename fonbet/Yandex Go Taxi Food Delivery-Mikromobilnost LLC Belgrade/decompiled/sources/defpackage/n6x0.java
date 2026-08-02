package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class n6x0 {
    public final la60 a;
    public final int b;

    public n6x0(la60 la60Var, int i) {
        this.a = la60Var;
        this.b = i;
    }

    public final String toString() {
        la60 la60Var = this.a;
        byte[] bArr = la60Var.a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length + 1);
        int length = copyOf.length - 1;
        int i = this.b;
        copyOf[length] = (byte) i;
        return la60Var + " length: " + i + " " + cdb1.c("%02x", copyOf);
    }
}
