package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.metrics.performance.thermal.DeviceThermalStatusChecker;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class adh0 implements izs {
    public final /* synthetic */ tfc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ DeviceThermalStatusChecker d;
    public final /* synthetic */ int e;

    public /* synthetic */ adh0(tfc tfcVar, long j, DeviceThermalStatusChecker deviceThermalStatusChecker, int i) {
        this.b = tfcVar;
        this.c = j;
        this.d = deviceThermalStatusChecker;
        this.e = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UiTrackingScreen uiTrackingScreen = (UiTrackingScreen) obj;
        tfc tfcVar = this.b;
        if (!((Boolean) ((zch0) tfcVar.c).b.invoke(uiTrackingScreen.a)).booleanValue()) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        return new io.reactivex.rxjava3.internal.operators.observable.l0(new io.reactivex.rxjava3.internal.operators.observable.o0(io.reactivex.rxjava3.core.q.P(0L, this.c, TimeUnit.MILLISECONDS), new oyr(new wlw(this.d, this.e, 3), 21)).b(2, 1), new dnz(new ma(29, tfcVar, uiTrackingScreen), 12));
    }
}
