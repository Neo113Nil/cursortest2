package xsna;

/* compiled from: VideoPlaylistVideosPaginationParams.kt */
/* loaded from: classes2.dex */
public interface l5t0 {

    /* compiled from: VideoPlaylistVideosPaginationParams.kt */
    public static final class a implements l5t0 {
        public final String a;
        public final int b;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        @Override // xsna.l5t0
        public final int getCount() {
            return this.b;
        }

        public final int hashCode() {
            String str = this.a;
            return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Initial(focusOnVideo=");
            sb.append(this.a);
            sb.append(", count=");
            return vu5.b(sb, this.b, ')');
        }

        public /* synthetic */ a(int i) {
            this(null, 20);
        }

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    /* compiled from: VideoPlaylistVideosPaginationParams.kt */
    public static final class b implements l5t0 {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
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

        @Override // xsna.l5t0
        public final int getCount() {
            return this.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Pagination(offset=");
            sb.append(this.a);
            sb.append(", count=");
            return vu5.b(sb, this.b, ')');
        }
    }

    int getCount();
}
