package xsna;

/* compiled from: AuthorHeaderLiveCoverMedia.kt */
/* loaded from: classes5.dex */
public interface r95 {

    /* compiled from: AuthorHeaderLiveCoverMedia.kt */
    public static final class a implements r95 {
        public final String a;
        public final String b;
        public final boolean c;

        public a(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Image(url=");
            sb.append(this.a);
            sb.append(", lowQualityUrl=");
            sb.append(this.b);
            sb.append(", isZoomInAnimEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: AuthorHeaderLiveCoverMedia.kt */
    public static final class b implements r95 {
        public final lls0 a;
        public final String b;
        public final boolean c;

        public b(lls0 lls0Var, String str, boolean z) {
            this.a = lls0Var;
            this.b = str;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Video(playbackSource=");
            sb.append(this.a);
            sb.append(", previewUrl=");
            sb.append(this.b);
            sb.append(", canAutoPlay=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
