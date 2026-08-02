package com.yandex.go.navigator.favorites.building_card;

import defpackage.bt6;
import defpackage.bvf0;
import defpackage.ct6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Los6;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.favorites.building_card.BuildingCardUiStateInteractor$contentFlow$1", f = "BuildingCardUiStateInteractor.kt", l = {38, 39, 40}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BuildingCardUiStateInteractor$contentFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ct6 $buildingInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ bt6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildingCardUiStateInteractor$contentFlow$1(bt6 bt6Var, ct6 ct6Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bt6Var;
        this.$buildingInfo = ct6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BuildingCardUiStateInteractor$contentFlow$1 buildingCardUiStateInteractor$contentFlow$1 = new BuildingCardUiStateInteractor$contentFlow$1(this.this$0, this.$buildingInfo, continuation);
        buildingCardUiStateInteractor$contentFlow$1.L$0 = obj;
        return buildingCardUiStateInteractor$contentFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BuildingCardUiStateInteractor$contentFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r0.emit((defpackage.ms6) r8, r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r8 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r0.emit(defpackage.ns6.a, r7) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        bt6 bt6Var = this.this$0;
        ct6 ct6Var = this.$buildingInfo;
        this.L$0 = vprVar;
        this.label = 2;
        bt6Var.getClass();
        obj = bvf0.n(new BuildingCardUiStateInteractor$createContentState$2(bt6Var, ct6Var, null), this);
    }
}
