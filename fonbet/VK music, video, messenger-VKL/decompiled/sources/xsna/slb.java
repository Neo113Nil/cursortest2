package xsna;

/* compiled from: CharMatcher.java */
/* loaded from: classes13.dex */
public abstract class slb implements jxc0<Character> {

    /* compiled from: CharMatcher.java */
    public static abstract class a extends slb {
        @Override // xsna.jxc0
        @Deprecated
        public final boolean apply(Character ch) {
            return a(ch.charValue());
        }
    }

    /* compiled from: CharMatcher.java */
    public static final class b extends a {
        public final char b;

        public b(char c) {
            this.b = c;
        }

        @Override // xsna.slb
        public final boolean a(char c) {
            return c == this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.is('");
            char[] cArr = new char[6];
            cArr[0] = '\\';
            cArr[1] = 'u';
            cArr[2] = 0;
            cArr[3] = 0;
            cArr[4] = 0;
            cArr[5] = 0;
            char c = this.b;
            for (int i = 0; i < 4; i++) {
                cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
                c = (char) (c >> 4);
            }
            sb.append(String.copyValueOf(cArr));
            sb.append("')");
            return sb.toString();
        }
    }

    /* compiled from: CharMatcher.java */
    public static abstract class c extends a {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final String toString() {
            return this.b;
        }
    }

    /* compiled from: CharMatcher.java */
    public static final class d extends c {
        public static final d c = new d("CharMatcher.none()");

        @Override // xsna.slb
        public final boolean a(char c2) {
            return false;
        }
    }

    public abstract boolean a(char c2);
}
