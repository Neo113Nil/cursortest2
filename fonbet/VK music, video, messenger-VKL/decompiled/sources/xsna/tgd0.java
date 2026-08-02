package xsna;

/* compiled from: RuntimeUtils.kt */
/* loaded from: classes3.dex */
public final class tgd0 {
    public final int a;
    public final int b;
    public final int c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;

    public tgd0(int i, int i2, int i3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = num;
        this.e = num2;
        this.f = num3;
        this.g = num4;
        this.h = num5;
        this.i = num6;
        this.j = num7;
    }

    public final Integer a() {
        return this.i;
    }

    public final Integer b() {
        return this.j;
    }

    public final int c() {
        return this.c;
    }

    public final Integer d() {
        return this.f;
    }

    public final Integer e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgd0)) {
            return false;
        }
        tgd0 tgd0Var = (tgd0) obj;
        return this.a == tgd0Var.a && this.b == tgd0Var.b && this.c == tgd0Var.c && epx.f(this.d, tgd0Var.d) && epx.f(this.e, tgd0Var.e) && epx.f(this.f, tgd0Var.f) && epx.f(this.g, tgd0Var.g) && epx.f(this.h, tgd0Var.h) && epx.f(this.i, tgd0Var.i) && epx.f(this.j, tgd0Var.j);
    }

    public final int f() {
        return this.b;
    }

    public final Integer g() {
        return this.g;
    }

    public final int h() {
        return this.a;
    }

    public final int hashCode() {
        int a = shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        Integer num = this.d;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.g;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.h;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.i;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.j;
        return hashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public final Integer i() {
        return this.e;
    }

    public final Integer j() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessMemory(totalPssMb=");
        sb.append(this.a);
        sb.append(", nativePssMb=");
        sb.append(this.b);
        sb.append(", dalvikPssMb=");
        sb.append(this.c);
        sb.append(", totalSwapMb=");
        sb.append(this.d);
        sb.append(", totalRssMb=");
        sb.append(this.e);
        sb.append(", graphicsMb=");
        sb.append(this.f);
        sb.append(", stackKb=");
        sb.append(this.g);
        sb.append(", nativePrivateDirtyMb=");
        sb.append(this.h);
        sb.append(", blockingGcCount=");
        sb.append(this.i);
        sb.append(", blockingGcTimeMs=");
        return uqi.b(sb, this.j, ')');
    }
}
