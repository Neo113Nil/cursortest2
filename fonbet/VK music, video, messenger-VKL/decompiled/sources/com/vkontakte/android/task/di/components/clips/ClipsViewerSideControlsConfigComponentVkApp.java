package com.vkontakte.android.task.di.components.clips;

import com.vk.clips.viewer.vk.ClipsViewerSideControlsConfigComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.sidecontrols.api.di.AnimatedSharingViewProviderComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.byg0;
import xsna.c8m;
import xsna.fpf0;
import xsna.g5;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: ClipsViewerSideControlsConfigComponentVkApp.kt */
/* loaded from: classes7.dex */
public final class ClipsViewerSideControlsConfigComponentVkApp implements ClipsViewerSideControlsConfigComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final AnimatedSharingViewProviderComponent a;
    public final nwy b = new nwy(new g5(this, 24));

    /* compiled from: ClipsViewerSideControlsConfigComponentVkApp.kt */
    public static final class a implements c8m<ClipsViewerSideControlsConfigComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsViewerSideControlsConfigComponentVkApp((AnimatedSharingViewProviderComponent) g8mVar.a(fpf0.a(AnimatedSharingViewProviderComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsViewerSideControlsConfigComponentVkApp.class, "config", "getConfig()Lcom/vk/clips/design/view/sidecontrols/custom/api/SDKViewerSideControlConfig;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public ClipsViewerSideControlsConfigComponentVkApp(AnimatedSharingViewProviderComponent animatedSharingViewProviderComponent) {
        this.a = animatedSharingViewProviderComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.viewer.vk.ClipsViewerSideControlsConfigComponent
    public final byg0 getConfig() {
        qcy<Object> qcyVar = c[0];
        return (byg0) this.b.c();
    }
}
