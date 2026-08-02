package xsna;

/* compiled from: StoryStatisticsEvent.kt */
/* loaded from: classes6.dex */
public interface oem0 {

    /* compiled from: StoryStatisticsEvent.kt */
    public static abstract class a implements oem0 {

        /* compiled from: StoryStatisticsEvent.kt */
        /* renamed from: xsna.oem0$a$a, reason: collision with other inner class name */
        public static final class C3452a extends a {
            public final int a;

            public C3452a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3452a) && this.a == ((C3452a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("FullStat(storyId="), this.a, ')');
            }
        }

        /* compiled from: StoryStatisticsEvent.kt */
        public static final class b extends a {
            public final int a;

            public b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Questions(storyId="), this.a, ')');
            }
        }

        /* compiled from: StoryStatisticsEvent.kt */
        public static final class c extends a {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Replies(storyId="), this.a, ')');
            }
        }

        /* compiled from: StoryStatisticsEvent.kt */
        public static final class d extends a {
            public final int a;

            public d(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Viewers(storyId="), this.a, ')');
            }
        }
    }

    /* compiled from: StoryStatisticsEvent.kt */
    public static abstract class b implements oem0 {

        /* compiled from: StoryStatisticsEvent.kt */
        public static final class a extends b {
            public final int a;
            public final int b;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Viewers(storyId=");
                sb.append(this.a);
                sb.append(", viewsTotalCount=");
                return vu5.b(sb, this.b, ')');
            }
        }
    }

    /* compiled from: StoryStatisticsEvent.kt */
    public static abstract class c implements oem0 {

        /* compiled from: StoryStatisticsEvent.kt */
        public static final class a extends c {
            public final int a;

            public a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Questions(storyId="), this.a, ')');
            }
        }

        /* compiled from: StoryStatisticsEvent.kt */
        public static final class b extends c {
            public final int a;

            public b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Viewers(storyId="), this.a, ')');
            }
        }
    }
}
