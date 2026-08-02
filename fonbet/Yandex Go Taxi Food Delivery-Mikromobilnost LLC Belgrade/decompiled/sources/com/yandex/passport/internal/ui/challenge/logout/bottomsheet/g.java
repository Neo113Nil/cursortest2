package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogoutBottomSheetActivity b;
    public final /* synthetic */ v0 c;

    public /* synthetic */ g(LogoutBottomSheetActivity logoutBottomSheetActivity, v0 v0Var, int i) {
        this.a = i;
        this.b = logoutBottomSheetActivity;
        this.c = v0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 buildData$lambda$9;
        zy11 buildData$lambda$11;
        zy11 buildData$lambda$13;
        zy11 buildData$lambda$14;
        int i = this.a;
        v0 v0Var = this.c;
        LogoutBottomSheetActivity logoutBottomSheetActivity = this.b;
        switch (i) {
            case 0:
                buildData$lambda$9 = LogoutBottomSheetActivity.buildData$lambda$9(logoutBottomSheetActivity, v0Var);
                return buildData$lambda$9;
            case 1:
                buildData$lambda$11 = LogoutBottomSheetActivity.buildData$lambda$11(logoutBottomSheetActivity, v0Var);
                return buildData$lambda$11;
            case 2:
                buildData$lambda$13 = LogoutBottomSheetActivity.buildData$lambda$13(logoutBottomSheetActivity, v0Var);
                return buildData$lambda$13;
            default:
                buildData$lambda$14 = LogoutBottomSheetActivity.buildData$lambda$14(logoutBottomSheetActivity, v0Var);
                return buildData$lambda$14;
        }
    }
}
