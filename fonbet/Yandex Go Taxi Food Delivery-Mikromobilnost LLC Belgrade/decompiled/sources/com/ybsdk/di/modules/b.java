package com.ybsdk.di.modules;

import android.view.ContextThemeWrapper;
import com.ybsdk.screens.divbottomsheet.DivBottomSheetView;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.ehk;
import defpackage.lhk;
import defpackage.sls;

/* loaded from: classes3.dex */
public final class b implements sls {
    public final /* synthetic */ ContextThemeWrapper a;
    public final /* synthetic */ lhk b;
    public final /* synthetic */ DeeplinkAction.BottomSheet c;
    public final /* synthetic */ BottomSheetDialogView w;

    public b(ContextThemeWrapper contextThemeWrapper, lhk lhkVar, DeeplinkAction.BottomSheet bottomSheet, BottomSheetDialogView bottomSheetDialogView) {
        this.a = contextThemeWrapper;
        this.b = lhkVar;
        this.c = bottomSheet;
        this.w = bottomSheetDialogView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        DeeplinkAction.BottomSheet bottomSheet = this.c;
        return new DivBottomSheetView(this.a, this.b.a(new ehk(bottomSheet.getTarget(), bottomSheet.getAgreementId(), new DeeplinkModule$provideBottomSheetViewDelegate$1$1$1$1(0, this.w, BottomSheetDialogView.class, "dismiss", "dismiss()V", 0), bottomSheet.getAdditionalData(), bottomSheet.getSkeletonId())));
    }
}
