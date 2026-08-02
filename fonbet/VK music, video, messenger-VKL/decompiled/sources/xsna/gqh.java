package xsna;

/* compiled from: CommunityProfileLifecycleEvent.kt */
/* loaded from: classes5.dex */
public interface gqh {

    /* compiled from: CommunityProfileLifecycleEvent.kt */
    public static final class a implements gqh {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("FragmentResumedChanged(isResumed="), this.a, ')');
        }
    }

    /* compiled from: CommunityProfileLifecycleEvent.kt */
    public static final class b implements gqh {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("LiveCoverFocusChanged(hasFocus="), this.a, ')');
        }
    }
}
