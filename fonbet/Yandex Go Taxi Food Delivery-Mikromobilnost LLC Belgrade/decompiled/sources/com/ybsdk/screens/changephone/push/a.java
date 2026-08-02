package com.ybsdk.screens.changephone.push;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.pinstorage.internal.data.c;
import defpackage.de9;
import defpackage.jl40;
import defpackage.nbp0;
import defpackage.rt1;
import defpackage.tje;
import defpackage.w511;
import defpackage.xvf0;
import defpackage.yvf0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Result;

/* loaded from: classes11.dex */
public final class a {
    public final yvf0 a;
    public final AppAnalyticsReporter b;
    public final nbp0 c;

    public a(xvf0 xvf0Var, AppAnalyticsReporter appAnalyticsReporter, nbp0 nbp0Var) {
        this.a = xvf0Var;
        this.b = appAnalyticsReporter;
        this.c = nbp0Var;
    }

    public final boolean a(String str, String str2) {
        Object failure;
        if (jl40.l(str, "CHANGE_PHONE")) {
            ChangePhoneApplicationSilentPushParser$Companion$Statuses[] values = ChangePhoneApplicationSilentPushParser$Companion$Statuses.values();
            ArrayList arrayList = new ArrayList(values.length);
            for (ChangePhoneApplicationSilentPushParser$Companion$Statuses changePhoneApplicationSilentPushParser$Companion$Statuses : values) {
                arrayList.add(changePhoneApplicationSilentPushParser$Companion$Statuses.name());
            }
            if (kotlin.collections.a.G(arrayList, str2)) {
                if (str2 != null) {
                    AppAnalyticsReporter appAnalyticsReporter = this.b;
                    appAnalyticsReporter.n.a.a("change_phone.push_message.receive", null);
                    ChangePhoneApplicationSilentPushParser$Companion$Statuses.Companion.getClass();
                    try {
                        failure = ChangePhoneApplicationSilentPushParser$Companion$Statuses.valueOf(str2);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    ChangePhoneApplicationSilentPushParser$Companion$Statuses changePhoneApplicationSilentPushParser$Companion$Statuses2 = (ChangePhoneApplicationSilentPushParser$Companion$Statuses) failure;
                    int i = changePhoneApplicationSilentPushParser$Companion$Statuses2 == null ? -1 : de9.a[changePhoneApplicationSilentPushParser$Companion$Statuses2.ordinal()];
                    if (i != -1) {
                        if (i == 1) {
                            yvf0 yvf0Var = this.a;
                            ((c) yvf0Var.get()).E(false);
                            rt1 rt1Var = appAnalyticsReporter.n;
                            boolean h = ((c) yvf0Var.get()).h();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                            linkedHashMap.put("ask_pin", Boolean.valueOf(h));
                            rt1Var.a.a("change_phone.push_message.result", linkedHashMap);
                        } else {
                            if (i != 2) {
                                w511.b();
                                return false;
                            }
                            tje.N(this.c.a, null, null, new ChangePhoneApplicationSilentPushParser$removePin$1(this, null), 3);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
