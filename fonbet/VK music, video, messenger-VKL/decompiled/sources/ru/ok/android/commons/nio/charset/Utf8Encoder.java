package ru.ok.android.commons.nio.charset;

import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes9.dex */
public final class Utf8Encoder extends CharsetEncoder {
    private char highSurrogate;

    public Utf8Encoder() {
        this.highSurrogate = (char) 0;
    }

    @Override // ru.ok.android.commons.nio.charset.CharsetEncoder
    public long encode(@NonNull char[] cArr, int i, int i2, @NonNull byte[] bArr, int i3, int i4) throws CharacterCodingException {
        int i5;
        char c = this.highSurrogate;
        int i6 = i2 + i;
        int i7 = (i4 + i3) - 4;
        while (i < i6 && i3 <= i7) {
            int i8 = i + 1;
            char c2 = cArr[i];
            if (c2 < 55296 || c2 > 56319) {
                char c3 = 0;
                if (c2 < 56320 || c2 > 57343) {
                    if (c != 0) {
                        i3 = encodeError(bArr, i3);
                        c = 0;
                    }
                    c3 = c;
                    i5 = c2;
                } else if (c == 0) {
                    i3 = encodeError(bArr, i3);
                } else {
                    i5 = (((c & 1023) << 10) | (c2 & 1023)) + 65536;
                }
                if (i5 <= 127) {
                    bArr[i3] = (byte) c2;
                    i3++;
                } else if (i5 <= 2047) {
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((i5 >> 6) | PsExtractor.AUDIO_STREAM);
                    i3 += 2;
                    bArr[i9] = (byte) ((i5 & 63) | 128);
                } else if (i5 <= 65535) {
                    bArr[i3] = (byte) ((i5 >> 12) | 224);
                    int i10 = i3 + 2;
                    bArr[i3 + 1] = (byte) (((i5 >> 6) & 63) | 128);
                    i3 += 3;
                    bArr[i10] = (byte) ((i5 & 63) | 128);
                } else {
                    bArr[i3] = (byte) ((i5 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                    bArr[i3 + 1] = (byte) (((i5 >> 12) & 63) | 128);
                    int i11 = i3 + 3;
                    bArr[i3 + 2] = (byte) (((i5 >> 6) & 63) | 128);
                    i3 += 4;
                    bArr[i11] = (byte) ((i5 & 63) | 128);
                }
                i = i8;
                c = c3;
            } else {
                if (c != 0) {
                    i3 = encodeError(bArr, i3);
                }
                c = c2;
            }
            i = i8;
        }
        this.highSurrogate = c;
        return (i << 32) | i3;
    }

    @Override // ru.ok.android.commons.nio.charset.CharsetEncoder
    public int encodeEnd(@NonNull byte[] bArr, int i, int i2) throws CharacterCodingException {
        if (this.highSurrogate == 0) {
            return i;
        }
        int encodeError = encodeError(bArr, i);
        this.highSurrogate = (char) 0;
        return encodeError;
    }

    @Override // ru.ok.android.commons.nio.charset.CharsetEncoder
    public int maxBytesPerChar() {
        return 4;
    }

    public Utf8Encoder(@NonNull CodingErrorAction codingErrorAction, byte b) {
        super(codingErrorAction, b);
        this.highSurrogate = (char) 0;
    }
}
