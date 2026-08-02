package com.yandex.messaging.internal.view.input.emojipanel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.otn;

/* loaded from: classes15.dex */
public class EmojiView extends View {
    private otn mData;

    public EmojiView(Context context) {
        this(context, null);
    }

    private void draw(Canvas canvas, otn otnVar) {
        otnVar.c.draw(canvas, null, 0, 0, getPaddingLeft(), 0, getPaddingTop() + (-otnVar.b.ascent), 0, otnVar.a);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        otn otnVar = this.mData;
        if (otnVar != null) {
            draw(canvas, otnVar);
        }
    }

    public void setData(otn otnVar) {
        this.mData = otnVar;
        postInvalidate();
    }

    public EmojiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
