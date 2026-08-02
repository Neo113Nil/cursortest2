package xsna;

import android.util.Size;

/* compiled from: SceneParams.kt */
/* loaded from: classes8.dex */
public final class r5h0 {
    public final Size a;
    public final Size b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;

    public r5h0() {
        this(null, null);
    }

    public final float a() {
        return ((Number) this.f.getValue()).floatValue();
    }

    public final float b() {
        return ((Number) this.e.getValue()).floatValue();
    }

    public final float c() {
        return ((Number) this.d.getValue()).floatValue();
    }

    public final float d() {
        return ((Number) this.c.getValue()).floatValue();
    }

    public final boolean e() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5h0)) {
            return false;
        }
        r5h0 r5h0Var = (r5h0) obj;
        return epx.f(this.a, r5h0Var.a) && epx.f(this.b, r5h0Var.b);
    }

    public final int hashCode() {
        Size size = this.a;
        int hashCode = (size == null ? 0 : size.hashCode()) * 31;
        Size size2 = this.b;
        return hashCode + (size2 != null ? size2.hashCode() : 0);
    }

    public final String toString() {
        return "SceneParams(viewportSize=" + this.a + ", videoSize=" + this.b + ")";
    }

    public r5h0(Size size, Size size2) {
        this.a = size;
        this.b = size2;
        this.c = new bpn0(new kr50(this, 24));
        this.d = new bpn0(new gd40(this, 22));
        this.e = new bpn0(new kr6(21));
        this.f = new bpn0(new rf20(this, 25));
        this.g = new bpn0(new hk70(this, 16));
    }
}
