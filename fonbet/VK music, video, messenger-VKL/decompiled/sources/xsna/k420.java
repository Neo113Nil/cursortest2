package xsna;

/* compiled from: MentionState.kt */
/* loaded from: classes18.dex */
public abstract class k420 {

    /* compiled from: MentionState.kt */
    public static final class a extends k420 {
        public static final a a = new a();
    }

    /* compiled from: MentionState.kt */
    public static final class b extends k420 {
        public final b420 a;

        public b(b420 b420Var) {
            this.a = b420Var;
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
            return "ShownProfile(mentionProfile=" + this.a + ')';
        }
    }

    /* compiled from: MentionState.kt */
    public static final class c extends k420 {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("ShownSuggestions(query="), this.a, ')');
        }
    }
}
