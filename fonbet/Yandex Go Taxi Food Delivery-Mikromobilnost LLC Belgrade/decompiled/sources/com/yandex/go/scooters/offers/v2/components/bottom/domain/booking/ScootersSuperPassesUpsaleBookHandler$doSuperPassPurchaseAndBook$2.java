package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import com.yandex.go.scooters.passes.model.PassType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.y5n0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.ScootersSuperPassesUpsaleBookHandler$doSuperPassPurchaseAndBook$2", f = "ScootersSuperPassesUpsaleBookHandler.kt", l = {104, 176, 109}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesUpsaleBookHandler$doSuperPassPurchaseAndBook$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $superPassIdForPurchase;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ j this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.ScootersSuperPassesUpsaleBookHandler$doSuperPassPurchaseAndBook$2$1", f = "ScootersSuperPassesUpsaleBookHandler.kt", l = {100}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.ScootersSuperPassesUpsaleBookHandler$doSuperPassPurchaseAndBook$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $superPassIdForPurchase;
        int label;
        final /* synthetic */ j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j jVar, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jVar;
            this.$superPassIdForPurchase = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$superPassIdForPurchase, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.scooters.passes.domain.i iVar = this.this$0.j;
                String str = this.$superPassIdForPurchase;
                PassType passType = PassType.SUPER_PASS;
                this.label = 1;
                if (iVar.a(str, passType, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesUpsaleBookHandler$doSuperPassPurchaseAndBook$2(j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$superPassIdForPurchase = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSuperPassesUpsaleBookHandler$doSuperPassPurchaseAndBook$2 scootersSuperPassesUpsaleBookHandler$doSuperPassPurchaseAndBook$2 = new ScootersSuperPassesUpsaleBookHandler$doSuperPassPurchaseAndBook$2(this.this$0, this.$superPassIdForPurchase, continuation);
        scootersSuperPassesUpsaleBookHandler$doSuperPassPurchaseAndBook$2.L$0 = obj;
        return scootersSuperPassesUpsaleBookHandler$doSuperPassPurchaseAndBook$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSuperPassesUpsaleBookHandler$doSuperPassPurchaseAndBook$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bf, code lost:
    
        if (com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.j.c(r10, r9) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (com.yandex.go.scooters.offers.v2.components.bottom.data.a.a(r2, r7, r9) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, kotlin.Result] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar;
        y5n0 a;
        Ref$ObjectRef ref$ObjectRef;
        Object obj2;
        Result result;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$superPassIdForPurchase, null), 3);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            j jVar = this.this$0;
            aVar = jVar.k;
            a = aVar.a.a();
            com.yandex.go.scooters.passes.domain.g gVar = jVar.l;
            this.L$0 = null;
            this.L$1 = ref$ObjectRef2;
            this.L$2 = aVar;
            this.L$3 = a;
            this.label = 1;
            Object c = gVar.c(this);
            if (c != coroutineSingletons) {
                ref$ObjectRef = ref$ObjectRef2;
                obj2 = c;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            y5n0 y5n0Var = (y5n0) this.L$3;
            aVar = (com.yandex.go.scooters.offers.v2.components.bottom.data.a) this.L$2;
            Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
            a = y5n0Var;
            ref$ObjectRef = ref$ObjectRef3;
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            kotlin.b.b(obj);
            result = (Result) ref$ObjectRef.element;
            if (result != null) {
                Object value = result.getValue();
                kotlin.b.b(value);
            }
            j jVar2 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
        }
        ref$ObjectRef.element = new Result(obj2);
        boolean z = obj2 instanceof Result.Failure;
        boolean z2 = !z;
        if (!z) {
            this.L$0 = null;
            this.L$1 = ref$ObjectRef;
            this.L$2 = null;
            this.L$3 = null;
            this.Z$0 = z2;
            this.label = 2;
        }
        result = (Result) ref$ObjectRef.element;
        if (result != null) {
        }
        j jVar22 = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 3;
    }
}
