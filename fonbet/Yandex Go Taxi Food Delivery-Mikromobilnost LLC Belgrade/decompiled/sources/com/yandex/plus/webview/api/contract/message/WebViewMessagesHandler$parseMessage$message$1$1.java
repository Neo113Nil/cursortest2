package com.yandex.plus.webview.api.contract.message;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zs10;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000 \u0000*\u00020\u0001H\n"}, d2 = {"M", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.webview.api.contract.message.WebViewMessagesHandler$parseMessage$message$1$1", f = "WebViewMessagesHandler.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebViewMessagesHandler$parseMessage$message$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $jsonMessage;
    int label;
    final /* synthetic */ WebViewMessagesHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewMessagesHandler$parseMessage$message$1$1(WebViewMessagesHandler webViewMessagesHandler, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = webViewMessagesHandler;
        this.$jsonMessage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewMessagesHandler$parseMessage$message$1$1(this.this$0, this.$jsonMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewMessagesHandler$parseMessage$message$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        zs10 zs10Var = this.this$0.a;
        String str = this.$jsonMessage;
        this.label = 1;
        Object u = zs10Var.u(str);
        return u == coroutineSingletons ? coroutineSingletons : u;
    }
}
