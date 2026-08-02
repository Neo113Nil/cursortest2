package com.yandex.go.ultima_mode.menu.state;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.ief;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfv11;", "<anonymous>", "(Ltse;)Lfv11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.menu.state.MenuUltimaModeUiStateMapper$map$2$headerState$1", f = "MenuUltimaModeUiStateMapper.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MenuUltimaModeUiStateMapper$map$2$headerState$1 extends SuspendLambda implements wls {
    final /* synthetic */ UltimaModeResponse.Menu.Card $cardDto;
    final /* synthetic */ ief $currencyRulesDto;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuUltimaModeUiStateMapper$map$2$headerState$1(a aVar, UltimaModeResponse.Menu.Card card, ief iefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$cardDto = card;
        this.$currencyRulesDto = iefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MenuUltimaModeUiStateMapper$map$2$headerState$1(this.this$0, this.$cardDto, this.$currencyRulesDto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MenuUltimaModeUiStateMapper$map$2$headerState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        com.yandex.go.ultima_mode.ui.header.state.a aVar = this.this$0.a;
        UltimaModeResponse.Menu.Card card = this.$cardDto;
        UltimaModeResponse.Title title = card.a;
        UltimaModeResponse.Subtitle subtitle = card.b;
        ief iefVar = this.$currencyRulesDto;
        this.label = 1;
        Object b = aVar.b(title, subtitle, iefVar, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
