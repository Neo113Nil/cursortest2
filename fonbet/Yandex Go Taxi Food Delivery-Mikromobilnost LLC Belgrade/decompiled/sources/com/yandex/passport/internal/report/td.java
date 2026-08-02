package com.yandex.passport.internal.report;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.g8e;
import defpackage.tls;
import kotlin.Result;

/* loaded from: classes15.dex */
public final class td implements pd {
    public final tls a;
    public final String b;
    public final String c;

    public td(tls tlsVar, Object obj) {
        this.a = tlsVar;
        this.b = TarifficatorScenarioActivity.RESULT_KEY;
        Throwable a = Result.a(obj);
        this.c = a == null ? (String) tlsVar.invoke(obj) : g8e.s(a, new StringBuilder("error:"));
    }

    @Override // com.yandex.passport.internal.report.pd
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getName() {
        return this.b;
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getValue() {
        return this.c;
    }

    public /* synthetic */ td(Object obj) {
        this(new com.yandex.passport.internal.core.announcing.f(4), obj);
    }
}
