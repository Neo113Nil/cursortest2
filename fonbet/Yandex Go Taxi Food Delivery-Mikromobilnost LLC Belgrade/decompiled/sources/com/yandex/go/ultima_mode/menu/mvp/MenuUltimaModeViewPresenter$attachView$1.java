package com.yandex.go.ultima_mode.menu.mvp;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.on10;
import defpackage.rn10;
import defpackage.tse;
import defpackage.vn10;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.menu.mvp.MenuUltimaModeViewPresenter$attachView$1", f = "MenuUltimaModeViewPresenter.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MenuUltimaModeViewPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ on10 $mvpView;
    int label;
    final /* synthetic */ vn10 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.ultima_mode.menu.mvp.MenuUltimaModeViewPresenter$attachView$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((on10) this.receiver).sf((rn10) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuUltimaModeViewPresenter$attachView$1(vn10 vn10Var, on10 on10Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vn10Var;
        this.$mvpView = on10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MenuUltimaModeViewPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MenuUltimaModeViewPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vn10 vn10Var = this.this$0;
            m0 m0Var = new m0(vn10Var.A.c, vn10Var.y.a(), new MenuUltimaModeViewPresenter$uiStateFlow$1(vn10Var, null));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, this.$mvpView, on10.class, "render", "render(Lcom/yandex/go/ultima_mode/menu/state/MenuUltimaModeUiState;)V", 4);
            this.label = 1;
            if (e.k(m0Var, anonymousClass1, this) == coroutineSingletons) {
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
