package com.yandex.messaging.domain.statuses;

import com.yandex.messaging.ChatRequest;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.statuses.GetDndWarningUseCase$execute$1", f = "GetDndWarningUseCase.kt", l = {43, 44, 45}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetDndWarningUseCase$execute$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDndWarningUseCase$execute$1(f fVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$chatRequest = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetDndWarningUseCase$execute$1 getDndWarningUseCase$execute$1 = new GetDndWarningUseCase$execute$1(this.this$0, this.$chatRequest, continuation);
        getDndWarningUseCase$execute$1.L$0 = obj;
        return getDndWarningUseCase$execute$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetDndWarningUseCase$execute$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        String str;
        vpr vprVar2;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar3 = (vpr) this.L$0;
            com.yandex.messaging.domain.personal.a aVar = this.this$0.f;
            this.L$0 = vprVar3;
            this.label = 1;
            Object a = aVar.a(zy11Var, this);
            if (a != coroutineSingletons) {
                vprVar = vprVar3;
                obj = a;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$1;
            vprVar2 = (vpr) this.L$0;
            kotlin.b.b(obj);
            str2 = (String) obj;
            if (jl40.l(str2, str)) {
                str2 = null;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            return vprVar2.emit(str2, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        vprVar = (vpr) this.L$0;
        kotlin.b.b(obj);
        String str3 = (String) obj;
        com.yandex.messaging.domain.chat.c cVar = this.this$0.e;
        ChatRequest chatRequest = this.$chatRequest;
        this.L$0 = vprVar;
        this.L$1 = str3;
        this.label = 2;
        Object a2 = cVar.a(chatRequest, this);
        if (a2 != coroutineSingletons) {
            vpr vprVar4 = vprVar;
            str = str3;
            obj = a2;
            vprVar2 = vprVar4;
            str2 = (String) obj;
            if (jl40.l(str2, str)) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (vprVar2.emit(str2, this) != coroutineSingletons) {
            }
        }
    }
}
