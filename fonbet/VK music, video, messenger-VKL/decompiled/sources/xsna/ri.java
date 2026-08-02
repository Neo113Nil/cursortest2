package xsna;

import androidx.media3.common.ParserException;
import ru.ok.android.webrtc.mediarecord.VideoRecord;

/* compiled from: Ac4Util.java */
/* loaded from: classes12.dex */
public final class ri {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, VideoRecord.DEFAULT_MAX_DIMENSION, 800, 800, 480, 400, 400, 2048};

    /* compiled from: Ac4Util.java */
    public static final class a {
        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public int e;
        public int f;
        public int g;
    }

    /* compiled from: Ac4Util.java */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static void a(int i, xi90 xi90Var) {
        xi90Var.M(7);
        byte[] bArr = xi90Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
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
    public static b b(wi90 wi90Var) {
        int i;
        int i2;
        int g = wi90Var.g(16);
        int g2 = wi90Var.g(16);
        if (g2 == 65535) {
            g2 = wi90Var.g(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = g2 + i;
        if (g == 44097) {
            i3 += 2;
        }
        if (wi90Var.g(2) == 3) {
            do {
                wi90Var.g(2);
            } while (wi90Var.f());
        }
        int g3 = wi90Var.g(10);
        if (wi90Var.f() && wi90Var.g(3) > 0) {
            wi90Var.o(2);
        }
        int i4 = wi90Var.f() ? 48000 : 44100;
        int g4 = wi90Var.g(4);
        int[] iArr = a;
        if (i4 == 44100 && g4 == 13) {
            i2 = iArr[g4];
        } else if (i4 != 48000 || g4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[g4];
            int i6 = g3 % 5;
            if (i6 != 1) {
                if (i6 == 2) {
                    if (g4 != 8) {
                    }
                    i2 = i5 + 1;
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        if (g4 != 3) {
                            if (g4 != 8) {
                            }
                        }
                        i2 = i5 + 1;
                    }
                    i2 = i5;
                }
            }
            if (g4 != 3) {
            }
            i2 = i5 + 1;
        }
        return new b(i4, i3, i2);
    }

    public static void c(wi90 wi90Var, a aVar) throws ParserException {
        int g = wi90Var.g(5);
        wi90Var.o(2);
        if (wi90Var.f()) {
            wi90Var.o(5);
        }
        if (g >= 7 && g <= 10) {
            wi90Var.n();
        }
        if (wi90Var.f()) {
            int g2 = wi90Var.g(3);
            if (aVar.b == -1 && g >= 0 && g <= 15 && (g2 == 0 || g2 == 1)) {
                aVar.b = g;
            }
            if (wi90Var.f()) {
                e(wi90Var);
            }
        }
    }

    public static void d(wi90 wi90Var, a aVar) throws ParserException {
        wi90Var.o(2);
        boolean f = wi90Var.f();
        int g = wi90Var.g(8);
        for (int i = 0; i < g; i++) {
            wi90Var.o(2);
            if (wi90Var.f()) {
                wi90Var.o(5);
            }
            if (f) {
                wi90Var.o(24);
            } else {
                if (wi90Var.f()) {
                    if (!wi90Var.f()) {
                        wi90Var.o(4);
                    }
                    aVar.c = wi90Var.g(6) + 1;
                }
                wi90Var.o(4);
            }
        }
        if (wi90Var.f()) {
            wi90Var.o(3);
            if (wi90Var.f()) {
                e(wi90Var);
            }
        }
    }

    public static void e(wi90 wi90Var) throws ParserException {
        int g = wi90Var.g(6);
        if (g < 2 || g > 42) {
            throw ParserException.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(g)));
        }
        wi90Var.o(g * 8);
    }
}
