package com.yandex.bricks;

import com.yandex.bricks.BrickViewLifecycle;
import defpackage.w04;

/* loaded from: classes11.dex */
public final class b extends BrickViewLifecycle {
    public final BrickSlotView w;
    public final w04 x;

    public b(BrickSlotView brickSlotView, w04 w04Var) {
        this.w = brickSlotView;
        this.x = w04Var;
        a(brickSlotView);
    }

    @Override // com.yandex.bricks.BrickViewLifecycle, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        this.x.invoke(this.w);
        BrickViewLifecycle.ViewHelper viewHelper = this.c;
        if (viewHelper != null) {
            viewHelper.detachFromView();
            this.c = null;
        }
    }
}
