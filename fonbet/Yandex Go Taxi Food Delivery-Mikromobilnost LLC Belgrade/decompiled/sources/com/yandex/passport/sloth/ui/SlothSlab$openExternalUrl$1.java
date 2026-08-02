package com.yandex.passport.sloth.ui;

import defpackage.mvg;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.sloth.ui.SlothSlab", f = "SlothSlab.kt", l = {335}, m = "openExternalUrl-0E7RQCE")
/* loaded from: classes2.dex */
final class SlothSlab$openExternalUrl$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothSlab$openExternalUrl$1(d0 d0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Serializable q = this.this$0.q(null, null, this);
        return q == CoroutineSingletons.COROUTINE_SUSPENDED ? q : new Result(q);
    }
}
