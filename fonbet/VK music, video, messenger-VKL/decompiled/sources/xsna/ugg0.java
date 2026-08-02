package xsna;

import java.util.List;

/* compiled from: ReviewBodyData.kt */
/* loaded from: classes18.dex */
public final class ugg0 {
    public final List<y2u0> a;
    public final dce0 b;
    public final odo0 c;
    public final boolean d;

    public ugg0(List<y2u0> list, dce0 dce0Var, odo0 odo0Var, boolean z) {
        this.a = list;
        this.b = dce0Var;
        this.c = odo0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugg0)) {
            return false;
        }
        ugg0 ugg0Var = (ugg0) obj;
        return epx.f(this.a, ugg0Var.a) && epx.f(this.b, ugg0Var.b) && epx.f(this.c, ugg0Var.c) && this.d == ugg0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewBodyData(images=");
        sb.append(this.a);
        sb.append(", publishInfo=");
        sb.append(this.b);
        sb.append(", textData=");
        sb.append(this.c);
        sb.append(", isReplyBtnVisible=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
