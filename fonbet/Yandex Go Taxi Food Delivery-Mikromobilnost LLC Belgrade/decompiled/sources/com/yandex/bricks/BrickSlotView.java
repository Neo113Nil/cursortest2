package com.yandex.bricks;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import defpackage.ek6;
import defpackage.fk6;
import defpackage.m6;
import defpackage.ny61;
import defpackage.xj6;

/* loaded from: classes11.dex */
public class BrickSlotView extends View implements fk6 {
    private ek6 mOnInsertListener;
    private boolean mUsed;

    public BrickSlotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOnInsertListener = null;
        setWillNotDraw(true);
    }

    @Override // defpackage.fk6
    public View getView() {
        if (this.mUsed) {
            ny61.k();
            return null;
        }
        if (getParent() != null) {
            return this;
        }
        ny61.k();
        return null;
    }

    @Override // defpackage.fk6
    public fk6 insert(Brick brick) {
        if (this.mUsed) {
            ny61.k();
            return null;
        }
        if (getParent() == null) {
            ny61.k();
            return null;
        }
        View replaceWithBrick = brick.replaceWithBrick(this);
        this.mUsed = true;
        xj6 xj6Var = new xj6(brick, replaceWithBrick);
        ek6 ek6Var = this.mOnInsertListener;
        if (ek6Var != null) {
            c cVar = (c) ((m6) ek6Var).b;
            cVar.c = brick;
            cVar.b = xj6Var;
            cVar.a = replaceWithBrick;
            this.mOnInsertListener = null;
        }
        return xj6Var;
    }

    @Override // defpackage.fk6
    public boolean isUsed() {
        return this.mUsed;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(AbsSavedState.EMPTY_STATE);
    }

    @Override // defpackage.fk6
    public void setOnInsertListener(ek6 ek6Var) {
        if (this.mUsed) {
            ny61.k();
        } else {
            this.mOnInsertListener = ek6Var;
        }
    }

    public BrickSlotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrickSlotView(Context context) {
        this(context, null, 0);
    }

    public BrickSlotView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mOnInsertListener = null;
        setWillNotDraw(true);
    }
}
