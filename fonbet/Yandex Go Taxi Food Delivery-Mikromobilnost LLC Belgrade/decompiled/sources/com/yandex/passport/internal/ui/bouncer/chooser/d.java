package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.report.reporters.f0;
import com.yandex.passport.internal.report.reporters.g0;
import com.yandex.passport.internal.report.w7;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetComposeActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomsheetWish;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.o0;
import defpackage.sls;
import defpackage.tls;
import defpackage.w511;
import defpackage.yx40;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ d(com.yandex.passport.sloth.ui.error.d dVar, sls slsVar, tls tlsVar) {
        this.a = 3;
        this.c = dVar;
        this.w = slsVar;
        this.b = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                tls tlsVar = (tls) obj;
                List list = (List) obj3;
                yx40 yx40Var = (yx40) obj2;
                if (yx40Var.getIntValue() != -1) {
                    tlsVar.invoke(list.get(yx40Var.getIntValue()));
                }
                return zy11Var;
            case 1:
                LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity = (LogoutBottomSheetComposeActivity) obj3;
                PassportLogoutPropertiesImpl passportLogoutPropertiesImpl = (PassportLogoutPropertiesImpl) obj2;
                (((Boolean) ((com.yandex.passport.internal.ui.challenge.logout.bottomsheet.s) obj).getFlagRepository().b(com.yandex.passport.internal.flags.q.Y)).booleanValue() ? logoutBottomSheetComposeActivity.composeDeleteLauncher : logoutBottomSheetComposeActivity.deleteLauncher).a(new PassportDeleteAccountPropertiesImpl(passportLogoutPropertiesImpl.getUid(), passportLogoutPropertiesImpl.getProgressProperties(), passportLogoutPropertiesImpl.getTheme(), passportLogoutPropertiesImpl.getHeaders()));
                return zy11Var;
            case 2:
                ((tls) obj).invoke(LogoutBottomsheetWish.DELETE_ACCOUNT);
                Uid uid = ((o0) obj2).a;
                g0 g0Var = (g0) ((f0) obj3);
                g0Var.getClass();
                g0Var.f(w7.w, new yd(uid));
                return zy11Var;
            default:
                sls slsVar = (sls) obj2;
                tls tlsVar2 = (tls) obj;
                com.yandex.passport.sloth.ui.error.c cVar = ((com.yandex.passport.sloth.ui.error.d) obj3).d;
                if (cVar instanceof com.yandex.passport.sloth.ui.error.a) {
                    slsVar.invoke();
                    return zy11Var;
                }
                if (cVar instanceof com.yandex.passport.sloth.ui.error.b) {
                    tlsVar2.invoke(((com.yandex.passport.sloth.ui.error.b) cVar).a);
                    return zy11Var;
                }
                if (cVar == null) {
                    return zy11Var;
                }
                w511.b();
                return null;
        }
    }

    public /* synthetic */ d(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
