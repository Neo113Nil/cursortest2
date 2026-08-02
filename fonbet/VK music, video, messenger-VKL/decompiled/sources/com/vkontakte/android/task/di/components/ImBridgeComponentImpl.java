package com.vkontakte.android.task.di.components;

import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.dialogsscreen.api.DialogsScreenFeatureComponent;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.video.ui.upload.api.di.UploadComponent;
import com.vk.voip.api.di.VoipCallComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.cuq;
import xsna.ep;
import xsna.fat;
import xsna.fp;
import xsna.fpf0;
import xsna.g3o;
import xsna.g8m;
import xsna.gat;
import xsna.gb3;
import xsna.hpf0;
import xsna.hy6;
import xsna.j90;
import xsna.msy;
import xsna.mu2;
import xsna.mxv;
import xsna.nwy;
import xsna.pwj0;
import xsna.pxv;
import xsna.qcy;
import xsna.qxv;
import xsna.qy8;
import xsna.rxv;

/* compiled from: BridgeComponents.kt */
/* loaded from: classes11.dex */
public final class ImBridgeComponentImpl implements ImBridgeComponent {
    public static final /* synthetic */ qcy<Object>[] n;
    public final BridgeComponent a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final nwy i = new nwy(new cuq(this, 2));
    public final nwy j = new nwy(new fat(this, 1));
    public final nwy k = new nwy(new gat(this, 1));
    public final nwy l = new nwy(new qy8(this, 3));
    public final nwy m = new nwy(new j90(this, 3));

    /* compiled from: BridgeComponents.kt */
    public static final class a implements c8m<ImBridgeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            BridgeComponent bridgeComponent = (BridgeComponent) g8mVar.a(fpf0.a(BridgeComponent.class));
            pxv pxvVar = new pxv(g8mVar, 0);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new ImBridgeComponentImpl(bridgeComponent, msy.a(lazyThreadSafetyMode, pxvVar), msy.a(lazyThreadSafetyMode, new qxv(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new mu2(g8mVar, 3)), msy.a(lazyThreadSafetyMode, new gb3(g8mVar, 3)), msy.a(lazyThreadSafetyMode, new g3o(g8mVar, 1)), msy.a(lazyThreadSafetyMode, new hy6(g8mVar, 3)), msy.a(lazyThreadSafetyMode, new rxv(g8mVar, 0)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImBridgeComponentImpl.class, "imBridge", "getImBridge()Lcom/vk/im/ui/bridges/ImBridge;", 0);
        hpf0 hpf0Var = fpf0.a;
        n = new qcy[]{propertyReference1Impl, fp.c(0, ImBridgeComponentImpl.class, "settingsBridge", "getSettingsBridge()Lcom/vk/im/ui/bridges/ImSettingsBridge;", hpf0Var), ep.a(0, ImBridgeComponentImpl.class, "dialogsBridge", "getDialogsBridge()Lcom/vk/im/ui/bridges/ImDialogsBridge;", hpf0Var), ep.a(0, ImBridgeComponentImpl.class, "callsBridge", "getCallsBridge()Lcom/vk/im/ui/bridges/ImCallsBridge;", hpf0Var), ep.a(0, ImBridgeComponentImpl.class, "channelsRouter", "getChannelsRouter()Lcom/vk/channels/api/ChannelsRouter;", hpf0Var)};
    }

    public ImBridgeComponentImpl(BridgeComponent bridgeComponent, Lazy<? extends NotificationsSettingsComponent> lazy, Lazy<? extends StoryViewerComponent> lazy2, Lazy<? extends StoriesComponent> lazy3, Lazy<? extends UploadComponent> lazy4, Lazy<? extends DialogsScreenFeatureComponent> lazy5, Lazy<? extends VoipCallComponent> lazy6, Lazy<? extends NewsfeedRouterComponent> lazy7) {
        this.a = bridgeComponent;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy4;
        this.f = lazy5;
        this.g = lazy6;
        this.h = lazy7;
    }

    @Override // com.vk.bridges.di.ImBridgeComponent
    public final mxv g5() {
        qcy<Object> qcyVar = n[0];
        return (mxv) this.i.c();
    }
}
