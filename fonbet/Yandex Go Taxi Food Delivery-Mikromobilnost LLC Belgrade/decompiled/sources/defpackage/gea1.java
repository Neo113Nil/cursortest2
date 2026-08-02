package defpackage;

import com.ybsdk.feature.qr.payments.api.QrSource;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.QrSourceDto;

/* loaded from: classes7.dex */
public abstract class gea1 {
    public static final String[] a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] b = {44100, 48000, 32000};
    public static final int[] c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = b[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? c[i4 - 1] : d[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? e[i4 - 1] : f[i4 - 1] : g[i4 - 1];
        if (i2 == 3) {
            return ((i8 * 144) / i6) + i7;
        }
        return (((i3 == 1 ? 72 : 144) * i8) / i6) + i7;
    }

    public static im71 b() {
        im71 im71Var;
        im71 im71Var2 = im71.c;
        if (im71Var2 != null) {
            return im71Var2;
        }
        synchronized (im71.b) {
            im71Var = im71.c;
            if (im71Var == null) {
                im71Var = new im71();
                im71.c = im71Var;
            }
        }
        return im71Var;
    }

    public static int c(int i) {
        int i2;
        int i3;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 != 0 && i4 != 15 && i5 != 3) {
            if (i3 == 1) {
                return i2 == 3 ? 1152 : 576;
            }
            if (i3 == 2) {
                return 1152;
            }
            if (i3 == 3) {
                return 384;
            }
            w511.q();
            return 0;
        }
        return -1;
    }

    public static final void d(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final QrSourceDto e(QrSource qrSource) {
        int i = qfg0.a[qrSource.ordinal()];
        if (i == 1) {
            return QrSourceDto.UNKNOWN;
        }
        if (i == 2) {
            return QrSourceDto.LINK;
        }
        if (i == 3) {
            return QrSourceDto.CAMERA;
        }
        w511.b();
        return null;
    }
}
