package com.yandex.passport.internal.ui.router;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.bts;
import defpackage.fid;
import defpackage.oz40;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class p implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoginRouterActivity b;

    public /* synthetic */ p(LoginRouterActivity loginRouterActivity, int i) {
        this.a = i;
        this.b = loginRouterActivity;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LoginProperties loginProperties;
        oz40 oz40Var;
        LoginProperties loginProperties2;
        PassportProcessGlobalComponent passportProcessGlobalComponent;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        LoginRouterActivity loginRouterActivity = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                loginProperties = loginRouterActivity.loginProperties;
                com.yandex.passport.common.ui.progress.g a = com.yandex.passport.api.mapper.b.a((loginProperties != null ? loginProperties : null).getVisualProperties().getProgressProperties());
                oz40Var = loginRouterActivity.isShowProgressState;
                boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
                com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
                com.yandex.passport.internal.properties.u.c(a, booleanValue, fidVar, 0);
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                loginProperties2 = loginRouterActivity.loginProperties;
                if (loginProperties2 == null) {
                    loginProperties2 = null;
                }
                boolean c = com.yandex.passport.common.ui.compose.d.c(com.yandex.passport.internal.util.p.t(loginProperties2.getTheme()), fidVar2);
                passportProcessGlobalComponent = loginRouterActivity.component;
                com.yandex.passport.common.ui.compose.theme.e.a(c, (passportProcessGlobalComponent != null ? passportProcessGlobalComponent : null).getProperties().w, wwg.S(1901417063, true, new p(loginRouterActivity, i2), fidVar2), fidVar2, 384, 0);
                break;
        }
        return zy11Var;
    }
}
