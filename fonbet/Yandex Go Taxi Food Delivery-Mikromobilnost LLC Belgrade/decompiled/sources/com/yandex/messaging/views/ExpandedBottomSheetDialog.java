package com.yandex.messaging.views;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.apo;
import defpackage.cmi;
import defpackage.cz2;
import defpackage.e9h0;
import defpackage.eng0;
import defpackage.olh0;
import defpackage.w0i0;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public class ExpandedBottomSheetDialog extends AppCompatDialog {
    private BottomSheetBehavior<FrameLayout> mBehavior;
    private final BottomSheetBehavior.a mBottomSheetCallback;
    boolean mCancelable;
    private boolean mCanceledOnTouchOutside;
    private boolean mCanceledOnTouchOutsideSet;

    public ExpandedBottomSheetDialog(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mCancelable = true;
        this.mCanceledOnTouchOutside = true;
        this.mBottomSheetCallback = new apo(this);
        supportRequestWindowFeature(1);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(eng0.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : w0i0.Messaging_Theme_BottomSheetDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$wrapInBottomSheet$0(View view) {
        if (this.mCancelable && isShowing() && shouldWindowCloseOnTouchOutside()) {
            cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$wrapInBottomSheet$1(View view, MotionEvent motionEvent) {
        return true;
    }

    private boolean shouldWindowCloseOnTouchOutside() {
        if (!this.mCanceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.mCanceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.mCanceledOnTouchOutsideSet = true;
        }
        return this.mCanceledOnTouchOutside;
    }

    private View wrapInBottomSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), olh0.msg_d_design_expanded_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(e9h0.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(e9h0.design_bottom_sheet);
        BottomSheetBehavior<FrameLayout> D = BottomSheetBehavior.D(frameLayout2);
        this.mBehavior = D;
        BottomSheetBehavior.a aVar = this.mBottomSheetCallback;
        ArrayList arrayList = D.x0;
        arrayList.clear();
        if (aVar != null) {
            arrayList.add(aVar);
        }
        this.mBehavior.T(this.mCancelable);
        this.mBehavior.W(3);
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(e9h0.touch_outside).setOnClickListener(new cmi(19, this));
        b.p(frameLayout2, new a(this));
        frameLayout2.setOnTouchListener(new cz2(6));
        return frameLayout;
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        return this.mBehavior;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(SelfTester_JCP.DECRYPT_CBC);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.mBehavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.k0 != 5) {
            return;
        }
        bottomSheetBehavior.W(3);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.mCancelable != z) {
            this.mCancelable = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.mBehavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.T(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.mCancelable) {
            this.mCancelable = true;
        }
        this.mCanceledOnTouchOutside = z;
        this.mCanceledOnTouchOutsideSet = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(i, null, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    public ExpandedBottomSheetDialog(Context context) {
        this(context, 0);
    }

    public ExpandedBottomSheetDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.mCancelable = true;
        this.mCanceledOnTouchOutside = true;
        this.mBottomSheetCallback = new apo(this);
        supportRequestWindowFeature(1);
        this.mCancelable = z;
    }
}
