package com.yandex.go.ultima_mode.profile.state;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.gwk0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxss0;", "<anonymous>", "(Ltse;)Lxss0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.profile.state.ProfileUltimaModeUiStateMapper$map$2$modeToggle$1", f = "ProfileUltimaModeUiStateMapper.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ProfileUltimaModeUiStateMapper$map$2$modeToggle$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isUltimaModeManuallyDisabled;
    final /* synthetic */ UltimaModeResponse $response;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUltimaModeUiStateMapper$map$2$modeToggle$1(UltimaModeResponse ultimaModeResponse, a aVar, Continuation continuation, boolean z) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$response = ultimaModeResponse;
        this.$isUltimaModeManuallyDisabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileUltimaModeUiStateMapper$map$2$modeToggle$1(this.$response, this.this$0, continuation, this.$isUltimaModeManuallyDisabled);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileUltimaModeUiStateMapper$map$2$modeToggle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UltimaModeResponse.Profile.Card card;
        SlotItemDto slotItemDto;
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
        a aVar = this.this$0;
        UltimaModeResponse ultimaModeResponse = this.$response;
        boolean z = this.$isUltimaModeManuallyDisabled;
        this.label = 1;
        aVar.getClass();
        UltimaModeResponse.Profile profile = ultimaModeResponse.d;
        if (profile != null && (card = profile.a) != null && (slotItemDto = card.f) != null) {
            ief iefVar = ultimaModeResponse.c;
            r2 = ((com.yandex.go.slot.mapper.a) aVar.a).e(slotItemDto, aVar.b, !z, true, iefVar != null ? gwk0.h(iefVar) : null, this);
        }
        return r2 == coroutineSingletons ? coroutineSingletons : r2;
    }
}
