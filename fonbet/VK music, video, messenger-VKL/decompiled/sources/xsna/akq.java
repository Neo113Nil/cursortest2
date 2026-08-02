package xsna;

/* compiled from: FallbackEngineStatTracker.kt */
/* loaded from: classes.dex */
public abstract class akq {
    public final String a;

    /* compiled from: FallbackEngineStatTracker.kt */
    public static final class a extends akq {
        public static final a b = new a("EmptyPushToken");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -677553656;
        }

        public final String toString() {
            return "EmptyPushToken";
        }
    }

    /* compiled from: FallbackEngineStatTracker.kt */
    /* loaded from: classes5.dex */
    public static final class b extends akq {
        public static final b b = new b("ManageDeviceCmd");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1872176137;
        }

        public final String toString() {
            return "ManageDeviceCmd";
        }
    }

    /* compiled from: FallbackEngineStatTracker.kt */
    /* loaded from: classes5.dex */
    public static final class c extends akq {
        public static final c b = new c("RegisterDeviceCmd");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 896435723;
        }

        public final String toString() {
            return "RegisterDeviceCmd";
        }
    }

    public akq(String str) {
        this.a = str;
    }
}
