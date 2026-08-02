package xsna;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* compiled from: UserEditableData.kt */
/* loaded from: classes5.dex */
public interface o2k {

    /* compiled from: UserEditableData.kt */
    public static final class a implements o2k {
        public static final a a = new a();
    }

    /* compiled from: UserEditableData.kt */
    public static final class b implements o2k {
        public final Bitmap a;
        public final a b;

        /* compiled from: UserEditableData.kt */
        public static final class a {
            public final RectF a;
            public final String b;

            public a(RectF rectF, String str) {
                this.a = rectF;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Params(rect=");
                sb.append(this.a);
                sb.append(", url=");
                return ho8.a(sb, this.b, ')');
            }
        }

        public b(Bitmap bitmap, a aVar) {
            this.a = bitmap;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "New(thumb=" + this.a + ", params=" + this.b + ')';
        }
    }

    /* compiled from: UserEditableData.kt */
    public interface c extends o2k {

        /* compiled from: UserEditableData.kt */
        public static final class a implements c {
            public final int a;

            public a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(0) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return h5s.c(this.a, ", endColor=0)", new StringBuilder("Gradient(startColor="));
            }
        }

        /* compiled from: UserEditableData.kt */
        public static final class b implements c {
            public final hea0 a;

            public b(hea0 hea0Var) {
                this.a = hea0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Photo(photoWrapper=" + this.a + ')';
            }
        }
    }
}
