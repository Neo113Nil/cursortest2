package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.challenge.delete.DeleteForeverViewModel$bind$$inlined$collectOn$1$1", f = "DeleteForeverViewModel.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "emit")
/* loaded from: classes2.dex */
public final class DeleteForeverViewModel$bind$$inlined$collectOn$1$1$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteForeverViewModel$bind$$inlined$collectOn$1$1$1(d1 d1Var, Continuation continuation) {
        super(continuation);
        this.this$0 = d1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
