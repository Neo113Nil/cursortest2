package com.yandex.go.taxi.order.support.data.mappers;

import com.yandex.go.taxi.order.models.api.cancel.Action$DeeplinkAction;
import com.yandex.go.taxi.order.models.api.cancel.Action$DeeplinkAndCancelAction;
import com.yandex.go.taxi.order.models.api.cancel.Action$DriverCall;
import com.yandex.go.taxi.order.models.api.cancel.Action$ModalViewAction;
import com.yandex.go.taxi.order.models.api.cancel.Action$RideSupportChat;
import com.yandex.go.taxi.order.models.api.cancel.ModalWindowInfo;
import com.yandex.go.taxi.order.models.api.cancel.c;
import com.yandex.go.taxi.order.models.api.cancel.d;
import com.yandex.go.taxi.order.models.api.cancel.e;
import com.yandex.go.taxi.order.models.api.cancel.h;
import com.yandex.go.taxi.order.models.api.cancel.j;
import com.yandex.go.taxi.order.models.api.cancel.m;
import com.yandex.go.taxi.order.models.api.cancel.n;
import defpackage.eiw0;
import defpackage.fiw0;
import defpackage.giw0;
import defpackage.hiw0;
import defpackage.iiw0;
import defpackage.jl40;
import defpackage.kiw0;
import defpackage.liw0;
import defpackage.miw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmiw0;", "<anonymous>", "(Ltse;)Lmiw0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.support.data.mappers.SupportItemMapper$convertAction$1", f = "SupportItemMapper.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SupportItemMapper$convertAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ n $actionDto;
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportItemMapper$convertAction$1(n nVar, a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$actionDto = nVar;
        this.this$0 = aVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SupportItemMapper$convertAction$1(this.$actionDto, this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportItemMapper$convertAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.$actionDto;
            if (!jl40.l(nVar, m.INSTANCE) && !jl40.l(nVar, c.INSTANCE) && !jl40.l(nVar, d.INSTANCE) && !jl40.l(nVar, h.INSTANCE) && !(nVar instanceof Action$DeeplinkAndCancelAction)) {
                if (jl40.l(nVar, com.yandex.go.taxi.order.models.api.cancel.a.INSTANCE)) {
                    return fiw0.a;
                }
                if (jl40.l(nVar, com.yandex.go.taxi.order.models.api.cancel.b.INSTANCE)) {
                    return kiw0.a;
                }
                if (jl40.l(nVar, e.INSTANCE)) {
                    return hiw0.a;
                }
                if (jl40.l(nVar, j.INSTANCE)) {
                    return giw0.a;
                }
                if (nVar instanceof Action$DeeplinkAction) {
                    return new iiw0(((Action$DeeplinkAction) this.$actionDto).a);
                }
                if (nVar instanceof Action$DriverCall) {
                    return new eiw0(((Action$DriverCall) this.$actionDto).a);
                }
                if (nVar instanceof Action$ModalViewAction) {
                    a aVar = this.this$0;
                    ModalWindowInfo modalWindowInfo = ((Action$ModalViewAction) this.$actionDto).a;
                    String str = this.$id;
                    this.label = 1;
                    obj = a.a(aVar, modalWindowInfo, str, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (nVar instanceof Action$RideSupportChat) {
                        return new liw0(((Action$RideSupportChat) this.$actionDto).a);
                    }
                    w511.b();
                }
            }
            return null;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return (miw0) obj;
    }
}
