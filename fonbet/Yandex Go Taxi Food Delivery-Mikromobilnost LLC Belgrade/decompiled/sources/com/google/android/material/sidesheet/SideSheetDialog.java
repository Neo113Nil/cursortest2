package com.google.android.material.sidesheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.jvh0;
import defpackage.leh0;
import defpackage.ny61;
import defpackage.uas0;
import defpackage.vas0;
import defpackage.zsr0;

/* loaded from: classes11.dex */
public class SideSheetDialog extends SheetDialog<uas0> {
    private static final int SIDE_SHEET_DIALOG_THEME_ATTR = eng0.sideSheetDialogTheme;
    private static final int SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = g2i0.Theme_Material3_Light_SideSheetDialog;

    public SideSheetDialog(Context context, int i) {
        super(context, i, SIDE_SHEET_DIALOG_THEME_ATTR, SIDE_SHEET_DIALOG_DEFAULT_THEME_RES);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public void addSheetCancelOnHideCallback(zsr0 zsr0Var) {
        ((SideSheetBehavior) zsr0Var).O.add(new vas0(this));
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public SideSheetBehavior<? extends View> getBehavior() {
        zsr0 behavior = super.getBehavior();
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        ny61.r("The view is not associated with SideSheetBehavior");
        return null;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public zsr0 getBehaviorFromSheet(FrameLayout frameLayout) {
        int i = SideSheetBehavior.Q;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            ny61.g("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        ny61.g("The view is not associated with SideSheetBehavior");
        return null;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public int getDialogId() {
        return leh0.m3_side_sheet;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public int getLayoutResId() {
        return jvh0.m3_side_sheet_dialog;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public int getStateOnStart() {
        return 3;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
        return super.isDismissWithSheetAnimationEnabled();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z) {
        super.setCancelable(z);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(int i) {
        super.setContentView(i);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean z) {
        super.setDismissWithSheetAnimationEnabled(z);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setSheetEdge(int i) {
        super.setSheetEdge(i);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view) {
        super.setContentView(view);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    public SideSheetDialog(Context context) {
        this(context, 0);
    }
}
