package xsna;

import android.os.SystemClock;
import com.vk.log.L;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: LogThrottler.kt */
/* loaded from: classes7.dex */
public final class v000 {
    public final HashMap<String, b> a = new HashMap<>();
    public final HashMap<String, a> b = new HashMap<>();

    /* compiled from: LogThrottler.kt */
    public static final class a {
        public long a;
        public int b;
    }

    /* compiled from: LogThrottler.kt */
    public static final class b {
        public final long a;
        public final int b;
        public final String c;
        public final long d;

        public b(long j, int i, String str) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.a = j;
            this.b = i;
            this.c = str;
            this.d = timeUnit.toMillis(j);
        }

        public static b a(b bVar, String str) {
            long j = bVar.a;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            return new b(j, bVar.b, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a) {
                return false;
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            return this.b == bVar.b && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, (TimeUnit.SECONDS.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ThrottleItem(timeInterval=");
            sb.append(this.a);
            sb.append(", timeIntervalTimeUnit=");
            sb.append(TimeUnit.SECONDS);
            sb.append(", allowedLogNumberPerInterval=");
            sb.append(this.b);
            sb.append(", logTag=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public final void a(b bVar) {
        this.a.put(bVar.c, bVar);
    }

    public final boolean b(String str) {
        b bVar = this.a.get(str);
        if (bVar != null) {
            int i = bVar.b;
            long j = bVar.d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            HashMap<String, a> hashMap = this.b;
            a aVar = hashMap.get(str);
            if (aVar == null) {
                aVar = new a();
                aVar.a = elapsedRealtime;
                aVar.b = 0;
                hashMap.put(str, aVar);
            }
            a aVar2 = aVar;
            if (aVar2.a < elapsedRealtime - j) {
                int i2 = aVar2.b - i;
                if (i2 > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append(" logs for ");
                    sb.append(str);
                    sb.append(" was skipped during ");
                    L.A("LogThrottler", efz.b(j, " ms", sb));
                }
                aVar2.a = elapsedRealtime;
                aVar2.b = 0;
            }
            int i3 = aVar2.b + 1;
            aVar2.b = i3;
            if (i3 > i) {
                return false;
            }
        }
        return true;
    }
}
