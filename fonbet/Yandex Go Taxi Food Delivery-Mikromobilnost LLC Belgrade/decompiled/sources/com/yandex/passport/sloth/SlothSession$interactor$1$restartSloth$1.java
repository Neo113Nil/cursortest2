package com.yandex.passport.sloth;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.SlothSession$interactor$1$restartSloth$1", f = "SlothSession.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothSession$interactor$1$restartSloth$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothSession$interactor$1$restartSloth$1(c1 c1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SlothSession$interactor$1$restartSloth$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlothSession$interactor$1$restartSloth$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c1 c1Var = this.this$0;
            com.yandex.passport.sloth.url.c cVar = c1Var.y;
            com.yandex.passport.sloth.data.c0 variant = c1Var.a.getVariant();
            this.label = 1;
            if (cVar.o(variant, this) == coroutineSingletons) {
                return coroutineSingletons;
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
