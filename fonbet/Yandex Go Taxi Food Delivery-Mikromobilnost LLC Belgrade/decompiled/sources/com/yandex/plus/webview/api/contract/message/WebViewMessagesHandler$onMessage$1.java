package com.yandex.plus.webview.api.contract.message;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.skd0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.webview.api.contract.message.WebViewMessagesHandler$onMessage$1", f = "WebViewMessagesHandler.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WebViewMessagesHandler$onMessage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $jsonMessage;
    int label;
    final /* synthetic */ WebViewMessagesHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewMessagesHandler$onMessage$1(WebViewMessagesHandler webViewMessagesHandler, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = webViewMessagesHandler;
        this.$jsonMessage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewMessagesHandler$onMessage$1(this.this$0, this.$jsonMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewMessagesHandler$onMessage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            WebViewMessagesHandler webViewMessagesHandler = this.this$0;
            String str = this.$jsonMessage;
            this.label = 1;
            obj = WebViewMessagesHandler.a(webViewMessagesHandler, str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        if (obj != null) {
            tls tlsVar = (tls) this.this$0.c.get(obj.getClass());
            if (tlsVar != null) {
                tlsVar.invoke(obj);
            } else {
                skd0.h(PlusLogTag.JS, "Message handler not found for message " + obj, null);
            }
        }
        return zy11.a;
    }
}
