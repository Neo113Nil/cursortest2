package com.yandex.messaging.miniapps.view;

import android.net.Uri;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.miniapps.view.MiniAppBrick$MiniAppWebViewClient$onReceivedError$1$1", f = "MiniAppBrick.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class MiniAppBrick$MiniAppWebViewClient$onReceivedError$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $it;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppBrick$MiniAppWebViewClient$onReceivedError$1$1(a aVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MiniAppBrick$MiniAppWebViewClient$onReceivedError$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MiniAppBrick$MiniAppWebViewClient$onReceivedError$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.messaging.internal.net.a aVar = this.this$0.A;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        a aVar2 = this.this$0;
        if (!aVar2.K) {
            aVar2.z.c("csat_retry", "url", this.$it.toString());
            a aVar3 = this.this$0;
            String str = aVar3.x.c;
            if (str != null) {
                aVar3.q(str);
            }
        }
        return zy11.a;
    }
}
