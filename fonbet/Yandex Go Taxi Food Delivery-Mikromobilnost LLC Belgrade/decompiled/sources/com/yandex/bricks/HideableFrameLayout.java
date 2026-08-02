package com.yandex.bricks;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.bju;
import defpackage.cju;

/* loaded from: classes11.dex */
public class HideableFrameLayout extends FrameLayout implements cju {
    private final HideableHelper mHideableHelper;

    public HideableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHideableHelper = new HideableHelper(this, getVisibility() == 0);
    }

    @Override // defpackage.cju
    public void addObserver(bju bjuVar) {
        this.mHideableHelper.addObserver(bjuVar);
    }

    @Override // defpackage.cju
    public boolean isVisibleToUser() {
        return this.mHideableHelper.isVisible();
    }

    @Override // defpackage.cju
    public void removeObserver(bju bjuVar) {
        this.mHideableHelper.removeObserver(bjuVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        setVisibleToUser(i == 0);
    }

    public void setVisibleToUser(boolean z) {
        this.mHideableHelper.setVisibility(z);
    }

    public HideableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HideableFrameLayout(Context context) {
        this(context, null);
    }
}
