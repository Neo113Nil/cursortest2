package defpackage;

import ru.yandex.video.m3.ott.impl.TrackingManagerImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class n601 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TrackingManagerImpl b;

    public /* synthetic */ n601(TrackingManagerImpl trackingManagerImpl, int i) {
        this.a = i;
        this.b = trackingManagerImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TrackingManagerImpl trackingManagerImpl = this.b;
        switch (i) {
            case 0:
                TrackingManagerImpl.startScheduledWorkHeartbeat$lambda$4(trackingManagerImpl);
                break;
            default:
                TrackingManagerImpl.createTrackingEventFactory$lambda$1(trackingManagerImpl);
                break;
        }
    }
}
