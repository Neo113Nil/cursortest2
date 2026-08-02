package com.yandex.passport.internal.upgrader;

import com.yandex.passport.internal.methods.MethodRef;
import com.yandex.passport.internal.methods.service.PassportMethodBinderService;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class h {
    public final IReporterYandex a;

    public void a(MethodRef methodRef, Throwable th) {
        LinkedHashMap l = kotlin.collections.b.l(new Pair(PassportMethodBinderService.KEY_METHOD_NAME, methodRef.name()), new Pair(Constants.KEY_EXCEPTION, th.getMessage()));
        this.a.reportEvent(com.yandex.passport.internal.analytics.n.e.a, l);
    }
}
