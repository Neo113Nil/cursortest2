package xsna;

/* compiled from: ChannelSortId.kt */
/* loaded from: classes2.dex */
public final class vcb implements Comparable<vcb> {
    public static final vcb d = new vcb(0, vjm.l);
    public final vjm b;
    public final long c;

    public vcb(long j, vjm vjmVar) {
        this.b = vjmVar;
        this.c = j;
    }

    public static vcb b(vcb vcbVar, vjm vjmVar, long j, int i) {
        if ((i & 1) != 0) {
            vjmVar = vcbVar.b;
        }
        if ((i & 2) != 0) {
            j = vcbVar.c;
        }
        vcbVar.getClass();
        return new vcb(j, vjmVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(vcb vcbVar) {
        Integer valueOf = Integer.valueOf(this.b.compareTo(vcbVar.b));
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : epx.h(vcbVar.c, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcb)) {
            return false;
        }
        vcb vcbVar = (vcb) obj;
        return epx.f(this.b, vcbVar.b) && this.c == vcbVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelSortId(base=");
        sb.append(this.b);
        sb.append(", channelId=");
        return vu5.a(')', this.c, sb);
    }

    public vcb(int i, int i2, long j) {
        this(j, new vjm(i, i2));
    }

    public vcb(long j, long j2) {
        this(j2, new vjm(j));
    }
}
