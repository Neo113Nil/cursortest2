package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class hw81 implements kq71 {
    public final int a;
    public final int b;
    public final int c;
    public final byte[] w;
    public int x;

    public hw81(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.w = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hw81.class == obj.getClass()) {
            hw81 hw81Var = (hw81) obj;
            if (this.a == hw81Var.a && this.b == hw81Var.b && this.c == hw81Var.c && Arrays.equals(this.w, hw81Var.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.x == 0) {
            this.x = Arrays.hashCode(this.w) + ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31);
        }
        return this.x;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.a);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.b);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.c);
        sb.append(Extension.FIX_SPACE);
        return x4e.i(sb, this.w != null, Extension.C_BRAKE);
    }
}
