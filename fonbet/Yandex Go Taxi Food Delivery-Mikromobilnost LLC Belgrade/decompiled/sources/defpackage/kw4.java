package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public class kw4 {
    public final byte[] a = {65, 66, 67, 68, 69, Alerts.alert_protocol_version, Alerts.alert_insufficient_security, 72, 73, 74, 75, 76, 77, 78, 79, Alerts.alert_internal_error, 81, 82, 83, 84, 85, 86, 87, 88, 89, Alerts.alert_user_canceled, 97, 98, 99, Alerts.alert_no_renegotiation, 101, 102, 103, 104, 105, 106, 107, 108, 109, Alerts.alert_unsupported_extension, Alerts.alert_certificate_unobtainable, Alerts.alert_unrecognized_name, Alerts.alert_bad_certificate_status_response, Alerts.alert_bad_certificate_hash_value, 115, 116, 117, 118, 119, Alerts.alert_no_application_protocol, 121, 122, 48, 49, Alerts.alert_decode_error, Alerts.alert_decrypt_error, 52, 53, 54, 55, 56, 57, Alerts.alert_unsupported_certificate, Alerts.alert_illegal_parameter};
    public final byte[] b;

    public kw4() {
        byte[] bArr = new byte[128];
        this.b = bArr;
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            bArr[i2] = -1;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i >= bArr2.length) {
                return;
            }
            bArr[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public static boolean c(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public static int d(int i, int i2, String str) {
        while (i < i2 && c(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public final int a(OutputStream outputStream, String str) {
        char c;
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && c(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i = length;
        int i2 = 0;
        while (true) {
            c = 4;
            if (i <= 0 || i2 == 4) {
                break;
            }
            if (!c(str.charAt(i - 1))) {
                i2++;
            }
            i--;
        }
        int d = d(0, i, str);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            byte[] bArr2 = this.b;
            if (d >= i) {
                if (i3 > 0) {
                    outputStream.write(bArr, 0, i3);
                }
                int d2 = d(d, length, str);
                int d3 = d(d2 + 1, length, str);
                int d4 = d(d3 + 1, length, str);
                int d5 = d(d4 + 1, length, str);
                char charAt = str.charAt(d2);
                char charAt2 = str.charAt(d3);
                char charAt3 = str.charAt(d4);
                char charAt4 = str.charAt(d5);
                int i5 = 2;
                if (charAt3 == '=') {
                    if (charAt4 != '=') {
                        ny61.v("invalid characters encountered at end of base64 data");
                        return 0;
                    }
                    byte b = bArr2[charAt];
                    byte b2 = bArr2[charAt2];
                    if ((b | b2) < 0) {
                        ny61.v("invalid characters encountered at end of base64 data");
                        return 0;
                    }
                    outputStream.write((b << 2) | (b2 >> 4));
                    i5 = 1;
                } else if (charAt4 == '=') {
                    byte b3 = bArr2[charAt];
                    byte b4 = bArr2[charAt2];
                    byte b5 = bArr2[charAt3];
                    if ((b3 | b4 | b5) < 0) {
                        ny61.v("invalid characters encountered at end of base64 data");
                        return 0;
                    }
                    outputStream.write((b3 << 2) | (b4 >> 4));
                    outputStream.write((b4 << 4) | (b5 >> 2));
                } else {
                    byte b6 = bArr2[charAt];
                    byte b7 = bArr2[charAt2];
                    byte b8 = bArr2[charAt3];
                    byte b9 = bArr2[charAt4];
                    if ((b6 | b7 | b8 | b9) < 0) {
                        ny61.v("invalid characters encountered at end of base64 data");
                        return 0;
                    }
                    outputStream.write((b6 << 2) | (b7 >> 4));
                    outputStream.write((b7 << 4) | (b8 >> 2));
                    outputStream.write(b9 | (b8 << 6));
                    i5 = 3;
                }
                return i4 + i5;
            }
            int i6 = d + 1;
            byte b10 = bArr2[str.charAt(d)];
            int d6 = d(i6, i, str);
            int i7 = d6 + 1;
            byte b11 = bArr2[str.charAt(d6)];
            int d7 = d(i7, i, str);
            int i8 = d7 + 1;
            byte b12 = bArr2[str.charAt(d7)];
            int d8 = d(i8, i, str);
            char c2 = c;
            int i9 = d8 + 1;
            byte b13 = bArr2[str.charAt(d8)];
            if ((b10 | b11 | b12 | b13) < 0) {
                ny61.v("invalid characters encountered in base64 data");
                return 0;
            }
            bArr[i3] = (byte) ((b10 << 2) | (b11 >> 4));
            int i10 = i3 + 2;
            bArr[i3 + 1] = (byte) ((b11 << 4) | (b12 >> 2));
            i3 += 3;
            bArr[i10] = (byte) (b13 | (b12 << 6));
            i4 += 3;
            if (i3 == 54) {
                outputStream.write(bArr);
                i3 = 0;
            }
            d = d(i9, i, str);
            c = c2;
        }
    }

    public final int b(int i, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        byte[] bArr2;
        if (i < 0) {
            return 0;
        }
        byte[] bArr3 = new byte[72];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int min = Math.min(54, i2);
            int i4 = i3 + min;
            int i5 = i4 - 2;
            int i6 = 0;
            int i7 = i3;
            while (true) {
                bArr2 = this.a;
                if (i7 >= i5) {
                    break;
                }
                byte b = bArr[i7];
                int i8 = i7 + 2;
                int i9 = bArr[i7 + 1] & 255;
                i7 += 3;
                byte b2 = bArr[i8];
                bArr3[i6] = bArr2[(b >>> 2) & 63];
                bArr3[i6 + 1] = bArr2[((b << 4) | (i9 >>> 4)) & 63];
                int i10 = i6 + 3;
                bArr3[i6 + 2] = bArr2[((i9 << 2) | ((b2 & 255) >>> 6)) & 63];
                i6 += 4;
                bArr3[i10] = bArr2[b2 & 63];
            }
            int i11 = min - (i7 - i3);
            if (i11 == 1) {
                int i12 = bArr[i7] & 255;
                bArr3[i6] = bArr2[(i12 >>> 2) & 63];
                bArr3[i6 + 1] = bArr2[(i12 << 4) & 63];
                int i13 = i6 + 3;
                bArr3[i6 + 2] = 61;
                i6 += 4;
                bArr3[i13] = 61;
            } else if (i11 == 2) {
                int i14 = i7 + 1;
                int i15 = bArr[i7] & 255;
                int i16 = bArr[i14] & 255;
                bArr3[i6] = bArr2[(i15 >>> 2) & 63];
                bArr3[i6 + 1] = bArr2[((i15 << 4) | (i16 >>> 4)) & 63];
                int i17 = i6 + 3;
                bArr3[i6 + 2] = bArr2[(i16 << 2) & 63];
                i6 += 4;
                bArr3[i17] = 61;
            }
            byteArrayOutputStream.write(bArr3, 0, i6);
            i2 -= min;
            i3 = i4;
        }
        return ((i + 2) / 3) * 4;
    }
}
