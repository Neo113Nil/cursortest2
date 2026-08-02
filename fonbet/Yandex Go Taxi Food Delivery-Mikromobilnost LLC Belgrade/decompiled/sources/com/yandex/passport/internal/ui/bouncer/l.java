package com.yandex.passport.internal.ui.bouncer;

import android.view.View;
import com.lightside.slab.SlotView;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class l extends t2y {
    public final com.lightside.slab.c c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(BouncerActivity bouncerActivity) {
        super(bouncerActivity);
        SlotView slotView = new SlotView(wj91.e(0, bouncerActivity), null, 0, 0);
        if (this instanceof lzx) {
            ((lzx) this).addToParent(slotView);
        }
        this.c = new com.lightside.slab.c(slotView);
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(frameLayoutBuilder);
        }
        View view = this.c.a;
        wj91.e(0, frameLayoutBuilder.getCtx());
        frameLayoutBuilder.addToParent(view);
        view.setLayoutParams(frameLayoutBuilder.generateLayoutParams(-1, -1));
        return frameLayoutBuilder;
    }
}
