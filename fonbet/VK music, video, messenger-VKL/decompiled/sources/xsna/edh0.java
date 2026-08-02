package xsna;

import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.Constants$CounterNames;

/* compiled from: ScreenTraceUtil.java */
/* loaded from: classes13.dex */
public final class edh0 {
    public static final ra2 a = ra2.d();

    public static void a(Trace trace, ofs ofsVar) {
        int i = ofsVar.a;
        int i2 = ofsVar.c;
        int i3 = ofsVar.b;
        if (i > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_TOTAL.toString(), i);
        }
        if (i3 > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_SLOW.toString(), i3);
        }
        if (i2 > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_FROZEN.toString(), i2);
        }
        String str = trace.e;
        a.a();
    }
}
