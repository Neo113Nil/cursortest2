package xsna;

/* compiled from: VKAvatarBorderConfigParamsOverride.kt */
/* loaded from: classes15.dex */
public final class o9r0 {
    public final boolean a;
    public final Integer b;
    public final Float c;
    public final Float d;
    public final boolean e;
    public final a f;
    public final Float g;
    public final Float h;
    public final Float i;
    public final xp5 j;
    public final boolean k;

    /* compiled from: VKAvatarBorderConfigParamsOverride.kt */
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
            return ho8.a(new StringBuilder("AnimationConfigParamsOverride(lottieAnimationFile="), this.a, ')');
        }

        public a(String str) {
            this.a = str;
        }
    }

    public o9r0() {
        this(false, null, null, null, false, null, null, null, null, 2047);
    }

    public static o9r0 a(o9r0 o9r0Var, boolean z, Integer num, Float f, Float f2, Float f3, Float f4, Float f5, xp5 xp5Var, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = o9r0Var.a;
        }
        boolean z3 = z;
        Integer num2 = (i & 2) != 0 ? o9r0Var.b : num;
        Float f6 = (i & 4) != 0 ? o9r0Var.c : f;
        Float f7 = (i & 8) != 0 ? o9r0Var.d : f2;
        boolean z4 = o9r0Var.e;
        a aVar = o9r0Var.f;
        Float f8 = (i & 64) != 0 ? o9r0Var.g : f3;
        Float f9 = (i & 128) != 0 ? o9r0Var.h : f4;
        Float f10 = (i & 256) != 0 ? o9r0Var.i : f5;
        xp5 xp5Var2 = (i & 512) != 0 ? o9r0Var.j : xp5Var;
        boolean z5 = (i & 1024) != 0 ? o9r0Var.k : z2;
        o9r0Var.getClass();
        return new o9r0(z3, num2, f6, f7, z4, aVar, f8, f9, f10, xp5Var2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9r0)) {
            return false;
        }
        o9r0 o9r0Var = (o9r0) obj;
        return this.a == o9r0Var.a && epx.f(this.b, o9r0Var.b) && epx.f(this.c, o9r0Var.c) && epx.f(this.d, o9r0Var.d) && this.e == o9r0Var.e && epx.f(this.f, o9r0Var.f) && epx.f(this.g, o9r0Var.g) && epx.f(this.h, o9r0Var.h) && epx.f(this.i, o9r0Var.i) && epx.f(this.j, o9r0Var.j) && this.k == o9r0Var.k;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.c;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.d;
        int hashCode4 = (this.f.hashCode() + qoy.b((hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31, 31, this.e)) * 31;
        Float f3 = this.g;
        int hashCode5 = (hashCode4 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.h;
        int hashCode6 = (hashCode5 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.i;
        int hashCode7 = f5 != null ? f5.hashCode() : 0;
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + ((hashCode6 + hashCode7) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKAvatarBorderConfigParamsOverride(solidFillAroundAvatarEnabled=");
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
        sb.append(", avatarImageSize=");
        sb.append(this.i);
        sb.append(", avatarBorderColorsProvider=");
        sb.append(this.j);
        sb.append(", isBorderConsideredInMeasure=");
        return defpackage.q0.a(sb, this.k, ')');
    }

    public o9r0(boolean z, Integer num, Float f, Float f2, boolean z2, a aVar, Float f3, Float f4, Float f5, xp5 xp5Var, boolean z3) {
        this.a = z;
        this.b = num;
        this.c = f;
        this.d = f2;
        this.e = z2;
        this.f = aVar;
        this.g = f3;
        this.h = f4;
        this.i = f5;
        this.j = xp5Var;
        this.k = z3;
    }

    public o9r0(boolean z, Integer num, Float f, Float f2, boolean z2, a aVar, Float f3, Float f4, Float f5, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? new a(null) : aVar, (i & 64) != 0 ? null : f3, (i & 128) != 0 ? null : f4, (i & 256) != 0 ? null : f5, new wp5(), true);
    }
}
