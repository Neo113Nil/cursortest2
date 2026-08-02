package com.yandex.go.taxi.cars.preorder.source;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.cars.preorder.source.CarsOnMapPresenter$startAnimation$1", f = "CarsOnMapPresenter.kt", l = {HProv.ALG_SID_KECCAK_256, 90}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CarsOnMapPresenter$startAnimation$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CarsOnMapPresenter$startAnimation$1 carsOnMapPresenter$startAnimation$1 = new CarsOnMapPresenter$startAnimation$1(2, continuation);
        carsOnMapPresenter$startAnimation$1.L$0 = obj;
        return carsOnMapPresenter$startAnimation$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CarsOnMapPresenter$startAnimation$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (r0.emit(r10, r9) != r1) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005b -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$LongRef ref$LongRef;
        Ref$LongRef ref$LongRef2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ref$LongRef = new Ref$LongRef();
            if (kotlinx.coroutines.a.p(get_context())) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$LongRef2 = (Ref$LongRef) this.L$1;
                kotlin.b.b(obj);
                ref$LongRef = ref$LongRef2;
                ref$LongRef.element++;
                if (kotlinx.coroutines.a.p(get_context())) {
                    return zy11.a;
                }
                this.L$0 = vprVar;
                this.L$1 = ref$LongRef;
                this.label = 1;
                if (kotlinx.coroutines.a.i(66L, this) != coroutineSingletons) {
                    ref$LongRef2 = ref$LongRef;
                    Long l = new Long(ref$LongRef2.element);
                    this.L$0 = vprVar;
                    this.L$1 = ref$LongRef2;
                    this.label = 2;
                }
                return coroutineSingletons;
            }
            ref$LongRef2 = (Ref$LongRef) this.L$1;
            kotlin.b.b(obj);
            Long l2 = new Long(ref$LongRef2.element);
            this.L$0 = vprVar;
            this.L$1 = ref$LongRef2;
            this.label = 2;
        }
    }
}
