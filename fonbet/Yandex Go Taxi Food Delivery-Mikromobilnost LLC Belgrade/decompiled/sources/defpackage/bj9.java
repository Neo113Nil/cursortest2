package defpackage;

import ru.CryptoPro.JCSP.KeyStore.CSPStore;

/* loaded from: classes7.dex */
public final class bj9 implements hie0 {
    public final char a;

    public bj9(char c) {
        this.a = c;
    }

    public final boolean a(char c) {
        return c == this.a;
    }

    @Override // defpackage.hie0
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = CSPStore.UNIQUE_SEPARATOR;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.a;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
