package xsna;

/* compiled from: ChannelWeight.kt */
/* loaded from: classes16.dex */
public final class aeb implements Comparable<aeb> {
    public static final aeb d = new aeb(gkx0.d, 0);
    public static final aeb e = new aeb(gkx0.e, 0);
    public final gkx0 b;
    public final long c;

    /* compiled from: ChannelWeight.kt */
    public static final class a {
    }

    public aeb(gkx0 gkx0Var, long j) {
        this.b = gkx0Var;
        this.c = j;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(aeb aebVar) {
        Integer valueOf = Integer.valueOf(this.b.compareTo(aebVar.b));
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : epx.h(aebVar.c, this.c);
    }

    public final boolean c() {
        return this.b.equals(gkx0.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeb)) {
            return false;
        }
        aeb aebVar = (aeb) obj;
        return epx.f(this.b, aebVar.b) && this.c == aebVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelWeight(base=");
        sb.append(this.b);
        sb.append(", channelId=");
        return vu5.a(')', this.c, sb);
    }
}
