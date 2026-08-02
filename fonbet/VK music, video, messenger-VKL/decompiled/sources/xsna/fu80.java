package xsna;

/* compiled from: OrchestraPartConfig.kt */
/* loaded from: classes3.dex */
public interface fu80 {

    /* compiled from: OrchestraPartConfig.kt */
    public static final class a implements fu80 {
        public final boolean a;
        public final boolean b;

        public a() {
            this(true, true);
        }

        @Override // xsna.fu80
        public final boolean a() {
            return this.b;
        }

        @Override // xsna.fu80
        public final boolean b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Default(canReceiveAudioFocus=");
            sb.append(this.a);
            sb.append(", canHandOverAudioFocus=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    boolean a();

    boolean b();
}
