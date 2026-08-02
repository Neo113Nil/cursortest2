package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.internal.e;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.dfz0;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.nd6;
import defpackage.od6;
import defpackage.wly0;
import defpackage.yvy0;
import defpackage.z2i0;

/* loaded from: classes11.dex */
public class BottomNavigationView extends NavigationBarView {
    private static final int MAX_ITEM_COUNT = 6;

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        dfz0 e = yvy0.e(getContext(), attributeSet, z2i0.BottomNavigationView, i, i2, new int[0]);
        int i3 = z2i0.BottomNavigationView_itemHorizontalTranslationEnabled;
        TypedArray typedArray = e.b;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(i3, true));
        if (typedArray.hasValue(z2i0.BottomNavigationView_android_minHeight)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(z2i0.BottomNavigationView_android_minHeight, 0));
        }
        e.g();
        applyWindowInsets();
    }

    private void applyWindowInsets() {
        e.c(this, new wly0());
    }

    private int makeMinHeightSpec(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), Integer.MIN_VALUE);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public NavigationBarMenuView createNavigationBarMenuView(Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 6;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((BottomNavigationMenuView) getMenuView()).isItemHorizontalTranslationEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, makeMinHeightSpec(i2));
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight()));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.isItemHorizontalTranslationEnabled() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(nd6 nd6Var) {
        setOnItemReselectedListener(nd6Var);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(od6 od6Var) {
        setOnItemSelectedListener(od6Var);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, g2i0.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }
}
