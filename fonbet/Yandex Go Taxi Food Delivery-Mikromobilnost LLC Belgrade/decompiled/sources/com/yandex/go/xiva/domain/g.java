package com.yandex.go.xiva.domain;

import com.yandex.go.xiva.domain.model.XivaConnectionState;
import defpackage.bvf0;
import defpackage.ffx;
import defpackage.ji41;
import defpackage.jst;
import defpackage.ny61;
import defpackage.qe51;
import defpackage.re51;
import defpackage.se51;
import defpackage.ud51;
import defpackage.uo91;
import defpackage.vd51;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class g {
    public final com.yandex.go.xiva.data.a a;
    public final se51 b;
    public final qe51 c;
    public final n0 d;
    public final r0 e;
    public re51 f;
    public final n0 g;
    public final r0 h;

    public g(com.yandex.go.xiva.data.a aVar, se51 se51Var, qe51 qe51Var) {
        this.a = aVar;
        this.b = se51Var;
        this.c = qe51Var;
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.d = b;
        r0 c = bvf0.c(XivaConnectionState.Disconnected);
        this.e = c;
        this.g = b;
        this.h = c;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        XivaSocketInteractor$connect$1 xivaSocketInteractor$connect$1;
        int i;
        zy11 zy11Var;
        r0 r0Var;
        vd51 vd51Var;
        ud51 ud51Var;
        com.yandex.go.xiva.data.a aVar = this.a;
        try {
            if (continuationImpl instanceof XivaSocketInteractor$connect$1) {
                xivaSocketInteractor$connect$1 = (XivaSocketInteractor$connect$1) continuationImpl;
                int i2 = xivaSocketInteractor$connect$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xivaSocketInteractor$connect$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = xivaSocketInteractor$connect$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = xivaSocketInteractor$connect$1.label;
                    zy11Var = zy11.a;
                    r0Var = this.e;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (this.f != null || !uo91.c((XivaConnectionState) this.h.getValue())) {
                            jst.e.d("Xiva", "Web socket is already connected. Please, check the connection state before calling connect");
                            return zy11Var;
                        }
                        r0Var.l(XivaConnectionState.Connecting);
                        this.b.a();
                        vd51 a = aVar.a();
                        xivaSocketInteractor$connect$1.L$0 = a;
                        xivaSocketInteractor$connect$1.label = 1;
                        Object b = aVar.b(xivaSocketInteractor$connect$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        vd51Var = a;
                        obj = b;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vd51Var = (vd51) xivaSocketInteractor$connect$1.L$0;
                        kotlin.b.b(obj);
                    }
                    ud51Var = (ud51) obj;
                    if (ud51Var != null && vd51Var != null) {
                        jst.e.getClass();
                        qe51 qe51Var = this.c;
                        re51 re51Var = new re51(qe51Var.a, new ji41(10, this), qe51Var.b);
                        re51Var.h(ud51Var, vd51Var);
                        this.f = re51Var;
                        return zy11Var;
                    }
                    jst.e.d("Xiva", "Failed to load auth credentials or config to establish connection");
                    r0Var.l(XivaConnectionState.Disconnected);
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            ud51Var = (ud51) obj;
            if (ud51Var != null) {
                jst.e.getClass();
                qe51 qe51Var2 = this.c;
                re51 re51Var2 = new re51(qe51Var2.a, new ji41(10, this), qe51Var2.b);
                re51Var2.h(ud51Var, vd51Var);
                this.f = re51Var2;
                return zy11Var;
            }
            jst.e.d("Xiva", "Failed to load auth credentials or config to establish connection");
            r0Var.l(XivaConnectionState.Disconnected);
            return zy11Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.h("Xiva", "Failed to establish connection", th);
            r0Var.l(XivaConnectionState.Disconnected);
            return zy11Var;
        }
        xivaSocketInteractor$connect$1 = new XivaSocketInteractor$connect$1(this, continuationImpl);
        Object obj2 = xivaSocketInteractor$connect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xivaSocketInteractor$connect$1.label;
        zy11Var = zy11.a;
        r0Var = this.e;
    }
}
