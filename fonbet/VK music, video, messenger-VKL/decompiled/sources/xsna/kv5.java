package xsna;

import com.vk.core.tool.compose.blur.GradientDirection;

/* compiled from: BackdropBlur.kt */
/* loaded from: classes17.dex */
final class kv5 extends d730<ov5> {
    public final rv5 a;
    public final float b;
    public final boolean c = true;
    public final GradientDirection d;
    public final yk8 e;
    public final yk8 f;

    public kv5(rv5 rv5Var, float f, GradientDirection gradientDirection, yk8 yk8Var, yk8 yk8Var2) {
        this.a = rv5Var;
        this.b = f;
        this.d = gradientDirection;
        this.e = yk8Var;
        this.f = yk8Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv5)) {
            return false;
        }
        kv5 kv5Var = (kv5) obj;
        return epx.f(this.a, kv5Var.a) && pco.b(this.b, kv5Var.b) && this.c == kv5Var.c && this.d == kv5Var.d && epx.f(this.e, kv5Var.e) && epx.f(this.f, kv5Var.f);
    }

    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        GradientDirection gradientDirection = this.d;
        int hashCode = (b + (gradientDirection == null ? 0 : gradientDirection.hashCode())) * 31;
        yk8 yk8Var = this.e;
        int hashCode2 = (hashCode + (yk8Var == null ? 0 : yk8Var.hashCode())) * 31;
        yk8 yk8Var2 = this.f;
        return hashCode2 + (yk8Var2 != null ? yk8Var2.hashCode() : 0);
    }

    @Override // xsna.d730
    public final ov5 r() {
        return new ov5(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // xsna.d730
    public final void s(ov5 ov5Var) {
        ov5 ov5Var2 = ov5Var;
        s5 s5Var = ov5Var2.F;
        rv5 rv5Var = ov5Var2.p;
        rv5 rv5Var2 = this.a;
        if (rv5Var != rv5Var2) {
            rv5Var.d.remove(s5Var);
            rv5Var2.d.add(s5Var);
            ov5Var2.p = rv5Var2;
        }
        ov5Var2.q = this.b;
        ov5Var2.r = this.c;
        ov5Var2.s = this.d;
        ov5Var2.t = this.e;
        ov5Var2.u = this.f;
        mio.a(ov5Var2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackdropBlurElement(state=");
        sb.append(this.a);
        sb.append(", radius=");
        oq.f(this.b, ", enabled=", sb);
        sb.append(this.c);
        sb.append(", gradientDirection=");
        sb.append(this.d);
        sb.append(", colorOverlay=");
        sb.append(this.e);
        sb.append(", fallbackColorOverlay=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
