package com.vkontakte.android.task.di.components;

import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.CameraComponent;
import com.vk.di.component.DiScopedComponent;
import defpackage.e;
import defpackage.f;
import kotlin.jvm.internal.PropertyReference1Impl;
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
import xsna.vv0;
import xsna.xqf;
import xsna.yf9;
import xsna.z4f;
import xsna.zqf;

/* compiled from: CommonCameraComponent.kt */
/* loaded from: classes7.dex */
public final class CommonCameraComponent implements CameraComponent {
    public static final /* synthetic */ qcy<Object>[] j;
    public final bpn0 a;
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final nwy i = new nwy(new ji0(this, 21));

    /* compiled from: CommonCameraComponent.kt */
    public static final class a implements c8m<CameraComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            BridgeComponent bridgeComponent = (BridgeComponent) g8mVar.a(fpf0.a(BridgeComponent.class));
            return new CommonCameraComponent(new bpn0(new in0(bridgeComponent, 26)), new bpn0(new xqf(bridgeComponent, 1)), new bpn0(new sje(bridgeComponent, 4)), new bpn0(new e(bridgeComponent, 27)), new bpn0(new f(bridgeComponent, 24)), new bpn0(new z4f(bridgeComponent, 4)), new bpn0(new vv0(11)), new bpn0(new zqf(bridgeComponent, 1)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommonCameraComponent.class, "cameraBridge", "getCameraBridge()Lcom/vk/bridges/CameraBridge;", 0);
        fpf0.a.getClass();
        j = new qcy[]{propertyReference1Impl};
    }

    public CommonCameraComponent(bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, bpn0 bpn0Var4, bpn0 bpn0Var5, bpn0 bpn0Var6, bpn0 bpn0Var7, bpn0 bpn0Var8) {
        this.a = bpn0Var;
        this.b = bpn0Var2;
        this.c = bpn0Var3;
        this.d = bpn0Var4;
        this.e = bpn0Var5;
        this.f = bpn0Var6;
        this.g = bpn0Var7;
        this.h = bpn0Var8;
    }

    @Override // com.vk.bridges.di.CameraComponent
    public final yf9 ka() {
        qcy<Object> qcyVar = j[0];
        return (yf9) this.i.c();
    }
}
