package com.vkontakte.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.m33;

/* loaded from: classes7.dex */
public class HighlightView extends View {
    public HighlightView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        setBackgroundDrawable(m33.a(R.drawable.highlight, context));
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getBackground() != null) {
            getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public HighlightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public HighlightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public HighlightView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }
}
