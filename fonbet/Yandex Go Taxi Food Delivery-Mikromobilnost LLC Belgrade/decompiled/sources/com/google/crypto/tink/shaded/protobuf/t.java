package com.google.crypto.tink.shaded.protobuf;

import defpackage.cvw;
import defpackage.ny61;
import defpackage.qqw;
import defpackage.s8o;
import defpackage.y321;
import java.nio.charset.Charset;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes.dex */
public final class t extends cvw {
    public final /* synthetic */ int f;

    public /* synthetic */ t(int i) {
        this.f = i;
    }

    public static int m0(int i, int i2, long j, byte[] bArr) {
        if (i2 == 0) {
            cvw cvwVar = u.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return u.c(i, y321.g(j, bArr));
        }
        if (i2 == 2) {
            return u.d(i, y321.g(j, bArr), y321.g(j + 1, bArr));
        }
        ny61.w();
        return 0;
    }

    @Override // defpackage.cvw
    public final int T(int i, int i2, byte[] bArr) {
        long j;
        int i3;
        long j2;
        int i4 = i;
        switch (this.f) {
            case 0:
                break;
            default:
                if ((i4 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)));
                }
                long j3 = i4;
                int i5 = (int) (i2 - j3);
                long j4 = 1;
                if (i5 < 16) {
                    j = j3;
                    j2 = 1;
                    i3 = 0;
                } else {
                    int i6 = 8 - (((int) j3) & 7);
                    j = j3;
                    i3 = 0;
                    long j5 = j;
                    while (true) {
                        if (i3 < i6) {
                            long j6 = j5 + 1;
                            if (y321.g(j5, bArr) < 0) {
                                j2 = 1;
                            } else {
                                i3++;
                                j5 = j6;
                            }
                        } else {
                            while (true) {
                                int i7 = i3 + 8;
                                if (i7 <= i5) {
                                    j2 = j4;
                                    if ((y321.c.h(y321.f + j5, bArr) & (-9187201950435737472L)) == 0) {
                                        j5 += 8;
                                        j4 = j2;
                                        i3 = i7;
                                    }
                                } else {
                                    j2 = j4;
                                }
                            }
                            while (true) {
                                if (i3 < i5) {
                                    long j7 = j5 + j2;
                                    if (y321.g(j5, bArr) >= 0) {
                                        i3++;
                                        j5 = j7;
                                    }
                                } else {
                                    i3 = i5;
                                }
                            }
                        }
                    }
                }
                int i8 = i5 - i3;
                long j8 = j + i3;
                while (true) {
                    byte b = 0;
                    while (true) {
                        if (i8 > 0) {
                            long j9 = j8 + j2;
                            byte g = y321.g(j8, bArr);
                            if (g >= 0) {
                                i8--;
                                j8 = j9;
                                b = g;
                            } else {
                                j8 = j9;
                                b = g;
                            }
                        }
                    }
                    if (i8 == 0) {
                        return 0;
                    }
                    int i9 = i8 - 1;
                    if (b < -32) {
                        if (i9 == 0) {
                            return b;
                        }
                        i8 -= 2;
                        if (b < -62) {
                            return -1;
                        }
                        long j10 = j8 + j2;
                        if (y321.g(j8, bArr) > -65) {
                            return -1;
                        }
                        j8 = j10;
                    } else if (b < -16) {
                        if (i9 < 2) {
                            return m0(b, i9, j8, bArr);
                        }
                        i8 -= 3;
                        long j11 = j8 + j2;
                        byte g2 = y321.g(j8, bArr);
                        if (g2 > -65) {
                            return -1;
                        }
                        if (b == -32 && g2 < -96) {
                            return -1;
                        }
                        if (b == -19 && g2 >= -96) {
                            return -1;
                        }
                        j8 += 2;
                        if (y321.g(j11, bArr) > -65) {
                            return -1;
                        }
                    } else {
                        if (i9 < 3) {
                            return m0(b, i9, j8, bArr);
                        }
                        i8 -= 4;
                        long j12 = j8 + j2;
                        byte g3 = y321.g(j8, bArr);
                        if (g3 > -65) {
                            return -1;
                        }
                        if ((((g3 + Alerts.alert_unrecognized_name) + (b << DerValue.tag_UniversalString)) >> 30) != 0) {
                            return -1;
                        }
                        long j13 = j8 + 2;
                        if (y321.g(j12, bArr) > -65) {
                            return -1;
                        }
                        j8 += 3;
                        if (y321.g(j13, bArr) > -65) {
                            return -1;
                        }
                    }
                }
        }
        while (i4 < i2 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 < i2) {
            while (i4 < i2) {
                int i10 = i4 + 1;
                byte b2 = bArr[i4];
                if (b2 >= 0) {
                    i4 = i10;
                } else if (b2 < -32) {
                    if (i10 >= i2) {
                        return b2;
                    }
                    if (b2 < -62) {
                        return -1;
                    }
                    i4 += 2;
                    if (bArr[i10] > -65) {
                        return -1;
                    }
                } else if (b2 < -16) {
                    if (i10 >= i2 - 1) {
                        return u.a(i10, i2, bArr);
                    }
                    int i11 = i4 + 2;
                    byte b3 = bArr[i10];
                    if (b3 > -65) {
                        return -1;
                    }
                    if (b2 == -32 && b3 < -96) {
                        return -1;
                    }
                    if (b2 == -19 && b3 >= -96) {
                        return -1;
                    }
                    i4 += 3;
                    if (bArr[i11] > -65) {
                        return -1;
                    }
                } else {
                    if (i10 >= i2 - 2) {
                        return u.a(i10, i2, bArr);
                    }
                    int i12 = i4 + 2;
                    byte b4 = bArr[i10];
                    if (b4 > -65) {
                        return -1;
                    }
                    if ((((b4 + Alerts.alert_unrecognized_name) + (b2 << DerValue.tag_UniversalString)) >> 30) != 0) {
                        return -1;
                    }
                    int i13 = i4 + 3;
                    if (bArr[i12] > -65) {
                        return -1;
                    }
                    i4 += 4;
                    if (bArr[i13] > -65) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // defpackage.cvw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String s(int i, int i2, byte[] bArr) {
        switch (this.f) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (b < 0) {
                        while (i < i3) {
                            int i5 = i + 1;
                            byte b2 = bArr[i];
                            if (b2 >= 0) {
                                int i6 = i4 + 1;
                                cArr[i4] = (char) b2;
                                while (i5 < i3) {
                                    byte b3 = bArr[i5];
                                    if (b3 >= 0) {
                                        i5++;
                                        cArr[i6] = (char) b3;
                                        i6++;
                                    } else {
                                        i4 = i6;
                                        i = i5;
                                    }
                                }
                                i4 = i6;
                                i = i5;
                            } else if (b2 < -32) {
                                if (i5 >= i3) {
                                    throw InvalidProtocolBufferException.c();
                                }
                                i += 2;
                                byte b4 = bArr[i5];
                                int i7 = i4 + 1;
                                if (b2 < -62 || s8o.D(b4)) {
                                    throw InvalidProtocolBufferException.c();
                                }
                                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                                i4 = i7;
                            } else {
                                if (b2 >= -16) {
                                    if (i5 >= i3 - 2) {
                                        throw InvalidProtocolBufferException.c();
                                    }
                                    byte b5 = bArr[i5];
                                    int i8 = i + 3;
                                    byte b6 = bArr[i + 2];
                                    i += 4;
                                    byte b7 = bArr[i8];
                                    int i9 = i4 + 1;
                                    if (!s8o.D(b5)) {
                                        if ((((b5 + Alerts.alert_unrecognized_name) + (b2 << DerValue.tag_UniversalString)) >> 30) == 0 && !s8o.D(b6) && !s8o.D(b7)) {
                                            int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                            cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i4 += 2;
                                        }
                                    }
                                    throw InvalidProtocolBufferException.c();
                                }
                                if (i5 >= i3 - 1) {
                                    throw InvalidProtocolBufferException.c();
                                }
                                int i11 = i + 2;
                                byte b8 = bArr[i5];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i4 + 1;
                                if (s8o.D(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || s8o.D(b9)))) {
                                    throw InvalidProtocolBufferException.c();
                                }
                                cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & PKIBody._CCP) << 12) | (b9 & 63));
                                i4 = i12;
                            }
                        }
                        return new String(cArr, 0, i4);
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                while (i < i3) {
                }
                return new String(cArr, 0, i4);
            default:
                Charset charset = qqw.a;
                String str = new String(bArr, i, i2, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw InvalidProtocolBufferException.c();
                }
                return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0187  */
    @Override // defpackage.cvw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(int i, int i2, String str, byte[] bArr) {
        int i3;
        char charAt;
        int i4;
        int i5;
        char charAt2;
        char c = 2048;
        char c2 = 128;
        char c3 = 55296;
        switch (this.f) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 < i6 && (charAt = str.charAt(i7)) < 128) {
                        bArr[i8] = (byte) charAt;
                        i7++;
                    }
                    if (i7 != length) {
                        return i + length;
                    }
                    int i9 = i + i7;
                    while (i7 < length) {
                        char charAt3 = str.charAt(i7);
                        if (charAt3 < 128 && i9 < i6) {
                            bArr[i9] = (byte) charAt3;
                            i9++;
                        } else if (charAt3 < 2048 && i9 <= i6 - 2) {
                            int i10 = i9 + 1;
                            bArr[i9] = (byte) ((charAt3 >>> 6) | 960);
                            i9 += 2;
                            bArr[i10] = (byte) ((charAt3 & '?') | 128);
                        } else {
                            if ((charAt3 >= 55296 && 57343 >= charAt3) || i9 > i6 - 3) {
                                if (i9 > i6 - 4) {
                                    if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i7 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i3)))) {
                                        throw new Utf8$UnpairedSurrogateException(i7, length);
                                    }
                                    ny61.l(charAt3, i9);
                                    return 0;
                                }
                                int i11 = i7 + 1;
                                if (i11 != str.length()) {
                                    char charAt4 = str.charAt(i11);
                                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                                        bArr[i9] = (byte) ((codePoint >>> 18) | PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
                                        bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i12 = i9 + 3;
                                        bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i9 += 4;
                                        bArr[i12] = (byte) ((codePoint & 63) | 128);
                                        i7 = i11;
                                        i7++;
                                    } else {
                                        i7 = i11;
                                    }
                                }
                                throw new Utf8$UnpairedSurrogateException(i7 - 1, length);
                            }
                            bArr[i9] = (byte) ((charAt3 >>> '\f') | 480);
                            int i13 = i9 + 2;
                            bArr[i9 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            i9 += 3;
                            bArr[i13] = (byte) ((charAt3 & '?') | 128);
                        }
                        i7++;
                    }
                    return i9;
                }
                if (i7 != length) {
                }
                break;
            default:
                long j = i;
                long j2 = i2 + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i14 = 0;
                while (i14 < length2 && (charAt2 = str.charAt(i14)) < 128) {
                    y321.k(bArr, j, (byte) charAt2);
                    i14++;
                    j++;
                }
                if (i14 != length2) {
                    while (i14 < length2) {
                        char charAt5 = str.charAt(i14);
                        if (charAt5 >= c2 || j >= j2) {
                            if (charAt5 >= c || j > j2 - 2) {
                                i4 = i14;
                                if ((charAt5 >= c3 && 57343 >= charAt5) || j > j2 - 3) {
                                    if (j > j2 - 4) {
                                        if (55296 <= charAt5 && charAt5 <= 57343 && ((i5 = i4 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i5)))) {
                                            throw new Utf8$UnpairedSurrogateException(i4, length2);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j);
                                    }
                                    i14 = i4 + 1;
                                    if (i14 != length2) {
                                        char charAt6 = str.charAt(i14);
                                        if (Character.isSurrogatePair(charAt5, charAt6)) {
                                            int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                            y321.k(bArr, j, (byte) ((codePoint2 >>> 18) | PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC));
                                            y321.k(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            long j3 = j + 3;
                                            y321.k(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                            j += 4;
                                            y321.k(bArr, j3, (byte) ((codePoint2 & 63) | 128));
                                        }
                                    } else {
                                        i14 = i4;
                                    }
                                    throw new Utf8$UnpairedSurrogateException(i14 - 1, length2);
                                }
                                y321.k(bArr, j, (byte) ((charAt5 >>> '\f') | 480));
                                long j4 = j + 2;
                                y321.k(bArr, j + 1, (byte) (((charAt5 >>> 6) & 63) | c2));
                                j += 3;
                                y321.k(bArr, j4, (byte) ((charAt5 & '?') | 128));
                            } else {
                                i4 = i14;
                                long j5 = j + 1;
                                y321.k(bArr, j, (byte) ((charAt5 >>> 6) | 960));
                                j += 2;
                                y321.k(bArr, j5, (byte) ((charAt5 & '?') | c2));
                            }
                            i14 = i4;
                        } else {
                            y321.k(bArr, j, (byte) charAt5);
                            j++;
                        }
                        i14++;
                        c = 2048;
                        c2 = 128;
                        c3 = 55296;
                    }
                }
                return (int) j;
        }
    }
}
