package xsna;

import ru.ok.android.webrtc.stat.cpu.CpuScoreProvider;
import ru.ok.android.webrtc.stat.cpu.HardwareInfoPeriodicRetriever;
import ru.ok.android.webrtc.stat.cpu.ram.MemoryUsageProvider;

/* loaded from: classes8.dex */
public final class gcz0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ HardwareInfoPeriodicRetriever b;

    public gcz0(HardwareInfoPeriodicRetriever hardwareInfoPeriodicRetriever) {
        this.b = hardwareInfoPeriodicRetriever;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        CpuScoreProvider cpuScoreProvider;
        MemoryUsageProvider memoryUsageProvider;
        HardwareInfoPeriodicRetriever hardwareInfoPeriodicRetriever = this.b;
        cpuScoreProvider = hardwareInfoPeriodicRetriever.b;
        cpuScoreProvider.update();
        memoryUsageProvider = hardwareInfoPeriodicRetriever.d;
        memoryUsageProvider.update();
    }
}
