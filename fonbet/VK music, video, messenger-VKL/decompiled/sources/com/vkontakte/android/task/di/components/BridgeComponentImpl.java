package com.vkontakte.android.task.di.components;

import com.vk.bridges.ImageViewer;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.clips.clipchecker.api.di.ClipCheckerComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.donut.privacy.api.di.DonutPrivacyComponent;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.im.sync.api.di.ImSynchronizationHelpersComponent;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.notifications.di.NotificationsComponent;
import com.vk.notifications.list.api.di.NotificationListComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.community.catalog.api.di.CommunitiesCatalogComponent;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.voip.stereo.api.notifications.di.VoipStereoNotificationsComponent;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a67;
import xsna.ac8;
import xsna.b25;
import xsna.b55;
import xsna.b67;
import xsna.baq0;
import xsna.bc8;
import xsna.c8m;
import xsna.cc8;
import xsna.cpu;
import xsna.dc8;
import xsna.ec8;
import xsna.ep;
import xsna.fb8;
import xsna.fc8;
import xsna.fl4;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gb8;
import xsna.gc8;
import xsna.gzs;
import xsna.hb8;
import xsna.hpf0;
import xsna.k03;
import xsna.kbj0;
import xsna.krl0;
import xsna.mb8;
import xsna.msy;
import xsna.n03;
import xsna.nb8;
import xsna.nwy;
import xsna.o0r0;
import xsna.pb8;
import xsna.pkd;
import xsna.pwj0;
import xsna.q10;
import xsna.qb8;
import xsna.qcy;
import xsna.qdz;
import xsna.rb8;
import xsna.rtc0;
import xsna.sb8;
import xsna.smq;
import xsna.spl0;
import xsna.sw50;
import xsna.tb8;
import xsna.ub8;
import xsna.ui70;
import xsna.vb8;
import xsna.wb8;
import xsna.wvw;
import xsna.xb8;
import xsna.yb8;
import xsna.yp6;
import xsna.z56;
import xsna.zb8;
import xsna.zd3;
import xsna.zf6;

/* compiled from: BridgeComponents.kt */
/* loaded from: classes11.dex */
public final class BridgeComponentImpl implements BridgeComponent {
    public static final /* synthetic */ qcy<Object>[] I;
    public final nwy D;
    public final AuthBridgeComponent a;
    public final InfoBridgeComponent b;
    public final LinksBridgeComponent c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final nwy u;
    public final nwy v;
    public final nwy w;
    public final nwy z;
    public final nwy q = new nwy(new a67(this, 1));
    public final nwy r = new nwy(new rb8(this, 0));
    public final nwy s = new nwy(new z56(this, 2));
    public final nwy t = new nwy(new b67(this, 1));
    public final nwy x = new nwy(new gb8(this, 0));
    public final nwy y = new nwy(new hb8(0));
    public final nwy A = new nwy(new yp6(1));
    public final nwy B = new nwy(new mb8(0));
    public final nwy C = new nwy(new nb8(0));
    public final nwy E = new nwy(new b55(1));
    public final nwy F = new nwy(new pb8(0));
    public final nwy G = new nwy(new qb8(0));
    public final nwy H = new nwy(new k03(1));

    /* compiled from: BridgeComponents.kt */
    public static final class a implements c8m<BridgeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            AuthBridgeComponent authBridgeComponent = (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class));
            InfoBridgeComponent infoBridgeComponent = (InfoBridgeComponent) g8mVar.a(fpf0.a(InfoBridgeComponent.class));
            LinksBridgeComponent linksBridgeComponent = (LinksBridgeComponent) g8mVar.a(fpf0.a(LinksBridgeComponent.class));
            sb8 sb8Var = new sb8(g8mVar, 0);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            int i = 0;
            int i2 = 0;
            return new BridgeComponentImpl(authBridgeComponent, infoBridgeComponent, linksBridgeComponent, msy.a(lazyThreadSafetyMode, sb8Var), msy.a(lazyThreadSafetyMode, new ec8(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new fc8(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new gc8(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new tb8(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new ub8(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new n03(g8mVar, 1)), msy.a(lazyThreadSafetyMode, new xb8(g8mVar, i)), msy.a(lazyThreadSafetyMode, new yb8(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new zb8(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new ac8(g8mVar, i2)), msy.a(lazyThreadSafetyMode, new bc8(g8mVar, i2)), msy.a(lazyThreadSafetyMode, new cc8(g8mVar, i2)), msy.a(lazyThreadSafetyMode, new dc8(g8mVar, i2)), msy.a(lazyThreadSafetyMode, new vb8(g8mVar, i)), msy.a(lazyThreadSafetyMode, new wb8(g8mVar, i)), (ProfileFragmentProviderComponent) g8mVar.a(fpf0.a(ProfileFragmentProviderComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BridgeComponentImpl.class, "authBridge", "getAuthBridge()Lcom/vk/bridges/AuthBridge;", 0);
        hpf0 hpf0Var = fpf0.a;
        I = new qcy[]{propertyReference1Impl, fp.c(0, BridgeComponentImpl.class, "infoBridge", "getInfoBridge()Lcom/vk/bridges/InfoBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "linksBridge", "getLinksBridge()Lcom/vk/bridges/LinksBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "uploadBridge", "getUploadBridge()Lcom/vk/bridges/UploadBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "navigationBridge", "getNavigationBridge()Lcom/vk/bridges/NavigationBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "notificationsBridge", "getNotificationsBridge()Lcom/vk/bridges/NotificationsBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "usersBridge", "getUsersBridge()Lcom/vk/bridges/UsersBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "clipsBridge", "getClipsBridge()Lcom/vk/bridges/ClipsBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "audioBridge", "getAudioBridge()Lcom/vk/bridges/AudioBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "storiesAppOpenBridge", "getStoriesAppOpenBridge()Lcom/vk/bridges/StoriesAppOpenBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "sharingBridge", "getSharingBridge()Lcom/vk/bridges/SharingBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "storiesBridge", "getStoriesBridge()Lcom/vk/bridges/StoriesBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "faveBridge", "getFaveBridge()Lcom/vk/bridges/FaveBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "groupsBridge", "getGroupsBridge()Lcom/vk/bridges/GroupsBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "appsBridge", "getAppsBridge()Lcom/vk/bridges/AppsBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "actionInvokeBridge", "getActionInvokeBridge()Lcom/vk/bridges/ActionInvokeBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "postsBridge", "getPostsBridge()Lcom/vk/bridges/PostsBridge;", hpf0Var), ep.a(0, BridgeComponentImpl.class, "imageViewer", "getImageViewer()Lcom/vk/bridges/ImageViewer;", hpf0Var)};
    }

    public BridgeComponentImpl(AuthBridgeComponent authBridgeComponent, InfoBridgeComponent infoBridgeComponent, LinksBridgeComponent linksBridgeComponent, Lazy<? extends ClipsViewerAdapterComponent> lazy, Lazy<? extends ClipCheckerComponent> lazy2, Lazy<? extends ClipsConfigViewersComponent> lazy3, Lazy<? extends CacheComponent> lazy4, Lazy<? extends SearchUiComponent> lazy5, Lazy<? extends PhotosComponent> lazy6, Lazy<? extends PhotoEditorComponent> lazy7, Lazy<? extends DonutPrivacyComponent> lazy8, final Lazy<? extends NewsfeedRouterComponent> lazy9, Lazy<? extends NotificationsComponent> lazy10, Lazy<? extends NotificationListComponent> lazy11, Lazy<? extends VoipStereoNotificationsComponent> lazy12, Lazy<? extends BridgeComponent> lazy13, Lazy<? extends ImSynchronizationHelpersComponent> lazy14, final Lazy<? extends VideoShareComponent> lazy15, final Lazy<? extends CommunitiesCatalogComponent> lazy16, final ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = authBridgeComponent;
        this.b = infoBridgeComponent;
        this.c = linksBridgeComponent;
        this.d = lazy;
        this.e = lazy2;
        this.f = lazy3;
        this.g = lazy4;
        this.h = lazy5;
        this.i = lazy6;
        this.j = lazy7;
        this.k = lazy8;
        this.l = lazy10;
        this.m = lazy11;
        this.n = lazy12;
        this.o = lazy13;
        this.p = lazy14;
        this.u = new nwy(new gzs() { // from class: xsna.db8
            @Override // xsna.gzs
            public final Object invoke() {
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                ib8 ib8Var = new ib8(lazy15, 0);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                Lazy a2 = msy.a(lazyThreadSafetyMode, ib8Var);
                BridgeComponentImpl bridgeComponentImpl = this;
                Lazy a3 = msy.a(lazyThreadSafetyMode, new jb8(bridgeComponentImpl, 0));
                return new k6v0(ProfileFragmentProviderComponent.this, a2, msy.a(lazyThreadSafetyMode, new kb8(lazy16, 0)), a3, msy.a(lazyThreadSafetyMode, new lb8(bridgeComponentImpl, 0)));
            }
        });
        this.v = new nwy(new gzs() { // from class: xsna.eb8
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.gzs
            public final Object invoke() {
                BridgeComponentImpl bridgeComponentImpl = this;
                return new hlg(ProfileFragmentProviderComponent.this, bridgeComponentImpl.l, bridgeComponentImpl.n, bridgeComponentImpl.o, bridgeComponentImpl.p);
            }
        });
        this.w = new nwy(new fb8(profileFragmentProviderComponent, 0));
        this.z = new nwy(new zf6(profileFragmentProviderComponent, 2));
        this.D = new nwy(new gzs() { // from class: xsna.ob8
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.gzs
            public final Object invoke() {
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return new ekg(BridgeComponentImpl.this.h, profileFragmentProviderComponent, lazy9);
            }
        });
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final baq0 A() {
        qcy<Object> qcyVar = I[3];
        return (baq0) this.t.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final rtc0 C1() {
        qcy<Object> qcyVar = I[16];
        return (rtc0) this.G.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final o0r0 F() {
        qcy<Object> qcyVar = I[6];
        return (o0r0) this.w.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final q10 F1() {
        qcy<Object> qcyVar = I[15];
        return (q10) this.F.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final zd3 H2() {
        qcy<Object> qcyVar = I[14];
        return (zd3) this.E.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final fl4 Le() {
        qcy<Object> qcyVar = I[8];
        return (fl4) this.y.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final cpu O() {
        qcy<Object> qcyVar = I[13];
        return (cpu) this.D.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final krl0 a0() {
        qcy<Object> qcyVar = I[11];
        return (krl0) this.B.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final smq cb() {
        qcy<Object> qcyVar = I[12];
        return (smq) this.C.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final spl0 f5() {
        qcy<Object> qcyVar = I[9];
        return (spl0) this.z.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final kbj0 h8() {
        qcy<Object> qcyVar = I[10];
        return (kbj0) this.A.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final ui70 i1() {
        qcy<Object> qcyVar = I[5];
        return (ui70) this.v.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final sw50 id() {
        qcy<Object> qcyVar = I[4];
        return (sw50) this.u.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final ImageViewer ob() {
        qcy<Object> qcyVar = I[17];
        return (ImageViewer) this.H.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final qdz p() {
        qcy<Object> qcyVar = I[2];
        return (qdz) this.s.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final b25 s() {
        qcy<Object> qcyVar = I[0];
        return (b25) this.q.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final wvw t() {
        qcy<Object> qcyVar = I[1];
        return (wvw) this.r.c();
    }

    @Override // com.vk.bridges.di.BridgeComponent
    public final pkd x() {
        qcy<Object> qcyVar = I[7];
        return (pkd) this.x.c();
    }
}
