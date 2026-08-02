package xsna;

/* compiled from: VideoInfoSegment.kt */
/* loaded from: classes14.dex */
public interface oui {

    /* compiled from: VideoInfoSegment.kt */
    @vby
    public static final class a implements oui {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a == ((a) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return uqi.a("Ellipsed(maxLine=", this.a, ')');
        }
    }

    /* compiled from: VideoInfoSegment.kt */
    public static final class b implements oui {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 135751919;
        }

        public final String toString() {
            return "None";
        }
    }
}
