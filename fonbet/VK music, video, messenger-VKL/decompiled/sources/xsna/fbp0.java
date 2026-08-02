package xsna;

import java.util.List;

/* compiled from: TopshelfCardConfig.kt */
/* loaded from: classes2.dex */
public final class fbp0 {
    public final float a;
    public final long b;
    public final List c;

    public fbp0(float f, jgz jgzVar, long j, List list) {
        this.a = f;
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbp0)) {
            return false;
        }
        fbp0 fbp0Var = (fbp0) obj;
        return pco.b(this.a, fbp0Var.a) && epx.f(null, null) && l5g.d(this.b, fbp0Var.b) && epx.f(this.c, fbp0Var.c);
    }

    public final int hashCode() {
        int hashCode = ((Float.hashCode(this.a) * 31) + 0) * 31;
        int i = l5g.l;
        return this.c.hashCode() + bh10.a(hashCode, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfCardScrimAppearance(gradientTopOverflow=");
        oq.f(this.a, ", blur=", sb);
        sb.append((Object) null);
        sb.append(", color=");
        dn.h(this.b, ", gradientAlphaStops=", sb);
        return jr.a(')', sb, this.c);
    }
}
