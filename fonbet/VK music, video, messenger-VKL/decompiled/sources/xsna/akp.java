package xsna;

import android.util.Pair;
import com.vkontakte.android.R;

/* compiled from: EndBroadcastPresenter.java */
/* loaded from: classes3.dex */
public final class akp extends io.reactivex.rxjava3.observers.a<Pair<Boolean, Boolean>> {
    public final /* synthetic */ yjp c;

    public akp(yjp yjpVar) {
        this.c = yjpVar;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        this.c.getClass();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        this.c.getClass();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        Pair pair = (Pair) obj;
        if (((Boolean) pair.first).booleanValue() && ((Boolean) pair.second).booleanValue()) {
            cvk.u(R.string.live_story_end_published_wall_story, false);
        } else if (((Boolean) pair.first).booleanValue()) {
            cvk.u(R.string.live_story_end_published_wall, false);
        } else if (((Boolean) pair.second).booleanValue()) {
            cvk.u(R.string.live_story_end_published_story, false);
        }
        fxc0.B().n0();
    }
}
