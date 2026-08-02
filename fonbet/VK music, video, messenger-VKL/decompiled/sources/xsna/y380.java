package xsna;

import com.vk.log.L;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OnDemandCounter.java */
/* loaded from: classes.dex */
public final class y380 {
    public final Object a;
    public final Object b;

    public y380(int i) {
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.a = io.reactivex.rxjava3.subjects.d.O0(bool);
                this.b = io.reactivex.rxjava3.subjects.d.O0(bool);
                break;
            default:
                this.a = new AtomicInteger();
                this.b = new AtomicInteger();
                break;
        }
    }

    public synchronized void a(boolean z) {
        if (epx.f(((io.reactivex.rxjava3.subjects.d) this.a).P0(), Boolean.FALSE)) {
            L.G("VoipAsrOnlineEnabledHandlerImpl", "Set isOn unavailable, because isEnabled=false");
            return;
        }
        if (epx.f(((io.reactivex.rxjava3.subjects.d) this.b).P0(), Boolean.valueOf(z))) {
            L.p("VoipAsrOnlineEnabledHandlerImpl", "Set isOn is the same, isOn=" + z);
        } else {
            L.p("VoipAsrOnlineEnabledHandlerImpl", "Set is on, isOn=" + z);
            ((io.reactivex.rxjava3.subjects.d) this.b).onNext(Boolean.valueOf(z));
        }
    }
}
