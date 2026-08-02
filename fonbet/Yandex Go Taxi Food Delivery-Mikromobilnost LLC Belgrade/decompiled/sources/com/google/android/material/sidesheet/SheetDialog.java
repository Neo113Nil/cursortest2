package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.d710;
import defpackage.g2i0;
import defpackage.jl40;
import defpackage.leh0;
import defpackage.ny61;
import defpackage.uas0;
import defpackage.zsr0;

/* loaded from: classes11.dex */
abstract class SheetDialog<C extends uas0> extends AppCompatDialog {
    private static final int COORDINATOR_LAYOUT_ID = leh0.coordinator;
    private static final int TOUCH_OUTSIDE_ID = leh0.touch_outside;
    private d710 backOrchestrator;
    private zsr0 behavior;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private boolean fitsSystemWindows;
    private FrameLayout sheet;

    public SheetDialog(Context context, int i, int i2, int i3) {
        super(context, getThemeResId(context, i, i2, i3));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.fitsSystemWindows = true;
        supportRequestWindowFeature(1);
    }

    private void ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), getLayoutResId(), null);
            this.container = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(getDialogId());
            this.sheet = frameLayout2;
            zsr0 behaviorFromSheet = getBehaviorFromSheet(frameLayout2);
            this.behavior = behaviorFromSheet;
            addSheetCancelOnHideCallback(behaviorFromSheet);
            this.backOrchestrator = new d710(this.behavior, this.sheet);
        }
    }

    private FrameLayout getContainer() {
        if (this.container == null) {
            ensureContainerAndBehavior();
        }
        return this.container;
    }

    private FrameLayout getSheet() {
        if (this.sheet == null) {
            ensureContainerAndBehavior();
        }
        return this.sheet;
    }

    private static int getThemeResId(Context context, int i, int i2, int i3) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i2, typedValue, true) ? typedValue.resourceId : i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$wrapInSheet$0(View view) {
        if (this.cancelable && isShowing() && shouldWindowCloseOnTouchOutside()) {
            cancel();
        }
    }

    private void maybeUpdateWindowAnimationsBasedOnLayoutDirection() {
        FrameLayout frameLayout;
        Window window = getWindow();
        if (window == null || (frameLayout = this.sheet) == null || !(frameLayout.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return;
        }
        window.setWindowAnimations(Gravity.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) this.sheet.getLayoutParams()).gravity, this.sheet.getLayoutDirection()) == 3 ? g2i0.Animation_Material3_SideSheetDialog_Left : g2i0.Animation_Material3_SideSheetDialog_Right);
    }

    private boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    private void updateFitsSystemWindows() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.setFitsSystemWindows(this.fitsSystemWindows);
        }
        CoordinatorLayout coordinatorLayout = this.coordinator;
        if (coordinatorLayout != null) {
            coordinatorLayout.setFitsSystemWindows(this.fitsSystemWindows);
        }
        Window window = getWindow();
        if (window != null) {
            jl40.L(window, this.fitsSystemWindows);
        }
    }

    private void updateListeningForBackCallbacks() {
        d710 d710Var = this.backOrchestrator;
        if (d710Var == null) {
            return;
        }
        if (this.cancelable) {
            d710Var.a(false);
        } else {
            d710Var.b();
        }
    }

    private View wrapInSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        this.coordinator = (CoordinatorLayout) getContainer().findViewById(COORDINATOR_LAYOUT_ID);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) this.coordinator, false);
        }
        FrameLayout sheet = getSheet();
        sheet.removeAllViews();
        if (layoutParams == null) {
            sheet.addView(view);
        } else {
            sheet.addView(view, layoutParams);
        }
        this.coordinator.findViewById(TOUCH_OUTSIDE_ID).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SheetDialog.this.lambda$wrapInSheet$0(view2);
            }
        });
        androidx.core.view.b.p(getSheet(), new b(this));
        return this.container;
    }

    public abstract void addSheetCancelOnHideCallback(zsr0 zsr0Var);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        zsr0 behavior = getBehavior();
        if (!this.dismissWithAnimation || ((SideSheetBehavior) behavior).A == 5) {
            super.cancel();
        } else {
            ((SideSheetBehavior) behavior).u(5);
        }
    }

    public zsr0 getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public abstract zsr0 getBehaviorFromSheet(FrameLayout frameLayout);

    public abstract int getDialogId();

    public abstract int getLayoutResId();

    public abstract int getStateOnStart();

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.dismissWithAnimation;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        updateFitsSystemWindows();
        updateListeningForBackCallbacks();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(0);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d710 d710Var = this.backOrchestrator;
        if (d710Var != null) {
            d710Var.b();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        zsr0 zsr0Var = this.behavior;
        if (zsr0Var == null || ((SideSheetBehavior) zsr0Var).A != 5) {
            return;
        }
        ((SideSheetBehavior) zsr0Var).u(getStateOnStart());
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
        }
        if (getWindow() != null) {
            updateListeningForBackCallbacks();
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInSheet(0, view, null));
    }

    public void setDismissWithSheetAnimationEnabled(boolean z) {
        this.dismissWithAnimation = z;
    }

    public void setFitsSystemWindows(boolean z) {
        this.fitsSystemWindows = z;
        updateFitsSystemWindows();
    }

    public void setSheetEdge(int i) {
        FrameLayout frameLayout = this.sheet;
        if (frameLayout == null) {
            ny61.r("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
            return;
        }
        if (frameLayout.isLaidOut()) {
            ny61.r("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.sheet.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            ((CoordinatorLayout.LayoutParams) layoutParams).gravity = i;
            maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(wrapInSheet(i, null, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInSheet(0, view, layoutParams));
    }
}
