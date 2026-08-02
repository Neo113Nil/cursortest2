package com.yandex.go.delivery.tracking;

import defpackage.gri;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.t701;
import defpackage.tse;
import defpackage.wls;
import defpackage.xli;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.DeliveryTrackingPresenter$attachView$1", f = "DeliveryTrackingPresenter.kt", l = {149}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryTrackingPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryTrackingPresenter$attachView$1(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryTrackingPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryTrackingPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = new c((n4u0) this.this$0.J.e.getValue());
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.A(cVar, this);
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
        t701 t701Var = (t701) obj;
        if (t701Var != null) {
            gri griVar = t701Var.a;
            l lVar = this.this$0;
            String str = griVar.a;
            String str2 = griVar.a;
            lVar.a0 = str;
            lVar.F.b.set(str);
            lVar.A.a(str2);
            r0 r0Var = lVar.B.D;
            do {
                value = r0Var.getValue();
                linkedHashMap = new LinkedHashMap((Map) value);
                xli xliVar = new xli(str2);
                Integer num = (Integer) linkedHashMap.get(new xli(str2));
                linkedHashMap.put(xliVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            } while (!r0Var.k(value, linkedHashMap));
        }
        return zy11.a;
    }
}
