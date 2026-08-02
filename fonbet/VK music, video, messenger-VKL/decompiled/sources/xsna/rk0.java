package xsna;

import com.vk.log.L;
import com.vkontakte.android.R;

/* compiled from: AddButtonPresenter.java */
/* loaded from: classes3.dex */
public final class rk0 extends io.reactivex.rxjava3.observers.a<Boolean> {
    public final /* synthetic */ sk0 c;

    public rk0(sk0 sk0Var) {
        this.c = sk0Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        sk0 sk0Var = this.c;
        cvk.v(R.string.video_owner_subscribed, sk0Var.f.P());
        sk0Var.h = null;
        sk0Var.t();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        L.i(th);
        this.c.h = null;
        d370.L(th);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
    }
}
