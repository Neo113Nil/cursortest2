package com.yandex.passport.internal.autologin.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.autologin.ui.KAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1", f = "KAutoLoginClientHelper.kt", l = {HProv.PP_PASSWD_TERM, HProv.PP_DELETE_SAVED_PASSWD}, m = "emit")
/* loaded from: classes15.dex */
public final class KAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KAutoLoginClientHelper$tryGetAccountFromCredentialManager$$inlined$collectOn$1$1$1(d dVar, Continuation continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
