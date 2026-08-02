package xsna;

/* compiled from: StatItem.kt */
/* loaded from: classes15.dex */
public interface hsk0 {

    /* compiled from: StatItem.kt */
    public static final class a implements hsk0 {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("AutoLockTime(time="));
        }
    }

    /* compiled from: StatItem.kt */
    public static final class b implements hsk0, isk0 {
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

        @Override // xsna.isk0
        public final boolean isEnabled() {
            return this.a;
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("BiometricsEntrance(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: StatItem.kt */
    public static final class c implements hsk0, isk0 {
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

        @Override // xsna.isk0
        public final boolean isEnabled() {
            return this.a;
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ChangePassword(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: StatItem.kt */
    public static final class d implements hsk0, isk0 {
        public final boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        @Override // xsna.isk0
        public final boolean isEnabled() {
            return this.a;
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("DisableSecureEntrance(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: StatItem.kt */
    public static final class e implements hsk0, isk0 {
        public final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        @Override // xsna.isk0
        public final boolean isEnabled() {
            return this.a;
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("HideAppContent(isEnabled="), this.a, ')');
        }
    }
}
