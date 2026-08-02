package com.google.android.material.internal;

import android.graphics.Rect;
import android.view.View;
import defpackage.bx60;
import defpackage.k751;
import defpackage.n751;
import defpackage.u1w;

/* loaded from: classes11.dex */
public final class c implements bx60 {
    public final /* synthetic */ ScrimInsetsFrameLayout a;

    public c(ScrimInsetsFrameLayout scrimInsetsFrameLayout) {
        this.a = scrimInsetsFrameLayout;
    }

    @Override // defpackage.bx60
    public final n751 onApplyWindowInsets(View view, n751 n751Var) {
        ScrimInsetsFrameLayout scrimInsetsFrameLayout = this.a;
        if (scrimInsetsFrameLayout.insets == null) {
            scrimInsetsFrameLayout.insets = new Rect();
        }
        Rect rect = scrimInsetsFrameLayout.insets;
        int b = n751Var.b();
        k751 k751Var = n751Var.a;
        rect.set(b, n751Var.d(), n751Var.c(), n751Var.a());
        scrimInsetsFrameLayout.onInsetsChanged(n751Var);
        scrimInsetsFrameLayout.setWillNotDraw(k751Var.l().equals(u1w.e) || scrimInsetsFrameLayout.insetForeground == null);
        scrimInsetsFrameLayout.postInvalidateOnAnimation();
        return k751Var.c();
    }
}
