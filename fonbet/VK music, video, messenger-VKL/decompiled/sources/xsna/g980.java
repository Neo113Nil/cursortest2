package xsna;

/* compiled from: OnMsgEditEvent.kt */
/* loaded from: classes2.dex */
public final class g980 extends q490 {
    public final Object c;
    public final long d;
    public final int e;

    public g980(Object obj, long j, int i) {
        this.c = obj;
        this.d = j;
        this.e = i;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g980)) {
            return false;
        }
        g980 g980Var = (g980) obj;
        return epx.f(this.c, g980Var.c) && this.d == g980Var.d && this.e == g980Var.e;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Integer.hashCode(this.e) + bh10.a((obj == null ? 0 : obj.hashCode()) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMsgEditEvent(changerTag=");
        sb.append(this.c);
        sb.append(", dialogId=");
        sb.append(this.d);
        sb.append(", msgId=");
        return vu5.b(sb, this.e, ')');
    }
}
