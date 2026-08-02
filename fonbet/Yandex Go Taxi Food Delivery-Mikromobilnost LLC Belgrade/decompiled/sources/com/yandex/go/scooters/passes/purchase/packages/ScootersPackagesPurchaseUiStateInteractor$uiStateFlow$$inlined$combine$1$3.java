package com.yandex.go.scooters.passes.purchase.packages;

import com.yandex.go.scooters.passes.data.model.ScootersPackagesLegalTermsExperiment;
import defpackage.b9o0;
import defpackage.bfo0;
import defpackage.bvf0;
import defpackage.hfa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q8o0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3", f = "ScootersPackagesPurchaseUiStateInteractor.kt", l = {337, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ q8o0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3(Continuation continuation, q8o0 q8o0Var) {
        super(3, continuation);
        this.this$0 = q8o0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3 scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3 = new ScootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return scootersPackagesPurchaseUiStateInteractor$uiStateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ca, code lost:
    
        if (r1.emit(r2, r22) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cc, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        if (r2 == r3) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object n;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            boolean booleanValue = ((Boolean) obj5).booleanValue();
            String str = (String) obj4;
            b9o0 b9o0Var = (b9o0) obj3;
            i iVar = this.this$0.c;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = null;
            this.Z$0 = booleanValue;
            this.label = 1;
            iVar.getClass();
            n = bvf0.n(new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2(booleanValue, (bfo0) objArr[6], b9o0Var, iVar, str, (hfa0) obj6, (ScootersPackagesLegalTermsExperiment) obj7, null), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            n = obj;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = null;
        this.L$9 = null;
        this.L$10 = null;
        this.label = 2;
    }
}
