package xsna;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

/* compiled from: StereoRoomEventListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class g1l0 implements f1l0 {
    public final CopyOnWriteArraySet<f1l0> a = new CopyOnWriteArraySet<>();

    @Override // xsna.f1l0
    public final void a(StereoRoomManagerListener.PromotionRequestUpdated promotionRequestUpdated) {
        Iterator<f1l0> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(promotionRequestUpdated);
        }
    }

    @Override // xsna.f1l0
    public final void onHandStatusChange(StereoRoomManagerListener.HandStatusUpdated handStatusUpdated) {
        Iterator<f1l0> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onHandStatusChange(handStatusUpdated);
        }
    }

    @Override // xsna.f1l0
    public final void onListenersChanged(StereoRoomManagerListener.ListenersUpdated listenersUpdated) {
        Iterator<f1l0> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onListenersChanged(listenersUpdated);
        }
    }

    @Override // xsna.f1l0
    public final void onOwnPromotionChanged(boolean z) {
        Iterator<f1l0> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onOwnPromotionChanged(z);
        }
    }
}
