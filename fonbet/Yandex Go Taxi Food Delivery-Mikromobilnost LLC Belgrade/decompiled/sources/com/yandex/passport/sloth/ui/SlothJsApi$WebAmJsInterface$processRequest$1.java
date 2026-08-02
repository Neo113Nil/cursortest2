package com.yandex.passport.sloth.ui;

import com.yandex.passport.sloth.ui.SlothJsApi;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.sloth.ui.SlothJsApi$WebAmJsInterface", f = "SlothJsApi.kt", l = {54}, m = "processRequest")
/* loaded from: classes2.dex */
public final class SlothJsApi$WebAmJsInterface$processRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SlothJsApi.WebAmJsInterface this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothJsApi$WebAmJsInterface$processRequest$1(SlothJsApi.WebAmJsInterface webAmJsInterface, Continuation continuation) {
        super(continuation);
        this.this$0 = webAmJsInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object processRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processRequest = this.this$0.processRequest(null, this);
        return processRequest;
    }
}
