package xsna;

import one.video.cast.manager.status.MediaRouteConnectStatus;

/* compiled from: VKCastManager.kt */
/* loaded from: classes2.dex */
public final class hbr0 implements ow10 {
    public final /* synthetic */ fbr0 a;

    public hbr0(fbr0 fbr0Var) {
        this.a = fbr0Var;
    }

    @Override // xsna.ow10
    public final void a() {
        fbr0.a(this.a, MediaRouteConnectStatus.CONNECTING);
    }

    @Override // xsna.ow10
    public final void b() {
        fbr0.a(this.a, MediaRouteConnectStatus.NO_DEVICES_AVAILABLE);
    }

    @Override // xsna.ow10
    public final void c() {
        fbr0.a(this.a, MediaRouteConnectStatus.NOT_CONNECTED);
    }

    @Override // xsna.ow10
    public final void onConnected() {
        fbr0.a(this.a, MediaRouteConnectStatus.CONNECTED);
    }
}
