package com.ybsdk.feature.savings.internal.helpers;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.data.b;
import com.ybsdk.feature.savings.internal.interactors.d;
import defpackage.bgc;
import defpackage.dzh0;
import defpackage.ffx;
import defpackage.fzv;
import defpackage.g5;
import defpackage.lz40;
import defpackage.nbp0;
import defpackage.rx3;
import defpackage.t7l0;
import defpackage.tje;
import defpackage.tls;
import defpackage.unr0;
import defpackage.vqy;
import defpackage.vxd;
import defpackage.vxj0;
import defpackage.w2m0;
import defpackage.wls;
import defpackage.zdk0;
import defpackage.zo1;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes3.dex */
public final class a implements w2m0 {
    public final nbp0 a;
    public final b b;
    public final d c;
    public final g5 d;
    public final AppAnalyticsReporter e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final ConcurrentHashMap j = new ConcurrentHashMap();

    public a(nbp0 nbp0Var, b bVar, d dVar, g5 g5Var, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = nbp0Var;
        this.b = bVar;
        this.c = dVar;
        this.d = g5Var;
        this.e = appAnalyticsReporter;
    }

    public static lz40 f(String str, Map map) {
        Object obj = map.get(str);
        if (obj == null) {
            obj = ffx.c(1, 0, BufferOverflow.DROP_OLDEST, 2);
            map.put(str, obj);
        }
        return (lz40) obj;
    }

    public static void g(a aVar, lz40 lz40Var, tls tlsVar, wls wlsVar, tls tlsVar2) {
        tje.N(aVar.a.b, null, null, new SavingsAccountActionsHelperImpl$updateSettings$2(lz40Var, wlsVar, tlsVar, aVar, new bgc(12), tlsVar2, null), 3);
    }

    public final void a(String str, String str2, MoneyEntity moneyEntity, Date date) {
        g(this, f(str, this.g), new SavingsAccountActionsHelperImpl$changeGoal$1(moneyEntity, date, this, str, str2, null), new t7l0(11, date, moneyEntity), new vqy(str, moneyEntity, date, this, 28));
    }

    public final void b(String str, String str2, boolean z) {
        MoneyEntity moneyEntity = this.c.b;
        if (moneyEntity != null && moneyEntity.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            this.d.c(unr0.h(Text.Companion, dzh0.ybsdk_savings_lock_money_snackbar_not_enough_doe_title), new Text.Resource(dzh0.ybsdk_savings_lock_money_snackbar_not_enough_doe_subtitle));
        } else {
            lz40 f = f(str, this.f);
            SavingsAccountActionsHelperImpl$changeLock$1 savingsAccountActionsHelperImpl$changeLock$1 = new SavingsAccountActionsHelperImpl$changeLock$1(this, str, str2, z, null);
            vxd vxdVar = new vxd(z, 6);
            rx3 rx3Var = new rx3(str, z, this, 11);
            tje.N(this.a.b, null, null, new SavingsAccountActionsHelperImpl$updateSettings$2(f, vxdVar, savingsAccountActionsHelperImpl$changeLock$1, this, new zo1(z, this, 15), rx3Var, null), 3);
        }
    }

    public final void c(String str, String str2, String str3) {
        g(this, f(str, this.i), new SavingsAccountActionsHelperImpl$changeName$1(this, str, str2, str3, null), new fzv(str3, 28), new vxj0(21, str, this));
    }

    public final void d(String str, String str2, String str3) {
        g(this, f(str, this.j), new SavingsAccountActionsHelperImpl$changeTheme$1(this, str, str2, str3, null), new fzv(str3, 29), new zdk0(12, str, str3, this));
    }

    public final void e(String str, String str2) {
        tje.N(this.a.b, null, null, new SavingsAccountActionsHelperImpl$close$1(f(str, this.h), this, str, str2, null), 3);
    }
}
