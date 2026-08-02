package xsna;

import com.vk.dto.common.ImageSizeKey;
import java.util.Arrays;

/* compiled from: AbstractNumberParser.java */
/* loaded from: classes12.dex */
public abstract class bg {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[256];
        a = bArr;
        Arrays.fill(bArr, (byte) -1);
        for (char c = ImageSizeKey.SIZE_KEY_UNDEFINED; c <= '9'; c = (char) (c + 1)) {
            a[c] = (byte) (c - '0');
        }
        for (char c2 = 'A'; c2 <= 'F'; c2 = (char) (c2 + 1)) {
            a[c2] = (byte) (c2 - '7');
        }
        for (char c3 = 'a'; c3 <= 'f'; c3 = (char) (c3 + 1)) {
            a[c3] = (byte) (c3 - 'W');
        }
        for (char c4 = '.'; c4 <= '.'; c4 = (char) (c4 + 1)) {
            a[c4] = -4;
        }
    }

    public static char a(int i, int i2, CharSequence charSequence) {
        if (i < i2) {
            return charSequence.charAt(i);
        }
        return (char) 0;
    }

    public static int b(char c) {
        if (c < 128) {
            return a[c];
        }
        return -1;
    }
}
