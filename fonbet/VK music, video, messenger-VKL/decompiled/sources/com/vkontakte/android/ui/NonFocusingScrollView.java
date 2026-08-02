package com.vkontakte.android.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class NonFocusingScrollView extends ScrollView {
    public NonFocusingScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final ArrayList<View> getFocusables(int i) {
        return new ArrayList<>();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return false;
    }
}
