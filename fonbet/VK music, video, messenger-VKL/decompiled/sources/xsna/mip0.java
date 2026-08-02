package xsna;

import android.content.SharedPreferences;
import android.net.TrafficStats;
import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: TrafficMonitor.kt */
/* loaded from: classes17.dex */
public final class mip0 implements Runnable {
    public final SharedPreferences b;
    public final oip0 c;
    public volatile boolean d = true;

    /* compiled from: TrafficMonitor.kt */
    public static final class a {
        public static void a(SharedPreferences sharedPreferences, twa twaVar) {
            synchronized (sharedPreferences) {
                twaVar.invoke(new b(sharedPreferences.getLong("traffic_monitoring_timestamp", 0L), sharedPreferences.getLong("traffic_monitoring_tx_bytes", 0L), sharedPreferences.getLong("traffic_monitoring_rx_bytes", 0L)), new b(sharedPreferences.getLong("traffic_monitoring_timestamp_background", 0L), sharedPreferences.getLong("traffic_monitoring_tx_bytes_background", 0L), sharedPreferences.getLong("traffic_monitoring_rx_bytes_background", 0L)));
                sharedPreferences.edit().clear();
            }
        }

        public static void b(SharedPreferences sharedPreferences, ThreadFactory threadFactory, oip0 oip0Var) {
            threadFactory.newThread(new mip0(sharedPreferences, oip0Var)).start();
        }
    }

    /* compiled from: TrafficMonitor.kt */
    public static final class b {
        public final long a;
        public final long b;
        public final long c;

        public b(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public final long a() {
            return this.c;
        }

        public final long b() {
            return this.a;
        }

        public final long c() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Traffic(timestamp=");
            sb.append(this.a);
            sb.append(", tx=");
            sb.append(this.b);
            sb.append(", rx=");
            return vu5.a(')', this.c, sb);
        }
    }

    public mip0(SharedPreferences sharedPreferences, oip0 oip0Var) {
        this.b = sharedPreferences;
        this.c = oip0Var;
    }

    public final void a(b bVar, boolean z) {
        synchronized (this.b) {
            String str = z ? "" : "_background";
            try {
                SharedPreferences sharedPreferences = this.b;
                long j = sharedPreferences.getLong("traffic_monitoring_timestamp".concat(str), 0L);
                long j2 = sharedPreferences.getLong("traffic_monitoring_tx_bytes".concat(str), 0L);
                long j3 = sharedPreferences.getLong("traffic_monitoring_rx_bytes".concat(str), 0L);
                long j4 = bVar.a + j;
                sharedPreferences.edit().putLong("traffic_monitoring_timestamp".concat(str), j4).putLong("traffic_monitoring_tx_bytes".concat(str), bVar.b + j2).putLong("traffic_monitoring_rx_bytes".concat(str), bVar.c + j3).commit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (this.b) {
                try {
                    boolean z2 = this.c.b;
                    int myUid = Process.myUid();
                    long j = this.b.getLong("last_traffic_monitoring_timestamp", System.currentTimeMillis());
                    long j2 = this.b.getLong("last_traffic_monitoring_tx_bytes", TrafficStats.getUidTxBytes(myUid));
                    long j3 = this.b.getLong("last_traffic_monitoring_rx_bytes", TrafficStats.getUidRxBytes(myUid));
                    long currentTimeMillis = System.currentTimeMillis();
                    long uidTxBytes = TrafficStats.getUidTxBytes(myUid);
                    long uidRxBytes = TrafficStats.getUidRxBytes(myUid);
                    b bVar = new b(currentTimeMillis - j, uidTxBytes - j2, uidRxBytes - j3);
                    if (!z2 && !this.d) {
                        z = false;
                        a(bVar, z);
                        SharedPreferences.Editor edit = this.b.edit();
                        edit.putLong("last_traffic_monitoring_timestamp", currentTimeMillis);
                        edit.putLong("last_traffic_monitoring_tx_bytes", uidTxBytes);
                        edit.putLong("last_traffic_monitoring_rx_bytes", uidRxBytes);
                        edit.commit();
                        this.d = z2;
                        s3q0 s3q0Var = s3q0.a;
                    }
                    z = true;
                    a(bVar, z);
                    SharedPreferences.Editor edit2 = this.b.edit();
                    edit2.putLong("last_traffic_monitoring_timestamp", currentTimeMillis);
                    edit2.putLong("last_traffic_monitoring_tx_bytes", uidTxBytes);
                    edit2.putLong("last_traffic_monitoring_rx_bytes", uidRxBytes);
                    edit2.commit();
                    this.d = z2;
                    s3q0 s3q0Var2 = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Thread.sleep(10000L);
        }
    }
}
