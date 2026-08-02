package xsna;

import com.vk.metrics.performance.thermal.DeviceThermalStatusChecker;
import xsna.bb4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class g50 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                qv20.b((com.vk.core.view.components.spinner.c) this.c);
                break;
            case 1:
                bb4.a aVar = (bb4.a) this.c;
                aVar.c.set(true);
                if (aVar.d.get()) {
                    io.reactivex.rxjava3.disposables.c cVar = aVar.e;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    aVar.e = null;
                    break;
                }
                break;
            case 2:
                ((xam) this.c).v = null;
                break;
            case 3:
                DeviceThermalStatusChecker deviceThermalStatusChecker = (DeviceThermalStatusChecker) this.c;
                deviceThermalStatusChecker.a.unregisterReceiver(deviceThermalStatusChecker.c);
                break;
            default:
                ((nwp0) this.c).d = jgp.b;
                break;
        }
    }
}
