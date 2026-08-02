package com.google.android.material.bottomsheet;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.bx60;
import defpackage.n751;

/* loaded from: classes11.dex */
public final class a implements bx60 {
    public final /* synthetic */ BottomSheetDialog a;

    public a(BottomSheetDialog bottomSheetDialog) {
        this.a = bottomSheetDialog;
    }

    @Override // defpackage.bx60
    public final n751 onApplyWindowInsets(View view, n751 n751Var) {
        d dVar;
        FrameLayout frameLayout;
        d dVar2;
        BottomSheetBehavior bottomSheetBehavior;
        d dVar3;
        BottomSheetBehavior bottomSheetBehavior2;
        d dVar4;
        BottomSheetDialog bottomSheetDialog = this.a;
        dVar = bottomSheetDialog.edgeToEdgeCallback;
        if (dVar != null) {
            bottomSheetBehavior2 = bottomSheetDialog.behavior;
            dVar4 = bottomSheetDialog.edgeToEdgeCallback;
            bottomSheetBehavior2.M(dVar4);
        }
        frameLayout = bottomSheetDialog.bottomSheet;
        bottomSheetDialog.edgeToEdgeCallback = new d(frameLayout, n751Var);
        dVar2 = bottomSheetDialog.edgeToEdgeCallback;
        dVar2.b(bottomSheetDialog.getWindow());
        bottomSheetBehavior = bottomSheetDialog.behavior;
        dVar3 = bottomSheetDialog.edgeToEdgeCallback;
        bottomSheetBehavior.v(dVar3);
        return n751Var;
    }
}
