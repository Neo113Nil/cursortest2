package com.ybsdk.di.modules;

import android.view.ContextThemeWrapper;
import com.ybsdk.screens.divbottomsheet.DivBottomSheetView;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.fhk;
import defpackage.lhk;
import defpackage.sls;

/* loaded from: classes3.dex */
public final class c implements sls {
    public final /* synthetic */ ContextThemeWrapper a;
    public final /* synthetic */ lhk b;
    public final /* synthetic */ DeeplinkAction.ProTopupMethodsBottomSheet c;
    public final /* synthetic */ BottomSheetDialogView w;

    public c(ContextThemeWrapper contextThemeWrapper, lhk lhkVar, DeeplinkAction.ProTopupMethodsBottomSheet proTopupMethodsBottomSheet, BottomSheetDialogView bottomSheetDialogView) {
        this.a = contextThemeWrapper;
        this.b = lhkVar;
        this.c = proTopupMethodsBottomSheet;
        this.w = bottomSheetDialogView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new DivBottomSheetView(this.a, this.b.a(new fhk(this.c.getMethods(), new DeeplinkModule$provideProTopupMethodsBottomSheetDelegate$1$1$1$1(0, this.w, BottomSheetDialogView.class, "dismiss", "dismiss()V", 0))));
    }
}
