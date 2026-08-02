package com.google.zxing.oned;

import defpackage.ny61;
import defpackage.w8c;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class b {
    public int[][] a;
    public Code128Writer$MinimalEncoder$Latch[][] b;

    public static void a(ArrayList arrayList, int i, int[] iArr, int[] iArr2, int i2) {
        arrayList.add(w8c.a[i]);
        if (i2 != 0) {
            iArr2[0] = iArr2[0] + 1;
        }
        iArr[0] = (i * iArr2[0]) + iArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[ADDED_TO_REGION, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(CharSequence charSequence, Code128Writer$MinimalEncoder$Charset code128Writer$MinimalEncoder$Charset, int i) {
        char charAt;
        char charAt2 = charSequence.charAt(i);
        int i2 = a.b[code128Writer$MinimalEncoder$Charset.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return charAt2 == 241 || charAt2 == 242 || charAt2 == 243 || charAt2 == 244 || " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007fÿ".indexOf(charAt2) >= 0;
            }
            if (i2 == 3) {
                if (charAt2 != 241) {
                    int i3 = i + 1;
                    return i3 < charSequence.length() && charAt2 >= '0' && charAt2 <= '9' && (charAt = charSequence.charAt(i3)) >= '0' && charAt <= '9';
                }
            }
        }
        if (charAt2 == 241 || charAt2 == 242 || charAt2 == 243 || charAt2 == 244 || " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ".indexOf(charAt2) >= 0) {
        }
    }

    public final int c(CharSequence charSequence, Code128Writer$MinimalEncoder$Charset code128Writer$MinimalEncoder$Charset, int i) {
        int i2;
        int i3;
        int i4 = this.a[code128Writer$MinimalEncoder$Charset.ordinal()][i];
        if (i4 > 0) {
            return i4;
        }
        Code128Writer$MinimalEncoder$Latch code128Writer$MinimalEncoder$Latch = Code128Writer$MinimalEncoder$Latch.NONE;
        int i5 = i + 1;
        boolean z = i5 >= charSequence.length();
        Code128Writer$MinimalEncoder$Charset[] code128Writer$MinimalEncoder$CharsetArr = {Code128Writer$MinimalEncoder$Charset.A, Code128Writer$MinimalEncoder$Charset.B};
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        while (true) {
            if (i7 > 1) {
                break;
            }
            if (b(charSequence, code128Writer$MinimalEncoder$CharsetArr[i7], i)) {
                Code128Writer$MinimalEncoder$Latch code128Writer$MinimalEncoder$Latch2 = Code128Writer$MinimalEncoder$Latch.NONE;
                Code128Writer$MinimalEncoder$Charset code128Writer$MinimalEncoder$Charset2 = code128Writer$MinimalEncoder$CharsetArr[i7];
                if (code128Writer$MinimalEncoder$Charset != code128Writer$MinimalEncoder$Charset2) {
                    code128Writer$MinimalEncoder$Latch2 = Code128Writer$MinimalEncoder$Latch.valueOf(code128Writer$MinimalEncoder$Charset2.toString());
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                if (!z) {
                    i3 += c(charSequence, code128Writer$MinimalEncoder$CharsetArr[i7], i5);
                }
                if (i3 < i6) {
                    code128Writer$MinimalEncoder$Latch = code128Writer$MinimalEncoder$Latch2;
                    i6 = i3;
                }
                if (code128Writer$MinimalEncoder$Charset == code128Writer$MinimalEncoder$CharsetArr[(i7 + 1) % 2]) {
                    Code128Writer$MinimalEncoder$Latch code128Writer$MinimalEncoder$Latch3 = Code128Writer$MinimalEncoder$Latch.SHIFT;
                    int c = z ? 2 : c(charSequence, code128Writer$MinimalEncoder$Charset, i5) + 2;
                    if (c < i6) {
                        code128Writer$MinimalEncoder$Latch = code128Writer$MinimalEncoder$Latch3;
                        i6 = c;
                    }
                }
            }
            i7++;
        }
        Code128Writer$MinimalEncoder$Charset code128Writer$MinimalEncoder$Charset3 = Code128Writer$MinimalEncoder$Charset.C;
        if (b(charSequence, code128Writer$MinimalEncoder$Charset3, i)) {
            Code128Writer$MinimalEncoder$Latch code128Writer$MinimalEncoder$Latch4 = Code128Writer$MinimalEncoder$Latch.NONE;
            if (code128Writer$MinimalEncoder$Charset != code128Writer$MinimalEncoder$Charset3) {
                code128Writer$MinimalEncoder$Latch4 = Code128Writer$MinimalEncoder$Latch.C;
                i2 = 2;
            } else {
                i2 = 1;
            }
            int i8 = (charSequence.charAt(i) != 241 ? 2 : 1) + i;
            if (i8 < charSequence.length()) {
                i2 += c(charSequence, code128Writer$MinimalEncoder$Charset3, i8);
            }
            if (i2 < i6) {
                code128Writer$MinimalEncoder$Latch = code128Writer$MinimalEncoder$Latch4;
                i6 = i2;
            }
        }
        if (i6 == Integer.MAX_VALUE) {
            ny61.e(charSequence.charAt(i), "Bad character in input: ASCII value=");
            return 0;
        }
        this.a[code128Writer$MinimalEncoder$Charset.ordinal()][i] = i6;
        this.b[code128Writer$MinimalEncoder$Charset.ordinal()][i] = code128Writer$MinimalEncoder$Latch;
        return i6;
    }
}
