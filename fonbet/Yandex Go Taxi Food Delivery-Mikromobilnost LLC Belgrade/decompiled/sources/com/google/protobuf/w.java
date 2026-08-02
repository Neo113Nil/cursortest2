package com.google.protobuf;

import defpackage.ny61;
import defpackage.o791;
import defpackage.q791;
import defpackage.rqw;
import defpackage.w321;
import defpackage.z321;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes11.dex */
public final class w extends q791 {
    public static int o(int i, int i2, long j, byte[] bArr) {
        if (i2 == 0) {
            q791 q791Var = x.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return x.c(i, z321.g(j, bArr));
        }
        if (i2 == 2) {
            return x.d(i, z321.g(j, bArr), z321.g(j + 1, bArr));
        }
        ny61.w();
        return 0;
    }

    @Override // defpackage.q791
    public final String h(int i, int i2, byte[] bArr) {
        Charset charset = rqw.a;
        String str = new String(bArr, i, i2, charset);
        if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
            throw InvalidProtocolBufferException.f();
        }
        return str;
    }

    @Override // defpackage.q791
    public final String j(int i, int i2, ByteBuffer byteBuffer) {
        long j;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long j2 = z321.c.j(z321.g, byteBuffer) + i;
        long j3 = i2 + j2;
        char[] cArr = new char[i2];
        int i3 = 0;
        while (true) {
            j = 1;
            if (j2 >= j3) {
                break;
            }
            byte e = z321.c.e(j2);
            if (!o791.c(e)) {
                break;
            }
            j2++;
            o791.d(e, cArr, i3);
            i3++;
        }
        int i4 = i3;
        while (j2 < j3) {
            long j4 = j2 + j;
            w321 w321Var = z321.c;
            byte e2 = w321Var.e(j2);
            if (o791.c(e2)) {
                int i5 = i4 + 1;
                o791.d(e2, cArr, i4);
                while (j4 < j3) {
                    byte e3 = z321.c.e(j4);
                    if (!o791.c(e3)) {
                        break;
                    }
                    j4 += j;
                    o791.d(e3, cArr, i5);
                    i5++;
                }
                i4 = i5;
                j2 = j4;
            } else if (o791.e(e2)) {
                if (j4 >= j3) {
                    throw InvalidProtocolBufferException.f();
                }
                j2 += 2;
                o791.f(e2, w321Var.e(j4), cArr, i4);
                i4++;
            } else if (o791.g(e2)) {
                if (j4 >= j3 - j) {
                    throw InvalidProtocolBufferException.f();
                }
                long j5 = 2 + j2;
                j2 += 3;
                o791.h(e2, w321Var.e(j4), w321Var.e(j5), cArr, i4);
                i4++;
            } else {
                if (j4 >= j3 - 2) {
                    throw InvalidProtocolBufferException.f();
                }
                byte e4 = w321Var.e(j4);
                long j6 = j2 + 3;
                byte e5 = w321Var.e(2 + j2);
                j2 += 4;
                o791.b(e2, e4, e5, w321Var.e(j6), cArr, i4);
                i4 += 2;
            }
            j = 1;
        }
        return new String(cArr, 0, i4);
    }

    @Override // defpackage.q791
    public final int k(int i, int i2, String str, byte[] bArr) {
        long j;
        long j2;
        int i3;
        char charAt;
        long j3 = i;
        long j4 = i2 + j3;
        int length = str.length();
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (charAt = str.charAt(i4)) >= 128) {
                break;
            }
            z321.k(bArr, j3, (byte) charAt);
            i4++;
            j3 = 1 + j3;
        }
        if (i4 == length) {
            return (int) j3;
        }
        while (i4 < length) {
            char charAt2 = str.charAt(i4);
            if (charAt2 < 128 && j3 < j4) {
                z321.k(bArr, j3, (byte) charAt2);
                j2 = j;
                j3 += j;
            } else if (charAt2 >= 2048 || j3 > j4 - 2) {
                j2 = j;
                if ((charAt2 >= 55296 && 57343 >= charAt2) || j3 > j4 - 3) {
                    if (j3 > j4 - 4) {
                        if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i4 + 1) != length && Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        throw new Utf8$UnpairedSurrogateException(i4, length);
                    }
                    int i5 = i4 + 1;
                    if (i5 != length) {
                        char charAt3 = str.charAt(i5);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            z321.k(bArr, j3, (byte) ((codePoint >>> 18) | PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC));
                            z321.k(bArr, j3 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j5 = j3 + 3;
                            z321.k(bArr, 2 + j3, (byte) (((codePoint >>> 6) & 63) | 128));
                            j3 += 4;
                            z321.k(bArr, j5, (byte) ((codePoint & 63) | 128));
                            i4 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                    throw new Utf8$UnpairedSurrogateException(i4 - 1, length);
                }
                z321.k(bArr, j3, (byte) ((charAt2 >>> '\f') | 480));
                long j6 = 2 + j3;
                z321.k(bArr, j3 + j2, (byte) (((charAt2 >>> 6) & 63) | 128));
                j3 += 3;
                z321.k(bArr, j6, (byte) ((charAt2 & '?') | 128));
            } else {
                j2 = j;
                long j7 = j3 + j2;
                z321.k(bArr, j3, (byte) ((charAt2 >>> 6) | 960));
                j3 += 2;
                z321.k(bArr, j7, (byte) ((charAt2 & '?') | 128));
            }
            i4++;
            j = j2;
        }
        return (int) j3;
    }

    @Override // defpackage.q791
    public final int m(int i, int i2, byte[] bArr) {
        int i3;
        if ((i | i2 | (bArr.length - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long j = i;
        int i4 = (int) (i2 - j);
        if (i4 >= 16) {
            int i5 = 8 - (((int) j) & 7);
            long j2 = j;
            i3 = 0;
            while (true) {
                if (i3 >= i5) {
                    while (true) {
                        int i6 = i3 + 8;
                        if (i6 > i4) {
                            break;
                        }
                        if ((z321.c.j(z321.f + j2, bArr) & (-9187201950435737472L)) != 0) {
                            break;
                        }
                        j2 += 8;
                        i3 = i6;
                    }
                    while (true) {
                        if (i3 >= i4) {
                            i3 = i4;
                            break;
                        }
                        long j3 = j2 + 1;
                        if (z321.g(j2, bArr) < 0) {
                            break;
                        }
                        i3++;
                        j2 = j3;
                    }
                } else {
                    long j4 = j2 + 1;
                    if (z321.g(j2, bArr) < 0) {
                        break;
                    }
                    i3++;
                    j2 = j4;
                }
            }
        } else {
            i3 = 0;
        }
        int i7 = i4 - i3;
        long j5 = j + i3;
        while (true) {
            byte b = 0;
            while (true) {
                if (i7 <= 0) {
                    break;
                }
                long j6 = j5 + 1;
                b = z321.g(j5, bArr);
                if (b < 0) {
                    j5 = j6;
                    break;
                }
                i7--;
                j5 = j6;
            }
            if (i7 == 0) {
                return 0;
            }
            int i8 = i7 - 1;
            if (b < -32) {
                if (i8 == 0) {
                    return b;
                }
                i7 -= 2;
                if (b < -62) {
                    return -1;
                }
                long j7 = j5 + 1;
                if (z321.g(j5, bArr) > -65) {
                    return -1;
                }
                j5 = j7;
            } else if (b < -16) {
                if (i8 < 2) {
                    return o(b, i8, j5, bArr);
                }
                i7 -= 3;
                long j8 = j5 + 1;
                byte g = z321.g(j5, bArr);
                if (g > -65) {
                    return -1;
                }
                if (b == -32 && g < -96) {
                    return -1;
                }
                if (b == -19 && g >= -96) {
                    return -1;
                }
                j5 += 2;
                if (z321.g(j8, bArr) > -65) {
                    return -1;
                }
            } else {
                if (i8 < 3) {
                    return o(b, i8, j5, bArr);
                }
                i7 -= 4;
                long j9 = j5 + 1;
                byte g2 = z321.g(j5, bArr);
                if (g2 > -65) {
                    return -1;
                }
                if ((((g2 + Alerts.alert_unrecognized_name) + (b << DerValue.tag_UniversalString)) >> 30) != 0) {
                    return -1;
                }
                long j10 = 2 + j5;
                if (z321.g(j9, bArr) > -65) {
                    return -1;
                }
                j5 += 3;
                if (z321.g(j10, bArr) > -65) {
                    return -1;
                }
            }
        }
    }
}
