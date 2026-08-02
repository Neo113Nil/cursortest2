package xsna;

/* compiled from: SelectChannelPopupType.kt */
/* loaded from: classes16.dex */
public interface v6i0 {

    /* compiled from: SelectChannelPopupType.kt */
    public static final class a implements v6i0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -487567501;
        }

        public final String toString() {
            return "Progress";
        }
    }

    /* compiled from: SelectChannelPopupType.kt */
    public static final class b implements v6i0 {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("ShowError(throwable="), this.a, ')');
        }
    }
}
