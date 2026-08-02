package xsna;

/* compiled from: VoipVisualEffectsDelegate.kt */
/* loaded from: classes7.dex */
public interface k5x0 {

    /* compiled from: VoipVisualEffectsDelegate.kt */
    public static final class a implements k5x0 {
        public static final a c = new a(0, "");
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // xsna.k5x0
        public final String a() {
            return this.b;
        }

        @Override // xsna.k5x0
        public final boolean b() {
            return equals(c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaskEffect(id=");
            sb.append(this.a);
            sb.append(", previewUrl=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipVisualEffectsDelegate.kt */
    public static final class b implements k5x0 {
        public static final b c = new b(0, "");
        public final int a;
        public final String b;

        public b(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // xsna.k5x0
        public final String a() {
            return this.b;
        }

        @Override // xsna.k5x0
        public final boolean b() {
            return equals(c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VirtualBackgroundEffect(id=");
            sb.append(this.a);
            sb.append(", previewUrl=");
            return ho8.a(sb, this.b, ')');
        }
    }

    String a();

    boolean b();
}
