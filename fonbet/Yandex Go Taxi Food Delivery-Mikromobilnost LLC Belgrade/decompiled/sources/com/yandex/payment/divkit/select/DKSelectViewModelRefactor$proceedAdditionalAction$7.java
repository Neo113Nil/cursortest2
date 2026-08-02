package com.yandex.payment.divkit.select;

import defpackage.asw;
import defpackage.bqv;
import defpackage.ct20;
import defpackage.daj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yv90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModelRefactor$proceedAdditionalAction$7", f = "DKSelectViewModelRefactor.kt", l = {608}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKSelectViewModelRefactor$proceedAdditionalAction$7 extends SuspendLambda implements wls {
    final /* synthetic */ ct20 $challengeInfo;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModelRefactor$proceedAdditionalAction$7(n nVar, ct20 ct20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$challengeInfo = ct20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKSelectViewModelRefactor$proceedAdditionalAction$7(this.this$0, this.$challengeInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKSelectViewModelRefactor$proceedAdditionalAction$7) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0;
            kotlinx.coroutines.channels.a aVar = nVar.L;
            String str = ((daj) this.$challengeInfo).b;
            String c = ((yv90) ((asw) nVar.b)).c();
            String uid = ((yv90) ((asw) this.this$0.b)).b.getUid();
            if (uid == null) {
                uid = "";
            }
            bqv bqvVar = new bqv(str, c, uid);
            this.label = 1;
            if (aVar.o(bqvVar, this) == coroutineSingletons) {
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
