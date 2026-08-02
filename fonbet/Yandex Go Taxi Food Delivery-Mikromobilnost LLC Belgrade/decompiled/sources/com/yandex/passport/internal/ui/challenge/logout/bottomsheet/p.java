package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity = (LogoutBottomSheetComposeActivity) obj;
                logoutBottomSheetComposeActivity.setResult(4);
                logoutBottomSheetComposeActivity.finish();
                return zy11Var;
            case 1:
                ((sls) obj).invoke();
                return zy11Var;
            case 2:
                i0 i0Var = (i0) obj;
                com.yandex.passport.internal.core.accounts.d dVar = i0Var.b;
                com.yandex.passport.internal.flags.j jVar = i0Var.c;
                com.yandex.passport.internal.core.accounts.t tVar = i0Var.d;
                com.yandex.passport.internal.ui.challenge.logout.v vVar = i0Var.e;
                return new d0(dVar, jVar, tVar, vVar.a, vVar.d, i0Var.f);
            default:
                ((tls) obj).invoke(LogoutBottomsheetWish.CANCEL);
                return zy11Var;
        }
    }
}
