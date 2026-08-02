package xsna;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: BatchUploadMetricCollector.kt */
/* loaded from: classes6.dex */
public final class cv6 implements w8i {
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final bpn0 d = new bpn0(new in0(this, 9));

    /* compiled from: BatchUploadMetricCollector.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final long c;

        public a(int i, int i2, long j) {
            this.a = i;
            this.b = i2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TempStat(taskCount=");
            sb.append(this.a);
            sb.append(", collectedSize=");
            sb.append(this.b);
            sb.append(", collectedDuration=");
            return vu5.a(')', this.c, sb);
        }
    }

    public final synchronized void a(int i, Set set) {
        this.b.add(j5g.R0(set));
        this.c.add(new a(i, 0, 0L));
    }
}
