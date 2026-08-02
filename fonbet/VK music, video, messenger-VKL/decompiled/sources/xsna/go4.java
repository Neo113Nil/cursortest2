package xsna;

/* compiled from: AudioFocusManagerConfig.kt */
/* loaded from: classes3.dex */
public interface go4 {

    /* compiled from: AudioFocusManagerConfig.kt */
    public static final class a implements go4 {
        public final int a;
        public final boolean b;

        public a() {
            this(3);
        }

        @Override // xsna.go4
        public final boolean a() {
            return this.b;
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

        @Override // xsna.go4
        public final int getRequestType() {
            return this.a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Default(requestType=");
            sb.append(this.a);
            sb.append(", resetVolume=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public /* synthetic */ a(int i) {
            this(1, (i & 2) != 0);
        }

        public a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }
    }

    boolean a();

    int getRequestType();
}
