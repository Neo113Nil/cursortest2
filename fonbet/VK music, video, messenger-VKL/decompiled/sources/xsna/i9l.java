package xsna;

import com.vk.pathfinder.utils.DeepLinkThrowable;

/* compiled from: DeepLinkResult.kt */
/* loaded from: classes4.dex */
public interface i9l {

    /* compiled from: DeepLinkResult.kt */
    public static final class a implements i9l {
        public final DeepLinkThrowable a;

        public a(DeepLinkThrowable deepLinkThrowable) {
            this.a = deepLinkThrowable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Error(throwable=" + this.a + ')';
        }
    }

    /* compiled from: DeepLinkResult.kt */
    public static final class b implements i9l {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1991014184;
        }

        public final String toString() {
            return "Handled";
        }
    }

    /* compiled from: DeepLinkResult.kt */
    public static final class c implements i9l {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1151818237;
        }

        public final String toString() {
            return "NotFound";
        }
    }
}
