package com.yandex.go.ultima_mode.menu.mvp;

import com.yandex.go.ultima_mode.action.a;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vn10;
import defpackage.vu11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.menu.mvp.MenuUltimaModeViewPresenter$handleAction$1", f = "MenuUltimaModeViewPresenter.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MenuUltimaModeViewPresenter$handleAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ vu11 $ultimaAction;
    int label;
    final /* synthetic */ vn10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuUltimaModeViewPresenter$handleAction$1(vn10 vn10Var, vu11 vu11Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vn10Var;
        this.$ultimaAction = vu11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MenuUltimaModeViewPresenter$handleAction$1(this.this$0, this.$ultimaAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MenuUltimaModeViewPresenter$handleAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0.x;
            vu11 vu11Var = this.$ultimaAction;
            this.label = 1;
            if (aVar.a(vu11Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
