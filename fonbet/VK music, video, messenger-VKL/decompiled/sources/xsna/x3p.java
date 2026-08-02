package xsna;

/* compiled from: EditorEvent.kt */
/* loaded from: classes4.dex */
public interface x3p {

    /* compiled from: EditorEvent.kt */
    public static final class a implements x3p {
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
            return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("MediaViewUpdated(isLoading=", ")", this.a);
        }
    }
}
