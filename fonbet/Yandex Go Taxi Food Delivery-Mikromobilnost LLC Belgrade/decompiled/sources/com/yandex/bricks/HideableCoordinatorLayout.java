package com.yandex.bricks;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.bju;
import defpackage.cju;

/* loaded from: classes11.dex */
public class HideableCoordinatorLayout extends CoordinatorLayout implements cju {
    private final HideableHelper mHideableHelper;

    public HideableCoordinatorLayout(Context context) {
        super(context);
        this.mHideableHelper = new HideableHelper(this);
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

    public void setVisibleToUser(boolean z) {
        this.mHideableHelper.setVisibility(z);
    }

    public HideableCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHideableHelper = new HideableHelper(this);
    }

    public HideableCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHideableHelper = new HideableHelper(this);
    }
}
