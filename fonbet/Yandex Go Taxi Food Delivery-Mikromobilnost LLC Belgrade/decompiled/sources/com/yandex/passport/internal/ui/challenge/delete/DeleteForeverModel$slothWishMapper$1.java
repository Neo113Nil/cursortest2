package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.challenge.delete.DeleteForeverModel", f = "DeleteForeverModel.kt", l = {71, 72, HProv.ALG_SID_GR3410_12_256, HProv.ALG_SID_GR3410_12_256}, m = "slothWishMapper")
/* loaded from: classes2.dex */
final class DeleteForeverModel$slothWishMapper$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteForeverModel$slothWishMapper$1(y0 y0Var, Continuation continuation) {
        super(continuation);
        this.this$0 = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j(null, this);
    }
}
