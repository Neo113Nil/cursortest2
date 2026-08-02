package com.apollographql.apollo3.network.ws;

import defpackage.dxf0;
import defpackage.foe;
import defpackage.gly0;
import defpackage.hc51;
import defpackage.l80;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.os50;
import defpackage.pq6;
import defpackage.qi9;
import defpackage.rnh;
import defpackage.rq6;
import defpackage.to2;
import defpackage.uga1;
import defpackage.uza;
import defpackage.ydi0;
import defpackage.yp6;
import defpackage.zj41;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;

/* loaded from: classes10.dex */
public abstract class f {
    public final rnh a;
    public final dxf0 b;

    public f(rnh rnhVar, dxf0 dxf0Var) {
        this.a = rnhVar;
        this.b = dxf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0048 -> B:12:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(f fVar, ContinuationImpl continuationImpl) {
        WsProtocol$run$1 wsProtocol$run$1;
        int i;
        if (continuationImpl instanceof WsProtocol$run$1) {
            wsProtocol$run$1 = (WsProtocol$run$1) continuationImpl;
            int i2 = wsProtocol$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wsProtocol$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = wsProtocol$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wsProtocol$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wsProtocol$run$1.L$0 = fVar;
                    wsProtocol$run$1.L$1 = fVar;
                    wsProtocol$run$1.label = 1;
                    obj = fVar.c(wsProtocol$run$1);
                    if (obj == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = (f) wsProtocol$run$1.L$1;
                    f fVar2 = (f) wsProtocol$run$1.L$0;
                    try {
                        try {
                            kotlin.b.b(obj);
                            try {
                                fVar.b((Map) obj);
                                wsProtocol$run$1.L$0 = fVar;
                                wsProtocol$run$1.L$1 = fVar;
                                wsProtocol$run$1.label = 1;
                                obj = fVar.c(wsProtocol$run$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                fVar2 = fVar;
                                fVar.b((Map) obj);
                                fVar = fVar2;
                                wsProtocol$run$1.L$0 = fVar;
                                wsProtocol$run$1.L$1 = fVar;
                                wsProtocol$run$1.label = 1;
                                obj = fVar.c(wsProtocol$run$1);
                                if (obj == coroutineSingletons) {
                                }
                            } catch (Exception e) {
                                fVar2 = fVar;
                                e = e;
                                ((e) fVar2.b.a).f.d(new os50(e));
                                return zy11.a;
                            }
                            fVar = fVar2;
                        } catch (Exception e2) {
                            e = e2;
                            ((e) fVar2.b.a).f.d(new os50(e));
                            return zy11.a;
                        }
                    } catch (CancellationException e3) {
                        throw e3;
                    }
                }
            }
        }
        wsProtocol$run$1 = new WsProtocol$run$1(fVar, continuationImpl);
        Object obj2 = wsProtocol$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wsProtocol$run$1.label;
        if (i != 0) {
        }
    }

    public final void a() {
        ((ydi0) this.a.b).c(1000, null);
    }

    public abstract void b(Map map);

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: Exception -> 0x006e, TRY_LEAVE, TryCatch #0 {Exception -> 0x006e, blocks: (B:12:0x0052, B:14:0x006b), top: B:11:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004c -> B:10:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        WsProtocol$receiveMessageMap$1 wsProtocol$receiveMessageMap$1;
        int i;
        Map map;
        if (continuationImpl instanceof WsProtocol$receiveMessageMap$1) {
            wsProtocol$receiveMessageMap$1 = (WsProtocol$receiveMessageMap$1) continuationImpl;
            int i2 = wsProtocol$receiveMessageMap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wsProtocol$receiveMessageMap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = wsProtocol$receiveMessageMap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wsProtocol$receiveMessageMap$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rnh rnhVar = this.a;
                    wsProtocol$receiveMessageMap$1.L$0 = this;
                    wsProtocol$receiveMessageMap$1.L$1 = this;
                    wsProtocol$receiveMessageMap$1.label = 1;
                    obj = kotlinx.coroutines.channels.a.J(rnhVar.a.a, wsProtocol$receiveMessageMap$1);
                    if (obj != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (f) wsProtocol$receiveMessageMap$1.L$1;
                    f fVar = (f) wsProtocol$receiveMessageMap$1.L$0;
                    kotlin.b.b(obj);
                    String str = (String) obj;
                    this.getClass();
                    foe foeVar = l80.a;
                    yp6 yp6Var = new yp6();
                    yp6Var.x0(str);
                    rq6 rq6Var = new rq6(yp6Var);
                    gly0 gly0Var = com.apollographql.apollo3.api.c.d;
                    Object y = ooc.y(rq6Var);
                    if (y instanceof Map) {
                        map = (Map) y;
                        if (map == null) {
                            return map;
                        }
                        this = fVar;
                        rnh rnhVar2 = this.a;
                        wsProtocol$receiveMessageMap$1.L$0 = this;
                        wsProtocol$receiveMessageMap$1.L$1 = this;
                        wsProtocol$receiveMessageMap$1.label = 1;
                        obj = kotlinx.coroutines.channels.a.J(rnhVar2.a.a, wsProtocol$receiveMessageMap$1);
                        if (obj != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        fVar = this;
                        String str2 = (String) obj;
                        this.getClass();
                        foe foeVar2 = l80.a;
                        yp6 yp6Var2 = new yp6();
                        yp6Var2.x0(str2);
                        rq6 rq6Var2 = new rq6(yp6Var2);
                        gly0 gly0Var2 = com.apollographql.apollo3.api.c.d;
                        Object y2 = ooc.y(rq6Var2);
                        if (y2 instanceof Map) {
                        }
                    }
                    map = null;
                    if (map == null) {
                    }
                }
            }
        }
        wsProtocol$receiveMessageMap$1 = new WsProtocol$receiveMessageMap$1(this, continuationImpl);
        Object obj2 = wsProtocol$receiveMessageMap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wsProtocol$receiveMessageMap$1.label;
        if (i != 0) {
        }
    }

    public final void e(Map map, WsFrameType wsFrameType) {
        rnh rnhVar = this.a;
        qi9 qi9Var = rnhVar.a;
        zj41 zj41Var = rnhVar.b;
        int i = hc51.a[wsFrameType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            yp6 yp6Var = new yp6();
            uga1.f(new pq6(yp6Var), map);
            if (((ydi0) zj41Var).h(2, yp6Var.l0(yp6Var.b))) {
                return;
            }
            qi9Var.l(null);
            return;
        }
        yp6 yp6Var2 = new yp6();
        uga1.f(new pq6(yp6Var2), map);
        String I0 = yp6Var2.I0();
        ydi0 ydi0Var = (ydi0) zj41Var;
        ydi0Var.getClass();
        ByteString byteString = new ByteString(I0.getBytes(uza.a));
        byteString.b = I0;
        if (ydi0Var.h(1, byteString)) {
            return;
        }
        qi9Var.l(null);
    }

    public abstract void f(to2 to2Var);

    public abstract void g(to2 to2Var);
}
