package com.objsys.asn1j.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes11.dex */
class Asn1RunTime {
    static final int LIC_BER = 1;
    static final int LIC_PER = 2;
    static final int LIC_XER = 4;
    static final long mBit0Mask = Long.MIN_VALUE;
    private static Asn1RunTime rt;

    public static final byte[] decodeHexOctetStr(String str) throws Asn1Exception {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isSpaceChar(str.charAt(i2))) {
                i++;
            }
        }
        byte[] bArr = new byte[(i + 1) / 2];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (!Character.isWhitespace(charAt)) {
                if (i3 > 1) {
                    i4++;
                    i3 = 0;
                } else {
                    bArr[i4] = (byte) (bArr[i4] << 4);
                }
                if (charAt < '0' || charAt > '9') {
                    char lowerCase = Character.toLowerCase(charAt);
                    if (lowerCase < 'a' || lowerCase > 'f') {
                        throw new Asn1Exception("Invalid format of hexadecimal string: ".concat(str));
                    }
                    bArr[i4] = (byte) ((((lowerCase - 'a') & 15) + 10) | bArr[i4]);
                } else {
                    bArr[i4] = (byte) (((charAt - '0') & 15) | bArr[i4]);
                }
                i3++;
            }
        }
        return bArr;
    }

    public static final long decodeIntValue(Asn1DecodeBuffer asn1DecodeBuffer, int i, boolean z) throws Asn1Exception, IOException {
        if (i > 8) {
            quz.s("integer value is too large");
            return 0L;
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int readByte = asn1DecodeBuffer.readByte();
            if (readByte < 0) {
                throw new Asn1EndOfBufferException(asn1DecodeBuffer);
            }
            if (i2 == 0 && z) {
                j = readByte > 127 ? -1L : 0L;
            }
            j = (j * 256) + readByte;
        }
        return j;
    }

    public static final int getIdentBytesCount(long j) {
        if (j < 128) {
            return 1;
        }
        if (j < PlaybackStateCompat.ACTION_PREPARE) {
            return 2;
        }
        if (j < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            return 3;
        }
        if (j < 268435456) {
            return 4;
        }
        if (j < 34359738368L) {
            return 5;
        }
        if (j < 4398046511104L) {
            return 6;
        }
        if (j < 562949953421312L) {
            return 7;
        }
        return j < 72057594037927936L ? 8 : 9;
    }

    public static final int getLongBitCount(long j) {
        long j2 = j & Long.MIN_VALUE;
        int i = 0;
        if (j == 0) {
            return 0;
        }
        while ((j & Long.MIN_VALUE) == j2) {
            i++;
            j <<= 1;
        }
        if (j2 == Long.MIN_VALUE) {
            i--;
        }
        return 64 - i;
    }

    public static final int getLongBytesCount(long j) {
        long j2 = 9187343239835811840L;
        if (j < 0) {
            j = ~j;
        }
        int i = 8;
        while (i > 1 && (j & j2) == 0) {
            j2 >>= 8;
            i--;
        }
        return i;
    }

    public static final int getUlongBytesCount(long j) {
        long j2 = -72057594037927936L;
        int i = 8;
        while (i > 1 && (j & j2) == 0) {
            j2 >>>= 8;
            i--;
        }
        return i;
    }

    public static synchronized Asn1RunTime instance() {
        Asn1RunTime asn1RunTime;
        synchronized (Asn1RunTime.class) {
            try {
                if (rt == null) {
                    rt = new Asn1RunTime();
                }
                asn1RunTime = rt;
            } catch (Throwable th) {
                throw th;
            }
        }
        return asn1RunTime;
    }

    public static final int intTrailingZerosCnt(int i) {
        int i2 = 0;
        if ((65535 & i) == 0) {
            int i3 = i >>> 16;
            if ((i3 & 255) != 0) {
                if ((i3 & 15) != 0) {
                    i2 = (i3 & 3) != 0 ? (i3 & 1) != 0 ? 8 : 7 : (i3 & 4) != 0 ? 6 : 5;
                } else if ((i3 & 48) != 0) {
                    i2 = (i3 & 16) != 0 ? 4 : 3;
                } else if ((i3 & 64) != 0) {
                    i2 = 2;
                } else if ((i3 & 128) != 0) {
                    i2 = 1;
                }
                i2 += 8;
            } else {
                int i4 = i >>> 24;
                if ((i4 & 15) != 0) {
                    i2 = (i4 & 3) != 0 ? (i4 & 1) != 0 ? 8 : 7 : (i4 & 4) != 0 ? 6 : 5;
                } else if ((i4 & 48) != 0) {
                    i2 = (i4 & 16) != 0 ? 4 : 3;
                } else if ((i4 & 64) != 0) {
                    i2 = 2;
                } else if ((i4 & 128) != 0) {
                    i2 = 1;
                }
            }
        } else if ((i & 255) != 0) {
            if ((i & 15) != 0) {
                i2 = (i & 3) != 0 ? (i & 1) != 0 ? 8 : 7 : (i & 4) != 0 ? 6 : 5;
            } else if ((i & 48) != 0) {
                i2 = (i & 16) != 0 ? 4 : 3;
            } else if ((i & 64) != 0) {
                i2 = 2;
            } else if ((i & 128) != 0) {
                i2 = 1;
            }
            i2 += 24;
        } else {
            int i5 = i >>> 8;
            if ((i5 & 15) != 0) {
                i2 = (i5 & 3) != 0 ? (i5 & 1) != 0 ? 8 : 7 : (i5 & 4) != 0 ? 6 : 5;
            } else if ((i5 & 48) != 0) {
                i2 = (i5 & 16) != 0 ? 4 : 3;
            } else if ((i5 & 64) != 0) {
                i2 = 2;
            } else if ((i5 & 128) != 0) {
                i2 = 1;
            }
            i2 += 16;
        }
        return 32 - i2;
    }

    public void lcheck(int i) {
    }

    public void setKey(byte[] bArr) {
    }
}
