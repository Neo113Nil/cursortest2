package yads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.util.Arrays;
import ru.ok.gl.tf.Tensorflow;

/* loaded from: classes10.dex */
public abstract class yk0 {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, 384, 448, 512, 640, Tensorflow.FRAME_HEIGHT, 896, 1024, 1152, CoverVideoUploadTask.y, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static nx0 a(byte[] bArr, String str, String str2) {
        jc2 jc2Var;
        if (bArr[0] == Byte.MAX_VALUE) {
            jc2Var = new jc2(bArr.length, bArr);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = copyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b3 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b3;
                }
            }
            jc2Var = new jc2(copyOf.length, copyOf);
            if (copyOf[0] == 31) {
                jc2 jc2Var2 = new jc2(copyOf.length, copyOf);
                while (jc2Var2.b() >= 16) {
                    jc2Var2.c(2);
                    int a2 = jc2Var2.a(14) & 16383;
                    int min = Math.min(8 - jc2Var.c, 14);
                    int i3 = jc2Var.c;
                    int i4 = (8 - i3) - min;
                    byte[] bArr2 = jc2Var.a;
                    int i5 = jc2Var.b;
                    byte b4 = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr2[i5]);
                    bArr2[i5] = b4;
                    int i6 = 14 - min;
                    bArr2[i5] = (byte) (b4 | ((a2 >>> i6) << i4));
                    int i7 = i5 + 1;
                    while (i6 > 8) {
                        jc2Var.a[i7] = (byte) (a2 >>> (i6 - 8));
                        i6 -= 8;
                        i7++;
                    }
                    int i8 = 8 - i6;
                    byte[] bArr3 = jc2Var.a;
                    byte b5 = (byte) (bArr3[i7] & ((1 << i8) - 1));
                    bArr3[i7] = b5;
                    bArr3[i7] = (byte) (((a2 & ((1 << i6) - 1)) << i8) | b5);
                    jc2Var.c(14);
                    jc2Var.a();
                }
            }
            jc2Var.a(copyOf.length, copyOf);
        }
        jc2Var.c(60);
        int i9 = a[jc2Var.a(6)];
        int i10 = b[jc2Var.a(4)];
        int a3 = jc2Var.a(5);
        int i11 = a3 < 29 ? (c[a3] * 1000) / 2 : -1;
        jc2Var.c(10);
        int i12 = i9 + (jc2Var.a(2) > 0 ? 1 : 0);
        mx0 mx0Var = new mx0();
        mx0Var.a = str;
        mx0Var.k = MimeTypes.AUDIO_DTS;
        mx0Var.f = i11;
        mx0Var.x = i12;
        mx0Var.y = i10;
        mx0Var.n = null;
        mx0Var.c = str2;
        return new nx0(mx0Var);
    }
}
