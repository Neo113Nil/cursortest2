package xsna;

/* compiled from: VKAvatarBorderConfig.kt */
/* loaded from: classes15.dex */
public final class l9r0 {
    public final boolean a;
    public final Integer b;
    public final float c;
    public final float d;
    public final boolean e;
    public final a f;
    public final float g;
    public final float h;
    public final boolean i;

    /* compiled from: VKAvatarBorderConfig.kt */
    public static final class a {
        public final String a;

        public a() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AnimationConfig(lottieAnimationFile="), this.a, ')');
        }

        public a(String str) {
            this.a = str;
        }
    }

    public l9r0(boolean z, Integer num, float f, float f2, boolean z2, a aVar, float f3, float f4, boolean z3) {
        this.a = z;
        this.b = num;
        this.c = f;
        this.d = f2;
        this.e = z2;
        this.f = aVar;
        this.g = f3;
        this.h = f4;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9r0)) {
            return false;
        }
        l9r0 l9r0Var = (l9r0) obj;
        return this.a == l9r0Var.a && epx.f(this.b, l9r0Var.b) && Float.compare(this.c, l9r0Var.c) == 0 && Float.compare(this.d, l9r0Var.d) == 0 && this.e == l9r0Var.e && epx.f(this.f, l9r0Var.f) && Float.compare(this.g, l9r0Var.g) == 0 && Float.compare(this.h, l9r0Var.h) == 0 && this.i == l9r0Var.i;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.i) + io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, (this.f.hashCode() + qoy.b(io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31, this.e)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKAvatarBorderConfig(solidFillAroundAvatarEnabled=");
        sb.append(this.a);
        sb.append(", solidFillAroundAvatarColor=");
        sb.append(this.b);
        sb.append(", borderStrokeWidth=");
        sb.append(this.c);
        sb.append(", borderWidth=");
        sb.append(this.d);
        sb.append(", contourOverlayEnabled=");
        sb.append(this.e);
        sb.append(", animation=");
        sb.append(this.f);
        sb.append(", storyBorderStrokeWidth=");
        sb.append(this.g);
        sb.append(", storyBorderPadding=");
        sb.append(this.h);
        sb.append(", isBorderConsideredInMeasure=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
