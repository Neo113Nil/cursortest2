package xsna;

import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.dto.live.LiveEventModel;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: WritePresenter.java */
/* loaded from: classes3.dex */
public final class m2y0 extends io.reactivex.rxjava3.observers.a<hyr0> {
    public final /* synthetic */ l2y0 c;

    public m2y0(l2y0 l2y0Var) {
        this.c = l2y0Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        l2y0 l2y0Var = this.c;
        CopyOnWriteArrayList copyOnWriteArrayList = l2y0Var.d;
        LiveEventModel liveEventModel = ((hyr0) obj).a;
        io.reactivex.rxjava3.core.q<VideoGetCommentsExtendedResponseDto> l = l2y0Var.b.l(liveEventModel.e, liveEventModel.d, liveEventModel.m);
        n2y0 n2y0Var = new n2y0(l2y0Var, liveEventModel);
        l.subscribe(n2y0Var);
        copyOnWriteArrayList.add(n2y0Var);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
    }
}
