package com.yandex.messaging.ui.vpn;

import android.os.Handler;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import defpackage.b00;
import defpackage.mvg;
import defpackage.mz;
import defpackage.ny61;
import defpackage.t3z;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zz31;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.vpn.VpnBlockedViewModel$onRetry$1", f = "VpnBlockedViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class VpnBlockedViewModel$onRetry$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    final /* synthetic */ String $shownMessageId;
    int label;
    final /* synthetic */ zz31 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VpnBlockedViewModel$onRetry$1(zz31 zz31Var, ChatRequest chatRequest, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zz31Var;
        this.$chatRequest = chatRequest;
        this.$shownMessageId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VpnBlockedViewModel$onRetry$1(this.this$0, this.$chatRequest, this.$shownMessageId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VpnBlockedViewModel$onRetry$1 vpnBlockedViewModel$onRetry$1 = (VpnBlockedViewModel$onRetry$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        vpnBlockedViewModel$onRetry$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        b00 b00Var = this.this$0.x;
        ChatRequest chatRequest = this.$chatRequest;
        t3z t3zVar = LocalMessageRef.Companion;
        String str = this.$shownMessageId;
        t3zVar.getClass();
        ((Handler) b00Var.a.get()).post(new mz(b00Var, chatRequest, t3z.b(str), 1));
        return zy11.a;
    }
}
