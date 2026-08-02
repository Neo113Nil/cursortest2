package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity", f = "DeleteForeverActivity.kt", l = {HProv.PP_DELETE_KEYSET}, m = "transformResult")
/* loaded from: classes2.dex */
public final class DeleteForeverActivity$transformResult$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeleteForeverActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteForeverActivity$transformResult$1(DeleteForeverActivity deleteForeverActivity, Continuation continuation) {
        super(continuation);
        this.this$0 = deleteForeverActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.transformResult(false, (com.yandex.passport.internal.ui.challenge.k) null, (Continuation<? super com.yandex.passport.api.r0>) this);
    }
}
