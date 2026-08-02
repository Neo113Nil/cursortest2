package defpackage;

import androidx.media3.common.ParserException;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class g22 implements b5p {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final byte[] a;
    public final coj b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public d5p j;
    public g001 k;
    public g001 l;
    public f7q0 m;
    public boolean n;
    public long o;
    public boolean p;

    static {
        int i = tw21.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public g22(int i) {
        this.a = new byte[1];
        this.g = -1;
        coj cojVar = new coj();
        this.b = cojVar;
        this.l = cojVar;
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        f7q0 f7q0Var = this.m;
        if (!(f7q0Var instanceof frv)) {
            if (j == 0 || !(f7q0Var instanceof s6e)) {
                this.i = 0L;
                return;
            } else {
                this.i = (Math.max(0L, j - ((s6e) f7q0Var).b) * 8000000) / r7.e;
                return;
            }
        }
        frv frvVar = (frv) f7q0Var;
        nlz nlzVar = frvVar.b;
        long c = nlzVar.a == 0 ? -9223372036854775807L : nlzVar.c(tw21.b(frvVar.a, j));
        this.i = c;
        if (Math.abs(this.o - c) < DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    public final int b(c5p c5pVar) {
        boolean z;
        c5pVar.J();
        byte[] bArr = this.a;
        c5pVar.g(0, 1, bArr);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.a(null, sb.toString());
    }

    public final boolean c(c5p c5pVar) {
        c5pVar.J();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        c5pVar.g(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            c5pVar.O(bArr.length);
            return true;
        }
        c5pVar.J();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        c5pVar.g(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        c5pVar.O(bArr3.length);
        return true;
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.j = d5pVar;
        g001 B = d5pVar.B(0, 1);
        this.k = B;
        this.l = B;
        d5pVar.A();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(c5p c5pVar, xde0 xde0Var) {
        c5p c5pVar2;
        d6z.z(this.k);
        int i = tw21.a;
        if (c5pVar.getPosition() == 0 && !c(c5pVar)) {
            throw ParserException.a(null, "Could not find AMR header.");
        }
        if (!this.p) {
            this.p = true;
            boolean z = this.c;
            String str = z ? "audio/amr-wb" : "audio/amr";
            String str2 = z ? "audio/amr-wb" : "audio/3gpp";
            int i2 = z ? 16000 : 8000;
            int i3 = z ? r[8] : q[7];
            g001 g001Var = this.k;
            f7s f7sVar = new f7s();
            f7sVar.l = eh20.q(str);
            f7sVar.m = eh20.q(str2);
            f7sVar.n = i3;
            f7sVar.C = 1;
            f7sVar.D = i2;
            smw0.u(f7sVar, g001Var);
        }
        int i4 = 0;
        if (this.f == 0) {
            try {
                int b = b(c5pVar);
                this.e = b;
                this.f = b;
                if (this.g == -1) {
                    c5pVar.getPosition();
                    this.g = this.e;
                }
                if (this.g == this.e) {
                    this.h++;
                }
                f7q0 f7q0Var = this.m;
                if (f7q0Var instanceof frv) {
                    frv frvVar = (frv) f7q0Var;
                    long j = this.i + this.d + DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
                    long position = c5pVar.getPosition() + this.e;
                    nlz nlzVar = frvVar.b;
                    int i5 = nlzVar.a;
                    if (i5 == 0 || j - nlzVar.c(i5 - 1) >= 100000) {
                        nlz nlzVar2 = frvVar.a;
                        nlz nlzVar3 = frvVar.b;
                        if (nlzVar3.a == 0 && j > 0) {
                            nlzVar2.a(0L);
                            nlzVar3.a(0L);
                        }
                        nlzVar2.a(position);
                        nlzVar3.a(j);
                    }
                    if (this.n && Math.abs(this.o - j) < DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) {
                        this.n = false;
                        this.l = this.k;
                    }
                }
            } catch (EOFException unused) {
                c5pVar2 = c5pVar;
            }
        }
        c5pVar2 = c5pVar;
        int b2 = this.l.b(c5pVar2, this.f, true);
        if (b2 != -1) {
            int i6 = this.f - b2;
            this.f = i6;
            if (i6 <= 0) {
                this.l.c(this.d + this.i, 1, this.e, 0, null);
                this.d += DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
            }
            c5pVar2.getLength();
            if (this.m == null) {
                qb4 qb4Var = new qb4(-9223372036854775807L);
                this.m = qb4Var;
                this.j.w(qb4Var);
            }
            if (i4 == -1) {
                f7q0 f7q0Var2 = this.m;
                if (f7q0Var2 instanceof frv) {
                    ((frv) f7q0Var2).c = this.i + this.d;
                    this.j.w(f7q0Var2);
                    this.k.getClass();
                }
            }
            return i4;
        }
        i4 = -1;
        c5pVar2.getLength();
        if (this.m == null) {
        }
        if (i4 == -1) {
        }
        return i4;
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        return c(c5pVar);
    }

    @Override // defpackage.b5p
    public final void release() {
    }

    public g22() {
        this(0);
    }
}
