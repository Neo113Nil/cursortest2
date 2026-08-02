package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.live.LiveSpectators;
import com.vk.log.L;

/* compiled from: LivePresenter.java */
/* loaded from: classes3.dex */
public final class xkz extends io.reactivex.rxjava3.observers.a<LiveSpectators> {
    public final /* synthetic */ com.vk.libvideo.live.impl.views.live.b c;

    public xkz(com.vk.libvideo.live.impl.views.live.b bVar) {
        this.c = bVar;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        this.c.u0.a("HEARTBEAT onComplete");
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        com.vk.libvideo.live.impl.views.live.b bVar = this.c;
        bVar.u0.a(ms9.b("HEARTBEAT onError: ", th));
        L.i(th);
        if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 15) {
            LiveSpectators liveSpectators = new LiveSpectators();
            bVar.G.c = 3;
            com.vk.libvideo.live.impl.views.live.b.d(bVar, liveSpectators);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        LiveSpectators liveSpectators = (LiveSpectators) obj;
        com.vk.libvideo.live.impl.views.live.b bVar = this.c;
        bVar.u0.a("HEARTBEAT onNext: " + liveSpectators);
        com.vk.libvideo.live.impl.views.live.b.d(bVar, liveSpectators);
    }
}
