package xsna;

import android.media.MediaRouter;
import xsna.xta0;

/* compiled from: MediaRouterUtils.java */
/* loaded from: classes12.dex */
public final class ux10<T> extends MediaRouter.VolumeCallback {
    public final xta0.a a;

    public ux10(xta0.a aVar) {
        this.a = aVar;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.getClass();
        xta0.b.c q = xta0.b.q(routeInfo);
        if (q != null) {
            q.a.j(i);
        }
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.getClass();
        xta0.b.c q = xta0.b.q(routeInfo);
        if (q != null) {
            q.a.k(i);
        }
    }
}
