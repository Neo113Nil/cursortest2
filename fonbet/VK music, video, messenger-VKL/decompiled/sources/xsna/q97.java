package xsna;

/* compiled from: BiometricsLockUpdateEvent.kt */
/* loaded from: classes.dex */
public interface q97 {

    /* compiled from: BiometricsLockUpdateEvent.kt */
    /* loaded from: classes15.dex */
    public static final class a implements q97 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 374074531;
        }

        public final String toString() {
            return "CompleteLogout";
        }
    }

    /* compiled from: BiometricsLockUpdateEvent.kt */
    /* loaded from: classes15.dex */
    public static final class b implements q97 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 489242840;
        }

        public final String toString() {
            return "DisablePinLock";
        }
    }

    /* compiled from: BiometricsLockUpdateEvent.kt */
    public static final class c implements q97 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1155027763;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: BiometricsLockUpdateEvent.kt */
    /* loaded from: classes15.dex */
    public static final class d implements q97 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 327440482;
        }

        public final String toString() {
            return "PinLockSet";
        }
    }

    /* compiled from: BiometricsLockUpdateEvent.kt */
    /* loaded from: classes15.dex */
    public static final class e implements q97 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "UpdateAppLocked(isLocked=false)";
        }
    }

    /* compiled from: BiometricsLockUpdateEvent.kt */
    /* loaded from: classes15.dex */
    public static final class f implements q97 {
        public final long a;

        public f(long j) {
            this.a = j;
        }

        public final long a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("UpdateAutoLockTime(time="));
        }
    }

    /* compiled from: BiometricsLockUpdateEvent.kt */
    /* loaded from: classes15.dex */
    public static final class g implements q97 {
        public final boolean a;

        public g(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateHideAppContent(isNeedHide="), this.a, ')');
        }
    }

    /* compiled from: BiometricsLockUpdateEvent.kt */
    /* loaded from: classes15.dex */
    public static final class h implements q97 {
        public final boolean a;

        public h(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateHidePushContent(isNeedHide="), this.a, ')');
        }
    }

    /* compiled from: BiometricsLockUpdateEvent.kt */
    /* loaded from: classes15.dex */
    public static final class i implements q97 {
        public final long a;

        public i(long j) {
            this.a = j;
        }

        public final long a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("UpdateLastActionTime(time="));
        }
    }
}
