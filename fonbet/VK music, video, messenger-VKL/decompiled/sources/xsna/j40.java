package xsna;

import java.util.PriorityQueue;

/* compiled from: ActionQueueManager.kt */
/* loaded from: classes16.dex */
public final class j40 {
    public a a;
    public final PriorityQueue<a> b = new PriorityQueue<>();

    /* compiled from: ActionQueueManager.kt */
    public static final class a implements Comparable<a> {
        public final int b;
        public final gzs<s3q0> c;

        public a(int i, gzs<s3q0> gzsVar) {
            this.b = i;
            this.c = gzsVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return epx.g(this.b, aVar.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionData(priority=");
            sb.append(this.b);
            sb.append(", action=");
            return uf3.d(sb, this.c, ')');
        }
    }
}
