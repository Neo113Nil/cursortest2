package xsna;

/* compiled from: OnCnvMsgReadEvent.kt */
/* loaded from: classes2.dex */
public final class b380 extends q490 {
    public final Object c;
    public final long d;
    public final int e;
    public final boolean f;

    public b380(long j, Object obj, boolean z, int i) {
        this.c = obj;
        this.d = j;
        this.e = i;
        this.f = z;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b380)) {
            return false;
        }
        b380 b380Var = (b380) obj;
        return epx.f(this.c, b380Var.c) && this.d == b380Var.d && this.e == b380Var.e && this.f == b380Var.f;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Boolean.hashCode(this.f) + shy.a(this.e, bh10.a((obj == null ? 0 : obj.hashCode()) * 31, 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnCnvMsgReadEvent(changerTag=");
        sb.append(this.c);
        sb.append(", dialogId=");
        sb.append(this.d);
        sb.append(", tillCnvMsgId=");
        sb.append(this.e);
        sb.append(", isIncoming=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
