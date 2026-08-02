package com.yandex.passport.internal.ui.sloth.menu;

import com.yandex.passport.internal.report.reporters.i1;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$2", f = "UserMenuActivity.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$2 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectOn;
    final /* synthetic */ i1 $webAmReporter$inlined;
    int label;
    final /* synthetic */ UserMenuActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$2(tpr tprVar, Continuation continuation, UserMenuActivity userMenuActivity, i1 i1Var) {
        super(2, continuation);
        this.$this_collectOn = tprVar;
        this.this$0 = userMenuActivity;
        this.$webAmReporter$inlined = i1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$2(this.$this_collectOn, continuation, this.this$0, this.$webAmReporter$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectOn;
            b bVar = new b(0, this.this$0, this.$webAmReporter$inlined);
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
