package com.yandex.bricks;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.bju;
import defpackage.cju;

/* loaded from: classes11.dex */
public class HideableCustomFrameLayout extends FrameLayout implements cju {
    private HideableHelper mHideableHelper;

    public HideableCustomFrameLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.cju
    public void addObserver(bju bjuVar) {
        HideableHelper hideableHelper = this.mHideableHelper;
        if (hideableHelper == null) {
            return;
        }
        hideableHelper.addObserver(bjuVar);
    }

    @Override // defpackage.cju
    public boolean isVisibleToUser() {
        HideableHelper hideableHelper = this.mHideableHelper;
        if (hideableHelper == null) {
            return false;
        }
        return hideableHelper.isVisible();
    }

    @Override // defpackage.cju
    public void removeObserver(bju bjuVar) {
        HideableHelper hideableHelper = this.mHideableHelper;
        if (hideableHelper == null) {
            return;
        }
        hideableHelper.removeObserver(bjuVar);
    }

    public void setInitVisibility(boolean z) {
        this.mHideableHelper = new HideableHelper(this, z);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        setVisibleToUser(i == 0);
    }

    public void setVisibleToUser(boolean z) {
        HideableHelper hideableHelper = this.mHideableHelper;
        if (hideableHelper == null) {
            return;
        }
        hideableHelper.setVisibility(z);
    }

    public HideableCustomFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HideableCustomFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
