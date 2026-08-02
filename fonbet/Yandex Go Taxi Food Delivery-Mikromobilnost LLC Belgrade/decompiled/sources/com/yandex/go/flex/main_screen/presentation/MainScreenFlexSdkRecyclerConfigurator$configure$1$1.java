package com.yandex.go.flex.main_screen.presentation;

import android.view.View;
import defpackage.acw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zbw0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkRecyclerConfigurator$configure$1$1", f = "MainScreenFlexSdkRecyclerConfigurator.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MainScreenFlexSdkRecyclerConfigurator$configure$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenFlexSdkRecyclerConfigurator$configure$1$1(d dVar, View view, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainScreenFlexSdkRecyclerConfigurator$configure$1$1(this.this$0, this.$view, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainScreenFlexSdkRecyclerConfigurator$configure$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zbw0 zbw0Var = this.this$0.d;
            View view = this.$view;
            this.label = 1;
            if (((acw0) zbw0Var).e.emit(view, this) == coroutineSingletons) {
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
