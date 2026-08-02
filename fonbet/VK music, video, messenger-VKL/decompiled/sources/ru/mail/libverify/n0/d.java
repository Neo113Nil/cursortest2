package ru.mail.libverify.n0;

import androidx.annotation.NonNull;
import java.nio.charset.StandardCharsets;

/* loaded from: classes9.dex */
public abstract class d {
    private static int a(int i, int i2, int i3, int i4, int i5) {
        int i6 = ((i2 & i) | (i3 & (~i))) + i5;
        return ((i6 >>> (32 - i4)) | (i6 << i4)) + i;
    }

    private static int b(int i, int i2, int i3, int i4, int i5) {
        int i6 = ((i2 & (~i3)) | (i3 & i)) + i5;
        return ((i6 >>> (32 - i4)) | (i6 << i4)) + i;
    }

    private static int c(int i, int i2, int i3, int i4, int i5) {
        int i6 = ((i2 ^ i) ^ i3) + i5;
        return ((i6 >>> (32 - i4)) | (i6 << i4)) + i;
    }

    private static int d(int i, int i2, int i3, int i4, int i5) {
        int i6 = (i2 ^ ((~i3) | i)) + i5;
        return ((i6 >>> (32 - i4)) | (i6 << i4)) + i;
    }

    @NonNull
    public static String a(@NonNull String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int[] iArr = new int[16];
        int[] iArr2 = {1732584193, -271733879, -1732584194, 271733878};
        int[] iArr3 = new int[2];
        byte[] bArr = new byte[64];
        a(bytes, bytes.length, iArr, iArr2, iArr3, bArr);
        byte[] a = a(new byte[16], iArr3, 8);
        byte[] bArr2 = new byte[64];
        bArr2[0] = Byte.MIN_VALUE;
        int i = (iArr3[0] >>> 3) & 63;
        a(bArr2, i < 56 ? 56 - i : 120 - i, iArr, iArr2, iArr3, bArr);
        a(a, 8, iArr, iArr2, iArr3, bArr);
        return e.a(a(a, iArr2, 16));
    }

    private static void a(@NonNull byte[] bArr, int i, @NonNull int[] iArr, @NonNull int[] iArr2, @NonNull int[] iArr3, @NonNull byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        int i2 = 0;
        int i3 = iArr3[0];
        int i4 = (i3 >>> 3) & 63;
        int i5 = i << 3;
        int i6 = i3 + i5;
        iArr3[0] = i6;
        if (i6 < i5) {
            iArr3[1] = iArr3[1] + 1;
        }
        iArr3[1] = iArr3[1] + (i >>> 29);
        int i7 = 64 - i4;
        if (i >= i7) {
            System.arraycopy(bArr, 0, bArr2, i4, i7);
            a(bArr2, iArr, iArr2);
            while (i7 + 63 < i) {
                System.arraycopy(bArr, i7, bArr3, 0, 64);
                a(bArr3, iArr, iArr2);
                i7 += 64;
            }
            i4 = 0;
            i2 = i7;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i - i2);
    }

    private static void a(@NonNull byte[] bArr, @NonNull int[] iArr, @NonNull int[] iArr2) {
        int i = -1;
        int i2 = 0;
        do {
            int i3 = (bArr[i + 1] & 255) | ((bArr[i + 2] & 255) << 8) | ((bArr[i + 3] & 255) << 16);
            i += 4;
            iArr[i2] = i3 | (bArr[i] << 24);
            i2++;
        } while (i2 < 16);
        int i4 = iArr2[1];
        int i5 = iArr2[2];
        int a = a(i4, i5, iArr2[3], 7, (iArr2[0] + iArr[0]) - 680876936);
        int a2 = a(a, i4, i5, 12, (r9 + iArr[1]) - 389564586);
        int a3 = a(a2, a, i4, 17, i5 + iArr[2] + 606105819);
        int a4 = a(a3, a2, a, 22, (i4 + iArr[3]) - 1044525330);
        int a5 = a(a4, a3, a2, 7, (a + iArr[4]) - 176418897);
        int a6 = a(a5, a4, a3, 12, a2 + iArr[5] + 1200080426);
        int a7 = a(a6, a5, a4, 17, (a3 + iArr[6]) - 1473231341);
        int a8 = a(a7, a6, a5, 22, (a4 + iArr[7]) - 45705983);
        int a9 = a(a8, a7, a6, 7, a5 + iArr[8] + 1770035416);
        int a10 = a(a9, a8, a7, 12, (a6 + iArr[9]) - 1958414417);
        int a11 = a(a10, a9, a8, 17, (a7 + iArr[10]) - 42063);
        int a12 = a(a11, a10, a9, 22, (a8 + iArr[11]) - 1990404162);
        int a13 = a(a12, a11, a10, 7, a9 + iArr[12] + 1804603682);
        int a14 = a(a13, a12, a11, 12, (a10 + iArr[13]) - 40341101);
        int a15 = a(a14, a13, a12, 17, (a11 + iArr[14]) - 1502002290);
        int a16 = a(a15, a14, a13, 22, a12 + iArr[15] + 1236535329);
        int b = b(a16, a15, a14, 5, (a13 + iArr[1]) - 165796510);
        int b2 = b(b, a16, a15, 9, (a14 + iArr[6]) - 1069501632);
        int b3 = b(b2, b, a16, 14, a15 + iArr[11] + 643717713);
        int b4 = b(b3, b2, b, 20, (a16 + iArr[0]) - 373897302);
        int b5 = b(b4, b3, b2, 5, (b + iArr[5]) - 701558691);
        int b6 = b(b5, b4, b3, 9, b2 + iArr[10] + 38016083);
        int b7 = b(b6, b5, b4, 14, (b3 + iArr[15]) - 660478335);
        int b8 = b(b7, b6, b5, 20, (b4 + iArr[4]) - 405537848);
        int b9 = b(b8, b7, b6, 5, b5 + iArr[9] + 568446438);
        int b10 = b(b9, b8, b7, 9, (b6 + iArr[14]) - 1019803690);
        int b11 = b(b10, b9, b8, 14, (b7 + iArr[3]) - 187363961);
        int b12 = b(b11, b10, b9, 20, b8 + iArr[8] + 1163531501);
        int b13 = b(b12, b11, b10, 5, (b9 + iArr[13]) - 1444681467);
        int b14 = b(b13, b12, b11, 9, (b10 + iArr[2]) - 51403784);
        int b15 = b(b14, b13, b12, 14, b11 + iArr[7] + 1735328473);
        int b16 = b(b15, b14, b13, 20, (b12 + iArr[12]) - 1926607734);
        int c = c(b16, b15, b14, 4, (b13 + iArr[5]) - 378558);
        int c2 = c(c, b16, b15, 11, (b14 + iArr[8]) - 2022574463);
        int c3 = c(c2, c, b16, 16, b15 + iArr[11] + 1839030562);
        int c4 = c(c3, c2, c, 23, (b16 + iArr[14]) - 35309556);
        int c5 = c(c4, c3, c2, 4, (c + iArr[1]) - 1530992060);
        int c6 = c(c5, c4, c3, 11, c2 + iArr[4] + 1272893353);
        int c7 = c(c6, c5, c4, 16, (c3 + iArr[7]) - 155497632);
        int c8 = c(c7, c6, c5, 23, (c4 + iArr[10]) - 1094730640);
        int c9 = c(c8, c7, c6, 4, c5 + iArr[13] + 681279174);
        int c10 = c(c9, c8, c7, 11, (c6 + iArr[0]) - 358537222);
        int c11 = c(c10, c9, c8, 16, (c7 + iArr[3]) - 722521979);
        int c12 = c(c11, c10, c9, 23, c8 + iArr[6] + 76029189);
        int c13 = c(c12, c11, c10, 4, (c9 + iArr[9]) - 640364487);
        int c14 = c(c13, c12, c11, 11, (c10 + iArr[12]) - 421815835);
        int c15 = c(c14, c13, c12, 16, c11 + iArr[15] + 530742520);
        int c16 = c(c15, c14, c13, 23, (c12 + iArr[2]) - 995338651);
        int d = d(c16, c15, c14, 6, (c13 + iArr[0]) - 198630844);
        int d2 = d(d, c16, c15, 10, c14 + iArr[7] + 1126891415);
        int d3 = d(d2, d, c16, 15, (c15 + iArr[14]) - 1416354905);
        int d4 = d(d3, d2, d, 21, (c16 + iArr[5]) - 57434055);
        int d5 = d(d4, d3, d2, 6, d + iArr[12] + 1700485571);
        int d6 = d(d5, d4, d3, 10, (d2 + iArr[3]) - 1894986606);
        int d7 = d(d6, d5, d4, 15, (d3 + iArr[10]) - 1051523);
        int d8 = d(d7, d6, d5, 21, (d4 + iArr[1]) - 2054922799);
        int d9 = d(d8, d7, d6, 6, d5 + iArr[8] + 1873313359);
        int d10 = d(d9, d8, d7, 10, (d6 + iArr[15]) - 30611744);
        int d11 = d(d10, d9, d8, 15, (d7 + iArr[6]) - 1560198380);
        int d12 = d(d11, d10, d9, 21, d8 + iArr[13] + 1309151649);
        int d13 = d(d12, d11, d10, 6, (d9 + iArr[4]) - 145523070);
        int d14 = d(d13, d12, d11, 10, (d10 + iArr[11]) - 1120210379);
        int d15 = d(d14, d13, d12, 15, d11 + iArr[2] + 718787259);
        int d16 = d(d15, d14, d13, 21, (d12 + iArr[9]) - 343485551);
        iArr2[0] = iArr2[0] + d13;
        iArr2[1] = iArr2[1] + d16;
        iArr2[2] = iArr2[2] + d15;
        iArr2[3] = iArr2[3] + d14;
    }

    private static byte[] a(byte[] bArr, int[] iArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i3];
            bArr[i2] = (byte) i4;
            bArr[i2 + 1] = (byte) (i4 >>> 8);
            int i5 = i2 + 3;
            bArr[i2 + 2] = (byte) (i4 >>> 16);
            i2 += 4;
            bArr[i5] = (byte) (i4 >>> 24);
            i3++;
        }
        return bArr;
    }
}
