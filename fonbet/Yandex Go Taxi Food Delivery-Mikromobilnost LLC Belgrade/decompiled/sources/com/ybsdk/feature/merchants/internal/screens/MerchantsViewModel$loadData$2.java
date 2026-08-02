package com.ybsdk.feature.merchants.internal.screens;

import com.ybsdk.core.analytics.generated.delegates.PartnersEvents$PartnersLoadedResult;
import defpackage.cr10;
import defpackage.er10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.merchants.internal.screens.MerchantsViewModel$loadData$2", f = "MerchantsViewModel.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MerchantsViewModel$loadData$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantsViewModel$loadData$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MerchantsViewModel$loadData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MerchantsViewModel$loadData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        r0 r0Var;
        Object value;
        s8j0 s8j0Var;
        r0 r0Var2;
        Object value2;
        r8j0 r8j0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.ybsdk.feature.merchants.internal.data.a aVar = this.this$0.B;
            this.label = 1;
            b = aVar.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        Throwable a = Result.a(b);
        if (a == null) {
            cr10 cr10Var = (cr10) b;
            aVar2.D.P.a(PartnersEvents$PartnersLoadedResult.OK, null);
            pz40 Y = aVar2.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
                r8j0Var = new r8j0(cr10Var, null, 14);
                ((er10) value2).getClass();
            } while (!r0Var2.k(value2, new er10(r8j0Var)));
        } else {
            aVar2.D.P.a(PartnersEvents$PartnersLoadedResult.ERROR, a.getMessage());
            pz40 Y2 = aVar2.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
                s8j0Var = new s8j0(a);
                ((er10) value).getClass();
            } while (!r0Var.k(value, new er10(s8j0Var)));
        }
        return zy11.a;
    }
}
