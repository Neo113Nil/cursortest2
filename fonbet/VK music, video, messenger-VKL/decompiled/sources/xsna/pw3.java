package xsna;

/* compiled from: AsrRecordStartViewEvent.kt */
/* loaded from: classes7.dex */
public interface pw3 {

    /* compiled from: AsrRecordStartViewEvent.kt */
    public static final class a implements pw3 {
        public static final a a = new a();
    }

    /* compiled from: AsrRecordStartViewEvent.kt */
    public static final class b implements pw3 {
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
            return ho8.a(new StringBuilder("TextChanged(title="), this.a, ')');
        }
    }
}
