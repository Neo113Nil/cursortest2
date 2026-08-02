package xsna;

/* compiled from: OnReplyButtonChangeEvent.kt */
/* loaded from: classes2.dex */
public final class ua80 extends sxp {
    public final String b = "MsgListComponentNew";
    public final long c;

    public ua80(long j) {
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
        if (!(obj instanceof ua80)) {
            return false;
        }
        ua80 ua80Var = (ua80) obj;
        return epx.f(this.b, ua80Var.b) && this.c == ua80Var.c;
    }

    public final int hashCode() {
        String str = this.b;
        return Long.hashCode(this.c) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnReplyButtonChangeEvent(changerTag=");
        sb.append((Object) this.b);
        sb.append(", dialogId=");
        return vu5.a(')', this.c, sb);
    }
}
