package xsna;

import xsna.xh60;

/* compiled from: NewsfeedEvent.kt */
/* loaded from: classes4.dex */
public final class bi60 implements xh60.h {
    public final zjm0 a;
    public final k070 b;

    public bi60(zjm0 zjm0Var, k070 k070Var) {
        this.a = zjm0Var;
        this.b = k070Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi60)) {
            return false;
        }
        bi60 bi60Var = (bi60) obj;
        return epx.f(this.a, bi60Var.a) && epx.f(this.b, bi60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Done(story=" + this.a + ", stories=" + this.b + ')';
    }
}
