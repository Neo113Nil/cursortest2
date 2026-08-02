package com.vkontakte.android.task.di.components;

import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.l03;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.wvw;

/* compiled from: BridgeComponents.kt */
/* loaded from: classes11.dex */
public final class InfoBridgeComponentImpl implements InfoBridgeComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new l03(6));

    /* compiled from: BridgeComponents.kt */
    public static final class a implements c8m<InfoBridgeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new InfoBridgeComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(InfoBridgeComponentImpl.class, "infoBridge", "getInfoBridge()Lcom/vk/bridges/InfoBridge;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.bridges.di.InfoBridgeComponent
    public final wvw t() {
        qcy<Object> qcyVar = b[0];
        return (wvw) this.a.c();
    }
}
