package com.yandex.passport.internal.ui.authsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class p extends t2y {
    public final com.yandex.passport.internal.ui.bouncer.error.h c;
    public final com.yandex.passport.common.common.a w;
    public final com.yandex.passport.common.analytics.d x;
    public final com.yandex.passport.internal.clipboard.a y;

    public p(Activity activity, com.yandex.passport.internal.ui.bouncer.error.h hVar, com.yandex.passport.common.common.a aVar, com.yandex.passport.common.analytics.d dVar, com.yandex.passport.internal.clipboard.a aVar2) {
        super(activity);
        this.c = hVar;
        this.w = aVar;
        this.x = dVar;
        this.y = aVar2;
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(frameLayoutBuilder);
        }
        wj91.e(0, frameLayoutBuilder.getCtx());
        com.yandex.passport.internal.ui.bouncer.error.h hVar = this.c;
        frameLayoutBuilder.addToParent(hVar.getRoot());
        frameLayoutBuilder.setVisibility(0);
        ConstraintLayout.LayoutParams generateLayoutParams = hVar.b.generateLayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) generateLayoutParams).width = -1;
        ((ViewGroup.MarginLayoutParams) generateLayoutParams).height = -1;
        frameLayoutBuilder.setLayoutParams(generateLayoutParams);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = -1;
        frameLayoutBuilder.setLayoutParams(layoutParams);
        return frameLayoutBuilder;
    }
}
