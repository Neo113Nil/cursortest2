package xsna;

/* compiled from: VideoHolderEvent.kt */
/* loaded from: classes7.dex */
public interface rps0 extends pk50 {

    /* compiled from: VideoHolderEvent.kt */
    public static final class a implements rps0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1404285248;
        }

        public final String toString() {
            return "ShowPermissionDialog";
        }
    }

    /* compiled from: VideoHolderEvent.kt */
    public static final class b implements rps0 {
        public final String a;
        public final int b;

        public b(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }
}
