package com.vkontakte.android.push;

import com.vk.di.component.DiScopedComponent;
import com.vk.pushes.PushComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.jbw;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.uev0;

/* compiled from: PushComponentImpl.kt */
/* loaded from: classes11.dex */
public final class PushComponentImpl implements PushComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new jbw(7));

    /* compiled from: PushComponentImpl.kt */
    public static final class a implements c8m<PushComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new PushComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PushComponentImpl.class, "pushSubscriber", "getPushSubscriber()Lcom/vk/pushes/VkPushSubscriber;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.pushes.PushComponent
    public final uev0 sc() {
        qcy<Object> qcyVar = b[0];
        return (uev0) this.a.c();
    }
}
