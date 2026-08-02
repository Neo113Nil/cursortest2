package com.yandex.plus.pay.internal.di;

import com.yandex.plus.core.config.Environment;
import defpackage.jcd0;
import defpackage.kcd0;
import defpackage.nfh;
import defpackage.sls;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PlusPaySdkComponentImpl$getInternalDependencies$6 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        jcd0 jcd0Var = (jcd0) this.receiver;
        Environment environment = jcd0Var.c;
        int i = kcd0.a[jcd0Var.d.ordinal()];
        if (i == 1 || i == 2) {
            return new nfh("checkout-bdui.plus.yandex.net", "checkout-bdui.plus.tst.yandex.net", environment);
        }
        w511.b();
        return null;
    }
}
