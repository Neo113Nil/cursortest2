package defpackage;

import defpackage.yp6;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import skeletor.render.SkeletonContentView;

/* loaded from: classes9.dex */
public abstract class j {
    public static final yp6.a a = new yp6.a();
    public static final int b = -1234567890;

    public static final boolean a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder w = unr0.w(j, "size=", " offset=");
            w.append(j2);
            w.append(" byteCount=");
            w.append(j3);
            throw new ArrayIndexOutOfBoundsException(w.toString());
        }
    }

    public static final int c(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long d(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((SkeletonContentView.HUNDRED_PERCENTS_ALPHA & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final String e(byte b2) {
        char[] cArr = bb1.b;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & PKIBody._CCP]});
    }

    public static final String f(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = bb1.b;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        return cvu0.o(cArr2, i2, 8);
    }
}
