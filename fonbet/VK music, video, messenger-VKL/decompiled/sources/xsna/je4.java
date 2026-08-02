package xsna;

/* compiled from: AudioBookChapterMviAction.kt */
/* loaded from: classes3.dex */
public interface je4 extends lj50 {

    /* compiled from: AudioBookChapterMviAction.kt */
    public static final class a implements je4 {
        public final int b;
        public final String c;

        public a(int i, String str) {
            this.b = i;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CancelDownload(audioBookId=");
            sb.append(this.b);
            sb.append(", chapterId=");
            return ho8.a(sb, this.c, ')');
        }
    }
}
