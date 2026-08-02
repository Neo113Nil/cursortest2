package com.yandex.go.quark.dynamic;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.quark.dynamic.QuarkServiceImpl", f = "QuarkServiceImpl.kt", l = {160, HProv.PP_HANDLE_COUNT}, m = "configureQuarkAccount", v = 2)
/* loaded from: classes8.dex */
final class QuarkServiceImpl$configureQuarkAccount$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarkServiceImpl$configureQuarkAccount$1(h hVar, Continuation continuation) {
        super(continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.a(this.this$0, null, this);
    }
}
