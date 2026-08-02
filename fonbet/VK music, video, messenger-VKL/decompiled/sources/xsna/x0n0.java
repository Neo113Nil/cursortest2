package xsna;

import java.util.List;

/* compiled from: AnimatedSubtitleView.kt */
/* loaded from: classes6.dex */
public final class x0n0 {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final List<String> e;
    public final boolean f;
    public final int g;
    public final gzs<s3q0> h;
    public final boolean i;
    public final Integer j;

    public x0n0(String str, Integer num, Integer num2, String str2, List list, boolean z, int i, jl4 jl4Var, boolean z2, Integer num3) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = list;
        this.f = z;
        this.g = i;
        this.h = jl4Var;
        this.i = z2;
        this.j = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0n0)) {
            return false;
        }
        x0n0 x0n0Var = (x0n0) obj;
        return epx.f(this.a, x0n0Var.a) && epx.f(this.b, x0n0Var.b) && epx.f(this.c, x0n0Var.c) && epx.f(this.d, x0n0Var.d) && epx.f(this.e, x0n0Var.e) && this.f == x0n0Var.f && this.g == x0n0Var.g && epx.f(this.h, x0n0Var.h) && this.i == x0n0Var.i && epx.f(this.j, x0n0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.e;
        int a = shy.a(this.g, qoy.b((hashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f), 31);
        gzs<s3q0> gzsVar = this.h;
        int b = qoy.b((a + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31, 31, this.i);
        Integer num3 = this.j;
        return b + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleMeta(text=");
        sb.append(this.a);
        sb.append(", startIconRes=");
        sb.append(this.b);
        sb.append(", endIconRes=");
        sb.append(this.c);
        sb.append(", lottieFileName=");
        sb.append(this.d);
        sb.append(", photos=");
        sb.append(this.e);
        sb.append(", chevron=");
        sb.append(this.f);
        sb.append(", maxLines=");
        sb.append(this.g);
        sb.append(", onClick=");
        sb.append(this.h);
        sb.append(", clickable=");
        sb.append(this.i);
        sb.append(", endIconTintRes=");
        return uqi.b(sb, this.j, ')');
    }
}
