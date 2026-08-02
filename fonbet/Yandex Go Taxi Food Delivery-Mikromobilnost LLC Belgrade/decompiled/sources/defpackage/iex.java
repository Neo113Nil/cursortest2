package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;

/* loaded from: classes9.dex */
public final class iex implements xrw {
    public char[] a = ui9.c.b(128);
    public int b;

    public final void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.a;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.a = Arrays.copyOf(cArr, i3);
        }
    }

    @Override // defpackage.xrw
    public final void i(char c) {
        a(this.b, 1);
        char[] cArr = this.a;
        int i = this.b;
        this.b = i + 1;
        cArr[i] = c;
    }

    @Override // defpackage.xrw
    public final void k(String str) {
        int i;
        a(this.b, str.length() + 2);
        char[] cArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        cArr[i2] = OpenList.CHAR_QUOTE;
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = ytu0.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    a(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = ytu0.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            this.a[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = ytu0.a[charAt];
                                a(i5, str2.length());
                                str2.getChars(0, str2.length(), this.a, i5);
                                int length3 = str2.length() + i5;
                                this.b = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = this.a;
                                cArr2[i5] = CSPStore.UNIQUE_SEPARATOR;
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                this.b = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        this.a[i5] = charAt;
                    }
                    i5 = i;
                }
                a(i5, 1);
                this.a[i5] = OpenList.CHAR_QUOTE;
                this.b = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = OpenList.CHAR_QUOTE;
        this.b = i4 + 1;
    }

    @Override // defpackage.xrw
    public final void l(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.b, length);
        str.getChars(0, str.length(), this.a, this.b);
        this.b += length;
    }

    public final String toString() {
        return new String(this.a, 0, this.b);
    }

    @Override // defpackage.xrw
    public final void writeLong(long j) {
        l(String.valueOf(j));
    }
}
