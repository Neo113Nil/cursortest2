package xsna;

/* compiled from: ModerationEventBus.kt */
/* loaded from: classes18.dex */
public interface z430 {

    /* compiled from: ModerationEventBus.kt */
    public static final class a implements z430 {
        public static final a a = new a();
    }

    /* compiled from: ModerationEventBus.kt */
    public static final class b implements z430 {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("ModerationItemDeleted(itemId="));
        }
    }

    /* compiled from: ModerationEventBus.kt */
    public static final class c implements z430 {
        public static final c a = new c();
    }

    /* compiled from: ModerationEventBus.kt */
    public static final class d implements z430 {
        public static final d a = new d();
    }
}
