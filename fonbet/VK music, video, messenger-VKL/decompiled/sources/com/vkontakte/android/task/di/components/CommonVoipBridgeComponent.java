package com.vkontakte.android.task.di.components;

import com.vk.bridges.di.VoipBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.notifications.dnd.api.di.DndComponent;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.voip.miniapps.api.di.VoipMiniAppCallComponent;
import com.vk.voip.ui.di.VoipFirstCallCacheComponent;
import defpackage.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.afw0;
import xsna.bpn0;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.in0;
import xsna.ji0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.sje;
import xsna.xqf;

/* compiled from: CommonVoipBridgeComponent.kt */
/* loaded from: classes7.dex */
public final class CommonVoipBridgeComponent implements VoipBridgeComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final bpn0 a;
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d;
    public final VoipFirstCallCacheComponent e;
    public final nwy f = new nwy(new ji0(this, 22));

    /* compiled from: CommonVoipBridgeComponent.kt */
    public static final class a implements c8m<VoipBridgeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            QueueSyncComponent queueSyncComponent = (QueueSyncComponent) g8mVar.a(fpf0.a(QueueSyncComponent.class));
            DndComponent dndComponent = (DndComponent) g8mVar.a(fpf0.a(DndComponent.class));
            VoipMiniAppCallComponent voipMiniAppCallComponent = (VoipMiniAppCallComponent) g8mVar.a(fpf0.a(VoipMiniAppCallComponent.class));
            return new CommonVoipBridgeComponent(new bpn0(new in0(queueSyncComponent, 27)), new bpn0(new xqf(queueSyncComponent, 3)), new bpn0(new sje(dndComponent, 6)), new bpn0(new e(voipMiniAppCallComponent, 29)), (VoipFirstCallCacheComponent) g8mVar.a(fpf0.a(VoipFirstCallCacheComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommonVoipBridgeComponent.class, "voipBridge", "getVoipBridge()Lcom/vk/bridges/VoipBridge;", 0);
        fpf0.a.getClass();
        g = new qcy[]{propertyReference1Impl};
    }

    public CommonVoipBridgeComponent(bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, bpn0 bpn0Var4, VoipFirstCallCacheComponent voipFirstCallCacheComponent) {
        this.a = bpn0Var;
        this.b = bpn0Var2;
        this.c = bpn0Var3;
        this.d = bpn0Var4;
        this.e = voipFirstCallCacheComponent;
    }

    @Override // com.vk.bridges.di.VoipBridgeComponent
    public final afw0 j1() {
        qcy<Object> qcyVar = g[0];
        return (afw0) this.f.c();
    }
}
