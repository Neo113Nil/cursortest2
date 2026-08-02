package xsna;

/* compiled from: PlayerEqualizerSettingsMviAction.kt */
/* loaded from: classes3.dex */
public interface c1b0 extends kj50 {

    /* compiled from: PlayerEqualizerSettingsMviAction.kt */
    @vby
    public static final class a implements c1b0 {
        public final boolean b;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.b == ((a) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return "ApplyEnabled(isEnabled=" + this.b + ')';
        }
    }

    /* compiled from: PlayerEqualizerSettingsMviAction.kt */
    @vby
    public static final class b implements c1b0 {
        public final ztp b;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return epx.f(this.b, ((b) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ApplyPreset(preset=" + this.b + ')';
        }
    }

    /* compiled from: PlayerEqualizerSettingsMviAction.kt */
    public static final class c implements c1b0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 968072434;
        }

        public final String toString() {
            return "InitialAction";
        }
    }

    /* compiled from: PlayerEqualizerSettingsMviAction.kt */
    public static final class d implements c1b0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -655116181;
        }

        public final String toString() {
            return "SaveCurrentBandValues";
        }
    }

    /* compiled from: PlayerEqualizerSettingsMviAction.kt */
    public static final class e implements c1b0 {
        public final int b;
        public final short c;

        public e(int i, short s) {
            this.b = i;
            this.c = s;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c;
        }

        public final int hashCode() {
            return Short.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetBandLevel(band=");
            sb.append(this.b);
            sb.append(", bandLevel=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
