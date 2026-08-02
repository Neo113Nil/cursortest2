package xsna;

/* compiled from: ProcessVideoFrameEpochs.kt */
/* loaded from: classes3.dex */
public final class chd0 {
    public final long a;
    public final Long b;
    public final Long c;
    public final Integer d;
    public final int e;
    public final int f;
    public final int g;

    public chd0() {
        this(0);
    }

    public static chd0 a(chd0 chd0Var, Long l, Long l2, Integer num, int i) {
        long j = chd0Var.a;
        if ((i & 2) != 0) {
            l = chd0Var.b;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            l2 = chd0Var.c;
        }
        Long l4 = l2;
        if ((i & 8) != 0) {
            num = chd0Var.d;
        }
        chd0Var.getClass();
        return new chd0(j, l3, l4, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chd0)) {
            return false;
        }
        chd0 chd0Var = (chd0) obj;
        return this.a == chd0Var.a && epx.f(this.b, chd0Var.b) && epx.f(this.c, chd0Var.c) && epx.f(this.d, chd0Var.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessVideoFrameEpochs(startFrameProcessingEpoch=");
        sb.append(this.a);
        sb.append(", seekFinishedEpoch=");
        sb.append(this.b);
        sb.append(", processFrameEndedEpoch=");
        sb.append(this.c);
        sb.append(", stepsCount=");
        return uqi.b(sb, this.d, ')');
    }

    public chd0(long j, Long l, Long l2, Integer num) {
        this.a = j;
        this.b = l;
        this.c = l2;
        this.d = num;
        this.e = (int) ((l != null ? l.longValue() : System.currentTimeMillis()) - j);
        this.f = (int) ((l2 != null ? l2.longValue() : System.currentTimeMillis()) - j);
        this.g = num != null ? num.intValue() : -1;
    }

    public /* synthetic */ chd0(int i) {
        this(System.currentTimeMillis(), null, null, null);
    }
}
