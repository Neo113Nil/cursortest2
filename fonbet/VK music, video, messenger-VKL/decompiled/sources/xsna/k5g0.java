package xsna;

/* compiled from: ReportEvent.kt */
/* loaded from: classes4.dex */
public interface k5g0 {

    /* compiled from: ReportEvent.kt */
    public static final class a implements k5g0 {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("NavigateToChat(chatId="));
        }
    }

    /* compiled from: ReportEvent.kt */
    public static final class b implements k5g0 {
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
            return ho8.a(new StringBuilder("OpenScreenshotEditor(path="), this.a, ')');
        }
    }
}
