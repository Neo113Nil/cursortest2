package androidx.compose.material;

import defpackage.fwi;
import defpackage.mvg;
import defpackage.nvs0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.urj0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.material.SwipeableKt$swipeable$3$3$1", f = "Swipeable.kt", l = {602}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SwipeableKt$swipeable$3$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<Float, Object> $anchors;
    final /* synthetic */ fwi $density;
    final /* synthetic */ urj0 $resistance;
    final /* synthetic */ e $state;
    final /* synthetic */ wls $thresholds;
    final /* synthetic */ float $velocityThreshold;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeable$3$3$1(e eVar, Map map, urj0 urj0Var, fwi fwiVar, wls wlsVar, float f, Continuation continuation) {
        super(2, continuation);
        this.$state = eVar;
        this.$anchors = map;
        this.$resistance = urj0Var;
        this.$density = fwiVar;
        this.$thresholds = wlsVar;
        this.$velocityThreshold = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SwipeableKt$swipeable$3$3$1(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SwipeableKt$swipeable$3$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Map map = (Map) this.$state.h.getValue();
            e eVar = this.$state;
            eVar.h.setValue(this.$anchors);
            e eVar2 = this.$state;
            eVar2.n.setValue(this.$resistance);
            e eVar3 = this.$state;
            eVar3.l.setValue(new nvs0(5, this.$thresholds, this.$anchors, this.$density));
            fwi fwiVar = this.$density;
            e eVar4 = this.$state;
            eVar4.m.setFloatValue(fwiVar.w0(this.$velocityThreshold));
            e eVar5 = this.$state;
            Map<Float, Object> map2 = this.$anchors;
            this.label = 1;
            if (eVar5.c(map, map2, this) == coroutineSingletons) {
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
