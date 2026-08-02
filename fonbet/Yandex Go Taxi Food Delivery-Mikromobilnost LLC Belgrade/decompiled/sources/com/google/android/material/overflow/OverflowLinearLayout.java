package com.google.android.material.overflow;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.k;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.overflow.OverflowLinearLayout;
import defpackage.dfz0;
import defpackage.eng0;
import defpackage.fuz0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.jvh0;
import defpackage.kxh0;
import defpackage.org0;
import defpackage.qc2;
import defpackage.yib1;
import defpackage.yvy0;
import defpackage.z2i0;
import defpackage.z610;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public class OverflowLinearLayout extends LinearLayout {
    private static final int DEF_STYLE_RES = g2i0.Widget_Material3_OverflowLinearLayout;
    private final MaterialButton overflowButton;
    private boolean overflowButtonAdded;
    private final Set<View> overflowViews;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OverflowLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r4), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.overflowButtonAdded = false;
        this.overflowViews = new LinkedHashSet();
        Context context2 = getContext();
        dfz0 e = yvy0.e(context2, attributeSet, z2i0.OverflowLinearLayout, i, i2, new int[0]);
        Drawable b = e.b(z2i0.OverflowLinearLayout_overflowButtonIcon);
        e.g();
        MaterialButton materialButton = (MaterialButton) LayoutInflater.from(context2).inflate(jvh0.m3_overflow_linear_layout_overflow_button, (ViewGroup) this, false);
        this.overflowButton = materialButton;
        fuz0.a(materialButton, getResources().getString(kxh0.m3_overflow_linear_layout_button_tooltip_text));
        setOverflowButtonIcon(b);
        if (materialButton.getContentDescription() == null) {
            materialButton.setContentDescription(context2.getString(kxh0.m3_overflow_linear_layout_button_content_description));
        }
        final k kVar = new k(getContext(), materialButton, 17, 0, z610.e(eng0.overflowLinearLayoutPopupMenuStyle, this).data);
        final int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(org0.m3_overflow_item_icon_horizontal_padding);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: c090
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverflowLinearLayout.this.lambda$new$0(kVar, dimensionPixelOffset, view);
            }
        });
    }

    private int getChildSize(boolean z, View view, int i, int i2) {
        int measuredHeight;
        int i3;
        int minimumHeight;
        int i4;
        measureChild(view, i, i2);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z) {
            measuredHeight = view.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
            i3 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
        } else {
            measuredHeight = view.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin;
            i3 = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
        }
        int i5 = measuredHeight + i3;
        if (i5 != 0) {
            return i5;
        }
        if (z) {
            minimumHeight = view.getMinimumWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
            i4 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
        } else {
            minimumHeight = view.getMinimumHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin;
            i4 = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
        }
        return minimumHeight + i4;
    }

    private int getOverflowButtonSize(boolean z, View view, int i, int i2) {
        int measuredHeight;
        int i3;
        measureChild(view, i, i2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (z) {
            measuredHeight = view.getMeasuredWidth() + layoutParams.leftMargin;
            i3 = layoutParams.rightMargin;
        } else {
            measuredHeight = view.getMeasuredHeight() + layoutParams.topMargin;
            i3 = layoutParams.bottomMargin;
        }
        return measuredHeight + i3;
    }

    private void handleOverflowButtonClick(k kVar, int i) {
        int i2;
        kVar.a.clear();
        int i3 = 1;
        kVar.c.e(true);
        for (View view : this.overflowViews) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            MenuItem add = kVar.a.add(yib1.e(view, layoutParams.overflowText));
            Drawable drawable = layoutParams.overflowIcon;
            if (drawable != null) {
                i2 = i;
                add.setIcon(new InsetDrawable(drawable, i2, 0, i, 0));
            } else {
                i2 = i;
            }
            if (view instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) view;
                add.setCheckable(materialButton.isCheckable());
                add.setChecked(materialButton.isChecked());
            }
            add.setEnabled(view.isEnabled());
            add.setOnMenuItemClickListener(new qc2(i3, view, add));
            i = i2;
        }
        kVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$handleOverflowButtonClick$1(View view, MenuItem menuItem, MenuItem menuItem2) {
        view.performClick();
        if (menuItem.isCheckable()) {
            menuItem.setChecked(!menuItem.isChecked());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(k kVar, int i, View view) {
        handleOverflowButtonClick(kVar, i);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return getOrientation() == 0 ? new LayoutParams(-2, -2) : new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams(layoutParams) : layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public Drawable getOverflowButtonIcon() {
        return this.overflowButton.getIcon();
    }

    public Set<View> getOverflowedViews() {
        return this.overflowViews;
    }

    public boolean isOverflowed() {
        return !this.overflowViews.isEmpty();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Set<View> set;
        boolean z = getOrientation() == 0;
        int childCount = this.overflowButtonAdded ? getChildCount() - 1 : getChildCount();
        int size = z ? View.MeasureSpec.getSize(i) : View.MeasureSpec.getSize(i2);
        int overflowButtonSize = getOverflowButtonSize(z, this.overflowButton, i, i2);
        this.overflowButton.setVisibility(8);
        this.overflowViews.clear();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                this.overflowButton.setVisibility(8);
                this.overflowViews.clear();
                break;
            }
            View childAt = getChildAt(i3);
            childAt.setVisibility(0);
            i4 += getChildSize(z, childAt, i, i2);
            if (i4 + overflowButtonSize > size) {
                this.overflowViews.add(childAt);
            }
            if (i4 > size) {
                int i5 = i3 + 1;
                while (true) {
                    set = this.overflowViews;
                    if (i5 >= childCount) {
                        break;
                    }
                    set.add(getChildAt(i5));
                    i5++;
                }
                Iterator<View> it = set.iterator();
                while (it.hasNext()) {
                    it.next().setVisibility(8);
                }
                if (!this.overflowButtonAdded) {
                    addView(this.overflowButton);
                    this.overflowButtonAdded = true;
                }
                this.overflowButton.setVisibility(0);
            } else {
                i3++;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        this.overflowButton.lambda$setSecondaryIcon$3(drawable);
    }

    public void setOverflowButtonIconResource(int i) {
        this.overflowButton.setIconResource(i);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public Drawable overflowIcon;
        public CharSequence overflowText;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.overflowIcon = null;
            this.overflowText = null;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.OverflowLinearLayout_Layout);
            this.overflowIcon = obtainStyledAttributes.getDrawable(z2i0.OverflowLinearLayout_Layout_layout_overflowIcon);
            this.overflowText = obtainStyledAttributes.getText(z2i0.OverflowLinearLayout_Layout_layout_overflowText);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(int i, int i2, float f, Drawable drawable, CharSequence charSequence) {
            super(i, i2, f);
            this.overflowIcon = drawable;
            this.overflowText = charSequence;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.overflowIcon = null;
            this.overflowText = null;
            this.overflowText = layoutParams.overflowText;
            this.overflowIcon = layoutParams.overflowIcon;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public OverflowLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.overflowLinearLayoutStyle);
    }

    public OverflowLinearLayout(Context context) {
        this(context, null);
    }
}
