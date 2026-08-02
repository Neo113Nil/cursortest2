package com.yandex.go.taxi_order.ws;

import defpackage.ak41;
import defpackage.ck41;
import defpackage.g050;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi_order.ws.WebSocketRepositoryImpl$connectInternal$1", f = "WebSocketRepositoryImpl.kt", l = {283, 176, 179, 185, 194}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WebSocketRepositoryImpl$connectInternal$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketRepositoryImpl$connectInternal$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebSocketRepositoryImpl$connectInternal$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebSocketRepositoryImpl$connectInternal$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        d dVar;
        g050 g050Var3;
        ck41 a;
        Object b;
        ck41 ck41Var;
        d dVar2;
        ak41 ak41Var;
        g050 g050Var4;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        kotlin.b.b(obj);
                        d dVar3 = this.this$0;
                        kotlinx.coroutines.sync.a aVar = dVar3.r;
                        this.L$0 = aVar;
                        this.L$1 = dVar3;
                        this.label = 1;
                        if (aVar.a(this) != coroutineSingletons) {
                            g050Var2 = aVar;
                            dVar = dVar3;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            dVar = (d) this.L$1;
                            g050Var3 = (g050) this.L$0;
                            try {
                                kotlin.b.b(obj);
                                a = d.a(dVar);
                                this.L$0 = g050Var3;
                                this.L$1 = dVar;
                                this.L$2 = a;
                                this.label = 3;
                                b = d.b(dVar, this);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            if (b != coroutineSingletons) {
                                d dVar4 = dVar;
                                ck41Var = a;
                                obj = b;
                                dVar2 = dVar4;
                                ak41Var = (ak41) obj;
                                if (ak41Var != null) {
                                    jst.e.getClass();
                                    a a2 = dVar2.d.a(dVar2);
                                    a2.h(ak41Var, ck41Var);
                                    dVar2.o = a2;
                                    g050Var2 = g050Var3;
                                    g050Var2.d(null);
                                    return zy11Var;
                                }
                                jst.e.d("ws-taxiroute", "WebSocketRepository::connect, failed to load auth credentials or config to establish connection");
                                r0 r0Var = dVar2.k;
                                WebSocketRepository$ConnectionState webSocketRepository$ConnectionState = WebSocketRepository$ConnectionState.DISCONNECTED;
                                this.L$0 = g050Var3;
                                this.L$1 = dVar2;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 4;
                                r0Var.emit(webSocketRepository$ConnectionState, this);
                                if (zy11Var != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                dVar = (d) this.L$1;
                                g050Var4 = (g050) this.L$0;
                                try {
                                    kotlin.b.b(obj);
                                    g050Var3 = g050Var4;
                                    g050Var2 = g050Var3;
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable th3) {
                                    th = th3;
                                    g050Var3 = g050Var4;
                                }
                                g050Var2.d(null);
                                return zy11Var;
                            }
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) this.L$0;
                            try {
                                kotlin.b.b(obj);
                                g050Var2 = g050Var;
                                g050Var2.d(null);
                                return zy11Var;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    g050Var2 = g050Var;
                                    g050Var2.d(null);
                                    throw th;
                                }
                            }
                        }
                        ck41Var = (ck41) this.L$2;
                        dVar2 = (d) this.L$1;
                        g050Var3 = (g050) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            ak41Var = (ak41) obj;
                        } catch (Throwable th6) {
                            th = th6;
                            dVar = dVar2;
                        }
                        if (ak41Var != null && ck41Var != null) {
                            jst.e.getClass();
                            a a22 = dVar2.d.a(dVar2);
                            a22.h(ak41Var, ck41Var);
                            dVar2.o = a22;
                            g050Var2 = g050Var3;
                            g050Var2.d(null);
                            return zy11Var;
                        }
                        jst.e.d("ws-taxiroute", "WebSocketRepository::connect, failed to load auth credentials or config to establish connection");
                        r0 r0Var2 = dVar2.k;
                        WebSocketRepository$ConnectionState webSocketRepository$ConnectionState2 = WebSocketRepository$ConnectionState.DISCONNECTED;
                        this.L$0 = g050Var3;
                        this.L$1 = dVar2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 4;
                        r0Var2.emit(webSocketRepository$ConnectionState2, this);
                        if (zy11Var != coroutineSingletons) {
                            g050Var4 = g050Var3;
                            g050Var3 = g050Var4;
                            g050Var2 = g050Var3;
                            g050Var2.d(null);
                            return zy11Var;
                        }
                        return coroutineSingletons;
                        jst.e.h("ws-taxiroute", "WebSocketRepository::connect, failed to establish connection", th);
                        r0 r0Var3 = dVar.k;
                        WebSocketRepository$ConnectionState webSocketRepository$ConnectionState3 = WebSocketRepository$ConnectionState.DISCONNECTED;
                        this.L$0 = g050Var3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 5;
                        r0Var3.emit(webSocketRepository$ConnectionState3, this);
                        if (zy11Var != coroutineSingletons) {
                            g050Var = g050Var3;
                            g050Var2 = g050Var;
                            g050Var2.d(null);
                            return zy11Var;
                        }
                        return coroutineSingletons;
                    }
                    dVar = (d) this.L$1;
                    g050Var2 = (g050) this.L$0;
                    kotlin.b.b(obj);
                    if (dVar.o == null) {
                        try {
                            if (dVar.l.a.getValue() != WebSocketRepository$ConnectionState.CONNECTED) {
                                try {
                                    dVar.c.a();
                                    r0 r0Var4 = dVar.k;
                                    WebSocketRepository$ConnectionState webSocketRepository$ConnectionState4 = WebSocketRepository$ConnectionState.CONNECTING;
                                    this.L$0 = g050Var2;
                                    this.L$1 = dVar;
                                    this.label = 2;
                                    r0Var4.emit(webSocketRepository$ConnectionState4, this);
                                    if (zy11Var != coroutineSingletons) {
                                        g050Var3 = g050Var2;
                                        a = d.a(dVar);
                                        this.L$0 = g050Var3;
                                        this.L$1 = dVar;
                                        this.L$2 = a;
                                        this.label = 3;
                                        b = d.b(dVar, this);
                                        if (b != coroutineSingletons) {
                                        }
                                    }
                                } catch (CancellationException e2) {
                                    throw e2;
                                } catch (Throwable th7) {
                                    th = th7;
                                    g050Var3 = g050Var2;
                                }
                                return coroutineSingletons;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    jst.e.getClass();
                    g050Var2.d(null);
                    return zy11Var;
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Throwable th10) {
                th = th10;
                g050Var = 2;
            }
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
