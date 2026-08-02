package xsna;

import com.vk.im.engine.models.d;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.log.L;
import java.util.Random;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: PerformanceMeasuringSampler.kt */
/* loaded from: classes2.dex */
public final class hw90 {
    public static final Random b = new Random();
    public final cau0 a;

    public hw90(cau0 cau0Var) {
        this.a = cau0Var;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    public final boolean a(PerformanceEventType performanceEventType) {
        Double d;
        cau0 cau0Var = this.a;
        com.vk.im.engine.models.d a = cau0Var.f.a();
        if (a == null) {
            com.vk.im.engine.models.d dVar = com.vk.im.engine.models.d.d;
            d.a.a();
            a = com.vk.im.engine.models.d.d;
        }
        if (!a.a) {
            a = null;
        }
        if (a != null) {
            L.e("PerformanceMeasuringSampler", "using experiments toggle config");
        } else {
            a = null;
        }
        if (a == null) {
            a = cau0Var.d.a();
            if (a == null) {
                com.vk.im.engine.models.d dVar2 = com.vk.im.engine.models.d.d;
                d.a.a();
                a = com.vk.im.engine.models.d.d;
            }
            if (!a.a) {
                a = null;
            }
            if (a != null) {
                L.e("PerformanceMeasuringSampler", "using new toggle config");
            } else {
                a = null;
            }
            if (a == null) {
                com.vk.im.engine.models.d a2 = cau0Var.e.a();
                if (a2 == null) {
                    com.vk.im.engine.models.d dVar3 = com.vk.im.engine.models.d.d;
                    d.a.a();
                    a2 = com.vk.im.engine.models.d.d;
                }
                a = a2.a ? a2 : null;
                if (a != null) {
                    L.e("PerformanceMeasuringSampler", "using base toggle config");
                } else {
                    a = null;
                }
            }
        }
        if (a != null) {
            Double d2 = (Double) a.c.get(performanceEventType.h());
            d = Double.valueOf(d2 != null ? d2.doubleValue() : a.b);
        } else {
            d = null;
        }
        Double d3 = epx.b(d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE) ? null : d;
        boolean z = false;
        if (d3 != null) {
            double doubleValue = d3.doubleValue();
            double nextDouble = b.nextDouble();
            L.e("PerformanceMeasuringSampler", "event=" + performanceEventType.h() + ", generated value=" + nextDouble);
            if (nextDouble <= doubleValue) {
                z = true;
            }
        }
        L.e("PerformanceMeasuringSampler", "event=" + performanceEventType.h() + ", needToMeasure=" + z);
        return z;
    }
}
