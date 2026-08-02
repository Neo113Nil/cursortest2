package com.google.crypto.tink.shaded.protobuf;

import defpackage.n5w;
import defpackage.nqw;
import defpackage.qqw;
import defpackage.rom0;
import defpackage.w43;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes.dex */
public abstract class c {
    public static int a(byte[] bArr, int i, w43 w43Var) {
        int i2 = i(bArr, i, w43Var);
        int i3 = w43Var.a;
        if (i3 < 0) {
            throw InvalidProtocolBufferException.h();
        }
        if (i3 > bArr.length - i2) {
            throw InvalidProtocolBufferException.l();
        }
        if (i3 == 0) {
            w43Var.c = ByteString.a;
            return i2;
        }
        w43Var.c = ByteString.f(i2, i3, bArr);
        return i2 + i3;
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long c(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int d(rom0 rom0Var, int i, byte[] bArr, int i2, int i3, nqw nqwVar, w43 w43Var) {
        Object d = rom0Var.d();
        rom0 rom0Var2 = rom0Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        w43 w43Var2 = w43Var;
        int l = l(d, rom0Var2, bArr2, i2, i4, w43Var2);
        rom0Var2.c(d);
        w43Var2.c = d;
        nqwVar.add(d);
        while (l < i4) {
            w43 w43Var3 = w43Var2;
            int i5 = i4;
            int i6 = i(bArr2, l, w43Var3);
            if (i != w43Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            rom0 rom0Var3 = rom0Var2;
            Object d2 = rom0Var3.d();
            l = l(d2, rom0Var3, bArr3, i6, i5, w43Var3);
            rom0Var2 = rom0Var3;
            bArr2 = bArr3;
            i4 = i5;
            w43Var2 = w43Var3;
            rom0Var2.c(d2);
            w43Var2.c = d2;
            nqwVar.add(d2);
        }
        return l;
    }

    public static int e(byte[] bArr, int i, w43 w43Var) {
        int i2 = i(bArr, i, w43Var);
        int i3 = w43Var.a;
        if (i3 < 0) {
            throw InvalidProtocolBufferException.h();
        }
        if (i3 == 0) {
            w43Var.c = "";
            return i2;
        }
        w43Var.c = new String(bArr, i2, i3, qqw.a);
        return i2 + i3;
    }

    public static int f(byte[] bArr, int i, w43 w43Var) {
        int i2 = i(bArr, i, w43Var);
        int i3 = w43Var.a;
        if (i3 < 0) {
            throw InvalidProtocolBufferException.h();
        }
        if (i3 == 0) {
            w43Var.c = "";
            return i2;
        }
        w43Var.c = u.a.s(i2, i3, bArr);
        return i2 + i3;
    }

    public static int g(int i, byte[] bArr, int i2, int i3, r rVar, w43 w43Var) {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int k = k(bArr, i2, w43Var);
            rVar.d(i, Long.valueOf(w43Var.b));
            return k;
        }
        if (i4 == 1) {
            rVar.d(i, Long.valueOf(c(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int i5 = i(bArr, i2, w43Var);
            int i6 = w43Var.a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.h();
            }
            if (i6 > bArr.length - i5) {
                throw InvalidProtocolBufferException.l();
            }
            if (i6 == 0) {
                rVar.d(i, ByteString.a);
            } else {
                rVar.d(i, ByteString.f(i5, i6, bArr));
            }
            return i5 + i6;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            rVar.d(i, Integer.valueOf(b(i2, bArr)));
            return i2 + 4;
        }
        r c = r.c();
        int i7 = (i & (-8)) | 4;
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int i9 = i(bArr, i2, w43Var);
            i8 = w43Var.a;
            if (i8 == i7) {
                i2 = i9;
                break;
            }
            i2 = g(i8, bArr, i9, i3, c, w43Var);
        }
        if (i2 > i3 || i8 != i7) {
            throw InvalidProtocolBufferException.i();
        }
        rVar.d(i, c);
        return i2;
    }

    public static int h(int i, byte[] bArr, int i2, w43 w43Var) {
        int i3 = i & HProv.PP_VERSION_TIMESTAMP;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            w43Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            w43Var.a = i5 | (b2 << PKIBody._CCR);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            w43Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            w43Var.a = i9 | (b4 << DerValue.tag_UniversalString);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                w43Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int i(byte[] bArr, int i, w43 w43Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return h(b, bArr, i2, w43Var);
        }
        w43Var.a = b;
        return i2;
    }

    public static int j(int i, byte[] bArr, int i2, int i3, nqw nqwVar, w43 w43Var) {
        n5w n5wVar = (n5w) nqwVar;
        int i4 = i(bArr, i2, w43Var);
        n5wVar.b(w43Var.a);
        while (i4 < i3) {
            int i5 = i(bArr, i4, w43Var);
            if (i != w43Var.a) {
                break;
            }
            i4 = i(bArr, i5, w43Var);
            n5wVar.b(w43Var.a);
        }
        return i4;
    }

    public static int k(byte[] bArr, int i, w43 w43Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            w43Var.b = j;
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
        w43Var.b = j2;
        return i3;
    }

    public static int l(Object obj, rom0 rom0Var, byte[] bArr, int i, int i2, w43 w43Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = h(i4, bArr, i3, w43Var);
            i4 = w43Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw InvalidProtocolBufferException.l();
        }
        int i6 = i5 + i4;
        rom0Var.h(obj, bArr, i5, i6, w43Var);
        w43Var.c = obj;
        return i6;
    }

    public static int m(int i, byte[] bArr, int i2, int i3, w43 w43Var) {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return k(bArr, i2, w43Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return i(bArr, i2, w43Var) + w43Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.b();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = i(bArr, i2, w43Var);
            i6 = w43Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = m(i6, bArr, i2, i3, w43Var);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.i();
        }
        return i2;
    }
}
