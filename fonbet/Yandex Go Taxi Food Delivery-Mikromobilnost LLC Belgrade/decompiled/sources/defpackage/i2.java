package defpackage;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.Serializable;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.domesticroots.bouncycastle.asn1.ASN1Exception;

/* loaded from: classes9.dex */
public final class i2 extends FilterInputStream {
    public final int a;
    public final boolean b;
    public final byte[][] c;

    public i2(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }

    public static a3 c(int i, bph bphVar, byte[][] bArr) {
        switch (i) {
            case 1:
                return v1.p(d(bphVar, bArr));
            case 2:
                return k2.p(bphVar.c());
            case 3:
                return r1.p(bphVar.c());
            case 4:
                return new cqf(bphVar.c());
            case 5:
                if (bphVar.c().length == 0) {
                    return ypf.a;
                }
                ny61.r("malformed NULL encoding encountered");
                return null;
            case 6:
                return t2.p(d(bphVar, bArr), true);
            case 7:
                return p2.p(bphVar.c());
            case 8:
            case 9:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            case 29:
            default:
                ny61.v(oyr.j(i, "unknown tag ", " encountered"));
                return null;
            case 10:
                return d2.p(d(bphVar, bArr), true);
            case 12:
                return qqf.p(bphVar.c());
            case 13:
                return new c3(bphVar.c());
            case 18:
                return aqf.p(bphVar.c());
            case 19:
                return gqf.p(bphVar.c());
            case 20:
                return mqf.p(bphVar.c());
            case 21:
                return uqf.p(bphVar.c());
            case 22:
                return new wpf(bphVar.c());
            case 23:
                return u3.p(bphVar.c());
            case 24:
                return f2.r(bphVar.c());
            case 25:
                return upf.p(bphVar.c());
            case 26:
                return wqf.p(bphVar.c());
            case 27:
                return qpf.p(bphVar.c());
            case 28:
                return sqf.p(bphVar.c());
            case 30:
                int i2 = bphVar.w;
                if ((i2 & 1) != 0) {
                    ny61.v("malformed BMPString encoding encountered");
                    return null;
                }
                int i3 = i2 / 2;
                char[] cArr = new char[i3];
                byte[] bArr2 = new byte[8];
                int i4 = 0;
                int i5 = 0;
                while (i2 >= 8) {
                    if (asu0.a(8, bArr2, bphVar) != 8) {
                        throw new EOFException("EOF encountered in middle of BMPString");
                    }
                    cArr[i5] = (char) ((bArr2[0] << 8) | (bArr2[1] & 255));
                    cArr[i5 + 1] = (char) ((bArr2[2] << 8) | (bArr2[3] & 255));
                    cArr[i5 + 2] = (char) ((bArr2[4] << 8) | (bArr2[5] & 255));
                    cArr[i5 + 3] = (char) ((bArr2[6] << 8) | (bArr2[7] & 255));
                    i5 += 4;
                    i2 -= 8;
                }
                if (i2 > 0) {
                    if (asu0.a(i2, bArr2, bphVar) != i2) {
                        throw new EOFException("EOF encountered in middle of BMPString");
                    }
                    do {
                        int i6 = i4 + 1;
                        int i7 = bArr2[i4] << 8;
                        i4 += 2;
                        cArr[i5] = (char) ((bArr2[i6] & 255) | i7);
                        i5++;
                    } while (i4 < i2);
                }
                if (bphVar.w == 0 && i3 == i5) {
                    return jpf.p(cArr);
                }
                ny61.k();
                return null;
        }
    }

    public static byte[] d(bph bphVar, byte[][] bArr) {
        int i = bphVar.w;
        if (i >= bArr.length) {
            return bphVar.c();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i != bArr2.length) {
            ny61.g("buffer length not right for data");
            return null;
        }
        if (i == 0) {
            return bArr2;
        }
        int i2 = bphVar.b;
        if (i >= i2) {
            xfo.d(bphVar.w, i2, " >= ", "corrupted stream - out of bounds length found: ");
            return null;
        }
        int a = i - asu0.a(bArr2.length, bArr2, bphVar.a);
        bphVar.w = a;
        if (a == 0) {
            bphVar.a();
            return bArr2;
        }
        xfo.c(bphVar.c, bphVar.w);
        return null;
    }

    public static int e(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == read) {
            ny61.v("invalid long form definite-length 0xFF");
            return 0;
        }
        int i2 = read & HProv.PP_VERSION_TIMESTAMP;
        int i3 = 0;
        int i4 = 0;
        do {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i3 >>> 23) != 0) {
                ny61.v("long form definite-length more than 31 bits");
                return 0;
            }
            i3 = (i3 << 8) + read2;
            i4++;
        } while (i4 < i2);
        if (i3 < i || z) {
            return i3;
        }
        ny61.v(oyr.h(i3, i, "corrupted stream - out of bounds length found: ", " >= "));
        return 0;
    }

    public static int n(int i, InputStream inputStream) {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if (read < 31) {
            if (read < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            ny61.v("corrupted stream - high tag number < 31 found");
            return 0;
        }
        int i3 = read & HProv.PP_VERSION_TIMESTAMP;
        if (i3 == 0) {
            ny61.v("corrupted stream - invalid high tag number found");
            return 0;
        }
        while ((read & 128) != 0) {
            if ((i3 >>> 24) != 0) {
                ny61.v("Tag number more than 31 bits");
                return 0;
            }
            int i4 = i3 << 7;
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            i3 = i4 | (read2 & HProv.PP_VERSION_TIMESTAMP);
            read = read2;
        }
        return i3;
    }

    public final a3 a(int i, int i2, int i3) {
        bph bphVar = new bph(this, i3, this.a);
        if ((i & 224) == 0) {
            return c(i2, bphVar, this.c);
        }
        int i4 = i & 192;
        int i5 = 4;
        if (i4 != 0) {
            if ((i & 32) != 0) {
                return r3.p(i4, i2, o(bphVar));
            }
            td4 td4Var = new td4(i5, i4, i2, new cqf(bphVar.c()), 2);
            return i4 != 64 ? td4Var : new nvf(td4Var);
        }
        int i6 = 0;
        if (i2 == 3) {
            b2 o = o(bphVar);
            int i7 = o.b;
            r1[] r1VarArr = new r1[i7];
            while (i6 != i7) {
                z1 c = o.c(i6);
                if (!(c instanceof r1)) {
                    throw new ASN1Exception("unknown object encountered in constructed BIT STRING: " + c.getClass());
                }
                r1VarArr[i6] = (r1) c;
                i6++;
            }
            return new ad4(r1VarArr);
        }
        if (i2 != 4) {
            if (i2 == 8) {
                wvf a = svf.a(o(bphVar));
                a.getClass();
                return new npf(a, 1);
            }
            if (i2 == 16) {
                return bphVar.w < 1 ? svf.a : this.b ? new r3y(bphVar.c()) : svf.a(o(bphVar));
            }
            if (i2 == 17) {
                return svf.b(o(bphVar));
            }
            ny61.v(oyr.j(i2, "unknown tag ", " encountered"));
            return null;
        }
        b2 o2 = o(bphVar);
        int i8 = o2.b;
        v2[] v2VarArr = new v2[i8];
        while (i6 != i8) {
            z1 c2 = o2.c(i6);
            if (!(c2 instanceof v2)) {
                throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: " + c2.getClass());
            }
            v2VarArr[i6] = (v2) c2;
            i6++;
        }
        return new gd4(v2VarArr);
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [byte[][], java.io.Serializable] */
    public final a3 k() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            ny61.v("unexpected end-of-contents marker");
            return null;
        }
        int n = n(read, this);
        int i = this.a;
        int i2 = 0;
        int e = e(this, i, false);
        if (e >= 0) {
            try {
                return a(read, n, e);
            } catch (IllegalArgumentException e2) {
                throw new ASN1Exception("corrupted stream detected", e2);
            }
        }
        if ((read & 32) == 0) {
            ny61.v("indefinite-length primitive encoding encountered");
            return null;
        }
        o3 o3Var = new o3(new rqv(i, this), i, (Serializable) this.c, i2);
        int i3 = read & 192;
        if (i3 != 0) {
            return o3Var.x(i3, n);
        }
        if (n == 3) {
            return cd4.c(o3Var);
        }
        if (n == 4) {
            return kd4.c(o3Var);
        }
        if (n == 8) {
            return od4.g(o3Var);
        }
        if (n == 16) {
            return od4.c(o3Var);
        }
        if (n == 17) {
            return od4.f(o3Var);
        }
        ny61.v("unknown BER object encountered");
        return null;
    }

    public final b2 o(bph bphVar) {
        i2 i2Var;
        a3 k;
        int i = bphVar.w;
        if (i >= 1 && (k = (i2Var = new i2(bphVar, i, this.b, this.c)).k()) != null) {
            b2 b2Var = new b2();
            do {
                b2Var.a(k);
                k = i2Var.k();
            } while (k != null);
            return b2Var;
        }
        return new b2(0);
    }

    public i2(byte[] bArr, int i) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    public i2(ByteArrayInputStream byteArrayInputStream, int i, boolean z) {
        this(byteArrayInputStream, i, z, new byte[11][]);
    }

    public i2(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.a = i;
        this.b = z;
        this.c = bArr;
    }
}
