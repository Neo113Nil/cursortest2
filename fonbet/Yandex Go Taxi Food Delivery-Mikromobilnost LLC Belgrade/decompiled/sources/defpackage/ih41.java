package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class ih41 {
    public final kh41[] a;
    public final String b;
    public final byte[] c;
    public final int d;

    public ih41(byte[] bArr, kh41[] kh41VarArr) {
        Objects.requireNonNull(bArr);
        this.c = bArr;
        this.b = null;
        this.a = kh41VarArr;
        this.d = 1;
    }

    public final void a(int i) {
        int i2 = this.d;
        if (i == i2) {
            return;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        sb.append(i2 != 0 ? i2 != 1 ? "Unknown" : "ArrayBuffer" : "String");
        sb.append(" expected, but got ");
        sb.append(i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String");
        throw new IllegalStateException(sb.toString());
    }

    public final int b() {
        return this.d;
    }

    public ih41(String str, kh41[] kh41VarArr) {
        this.b = str;
        this.c = null;
        this.a = kh41VarArr;
        this.d = 0;
    }
}
