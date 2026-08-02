package com.yandex.alicekit.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.c3i0;
import defpackage.dfz0;

/* loaded from: classes11.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dfz0 f = dfz0.f(context, attributeSet, c3i0.TabItem);
        int i = c3i0.TabItem_android_text;
        TypedArray typedArray = f.b;
        this.text = typedArray.getText(i);
        this.icon = f.b(c3i0.TabItem_android_icon);
        this.customLayout = typedArray.getResourceId(c3i0.TabItem_android_layout, 0);
        f.g();
    }

    public TabItem(Context context) {
        this(context, null);
    }
}
