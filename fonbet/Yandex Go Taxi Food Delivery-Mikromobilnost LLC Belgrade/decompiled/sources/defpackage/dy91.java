package defpackage;

/* loaded from: classes11.dex */
public final class dy91 extends jy91 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dy91(String str, String str2) {
        super(new qx91(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        if (charArray.length == 64) {
            return;
        }
        w511.q();
        throw null;
    }

    @Override // defpackage.jy91
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        tra1.e(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            qx91 qx91Var = this.a;
            char[] cArr = qx91Var.b;
            char[] cArr2 = qx91Var.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(i2, i - i2, sb, bArr);
        }
    }
}
