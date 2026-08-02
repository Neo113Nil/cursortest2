package xsna;

/* compiled from: StoryStatisticsInfoItem.kt */
/* loaded from: classes6.dex */
public interface gfm0 {

    /* compiled from: StoryStatisticsInfoItem.kt */
    public static final class a implements gfm0 {
        public final qwl0 a;

        public a(qwl0 qwl0Var) {
            this.a = qwl0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Achievement(wrappedItem=" + this.a + ')';
        }
    }

    /* compiled from: StoryStatisticsInfoItem.kt */
    public static final class b implements gfm0 {
        public final zem0 a;

        public b(zem0 zem0Var) {
            this.a = zem0Var;
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
            return "Header(wrappedItem=" + this.a + ')';
        }
    }

    /* compiled from: StoryStatisticsInfoItem.kt */
    public static final class c implements gfm0 {
        public final zdm0 a;

        public c(zdm0 zdm0Var) {
            this.a = zdm0Var;
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
            return "Row(wrappedItem=" + this.a + ')';
        }
    }
}
