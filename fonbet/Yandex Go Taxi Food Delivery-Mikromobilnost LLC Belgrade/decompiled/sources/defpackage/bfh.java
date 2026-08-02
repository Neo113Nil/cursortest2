package defpackage;

import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.pulse.PowerStateChangeDetector;
import com.yandex.pulse.ProcessCpuMonitoringParams;
import com.yandex.pulse.PulseService;
import com.yandex.pulse.metrics.MetricsState;
import com.yandex.pulse.metrics.NetworkChangeDetector;
import com.yandex.pulse.processcpu.MeasurementTask;
import com.yandex.pulse.utils.RunnableScheduler;
import java.util.Iterator;
import kotlin.collections.a;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class bfh implements u941, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bfh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof u941) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof u941) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof u941) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof u941) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof u941) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof u941) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof u941) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return getFunctionDelegate().equals(((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (tls) obj;
            case 1:
                return new FunctionReferenceImpl(1, (MeasurementTask) obj, MeasurementTask.class, "onPostExecute", "onPostExecute(Landroid/os/Message;)V", 0);
            case 2:
                return new FunctionReferenceImpl(1, (MetricsState) obj, MetricsState.class, "handleStoreMessage", "handleStoreMessage(Landroid/os/Message;)V", 0);
            case 3:
                return new FunctionReferenceImpl(1, (NetworkChangeDetector) obj, NetworkChangeDetector.class, "handleMessage", "handleMessage(Landroid/os/Message;)V", 0);
            case 4:
                return new FunctionReferenceImpl(1, (PowerStateChangeDetector) obj, PowerStateChangeDetector.class, "handleMessage", "handleMessage(Landroid/os/Message;)V", 0);
            case 5:
                return new FunctionReferenceImpl(1, (PulseService) obj, PulseService.class, "handleMessage", "handleMessage(Landroid/os/Message;)V", 0);
            default:
                return new FunctionReferenceImpl(1, (RunnableScheduler) obj, RunnableScheduler.class, "handleTimerMessage", "handleTimerMessage(Landroid/os/Message;)V", 0);
        }
    }

    @Override // defpackage.u941
    public final void handleMessage(Message message) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((tls) obj).invoke(message);
                break;
            case 1:
                MeasurementTask measurementTask = (MeasurementTask) obj;
                if (!measurementTask.h.get()) {
                    l5f0 l5f0Var = measurementTask.b;
                    j63 j63Var = measurementTask.e;
                    w53 w53Var = measurementTask.f;
                    w53 w53Var2 = measurementTask.g;
                    long j = measurementTask.i;
                    pa10 pa10Var = measurementTask.c;
                    ProcessCpuMonitoringParams processCpuMonitoringParams = l5f0Var.c;
                    boolean z = pa10Var.a;
                    l5f0Var.k = null;
                    l5f0Var.l = a.M0(j63Var);
                    l5f0Var.m = w53Var;
                    if (l5f0Var.o != -1) {
                        Iterator it = ((q53) w53Var2.entrySet()).iterator();
                        while (true) {
                            t53 t53Var = (t53) it;
                            if (t53Var.hasNext()) {
                                t53Var.next();
                                t53 t53Var2 = t53Var;
                                String str = (String) t53Var2.getKey();
                                z5f0 z5f0Var = (z5f0) t53Var2.getValue();
                                z5f0 z5f0Var2 = (z5f0) l5f0Var.n.get(str);
                                if (z5f0Var2 != null) {
                                    long j2 = z5f0Var2.a;
                                    if (j2 != -1) {
                                        long j3 = z5f0Var.a;
                                        if (j3 != -1) {
                                            long j4 = j3 - j2;
                                            long j5 = j - l5f0Var.o;
                                            long j6 = z ? 60000L : 3600000L;
                                            String f = oyr.f('.', processCpuMonitoringParams.processToHistogramBaseName.get(str), z ? "Foreground" : "Background");
                                            String concat = f.concat(".LARGE");
                                            if (pa10Var.b) {
                                                f = f.concat(".Charging");
                                                concat = concat.concat(".Charging");
                                            }
                                            l5f0Var.f.a(j4, j5, f, j6);
                                            l5f0Var.g.a(j4, j5, concat, j6);
                                            l5f0Var.e.reportCpuTicks(str, z5f0Var2.a, j3, j, l5f0Var.o, pa10Var);
                                            z = z;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Iterator it2 = ((q53) w53Var2.entrySet()).iterator();
                    while (true) {
                        t53 t53Var3 = (t53) it2;
                        if (!t53Var3.hasNext()) {
                            l5f0Var.n = w53Var2;
                            l5f0Var.o = j;
                            break;
                        } else {
                            t53Var3.next();
                            t53 t53Var4 = t53Var3;
                            String str2 = (String) t53Var4.getKey();
                            z5f0 z5f0Var3 = (z5f0) t53Var4.getValue();
                            int i2 = z5f0Var3.b;
                            if (i2 != -1) {
                                String str3 = processCpuMonitoringParams.processToHistogramBaseName.get(str2);
                                uxy0 uxy0Var = l5f0Var.h;
                                String concat2 = str3.concat(".ThreadCount");
                                ycs0 ycs0Var = uxy0Var.a;
                                vku vkuVar = (vku) ycs0Var.get(concat2);
                                if (vkuVar == null) {
                                    vkuVar = ffx.I(1, 300, 50, concat2);
                                    ycs0Var.put(concat2, vkuVar);
                                }
                                vkuVar.b(i2);
                                l5f0Var.e.reportThreadCount(str2, i2);
                            }
                            if (z5f0Var3.c != Long.MIN_VALUE) {
                                String str4 = processCpuMonitoringParams.processToHistogramBaseName.get(str2);
                                long j7 = z5f0Var3.c;
                                long j8 = z5f0Var3.d;
                                Iterator it3 = it2;
                                long j9 = z5f0Var3.e;
                                x5f0 x5f0Var = l5f0Var.i;
                                x5f0Var.a(str4.concat(".PrivateMemoryFootprint")).b((int) (j7 / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
                                x5f0Var.a(str4.concat(".SharedMemoryFootprint")).b((int) (j8 / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
                                x5f0Var.a(str4.concat(".MemoryFootprint")).b((int) (j9 / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
                                l5f0Var.e.reportMemoryCount(str2, j7, j8, j9);
                                it2 = it3;
                            }
                        }
                    }
                }
                break;
            case 2:
                MetricsState metricsState = (MetricsState) obj;
                metricsState.e = false;
                metricsState.c.execute(new iy2(22, metricsState, ((rd20) metricsState.d.build()).toByteArray()));
                break;
            case 3:
                ((NetworkChangeDetector) obj).handleMessage(message);
                break;
            case 4:
                ((PowerStateChangeDetector) obj).handleMessage(message);
                break;
            case 5:
                ((PulseService) obj).handleMessage(message);
                break;
            default:
                ((RunnableScheduler) obj).handleTimerMessage(message);
                break;
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
