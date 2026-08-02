package com.yandex.plus.home.plaque.feature.internal.domain.observable;

import defpackage.e3n;
import defpackage.kp50;
import defpackage.lqc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.feature.internal.domain.observable.PlaqueConfigurationObservableImpl$updatePlaqueConfiguration$2", f = "PlaqueConfigurationObservableImpl.kt", l = {28, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlaqueConfigurationObservableImpl$updatePlaqueConfiguration$2 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueConfigurationObservableImpl$updatePlaqueConfiguration$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaqueConfigurationObservableImpl$updatePlaqueConfiguration$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaqueConfigurationObservableImpl$updatePlaqueConfiguration$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a0, code lost:
    
        if (kotlinx.coroutines.a.j(r10, r17) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00a0 -> B:6:0x0024). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        int i;
        int i2;
        Object obj2;
        a aVar2;
        int i3;
        int i4;
        Boolean bool;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        if (i5 == 0) {
            b.b(obj);
            aVar = this.this$0;
            i = 0;
            i2 = 0;
            int i6 = i + 1;
            lqc0 lqc0Var = aVar.a;
            this.L$0 = null;
            this.L$1 = aVar;
            this.L$2 = null;
            this.I$0 = i2;
            this.I$1 = i6;
            this.I$2 = i6;
            this.I$3 = 0;
            this.label = 1;
            obj2 = lqc0Var.d(i6, 4, this);
            if (obj2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            i4 = this.I$1;
            i3 = this.I$0;
            aVar2 = (a) this.L$1;
            b.b(obj);
            obj2 = obj;
            bool = (Boolean) obj2;
            bool.getClass();
            if (bool.booleanValue()) {
            }
            return bool;
        }
        if (i5 != 2) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i4 = this.I$1;
        i3 = this.I$0;
        aVar2 = (a) this.L$1;
        b.b(obj);
        int i7 = i3;
        i = i4;
        aVar = aVar2;
        i2 = i7;
        int i62 = i + 1;
        lqc0 lqc0Var2 = aVar.a;
        this.L$0 = null;
        this.L$1 = aVar;
        this.L$2 = null;
        this.I$0 = i2;
        this.I$1 = i62;
        this.I$2 = i62;
        this.I$3 = 0;
        this.label = 1;
        obj2 = lqc0Var2.d(i62, 4, this);
        if (obj2 != coroutineSingletons) {
            int i8 = i2;
            aVar2 = aVar;
            i4 = i62;
            i3 = i8;
            bool = (Boolean) obj2;
            bool.getClass();
            if (!bool.booleanValue() || i4 >= 4) {
                return bool;
            }
            o430 o430Var = e3n.b;
            long l = e3n.l(Math.pow(3.0d, i4 - 1), kp50.U(2, DurationUnit.SECONDS));
            this.L$0 = null;
            this.L$1 = aVar2;
            this.L$2 = null;
            this.I$0 = i3;
            this.I$1 = i4;
            this.label = 2;
        }
        return coroutineSingletons;
    }
}
