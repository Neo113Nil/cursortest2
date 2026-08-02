package com.yandex.alicekit.core.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes11.dex */
public class FixedProgressBar extends ProgressBar {
    public FixedProgressBar(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public FixedProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FixedProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FixedProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
