package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothViewModel", f = "WebCardSlothViewModel.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "processSelectedPicture-0E7RQCE")
/* loaded from: classes2.dex */
final class WebCardSlothViewModel$processSelectedPicture$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCardSlothViewModel$processSelectedPicture$1(d1 d1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = d1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object X = this.this$0.X(null, 0, this);
        return X == CoroutineSingletons.COROUTINE_SUSPENDED ? X : new Result(X);
    }
}
