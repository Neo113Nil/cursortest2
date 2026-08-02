package com.yandex.passport.internal.sloth;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.sloth.SlothWebParamsProviderImpl", f = "SlothWebParamsProviderImpl.kt", l = {23}, m = "getUuid-iY7QQdA")
/* loaded from: classes15.dex */
final class SlothWebParamsProviderImpl$getUuid$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothWebParamsProviderImpl$getUuid$1(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(this);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        String str = (String) b;
        if (str != null) {
            return new com.yandex.passport.common.value.b(str);
        }
        return null;
    }
}
