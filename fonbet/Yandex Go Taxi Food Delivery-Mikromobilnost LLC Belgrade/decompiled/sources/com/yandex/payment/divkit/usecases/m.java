package com.yandex.payment.divkit.usecases;

import defpackage.jse;
import defpackage.kq4;
import defpackage.rwo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class m {
    public final rwo a;
    public final jse b;

    public m(rwo rwoVar) {
        sjh sjhVar = uyj.a;
        this.a = rwoVar;
        this.b = sjhVar;
    }

    public final Object a(kq4 kq4Var, kq4 kq4Var2, ContinuationImpl continuationImpl) {
        return tje.k0(this.b, new GetTopUpSumUseCase$invoke$2(kq4Var, kq4Var2, this, null), continuationImpl);
    }
}
