package xsna;

/* compiled from: FriendItem.kt */
/* loaded from: classes14.dex */
public interface fis {

    /* compiled from: FriendItem.kt */
    public static final class a implements fis {
        public final jis a;

        public a(jis jisVar) {
            this.a = jisVar;
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
            return "FriendToggled(model=" + this.a + ')';
        }
    }

    /* compiled from: FriendItem.kt */
    public static final class b implements fis {
        public final jis a;

        public b(jis jisVar) {
            this.a = jisVar;
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
            return "RemoveInviteClicked(model=" + this.a + ')';
        }
    }
}
