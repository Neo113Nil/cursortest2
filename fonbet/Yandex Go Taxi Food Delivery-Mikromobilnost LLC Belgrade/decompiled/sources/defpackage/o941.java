package defpackage;

import android.util.Pair;
import androidx.media3.common.ParserException;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class o941 implements b5p {
    public d5p a;
    public g001 b;
    public m941 e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        m941 m941Var = this.e;
        if (m941Var != null) {
            m941Var.e(j2);
        }
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.a = d5pVar;
        this.b = d5pVar.B(0, 1);
        d5pVar.A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0178, code lost:
    
        if (r13 != 65534) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017f, code lost:
    
        if (r17 == 32) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a1  */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(c5p c5pVar, xde0 xde0Var) {
        byte[] bArr;
        int i;
        d6z.z(this.b);
        int i2 = tw21.a;
        int i3 = this.c;
        int i4 = 4;
        if (i3 == 0) {
            d6z.x(c5pVar.getPosition() == 0);
            int i5 = this.f;
            if (i5 != -1) {
                c5pVar.O(i5);
                this.c = 4;
                return 0;
            }
            if (!zk91.f(c5pVar)) {
                throw ParserException.a(null, "Unsupported or unrecognized wav file type.");
            }
            c5pVar.O((int) (c5pVar.L() - c5pVar.getPosition()));
            this.c = 1;
            return 0;
        }
        long j = -1;
        if (i3 == 1) {
            ef90 ef90Var = new ef90(8);
            h0n d = h0n.d(c5pVar, ef90Var);
            if (d.a != 1685272116) {
                c5pVar.J();
            } else {
                c5pVar.N(8);
                ef90Var.K(0);
                c5pVar.g(0, 8, ef90Var.a);
                j = ef90Var.n();
                c5pVar.O(((int) d.b) + 8);
            }
            this.d = j;
            this.c = 2;
            return 0;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    ny61.k();
                    return 0;
                }
                d6z.x(this.g != -1);
                long position = this.g - c5pVar.getPosition();
                m941 m941Var = this.e;
                m941Var.getClass();
                return m941Var.f(c5pVar, position) ? -1 : 0;
            }
            c5pVar.J();
            h0n l = zk91.l(1684108385, c5pVar, new ef90(8));
            c5pVar.O(8);
            Pair create = Pair.create(Long.valueOf(c5pVar.getPosition()), Long.valueOf(l.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j2 = this.d;
            if (j2 != -1 && longValue == _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
                longValue = j2;
            }
            this.g = this.f + longValue;
            long length = c5pVar.getLength();
            if (length != -1 && this.g > length) {
                lk91.j("Data exceeds input length: " + this.g + Extension.FIX_SPACE + length);
                this.g = length;
            }
            m941 m941Var2 = this.e;
            m941Var2.getClass();
            m941Var2.b(this.f, this.g);
            this.c = 4;
            return 0;
        }
        ef90 ef90Var2 = new ef90(16);
        long j3 = zk91.l(1718449184, c5pVar, ef90Var2).b;
        d6z.x(j3 >= 16);
        c5pVar.g(0, 16, ef90Var2.a);
        ef90Var2.K(0);
        int r = ef90Var2.r();
        int r2 = ef90Var2.r();
        int q = ef90Var2.q();
        ef90Var2.q();
        int r3 = ef90Var2.r();
        int r4 = ef90Var2.r();
        int i6 = ((int) j3) - 16;
        if (i6 > 0) {
            bArr = new byte[i6];
            c5pVar.g(0, i6, bArr);
        } else {
            bArr = tw21.c;
        }
        byte[] bArr2 = bArr;
        c5pVar.O((int) (c5pVar.L() - c5pVar.getPosition()));
        lhc0 lhc0Var = new lhc0(r, r2, q, r3, r4, bArr2);
        if (r == 17) {
            this.e = new l941(this.a, this.b, lhc0Var);
        } else if (r == 6) {
            this.e = new n941(this.a, this.b, lhc0Var, "audio/g711-alaw", -1);
        } else if (r == 7) {
            this.e = new n941(this.a, this.b, lhc0Var, "audio/g711-mlaw", -1);
        } else {
            if (r != 1) {
                if (r != 3) {
                }
                i = 0;
                if (i != 0) {
                    throw ParserException.c("Unsupported WAV format type: " + r);
                }
                this.e = new n941(this.a, this.b, lhc0Var, "audio/raw", i);
            }
            i4 = tw21.F(r4);
            i = i4;
            if (i != 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        return zk91.f(c5pVar);
    }

    @Override // defpackage.b5p
    public final void release() {
    }
}
