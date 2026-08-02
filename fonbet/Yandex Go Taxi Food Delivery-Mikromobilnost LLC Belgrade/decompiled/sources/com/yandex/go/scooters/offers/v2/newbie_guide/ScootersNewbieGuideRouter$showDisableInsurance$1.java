package com.yandex.go.scooters.offers.v2.newbie_guide;

import com.yandex.go.scooters.domain.r;
import defpackage.b4p0;
import defpackage.m950;
import defpackage.msb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ptn0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x1o0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.newbie_guide.ScootersNewbieGuideRouter$showDisableInsurance$1", f = "ScootersNewbieGuideRouter.kt", l = {151}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersNewbieGuideRouter$showDisableInsurance$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $suggestionId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersNewbieGuideRouter$showDisableInsurance$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$suggestionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersNewbieGuideRouter$showDisableInsurance$1(this.this$0, this.$suggestionId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersNewbieGuideRouter$showDisableInsurance$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r rVar = this.this$0.I;
            String str = this.$suggestionId;
            this.label = 1;
            obj = rVar.e.c(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b bVar = this.this$0;
        zy11 zy11Var = zy11.a;
        if (!booleanValue) {
            b.P(bVar);
            return zy11Var;
        }
        m950 m950Var = (m950) bVar.L.get();
        msb1 msb1Var = msb1.R;
        b4p0 a = this.this$0.F.a();
        bVar.A(m950Var, new ptn0(msb1Var, a != null ? a.l : null), new x1o0(0, this.this$0));
        return zy11Var;
    }
}
