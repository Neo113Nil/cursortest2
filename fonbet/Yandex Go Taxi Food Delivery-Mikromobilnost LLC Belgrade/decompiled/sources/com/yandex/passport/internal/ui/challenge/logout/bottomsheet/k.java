package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.b9a1;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.fid;
import defpackage.pfy;
import defpackage.tfx;
import defpackage.tls;
import defpackage.vuz;
import defpackage.wls;
import defpackage.zy11;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class k implements wls {
    public final /* synthetic */ LogoutBottomSheetActivity a;
    public final /* synthetic */ v0 b;

    public k(LogoutBottomSheetActivity logoutBottomSheetActivity, v0 v0Var) {
        this.a = logoutBottomSheetActivity;
        this.b = v0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        o0 logoutBottomSheetParameters;
        x0 viewModel;
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        v0 v0Var = this.b;
        LogoutBottomSheetActivity logoutBottomSheetActivity = this.a;
        logoutBottomSheetParameters = logoutBottomSheetActivity.toLogoutBottomSheetParameters(v0Var);
        viewModel = logoutBottomSheetActivity.getViewModel();
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(-1023296865);
        boolean e = btsVar2.e(viewModel);
        Object Q = btsVar2.Q();
        if (e || Q == did.a) {
            Q = new LogoutBottomSheetActivity$showButtons$1$1$1(1, viewModel, x0.class, "wish", "wish(Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/LogoutBottomsheetWish;)V", 0);
            btsVar2.o0(Q);
        }
        btsVar2.t(false);
        com.yandex.passport.internal.report.reporters.f0 logoutReporter = logoutBottomSheetActivity.getLogoutReporter();
        WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
        c1.a(logoutBottomSheetParameters, logoutReporter, (tls) ((tfx) Q), b9a1.e(c530.a, new pfy(vuz.o(btsVar2).e, 32)), btsVar2, 0);
        return zy11.a;
    }
}
