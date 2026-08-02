package com.ybsdk.feature.main.internal.screens.sbpAccount;

import com.ybsdk.feature.main.internal.data.network.c;
import defpackage.aem0;
import defpackage.bqg;
import defpackage.cem0;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.w511;
import defpackage.wdm0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.screens.sbpAccount.SbpAccountInfoViewModel$loadSbpAccountInfoScreen$2", f = "SbpAccountInfoViewModel.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SbpAccountInfoViewModel$loadSbpAccountInfoScreen$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpAccountInfoViewModel$loadSbpAccountInfoScreen$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SbpAccountInfoViewModel$loadSbpAccountInfoScreen$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpAccountInfoViewModel$loadSbpAccountInfoScreen$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        Object aem0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            c cVar = aVar.C;
            String sbpAccountId = aVar.B.getSbpAccountId();
            this.label = 1;
            c = cVar.c(sbpAccountId, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            c = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        if (!(c instanceof Result.Failure)) {
            dqg dqgVar = (dqg) c;
            pz40 Y = aVar2.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
                if (dqgVar instanceof cqg) {
                    wdm0 wdm0Var = (wdm0) ((cqg) dqgVar).a;
                    aem0Var = new cem0(wdm0Var.a, wdm0Var.b);
                } else {
                    if (!(dqgVar instanceof bqg)) {
                        w511.b();
                        return null;
                    }
                    bqg bqgVar = (bqg) dqgVar;
                    aem0Var = new aem0(4, bqgVar.a, null, bqgVar.b);
                }
            } while (!r0Var2.k(value2, aem0Var));
        }
        a aVar3 = this.this$0;
        Throwable a = Result.a(c);
        if (a != null) {
            x4c.g("Failed to load sbp account info screen", a, null, Collections.singletonList(lrp0.C), 4);
            pz40 Y2 = aVar3.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new aem0(3, null, a, null)));
        }
        return zy11.a;
    }
}
