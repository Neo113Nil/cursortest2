package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;

/* compiled from: VoipAnalyticsEventListenerImpl.kt */
/* loaded from: classes7.dex */
public final class odw0 implements kdw0, pdw0 {
    public final io.reactivex.rxjava3.subjects.f<mdw0> a = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.pdw0
    public final io.reactivex.rxjava3.core.q<mdw0> a() {
        return this.a;
    }

    @Override // xsna.kdw0
    public final void b(mdw0 mdw0Var) {
        io.reactivex.rxjava3.subjects.f<mdw0> fVar = this.a;
        if (fVar.b.get().length != 0) {
            fVar.onNext(mdw0Var);
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.w, new Object[]{"Analytics event " + mdw0Var.getClass().getName() + " is lost, there is no observers"});
        }
        if (BuildInfo.h()) {
            cvk.u(R.string.voip_analytical_event_lost, true);
        }
    }
}
