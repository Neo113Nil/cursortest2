package xsna;

/* compiled from: OnDraftUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class t580 extends sxp {
    public final Object b;
    public final long c;

    public t580(Object obj, long j) {
        this.b = obj;
        this.c = j;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t580)) {
            return false;
        }
        t580 t580Var = (t580) obj;
        return epx.f(this.b, t580Var.b) && this.c == t580Var.c;
    }

    public final int hashCode() {
        Object obj = this.b;
        return Long.hashCode(this.c) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDraftUpdateEvent(changerTag=");
        sb.append(this.b);
        sb.append(", dialogId=");
        return vu5.a(')', this.c, sb);
    }
}
