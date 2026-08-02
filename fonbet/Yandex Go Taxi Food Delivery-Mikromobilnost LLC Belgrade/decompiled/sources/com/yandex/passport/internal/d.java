package com.yandex.passport.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.adjust.sdk.AdjustConfig;
import com.yandex.passport.internal.report.kd;
import com.yandex.passport.internal.ui.challenge.changecurrent.c0;
import com.yandex.passport.internal.ui.util.ForegroundDetector;
import defpackage.mse;
import defpackage.sls;
import defpackage.tse;

/* loaded from: classes8.dex */
public final /* synthetic */ class d implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        tse scope_delegate$lambda$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                byte[] bArr = com.yandex.passport.internal.entities.o.c;
                Context context = ((e) obj).a;
                com.yandex.passport.internal.entities.o r = com.yandex.passport.internal.util.p.r(context.getPackageManager(), context.getPackageName());
                return r.c() ? AdjustConfig.ENVIRONMENT_PRODUCTION : r.b() ? "development" : "unknown";
            case 1:
                Object systemService = ((com.yandex.passport.internal.common.f) obj).a.getSystemService("phone");
                if (systemService instanceof TelephonyManager) {
                    return (TelephonyManager) systemService;
                }
                return null;
            case 2:
                return ((com.yandex.passport.internal.config.a) obj).a.getSharedPreferences("passport_sso_pref", 0);
            case 3:
                return ((com.yandex.passport.internal.config.j) obj).a.getSharedPreferences("ebs_config_pref", 0);
            case 4:
                return ((com.yandex.passport.internal.config.q) obj).a.getSharedPreferences("white_list_pref", 0);
            case 5:
                return ((com.yandex.passport.internal.core.accounts.z) obj).c.b(false);
            case 6:
                com.yandex.passport.internal.methods.requester.f fVar = (com.yandex.passport.internal.methods.requester.f) obj;
                Context context2 = fVar.a;
                com.yandex.passport.internal.methods.requester.a aVar = new com.yandex.passport.internal.methods.requester.a(context2, new com.yandex.passport.biometric.ui.verification.a(new kd(context2, fVar.c)));
                aVar.b();
                return aVar;
            case 7:
                return (String) ((com.yandex.passport.internal.report.g) obj).a.c.getValue();
            case 8:
                c0 c0Var = (c0) obj;
                return new com.yandex.passport.internal.ui.challenge.changecurrent.u(c0Var.a, c0Var.b, c0Var.c);
            default:
                scope_delegate$lambda$0 = ForegroundDetector.scope_delegate$lambda$0((mse) obj);
                return scope_delegate$lambda$0;
        }
    }
}
