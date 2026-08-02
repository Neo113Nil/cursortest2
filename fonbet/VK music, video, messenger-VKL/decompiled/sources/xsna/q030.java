package xsna;

/* compiled from: ModalPostAnalyticsNewsEntryData.kt */
/* loaded from: classes4.dex */
public final class q030 {
    public final Long a;
    public final long b;
    public final String c;

    public q030(String str, Long l, long j) {
        this.a = l;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q030)) {
            return false;
        }
        q030 q030Var = (q030) obj;
        return epx.f(this.a, q030Var.a) && this.b == q030Var.b && epx.f(this.c, q030Var.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int a = bh10.a((l == null ? 0 : l.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalPostAnalyticsNewsEntryData(postId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", trackCode=");
        return ho8.a(sb, this.c, ')');
    }
}
