package xsna;

import android.os.Bundle;
import com.vk.libvideo.live.api.view.BroadcastContract$State;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.log.L;

/* compiled from: BroadcastPresenter.java */
/* loaded from: classes3.dex */
public final class uh8 extends io.reactivex.rxjava3.observers.a<Boolean> {
    public final /* synthetic */ qh8 c;

    public uh8(qh8 qh8Var) {
        this.c = qh8Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        qh8 qh8Var = this.c;
        qh8Var.u = null;
        rit0 rit0Var = qh8Var.k0;
        if (rit0Var != null && rit0Var.e == 1) {
            qh8Var.Q(BroadcastContract$State.MODEL_ERROR);
            qh8Var.d();
            return;
        }
        qh8Var.L.invoke(Integer.valueOf(qh8Var.m.o0()));
        qh8Var.g.r();
        qh8Var.Q(BroadcastContract$State.LIVE);
        qh8Var.d();
        qh8Var.W(300L);
        LiveStatNew liveStatNew = qh8Var.g0;
        if (liveStatNew != null) {
            Bundle bundle = new Bundle();
            bundle.putString("action_type", "start_streaming");
            liveStatNew.b(bundle);
            qyk0.a().e("live_action", bundle);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        L.i(th);
        qh8 qh8Var = this.c;
        qh8Var.f.d(th, true);
        qh8Var.u = null;
        qh8Var.g.r();
        qh8Var.Q(BroadcastContract$State.MODEL_ERROR);
        qh8Var.d();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
    }
}
