package com.vkontakte.android.task.di.components;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.superapp.statinteractor.api.di.StatInteractorComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b25;
import xsna.bpn0;
import xsna.c8m;
import xsna.dr4;
import xsna.fpf0;
import xsna.g25;
import xsna.g8m;
import xsna.h25;
import xsna.i25;
import xsna.j25;
import xsna.k25;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: BridgeComponents.kt */
/* loaded from: classes11.dex */
public final class AuthBridgeComponentImpl implements AuthBridgeComponent {
    public static final /* synthetic */ qcy<Object>[] i;
    public final StatInteractorComponent a;
    public final SessionManagementComponent b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;
    public final nwy h = new nwy(new dr4(this, 1));

    /* compiled from: BridgeComponents.kt */
    public static final class a implements c8m<AuthBridgeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            int i = 0;
            return new AuthBridgeComponentImpl((StatInteractorComponent) g8mVar.a(fpf0.a(StatInteractorComponent.class)), (SessionManagementComponent) g8mVar.a(fpf0.a(SessionManagementComponent.class)), new bpn0(new g25(g8mVar, i)), new bpn0(new h25(g8mVar, i)), new bpn0(new i25(g8mVar, i)), new bpn0(new j25(g8mVar, i)), new bpn0(new k25(g8mVar, i)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AuthBridgeComponentImpl.class, "authBridge", "getAuthBridge()Lcom/vk/bridges/AuthBridge;", 0);
        fpf0.a.getClass();
        i = new qcy[]{propertyReference1Impl};
    }

    public AuthBridgeComponentImpl(StatInteractorComponent statInteractorComponent, SessionManagementComponent sessionManagementComponent, bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, bpn0 bpn0Var4, bpn0 bpn0Var5) {
        this.a = statInteractorComponent;
        this.b = sessionManagementComponent;
        this.c = bpn0Var;
        this.d = bpn0Var2;
        this.e = bpn0Var3;
        this.f = bpn0Var4;
        this.g = bpn0Var5;
    }

    @Override // com.vk.bridges.di.AuthBridgeComponent
    public final b25 s() {
        qcy<Object> qcyVar = i[0];
        return (b25) this.h.c();
    }
}
