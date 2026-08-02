package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.cc5;
import defpackage.d1t0;
import defpackage.eng0;
import defpackage.jvh0;
import defpackage.ny61;

/* loaded from: classes11.dex */
public final class c extends b {
    public static final int[] z = {eng0.snackbarButtonStyle, eng0.snackbarTextViewStyle};
    public final AccessibilityManager y;

    public c(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.y = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static c f(View view, CharSequence charSequence) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            ny61.g("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? jvh0.design_layout_snackbar_include : jvh0.mtrl_layout_snackbar_include, viewGroup, false);
        c cVar = new c(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) cVar.i.getChildAt(0)).getMessageView().setText(charSequence);
        return cVar;
    }

    public final void g() {
        d b = d.b();
        boolean z2 = false;
        int recommendedTimeoutMillis = this.y.getRecommendedTimeoutMillis(0, 3);
        cc5 cc5Var = this.s;
        synchronized (b.a) {
            try {
                if (b.c(cc5Var)) {
                    d1t0 d1t0Var = b.c;
                    d1t0Var.b = recommendedTimeoutMillis;
                    b.b.removeCallbacksAndMessages(d1t0Var);
                    b.f(b.c);
                    return;
                }
                d1t0 d1t0Var2 = b.d;
                if (d1t0Var2 != null && d1t0Var2.a.get() == cc5Var) {
                    z2 = true;
                }
                if (z2) {
                    b.d.b = recommendedTimeoutMillis;
                } else {
                    b.d = new d1t0(recommendedTimeoutMillis, cc5Var);
                }
                d1t0 d1t0Var3 = b.c;
                if (d1t0Var3 == null || !b.a(d1t0Var3, 4)) {
                    b.c = null;
                    b.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
