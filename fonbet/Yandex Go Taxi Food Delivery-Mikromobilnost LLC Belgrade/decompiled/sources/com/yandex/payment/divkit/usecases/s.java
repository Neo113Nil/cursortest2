package com.yandex.payment.divkit.usecases;

import com.yandex.payment.sdk.core.data.PaymentSettings;
import defpackage.jse;
import defpackage.mdh;
import defpackage.rwo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s {
    public final m a;
    public final rwo b;
    public final jse c;
    public final tls d;

    public s(m mVar, rwo rwoVar) {
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        PlusCardTopUpSyncingUseCaseImpl$1 plusCardTopUpSyncingUseCaseImpl$1 = new PlusCardTopUpSyncingUseCaseImpl$1(1, null);
        this.a = mVar;
        this.b = rwoVar;
        this.c = mdhVar;
        this.d = plusCardTopUpSyncingUseCaseImpl$1;
    }

    public final Object a(PaymentSettings paymentSettings, Continuation continuation) {
        return tje.k0(this.c, new PlusCardTopUpSyncingUseCaseImpl$start$2(this, paymentSettings, null), continuation);
    }
}
