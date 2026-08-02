package xsna;

/* compiled from: CropVideoStatusDo.kt */
/* loaded from: classes7.dex */
public interface mik {

    /* compiled from: CropVideoStatusDo.kt */
    public static final class a implements mik {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 516343249;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: CropVideoStatusDo.kt */
    public static final class b implements mik {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Finished(videoUrl="), this.a, ')');
        }
    }

    /* compiled from: CropVideoStatusDo.kt */
    public static final class c implements mik {
        public final Long a;
        public final Long b;

        public c(Long l, Long l2) {
            this.a = l;
            this.b = l2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            Long l = this.a;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.b;
            return hashCode + (l2 != null ? l2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Progress(estimatedEndTimeMs=");
            sb.append(this.a);
            sb.append(", nextPollIntervalMs=");
            return iq.b(sb, this.b, ')');
        }
    }
}
