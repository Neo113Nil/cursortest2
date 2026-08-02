package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Lsk11;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultInteractor$autoPullConfirm$2", f = "Me2MeDebitResultInteractor.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Me2MeDebitResultInteractor$autoPullConfirm$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $verificationToken;
    final /* synthetic */ String $ybId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Me2MeDebitResultInteractor$autoPullConfirm$2(a aVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$ybId = str;
        this.$operationId = str2;
        this.$verificationToken = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Me2MeDebitResultInteractor$autoPullConfirm$2 me2MeDebitResultInteractor$autoPullConfirm$2 = new Me2MeDebitResultInteractor$autoPullConfirm$2(this.this$0, this.$ybId, this.$operationId, this.$verificationToken, continuation);
        me2MeDebitResultInteractor$autoPullConfirm$2.L$0 = obj;
        return me2MeDebitResultInteractor$autoPullConfirm$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Me2MeDebitResultInteractor$autoPullConfirm$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.a aVar = this.this$0.b;
            String str2 = this.$ybId;
            String str3 = this.$operationId;
            String str4 = this.$verificationToken;
            this.label = 1;
            a = aVar.a(str2, str, str3, str4, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
