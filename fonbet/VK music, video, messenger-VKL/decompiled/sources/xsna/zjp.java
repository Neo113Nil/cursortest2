package xsna;

import com.vkontakte.android.R;

/* compiled from: EndBroadcastPresenter.java */
/* loaded from: classes3.dex */
public final class zjp extends io.reactivex.rxjava3.observers.a<Boolean> {
    public final /* synthetic */ yjp c;

    public zjp(yjp yjpVar) {
        this.c = yjpVar;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        cvk.u(R.string.live_story_end_published_wall_story, false);
        fxc0.B().n0();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        this.c.getClass();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
    }
}
