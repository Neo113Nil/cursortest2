package com.yandex.passport.internal.ui.bouncer.chooser;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.bouncer.chooser.BouncerMasterChooserStoreFactory$ExecutorImpl", f = "BouncerMasterChooserStoreFactory.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "onAccountPhoneNumber")
/* loaded from: classes2.dex */
final class BouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.k(null, this);
    }
}
