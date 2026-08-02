package xsna;

/* compiled from: QuestionAction.kt */
/* loaded from: classes16.dex */
public interface lpe0 {

    /* compiled from: QuestionAction.kt */
    public static final class a implements lpe0 {
        public static final a a = new a();
    }

    /* compiled from: QuestionAction.kt */
    public static final class b implements lpe0 {
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
            return ho8.a(new StringBuilder("SelectedValue(value="), this.a, ')');
        }
    }
}
