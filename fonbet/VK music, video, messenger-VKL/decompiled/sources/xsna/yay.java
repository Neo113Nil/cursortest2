package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.OutputStream;
import java.util.Arrays;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* compiled from: JvmJsonStreams.kt */
/* loaded from: classes8.dex */
public final class yay implements lhx {
    public final OutputStream a;
    public final byte[] b = st8.c.b(512);
    public char[] c = mlb.c.e(128);
    public int d;

    public yay(OutputStream outputStream) {
        this.a = outputStream;
    }

    @Override // xsna.lhx
    public final void a(char c) {
        byte[] bArr = this.b;
        if (c < 128) {
            if (bArr.length - this.d < 1) {
                e();
            }
            int i = this.d;
            this.d = i + 1;
            bArr[i] = (byte) c;
            return;
        }
        if (c < 2048) {
            if (bArr.length - this.d < 2) {
                e();
            }
            int i2 = (c >> 6) | PsExtractor.AUDIO_STREAM;
            int i3 = this.d;
            int i4 = i3 + 1;
            this.d = i4;
            bArr[i3] = (byte) i2;
            this.d = i3 + 2;
            bArr[i4] = (byte) ((c & '?') | 128);
            return;
        }
        if (55296 <= c && c < 57344) {
            if (bArr.length - this.d < 1) {
                e();
            }
            int i5 = this.d;
            this.d = i5 + 1;
            bArr[i5] = (byte) 63;
            return;
        }
        if (c < 0) {
            if (bArr.length - this.d < 3) {
                e();
            }
            int i6 = this.d;
            int i7 = i6 + 1;
            this.d = i7;
            bArr[i6] = (byte) ((c >> '\f') | 224);
            int i8 = i6 + 2;
            this.d = i8;
            bArr[i7] = (byte) (((c >> 6) & 63) | 128);
            this.d = i6 + 3;
            bArr[i8] = (byte) ((c & '?') | 128);
            return;
        }
        if (c > 65535) {
            throw new JsonEncodingException(lhg.a(c, "Unexpected code point: "));
        }
        if (bArr.length - this.d < 4) {
            e();
        }
        int i9 = (c >> 18) | PsExtractor.VIDEO_STREAM_MASK;
        int i10 = this.d;
        int i11 = i10 + 1;
        this.d = i11;
        bArr[i10] = (byte) i9;
        int i12 = i10 + 2;
        this.d = i12;
        bArr[i11] = (byte) (((c >> '\f') & 63) | 128);
        int i13 = i10 + 3;
        this.d = i13;
        bArr[i12] = (byte) (((c >> 6) & 63) | 128);
        this.d = i10 + 4;
        bArr[i13] = (byte) ((c & '?') | 128);
    }

    @Override // xsna.lhx
    public final void b(String str) {
        int i;
        d(0, str.length() + 2);
        char[] cArr = this.c;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i2 = length + 1;
        int i3 = 1;
        while (i3 < i2) {
            char c = cArr[i3];
            byte[] bArr = jqm0.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i4 = i3 - 1; i4 < length2; i4++) {
                    d(i3, 2);
                    char charAt = str.charAt(i4);
                    byte[] bArr2 = jqm0.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i3 + 1;
                            this.c[i3] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = jqm0.a[charAt];
                                d(i3, str2.length());
                                str2.getChars(0, str2.length(), this.c, i3);
                                i3 = str2.length() + i3;
                            } else {
                                char[] cArr2 = this.c;
                                cArr2[i3] = '\\';
                                cArr2[i3 + 1] = (char) b;
                                i3 += 2;
                            }
                        }
                    } else {
                        i = i3 + 1;
                        this.c[i3] = charAt;
                    }
                    i3 = i;
                }
                d(i3, 1);
                char[] cArr3 = this.c;
                cArr3[i3] = '\"';
                f(cArr3, i3 + 1);
                e();
                return;
            }
            i3++;
        }
        cArr[i2] = '\"';
        f(cArr, length + 2);
        e();
    }

    @Override // xsna.lhx
    public final void c(String str) {
        int length = str.length();
        d(0, length);
        str.getChars(0, length, this.c, 0);
        f(this.c, length);
    }

    public final void d(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public final void e() {
        this.a.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void f(char[] cArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (i > cArr.length) {
            StringBuilder b = ji.b(i, "count > string.length: ", " > ");
            b.append(cArr.length);
            throw new IllegalArgumentException(b.toString().toString());
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            byte[] bArr = this.b;
            if (c < 128) {
                if (bArr.length - this.d < 1) {
                    e();
                }
                int i3 = this.d;
                int i4 = i3 + 1;
                this.d = i4;
                bArr[i3] = (byte) c;
                i2++;
                int min = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < min) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        int i5 = this.d;
                        this.d = i5 + 1;
                        bArr[i5] = (byte) c2;
                        i2++;
                    }
                }
            } else {
                if (c < 2048) {
                    if (bArr.length - this.d < 2) {
                        e();
                    }
                    int i6 = (c >> 6) | PsExtractor.AUDIO_STREAM;
                    int i7 = this.d;
                    int i8 = i7 + 1;
                    this.d = i8;
                    bArr[i7] = (byte) i6;
                    this.d = i7 + 2;
                    bArr[i8] = (byte) ((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    if (bArr.length - this.d < 3) {
                        e();
                    }
                    int i9 = this.d;
                    int i10 = i9 + 1;
                    this.d = i10;
                    bArr[i9] = (byte) ((c >> '\f') | 224);
                    int i11 = i9 + 2;
                    this.d = i11;
                    bArr[i10] = (byte) (((c >> 6) & 63) | 128);
                    this.d = i9 + 3;
                    bArr[i11] = (byte) ((c & '?') | 128);
                } else {
                    int i12 = i2 + 1;
                    char c3 = i12 < i ? cArr[i12] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (bArr.length - this.d < 1) {
                            e();
                        }
                        int i13 = this.d;
                        this.d = i13 + 1;
                        bArr[i13] = (byte) 63;
                        i2 = i12;
                    } else {
                        int i14 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        if (bArr.length - this.d < 4) {
                            e();
                        }
                        int i15 = (i14 >> 18) | PsExtractor.VIDEO_STREAM_MASK;
                        int i16 = this.d;
                        int i17 = i16 + 1;
                        this.d = i17;
                        bArr[i16] = (byte) i15;
                        int i18 = i16 + 2;
                        this.d = i18;
                        bArr[i17] = (byte) (((i14 >> 12) & 63) | 128);
                        int i19 = i16 + 3;
                        this.d = i19;
                        bArr[i18] = (byte) (((i14 >> 6) & 63) | 128);
                        this.d = i16 + 4;
                        bArr[i19] = (byte) ((i14 & 63) | 128);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    @Override // xsna.lhx
    public final void writeLong(long j) {
        c(String.valueOf(j));
    }
}
