package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.api.PassportAutoLoginMode;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.l1;
import com.yandex.passport.internal.report.t1;
import com.yandex.passport.internal.report.u1;
import defpackage.g73;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.hrv;
import defpackage.irv;
import defpackage.tcc;
import defpackage.w511;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class j extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public j(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.l.getValue(aVar, com.yandex.passport.internal.features.a.J[8])).booleanValue();
    }

    public final void j(PassportAutoLoginMode passportAutoLoginMode, Long l) {
        f(l1.w, new com.yandex.passport.internal.report.c(passportAutoLoginMode), new jd(String.valueOf(l), 3));
    }

    public final void k(List list, boolean z, AutoLoginReporter$Companion$AutoLoginPriorityType autoLoginReporter$Companion$AutoLoginPriorityType, boolean z2) {
        Map i;
        t1 t1Var = t1.w;
        g73 O0 = kotlin.collections.a.O0(list);
        int d = gw00.d(tcc.n(O0, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = O0.iterator();
        while (true) {
            irv irvVar = (irv) it;
            if (!irvVar.c.hasNext()) {
                b(t1Var, kotlin.collections.b.i(new Pair("candidate", linkedHashMap), new Pair("candidates_count", Integer.valueOf(list.size())), new Pair("master_accounts_enabled", Boolean.valueOf(z)), new Pair("autologin_priority_type", autoLoginReporter$Companion$AutoLoginPriorityType.name().toLowerCase(Locale.ROOT)), new Pair("is_filtered_by_phone_number", Boolean.valueOf(z2))));
                return;
            }
            hrv hrvVar = (hrv) irvVar.next();
            com.yandex.passport.internal.autologin.c cVar = (com.yandex.passport.internal.autologin.c) hrvVar.b;
            int i2 = hrvVar.a + 1;
            if (cVar instanceof com.yandex.passport.internal.autologin.a) {
                i = g8e.z("type_candidate", "Account");
            } else {
                if (!(cVar instanceof com.yandex.passport.internal.autologin.b)) {
                    w511.b();
                    return;
                }
                i = kotlin.collections.b.i(new Pair("type_candidate", "MasterMember"), new Pair("master_uid", String.valueOf(((com.yandex.passport.internal.autologin.b) cVar).c().c().getValue())));
            }
            Pair pair = new Pair(String.valueOf(cVar.b().getValue()), kotlin.collections.b.n(i, gw00.e(new Pair("sorting_number", String.valueOf(i2)))));
            linkedHashMap.put(pair.c(), pair.f());
        }
    }

    public final void l(PassportAutoLoginMode passportAutoLoginMode) {
        f(u1.w, new com.yandex.passport.internal.report.c(passportAutoLoginMode));
    }
}
