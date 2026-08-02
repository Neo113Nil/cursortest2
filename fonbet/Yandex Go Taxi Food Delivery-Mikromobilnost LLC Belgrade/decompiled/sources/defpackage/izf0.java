package defpackage;

import com.yandex.pulse.PowerStateChangeDetector;
import com.yandex.pulse.PulseService;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class izf0 implements PowerStateChangeDetector.Observer, jms {
    public final /* synthetic */ PulseService a;

    public izf0(PulseService pulseService) {
        this.a = pulseService;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PowerStateChangeDetector.Observer) && (obj instanceof jms)) {
            return getFunctionDelegate().equals(((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, PulseService.class, "onPowerStateChanged", "onPowerStateChanged(II)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.pulse.PowerStateChangeDetector.Observer
    public final void onPowerStateChanged(int i, int i2) {
        this.a.onPowerStateChanged(i, i2);
    }
}
