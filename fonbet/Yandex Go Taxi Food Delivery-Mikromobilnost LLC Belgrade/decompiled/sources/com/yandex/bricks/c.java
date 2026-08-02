package com.yandex.bricks;

import android.view.View;
import com.yandex.bricks.BrickViewLifecycle;
import defpackage.fk6;
import defpackage.m6;
import defpackage.w04;
import defpackage.z83;

/* loaded from: classes11.dex */
public final class c {
    public View a;
    public fk6 b;
    public Brick c;
    public b d;

    public c(BrickSlotView brickSlotView) {
        this.a = brickSlotView;
        this.b = brickSlotView;
        brickSlotView.isUsed();
        z83.i();
        brickSlotView.setOnInsertListener(new m6(23, this));
    }

    public final void a(Brick brick) {
        BrickViewLifecycle.ViewHelper viewHelper;
        if (brick == this.c) {
            return;
        }
        b bVar = this.d;
        if (bVar != null && (viewHelper = bVar.c) != null) {
            viewHelper.detachFromView();
            bVar.c = null;
        }
        this.d = null;
        fk6 fk6Var = this.b;
        if ((fk6Var instanceof BrickSlotView) && ((BrickSlotView) fk6Var).getParent() == null) {
            this.d = new b((BrickSlotView) this.b, new w04(18, this, brick));
            return;
        }
        fk6 insert = this.b.insert(brick);
        insert.isUsed();
        z83.i();
        insert.setOnInsertListener(new m6(23, this));
    }
}
