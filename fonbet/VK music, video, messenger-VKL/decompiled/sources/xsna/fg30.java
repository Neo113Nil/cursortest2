package xsna;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import ru.ok.gl.tf.Tensorflow;
import xsna.gg30;
import xsna.tsp0;

/* compiled from: MpeghReader.java */
/* loaded from: classes12.dex */
public final class fg30 implements zap {
    public String e;
    public rgp0 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final xi90 a = new xi90(new byte[15], 2);
    public final wi90 b = new wi90();
    public final xi90 c = new xi90();
    public final gg30.a p = new gg30.a();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0483 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x046a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x041d  */
    @Override // xsna.zap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xi90 xi90Var) throws ParserException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        byte[] bArr;
        long j;
        long j2;
        int i6;
        long j3;
        boolean z;
        int i7;
        this.f.getClass();
        while (xi90Var.a() > 0) {
            int i8 = this.d;
            int i9 = 8;
            int i10 = 3;
            int i11 = 1;
            if (i8 != 0) {
                xi90 xi90Var2 = this.c;
                gg30.a aVar = this.p;
                if (i8 == 1) {
                    int a = xi90Var.a();
                    xi90 xi90Var3 = this.a;
                    int min = Math.min(a, xi90Var3.a());
                    xi90Var.n(xi90Var3.a, xi90Var3.b, min);
                    xi90Var3.Q(min);
                    if (xi90Var3.a() == 0) {
                        int i12 = xi90Var3.c;
                        byte[] bArr2 = xi90Var3.a;
                        wi90 wi90Var = this.b;
                        wi90Var.l(bArr2, i12);
                        wi90Var.d();
                        int a2 = gg30.a(wi90Var, 3, 8, 8);
                        aVar.a = a2;
                        if (a2 != -1) {
                            fxc0.p(Math.max(Math.max(2, 8), 32) <= 63);
                            r300.a(r300.a(3L, 255L), 4294967296L);
                            if (wi90Var.b() >= 2) {
                                long i13 = wi90Var.i(2);
                                if (i13 == 3) {
                                    if (wi90Var.b() >= 8) {
                                        long i14 = wi90Var.i(8);
                                        i13 += i14;
                                        if (i14 == 255) {
                                            if (wi90Var.b() >= 32) {
                                                i13 = wi90Var.i(32) + i13;
                                            }
                                        }
                                    }
                                }
                                j3 = i13;
                                aVar.b = j3;
                                if (j3 != -1) {
                                    if (j3 > 16) {
                                        throw ParserException.c("Contains sub-stream with an invalid packet label " + aVar.b);
                                    }
                                    if (j3 == 0) {
                                        int i15 = aVar.a;
                                        if (i15 == 1) {
                                            throw ParserException.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i15 == 2) {
                                            throw ParserException.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i15 == 17) {
                                            throw ParserException.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int a3 = gg30.a(wi90Var, 11, 24, 24);
                                    aVar.c = a3;
                                    if (a3 != -1) {
                                        z = true;
                                        if (z) {
                                            i7 = 0;
                                        } else {
                                            i7 = 0;
                                            this.n = 0;
                                            this.o = aVar.c + i12 + this.o;
                                        }
                                        if (z) {
                                            int i16 = xi90Var3.c;
                                            if (i16 < 15) {
                                                xi90Var3.O(i16 + 1);
                                                this.m = false;
                                            }
                                        } else {
                                            xi90Var3.P(i7);
                                            this.f.d(xi90Var3.c, xi90Var3);
                                            xi90Var3.M(2);
                                            xi90Var2.M(aVar.c);
                                            this.m = true;
                                            this.d = 2;
                                        }
                                    }
                                }
                            }
                            j3 = -1;
                            aVar.b = j3;
                            if (j3 != -1) {
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        if (z) {
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException();
                    }
                    int i17 = aVar.a;
                    if (i17 == 1 || i17 == 17) {
                        int i18 = xi90Var.b;
                        int min2 = Math.min(xi90Var.a(), xi90Var2.a());
                        xi90Var.n(xi90Var2.a, xi90Var2.b, min2);
                        xi90Var2.Q(min2);
                        xi90Var.P(i18);
                    }
                    int min3 = Math.min(xi90Var.a(), aVar.c - this.n);
                    this.f.d(min3, xi90Var);
                    int i19 = this.n + min3;
                    this.n = i19;
                    if (i19 != aVar.c) {
                        continue;
                    } else {
                        int i20 = aVar.a;
                        if (i20 == 1) {
                            byte[] bArr3 = xi90Var2.a;
                            wi90 wi90Var2 = new wi90(bArr3, bArr3.length);
                            int g = wi90Var2.g(8);
                            int g2 = wi90Var2.g(5);
                            if (g2 != 31) {
                                switch (g2) {
                                    case 0:
                                        i4 = 96000;
                                        break;
                                    case 1:
                                        i4 = 88200;
                                        break;
                                    case 2:
                                        i4 = RtpSenderHelper.AUDIO_BITRATE_MAX;
                                        break;
                                    case 3:
                                        i4 = 48000;
                                        break;
                                    case 4:
                                        i4 = 44100;
                                        break;
                                    case 5:
                                        i4 = 32000;
                                        break;
                                    case 6:
                                        i4 = 24000;
                                        break;
                                    case 7:
                                        i4 = 22050;
                                        break;
                                    case 8:
                                        i4 = 16000;
                                        break;
                                    case 9:
                                        i4 = 12000;
                                        break;
                                    case 10:
                                        i4 = 11025;
                                        break;
                                    case 11:
                                        i4 = 8000;
                                        break;
                                    case 12:
                                        i4 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ParserException.c("Unsupported sampling rate index " + g2);
                                    case 15:
                                        i4 = 57600;
                                        break;
                                    case 16:
                                        i4 = 51200;
                                        break;
                                    case 17:
                                        i4 = 40000;
                                        break;
                                    case 18:
                                        i4 = 38400;
                                        break;
                                    case 19:
                                        i4 = 34150;
                                        break;
                                    case 20:
                                        i4 = 28800;
                                        break;
                                    case 21:
                                        i4 = 25600;
                                        break;
                                    case 22:
                                        i4 = 20000;
                                        break;
                                    case 23:
                                        i4 = 19200;
                                        break;
                                    case 24:
                                        i4 = 17075;
                                        break;
                                    case 25:
                                        i4 = 14400;
                                        break;
                                    case 26:
                                        i4 = 12800;
                                        break;
                                    case 27:
                                        i4 = 9600;
                                        break;
                                }
                            } else {
                                i4 = wi90Var2.g(24);
                            }
                            int g3 = wi90Var2.g(3);
                            if (g3 == 0) {
                                i5 = Tensorflow.FRAME_HEIGHT;
                            } else if (g3 == 1) {
                                i5 = 1024;
                            } else if (g3 == 2 || g3 == 3) {
                                i5 = 2048;
                            } else {
                                if (g3 != 4) {
                                    throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + g3);
                                }
                                i5 = 4096;
                            }
                            int i21 = i5;
                            if (g3 == 0 || g3 == 1) {
                                c = 0;
                            } else if (g3 == 2) {
                                c = 2;
                            } else if (g3 == 3) {
                                c = 3;
                            } else {
                                if (g3 != 4) {
                                    throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + g3);
                                }
                                c = 1;
                            }
                            wi90Var2.o(2);
                            gg30.c(wi90Var2);
                            int g4 = wi90Var2.g(5);
                            int i22 = 0;
                            int i23 = 0;
                            while (true) {
                                int i24 = i11;
                                int i25 = 16;
                                if (i22 < g4 + 1) {
                                    int g5 = wi90Var2.g(3);
                                    i23 = gg30.a(wi90Var2, 5, 8, 16) + 1 + i23;
                                    if ((g5 == 0 || g5 == 2) && wi90Var2.f()) {
                                        gg30.c(wi90Var2);
                                    }
                                    i22++;
                                    i11 = i24;
                                } else {
                                    int a4 = gg30.a(wi90Var2, 4, 8, 16) + 1;
                                    wi90Var2.n();
                                    int i26 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i26 < a4) {
                                            int g6 = wi90Var2.g(2);
                                            if (g6 == 0) {
                                                wi90Var2.o(i10);
                                                if (wi90Var2.f()) {
                                                    wi90Var2.o(13);
                                                }
                                                if (c > 0) {
                                                    gg30.b(wi90Var2);
                                                }
                                            } else if (g6 == i24) {
                                                wi90Var2.o(i10);
                                                boolean f = wi90Var2.f();
                                                if (f) {
                                                    wi90Var2.o(13);
                                                }
                                                if (f) {
                                                    wi90Var2.n();
                                                }
                                                if (c > 0) {
                                                    gg30.b(wi90Var2);
                                                    i6 = wi90Var2.g(2);
                                                } else {
                                                    i6 = 0;
                                                }
                                                if (i6 > 0) {
                                                    wi90Var2.o(6);
                                                    int g7 = wi90Var2.g(2);
                                                    wi90Var2.o(4);
                                                    if (wi90Var2.f()) {
                                                        wi90Var2.o(5);
                                                    }
                                                    if (i6 == 2 || i6 == i10) {
                                                        wi90Var2.o(6);
                                                    }
                                                    if (g7 == 2) {
                                                        wi90Var2.n();
                                                    }
                                                }
                                                int floor = ((int) Math.floor(Math.log(i23 - 1) / Math.log(2.0d))) + 1;
                                                int g8 = wi90Var2.g(2);
                                                if (g8 > 0 && wi90Var2.f()) {
                                                    wi90Var2.o(floor);
                                                }
                                                if (wi90Var2.f()) {
                                                    wi90Var2.o(floor);
                                                }
                                                if (c == 0 && g8 == 0) {
                                                    wi90Var2.n();
                                                }
                                            } else if (g6 == i10) {
                                                gg30.a(wi90Var2, 4, i9, i25);
                                                int a5 = gg30.a(wi90Var2, 4, i9, i25);
                                                if (wi90Var2.f()) {
                                                    gg30.a(wi90Var2, i9, i25, 0);
                                                }
                                                wi90Var2.n();
                                                if (a5 > 0) {
                                                    wi90Var2.o(a5 * 8);
                                                }
                                            }
                                            i26++;
                                            i9 = 8;
                                            i10 = 3;
                                            i25 = 16;
                                            i24 = 1;
                                        } else {
                                            if (wi90Var2.f()) {
                                                int i27 = 8;
                                                int a6 = gg30.a(wi90Var2, 2, 4, 8) + 1;
                                                int i28 = 0;
                                                bArr = null;
                                                while (i28 < a6) {
                                                    int a7 = gg30.a(wi90Var2, 4, i27, 16);
                                                    int a8 = gg30.a(wi90Var2, 4, i27, 16);
                                                    if (a7 == 7) {
                                                        int g9 = wi90Var2.g(4) + 1;
                                                        wi90Var2.o(4);
                                                        byte[] bArr4 = new byte[g9];
                                                        for (int i29 = 0; i29 < g9; i29++) {
                                                            bArr4[i29] = (byte) wi90Var2.g(i27);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        wi90Var2.o(a8 * i27);
                                                    }
                                                    i28++;
                                                    i27 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i4) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i21 * d);
                                                    j = this.t;
                                                    j2 = aVar.b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String concat = g != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(g))) : "mhm1";
                                                        com.google.common.collect.g q = (bArr == null || bArr.length <= 0) ? null : ImmutableList.q(y2r0.b, bArr);
                                                        a.C0043a c0043a = new a.C0043a();
                                                        c0043a.a = this.e;
                                                        c0043a.l = io20.q("video/mp2t");
                                                        c0043a.m = io20.q("audio/mhm1");
                                                        c0043a.F = this.q;
                                                        c0043a.j = concat;
                                                        c0043a.p = q;
                                                        this.f.c(new androidx.media3.common.a(c0043a));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i21 * d);
                                                    j = this.t;
                                                    j2 = aVar.b;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case RtpSenderHelper.AUDIO_BITRATE_MAX /* 64000 */:
                                                    d = 1.5d;
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i21 * d);
                                                    j = this.t;
                                                    j2 = aVar.b;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i21 * d);
                                                    j = this.t;
                                                    j2 = aVar.b;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw ParserException.c("Unsupported sampling rate " + i4);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i20 == 17) {
                                byte[] bArr5 = xi90Var2.a;
                                wi90 wi90Var3 = new wi90(bArr5, bArr5.length);
                                if (wi90Var3.f()) {
                                    wi90Var3.o(2);
                                    i3 = wi90Var3.g(13);
                                } else {
                                    i3 = 0;
                                }
                                this.s = i3;
                            } else if (i20 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = ((this.r - this.s) * 1000000.0d) / this.q;
                                long round = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.a(round, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i2 = 1;
                        }
                        this.d = i2;
                    }
                }
            } else {
                int i30 = this.k;
                if ((i30 & 2) == 0) {
                    xi90Var.P(xi90Var.c);
                } else {
                    if ((i30 & 4) == 0) {
                        while (xi90Var.a() > 0) {
                            int i31 = this.l << 8;
                            this.l = i31;
                            int C = i31 | xi90Var.C();
                            this.l = C;
                            if ((C & 16777215) == 12583333) {
                                xi90Var.P(xi90Var.b - 3);
                                this.l = 0;
                            }
                        }
                    }
                    this.d = 1;
                }
            }
        }
    }

    @Override // xsna.zap
    public final void b(rgq rgqVar, tsp0.c cVar) {
        cVar.a();
        cVar.b();
        this.e = cVar.e;
        cVar.b();
        this.f = rgqVar.track(cVar.d, 1);
    }

    @Override // xsna.zap
    public final void c(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != C.TIME_UNSET) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // xsna.zap
    public final void seek() {
        this.d = 0;
        this.l = 0;
        this.a.M(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // xsna.zap
    public final void d(boolean z) {
    }
}
