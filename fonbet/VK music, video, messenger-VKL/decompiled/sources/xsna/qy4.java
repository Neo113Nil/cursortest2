package xsna;

/* compiled from: AudioTimelineResult.kt */
/* loaded from: classes3.dex */
public interface qy4 {

    /* compiled from: AudioTimelineResult.kt */
    public static final class a implements qy4 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1639854223;
        }

        public final String toString() {
            return "EmptyAudioTimelineResult";
        }
    }

    /* compiled from: AudioTimelineResult.kt */
    public static final class b implements qy4 {
        public final tll a;

        public b(tll tllVar) {
            this.a = tllVar;
        }
    }

    /* compiled from: AudioTimelineResult.kt */
    public static final class c implements qy4 {
        public final long a;

        public c(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("SilentAudioTimelineResult(silenceDurationMcs="));
        }
    }
}
