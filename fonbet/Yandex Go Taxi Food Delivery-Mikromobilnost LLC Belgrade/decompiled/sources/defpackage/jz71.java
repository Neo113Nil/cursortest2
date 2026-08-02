package defpackage;

import android.util.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import yads.aa2;

/* loaded from: classes7.dex */
public final class jz71 implements n771 {
    public yg71 a;
    public fb81 b;
    public bt71 e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.a = yg71Var;
        this.b = yg71Var.l(0, 1);
        yg71Var.mo495a();
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        bt71 bt71Var = this.e;
        if (bt71Var != null) {
            bt71Var.a(j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x015c, code lost:
    
        if (r9 != 65534) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
    
        if (r15 == 32) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0186  */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        int i;
        byte[] bArr;
        int i2;
        if (this.b == null) {
            ny61.k();
            return 0;
        }
        int i3 = rf71.a;
        int i4 = this.c;
        int i5 = 4;
        if (i4 == 0) {
            w971 w971Var = (w971) bb71Var;
            if (w971Var.w != 0) {
                ny61.k();
                return 0;
            }
            int i6 = this.f;
            if (i6 != -1) {
                w971Var.b(i6);
                this.c = 4;
                return 0;
            }
            if (!tia1.b(w971Var)) {
                dy31.g(null, "Unsupported or unrecognized wav file type.");
                return 0;
            }
            long j = w971Var.w;
            w971Var.b((int) ((w971Var.y + j) - j));
            this.c = 1;
            return 0;
        }
        long j2 = -1;
        if (i4 == 1) {
            dl81 dl81Var = new dl81(8);
            w971 w971Var2 = (w971) bb71Var;
            h0n a = h0n.a(w971Var2, dl81Var);
            if (a.a != 1685272116) {
                i = 0;
                w971Var2.y = 0;
            } else {
                i = 0;
                w971Var2.c(8, false);
                dl81Var.m(0);
                w971Var2.I(dl81Var.a, 0, 8, false);
                j2 = dl81Var.j();
                w971Var2.b(((int) a.b) + 8);
            }
            this.d = j2;
            this.c = 2;
            return i;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    ny61.k();
                    return 0;
                }
                long j3 = this.g;
                if (j3 == -1) {
                    ny61.k();
                    return 0;
                }
                w971 w971Var3 = (w971) bb71Var;
                long j4 = j3 - w971Var3.w;
                bt71 bt71Var = this.e;
                bt71Var.getClass();
                return bt71Var.d(w971Var3, j4) ? -1 : 0;
            }
            w971 w971Var4 = (w971) bb71Var;
            w971Var4.y = 0;
            h0n a2 = tia1.a(1684108385, w971Var4, new dl81(8));
            w971Var4.b(8);
            Pair create = Pair.create(Long.valueOf(w971Var4.w), Long.valueOf(a2.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j5 = this.d;
            if (j5 != -1 && longValue == _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
                longValue = j5;
            }
            long j6 = this.f + longValue;
            this.g = j6;
            long j7 = w971Var4.c;
            if (j7 != -1 && j6 > j7) {
                nba1.e();
                this.g = j7;
            }
            bt71 bt71Var2 = this.e;
            bt71Var2.getClass();
            bt71Var2.c(this.f, this.g);
            this.c = 4;
            return 0;
        }
        dl81 dl81Var2 = new dl81(16);
        w971 w971Var5 = (w971) bb71Var;
        long j8 = tia1.a(1718449184, w971Var5, dl81Var2).b;
        if (j8 < 16) {
            ny61.k();
            return 0;
        }
        w971Var5.I(dl81Var2.a, 0, 16, false);
        dl81Var2.m(0);
        int n = dl81Var2.n();
        int n2 = dl81Var2.n();
        int h = dl81Var2.h();
        if (h < 0) {
            ny61.r(q8a1.c(h, "Top bit not zero: "));
            return 0;
        }
        int h2 = dl81Var2.h();
        if (h2 < 0) {
            ny61.r(q8a1.c(h2, "Top bit not zero: "));
            return 0;
        }
        int n3 = dl81Var2.n();
        int n4 = dl81Var2.n();
        int i7 = ((int) j8) - 16;
        if (i7 > 0) {
            bArr = new byte[i7];
            w971Var5.I(bArr, 0, i7, false);
        } else {
            bArr = rf71.f;
        }
        byte[] bArr2 = bArr;
        long j9 = w971Var5.w;
        w971Var5.b((int) ((w971Var5.y + j9) - j9));
        lhc0 lhc0Var = new lhc0(n2, h, n3, n4, bArr2);
        if (n == 17) {
            this.e = new l941(this.a, this.b, lhc0Var);
        } else if (n == 6) {
            this.e = new n941(this.a, this.b, lhc0Var, "audio/g711-alaw", -1);
        } else if (n == 7) {
            this.e = new n941(this.a, this.b, lhc0Var, "audio/g711-mlaw", -1);
        } else {
            if (n != 1) {
                if (n != 3) {
                }
                i2 = 0;
                if (i2 != 0) {
                    throw aa2.a("Unsupported WAV format type: " + n);
                }
                this.e = new n941(this.a, this.b, lhc0Var, "audio/raw", i2);
            }
            i5 = rf71.s(n4);
            i2 = i5;
            if (i2 != 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        return tia1.b((w971) bb71Var);
    }
}
