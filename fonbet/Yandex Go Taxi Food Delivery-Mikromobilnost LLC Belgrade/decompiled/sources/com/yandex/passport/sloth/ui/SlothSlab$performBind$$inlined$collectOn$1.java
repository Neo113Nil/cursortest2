package com.yandex.passport.sloth.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.ui.SlothSlab$performBind$$inlined$collectOn$1", f = "SlothSlab.kt", l = {122}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SlothSlab$performBind$$inlined$collectOn$1 extends SuspendLambda implements wls {
    final /* synthetic */ b1 $interactor$inlined;
    final /* synthetic */ tpr $this_collectOn;
    int label;
    final /* synthetic */ d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothSlab$performBind$$inlined$collectOn$1(tpr tprVar, Continuation continuation, d0 d0Var, b1 b1Var) {
        super(2, continuation);
        this.$this_collectOn = tprVar;
        this.this$0 = d0Var;
        this.$interactor$inlined = b1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SlothSlab$performBind$$inlined$collectOn$1(this.$this_collectOn, continuation, this.this$0, this.$interactor$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlothSlab$performBind$$inlined$collectOn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectOn;
            com.yandex.passport.internal.ui.sloth.menu.b bVar = new com.yandex.passport.internal.ui.sloth.menu.b(2, this.this$0, this.$interactor$inlined);
            this.label = 1;
            if (tprVar.collect(bVar, this) == coroutineSingletons) {
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
