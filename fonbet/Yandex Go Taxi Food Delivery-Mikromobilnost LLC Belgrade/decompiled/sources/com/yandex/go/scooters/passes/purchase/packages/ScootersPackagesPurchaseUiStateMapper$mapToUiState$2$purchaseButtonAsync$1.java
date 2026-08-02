package com.yandex.go.scooters.passes.purchase.packages;

import defpackage.b9o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lo8o0;", "<anonymous>", "(Ltse;)Lo8o0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$purchaseButtonAsync$1", f = "ScootersPackagesPurchaseUiStateMapper.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$purchaseButtonAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $inProgress;
    final /* synthetic */ b9o0 $packagesPurchaseWindow;
    final /* synthetic */ String $selectedPackageId;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$purchaseButtonAsync$1(i iVar, b9o0 b9o0Var, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$packagesPurchaseWindow = b9o0Var;
        this.$selectedPackageId = str;
        this.$inProgress = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$purchaseButtonAsync$1(this.this$0, this.$packagesPurchaseWindow, this.$selectedPackageId, this.$inProgress, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$purchaseButtonAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        i iVar = this.this$0;
        ArrayList arrayList = this.$packagesPurchaseWindow.f;
        String str = this.$selectedPackageId;
        boolean z = this.$inProgress;
        this.label = 1;
        Object c = i.c(iVar, arrayList, str, z, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
