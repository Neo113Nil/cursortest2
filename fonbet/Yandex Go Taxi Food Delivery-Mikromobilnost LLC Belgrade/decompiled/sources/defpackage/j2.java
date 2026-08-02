package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import org.bouncycastle.asn1.ASN1Exception;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class j2 extends FilterInputStream {
    public final int a;
    public final boolean b;
    public final byte[][] c;

    public j2(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }

    public static b3 c(int i, cph cphVar, byte[][] bArr) {
        try {
            switch (i) {
                case 1:
                    return w1.u(e(cphVar, bArr));
                case 2:
                    return new l2(cphVar.c());
                case 3:
                    return s1.u(cphVar.c());
                case 4:
                    return new dqf(cphVar.c());
                case 5:
                    if (cphVar.c().length == 0) {
                        return zpf.b;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    return u2.x(e(cphVar, bArr), true);
                case 7:
                    return new q2(new vpf(cphVar.c()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException("unknown tag " + i + " encountered");
                case 10:
                    return e2.u(e(cphVar, bArr), true);
                case 12:
                    return new rqf(cphVar.c());
                case 13:
                    return new d3(cphVar.c());
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    throw new IOException("unsupported tag " + i + " encountered");
                case 18:
                    return new bqf(cphVar.c());
                case 19:
                    return new hqf(cphVar.c());
                case 20:
                    return new nqf(cphVar.c());
                case 21:
                    return new vqf(cphVar.c());
                case 22:
                    return new xpf(cphVar.c());
                case 23:
                    return new v3(cphVar.c());
                case 24:
                    return new g2(cphVar.c());
                case 25:
                    return new vpf(cphVar.c());
                case 26:
                    return new xqf(cphVar.c());
                case 27:
                    return new rpf(cphVar.c());
                case 28:
                    return new tqf(cphVar.c());
                case 30:
                    return new kpf(d(cphVar));
            }
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e, e.getMessage());
        } catch (IllegalStateException e2) {
            throw new ASN1Exception(e2, e2.getMessage());
        }
    }

    public static char[] d(cph cphVar) {
        int i = cphVar.w;
        if ((i & 1) != 0) {
            ny61.v("malformed BMPString encoding encountered");
            return null;
        }
        int i2 = i / 2;
        char[] cArr = new char[i2];
        byte[] bArr = new byte[8];
        int i3 = 0;
        int i4 = 0;
        while (i >= 8) {
            if (zru0.a(cphVar, bArr, 0, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i4] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i4 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i4 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i4 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i4 += 4;
            i -= 8;
        }
        if (i > 0) {
            if (zru0.a(cphVar, bArr, 0, i) != i) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i5 = i3 + 1;
                int i6 = bArr[i3] << 8;
                i3 += 2;
                cArr[i4] = (char) ((bArr[i5] & 255) | i6);
                i4++;
            } while (i3 < i);
        }
        if (cphVar.w == 0 && i2 == i4) {
            return cArr;
        }
        ny61.k();
        return null;
    }

    public static byte[] e(cph cphVar, byte[][] bArr) {
        int i = cphVar.w;
        if (i >= bArr.length) {
            return cphVar.c();
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
        int i2 = cphVar.b;
        if (i >= i2) {
            xfo.d(cphVar.w, i2, " >= ", "corrupted stream - out of bounds length found: ");
            return null;
        }
        int a = i - zru0.a(cphVar.a, bArr2, 0, bArr2.length);
        cphVar.w = a;
        if (a == 0) {
            cphVar.a();
            return bArr2;
        }
        xfo.c(cphVar.c, cphVar.w);
        return null;
    }

    public static int k(InputStream inputStream, int i, boolean z) {
        String str;
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
        if (255 != read) {
            int i2 = read & HProv.PP_VERSION_TIMESTAMP;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int read2 = inputStream.read();
                if (read2 < 0) {
                    throw new EOFException("EOF found reading length");
                }
                if ((i3 >>> 23) != 0) {
                    str = "long form definite-length more than 31 bits";
                    break;
                }
                i3 = (i3 << 8) + read2;
                i4++;
                if (i4 >= i2) {
                    if (i3 < i || z) {
                        return i3;
                    }
                    str = oyr.h(i3, i, "corrupted stream - out of bounds length found: ", " >= ");
                }
            }
        } else {
            str = "invalid long form definite-length 0xFF";
        }
        ny61.v(str);
        return 0;
    }

    public static int o(int i, InputStream inputStream) {
        String str;
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if (read >= 31) {
            int i3 = read & HProv.PP_VERSION_TIMESTAMP;
            if (i3 != 0) {
                while ((read & 128) != 0) {
                    if ((i3 >>> 24) == 0) {
                        int i4 = i3 << 7;
                        int read2 = inputStream.read();
                        if (read2 < 0) {
                            throw new EOFException("EOF found inside tag value.");
                        }
                        i3 = i4 | (read2 & HProv.PP_VERSION_TIMESTAMP);
                        read = read2;
                    } else {
                        str = "Tag number more than 31 bits";
                    }
                }
                return i3;
            }
            str = "corrupted stream - invalid high tag number found";
        } else {
            if (read < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            str = "corrupted stream - high tag number < 31 found";
        }
        ny61.v(str);
        return 0;
    }

    public final b3 a(int i, int i2, int i3) {
        cph cphVar = new cph(this, i3, this.a);
        if ((i & 224) == 0) {
            return c(i2, cphVar, this.c);
        }
        int i4 = i & 192;
        int i5 = 3;
        int i6 = 4;
        int i7 = 0;
        if (i4 != 0) {
            if ((i & 32) == 0) {
                return new oqf(i6, i4, i2, new dqf(cphVar.c()), 1);
            }
            c2 v = v(cphVar);
            return v.b == 1 ? new oqf(i5, i4, i2, v.c(0), 1) : new oqf(i6, i4, i2, tvf.a(v), 1);
        }
        if (i2 == 3) {
            c2 v2 = v(cphVar);
            int i8 = v2.b;
            s1[] s1VarArr = new s1[i8];
            while (i7 != i8) {
                a2 c = v2.c(i7);
                if (!(c instanceof s1)) {
                    throw new ASN1Exception("unknown object encountered in constructed BIT STRING: " + c.getClass());
                }
                s1VarArr[i7] = (s1) c;
                i7++;
            }
            return new bd4(s1VarArr);
        }
        if (i2 == 4) {
            c2 v3 = v(cphVar);
            int i9 = v3.b;
            w2[] w2VarArr = new w2[i9];
            while (i7 != i9) {
                a2 c2 = v3.c(i7);
                if (!(c2 instanceof w2)) {
                    throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: " + c2.getClass());
                }
                w2VarArr[i7] = (w2) c2;
                i7++;
            }
            return new hd4(hd4.y(w2VarArr), w2VarArr);
        }
        if (i2 == 8) {
            xvf a = tvf.a(v(cphVar));
            a.getClass();
            return new opf(a, 1);
        }
        if (i2 != 16) {
            if (i2 != 17) {
                ny61.v(oyr.j(i2, "unknown tag ", " encountered"));
                return null;
            }
            c2 v4 = v(cphVar);
            xvf xvfVar = tvf.a;
            return v4.b < 1 ? tvf.b : new zvf(v4);
        }
        if (cphVar.w < 1) {
            return tvf.a;
        }
        if (!this.b) {
            return tvf.a(v(cphVar));
        }
        byte[] c3 = cphVar.c();
        s3y s3yVar = new s3y();
        s3yVar.c = c3;
        return s3yVar;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [byte[][], java.io.Serializable] */
    public final b3 n() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            ny61.v("unexpected end-of-contents marker");
            return null;
        }
        int o = o(read, this);
        int i = this.a;
        int k = k(this, i, false);
        if (k >= 0) {
            try {
                return a(read, o, k);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception(e, "corrupted stream detected");
            }
        }
        if ((read & 32) == 0) {
            ny61.v("indefinite-length primitive encoding encountered");
            return null;
        }
        int i2 = 1;
        o3 o3Var = new o3(new sqv(i, this), i, (Serializable) this.c, i2);
        int i3 = read & 192;
        if (i3 != 0) {
            return o3Var.y(i3, o);
        }
        if (o == 3) {
            return dd4.c(o3Var);
        }
        if (o != 4) {
            if (o == 8) {
                return ppf.c(o3Var);
            }
            if (o == 16) {
                return new nd4(o3Var.I());
            }
            if (o == 17) {
                return new rd4(o3Var.I(), false);
            }
            ny61.v("unknown BER object encountered");
            return null;
        }
        u8e u8eVar = new u8e(i2, o3Var);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read2 = u8eVar.read(bArr, 0, 4096);
            if (read2 < 0) {
                return new hd4(byteArrayOutputStream.toByteArray(), null);
            }
            byteArrayOutputStream.write(bArr, 0, read2);
        }
    }

    public final c2 v(cph cphVar) {
        j2 j2Var;
        b3 n;
        int i = cphVar.w;
        if (i >= 1 && (n = (j2Var = new j2(cphVar, i, this.b, this.c)).n()) != null) {
            c2 c2Var = new c2();
            do {
                c2Var.a(n);
                n = j2Var.n();
            } while (n != null);
            return c2Var;
        }
        return new c2(0);
    }

    public j2(InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11][]);
    }

    public j2(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.a = i;
        this.b = z;
        this.c = bArr;
    }

    public j2(InputStream inputStream) {
        this(inputStream, zgb1.c(inputStream), false);
    }

    public j2(byte[] bArr, int i) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }
}
