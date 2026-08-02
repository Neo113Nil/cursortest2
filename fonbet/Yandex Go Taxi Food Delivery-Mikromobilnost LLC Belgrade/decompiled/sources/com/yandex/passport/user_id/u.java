package com.yandex.passport.user_id;

import androidx.core.app.d1;
import com.yandex.passport.api.impl.UserIdProperties;
import defpackage.hs31;
import defpackage.sbx;
import defpackage.tje;
import defpackage.yr31;
import io.appmetrica.analytics.IReporterYandex;

/* loaded from: classes2.dex */
public final class u implements hs31 {
    public final IReporterYandex a;
    public final com.yandex.passport.internal.methods.requester.e b;
    public final UserIdProperties c;

    public u(IReporterYandex iReporterYandex, com.yandex.passport.internal.methods.requester.e eVar, UserIdProperties userIdProperties) {
        this.a = iReporterYandex;
        this.b = eVar;
        this.c = userIdProperties;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        return new w(new d1(new com.arkivanov.mvikotlin.main.store.a(), new com.yandex.passport.biometric.ui.verification.a(10, tje.a(sbx.d, new com.yandex.passport.user_id.ui.c(1))), new com.yandex.passport.internal.upgrader.h(this.a), this.b, this.c));
    }
}
