package com.yandex.passport.internal.ui.sloth.menu;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import com.yandex.passport.sloth.ui.d0;
import com.yandex.passport.sloth.ui.i2;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.mns0;
import defpackage.t2y;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class h extends t2y {
    public final p c;
    public final i2 w;

    public h(p pVar, Activity activity, com.yandex.passport.sloth.ui.string.a aVar) {
        super(activity);
        this.c = pVar;
        this.w = new i2(activity, aVar, pVar.b);
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(frameLayoutBuilder);
        }
        mns0 mns0Var = new mns0((d0) this.c.d.getValue());
        wj91.e(0, frameLayoutBuilder.getCtx());
        frameLayoutBuilder.addToParent(mns0Var.getRoot());
        frameLayoutBuilder.setVisibility(8);
        ViewGroup.LayoutParams generateLayoutParams = frameLayoutBuilder.generateLayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) generateLayoutParams;
        layoutParams.width = -1;
        layoutParams.height = -1;
        frameLayoutBuilder.setLayoutParams(generateLayoutParams);
        wj91.e(0, frameLayoutBuilder.getCtx());
        frameLayoutBuilder.addToParent(this.w.getRoot());
        frameLayoutBuilder.setVisibility(0);
        ViewGroup.LayoutParams generateLayoutParams2 = frameLayoutBuilder.generateLayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) generateLayoutParams2;
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        frameLayoutBuilder.setLayoutParams(generateLayoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = -1;
        frameLayoutBuilder.setLayoutParams(layoutParams3);
        return frameLayoutBuilder;
    }
}
