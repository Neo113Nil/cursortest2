package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothViewModel", f = "WebCardSlothViewModel.kt", l = {HProv.PP_HASHOID, 102}, m = "getSlothParams")
/* loaded from: classes2.dex */
final class WebCardSlothViewModel$getSlothParams$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCardSlothViewModel$getSlothParams$1(d1 d1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = d1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d1.W(this.this$0, this);
    }
}
