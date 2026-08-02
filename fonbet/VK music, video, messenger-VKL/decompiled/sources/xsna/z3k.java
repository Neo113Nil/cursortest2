package xsna;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.Nullable;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.d;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: CpuGaugeCollector.java */
/* loaded from: classes13.dex */
public final class z3k {
    public static final ra2 g = ra2.d();
    public static final long h = TimeUnit.SECONDS.toMicros(1);

    @Nullable
    public ScheduledFuture e = null;
    public long f = -1;
    public final ConcurrentLinkedQueue<com.google.firebase.perf.v1.d> a = new ConcurrentLinkedQueue<>();
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public final String c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    public final long d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void a(long j, Timer timer) {
        this.f = j;
        try {
            this.e = this.b.scheduleAtFixedRate(new te9(2, this, timer), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            ra2 ra2Var = g;
            e.getMessage();
            ra2Var.h();
        }
    }

    @Nullable
    public final com.google.firebase.perf.v1.d b(Timer timer) {
        long j = this.d;
        ra2 ra2Var = g;
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.c));
            try {
                long d = timer.d() + timer.b;
                String[] split = bufferedReader.readLine().split(" ");
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                long parseLong3 = Long.parseLong(split[14]);
                long parseLong4 = Long.parseLong(split[16]);
                d.b g2 = com.google.firebase.perf.v1.d.g();
                g2.b(d);
                double d2 = (parseLong3 + parseLong4) / j;
                long j2 = h;
                g2.d(Math.round(d2 * j2));
                g2.f(Math.round(((parseLong + parseLong2) / j) * j2));
                com.google.firebase.perf.v1.d build = g2.build();
                bufferedReader.close();
                return build;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e.getMessage();
            ra2Var.h();
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            e.getMessage();
            ra2Var.h();
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            e.getMessage();
            ra2Var.h();
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            e.getMessage();
            ra2Var.h();
            return null;
        }
    }
}
