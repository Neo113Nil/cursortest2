package xsna;

/* compiled from: CommunityAddDescriptionPatch.kt */
/* loaded from: classes5.dex */
public interface mqg extends xl50 {

    /* compiled from: CommunityAddDescriptionPatch.kt */
    public static final class a implements mqg {
        public final String b;
        public final long c;

        public a(String str, long j) {
            this.b = str;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && qko0.b(this.c, aVar.c);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = str == null ? 0 : str.hashCode();
            int i = qko0.c;
            return Long.hashCode(this.c) + (hashCode * 31);
        }

        public final String toString() {
            return "ChangeText(text=" + this.b + ", textSelection=" + ((Object) qko0.h(this.c)) + ')';
        }
    }

    /* compiled from: CommunityAddDescriptionPatch.kt */
    public static final class b implements mqg {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 776907740;
        }

        public final String toString() {
            return "Init";
        }
    }
}
