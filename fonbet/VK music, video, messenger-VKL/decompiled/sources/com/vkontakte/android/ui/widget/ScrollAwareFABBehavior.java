package com.vkontakte.android.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import xsna.neh0;

/* loaded from: classes7.dex */
public class ScrollAwareFABBehavior extends FloatingActionButton.Behavior {
    public ScrollAwareFABBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void s(int i, View view) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        if (i > 0 && floatingActionButton.getVisibility() == 0) {
            floatingActionButton.g(new neh0(), true);
        } else {
            if (i >= 0 || floatingActionButton.getVisibility() == 0) {
                return;
            }
            floatingActionButton.l(null, true);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean y(int i, View view) {
        return i == 2;
    }

    public ScrollAwareFABBehavior(Context context, AttributeSet attributeSet) {
    }
}
