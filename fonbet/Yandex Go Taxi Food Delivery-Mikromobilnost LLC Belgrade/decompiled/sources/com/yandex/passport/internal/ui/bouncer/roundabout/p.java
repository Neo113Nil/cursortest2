package com.yandex.passport.internal.ui.bouncer.roundabout;

import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements tls {
    public final /* synthetic */ RoundaboutFullscreenLayout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ p(RoundaboutFullscreenLayout roundaboutFullscreenLayout, int i, int i2) {
        this.a = roundaboutFullscreenLayout;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 animateClipPath$lambda$7$lambda$6$lambda$5;
        animateClipPath$lambda$7$lambda$6$lambda$5 = RoundaboutFullscreenLayout.animateClipPath$lambda$7$lambda$6$lambda$5(this.a, this.b, this.c, ((Integer) obj).intValue());
        return animateClipPath$lambda$7$lambda$6$lambda$5;
    }
}
