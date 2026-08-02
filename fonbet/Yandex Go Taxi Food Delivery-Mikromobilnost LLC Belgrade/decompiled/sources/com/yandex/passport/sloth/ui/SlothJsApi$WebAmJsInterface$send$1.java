package com.yandex.passport.sloth.ui;

import com.yandex.passport.sloth.ui.SlothJsApi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.ui.SlothJsApi$WebAmJsInterface$send$1", f = "SlothJsApi.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SlothJsApi$WebAmJsInterface$send$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $json;
    Object L$0;
    int label;
    final /* synthetic */ SlothJsApi.WebAmJsInterface this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothJsApi$WebAmJsInterface$send$1(SlothJsApi.WebAmJsInterface webAmJsInterface, String str, Continuation continuation) {
        super(2, continuation);
        this.$json = str;
        this.this$0 = webAmJsInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SlothJsApi$WebAmJsInterface$send$1(this.this$0, this.$json, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlothJsApi$WebAmJsInterface$send$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object processRequest;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$json;
            if (str != null) {
                SlothJsApi.WebAmJsInterface webAmJsInterface = this.this$0;
                this.L$0 = str;
                this.label = 1;
                processRequest = webAmJsInterface.processRequest(str, this);
                if (processRequest == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
