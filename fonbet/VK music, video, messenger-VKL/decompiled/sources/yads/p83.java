package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class p83 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public p83(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p83.class == obj.getClass()) {
            p83 p83Var = (p83) obj;
            if (this.a == p83Var.a && this.c == p83Var.c && this.d == p83Var.d && Arrays.equals(this.b, p83Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
