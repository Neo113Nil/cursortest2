package defpackage;

import android.content.Context;
import com.yandex.pulse.MeasurementBroadcasterImpl;
import com.yandex.pulse.ProcessCpuMonitoringParams;
import com.yandex.pulse.processcpu.MeasurementTask;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class l5f0 {
    public final Context a;
    public final Executor b;
    public final ProcessCpuMonitoringParams c;
    public final oa10 d;
    public final MeasurementBroadcasterImpl e;
    public MeasurementTask k;
    public final k5f0 j = new k5f0(0, this);
    public Set l = new LinkedHashSet();
    public Map m = b.f();
    public Map n = b.f();
    public long o = -1;
    public final l4z0 f = new l4z0();
    public final dsx g = new dsx();
    public final uxy0 h = new uxy0();
    public final x5f0 i = new x5f0();

    public l5f0(Context context, oa10 oa10Var, Executor executor, ProcessCpuMonitoringParams processCpuMonitoringParams, MeasurementBroadcasterImpl measurementBroadcasterImpl) {
        this.a = context;
        this.d = oa10Var;
        this.b = executor;
        this.c = processCpuMonitoringParams;
        this.e = measurementBroadcasterImpl;
        Set<String> keySet = processCpuMonitoringParams.processToHistogramBaseName.keySet();
        Set set = this.l;
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            set.add((String) it.next());
        }
    }
}
