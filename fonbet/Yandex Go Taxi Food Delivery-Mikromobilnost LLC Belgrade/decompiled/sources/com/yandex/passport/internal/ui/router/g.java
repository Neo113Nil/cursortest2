package com.yandex.passport.internal.ui.router;

import android.view.View;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class g extends t2y {
    public g(GlobalRouterActivity globalRouterActivity) {
        super(globalRouterActivity);
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(frameLayoutBuilder);
        }
        frameLayoutBuilder.setBackgroundColor(0);
        return frameLayoutBuilder;
    }
}
