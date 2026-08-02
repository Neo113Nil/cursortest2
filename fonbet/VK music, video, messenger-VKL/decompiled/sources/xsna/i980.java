package xsna;

/* compiled from: OnMsgFailedEvent.kt */
/* loaded from: classes2.dex */
public final class i980 extends q490 {
    public final String c;
    public final long d;
    public final int e;
    public final Throwable f;

    public i980(String str, Throwable th, int i, long j) {
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = th;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i980)) {
            return false;
        }
        i980 i980Var = (i980) obj;
        return epx.f(this.c, i980Var.c) && this.d == i980Var.d && this.e == i980Var.e && epx.f(this.f, i980Var.f);
    }

    public final int hashCode() {
        String str = this.c;
        return this.f.hashCode() + shy.a(this.e, bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMsgFailedEvent(changerTag=");
        sb.append((Object) this.c);
        sb.append(", dialogId=");
        sb.append(this.d);
        sb.append(", msgId=");
        sb.append(this.e);
        sb.append(", e=");
        return oq.c(sb, this.f, ')');
    }
}
