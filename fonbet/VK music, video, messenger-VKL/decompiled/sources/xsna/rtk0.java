package xsna;

/* compiled from: StateEmissionConfig.kt */
/* loaded from: classes3.dex */
public interface rtk0 {

    /* compiled from: StateEmissionConfig.kt */
    public static final class a implements rtk0 {
        public final boolean a;

        public a() {
            this(false);
        }

        @Override // xsna.rtk0
        public final boolean a() {
            return this.a;
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
            return defpackage.q0.a(new StringBuilder("Default(considerPlaybackBounds="), this.a, ')');
        }

        public a(boolean z) {
            this.a = z;
        }
    }

    boolean a();
}
