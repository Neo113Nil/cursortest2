package com.yandex.passport.sloth.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.sloth.ui.SlothSlab", f = "SlothSlab.kt", l = {139}, m = "performBind")
/* loaded from: classes2.dex */
final class SlothSlab$performBind$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothSlab$performBind$1(d0 d0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m(null, this);
    }
}
