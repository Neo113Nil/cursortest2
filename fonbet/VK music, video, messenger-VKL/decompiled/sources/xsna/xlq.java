package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: FastShareUiState.kt */
/* loaded from: classes6.dex */
public interface xlq {

    /* compiled from: FastShareUiState.kt */
    public static final class a implements xlq {
        public final int a;
        public final String b;
        public final String c;
        public final boolean d;

        public a(int i, String str, String str2, boolean z) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        @Override // xsna.xlq
        public final String getName() {
            return this.b;
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            return Boolean.hashCode(this.d) + ((a + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Highlight(index=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", url=");
            sb.append(this.c);
            sb.append(", checked=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: FastShareUiState.kt */
    public static final class b implements xlq {
        public final int a;
        public final String b;

        public b(int i, String str) {
            this.a = i;
            this.b = str;
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

        @Override // xsna.xlq
        public final String getName() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("More(index=");
            sb.append(this.a);
            sb.append(", name=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: FastShareUiState.kt */
    public static final class c implements xlq {
        public final int a;
        public final String b;
        public final String c;
        public final Drawable d;

        public c(int i, String str, String str2, Drawable drawable) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = drawable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        @Override // xsna.xlq
        public final String getName() {
            return this.b;
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            Drawable drawable = this.d;
            return hashCode + (drawable != null ? drawable.hashCode() : 0);
        }

        public final String toString() {
            return "Real(index=" + this.a + ", name=" + this.b + ", url=" + this.c + ", drawable=" + this.d + ')';
        }
    }

    String getName();
}
