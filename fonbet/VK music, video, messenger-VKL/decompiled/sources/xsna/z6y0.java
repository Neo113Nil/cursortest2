package xsna;

/* compiled from: ZoomSetting.kt */
/* loaded from: classes4.dex */
public interface z6y0 {

    /* compiled from: ZoomSetting.kt */
    public static final class a implements z6y0 {
        public static final a a = new a();

        @Override // xsna.z6y0
        public final boolean a() {
            return false;
        }
    }

    /* compiled from: ZoomSetting.kt */
    public static final class b implements z6y0 {
        public final int a;
        public final boolean b;
        public final boolean c;

        public b() {
            this(0);
        }

        @Override // xsna.z6y0
        public final boolean a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Enabled(minPointerCount=" + this.a + ", allowToDragWhileScaling=" + this.b + ")";
        }

        public /* synthetic */ b(int i) {
            this(1, false);
        }

        public b(int i, boolean z) {
            this.a = i;
            this.b = z;
            this.c = true;
        }
    }

    boolean a();
}
