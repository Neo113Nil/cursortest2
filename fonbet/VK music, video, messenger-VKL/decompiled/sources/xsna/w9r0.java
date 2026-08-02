package xsna;

/* compiled from: VKAvatarCutout.kt */
/* loaded from: classes15.dex */
public abstract class w9r0 {

    /* compiled from: VKAvatarCutout.kt */
    public static final class a extends w9r0 {
        public final float a;
        public final float b;
        public final float c;

        public a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Circle(x=");
            sb.append(this.a);
            sb.append(", y=");
            sb.append(this.b);
            sb.append(", radius=");
            return xq.c(')', this.c, sb);
        }
    }

    /* compiled from: VKAvatarCutout.kt */
    public static final class b extends w9r0 {
    }

    /* compiled from: VKAvatarCutout.kt */
    public static final class c extends w9r0 {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public c(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.a, cVar.a) == 0 && Float.compare(this.b, cVar.b) == 0 && Float.compare(this.c, cVar.c) == 0 && Float.compare(this.d, cVar.d) == 0 && Float.compare(this.e, cVar.e) == 0 && Float.compare(this.f, cVar.f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f) + io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoundRect(left=");
            sb.append(this.a);
            sb.append(", top=");
            sb.append(this.b);
            sb.append(", right=");
            sb.append(this.c);
            sb.append(", bottom=");
            sb.append(this.d);
            sb.append(", radiusX=");
            sb.append(this.e);
            sb.append(", radiusY=");
            return xq.c(')', this.f, sb);
        }
    }
}
