package xsna;

import ru.ok.android.webrtc.stat.listener.StatListenerManager;

/* loaded from: classes8.dex */
public final class q9y0 implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ StatListenerManager b;

    public q9y0(StatListenerManager statListenerManager) {
        this.b = statListenerManager;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        io.reactivex.rxjava3.core.x a;
        a = this.b.a();
        return a;
    }
}
