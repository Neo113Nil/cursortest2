package com.yandex.go.taxi.order.robotaxi.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/utils/UiStateDrawableWrapper;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.robotaxi.domain.RobotaxiInteractor$loadImageFlow$1", f = "RobotaxiInteractor.kt", l = {103, 104, 105}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RobotaxiInteractor$loadImageFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageUrl;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotaxiInteractor$loadImageFlow$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RobotaxiInteractor$loadImageFlow$1 robotaxiInteractor$loadImageFlow$1 = new RobotaxiInteractor$loadImageFlow$1(this.this$0, this.$imageUrl, continuation);
        robotaxiInteractor$loadImageFlow$1.L$0 = obj;
        return robotaxiInteractor$loadImageFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RobotaxiInteractor$loadImageFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        if (r0.emit(null, r8) == r1) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                UiStateDrawableWrapper uiStateDrawableWrapper = (UiStateDrawableWrapper) obj;
                if (uiStateDrawableWrapper != null) {
                    UiStateDrawableWrapper g = pkf.g(uiStateDrawableWrapper, this.$imageUrl, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (vprVar.emit(g, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        c cVar = this.this$0;
        String str = this.$imageUrl;
        this.L$0 = vprVar;
        this.label = 2;
        obj = c.b(cVar, str, this);
    }
}
