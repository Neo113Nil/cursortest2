package xsna;

import ru.ok.android.webrtc.stat.cpu.CpuUsagePercentProvider;
import ru.ok.android.webrtc.stat.cpu.HardwareInfoPeriodicRetriever;

/* loaded from: classes8.dex */
public final class cbz0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ HardwareInfoPeriodicRetriever b;

    public cbz0(HardwareInfoPeriodicRetriever hardwareInfoPeriodicRetriever) {
        this.b = hardwareInfoPeriodicRetriever;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        CpuUsagePercentProvider cpuUsagePercentProvider;
        cpuUsagePercentProvider = this.b.c;
        cpuUsagePercentProvider.update();
    }
}
