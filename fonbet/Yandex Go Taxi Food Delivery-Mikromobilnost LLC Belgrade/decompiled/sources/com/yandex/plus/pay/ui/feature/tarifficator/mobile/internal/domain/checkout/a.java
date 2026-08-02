package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.ui.yb.api.PlusPayYbCardScenario;
import defpackage.bhd0;
import defpackage.chd0;
import defpackage.dhd0;
import defpackage.ehd0;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.w511;
import java.util.Locale;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class a {
    public final com.yandex.plus.pay.ui.yb.web.api.a a;
    public final pgz b;

    public a(com.yandex.plus.pay.ui.yb.web.api.a aVar, pgz pgzVar) {
        this.a = aVar;
        this.b = pgzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        YbCardInteractorImpl$prepareYbCardForPayment$1 ybCardInteractorImpl$prepareYbCardForPayment$1;
        int i;
        PlusPayYbCardScenario plusPayYbCardScenario;
        Object a;
        ehd0 ehd0Var;
        if (continuationImpl instanceof YbCardInteractorImpl$prepareYbCardForPayment$1) {
            ybCardInteractorImpl$prepareYbCardForPayment$1 = (YbCardInteractorImpl$prepareYbCardForPayment$1) continuationImpl;
            int i2 = ybCardInteractorImpl$prepareYbCardForPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybCardInteractorImpl$prepareYbCardForPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybCardInteractorImpl$prepareYbCardForPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybCardInteractorImpl$prepareYbCardForPayment$1.label;
                if (i != 0) {
                    b.b(obj);
                    plusPayYbCardScenario = str == null ? PlusPayYbCardScenario.OPENING : PlusPayYbCardScenario.TOPUP;
                    ybCardInteractorImpl$prepareYbCardForPayment$1.L$0 = str;
                    ybCardInteractorImpl$prepareYbCardForPayment$1.L$1 = plusPayYbCardScenario;
                    ybCardInteractorImpl$prepareYbCardForPayment$1.label = 1;
                    a = this.a.a(plusPayYbCardScenario, ybCardInteractorImpl$prepareYbCardForPayment$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PlusPayYbCardScenario plusPayYbCardScenario2 = (PlusPayYbCardScenario) ybCardInteractorImpl$prepareYbCardForPayment$1.L$1;
                    String str2 = (String) ybCardInteractorImpl$prepareYbCardForPayment$1.L$0;
                    b.b(obj);
                    plusPayYbCardScenario = plusPayYbCardScenario2;
                    str = str2;
                    a = obj;
                }
                ehd0Var = (ehd0) a;
                if (!(ehd0Var instanceof dhd0)) {
                    String str3 = ((dhd0) ehd0Var).a;
                    return str3 == null ? str : str3;
                }
                boolean z = ehd0Var instanceof chd0;
                pgz pgzVar = this.b;
                if (z) {
                    LogPriority logPriority = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "YbCardInteractorImpl", "Filed in " + plusPayYbCardScenario.name().toLowerCase(Locale.ROOT) + Extension.COLON_SPACE + ((chd0) ehd0Var).a);
                        return null;
                    }
                } else {
                    if (!(ehd0Var instanceof bhd0)) {
                        w511.b();
                        return null;
                    }
                    LogPriority logPriority2 = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority2)) {
                        pgzVar.a(logPriority2, "YbCardInteractorImpl", "Cancelled in " + plusPayYbCardScenario.name().toLowerCase(Locale.ROOT) + " by user");
                    }
                }
                return null;
            }
        }
        ybCardInteractorImpl$prepareYbCardForPayment$1 = new YbCardInteractorImpl$prepareYbCardForPayment$1(this, continuationImpl);
        Object obj2 = ybCardInteractorImpl$prepareYbCardForPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybCardInteractorImpl$prepareYbCardForPayment$1.label;
        if (i != 0) {
        }
        ehd0Var = (ehd0) a;
        if (!(ehd0Var instanceof dhd0)) {
        }
    }
}
