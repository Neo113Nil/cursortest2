package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.ins0;
import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogoutBottomSheetActivity b;

    public /* synthetic */ f(LogoutBottomSheetActivity logoutBottomSheetActivity, int i) {
        this.a = i;
        this.b = logoutBottomSheetActivity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        com.yandex.passport.internal.ui.bouncer.roundabout.m ui_delegate$lambda$1;
        ins0 innerSlab_delegate$lambda$2;
        h bottomSheetCallback_delegate$lambda$3;
        zy11 buildData$lambda$15;
        int i = this.a;
        LogoutBottomSheetActivity logoutBottomSheetActivity = this.b;
        switch (i) {
            case 0:
                ui_delegate$lambda$1 = LogoutBottomSheetActivity.ui_delegate$lambda$1(logoutBottomSheetActivity);
                return ui_delegate$lambda$1;
            case 1:
                innerSlab_delegate$lambda$2 = LogoutBottomSheetActivity.innerSlab_delegate$lambda$2(logoutBottomSheetActivity);
                return innerSlab_delegate$lambda$2;
            case 2:
                bottomSheetCallback_delegate$lambda$3 = LogoutBottomSheetActivity.bottomSheetCallback_delegate$lambda$3(logoutBottomSheetActivity);
                return bottomSheetCallback_delegate$lambda$3;
            default:
                buildData$lambda$15 = LogoutBottomSheetActivity.buildData$lambda$15(logoutBottomSheetActivity);
                return buildData$lambda$15;
        }
    }
}
