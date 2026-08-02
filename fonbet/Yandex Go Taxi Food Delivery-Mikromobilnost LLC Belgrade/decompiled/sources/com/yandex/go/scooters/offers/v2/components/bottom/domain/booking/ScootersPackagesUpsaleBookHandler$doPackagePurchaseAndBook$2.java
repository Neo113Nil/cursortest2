package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import com.yandex.go.scooters.passes.model.PassType;
import defpackage.moo0;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmoo0;", "<anonymous>", "(Ltse;)Lmoo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2", f = "ScootersPackagesUpsaleBookHandler.kt", l = {HProv.ALG_SID_KECCAK_224, HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $packageIdForPurchase;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2$1", f = "ScootersPackagesUpsaleBookHandler.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $packageIdForPurchase;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fVar;
            this.$packageIdForPurchase = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$packageIdForPurchase, continuation);
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
                com.yandex.go.scooters.passes.domain.i iVar = this.this$0.g;
                String str = this.$packageIdForPurchase;
                PassType passType = PassType.PACKAGE;
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
    public ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2(f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$packageIdForPurchase = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2 scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2 = new ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2(this.this$0, this.$packageIdForPurchase, continuation);
        scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2.L$0 = obj;
        return scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r0 == r1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, kotlin.Result] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar;
        y5n0 a;
        Object a2;
        Ref$ObjectRef ref$ObjectRef2;
        Result result;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$packageIdForPurchase, null), 3);
            ref$ObjectRef = new Ref$ObjectRef();
            f fVar = this.this$0;
            aVar = fVar.h;
            a = aVar.a.a();
            com.yandex.go.scooters.passes.domain.g gVar = fVar.i;
            this.L$0 = null;
            this.L$1 = ref$ObjectRef;
            this.L$2 = aVar;
            this.L$3 = a;
            this.label = 1;
            a2 = gVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                kotlin.b.b(obj);
                ref$ObjectRef = ref$ObjectRef2;
                result = (Result) ref$ObjectRef.element;
                if (result != null) {
                    return null;
                }
                Object value = result.getValue();
                kotlin.b.b(value);
                return (moo0) value;
            }
            y5n0 y5n0Var = (y5n0) this.L$3;
            aVar = (com.yandex.go.scooters.offers.v2.components.bottom.data.a) this.L$2;
            Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
            kotlin.b.b(obj);
            a = y5n0Var;
            a2 = ((Result) obj).getValue();
            ref$ObjectRef = ref$ObjectRef3;
        }
        ref$ObjectRef.element = new Result(a2);
        boolean z = a2 instanceof Result.Failure;
        boolean z2 = !z;
        if (!z) {
            this.L$0 = null;
            this.L$1 = ref$ObjectRef;
            this.L$2 = null;
            this.L$3 = null;
            this.Z$0 = z2;
            this.label = 2;
            if (com.yandex.go.scooters.offers.v2.components.bottom.data.a.a(aVar, a, this) != coroutineSingletons) {
                ref$ObjectRef2 = ref$ObjectRef;
                ref$ObjectRef = ref$ObjectRef2;
            }
            return coroutineSingletons;
        }
        result = (Result) ref$ObjectRef.element;
        if (result != null) {
        }
    }
}
