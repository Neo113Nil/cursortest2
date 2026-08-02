package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import org.bouncycastle.cert.X509CertificateHolder;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public final class nc51 implements blq0 {
    public final byte[] a;
    public final jc51 b;
    public final BigInteger c;

    public nc51(jc51 jc51Var, BigInteger bigInteger, byte[] bArr) {
        this.b = jc51Var;
        this.c = bigInteger;
        this.a = bArr;
    }

    @Override // defpackage.blq0
    public final boolean Q0(Object obj) {
        boolean z = obj instanceof X509CertificateHolder;
        byte[] bArr = this.a;
        if (z) {
            X509CertificateHolder x509CertificateHolder = (X509CertificateHolder) obj;
            BigInteger bigInteger = this.c;
            if (bigInteger != null) {
                p0x p0xVar = new p0x(x509CertificateHolder.a);
                if (p0xVar.a.equals(this.b)) {
                    l2 l2Var = p0xVar.b;
                    if (l2.z(l2Var.b, l2Var.a) == bigInteger.intValue() && l2Var.x().equals(bigInteger)) {
                        return true;
                    }
                }
            } else if (bArr != null) {
                u2 u2Var = ayo.x;
                gzo gzoVar = x509CertificateHolder.b;
                ayo ayoVar = gzoVar != null ? (ayo) gzoVar.a.get(u2Var) : null;
                if (ayoVar != null) {
                    return Arrays.equals(bArr, w2.x(ayoVar.m()).a);
                }
                zyu0 zyu0Var = x509CertificateHolder.a.b.B;
                d000 d000Var = new d000();
                byte[] bArr2 = new byte[20];
                try {
                    byte[] encoded = zyu0Var.getEncoded("DER");
                    int length = encoded.length;
                    int i = 0;
                    while (d000Var.b != 0 && length > 0) {
                        d000Var.d(encoded[i]);
                        i++;
                        length--;
                    }
                    while (true) {
                        byte[] bArr3 = d000Var.a;
                        if (length <= bArr3.length) {
                            break;
                        }
                        d000Var.b(i, encoded);
                        i += bArr3.length;
                        length -= bArr3.length;
                        d000Var.c += bArr3.length;
                    }
                    while (length > 0) {
                        d000Var.d(encoded[i]);
                        i++;
                        length--;
                    }
                    long j = d000Var.c << 3;
                    d000Var.d(DerValue.TAG_CONTEXT);
                    while (d000Var.b != 0) {
                        d000Var.d((byte) 0);
                    }
                    if (d000Var.j > 14) {
                        d000Var.a();
                    }
                    int[] iArr = d000Var.i;
                    iArr[14] = (int) (j >>> 32);
                    iArr[15] = (int) j;
                    d000Var.a();
                    u490.b(d000Var.d, 0, bArr2);
                    u490.b(d000Var.e, 4, bArr2);
                    u490.b(d000Var.f, 8, bArr2);
                    u490.b(d000Var.g, 12, bArr2);
                    u490.b(d000Var.h, 16, bArr2);
                    d000Var.c();
                } catch (IOException unused) {
                    bArr2 = new byte[0];
                }
                return Arrays.equals(bArr, bArr2);
            }
        } else if (obj instanceof byte[]) {
            return Arrays.equals(bArr, (byte[]) obj);
        }
        return false;
    }

    public final Object clone() {
        return new nc51(this.b, this.c, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nc51) {
            nc51 nc51Var = (nc51) obj;
            if (Arrays.equals(this.a, nc51Var.a)) {
                BigInteger bigInteger = nc51Var.c;
                BigInteger bigInteger2 = this.c;
                if (bigInteger2 != null ? bigInteger2.equals(bigInteger) : bigInteger == null) {
                    jc51 jc51Var = nc51Var.b;
                    jc51 jc51Var2 = this.b;
                    if (jc51Var2 != null ? jc51Var2.equals(jc51Var) : jc51Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int e = rza1.e(this.a);
        BigInteger bigInteger = this.c;
        if (bigInteger != null) {
            e ^= bigInteger.hashCode();
        }
        jc51 jc51Var = this.b;
        return jc51Var != null ? jc51Var.hashCode() ^ e : e;
    }
}
