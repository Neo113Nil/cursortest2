package com.yandex.passport.sloth.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.ui.SlothUiController$switchButton$1$3", f = "SlothUiController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothUiController$switchButton$1$3 extends SuspendLambda implements tls {
    final /* synthetic */ r0 $mode;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothUiController$switchButton$1$3(r0 r0Var, Continuation continuation) {
        super(1, continuation);
        this.$mode = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SlothUiController$switchButton$1$3(this.$mode, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        SlothUiController$switchButton$1$3 slothUiController$switchButton$1$3 = (SlothUiController$switchButton$1$3) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        slothUiController$switchButton$1$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((p0) this.$mode).a.invoke();
        return zy11.a;
    }
}
