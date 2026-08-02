package xsna;

import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.libvideo.api.NotificationsPermission;

/* compiled from: MiniPlayerControllerDependencies.kt */
/* loaded from: classes7.dex */
public final class er20 {
    public final NotificationsPermission a;
    public final vit0 b;
    public final v3t0 c;
    public final com.vk.video.kidsprofile.restricteduseractions.a d;
    public final u9t0 e;
    public final com.vk.video.ui.share.api.a f;
    public final zet0 g;
    public final ljt0 h;
    public final mvs0 i;
    public final hfs0 j;
    public final com.vk.video.ui.share.api.b k;
    public final ejf0 l;
    public final DonutVideoComponent m;

    public er20(NotificationsPermission notificationsPermission, vit0 vit0Var, v3t0 v3t0Var, com.vk.video.kidsprofile.restricteduseractions.a aVar, u9t0 u9t0Var, com.vk.video.ui.share.api.a aVar2, zet0 zet0Var, ljt0 ljt0Var, mvs0 mvs0Var, hfs0 hfs0Var, com.vk.video.ui.share.api.b bVar, ejf0 ejf0Var, DonutVideoComponent donutVideoComponent) {
        this.a = notificationsPermission;
        this.b = vit0Var;
        this.c = v3t0Var;
        this.d = aVar;
        this.e = u9t0Var;
        this.f = aVar2;
        this.g = zet0Var;
        this.h = ljt0Var;
        this.i = mvs0Var;
        this.j = hfs0Var;
        this.k = bVar;
        this.l = ejf0Var;
        this.m = donutVideoComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er20)) {
            return false;
        }
        er20 er20Var = (er20) obj;
        return epx.f(this.a, er20Var.a) && epx.f(this.b, er20Var.b) && epx.f(this.c, er20Var.c) && epx.f(this.d, er20Var.d) && epx.f(this.e, er20Var.e) && epx.f(this.f, er20Var.f) && epx.f(this.g, er20Var.g) && epx.f(this.h, er20Var.h) && this.i.equals(er20Var.i) && epx.f(this.j, er20Var.j) && epx.f(this.k, er20Var.k) && this.l.equals(er20Var.l) && epx.f(this.m, er20Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MiniPlayerControllerDependencies(notificationsPermission=" + this.a + ", videoSubscriptionRepository=" + this.b + ", videoPlaybackSpeedRepository=" + this.c + ", restrictedUserActionsRepository=" + this.d + ", videoPromoRepository=" + this.e + ", videoShareLauncher=" + this.f + ", videoSeekEventsTracker=" + this.g + ", videoBugreportReporter=" + this.h + ", videoMinimizableStateProvider=" + this.i + ", videoDiscoveryActionsTracker=" + this.j + ", videoShareLinkModifier=" + this.k + ", videoAlbumDataProvider=" + this.l + ", donutVideoComponent=" + this.m + ')';
    }
}
