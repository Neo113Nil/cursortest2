package xsna;

import com.vk.typography.FontFamily;

/* compiled from: VKPhotoStackController.kt */
/* loaded from: classes17.dex */
public final class ler0 {
    public final int a;
    public final boolean b;
    public final Float c;
    public final float d;
    public final a e;
    public final b f;

    /* compiled from: VKPhotoStackController.kt */
    public static final class b {
        public final float a;
        public final float b;
        public final float c;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.a, bVar.a) == 0 && Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OverlapOffsetParams(visiblePart=");
            sb.append(this.a);
            sb.append(", marginBetweenImages=");
            sb.append(this.b);
            sb.append(", singleImageWidth=");
            return xq.c(')', this.c, sb);
        }

        public b(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public /* synthetic */ b(int i) {
            this(24.0f, 2.0f, 24.0f);
        }
    }

    static {
        new ler0(0);
    }

    public ler0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ler0)) {
            return false;
        }
        ler0 ler0Var = (ler0) obj;
        return this.a == ler0Var.a && this.b == ler0Var.b && epx.f(this.c, ler0Var.c) && Float.compare(this.d, ler0Var.d) == 0 && epx.f(this.e, ler0Var.e) && epx.f(this.f, ler0Var.f);
    }

    public final int hashCode() {
        int b2 = qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
        Float f = this.c;
        int a2 = io.reactivex.rxjava3.subjects.b.a(this.d, (b2 + (f == null ? 0 : f.hashCode())) * 31, 31);
        a aVar = this.e;
        return this.f.hashCode() + ((a2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Params(maxCount=" + this.a + ", isCircle=" + this.b + ", borderWidth=" + this.c + ", cornerRadiusImages=" + this.d + ", counterParams=" + this.e + ", overlapOffsetParams=" + this.f + ')';
    }

    public ler0(boolean z, Float f, float f2, a aVar, b bVar) {
        this.a = 3;
        this.b = z;
        this.c = f;
        this.d = f2;
        this.e = aVar;
        this.f = bVar;
    }

    /* compiled from: VKPhotoStackController.kt */
    public static final class a {
        public final int a;
        public final float b;
        public final FontFamily c;

        public a(int i, float f, FontFamily fontFamily) {
            this.a = i;
            this.b = f;
            this.c = fontFamily;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "CounterParams(counter=" + this.a + ", extraCounterTextSize=" + this.b + ", extraCounterTextFontFamily=" + this.c + ')';
        }

        public a() {
            this(1, 17.0f, FontFamily.REGULAR);
        }
    }

    public /* synthetic */ ler0(int i) {
        this(true, Float.valueOf(0.5f), 8.0f, null, new b(0));
    }
}
