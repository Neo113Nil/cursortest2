package xsna;

import com.vk.dto.live.LiveEventModel;
import com.vk.log.L;

/* compiled from: LivePresenter.java */
/* loaded from: classes3.dex */
public final class zkz extends io.reactivex.rxjava3.observers.a<LiveEventModel> {
    public final /* synthetic */ com.vk.libvideo.live.impl.views.live.b c;

    public zkz(com.vk.libvideo.live.impl.views.live.b bVar) {
        this.c = bVar;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        com.vk.libvideo.live.impl.views.live.b bVar = this.c;
        bVar.u0.a("onComplete");
        bVar.D = null;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        com.vk.libvideo.live.impl.views.live.b bVar = this.c;
        bVar.u0.a("onError: ", th);
        L.i(th);
        bVar.D = null;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        LiveEventModel liveEventModel = (LiveEventModel) obj;
        com.vk.libvideo.live.impl.views.live.b bVar = this.c;
        piz pizVar = bVar.f;
        e1q e1qVar = bVar.h;
        i000 i000Var = bVar.u0;
        if (pizVar != null && liveEventModel != null && e1qVar != null) {
            StringBuilder sb = new StringBuilder("onNext: ");
            i000Var.getClass();
            sb.append(i000.b(liveEventModel));
            i000Var.a(sb.toString());
            e1qVar.b(liveEventModel);
            return;
        }
        StringBuilder sb2 = new StringBuilder("onNext: (check = ");
        sb2.append(pizVar != null);
        sb2.append(" && ");
        sb2.append(liveEventModel != null);
        sb2.append(" && ");
        sb2.append(e1qVar != null);
        sb2.append(") ");
        i000Var.getClass();
        sb2.append(i000.b(liveEventModel));
        i000Var.a(sb2.toString());
    }
}
