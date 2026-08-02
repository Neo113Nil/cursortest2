package xsna;

/* compiled from: PlayerSettingsMenuMviAction.kt */
/* loaded from: classes3.dex */
public interface h3b0 extends kj50 {

    /* compiled from: PlayerSettingsMenuMviAction.kt */
    public static final class a implements h3b0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1429481197;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: PlayerSettingsMenuMviAction.kt */
    @vby
    public static final class b implements h3b0 {
        public final boolean b;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.b == ((b) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return "EnableCrossfade(crossfadeState=" + this.b + ')';
        }
    }

    /* compiled from: PlayerSettingsMenuMviAction.kt */
    @vby
    public static final class c implements h3b0 {
        public final boolean b;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.b == ((c) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return "EnableNormalization(isLoudnessNormalizationEnabled=" + this.b + ')';
        }
    }

    /* compiled from: PlayerSettingsMenuMviAction.kt */
    public static final class d implements h3b0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 615685309;
        }

        public final String toString() {
            return "InitialAction";
        }
    }

    /* compiled from: PlayerSettingsMenuMviAction.kt */
    public static final class e implements h3b0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1971128779;
        }

        public final String toString() {
            return "OpenEqualizer";
        }
    }

    /* compiled from: PlayerSettingsMenuMviAction.kt */
    public static final class f implements h3b0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 201075413;
        }

        public final String toString() {
            return "OpenSleepTimer";
        }
    }

    /* compiled from: PlayerSettingsMenuMviAction.kt */
    @vby
    public static final class g implements h3b0 {
        public final float b;

        public final boolean equals(Object obj) {
            if (obj instanceof g) {
                return Float.compare(this.b, ((g) obj).b) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return "VolumeChangeAction(volume=" + this.b + ')';
        }
    }

    /* compiled from: PlayerSettingsMenuMviAction.kt */
    public static final class h implements h3b0 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1224816007;
        }

        public final String toString() {
            return "VolumeChangeFinished";
        }
    }
}
