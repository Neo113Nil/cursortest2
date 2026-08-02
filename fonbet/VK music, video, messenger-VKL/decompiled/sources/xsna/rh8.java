package xsna;

import com.vk.libvideo.live.api.view.BroadcastContract$State;
import com.vkontakte.android.R;

/* compiled from: BroadcastPresenter.java */
/* loaded from: classes3.dex */
public final class rh8 extends io.reactivex.rxjava3.observers.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ pk6 d;

    public /* synthetic */ rh8(pk6 pk6Var, int i) {
        this.c = i;
        this.d = pk6Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        switch (this.c) {
            case 0:
                qh8 qh8Var = (qh8) this.d;
                qh8Var.Q(BroadcastContract$State.PREPARE);
                qh8Var.d();
                break;
            default:
                cvk.u(R.string.live_story_end_published_video, false);
                fxc0.B().n0();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        switch (this.c) {
            case 0:
                qh8 qh8Var = (qh8) this.d;
                qh8Var.Q(BroadcastContract$State.MODEL_ERROR);
                qh8Var.d();
                break;
            default:
                ((yjp) this.d).getClass();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        switch (this.c) {
            case 0:
                break;
            default:
                break;
        }
    }
}
