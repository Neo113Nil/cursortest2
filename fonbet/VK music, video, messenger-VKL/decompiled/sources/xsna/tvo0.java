package xsna;

import java.lang.Number;
import java.util.ArrayList;
import one.video.streaming.tools.TimeMachine;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: TimeWindowAverage.kt */
/* loaded from: classes8.dex */
public class tvo0<SampleType extends Number> {
    public final long a;
    public final TimeMachine b;
    public final ArrayList c = new ArrayList();
    public double d;
    public final long e;

    /* compiled from: TimeWindowAverage.kt */
    public static final class a<SampleType> {
        public final long a;
        public final Number b;

        public a(long j, Number number) {
            this.a = j;
            this.b = number;
        }
    }

    public tvo0(long j, TimeMachine timeMachine) {
        this.a = j;
        this.b = timeMachine;
        this.e = j < 1000 ? j / 2 : 1000L;
    }

    public static void a(tvo0 tvo0Var, Number number) {
        long currentTimeMillis = tvo0Var.b.currentTimeMillis();
        tvo0Var.c.add(new a(currentTimeMillis, number));
        tvo0Var.d = number.doubleValue() + tvo0Var.d;
        tvo0Var.c(currentTimeMillis);
    }

    public static double b(tvo0 tvo0Var) {
        tvo0Var.c(tvo0Var.b.currentTimeMillis());
        ArrayList arrayList = tvo0Var.c;
        int size = arrayList.size();
        if (size == 0) {
            return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
        double d = tvo0Var.d;
        if (size != 1) {
            long j = ((a) arrayList.get(size - 1)).a - ((a) arrayList.get(0)).a;
            if (j >= tvo0Var.e) {
                return (d * 1000) / j;
            }
        }
        return d;
    }

    public final void c(long j) {
        long j2 = j - this.a;
        while (true) {
            ArrayList arrayList = this.c;
            if (arrayList.isEmpty() || ((a) arrayList.get(0)).a >= j2) {
                return;
            } else {
                this.d -= ((a) arrayList.remove(0)).b.doubleValue();
            }
        }
    }
}
