package xsna;

/* compiled from: ClipCtaWithDonutViewState.kt */
/* loaded from: classes16.dex */
public final class xjk {
    public final int a;
    public final boolean b;
    public final tlo0 c;
    public final tlo0 d;

    public xjk(int i, boolean z, tlo0 tlo0Var, tlo0 tlo0Var2) {
        this.a = i;
        this.b = z;
        this.c = tlo0Var;
        this.d = tlo0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjk)) {
            return false;
        }
        xjk xjkVar = (xjk) obj;
        return this.a == xjkVar.a && this.b == xjkVar.b && epx.f(this.c, xjkVar.c) && epx.f(this.d, xjkVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.vk.movika.sdk.base.model.history.b.a(qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CtaAction(id=");
        sb.append(this.a);
        sb.append(", isChecked=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        return bt.a(sb, this.d, ')');
    }
}
