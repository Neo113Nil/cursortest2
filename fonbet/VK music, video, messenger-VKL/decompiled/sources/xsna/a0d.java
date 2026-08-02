package xsna;

/* compiled from: ClipInternalUpdateEvent.kt */
/* loaded from: classes17.dex */
public interface a0d {

    /* compiled from: ClipInternalUpdateEvent.kt */
    public static final class a implements a0d {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1994585384;
        }

        public final String toString() {
            return "ActionButtonActivated";
        }
    }

    /* compiled from: ClipInternalUpdateEvent.kt */
    public static final class b implements a0d {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -861075213;
        }

        public final String toString() {
            return "GetNewsFeedMarketItemsState";
        }
    }

    /* compiled from: ClipInternalUpdateEvent.kt */
    public static final class c implements a0d {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ItemsWasShownInFullScreenClip(itemsIsVisible="), this.a, ')');
        }
    }
}
