package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.ImageSizeKey;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes13.dex */
public final class f9y0 {
    public final String a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public char[] g;

    public f9y0(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.b = name.length();
    }

    public final int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int i5 = this.b;
        String str = this.a;
        if (i4 >= i5) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - ImageSizeKey.SIZE_KEY_UNDEFINED;
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - ImageSizeKey.SIZE_KEY_UNDEFINED;
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    public final char b() {
        int i;
        int i2;
        int i3 = this.c + 1;
        this.c = i3;
        int i4 = this.b;
        if (i3 == i4) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        char c = this.g[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int a = a(i3);
                            this.c++;
                            if (a < 128) {
                                return (char) a;
                            }
                            if (a < 192 || a > 247) {
                                return '?';
                            }
                            if (a <= 223) {
                                i = a & 31;
                                i2 = 1;
                            } else if (a <= 239) {
                                i = a & 15;
                                i2 = 2;
                            } else {
                                i = a & 7;
                                i2 = 3;
                            }
                            for (int i5 = 0; i5 < i2; i5++) {
                                int i6 = this.c;
                                int i7 = i6 + 1;
                                this.c = i7;
                                if (i7 == i4 || this.g[i7] != '\\') {
                                    return '?';
                                }
                                int i8 = i6 + 2;
                                this.c = i8;
                                int a2 = a(i8);
                                this.c++;
                                if ((a2 & PsExtractor.AUDIO_STREAM) != 128) {
                                    return '?';
                                }
                                i = (i << 6) + (a2 & 63);
                            }
                            return (char) i;
                    }
                case '*':
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    public final String c() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        int i4;
        char c4;
        char c5;
        while (true) {
            i = this.c;
            i2 = this.b;
            if (i >= i2 || this.g[i] != ' ') {
                break;
            }
            this.c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.d = i;
        this.c = i + 1;
        while (true) {
            i3 = this.c;
            if (i3 >= i2 || (c5 = this.g[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.c = i3 + 1;
        }
        String str = this.a;
        if (i3 >= i2) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.e = i3;
        if (this.g[i3] == ' ') {
            while (true) {
                i4 = this.c;
                if (i4 >= i2 || (c4 = this.g[i4]) == '=' || c4 != ' ') {
                    break;
                }
                this.c = i4 + 1;
            }
            if (this.g[i4] != '=' || i4 == i2) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.c++;
        while (true) {
            int i5 = this.c;
            if (i5 >= i2 || this.g[i5] != ' ') {
                break;
            }
            this.c = i5 + 1;
        }
        int i6 = this.e;
        int i7 = this.d;
        if (i6 - i7 > 4) {
            char[] cArr = this.g;
            if (cArr[i7 + 3] == '.' && (((c = cArr[i7]) == 'O' || c == 'o') && (((c2 = cArr[i7 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i7 + 2]) == 'D' || c3 == 'd')))) {
                this.d = i7 + 4;
            }
        }
        char[] cArr2 = this.g;
        int i8 = this.d;
        return new String(cArr2, i8, i6 - i8);
    }
}
