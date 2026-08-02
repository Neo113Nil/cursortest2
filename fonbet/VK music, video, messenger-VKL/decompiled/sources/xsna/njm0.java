package xsna;

/* compiled from: StoryTemplateSideEffect.kt */
/* loaded from: classes6.dex */
public interface njm0 {

    /* compiled from: StoryTemplateSideEffect.kt */
    public static final class a implements njm0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1105086892;
        }

        public final String toString() {
            return "OpenMemories";
        }
    }

    /* compiled from: StoryTemplateSideEffect.kt */
    public static final class b implements njm0 {
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
            return oq.c(new StringBuilder("ShowErrorToast(throwable="), this.a, ')');
        }
    }
}
