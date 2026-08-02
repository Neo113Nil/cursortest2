package com.yandex.go.taxi_order.ws;

import defpackage.fk41;
import defpackage.hst;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ke00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi_order.ws.WebSocketRepositoryImpl$onMessage$1", f = "WebSocketRepositoryImpl.kt", l = {157, 159}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WebSocketRepositoryImpl$onMessage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $text;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketRepositoryImpl$onMessage$1(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebSocketRepositoryImpl$onMessage$1 webSocketRepositoryImpl$onMessage$1 = new WebSocketRepositoryImpl$onMessage$1(this.this$0, this.$text, continuation);
        webSocketRepositoryImpl$onMessage$1.L$0 = obj;
        return webSocketRepositoryImpl$onMessage$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebSocketRepositoryImpl$onMessage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0118, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x011a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        if (r12 == r1) goto L55;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WebSocketFrameResponse webSocketFrameResponse;
        Object failure;
        WebSocketMessageDto webSocketMessageDto;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            fk41 fk41Var = (fk41) obj;
            if (fk41Var != null) {
                hst hstVar = jst.e;
                n0 n0Var = this.this$0.m;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
            }
            return zy11.a;
        }
        kotlin.b.b(obj);
        try {
            webSocketFrameResponse = (WebSocketFrameResponse) ((xnt) this.this$0.b).c(this.$text, WebSocketFrameResponse.Companion.serializer());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            hst hstVar2 = jst.e;
            webSocketFrameResponse = null;
        }
        String str = webSocketFrameResponse != null ? webSocketFrameResponse.a : null;
        if (jl40.l(str, "ping")) {
            this.this$0.g();
        } else if (jl40.l(str, "xivaws-error")) {
            jst.e.d("ws-taxiroute", "WebSocketRepository::onMessage, server error=" + this.$text);
            this.this$0.f(WebSocketClient$CloseReason.SERVER_ERROR);
        } else {
            hst hstVar3 = jst.e;
            String str2 = webSocketFrameResponse != null ? webSocketFrameResponse.b : null;
            if (str2 != null && str2.length() != 0) {
                try {
                    failure = (WebSocketMessageDto) ((xnt) this.this$0.b).c(str2, WebSocketMessageDto.Companion.serializer());
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a == null) {
                    webSocketMessageDto = (WebSocketMessageDto) failure;
                } else {
                    hst hstVar4 = jst.e;
                    ke00 a2 = hstVar4.b.a();
                    if (a2 != null && a2.b(15)) {
                        a2.a(15, "ws-taxiroute", a, "WebSocketRepository::onMessage, failed to deserialize message", hstVar4.a);
                    }
                    webSocketMessageDto = null;
                }
                if (webSocketMessageDto != null) {
                    d dVar = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 1;
                    obj = d.c(dVar, webSocketMessageDto, this);
                }
            }
        }
        return zy11.a;
    }
}
