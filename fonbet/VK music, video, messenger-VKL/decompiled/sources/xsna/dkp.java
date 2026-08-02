package xsna;

import com.vk.log.L;
import com.vkontakte.android.R;

/* compiled from: EndBroadcastPresenter.java */
/* loaded from: classes3.dex */
public final class dkp extends io.reactivex.rxjava3.observers.a<Integer> {
    public final /* synthetic */ yjp c;

    public dkp(yjp yjpVar) {
        this.c = yjpVar;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        cvk.u(R.string.live_story_end_published_wall, false);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        this.c.getClass();
        L.i(th);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
    }
}
