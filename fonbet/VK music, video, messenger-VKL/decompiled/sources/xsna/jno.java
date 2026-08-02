package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.util.Arrays;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: DtsUtil.java */
/* loaded from: classes12.dex */
public final class jno {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, 384, 448, 512, 640, Tensorflow.FRAME_HEIGHT, 896, 1024, 1152, CoverVideoUploadTask.y, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, RtpSenderHelper.AUDIO_BITRATE_MAX, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    /* compiled from: DtsUtil.java */
    public static final class a {
        public final String a;
        public final int b;
        public final int c;

        public a(long j, int i, int i2, String str, int i3) {
            this.a = str;
            this.c = i;
            this.b = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        int i4;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i4 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[7];
            } else {
                i4 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b3 = bArr[8];
            }
            i3 = (((b3 & 60) >> 2) | i4) + 1;
            z = true;
            return !z ? (i3 * 16) / 14 : i3;
        }
        i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i3 = (((b2 & 240) >> 4) | i2) + 1;
        if (!z) {
        }
    }

    public static int b(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static wi90 c(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new wi90(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = copyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b4 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b4;
            }
        }
        wi90 wi90Var = new wi90(copyOf, copyOf.length);
        if (copyOf[0] == 31) {
            wi90 wi90Var2 = new wi90(copyOf, copyOf.length);
            while (wi90Var2.b() >= 16) {
                wi90Var2.o(2);
                int g2 = wi90Var2.g(14) & 16383;
                int min = Math.min(8 - wi90Var.d, 14);
                int i4 = wi90Var.d;
                int i5 = (8 - i4) - min;
                byte[] bArr2 = wi90Var.b;
                int i6 = wi90Var.c;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr2[i6]);
                bArr2[i6] = b5;
                int i7 = 14 - min;
                bArr2[i6] = (byte) (b5 | ((g2 >>> i7) << i5));
                int i8 = i6 + 1;
                while (i7 > 8) {
                    wi90Var.b[i8] = (byte) (g2 >>> (i7 - 8));
                    i7 -= 8;
                    i8++;
                }
                int i9 = 8 - i7;
                byte[] bArr3 = wi90Var.b;
                byte b6 = (byte) (bArr3[i8] & ((1 << i9) - 1));
                bArr3[i8] = b6;
                bArr3[i8] = (byte) (((g2 & ((1 << i7) - 1)) << i9) | b6);
                wi90Var.o(14);
                wi90Var.a();
            }
        }
        wi90Var.l(copyOf, copyOf.length);
        return wi90Var;
    }

    public static int d(wi90 wi90Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && wi90Var.f(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return wi90Var.g(iArr[i2]) + i4;
    }
}
