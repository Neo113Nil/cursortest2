package xsna;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* compiled from: FrameUtils.java */
/* loaded from: classes3.dex */
public final class egs {
    public static Bitmap a(pes pesVar) {
        IntBuffer intBuffer;
        IntBuffer intBuffer2;
        IntBuffer intBuffer3;
        IntBuffer intBuffer4;
        int i;
        if (pesVar.b * pesVar.a <= 0) {
            return null;
        }
        IntBuffer intBuffer5 = pesVar.c;
        if (intBuffer5 != null) {
            intBuffer5.rewind();
            intBuffer = pesVar.c;
        } else {
            intBuffer = null;
        }
        if (intBuffer == null) {
            return null;
        }
        ByteBuffer i2 = pesVar.i();
        int i3 = pesVar.a;
        int i4 = pesVar.b;
        IntBuffer intBuffer6 = pesVar.c;
        if (intBuffer6 != null) {
            intBuffer6.rewind();
            intBuffer2 = pesVar.c;
        } else {
            intBuffer2 = null;
        }
        if (i2 != null && intBuffer2 != null && (i = i3 * i4) != 0) {
            byte[] array = i2.array();
            int[] array2 = intBuffer2.array();
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = i7 * i3;
                int i9 = i7 >> 1;
                int i10 = 0;
                while (i10 < i3) {
                    int i11 = array[i8];
                    if (i11 < 0) {
                        i11 += 255;
                    }
                    if ((i10 & 1) != 1) {
                        int i12 = ((i10 >> 1) * 2) + (i9 * i3) + i;
                        int i13 = array[i12];
                        int i14 = i13 < 0 ? i13 + 127 : i13 - 128;
                        int i15 = array[i12 + 1];
                        i6 = i14;
                        i5 = i15 < 0 ? i15 + 127 : i15 - 128;
                    }
                    int i16 = (i11 >> 3) + i11 + (i11 >> 5) + (i11 >> 7);
                    int i17 = (i5 << 1) + i16 + (i5 >> 6);
                    if (i17 < 0) {
                        i17 = 0;
                    } else if (i17 > 255) {
                        i17 = 255;
                    }
                    int i18 = i6 >> 4;
                    int i19 = ((((i16 - i6) + (i6 >> 3)) + i18) - (i5 >> 1)) + (i5 >> 3);
                    if (i19 < 0) {
                        i19 = 0;
                    } else if (i19 > 255) {
                        i19 = 255;
                    }
                    int i20 = i16 + i6 + (i6 >> 1) + i18 + (i6 >> 5);
                    if (i20 < 0) {
                        i20 = 0;
                    } else if (i20 > 255) {
                        i20 = 255;
                    }
                    array2[i8] = ((i17 << 16) - 16777216) + (i19 << 8) + i20;
                    i10++;
                    i8++;
                }
            }
        }
        IntBuffer intBuffer7 = pesVar.c;
        if (intBuffer7 != null) {
            intBuffer7.rewind();
            intBuffer3 = pesVar.c;
        } else {
            intBuffer3 = null;
        }
        int i21 = pesVar.a;
        int i22 = pesVar.b;
        if (intBuffer3 != null && i21 * i22 != 0) {
            int[] array3 = intBuffer3.array();
            for (int i23 = 0; i23 < i22; i23++) {
                for (int i24 = 0; i24 < i21; i24++) {
                    int i25 = (i23 * i21) + i24;
                    int i26 = array3[i25];
                    array3[i25] = Color.argb((i26 >> 24) & 255, i26 & 255, (i26 >> 8) & 255, (i26 >> 16) & 255);
                }
            }
        }
        IntBuffer intBuffer8 = pesVar.c;
        if (intBuffer8 != null) {
            intBuffer8.rewind();
            intBuffer4 = pesVar.c;
        } else {
            intBuffer4 = null;
        }
        return Bitmap.createBitmap(intBuffer4.array(), pesVar.a, pesVar.b, Bitmap.Config.ARGB_8888);
    }
}
