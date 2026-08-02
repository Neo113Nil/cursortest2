package com.vkontakte.android.task.di.components;

import com.vk.bridges.di.StickersBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.d2c0;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.x8l0;

/* compiled from: BridgeComponents.kt */
/* loaded from: classes7.dex */
public final class StickersBridgeComponentImpl implements StickersBridgeComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new d2c0(7));

    /* compiled from: BridgeComponents.kt */
    public static final class a implements c8m<StickersBridgeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StickersBridgeComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StickersBridgeComponentImpl.class, "stickersBridge", "getStickersBridge()Lcom/vk/stickers/bridge/StickersBridge;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.bridges.di.StickersBridgeComponent
    public final x8l0 R() {
        qcy<Object> qcyVar = b[0];
        return (x8l0) this.a.c();
    }
}
