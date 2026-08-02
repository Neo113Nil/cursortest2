package com.google.protobuf;

import defpackage.bor;
import defpackage.d5m;
import defpackage.eac;
import defpackage.i96;
import defpackage.o5w;
import defpackage.oo31;
import defpackage.oqw;
import defpackage.qlz;
import defpackage.rqw;
import defpackage.som0;
import defpackage.v43;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes.dex */
public abstract class d {
    public static int a(byte[] bArr, int i, v43 v43Var) {
        int r = r(bArr, i, v43Var);
        int i2 = v43Var.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.i();
        }
        if (i2 > bArr.length - r) {
            throw InvalidProtocolBufferException.m();
        }
        if (i2 == 0) {
            v43Var.c = ByteString.a;
            return r;
        }
        v43Var.c = ByteString.f(r, i2, bArr);
        return r + i2;
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long c(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int d(som0 som0Var, byte[] bArr, int i, int i2, int i3, v43 v43Var) {
        Object d = som0Var.d();
        int u = u(d, som0Var, bArr, i, i2, i3, v43Var);
        som0Var.c(d);
        v43Var.c = d;
        return u;
    }

    public static int e(som0 som0Var, byte[] bArr, int i, int i2, v43 v43Var) {
        Object d = som0Var.d();
        int v = v(d, som0Var, bArr, i, i2, v43Var);
        som0Var.c(d);
        v43Var.c = d;
        return v;
    }

    public static int f(som0 som0Var, int i, byte[] bArr, int i2, int i3, oqw oqwVar, v43 v43Var) {
        int e = e(som0Var, bArr, i2, i3, v43Var);
        oqwVar.add(v43Var.c);
        while (e < i3) {
            int r = r(bArr, e, v43Var);
            if (i != v43Var.a) {
                break;
            }
            e = e(som0Var, bArr, r, i3, v43Var);
            oqwVar.add(v43Var.c);
        }
        return e;
    }

    public static int g(byte[] bArr, int i, oqw oqwVar, v43 v43Var) {
        i96 i96Var = (i96) oqwVar;
        int r = r(bArr, i, v43Var);
        int i2 = v43Var.a + r;
        while (r < i2) {
            r = t(bArr, r, v43Var);
            i96Var.b(v43Var.b != 0);
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.m();
    }

    public static int h(byte[] bArr, int i, oqw oqwVar, v43 v43Var) {
        d5m d5mVar = (d5m) oqwVar;
        int r = r(bArr, i, v43Var);
        int i2 = v43Var.a;
        int i3 = r + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.m();
        }
        d5mVar.e((i2 / 8) + d5mVar.size());
        while (r < i3) {
            d5mVar.b(Double.longBitsToDouble(c(r, bArr)));
            r += 8;
        }
        if (r == i3) {
            return r;
        }
        throw InvalidProtocolBufferException.m();
    }

    public static int i(byte[] bArr, int i, oqw oqwVar, v43 v43Var) {
        o5w o5wVar = (o5w) oqwVar;
        int r = r(bArr, i, v43Var);
        int i2 = v43Var.a;
        int i3 = r + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.m();
        }
        int i4 = (i2 / 4) + o5wVar.c;
        int[] iArr = o5wVar.b;
        if (i4 > iArr.length) {
            if (iArr.length == 0) {
                o5wVar.b = new int[Math.max(i4, 10)];
            } else {
                int length = iArr.length;
                while (length < i4) {
                    length = oo31.c(length, 3, 2, 1, 10);
                }
                o5wVar.b = Arrays.copyOf(o5wVar.b, length);
            }
        }
        while (r < i3) {
            o5wVar.b(b(r, bArr));
            r += 4;
        }
        if (r == i3) {
            return r;
        }
        throw InvalidProtocolBufferException.m();
    }

    public static int j(byte[] bArr, int i, oqw oqwVar, v43 v43Var) {
        qlz qlzVar = (qlz) oqwVar;
        int r = r(bArr, i, v43Var);
        int i2 = v43Var.a;
        int i3 = r + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.m();
        }
        qlzVar.e((i2 / 8) + qlzVar.size());
        while (r < i3) {
            qlzVar.b(c(r, bArr));
            r += 8;
        }
        if (r == i3) {
            return r;
        }
        throw InvalidProtocolBufferException.m();
    }

    public static int k(byte[] bArr, int i, oqw oqwVar, v43 v43Var) {
        bor borVar = (bor) oqwVar;
        int r = r(bArr, i, v43Var);
        int i2 = v43Var.a;
        int i3 = r + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.m();
        }
        borVar.e((i2 / 4) + borVar.size());
        while (r < i3) {
            borVar.b(Float.intBitsToFloat(b(r, bArr)));
            r += 4;
        }
        if (r == i3) {
            return r;
        }
        throw InvalidProtocolBufferException.m();
    }

    public static int l(byte[] bArr, int i, oqw oqwVar, v43 v43Var) {
        o5w o5wVar = (o5w) oqwVar;
        int r = r(bArr, i, v43Var);
        int i2 = v43Var.a + r;
        while (r < i2) {
            r = r(bArr, r, v43Var);
            o5wVar.b(eac.b(v43Var.a));
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.m();
    }

    public static int m(byte[] bArr, int i, oqw oqwVar, v43 v43Var) {
        qlz qlzVar = (qlz) oqwVar;
        int r = r(bArr, i, v43Var);
        int i2 = v43Var.a + r;
        while (r < i2) {
            r = t(bArr, r, v43Var);
            qlzVar.b(eac.c(v43Var.b));
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.m();
    }

    public static int n(byte[] bArr, int i, oqw oqwVar, v43 v43Var) {
        o5w o5wVar = (o5w) oqwVar;
        int r = r(bArr, i, v43Var);
        int i2 = v43Var.a + r;
        while (r < i2) {
            r = r(bArr, r, v43Var);
            o5wVar.b(v43Var.a);
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.m();
    }

    public static int o(byte[] bArr, int i, v43 v43Var) {
        int r = r(bArr, i, v43Var);
        int i2 = v43Var.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.i();
        }
        if (i2 == 0) {
            v43Var.c = "";
            return r;
        }
        v43Var.c = new String(bArr, r, i2, rqw.a);
        return r + i2;
    }

    public static int p(int i, byte[] bArr, int i2, int i3, t tVar, v43 v43Var) {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.c();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int t = t(bArr, i2, v43Var);
            tVar.f(i, Long.valueOf(v43Var.b));
            return t;
        }
        if (i4 == 1) {
            tVar.f(i, Long.valueOf(c(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int r = r(bArr, i2, v43Var);
            int i5 = v43Var.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.i();
            }
            if (i5 > bArr.length - r) {
                throw InvalidProtocolBufferException.m();
            }
            if (i5 == 0) {
                tVar.f(i, ByteString.a);
            } else {
                tVar.f(i, ByteString.f(r, i5, bArr));
            }
            return r + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            tVar.f(i, Integer.valueOf(b(i2, bArr)));
            return i2 + 4;
        }
        t tVar2 = new t();
        int i6 = (i & (-8)) | 4;
        int i7 = v43Var.d + 1;
        v43Var.d = i7;
        if (i7 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int r2 = r(bArr, i2, v43Var);
            i8 = v43Var.a;
            if (i8 == i6) {
                i2 = r2;
                break;
            }
            i2 = p(i8, bArr, r2, i3, tVar2, v43Var);
        }
        v43Var.d--;
        if (i2 > i3 || i8 != i6) {
            throw InvalidProtocolBufferException.j();
        }
        tVar.f(i, tVar2);
        return i2;
    }

    public static int q(int i, byte[] bArr, int i2, v43 v43Var) {
        int i3 = i & HProv.PP_VERSION_TIMESTAMP;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            v43Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            v43Var.a = i5 | (b2 << PKIBody._CCR);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            v43Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            v43Var.a = i9 | (b4 << DerValue.tag_UniversalString);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                v43Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int r(byte[] bArr, int i, v43 v43Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return q(b, bArr, i2, v43Var);
        }
        v43Var.a = b;
        return i2;
    }

    public static int s(int i, byte[] bArr, int i2, int i3, oqw oqwVar, v43 v43Var) {
        o5w o5wVar = (o5w) oqwVar;
        int r = r(bArr, i2, v43Var);
        o5wVar.b(v43Var.a);
        while (r < i3) {
            int r2 = r(bArr, r, v43Var);
            if (i != v43Var.a) {
                break;
            }
            r = r(bArr, r2, v43Var);
            o5wVar.b(v43Var.a);
        }
        return r;
    }

    public static int t(byte[] bArr, int i, v43 v43Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            v43Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        v43Var.b = j2;
        return i3;
    }

    public static int u(Object obj, som0 som0Var, byte[] bArr, int i, int i2, int i3, v43 v43Var) {
        p pVar = (p) som0Var;
        int i4 = v43Var.d + 1;
        v43Var.d = i4;
        if (i4 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int F = pVar.F(obj, bArr, i, i2, i3, v43Var);
        v43Var.d--;
        v43Var.c = obj;
        return F;
    }

    public static int v(Object obj, som0 som0Var, byte[] bArr, int i, int i2, v43 v43Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = q(i4, bArr, i3, v43Var);
            i4 = v43Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw InvalidProtocolBufferException.m();
        }
        int i6 = v43Var.d + 1;
        v43Var.d = i6;
        if (i6 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        som0Var.i(obj, bArr, i5, i7, v43Var);
        v43Var.d--;
        v43Var.c = obj;
        return i7;
    }

    public static int w(int i, byte[] bArr, int i2, int i3, v43 v43Var) {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.c();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return t(bArr, i2, v43Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return r(bArr, i2, v43Var) + v43Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.c();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = r(bArr, i2, v43Var);
            i6 = v43Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = w(i6, bArr, i2, i3, v43Var);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.j();
        }
        return i2;
    }
}
