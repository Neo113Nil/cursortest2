package com.vkontakte.android.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes7.dex */
public abstract class RenderView<T> extends View {
    public int b;

    public RenderView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (i5 == this.b || !z) {
            return;
        }
        this.b = i5;
    }

    public RenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public RenderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
