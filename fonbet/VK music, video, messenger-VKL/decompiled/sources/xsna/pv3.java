package xsna;

/* compiled from: AsrRecordFeatureAction.kt */
/* loaded from: classes7.dex */
public interface pv3 {

    /* compiled from: AsrRecordFeatureAction.kt */
    public static final class a implements pv3 {
        public static final a a = new a();
    }

    /* compiled from: AsrRecordFeatureAction.kt */
    public static final class b implements pv3 {
        public static final b a = new b();
    }

    /* compiled from: AsrRecordFeatureAction.kt */
    public static final class c implements pv3 {
        public final mew0 a;

        public c(mew0 mew0Var) {
            this.a = mew0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ProfileLoaded(asrInfo=" + this.a + ')';
        }
    }
}
