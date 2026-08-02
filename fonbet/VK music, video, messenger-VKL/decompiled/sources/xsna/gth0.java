package xsna;

/* compiled from: SearchFollowersIntegrationAction.kt */
/* loaded from: classes5.dex */
public interface gth0 extends kj50 {

    /* compiled from: SearchFollowersIntegrationAction.kt */
    public static final class a implements gth0 {
        public static final a b = new a();
    }

    /* compiled from: SearchFollowersIntegrationAction.kt */
    public static final class b implements gth0 {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("FocusChanged(isFocused="), this.b, ')');
        }
    }

    /* compiled from: SearchFollowersIntegrationAction.kt */
    public static final class c implements gth0 {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("QueryChanged(query="), this.b, ')');
        }
    }

    /* compiled from: SearchFollowersIntegrationAction.kt */
    public static final class d implements gth0 {
        public static final d b = new d();
    }
}
