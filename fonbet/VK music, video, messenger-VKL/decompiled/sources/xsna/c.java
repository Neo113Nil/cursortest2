package xsna;

import com.vk.dto.common.ImageSizeKey;

/* compiled from: ByteString.kt */
/* loaded from: classes11.dex */
public final class c {
    public static final char[] a = {ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c) {
        if ('0' <= c && c < ':') {
            return c - ImageSizeKey.SIZE_KEY_UNDEFINED;
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }
}
