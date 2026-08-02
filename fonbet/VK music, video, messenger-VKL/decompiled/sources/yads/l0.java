package yads;

import ru.ok.android.webrtc.mediarecord.VideoRecord;

/* loaded from: classes10.dex */
public abstract class l0 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, VideoRecord.DEFAULT_MAX_DIMENSION, 800, 800, 480, 400, 400, 2048};

    public static void a(int i, kc2 kc2Var) {
        kc2Var.c(7);
        byte[] bArr = kc2Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k0 a(jc2 jc2Var) {
        int i;
        int i2;
        int a2 = jc2Var.a(16);
        int a3 = jc2Var.a(16);
        if (a3 == 65535) {
            a3 = jc2Var.a(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = a3 + i;
        if (a2 == 44097) {
            i3 += 2;
        }
        if (jc2Var.a(2) == 3) {
            do {
                jc2Var.a(2);
            } while (jc2Var.e());
        }
        int a4 = jc2Var.a(10);
        if (jc2Var.e() && jc2Var.a(3) > 0) {
            jc2Var.c(2);
        }
        int i4 = jc2Var.e() ? 48000 : 44100;
        int a5 = jc2Var.a(4);
        if (i4 == 44100 && a5 == 13) {
            i2 = a[a5];
        } else {
            if (i4 == 48000) {
                int[] iArr = a;
                if (a5 < 14) {
                    int i5 = iArr[a5];
                    int i6 = a4 % 5;
                    if (i6 != 1) {
                        if (i6 == 2) {
                            if (a5 != 8) {
                            }
                            i2 = i5 + 1;
                        } else if (i6 != 3) {
                            if (i6 == 4) {
                                if (a5 != 3) {
                                    if (a5 != 8) {
                                    }
                                }
                                i2 = i5 + 1;
                            }
                            i2 = i5;
                        }
                    }
                    if (a5 != 3) {
                    }
                    i2 = i5 + 1;
                }
            }
            i2 = 0;
        }
        return new k0(i4, i3, i2);
    }
}
