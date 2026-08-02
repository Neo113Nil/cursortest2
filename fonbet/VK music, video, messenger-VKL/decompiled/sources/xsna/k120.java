package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.design.view.swipe.layout.SwipeLayout;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.screen.a;
import com.vk.photoviewer.PhotoViewer;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.q4a0;

/* compiled from: MediaViewerVideoPage.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class k120 extends ggs implements a.b {
    public final Context d;
    public final PhotoViewer.h e;
    public final q4a0.d f;
    public final xy80 g;
    public boolean h;
    public final a.C1246a i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final j120 t;

    public k120(Context context, int i, Long l, PhotoViewer.h hVar, q4a0.d dVar, xy80 xy80Var) {
        super(context, i, hVar);
        this.d = context;
        this.e = hVar;
        this.f = dVar;
        this.g = xy80Var;
        this.i = new a.C1246a(hVar.A(), null, "im", null, null, l.toString(), false, false, false, 0L, null, 0, 63834);
        t210 t210Var = new t210(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, t210Var);
        this.k = msy.a(lazyThreadSafetyMode, new xrj(this, 20));
        this.l = msy.a(lazyThreadSafetyMode, new rkt(this, 9));
        this.m = msy.a(lazyThreadSafetyMode, new nuv(this, 8));
        this.n = msy.a(lazyThreadSafetyMode, new u210(this, 4));
        this.o = msy.a(lazyThreadSafetyMode, new s1x(this, 9));
        this.p = msy.a(lazyThreadSafetyMode, new tzv(this, 8));
        this.q = msy.a(lazyThreadSafetyMode, new k7y(this, 10));
        this.r = msy.a(lazyThreadSafetyMode, new ubw(this, 9));
        this.s = msy.a(lazyThreadSafetyMode, new enh(this, 27));
        this.t = new j120(this, i);
    }

    public static com.vk.libvideo.screen.a e(k120 k120Var) {
        Context context = k120Var.d;
        NotificationsPermission notificationsPermission = k120Var.getNotificationsPermission();
        jet0 jet0Var = new jet0(k120Var.getNotificationSubscriptionRepository(), k120Var.getVideoPlaybackSpeedRepository(), k120Var.getRestrictedUserActionsRepository(), k120Var.getVideoPromoRepository());
        com.vk.video.ui.share.api.a p0 = k120Var.getVideoShareComponent().p0();
        ljt0 videoBugreportReporter = k120Var.getVideoBugreportReporter();
        com.vk.libvideo.screen.a aVar = new com.vk.libvideo.screen.a(context, k120Var, notificationsPermission, jet0Var, p0, k120Var.getVideoSeekEventsTracker(), videoBugreportReporter, k120Var.getDiscoveryActionsTracker(), k120Var.getVideoShareComponent().S(), k120Var.g);
        View inflate = LayoutInflater.from(k120Var.d).inflate(R.layout.video_fullscreen, (ViewGroup) null, false);
        aVar.B = (SwipeLayout) inflate.findViewById(R.id.swipe_layout);
        aVar.f(inflate);
        ce0 ce0Var = new ce0(k120Var, 8);
        VideoView videoView = aVar.w;
        if (videoView != null) {
            videoView.setToggleUiVisibilityListener(ce0Var);
        }
        k120Var.addView(inflate, -1, -1);
        return aVar;
    }

    private final yg5 getAutoPlay() {
        return getController().v;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final com.vk.libvideo.screen.a getController() {
        return (com.vk.libvideo.screen.a) this.s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final hfs0 getDiscoveryActionsTracker() {
        return (hfs0) this.q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final vit0 getNotificationSubscriptionRepository() {
        return (vit0) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final NotificationsPermission getNotificationsPermission() {
        return (NotificationsPermission) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final com.vk.video.kidsprofile.restricteduseractions.a getRestrictedUserActionsRepository() {
        return (com.vk.video.kidsprofile.restricteduseractions.a) this.m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ljt0 getVideoBugreportReporter() {
        return (ljt0) this.r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final v3t0 getVideoPlaybackSpeedRepository() {
        return (v3t0) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final u9t0 getVideoPromoRepository() {
        return (u9t0) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final zet0 getVideoSeekEventsTracker() {
        return (zet0) this.p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VideoShareComponent getVideoShareComponent() {
        return (VideoShareComponent) this.o.getValue();
    }

    @Override // com.vk.libvideo.screen.a.b
    public final a.C1246a Bg() {
        return this.i;
    }

    @Override // com.vk.libvideo.screen.a.b
    public final void I3() {
        com.vk.libvideo.screen.a.e(getController());
        Activity b = enj.b(this);
        if (b != null) {
            b.onBackPressed();
        }
    }

    @Override // com.vk.libvideo.screen.a.b
    public final boolean Lj() {
        Activity b = enj.b(this);
        if (b != null) {
            return b.isFinishing();
        }
        return false;
    }

    @Override // xsna.ggs
    public final void a() {
        com.vk.libvideo.screen.a.e(getController());
    }

    @Override // xsna.ggs
    public final void b() {
        this.h = false;
        getController().onPause();
        yg5 autoPlay = getAutoPlay();
        if (autoPlay != null) {
            autoPlay.c();
        }
    }

    @Override // xsna.ggs
    public final void c() {
        d();
    }

    @Override // xsna.ggs
    public final void d() {
        this.h = true;
        getController().onResume();
        yg5 autoPlay = getAutoPlay();
        if (autoPlay != null) {
            autoPlay.f();
            autoPlay.l0();
        }
    }

    public final void f(UserId userId, boolean z) {
        getController().bk(new qws0(2, userId, z));
    }

    @Override // xsna.ggs
    public List<View> getViewsForTranslate() {
        return Collections.singletonList(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yg5 autoPlay = getAutoPlay();
        if (autoPlay != null) {
            autoPlay.f0(this.t);
        }
        yg5 autoPlay2 = getAutoPlay();
        if (autoPlay2 != null) {
            autoPlay2.c();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        com.vk.libvideo.screen.a controller = getController();
        VideoView videoView = controller.w;
        if (videoView != null) {
            videoView.V(configuration);
        }
        VideoView videoView2 = controller.w;
        if (videoView2 != null) {
            videoView2.postDelayed(new a72(controller, 26), 100L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yg5 autoPlay = getAutoPlay();
        if (autoPlay != null) {
            autoPlay.T(this.t);
        }
        yg5 autoPlay2 = getAutoPlay();
        if (autoPlay2 != null) {
            autoPlay2.c();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.h) {
            getController().onResume();
            yg5 autoPlay = getAutoPlay();
            if (autoPlay != null) {
                autoPlay.f();
                autoPlay.l0();
                return;
            }
            return;
        }
        if (z || !this.h) {
            return;
        }
        getController().onPause();
        yg5 autoPlay2 = getAutoPlay();
        if (autoPlay2 != null) {
            autoPlay2.c();
        }
    }

    public final void setPlayerControlsBottomPadding(int i) {
        VideoView videoView = getController().w;
        if (videoView != null) {
            videoView.setPlayerControlsBottomPadding(i);
        }
    }

    @Override // com.vk.libvideo.screen.a.b
    public final boolean t7() {
        return this.h;
    }
}
