package xsna;

/* compiled from: BroadcastPresenter.java */
/* loaded from: classes3.dex */
public final class th8 extends io.reactivex.rxjava3.observers.a<Long> {
    public final /* synthetic */ qh8 c;

    public th8(qh8 qh8Var) {
        this.c = qh8Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        Long l = (Long) obj;
        qh8 qh8Var = this.c;
        if (qh8Var.E != null) {
            int intValue = l.intValue();
            qh8Var.T = intValue;
            wjk0 wjk0Var = qh8Var.E.c;
            if (wjk0Var != null) {
                wjk0Var.Y2();
                wjk0Var.setTimeText(intValue);
            }
            com.vk.libvideo.live.impl.views.stat.a aVar = qh8Var.K;
            if (aVar != null) {
                aVar.d(qh8Var.T);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
    }
}
