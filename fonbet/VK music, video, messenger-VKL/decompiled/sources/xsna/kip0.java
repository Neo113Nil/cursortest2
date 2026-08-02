package xsna;

import com.vk.core.network.metrics.traffic.TrafficItem;
import java.util.ArrayList;

/* compiled from: TrafficAccumulator.kt */
/* loaded from: classes.dex */
public final class kip0 {
    public volatile int a;
    public volatile ArrayList<a> b;

    /* compiled from: TrafficAccumulator.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public long a;
        public long b;
        public String c;
        public String d;

        public a(long j, long j2, String str, String str2) {
            this.a = j;
            this.b = j2;
            this.c = str;
            this.d = str2;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void b(long j) {
            this.a = j;
        }

        public final void c(String str) {
            this.d = str;
        }

        public final void d(String str) {
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LengthAndDuration(length=");
            sb.append(this.a);
            sb.append(", duration=");
            sb.append(this.b);
            sb.append(", url=");
            sb.append(this.c);
            sb.append(", method=");
            return ho8.a(sb, this.d, ')');
        }
    }

    public final void a(TrafficItem trafficItem, int i) {
        long currentTimeMillis = System.currentTimeMillis() - trafficItem.e;
        ArrayList<a> arrayList = this.b;
        if (arrayList == null) {
            arrayList = null;
        }
        if (i >= arrayList.size()) {
            ArrayList<a> arrayList2 = this.b;
            (arrayList2 != null ? arrayList2 : null).add(new a(trafficItem.b, currentTimeMillis, trafficItem.d, trafficItem.c));
            return;
        }
        ArrayList<a> arrayList3 = this.b;
        a aVar = (arrayList3 != null ? arrayList3 : null).get(i);
        aVar.b(trafficItem.b);
        aVar.a(currentTimeMillis);
        aVar.d(trafficItem.d);
        aVar.c(trafficItem.c);
    }
}
