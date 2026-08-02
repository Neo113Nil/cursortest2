package defpackage;

import androidx.media3.common.a;
import java.util.Collections;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.reprov.array.DerValue;
import yads.bs1;
import yads.cs1;

/* loaded from: classes10.dex */
public final class cfr {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final Object k;
    public final Object l;

    public cfr(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 5;
        switch (i2) {
            case 1:
                uh81 uh81Var = new uh81(bArr);
                uh81Var.f(i * 8);
                this.a = uh81Var.a(16);
                this.b = uh81Var.a(16);
                this.c = uh81Var.a(24);
                this.d = uh81Var.a(24);
                int a = uh81Var.a(20);
                this.e = a;
                switch (a) {
                    case 8000:
                        i3 = 4;
                        break;
                    case 16000:
                        i3 = 5;
                        break;
                    case 22050:
                        i3 = 6;
                        break;
                    case 24000:
                        i3 = 7;
                        break;
                    case 32000:
                        i3 = 8;
                        break;
                    case 44100:
                        i3 = 9;
                        break;
                    case 48000:
                        i3 = 10;
                        break;
                    case 88200:
                        i3 = 1;
                        break;
                    case 96000:
                        i3 = 11;
                        break;
                    case 176400:
                        i3 = 2;
                        break;
                    case 192000:
                        i3 = 3;
                        break;
                    default:
                        i3 = -1;
                        break;
                }
                this.f = i3;
                this.g = uh81Var.a(3) + 1;
                int a2 = uh81Var.a(5) + 1;
                this.h = a2;
                if (a2 == 8) {
                    i4 = 1;
                } else if (a2 == 12) {
                    i4 = 2;
                } else if (a2 == 16) {
                    i4 = 4;
                } else if (a2 != 20) {
                    i4 = a2 != 24 ? -1 : 6;
                }
                this.i = i4;
                int a3 = uh81Var.a(4);
                int a4 = uh81Var.a(32);
                int i5 = rf71.a;
                this.j = ((a3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) << 32) | (a4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                this.k = null;
                this.l = null;
                break;
            default:
                df90 df90Var = new df90(bArr, bArr.length);
                df90Var.m(i * 8);
                this.a = df90Var.g(16);
                this.b = df90Var.g(16);
                this.c = df90Var.g(24);
                this.d = df90Var.g(24);
                int g = df90Var.g(20);
                this.e = g;
                this.f = e(g);
                this.g = df90Var.g(3) + 1;
                int g2 = df90Var.g(5) + 1;
                this.h = g2;
                this.i = b(g2);
                this.j = df90Var.i(36);
                this.k = null;
                this.l = null;
                break;
        }
    }

    public static int b(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int e(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public qd81 a(byte[] bArr, cs1 cs1Var) {
        bArr[4] = DerValue.TAG_CONTEXT;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        cs1 cs1Var2 = (cs1) this.l;
        if (cs1Var2 != null) {
            if (cs1Var != null) {
                bs1[] bs1VarArr = cs1Var.b;
                if (bs1VarArr.length != 0) {
                    cs1Var = new cs1((bs1[]) rf71.r(cs1Var2.b, bs1VarArr));
                }
            }
            cs1Var = cs1Var2;
        }
        da81 da81Var = new da81();
        da81Var.k = "audio/flac";
        da81Var.l = i;
        da81Var.x = this.g;
        da81Var.y = this.e;
        da81Var.m = Collections.singletonList(bArr);
        da81Var.i = cs1Var;
        return new qd81(da81Var);
    }

    public long c() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public a d(byte[] bArr, w820 w820Var) {
        bArr[4] = DerValue.TAG_CONTEXT;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        w820 w820Var2 = (w820) this.l;
        if (w820Var2 != null) {
            w820Var = w820Var2.b(w820Var);
        }
        f7s f7sVar = new f7s();
        f7sVar.m = eh20.q("audio/flac");
        f7sVar.n = i;
        f7sVar.C = this.g;
        f7sVar.D = this.e;
        f7sVar.E = tw21.F(this.h);
        f7sVar.p = Collections.singletonList(bArr);
        f7sVar.k = w820Var;
        return new a(f7sVar);
    }

    public cfr(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, bfr bfrVar, cs1 cs1Var) {
        int i8;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        int i9 = 4;
        switch (i5) {
            case 8000:
                i8 = 4;
                break;
            case 16000:
                i8 = 5;
                break;
            case 22050:
                i8 = 6;
                break;
            case 24000:
                i8 = 7;
                break;
            case 32000:
                i8 = 8;
                break;
            case 44100:
                i8 = 9;
                break;
            case 48000:
                i8 = 10;
                break;
            case 88200:
                i8 = 1;
                break;
            case 96000:
                i8 = 11;
                break;
            case 176400:
                i8 = 2;
                break;
            case 192000:
                i8 = 3;
                break;
            default:
                i8 = -1;
                break;
        }
        this.f = i8;
        this.g = i6;
        this.h = i7;
        if (i7 == 8) {
            i9 = 1;
        } else if (i7 == 12) {
            i9 = 2;
        } else if (i7 != 16) {
            i9 = i7 != 20 ? i7 != 24 ? -1 : 6 : 5;
        }
        this.i = i9;
        this.j = j;
        this.k = bfrVar;
        this.l = cs1Var;
    }

    public cfr(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, bfr bfrVar, w820 w820Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = e(i5);
        this.g = i6;
        this.h = i7;
        this.i = b(i7);
        this.j = j;
        this.k = bfrVar;
        this.l = w820Var;
    }
}
