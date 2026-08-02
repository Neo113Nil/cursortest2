package com.yandex.go.profile.domain.divkit.variables;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.profile.domain.divkit.variables.UltimaVariableHandler$init$$inlined$safeCollectIn$1$2", f = "UltimaVariableHandler.kt", l = {HProv.PP_SIGNATUREOID}, m = "emit", v = 2)
/* loaded from: classes8.dex */
public final class UltimaVariableHandler$init$$inlined$safeCollectIn$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UltimaVariableHandler$init$$inlined$safeCollectIn$1$2$1(i iVar, Continuation continuation) {
        super(continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
