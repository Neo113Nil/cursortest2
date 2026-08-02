package com.ybsdk.widgets.common.snackbar;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.lifecycle.p;
import defpackage.eja1;
import defpackage.fch0;
import defpackage.fse;
import defpackage.i5z0;
import defpackage.j0t0;
import defpackage.k0t0;
import defpackage.n0t0;
import defpackage.pey;
import defpackage.quq0;
import defpackage.rh2;
import defpackage.vng;
import defpackage.x4c;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.Result$Failure] */
    public static void a(a aVar, Activity activity, n0t0 n0t0Var, k0t0 k0t0Var, int i) {
        int[] failure;
        Snackbar snackbar;
        fse fseVar;
        k0t0 k0t0Var2 = (i & 4) != 0 ? j0t0.b : k0t0Var;
        aVar.getClass();
        View findViewById = activity.findViewById(fch0.ybsdkSnackbarAnchor);
        if (findViewById == null) {
            return;
        }
        try {
            failure = new int[2];
            findViewById.getLocationOnScreen(failure);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            i5z0.a.f(a, "Can't show snackbar", new Object[0]);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        int[] iArr = failure;
        if (iArr == null) {
            return;
        }
        pey o = vng.o(findViewById);
        p s = o != null ? eja1.s(o) : null;
        Snackbar snackbar2 = new Snackbar(findViewById.getContext(), new rh2(5, iArr, activity), s, null);
        snackbar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        if (s != null && (fseVar = s.b) != null) {
            kotlinx.coroutines.a.n(fseVar).w(new quq0(22, snackbar2));
        }
        PopupWindow popupWindow = new PopupWindow(snackbar2, -1, -2);
        if (findViewById.getWindowToken() == null) {
            return;
        }
        try {
            popupWindow.showAtLocation(findViewById, 0, iArr[0], iArr[1]);
            snackbar = Snackbar.snackbarOnDisplay;
            if (snackbar != null) {
                snackbar.setVisibility(4);
            }
            Snackbar.snackbarOnDisplay = snackbar2;
            snackbar2.show(n0t0Var, k0t0Var2, new Snackbar$Companion$show$3(0, popupWindow, PopupWindow.class, "dismiss", "dismiss()V", 0));
            i5z0.a.a("XXX: SNACKBAR WITH CONTENT '" + n0t0Var.a + "' IS SHOWN FOR '" + k0t0Var2.a + "'", new Object[0]);
        } catch (Throwable th2) {
            x4c.g("couldn't open snackbar", th2, null, null, 12);
        }
    }
}
