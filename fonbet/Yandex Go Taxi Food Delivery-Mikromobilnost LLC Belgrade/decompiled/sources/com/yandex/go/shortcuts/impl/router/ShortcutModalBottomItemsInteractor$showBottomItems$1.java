package com.yandex.go.shortcuts.impl.router;

import defpackage.e6v;
import defpackage.mvg;
import defpackage.nc6;
import defpackage.ny61;
import defpackage.r330;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.router.ShortcutModalBottomItemsInteractor$showBottomItems$1", f = "ShortcutModalBottomItemsInteractor.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ShortcutModalBottomItemsInteractor$showBottomItems$1 extends SuspendLambda implements wls {
    final /* synthetic */ Consumer<e6v> $actionHandler;
    final /* synthetic */ List<nc6> $items;
    final /* synthetic */ r330 $modalView;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutModalBottomItemsInteractor$showBottomItems$1(a aVar, List list, Consumer consumer, r330 r330Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$items = list;
        this.$actionHandler = consumer;
        this.$modalView = r330Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShortcutModalBottomItemsInteractor$showBottomItems$1(this.this$0, this.$items, this.$actionHandler, this.$modalView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutModalBottomItemsInteractor$showBottomItems$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            List<nc6> list = this.$items;
            Consumer<e6v> consumer = this.$actionHandler;
            r330 r330Var = this.$modalView;
            this.label = 1;
            if (a.a(aVar, list, consumer, r330Var, this) == coroutineSingletons) {
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
