package xsna;

import android.graphics.Bitmap;

/* compiled from: ActionButtonIconSource.kt */
/* loaded from: classes17.dex */
public interface uu {

    /* compiled from: ActionButtonIconSource.kt */
    public static final class a implements uu {
        public final Bitmap a;

        public a(Bitmap bitmap) {
            this.a = bitmap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return qr.c(new StringBuilder("BitmapIcon(bitmap="), this.a, ')');
        }
    }

    /* compiled from: ActionButtonIconSource.kt */
    public static final class b implements uu {
        public final int a;
        public final Integer b;

        public b(int i, Integer num) {
            this.a = i;
            this.b = num;
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
            int hashCode = Integer.hashCode(this.a) * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DrawableResIcon(resId=");
            sb.append(this.a);
            sb.append(", tintAttr=");
            return uqi.b(sb, this.b, ')');
        }
    }
}
