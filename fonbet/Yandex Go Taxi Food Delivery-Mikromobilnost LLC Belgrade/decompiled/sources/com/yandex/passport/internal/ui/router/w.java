package com.yandex.passport.internal.ui.router;

import android.view.View;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import com.yandex.passport.api.n3;
import com.yandex.passport.internal.flags.presentation.s0;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class w extends t2y {
    public final ProgressPropertiesImpl c;
    public final View w;
    public final n3 x;

    public w(LoginRouterActivity loginRouterActivity, ProgressPropertiesImpl progressPropertiesImpl, boolean z) {
        super(loginRouterActivity);
        this.c = progressPropertiesImpl;
        this.w = com.yandex.passport.common.ui.b.b(this, loginRouterActivity, progressPropertiesImpl, z, 0.0f, 16);
        this.x = progressPropertiesImpl.getSize().toSize();
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(frameLayoutBuilder);
        }
        frameLayoutBuilder.setBackgroundColor(0);
        frameLayoutBuilder.invoke(this.w, new s0(20, frameLayoutBuilder, this));
        return frameLayoutBuilder;
    }
}
