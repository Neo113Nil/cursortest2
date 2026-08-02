package com.ybsdk.feature.main.internal.screens.sbpAccount;

import com.ybsdk.feature.main.internal.data.network.c;
import defpackage.aem0;
import defpackage.dqg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.vam0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.screens.sbpAccount.SbpAccountInfoViewModel$unbindAccount$2", f = "SbpAccountInfoViewModel.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SbpAccountInfoViewModel$unbindAccount$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpAccountInfoViewModel$unbindAccount$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SbpAccountInfoViewModel$unbindAccount$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpAccountInfoViewModel$unbindAccount$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            c cVar = aVar.C;
            String sbpAccountId = aVar.B.getSbpAccountId();
            this.label = 1;
            f = cVar.f(sbpAccountId, this);
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            f = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        if (!(f instanceof Result.Failure)) {
            aVar2.a0(new vam0(6, (dqg) f, aVar2));
        }
        a aVar3 = this.this$0;
        Throwable a = Result.a(f);
        if (a != null) {
            pz40 Y = aVar3.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new aem0(3, null, a, null)));
        }
        return zy11.a;
    }
}
