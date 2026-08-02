package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import ru.CryptoPro.JCSP.CSPVersionUtility;

/* loaded from: classes10.dex */
public final class cc30 implements tqn {
    public String e;
    public g001 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final ef90 a = new ef90(new byte[15], 2);
    public final df90 b = new df90();
    public final ef90 c = new ef90();
    public final dc30 p = new dc30();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x041c  */
    @Override // defpackage.tqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ef90 ef90Var) {
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
        d6z.z(this.f);
        while (ef90Var.a() > 0) {
            int i8 = this.d;
            int i9 = 8;
            int i10 = 3;
            int i11 = 1;
            if (i8 != 0) {
                ef90 ef90Var2 = this.c;
                dc30 dc30Var = this.p;
                if (i8 == 1) {
                    int a = ef90Var.a();
                    ef90 ef90Var3 = this.a;
                    int min = Math.min(a, ef90Var3.a());
                    ef90Var.i(ef90Var3.b, min, ef90Var3.a);
                    ef90Var3.L(min);
                    if (ef90Var3.a() == 0) {
                        int i12 = ef90Var3.c;
                        byte[] bArr2 = ef90Var3.a;
                        df90 df90Var = this.b;
                        df90Var.k(i12, bArr2);
                        df90Var.d();
                        int c2 = job1.c(df90Var, 3, 8, 8);
                        dc30Var.a = c2;
                        if (c2 != -1) {
                            d6z.l(Math.max(Math.max(2, 8), 32) <= 63);
                            Math.addExact(Math.addExact(3L, 255L), 4294967296L);
                            if (df90Var.b() >= 2) {
                                long i13 = df90Var.i(2);
                                if (i13 == 3) {
                                    if (df90Var.b() >= 8) {
                                        long i14 = df90Var.i(8);
                                        i13 += i14;
                                        if (i14 == 255) {
                                            if (df90Var.b() >= 32) {
                                                i13 = df90Var.i(32) + i13;
                                            }
                                        }
                                    }
                                }
                                j3 = i13;
                                dc30Var.b = j3;
                                if (j3 != -1) {
                                    if (j3 > 16) {
                                        throw ParserException.c("Contains sub-stream with an invalid packet label " + dc30Var.b);
                                    }
                                    if (j3 == 0) {
                                        int i15 = dc30Var.a;
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
                                    int c3 = job1.c(df90Var, 11, 24, 24);
                                    dc30Var.c = c3;
                                    if (c3 != -1) {
                                        z = true;
                                        if (z) {
                                            i7 = 0;
                                        } else {
                                            i7 = 0;
                                            this.n = 0;
                                            this.o = dc30Var.c + i12 + this.o;
                                        }
                                        if (z) {
                                            int i16 = ef90Var3.c;
                                            if (i16 < 15) {
                                                ef90Var3.J(i16 + 1);
                                                this.m = false;
                                            }
                                        } else {
                                            ef90Var3.K(i7);
                                            this.f.a(ef90Var3, ef90Var3.c, i7);
                                            ef90Var3.H(2);
                                            ef90Var2.H(dc30Var.c);
                                            this.m = true;
                                            this.d = 2;
                                        }
                                    }
                                }
                            }
                            j3 = -1;
                            dc30Var.b = j3;
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
                        ny61.k();
                        return;
                    }
                    int i17 = dc30Var.a;
                    if (i17 == 1 || i17 == 17) {
                        int i18 = ef90Var.b;
                        int min2 = Math.min(ef90Var.a(), ef90Var2.a());
                        ef90Var.i(ef90Var2.b, min2, ef90Var2.a);
                        ef90Var2.L(min2);
                        ef90Var.K(i18);
                    }
                    int min3 = Math.min(ef90Var.a(), dc30Var.c - this.n);
                    this.f.a(ef90Var, min3, 0);
                    int i19 = this.n + min3;
                    this.n = i19;
                    if (i19 != dc30Var.c) {
                        continue;
                    } else {
                        int i20 = dc30Var.a;
                        if (i20 == 1) {
                            byte[] bArr3 = ef90Var2.a;
                            df90 df90Var2 = new df90(bArr3, bArr3.length);
                            int g = df90Var2.g(8);
                            int g2 = df90Var2.g(5);
                            if (g2 != 31) {
                                switch (g2) {
                                    case 0:
                                        i4 = 96000;
                                        break;
                                    case 1:
                                        i4 = 88200;
                                        break;
                                    case 2:
                                        i4 = 64000;
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
                                        i4 = CSPVersionUtility.CSP_BUILD_R2;
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
                                i4 = df90Var2.g(24);
                            }
                            int g3 = df90Var2.g(3);
                            if (g3 == 0) {
                                i5 = 768;
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
                            df90Var2.o(2);
                            job1.e(df90Var2);
                            int g4 = df90Var2.g(5);
                            int i22 = 0;
                            int i23 = 0;
                            while (true) {
                                int i24 = i11;
                                int i25 = 16;
                                if (i22 < g4 + 1) {
                                    int g5 = df90Var2.g(3);
                                    i23 = job1.c(df90Var2, 5, 8, 16) + 1 + i23;
                                    if ((g5 == 0 || g5 == 2) && df90Var2.f()) {
                                        job1.e(df90Var2);
                                    }
                                    i22++;
                                    i11 = i24;
                                } else {
                                    int c4 = job1.c(df90Var2, 4, 8, 16) + 1;
                                    df90Var2.n();
                                    int i26 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i26 < c4) {
                                            int g6 = df90Var2.g(2);
                                            if (g6 == 0) {
                                                df90Var2.o(i10);
                                                if (df90Var2.f()) {
                                                    df90Var2.o(13);
                                                }
                                                if (c > 0) {
                                                    job1.d(df90Var2);
                                                }
                                            } else if (g6 == i24) {
                                                df90Var2.o(i10);
                                                boolean f = df90Var2.f();
                                                if (f) {
                                                    df90Var2.o(13);
                                                }
                                                if (f) {
                                                    df90Var2.n();
                                                }
                                                if (c > 0) {
                                                    job1.d(df90Var2);
                                                    i6 = df90Var2.g(2);
                                                } else {
                                                    i6 = 0;
                                                }
                                                if (i6 > 0) {
                                                    df90Var2.o(6);
                                                    int g7 = df90Var2.g(2);
                                                    df90Var2.o(4);
                                                    if (df90Var2.f()) {
                                                        df90Var2.o(5);
                                                    }
                                                    if (i6 == 2 || i6 == i10) {
                                                        df90Var2.o(6);
                                                    }
                                                    if (g7 == 2) {
                                                        df90Var2.n();
                                                    }
                                                }
                                                int floor = ((int) Math.floor(Math.log(i23 - 1) / Math.log(2.0d))) + 1;
                                                int g8 = df90Var2.g(2);
                                                if (g8 > 0 && df90Var2.f()) {
                                                    df90Var2.o(floor);
                                                }
                                                if (df90Var2.f()) {
                                                    df90Var2.o(floor);
                                                }
                                                if (c == 0 && g8 == 0) {
                                                    df90Var2.n();
                                                }
                                            } else if (g6 == i10) {
                                                job1.c(df90Var2, 4, i9, i25);
                                                int c5 = job1.c(df90Var2, 4, i9, i25);
                                                if (df90Var2.f()) {
                                                    job1.c(df90Var2, i9, i25, 0);
                                                }
                                                df90Var2.n();
                                                if (c5 > 0) {
                                                    df90Var2.o(c5 * 8);
                                                }
                                            }
                                            i26++;
                                            i9 = 8;
                                            i10 = 3;
                                            i25 = 16;
                                            i24 = 1;
                                        } else {
                                            if (df90Var2.f()) {
                                                int i27 = 8;
                                                int c6 = job1.c(df90Var2, 2, 4, 8) + 1;
                                                int i28 = 0;
                                                bArr = null;
                                                while (i28 < c6) {
                                                    int c7 = job1.c(df90Var2, 4, i27, 16);
                                                    int c8 = job1.c(df90Var2, 4, i27, 16);
                                                    if (c7 == 7) {
                                                        int g9 = df90Var2.g(4) + 1;
                                                        df90Var2.o(4);
                                                        byte[] bArr4 = new byte[g9];
                                                        for (int i29 = 0; i29 < g9; i29++) {
                                                            bArr4[i29] = (byte) df90Var2.g(i27);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        df90Var2.o(c8 * i27);
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
                                                    j2 = dc30Var.b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String concat = g != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(g))) : "mhm1";
                                                        ImmutableList s = (bArr == null || bArr.length <= 0) ? null : ImmutableList.s(tw21.c, bArr);
                                                        f7s f7sVar = new f7s();
                                                        f7sVar.a = this.e;
                                                        f7sVar.l = eh20.q("video/mp2t");
                                                        f7sVar.m = eh20.q("audio/mhm1");
                                                        f7sVar.D = this.q;
                                                        f7sVar.j = concat;
                                                        f7sVar.p = s;
                                                        this.f.d(new a(f7sVar));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i21 * d);
                                                    j = this.t;
                                                    j2 = dc30Var.b;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i21 * d);
                                                    j = this.t;
                                                    j2 = dc30Var.b;
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
                                                    j2 = dc30Var.b;
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
                                byte[] bArr5 = ef90Var2.a;
                                df90 df90Var3 = new df90(bArr5, bArr5.length);
                                if (df90Var3.f()) {
                                    df90Var3.o(2);
                                    i3 = df90Var3.g(13);
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
                                this.f.c(round, i, this.o, 0, null);
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
                    ef90Var.K(ef90Var.c);
                } else {
                    if ((i30 & 4) == 0) {
                        while (ef90Var.a() > 0) {
                            int i31 = this.l << 8;
                            this.l = i31;
                            int y = i31 | ef90Var.y();
                            this.l = y;
                            if ((y & 16777215) == 12583333) {
                                ef90Var.K(ef90Var.b - 3);
                                this.l = 0;
                            }
                        }
                    }
                    this.d = 1;
                }
            }
        }
    }

    @Override // defpackage.tqn
    public final void d() {
        this.d = 0;
        this.l = 0;
        this.a.H(2);
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

    @Override // defpackage.tqn
    public final void e(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // defpackage.tqn
    public final void g(boolean z) {
    }

    @Override // defpackage.tqn
    public final void h(d5p d5pVar, xi11 xi11Var) {
        xi11Var.c();
        xi11Var.d();
        this.e = xi11Var.e;
        xi11Var.d();
        this.f = d5pVar.B(xi11Var.d, 1);
    }
}
