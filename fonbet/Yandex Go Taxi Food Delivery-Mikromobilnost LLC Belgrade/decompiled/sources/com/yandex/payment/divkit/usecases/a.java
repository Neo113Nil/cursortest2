package com.yandex.payment.divkit.usecases;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.jse;
import defpackage.kq4;
import defpackage.mdh;
import defpackage.rwo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final m a;
    public final rwo b;
    public final jse c;

    public a(m mVar, rwo rwoVar) {
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        this.a = mVar;
        this.b = rwoVar;
        this.c = mdhVar;
    }

    public final Object a(kq4 kq4Var, kq4 kq4Var2, PaymentMethod paymentMethod, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        return tje.k0(this.c, new CheckTopUpUseCase$invoke$2(paymentMethod, kq4Var, z, this, z2, kq4Var2, null), continuationImpl);
    }
}
