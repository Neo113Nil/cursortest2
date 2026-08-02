package yads;

import android.graphics.Bitmap;
import xsna.an10;

/* loaded from: classes10.dex */
public final class kq {
    public static Bitmap a(Bitmap bitmap, double d) {
        int i;
        int i2;
        int[] iArr;
        int i3 = 0;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, an10.a(bitmap.getWidth() * d), an10.a(bitmap.getHeight() * d), false);
        int i4 = 1;
        Bitmap copy = createScaledBitmap.copy(createScaledBitmap.getConfig(), true);
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i5 = width * height;
        int[] iArr2 = new int[i5];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i6 = width - 1;
        int i7 = height - 1;
        int[] iArr3 = new int[i5];
        int[] iArr4 = new int[i5];
        int[] iArr5 = new int[i5];
        int[] iArr6 = new int[width < height ? height : width];
        int[] iArr7 = new int[1024];
        for (int i8 = 0; i8 < 1024; i8++) {
            iArr7[i8] = i8 / 4;
        }
        char c = 3;
        int[][] iArr8 = new int[3][];
        int i9 = 0;
        while (true) {
            i = i3;
            if (i9 >= 3) {
                break;
            }
            iArr8[i9] = new int[3];
            i9++;
            i3 = i;
        }
        int i10 = i3;
        int i11 = i10;
        while (i3 < height) {
            int i12 = i;
            int i13 = i12;
            int i14 = i13;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            int i18 = i17;
            int i19 = i18;
            char c2 = c;
            int i20 = -1;
            int i21 = i19;
            while (i20 <= i4) {
                int i22 = i4;
                int i23 = i20 < 0 ? i : i20;
                if (i6 <= i23) {
                    i23 = i6;
                }
                int i24 = iArr2[i23 + i10];
                int i25 = i20 + 1;
                int[] iArr9 = iArr8[i25];
                iArr9[i] = (i24 & 16711680) >> 16;
                iArr9[i22] = (i24 & 65280) >> 8;
                iArr9[2] = i24 & 255;
                int abs = 2 - StrictMath.abs(i20);
                int i26 = iArr9[i];
                i21 = (i26 * abs) + i21;
                int i27 = iArr9[i22];
                i12 = (i27 * abs) + i12;
                int i28 = iArr9[2];
                i13 = (abs * i28) + i13;
                if (i20 > 0) {
                    i19 += i26;
                    i18 += i27;
                    i17 += i28;
                } else {
                    i16 += i26;
                    i15 += i27;
                    i14 += i28;
                }
                i4 = i22;
                i20 = i25;
            }
            int i29 = i4;
            int i30 = i;
            int i31 = i29;
            while (i30 < width) {
                iArr3[i10] = iArr7[i21];
                iArr4[i10] = iArr7[i12];
                iArr5[i10] = iArr7[i13];
                int i32 = i21 - i16;
                int i33 = i12 - i15;
                int i34 = i13 - i14;
                int[] iArr10 = iArr8[(i31 + 2) % 3];
                int i35 = i16 - iArr10[i];
                int i36 = i15 - iArr10[i29];
                int i37 = i14 - iArr10[2];
                if (i3 == 0) {
                    iArr = iArr5;
                    iArr6[i30] = Math.min(i30 + 2, i6);
                } else {
                    iArr = iArr5;
                }
                int i38 = iArr2[i11 + iArr6[i30]];
                int i39 = (i38 & 16711680) >> 16;
                iArr10[i] = i39;
                int i40 = (i38 & 65280) >> 8;
                iArr10[i29] = i40;
                int i41 = i38 & 255;
                iArr10[2] = i41;
                int i42 = i19 + i39;
                int i43 = i18 + i40;
                int i44 = i17 + i41;
                i21 = i32 + i42;
                i12 = i33 + i43;
                i13 = i34 + i44;
                i31 = (i31 + 1) % 3;
                int[] iArr11 = iArr8[i31 % 3];
                int i45 = iArr11[i];
                i16 = i35 + i45;
                int i46 = iArr11[i29];
                i15 = i36 + i46;
                int i47 = iArr11[2];
                i14 = i37 + i47;
                i19 = i42 - i45;
                i18 = i43 - i46;
                i17 = i44 - i47;
                i10++;
                i30++;
                iArr5 = iArr;
            }
            i11 += width;
            i3++;
            c = c2;
            i4 = i29;
        }
        int[] iArr12 = iArr5;
        int i48 = i4;
        int i49 = i;
        while (i49 < width) {
            int i50 = i;
            int i51 = i50;
            int i52 = i51;
            int i53 = i52;
            int i54 = i53;
            int i55 = i54;
            int i56 = i55;
            int i57 = i56;
            int i58 = i57;
            int i59 = i49;
            int i60 = width * (-1);
            int i61 = -1;
            for (int i62 = i48; i61 <= i62; i62 = 1) {
                int i63 = i62;
                int i64 = i;
                int max = Math.max(i64, i60) + i59;
                int i65 = i61 + 1;
                int[] iArr13 = iArr8[i65];
                iArr13[i64] = iArr3[max];
                iArr13[i63] = iArr4[max];
                iArr13[2] = iArr12[max];
                int abs2 = 2 - StrictMath.abs(i61);
                i57 = (iArr3[max] * abs2) + i57;
                i58 = (iArr4[max] * abs2) + i58;
                i50 = (iArr12[max] * abs2) + i50;
                if (i61 > 0) {
                    i56 += iArr13[0];
                    i55 += iArr13[1];
                    i54 += iArr13[2];
                } else {
                    i53 += iArr13[0];
                    i52 += iArr13[1];
                    i51 += iArr13[2];
                }
                if (i61 < i7) {
                    i60 += width;
                }
                i61 = i65;
                i = 0;
            }
            int i66 = i57;
            int i67 = 1;
            int i68 = i59;
            for (int i69 = 0; i69 < height; i69++) {
                iArr2[i68] = (iArr2[i68] & (-16777216)) | (iArr7[i66] << 16) | (iArr7[i58] << 8) | iArr7[i50];
                int i70 = i66 - i53;
                int i71 = i58 - i52;
                int i72 = i50 - i51;
                int[] iArr14 = iArr8[(i67 + 2) % 3];
                int i73 = i53 - iArr14[0];
                int i74 = i52 - iArr14[1];
                int i75 = i51 - iArr14[2];
                if (i59 == 0) {
                    i2 = i67;
                    iArr6[i69] = Math.min(i69 + 2, i7) * width;
                } else {
                    i2 = i67;
                }
                int i76 = i59 + iArr6[i69];
                int i77 = iArr3[i76];
                iArr14[0] = i77;
                int i78 = iArr4[i76];
                iArr14[1] = i78;
                int i79 = iArr12[i76];
                iArr14[2] = i79;
                int i80 = i56 + i77;
                int i81 = i55 + i78;
                int i82 = i54 + i79;
                i66 = i70 + i80;
                i58 = i71 + i81;
                i50 = i72 + i82;
                i67 = (i2 + 1) % 3;
                int[] iArr15 = iArr8[i67];
                int i83 = iArr15[0];
                i53 = i73 + i83;
                int i84 = iArr15[1];
                i52 = i74 + i84;
                int i85 = iArr15[2];
                i51 = i75 + i85;
                i56 = i80 - i83;
                i55 = i81 - i84;
                i54 = i82 - i85;
                i68 += width;
            }
            i49 = i59 + 1;
            i = 0;
            i48 = 1;
        }
        copy.setPixels(iArr2, 0, width, 0, 0, width, height);
        return copy;
    }
}
