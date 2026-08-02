package xsna;

/* compiled from: CommunityScheduledClipsGridOverlayState.kt */
/* loaded from: classes5.dex */
public interface r0i {

    /* compiled from: CommunityScheduledClipsGridOverlayState.kt */
    public static final class a implements r0i {
        public final k0i a;

        public a(k0i k0iVar) {
            this.a = k0iVar;
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
            return "DatePickerOverlayCommunityScheduled(data=" + this.a + ')';
        }
    }

    /* compiled from: CommunityScheduledClipsGridOverlayState.kt */
    public static final class b implements r0i {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 412354265;
        }

        public final String toString() {
            return "None";
        }
    }
}
