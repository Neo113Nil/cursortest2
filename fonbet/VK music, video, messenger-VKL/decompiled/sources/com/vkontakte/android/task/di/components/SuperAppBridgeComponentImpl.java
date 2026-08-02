package com.vkontakte.android.task.di.components;

import com.vk.di.component.DiScopedComponent;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.superapp.di.SuperAppBridgeComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.o7n0;
import xsna.pwj0;
import xsna.qcy;
import xsna.so40;

/* compiled from: BridgeComponents.kt */
/* loaded from: classes7.dex */
public final class SuperAppBridgeComponentImpl implements SuperAppBridgeComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final ProfileFragmentProviderComponent a;
    public final nwy b = new nwy(new so40(this, 26));

    /* compiled from: BridgeComponents.kt */
    public static final class a implements c8m<SuperAppBridgeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SuperAppBridgeComponentImpl((ProfileFragmentProviderComponent) g8mVar.a(fpf0.a(ProfileFragmentProviderComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SuperAppBridgeComponentImpl.class, "superAppBridge", "getSuperAppBridge()Lcom/vk/superapp/SuperAppBridge;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public SuperAppBridgeComponentImpl(ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = profileFragmentProviderComponent;
    }

    @Override // com.vk.superapp.di.SuperAppBridgeComponent
    public final o7n0 E4() {
        qcy<Object> qcyVar = c[0];
        return (o7n0) this.b.c();
    }
}
