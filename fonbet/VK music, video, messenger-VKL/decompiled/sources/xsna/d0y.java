package xsna;

/* compiled from: JoinConversationDelegate.kt */
/* loaded from: classes8.dex */
public interface d0y {

    /* compiled from: JoinConversationDelegate.kt */
    public interface a {

        /* compiled from: JoinConversationDelegate.kt */
        /* renamed from: xsna.d0y$a$a, reason: collision with other inner class name */
        public static final class C2694a implements a {
            public final String toString() {
                return "Result.Error(code=null, throwable=null)";
            }
        }

        /* compiled from: JoinConversationDelegate.kt */
        public static final class b implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return 0;
            }

            public final String toString() {
                return "Success(conversationId=null, internalParams=null)";
            }
        }
    }
}
