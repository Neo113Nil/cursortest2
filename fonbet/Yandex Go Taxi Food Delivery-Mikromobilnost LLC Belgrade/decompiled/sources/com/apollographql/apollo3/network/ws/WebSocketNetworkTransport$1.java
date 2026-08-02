package com.apollographql.apollo3.network.ws;

import defpackage.l5c;
import defpackage.ljo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 5, 1})
@mvg(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$1", f = "WebSocketNetworkTransport.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WebSocketNetworkTransport$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebSocketNetworkTransport$1 webSocketNetworkTransport$1 = new WebSocketNetworkTransport$1(this.this$0, continuation);
        webSocketNetworkTransport$1.L$0 = obj;
        return webSocketNetworkTransport$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebSocketNetworkTransport$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Closeable closeable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Throwable th = null;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            e eVar = this.this$0;
            l5c l5cVar = eVar.h;
            try {
                this.L$0 = l5cVar;
                this.label = 1;
                if (e.a(eVar, tseVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                closeable = l5cVar;
            } catch (Throwable th2) {
                th = th2;
                closeable = l5cVar;
                if (closeable != null) {
                }
                th = th;
                if (th == null) {
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable = (Closeable) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th4) {
                        ljo.a(th, th4);
                    }
                }
                th = th;
                if (th == null) {
                }
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (th == null) {
            return zy11.a;
        }
        throw th;
    }
}
