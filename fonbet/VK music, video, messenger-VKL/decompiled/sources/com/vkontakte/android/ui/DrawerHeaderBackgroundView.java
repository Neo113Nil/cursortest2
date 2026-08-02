package com.vkontakte.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.e3m;
import xsna.iah0;
import xsna.j6r0;
import xsna.m33;

/* loaded from: classes7.dex */
public class DrawerHeaderBackgroundView extends View {
    public Drawable b;

    public DrawerHeaderBackgroundView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        this.b = m33.a(R.drawable.scrim_menu, context);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.b.setBounds(0, getHeight() - this.b.getIntrinsicHeight(), getWidth(), getHeight());
        this.b.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (size <= 0) {
            WeakHashMap weakHashMap = j6r0.a;
            size = iah0.a(180.0f);
        }
        setMeasuredDimension(size2, size);
    }

    public DrawerHeaderBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public DrawerHeaderBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public DrawerHeaderBackgroundView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }
}
