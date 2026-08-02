package ru.ok.android.commons.nio.charset;

import androidx.annotation.NonNull;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes9.dex */
public abstract class CharsetEncoder {
    public static final byte DEFAULT_REPLACEMENT = 63;
    private final CodingErrorAction errorAction;
    private final byte errorReplacement;

    public CharsetEncoder() {
        this(CodingErrorAction.REPLACE, DEFAULT_REPLACEMENT);
    }

    public abstract long encode(@NonNull char[] cArr, int i, int i2, @NonNull byte[] bArr, int i3, int i4) throws CharacterCodingException;

    public final int encodeError(@NonNull byte[] bArr, int i) throws CharacterCodingException {
        CodingErrorAction codingErrorAction = this.errorAction;
        if (codingErrorAction == CodingErrorAction.REPLACE) {
            int i2 = i + 1;
            bArr[i] = this.errorReplacement;
            return i2;
        }
        if (codingErrorAction != CodingErrorAction.REPORT) {
            return i;
        }
        throw new CharacterCodingException();
    }

    public abstract int maxBytesPerChar();

    public CharsetEncoder(@NonNull CodingErrorAction codingErrorAction, byte b) {
        this.errorAction = codingErrorAction;
        this.errorReplacement = b;
    }

    public int encodeEnd(@NonNull byte[] bArr, int i, int i2) throws CharacterCodingException {
        return i;
    }
}
