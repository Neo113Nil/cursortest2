package com.yandex.go.xiva.data;

import defpackage.cmt;
import defpackage.cne0;
import defpackage.fn21;
import defpackage.ge51;
import defpackage.hst;
import defpackage.i3y;
import defpackage.jst;
import defpackage.le51;
import defpackage.nq20;
import defpackage.ny61;
import defpackage.oay0;
import defpackage.on2;
import defpackage.ud51;
import defpackage.vd51;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class a {
    public final on2 a;
    public final nq20 b;
    public final fn21 c;
    public final ge51 d;
    public final i3y e = kotlin.a.a(new oay0(22, this));

    public a(on2 on2Var, nq20 nq20Var, fn21 fn21Var, ge51 ge51Var) {
        this.a = on2Var;
        this.b = nq20Var;
        this.c = fn21Var;
        this.d = ge51Var;
    }

    public final vd51 a() {
        String a = this.b.a();
        if (a == null) {
            hst hstVar = jst.e;
            hstVar.getClass();
            hstVar.d("Xiva", "Can't create a XivaConfig. Xiva proxy is not configured. Please add Xiva proxy to your flavor's MOB config 'Default (CI) configurations'");
            return null;
        }
        h hVar = (h) this.d;
        String l = ((cne0) hVar.b).l("client_notify_service", null);
        if (l == null) {
            l = "go";
        }
        String l2 = ((cne0) hVar.b).l("xiva_service", null);
        if (l2 == null) {
            l2 = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
        }
        return new vd51(a, l, l2, new le51(Collections.singletonList("voip")));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        XivaRepository$getCredentials$1 xivaRepository$getCredentials$1;
        int i;
        String str;
        try {
            if (continuationImpl instanceof XivaRepository$getCredentials$1) {
                xivaRepository$getCredentials$1 = (XivaRepository$getCredentials$1) continuationImpl;
                int i2 = xivaRepository$getCredentials$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xivaRepository$getCredentials$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = xivaRepository$getCredentials$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = xivaRepository$getCredentials$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        vd51 a = a();
                        if (a == null) {
                            return null;
                        }
                        String Hg = ((h) this.c).Hg();
                        if (Hg == null) {
                            jst.e.d("Xiva", "User id is null");
                            return null;
                        }
                        cmt<XivaTokenResult> a2 = ((XivaApi) this.e.getValue()).a(new XivaTokenRequest(a.a(), new XivaTokenClient(Hg)));
                        xivaRepository$getCredentials$1.L$0 = null;
                        xivaRepository$getCredentials$1.L$1 = Hg;
                        xivaRepository$getCredentials$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(a2, xivaRepository$getCredentials$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str = Hg;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) xivaRepository$getCredentials$1.L$1;
                        kotlin.b.b(obj);
                    }
                    return new ud51(str, UUID.randomUUID().toString(), ((XivaTokenResult) obj).getA());
                }
            }
            if (i != 0) {
            }
            return new ud51(str, UUID.randomUUID().toString(), ((XivaTokenResult) obj).getA());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.h("Xiva", "Failed to fetch xiva token", th);
            return null;
        }
        xivaRepository$getCredentials$1 = new XivaRepository$getCredentials$1(this, continuationImpl);
        Object obj2 = xivaRepository$getCredentials$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xivaRepository$getCredentials$1.label;
    }
}
