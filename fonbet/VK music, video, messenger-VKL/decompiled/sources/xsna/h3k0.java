package xsna;

import android.graphics.Rect;

/* compiled from: SmallCropProcessor.kt */
/* loaded from: classes4.dex */
public final class h3k0 {

    /* compiled from: SmallCropProcessor.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;
        public final float i;
        public final float j;

        public a(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = f;
            this.f = f2;
            this.g = f3;
            this.h = f4;
            this.i = f5;
            this.j = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && Float.compare(this.e, aVar.e) == 0 && Float.compare(this.f, aVar.f) == 0 && Float.compare(this.g, aVar.g) == 0 && Float.compare(this.h, aVar.h) == 0 && Float.compare(this.i, aVar.i) == 0 && Float.compare(this.j, aVar.j) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.j) + io.reactivex.rxjava3.subjects.b.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CropArea(x=");
            sb.append(this.a);
            sb.append(", y=");
            sb.append(this.b);
            sb.append(", width=");
            sb.append(this.c);
            sb.append(", height=");
            sb.append(this.d);
            sb.append(", relativeX1=");
            sb.append(this.e);
            sb.append(", relativeY1=");
            sb.append(this.f);
            sb.append(", relativeX2=");
            sb.append(this.g);
            sb.append(", relativeY2=");
            sb.append(this.h);
            sb.append(", relativeWidth=");
            sb.append(this.i);
            sb.append(", relativeHeight=");
            return xq.c(')', this.j, sb);
        }
    }

    public final a a(int i, int i2) {
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        float f4 = swe0.f(f3, 0.6666667f, 1.7777778f);
        Rect rect = new Rect(0, 0, i, i2);
        if (f3 >= 1.0f) {
            if (Math.abs(1 - (f4 / f3)) <= 0.05f) {
                float f5 = f4 * f2;
                float f6 = (f - f5) / 2.0f;
                rect.left = (int) f6;
                rect.right = (int) (f6 + f5);
            }
        } else if (Math.abs(1 - (f3 / f4)) <= 0.04f) {
            float f7 = f / f4;
            float f8 = (f2 - f7) / 2.0f;
            rect.bottom = (int) (f7 + f8);
            rect.top = (int) f8;
        }
        int width = rect.width();
        int height = rect.height();
        int i3 = rect.left;
        int i4 = rect.top;
        float f9 = 100;
        return new a((i3 / f) * f9, (i4 / f2) * f9, (rect.right / f) * f9, (rect.bottom / f2) * f9, width / f, height / f2, i3, i4, width, height);
    }
}
