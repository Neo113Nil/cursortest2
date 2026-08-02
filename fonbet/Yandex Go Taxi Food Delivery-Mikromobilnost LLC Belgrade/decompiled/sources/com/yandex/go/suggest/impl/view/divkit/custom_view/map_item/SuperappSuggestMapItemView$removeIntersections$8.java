package com.yandex.go.suggest.impl.view.divkit.custom_view.map_item;

import defpackage.agw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemView$removeIntersections$8", f = "SuperappSuggestMapItemView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SuperappSuggestMapItemView$removeIntersections$8 extends SuspendLambda implements wls {
    final /* synthetic */ List<SuperappSuggestMapItemPinView> $allPins;
    final /* synthetic */ List<SuperappSuggestMapItemPinView> $smallPins;
    int label;
    final /* synthetic */ SuperappSuggestMapItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestMapItemView$removeIntersections$8(List list, List list2, SuperappSuggestMapItemView superappSuggestMapItemView, Continuation continuation) {
        super(2, continuation);
        this.$allPins = list;
        this.$smallPins = list2;
        this.this$0 = superappSuggestMapItemView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappSuggestMapItemView$removeIntersections$8(this.$allPins, this.$smallPins, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperappSuggestMapItemView$removeIntersections$8 superappSuggestMapItemView$removeIntersections$8 = (SuperappSuggestMapItemView$removeIntersections$8) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superappSuggestMapItemView$removeIntersections$8.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<SuperappSuggestMapItemPinView> list = this.$allPins;
        List<SuperappSuggestMapItemPinView> list2 = this.$smallPins;
        SuperappSuggestMapItemView superappSuggestMapItemView = this.this$0;
        for (SuperappSuggestMapItemPinView superappSuggestMapItemPinView : list) {
            boolean contains = list2.contains(superappSuggestMapItemPinView);
            superappSuggestMapItemPinView.setMode(contains);
            if (contains) {
                map = superappSuggestMapItemView.pinsOffsets;
                agw0 agw0Var = (agw0) map.get(superappSuggestMapItemPinView);
                if (agw0Var != null) {
                    superappSuggestMapItemPinView.setX(agw0Var.c);
                    superappSuggestMapItemPinView.setY(agw0Var.d);
                }
            }
            superappSuggestMapItemPinView.setVisibility(0);
        }
        return zy11.a;
    }
}
