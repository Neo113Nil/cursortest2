package com.yandex.go.ultima_mode.menu.mvp;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import com.yandex.go.ultima_mode.menu.state.a;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vn10;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse;", "response", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lrn10;", "<anonymous>", "(Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse;Lru/yandex/taxi/theme/ThemeType;)Lrn10;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.menu.mvp.MenuUltimaModeViewPresenter$uiStateFlow$1", f = "MenuUltimaModeViewPresenter.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MenuUltimaModeViewPresenter$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ vn10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuUltimaModeViewPresenter$uiStateFlow$1(vn10 vn10Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = vn10Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MenuUltimaModeViewPresenter$uiStateFlow$1 menuUltimaModeViewPresenter$uiStateFlow$1 = new MenuUltimaModeViewPresenter$uiStateFlow$1(this.this$0, (Continuation) obj3);
        menuUltimaModeViewPresenter$uiStateFlow$1.L$0 = (UltimaModeResponse) obj;
        return menuUltimaModeViewPresenter$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UltimaModeResponse ultimaModeResponse = (UltimaModeResponse) this.L$0;
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
        a aVar = this.this$0.z;
        this.L$0 = null;
        this.label = 1;
        Object a = aVar.a(ultimaModeResponse, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
