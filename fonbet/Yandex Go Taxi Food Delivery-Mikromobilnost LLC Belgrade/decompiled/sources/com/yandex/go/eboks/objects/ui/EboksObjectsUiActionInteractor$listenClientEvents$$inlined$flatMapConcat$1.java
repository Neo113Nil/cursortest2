package com.yandex.go.eboks.objects.ui;

import defpackage.kin;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.vin;
import defpackage.wls;
import defpackage.xgn;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.ui.EboksObjectsUiActionInteractor$listenClientEvents$$inlined$flatMapConcat$1", f = "EboksObjectsUiActionInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class EboksObjectsUiActionInteractor$listenClientEvents$$inlined$flatMapConcat$1 extends SuspendLambda implements wls {
    final /* synthetic */ kin $current$inlined;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ vin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsUiActionInteractor$listenClientEvents$$inlined$flatMapConcat$1(Continuation continuation, vin vinVar, kin kinVar) {
        super(2, continuation);
        this.this$0 = vinVar;
        this.$current$inlined = kinVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EboksObjectsUiActionInteractor$listenClientEvents$$inlined$flatMapConcat$1 eboksObjectsUiActionInteractor$listenClientEvents$$inlined$flatMapConcat$1 = new EboksObjectsUiActionInteractor$listenClientEvents$$inlined$flatMapConcat$1(continuation, this.this$0, this.$current$inlined);
        eboksObjectsUiActionInteractor$listenClientEvents$$inlined$flatMapConcat$1.L$0 = obj;
        return eboksObjectsUiActionInteractor$listenClientEvents$$inlined$flatMapConcat$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EboksObjectsUiActionInteractor$listenClientEvents$$inlined$flatMapConcat$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        xgn xgnVar = (xgn) ((Pair) obj2).getFirst();
        vin vinVar = this.this$0;
        kin kinVar = this.$current$inlined;
        vinVar.getClass();
        return new rol0(new EboksObjectsUiActionInteractor$mapClientEventToRequest$1(xgnVar, kinVar, null));
    }
}
