package com.objsys.asn1j.runtime;

import defpackage.g8e;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes11.dex */
public class Asn1Value {
    private static byte[] allocBitArray(int i) {
        int i2 = i / 8;
        if (i % 8 != 0) {
            i2++;
        }
        return new byte[i2];
    }

    public static byte[] parseString(String str, IntHolder intHolder) throws Asn1ValueParseException {
        int i;
        byte[] bArr;
        int i2 = 0;
        char charAt = str.charAt(0);
        if (charAt == '\'' || charAt == '\"') {
            int i3 = 1;
            if (str.endsWith("B")) {
                int length = str.length() - 3;
                byte[] allocBitArray = allocBitArray(length);
                int i4 = 0;
                int i5 = 0;
                int i6 = 128;
                while (i3 < str.length()) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 == '1') {
                        i4 |= i6;
                    } else {
                        if (charAt2 == charAt) {
                            break;
                        }
                        if (charAt2 != '0') {
                            throw new Asn1ValueParseException(str, i3);
                        }
                    }
                    i6 >>= 1;
                    if (i6 == 0) {
                        allocBitArray[i5] = (byte) i4;
                        i4 = 0;
                        i5++;
                        i6 = 128;
                    }
                    i3++;
                }
                if (i6 != 128) {
                    allocBitArray[i5] = (byte) i4;
                }
                i = length;
                bArr = allocBitArray;
            } else if (str.endsWith(CA20Status.STATUS_CERTIFICATE_H)) {
                StringBuffer stringBuffer = new StringBuffer();
                int length2 = (str.length() - 3) * 4;
                byte[] allocBitArray2 = allocBitArray(length2);
                stringBuffer.setLength(2);
                char c = 0;
                int i7 = 0;
                for (int i8 = 1; i8 < str.length() && c != charAt; i8 += 2) {
                    int i9 = i8 + 1;
                    char charAt3 = str.charAt(i8);
                    if (charAt3 != charAt) {
                        stringBuffer.setCharAt(0, charAt3);
                        c = i9 >= str.length() ? '0' : str.charAt(i9);
                        stringBuffer.setCharAt(1, c == charAt ? '0' : c);
                        allocBitArray2[i7] = (byte) Integer.parseInt(stringBuffer.toString(), 16);
                        i7++;
                    } else {
                        c = charAt3;
                    }
                }
                i = length2;
                bArr = allocBitArray2;
            } else {
                if (g8e.a(1, str) != charAt) {
                    throw new Asn1ValueParseException(str, str.length() - 1);
                }
                int length3 = (str.length() - 2) * 8;
                byte[] allocBitArray3 = allocBitArray(length3);
                while (i3 < str.length() && i2 != charAt) {
                    i2 = str.charAt(i3);
                    if (i2 != charAt) {
                        allocBitArray3[i3 - 1] = (byte) i2;
                    }
                    i3++;
                }
                i = length3;
                bArr = allocBitArray3;
            }
        } else {
            i = str.length() * 8;
            bArr = allocBitArray(i);
            while (i2 < str.length()) {
                bArr[i2] = (byte) str.charAt(i2);
                i2++;
            }
        }
        if (intHolder != null) {
            intHolder.value = i;
        }
        return bArr;
    }

    public static byte[] parseString(String str) throws Asn1ValueParseException {
        return parseString(str, null);
    }
}
