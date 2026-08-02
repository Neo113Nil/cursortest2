package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;
import defpackage.xr2;

/* loaded from: classes10.dex */
public final class f extends i implements xr2 {
    public CharSequence T;
    public ListAdapter U;
    public final Rect V;
    public int W;
    public final /* synthetic */ AppCompatSpinner Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(final AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.Z = appCompatSpinner;
        this.V = new Rect();
        this.H = appCompatSpinner;
        e();
        this.I = new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                f.this.Z.setSelection(i2);
                if (f.this.Z.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    fVar.Z.performItemClick(view, i2, fVar.U.getItemId(i2));
                }
                f.this.dismiss();
            }
        };
    }

    public final void f() {
        int i;
        PopupWindow popupWindow = this.S;
        Drawable background = popupWindow.getBackground();
        AppCompatSpinner appCompatSpinner = this.Z;
        Rect rect = appCompatSpinner.mTempRect;
        if (background != null) {
            background.getPadding(rect);
            int layoutDirection = appCompatSpinner.getLayoutDirection();
            Rect rect2 = appCompatSpinner.mTempRect;
            i = layoutDirection == 1 ? rect2.right : -rect2.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i2 = appCompatSpinner.mDropDownWidth;
        if (i2 == -2) {
            int compatMeasureContentWidth = appCompatSpinner.compatMeasureContentWidth((SpinnerAdapter) this.U, popupWindow.getBackground());
            int i3 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = appCompatSpinner.mTempRect;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (compatMeasureContentWidth > i4) {
                compatMeasureContentWidth = i4;
            }
            d(Math.max(compatMeasureContentWidth, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            d((width - paddingLeft) - paddingRight);
        } else {
            d(i2);
        }
        this.y = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.x) - this.W) + i : paddingLeft + this.W + i;
    }

    @Override // defpackage.xr2
    public final CharSequence getHintText() {
        return this.T;
    }

    @Override // androidx.appcompat.widget.i, defpackage.xr2
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.U = listAdapter;
    }

    @Override // defpackage.xr2
    public final void setHorizontalOriginalOffset(int i) {
        this.W = i;
    }

    @Override // defpackage.xr2
    public final void setPromptText(CharSequence charSequence) {
        this.T = charSequence;
    }

    @Override // defpackage.xr2
    public final void show(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.S;
        boolean isShowing = popupWindow.isShowing();
        f();
        popupWindow.setInputMethodMode(2);
        show();
        DropDownListView dropDownListView = this.c;
        dropDownListView.setChoiceMode(1);
        dropDownListView.setTextDirection(i);
        dropDownListView.setTextAlignment(i2);
        AppCompatSpinner appCompatSpinner = this.Z;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        DropDownListView dropDownListView2 = this.c;
        if (popupWindow.isShowing() && dropDownListView2 != null) {
            dropDownListView2.setListSelectionHidden(false);
            dropDownListView2.setSelection(selectedItemPosition);
            if (dropDownListView2.getChoiceMode() != 0) {
                dropDownListView2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                AppCompatSpinner appCompatSpinner2 = fVar.Z;
                if (!appCompatSpinner2.isAttachedToWindow() || !appCompatSpinner2.getGlobalVisibleRect(fVar.V)) {
                    f.this.dismiss();
                } else {
                    f.this.f();
                    f.this.show();
                }
            }
        };
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$3
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver2 = f.this.Z.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                }
            }
        });
    }
}
