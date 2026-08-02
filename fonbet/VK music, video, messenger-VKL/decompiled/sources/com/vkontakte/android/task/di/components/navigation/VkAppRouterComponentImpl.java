package com.vkontakte.android.task.di.components.navigation;

import com.navigation.vk.RouterComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.oau0;
import xsna.pwj0;
import xsna.qcy;
import xsna.v94;

/* compiled from: VkAppRouterComponentImpl.kt */
/* loaded from: classes11.dex */
public final class VkAppRouterComponentImpl implements RouterComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new v94(17));

    /* compiled from: VkAppRouterComponentImpl.kt */
    public static final class a implements c8m<RouterComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkAppRouterComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkAppRouterComponentImpl.class, "router", "getRouter()Lcom/vk/navigation/api/vkapp/VkAppRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.navigation.vk.RouterComponent
    public final oau0 a() {
        qcy<Object> qcyVar = b[0];
        return (oau0) this.a.c();
    }
}
