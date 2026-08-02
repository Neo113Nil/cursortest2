package xsna;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import xsna.fx10;
import xsna.vw10;
import xsna.xta0;

/* compiled from: MediaRouterUtils.java */
/* loaded from: classes12.dex */
public final class tx10<T> extends MediaRouter.Callback {
    public final xta0.a a;

    public tx10(xta0.a aVar) {
        this.a = aVar;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        xta0.a aVar = this.a;
        if (aVar.l(routeInfo)) {
            aVar.v();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int m;
        xta0.a aVar = this.a;
        aVar.getClass();
        if (xta0.b.q(routeInfo) != null || (m = aVar.m(routeInfo)) < 0) {
            return;
        }
        xta0.b.C4046b c4046b = aVar.r.get(m);
        vw10.a aVar2 = new vw10.a(c4046b.b, aVar.p(c4046b.a));
        aVar.r(c4046b, aVar2);
        c4046b.c = aVar2.b();
        aVar.v();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        xta0.a aVar = this.a;
        int m = aVar.m(routeInfo);
        if (m >= 0) {
            xta0.b.C4046b c4046b = aVar.r.get(m);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != c4046b.c.a.getInt("presentationDisplayId", -1)) {
                vw10 vw10Var = c4046b.c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (vw10Var == null) {
                    throw new IllegalArgumentException("descriptor must not be null");
                }
                Bundle bundle = new Bundle(vw10Var.a);
                ArrayList c = vw10Var.c();
                ArrayList b = vw10Var.b();
                HashSet a = vw10Var.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                c4046b.c = new vw10(bundle);
                aVar.v();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int m;
        xta0.a aVar = this.a;
        aVar.getClass();
        if (xta0.b.q(routeInfo) != null || (m = aVar.m(routeInfo)) < 0) {
            return;
        }
        aVar.r.remove(m);
        aVar.v();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        fx10.h hVar;
        xta0.a aVar = this.a;
        if (routeInfo != aVar.k.getSelectedRoute(8388611)) {
            return;
        }
        xta0.b.c q = xta0.b.q(routeInfo);
        if (q != null) {
            q.a.l(false);
            return;
        }
        int m = aVar.m(routeInfo);
        if (m >= 0) {
            xta0.b.C4046b c4046b = aVar.r.get(m);
            h1u h1uVar = aVar.j;
            String str = c4046b.b;
            h1uVar.a.removeMessages(262);
            fx10.g d = h1uVar.d(h1uVar.t);
            if (d != null) {
                Iterator it = d.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hVar = null;
                        break;
                    } else {
                        hVar = (fx10.h) it.next();
                        if (hVar.b.equals(str)) {
                            break;
                        }
                    }
                }
                if (hVar != null) {
                    hVar.l(false);
                }
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int m;
        xta0.a aVar = this.a;
        aVar.getClass();
        if (xta0.b.q(routeInfo) != null || (m = aVar.m(routeInfo)) < 0) {
            return;
        }
        xta0.b.C4046b c4046b = aVar.r.get(m);
        int volume = routeInfo.getVolume();
        if (volume != c4046b.c.a.getInt("volume")) {
            vw10 vw10Var = c4046b.c;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (vw10Var == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(vw10Var.a);
            ArrayList c = vw10Var.c();
            ArrayList b = vw10Var.b();
            HashSet a = vw10Var.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
            c4046b.c = new vw10(bundle);
            aVar.v();
        }
    }
}
