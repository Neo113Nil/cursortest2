package com.yandex.go.settings.email;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xrn;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.settings.email.EmailPresenter$refreshEmailIfNeed$1", f = "EmailPresenter.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class EmailPresenter$refreshEmailIfNeed$1 extends SuspendLambda implements wls {
    final /* synthetic */ Runnable $onComplete;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailPresenter$refreshEmailIfNeed$1(a aVar, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$onComplete = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EmailPresenter$refreshEmailIfNeed$1(this.this$0, this.$onComplete, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EmailPresenter$refreshEmailIfNeed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            if (aVar.B) {
                aVar.B = false;
                ((xrn) aVar.Dg()).setProgressing(true);
                c cVar = this.this$0.y;
                this.label = 1;
                cVar.a.d();
                if (cVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.$onComplete.run();
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((xrn) this.this$0.Dg()).setProgressing(false);
        this.$onComplete.run();
        return zy11.a;
    }
}
