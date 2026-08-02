package xsna;

/* compiled from: AudioBookChapterViewState.kt */
/* loaded from: classes3.dex */
public interface te4 extends lm50 {

    /* compiled from: AudioBookChapterViewState.kt */
    public static final class a implements te4 {
        public final int b;
        public final String c;
        public final Integer d;
        public final int e;
        public final int f;

        public a(String str, int i, int i2, int i3, Integer num) {
            this.b = i;
            this.c = str;
            this.d = num;
            this.e = i2;
            this.f = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
            Integer num = this.d;
            return Integer.hashCode(this.f) + shy.a(this.e, (a + (num == null ? 0 : num.hashCode())) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoveDownload(audioBookId=");
            sb.append(this.b);
            sb.append(", chapterId=");
            sb.append(this.c);
            sb.append(", iconRes=");
            sb.append(this.d);
            sb.append(", titleRes=");
            sb.append(this.e);
            sb.append(", contentDescriptionRes=");
            return vu5.b(sb, this.f, ')');
        }
    }
}
