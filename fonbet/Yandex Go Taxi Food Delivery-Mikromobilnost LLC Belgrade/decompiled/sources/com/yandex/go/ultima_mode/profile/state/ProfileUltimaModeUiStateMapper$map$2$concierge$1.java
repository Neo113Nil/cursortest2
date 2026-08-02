package com.yandex.go.ultima_mode.profile.state;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.fef;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.irs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yu11;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxss0;", "<anonymous>", "(Ltse;)Lxss0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.profile.state.ProfileUltimaModeUiStateMapper$map$2$concierge$1", f = "ProfileUltimaModeUiStateMapper.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ProfileUltimaModeUiStateMapper$map$2$concierge$1 extends SuspendLambda implements wls {
    final /* synthetic */ UltimaModeResponse.Profile.Card $cardDto;
    final /* synthetic */ ief $currencyRulesDto;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUltimaModeUiStateMapper$map$2$concierge$1(ief iefVar, UltimaModeResponse.Profile.Card card, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$cardDto = card;
        this.this$0 = aVar;
        this.$currencyRulesDto = iefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileUltimaModeUiStateMapper$map$2$concierge$1(this.$currencyRulesDto, this.$cardDto, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileUltimaModeUiStateMapper$map$2$concierge$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        SlotItemDto slotItemDto = this.$cardDto.e;
        if (slotItemDto == null) {
            return null;
        }
        a aVar = this.this$0;
        irs0 irs0Var = aVar.a;
        yu11 yu11Var = aVar.b;
        ief iefVar = this.$currencyRulesDto;
        fef h = iefVar != null ? gwk0.h(iefVar) : null;
        this.L$0 = null;
        this.label = 1;
        e = ((com.yandex.go.slot.mapper.a) irs0Var).e(slotItemDto, yu11Var, false, false, h, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
