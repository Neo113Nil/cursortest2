package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class f001 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public f001(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f001.class == obj.getClass()) {
            f001 f001Var = (f001) obj;
            if (this.a == f001Var.a && this.c == f001Var.c && this.d == f001Var.d && Arrays.equals(this.b, f001Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
