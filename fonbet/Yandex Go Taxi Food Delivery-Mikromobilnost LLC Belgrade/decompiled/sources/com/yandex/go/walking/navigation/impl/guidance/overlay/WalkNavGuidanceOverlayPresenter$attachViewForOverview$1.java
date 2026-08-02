package com.yandex.go.walking.navigation.impl.guidance.overlay;

import defpackage.d241;
import defpackage.e241;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.map.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.overlay.WalkNavGuidanceOverlayPresenter$attachViewForOverview$1", f = "WalkNavGuidanceOverlayPresenter.kt", l = {36, 37, 37}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceOverlayPresenter$attachViewForOverview$1 extends SuspendLambda implements wls {
    final /* synthetic */ d241 $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ e241 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceOverlayPresenter$attachViewForOverview$1(e241 e241Var, d241 d241Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = e241Var;
        this.$mvpView = d241Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavGuidanceOverlayPresenter$attachViewForOverview$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavGuidanceOverlayPresenter$attachViewForOverview$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r1.G4((com.yandex.mapkit.navigation.transport.Navigation) r7, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (r7.c(r6) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d241 d241Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            p pVar = this.this$0.B;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d241Var = (d241) this.L$0;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.label = 3;
        }
        d241Var = this.$mvpView;
        com.yandex.go.walking.navigation.impl.navigation_core.b bVar = this.this$0.A;
        this.L$0 = d241Var;
        this.label = 2;
        obj = bVar.a(this);
    }
}
