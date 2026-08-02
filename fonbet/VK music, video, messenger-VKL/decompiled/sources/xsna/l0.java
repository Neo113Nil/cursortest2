package xsna;

import androidx.media3.common.ParserException;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;

/* compiled from: AacUtil.java */
/* loaded from: classes12.dex */
public final class l0 {
    public static final int[] a = {96000, 88200, RtpSenderHelper.AUDIO_BITRATE_MAX, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: AacUtil.java */
    public static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }
    }

    public static int a(wi90 wi90Var) throws ParserException {
        int g = wi90Var.g(4);
        if (g == 15) {
            if (wi90Var.b() >= 24) {
                return wi90Var.g(24);
            }
            throw ParserException.a(null, "AAC header insufficient data");
        }
        if (g < 13) {
            return a[g];
        }
        throw ParserException.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static a b(wi90 wi90Var, boolean z) throws ParserException {
        int g = wi90Var.g(5);
        if (g == 31) {
            g = wi90Var.g(6) + 32;
        }
        int a2 = a(wi90Var);
        int g2 = wi90Var.g(4);
        String a3 = lhg.a(g, "mp4a.40.");
        if (g == 5 || g == 29) {
            a2 = a(wi90Var);
            int g3 = wi90Var.g(5);
            if (g3 == 31) {
                g3 = wi90Var.g(6) + 32;
            }
            g = g3;
            if (g == 22) {
                g2 = wi90Var.g(4);
            }
        }
        if (z) {
            if (g != 1 && g != 2 && g != 3 && g != 4 && g != 6 && g != 7 && g != 17) {
                switch (g) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + g);
                }
            }
            if (wi90Var.f()) {
                ahn.F("Unexpected frameLengthFlag = 1");
            }
            if (wi90Var.f()) {
                wi90Var.o(14);
            }
            boolean f = wi90Var.f();
            if (g2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (g == 6 || g == 20) {
                wi90Var.o(3);
            }
            if (f) {
                if (g == 22) {
                    wi90Var.o(16);
                }
                if (g == 17 || g == 19 || g == 20 || g == 23) {
                    wi90Var.o(3);
                }
                wi90Var.o(1);
            }
            switch (g) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int g4 = wi90Var.g(2);
                    if (g4 == 2 || g4 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + g4);
                    }
            }
        }
        int i = b[g2];
        if (i != -1) {
            return new a(a2, i, a3);
        }
        throw ParserException.a(null, null);
    }
}
