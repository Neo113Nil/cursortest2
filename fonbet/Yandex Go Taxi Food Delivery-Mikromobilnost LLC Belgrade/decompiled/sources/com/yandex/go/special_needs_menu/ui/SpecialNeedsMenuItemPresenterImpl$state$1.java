package com.yandex.go.special_needs_menu.ui;

import com.yandex.go.special_needs_menu.experiment.SpecialNeedsMenuItemExperiment;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qot0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/special_needs_menu/experiment/SpecialNeedsMenuItemExperiment;", "experiment", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lpot0;", "<anonymous>", "(Lcom/yandex/go/special_needs_menu/experiment/SpecialNeedsMenuItemExperiment;Lru/yandex/taxi/theme/ThemeType;)Lpot0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.special_needs_menu.ui.SpecialNeedsMenuItemPresenterImpl$state$1", f = "SpecialNeedsMenuItemPresenterImpl.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SpecialNeedsMenuItemPresenterImpl$state$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialNeedsMenuItemPresenterImpl$state$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SpecialNeedsMenuItemPresenterImpl$state$1 specialNeedsMenuItemPresenterImpl$state$1 = new SpecialNeedsMenuItemPresenterImpl$state$1(this.this$0, (Continuation) obj3);
        specialNeedsMenuItemPresenterImpl$state$1.L$0 = (SpecialNeedsMenuItemExperiment) obj;
        return specialNeedsMenuItemPresenterImpl$state$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SpecialNeedsMenuItemExperiment specialNeedsMenuItemExperiment = (SpecialNeedsMenuItemExperiment) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        qot0 qot0Var = this.this$0.a;
        this.L$0 = null;
        this.label = 1;
        qot0Var.getClass();
        Object n = bvf0.n(new SpecialNeedsMenuItemUiStateFactory$createUiState$2(qot0Var, specialNeedsMenuItemExperiment, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
