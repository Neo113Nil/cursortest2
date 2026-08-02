package com.objsys.asn1j.runtime;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.ny61;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public class Asn1Util {
    private static final byte[] base64EncodeTable = {65, 66, 67, 68, 69, Alerts.alert_protocol_version, Alerts.alert_insufficient_security, 72, 73, 74, 75, 76, 77, 78, 79, Alerts.alert_internal_error, 81, 82, 83, 84, 85, 86, 87, 88, 89, Alerts.alert_user_canceled, 97, 98, 99, Alerts.alert_no_renegotiation, 101, 102, 103, 104, 105, 106, 107, 108, 109, Alerts.alert_unsupported_extension, Alerts.alert_certificate_unobtainable, Alerts.alert_unrecognized_name, Alerts.alert_bad_certificate_status_response, Alerts.alert_bad_certificate_hash_value, 115, 116, 117, 118, 119, Alerts.alert_no_application_protocol, 121, 122, 48, 49, Alerts.alert_decode_error, Alerts.alert_decrypt_error, 52, 53, 54, 55, 56, 57, Alerts.alert_unsupported_certificate, Alerts.alert_illegal_parameter};
    private static final byte[] base64DecodeTable = {-1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, Alerts.alert_export_restriction, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, PKIBody._KRP, 12, PKIBody._RP, PKIBody._CCR, PKIBody._CCP, PKIBody._CKUANN, PKIBody._CANN, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, DerValue.tag_GeneralString, DerValue.tag_UniversalString, 29, 30, 31, BlobHeaderStructure.BLOB_VERSION, BlobHeaderStructure.KEXP15_BLOB_VERSION, 34, 35, 36, 37, 38, 39, Alerts.alert_handshake_failure, Alerts.alert_no_certificate, Alerts.alert_bad_certificate, Alerts.alert_unsupported_certificate, Alerts.alert_certificate_revoked, Alerts.alert_certificate_expired, Alerts.alert_certificate_unknown, Alerts.alert_illegal_parameter, 48, 49, Alerts.alert_decode_error, Alerts.alert_decrypt_error, -1, -1, -1, -1, -1};

    public static String BCDToString(byte[] bArr) {
        byte b;
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        int i = 0;
        for (int i2 = 0; i2 < bArr.length * 2; i2++) {
            if (i2 % 2 == 0) {
                b = (byte) (bArr[i] & PKIBody._CCP);
            } else {
                b = (byte) (bArr[i] >>> 4);
                i++;
            }
            if (b == 15) {
                break;
            }
            stringBuffer.append((char) (b < 10 ? b + 48 : b + 55));
        }
        return stringBuffer.toString();
    }

    public static byte[] decodeBase64Array(byte[] bArr) {
        int i;
        int i2;
        int length = bArr.length / 4;
        if (length * 4 != bArr.length) {
            ny61.g("The encoded data length must be a multiple of four.");
            return null;
        }
        if (bArr.length != 0) {
            if (bArr[bArr.length - 1] == 61) {
                i = length - 1;
                i2 = 1;
            } else {
                i = length;
                i2 = 0;
            }
            if (bArr[bArr.length - 2] == 61) {
                i2++;
            }
        } else {
            i = length;
            i2 = 0;
        }
        byte[] bArr2 = new byte[(length * 3) - i2];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int decodeBase64Char = decodeBase64Char(bArr[i3]);
            int decodeBase64Char2 = decodeBase64Char(bArr[i3 + 1]);
            int i6 = i3 + 3;
            int decodeBase64Char3 = decodeBase64Char(bArr[i3 + 2]);
            i3 += 4;
            int decodeBase64Char4 = decodeBase64Char(bArr[i6]);
            bArr2[i4] = (byte) ((decodeBase64Char << 2) | (decodeBase64Char2 >> 4));
            int i7 = i4 + 2;
            bArr2[i4 + 1] = (byte) ((decodeBase64Char2 << 4) | (decodeBase64Char3 >> 2));
            i4 += 3;
            bArr2[i7] = (byte) ((decodeBase64Char3 << 6) | decodeBase64Char4);
        }
        if (i2 != 0) {
            int i8 = i3 + 1;
            int decodeBase64Char5 = decodeBase64Char(bArr[i3]);
            int i9 = i3 + 2;
            int decodeBase64Char6 = decodeBase64Char(bArr[i8]);
            int i10 = i4 + 1;
            bArr2[i4] = (byte) ((decodeBase64Char5 << 2) | (decodeBase64Char6 >> 4));
            if (i2 == 1) {
                bArr2[i10] = (byte) ((decodeBase64Char(bArr[i9]) >> 2) | (decodeBase64Char6 << 4));
            }
        }
        return bArr2;
    }

    private static int decodeBase64Char(byte b) {
        byte b2 = b < 128 ? base64DecodeTable[b - 40] : (byte) -1;
        if (b2 >= 0) {
            return b2;
        }
        StringBuffer stringBuffer = new StringBuffer("Illegal character ");
        stringBuffer.append((int) b);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static byte[] encodeBase64Array(byte[] bArr) {
        int length = bArr.length / 3;
        int length2 = bArr.length - (length * 3);
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = bArr[i] & 255;
            int i5 = i + 2;
            int i6 = bArr[i + 1] & 255;
            i += 3;
            byte b = bArr[i5];
            byte[] bArr3 = base64EncodeTable;
            bArr2[i2] = bArr3[i4 >> 2];
            bArr2[i2 + 1] = bArr3[((i4 << 4) & 63) | (i6 >> 4)];
            int i7 = i2 + 3;
            bArr2[i2 + 2] = bArr3[((i6 << 2) & 63) | ((b & 255) >> 6)];
            i2 += 4;
            bArr2[i7] = bArr3[b & 63];
        }
        if (length2 != 0) {
            int i8 = i + 1;
            int i9 = bArr[i] & 255;
            int i10 = i2 + 1;
            byte[] bArr4 = base64EncodeTable;
            bArr2[i2] = bArr4[i9 >> 2];
            if (length2 == 1) {
                bArr2[i10] = bArr4[(i9 << 4) & 63];
                bArr2[i2 + 2] = 61;
                bArr2[i2 + 3] = 61;
                return bArr2;
            }
            int i11 = bArr[i8] & 255;
            bArr2[i10] = bArr4[((i9 << 4) & 63) | (i11 >> 4)];
            bArr2[i2 + 2] = bArr4[(i11 << 2) & 63];
            bArr2[i2 + 3] = 61;
        }
        return bArr2;
    }

    public static int getBytesCount(long j) {
        return Asn1RunTime.getLongBytesCount(j);
    }

    public static int getUlongBytesCount(long j) {
        return Asn1RunTime.getUlongBytesCount(j);
    }

    public static double log2(double d) {
        return Math.log(d) / Math.log(2.0d);
    }

    public static byte[] stringToBCD(String str) throws Asn1ValueParseException {
        byte[] bArr = new byte[(str.length() + 1) / 2];
        int i = 0;
        int i2 = 0;
        byte b = 0;
        while (i < str.length()) {
            char upperCase = Character.toUpperCase(str.charAt(i));
            boolean isDigit = Character.isDigit(upperCase);
            if (!isDigit && (upperCase < 'A' || upperCase >= 'F')) {
                throw new Asn1ValueParseException(str);
            }
            if (i % 2 != 0) {
                b = (byte) (b | (((byte) (isDigit ? upperCase - '0' : upperCase - '7')) << 4));
                bArr[i2] = b;
                i2++;
            } else {
                b = (byte) (isDigit ? upperCase - '0' : upperCase - '7');
            }
            i++;
        }
        if (i % 2 != 0) {
            bArr[i2] = (byte) (b | 240);
        }
        return bArr;
    }

    public static StringBuffer toHexString(byte b, StringBuffer stringBuffer) {
        stringBuffer.ensureCapacity(4);
        String hexString = Integer.toHexString(b);
        int length = hexString.length();
        if (length < 2) {
            stringBuffer.append(MoneyInputEditView.DEFAULT_VALUE);
            stringBuffer.append(hexString);
            return stringBuffer;
        }
        if (length <= 2) {
            stringBuffer.append(hexString);
            return stringBuffer;
        }
        stringBuffer.append(hexString.charAt(length - 2));
        stringBuffer.append(hexString.charAt(length - 1));
        return stringBuffer;
    }

    public static String toHexString(byte b) {
        return toHexString(b, new StringBuffer(4)).toString();
    }

    public static String toHexString(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 4);
        for (int i3 = 0; i3 < i2; i3++) {
            stringBuffer.append(toHexString(bArr[i + i3]));
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }
}
