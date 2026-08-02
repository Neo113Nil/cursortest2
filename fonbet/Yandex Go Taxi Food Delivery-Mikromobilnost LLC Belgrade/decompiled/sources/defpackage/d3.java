package defpackage;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public final class d3 extends b3 {
    public static final p1 c = new p1(16, d3.class);
    public final String a;
    public byte[] b;

    public d3(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        BigInteger bigInteger = null;
        long j = 0;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                long j2 = j + (b & Byte.MAX_VALUE);
                if ((b & DerValue.TAG_CONTEXT) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & DerValue.TAG_CONTEXT) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.a = stringBuffer.toString();
        this.b = bArr;
    }

    public static boolean x(int i, String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i3 < i) {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                return true;
            }
            char charAt = str.charAt(i3);
            if (charAt != '.') {
                if ('0' > charAt || charAt > '9') {
                    break;
                }
                i2++;
                length = i3;
            } else {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                i2 = 0;
                length = i3;
            }
        }
        return false;
    }

    public static void y(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & HProv.PP_VERSION_TIMESTAMP);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public static void z(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (this == b3Var) {
            return true;
        }
        if (b3Var instanceof d3) {
            return this.a.equals(((d3) b3Var).a);
        }
        return false;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.I(13, u(), z);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(u().length, z);
    }

    public final String toString() {
        return this.a;
    }

    public final synchronized byte[] u() {
        String substring;
        try {
            if (this.b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                String str = this.a;
                int i = 0;
                while (i != -1) {
                    if (i == -1) {
                        substring = null;
                    } else {
                        int indexOf = str.indexOf(46, i);
                        if (indexOf == -1) {
                            substring = str.substring(i);
                            i = -1;
                        } else {
                            substring = str.substring(i, indexOf);
                            i = indexOf + 1;
                        }
                    }
                    if (substring.length() <= 18) {
                        y(byteArrayOutputStream, Long.parseLong(substring));
                    } else {
                        z(byteArrayOutputStream, new BigInteger(substring));
                    }
                }
                this.b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
