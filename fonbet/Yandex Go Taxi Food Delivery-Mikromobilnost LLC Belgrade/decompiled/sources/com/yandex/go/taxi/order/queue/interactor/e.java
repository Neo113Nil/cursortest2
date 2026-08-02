package com.yandex.go.taxi.order.queue.interactor;

import com.yandex.go.taxi.order.queue.analytics.QueueAnalytics$Status;
import com.yandex.go.taxi.order.queue.network.QueueChangePriceRequest;
import com.yandex.go.taxi.order.queue.network.QueueChangePriceResponseErrorDto;
import defpackage.a3y0;
import defpackage.avj0;
import defpackage.fkg0;
import defpackage.gkg0;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.kyh0;
import defpackage.ljg0;
import defpackage.lr40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.on2;
import defpackage.rjg0;
import defpackage.s8o;
import defpackage.sjg0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnt;
import defpackage.xlf0;
import defpackage.xnt;
import defpackage.zuj0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.BufferedInputStream;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.SerializationException;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes14.dex */
public final class e {
    public static final /* synthetic */ int j = 0;
    public final wnt a;
    public final tt2 b;
    public final zuj0 c;
    public final ljg0 d;
    public final com.yandex.go.taxi.order.queue.repository.a e;
    public final fkg0 f;
    public final com.yandex.go.taxi.order.domain.repositories.e g;
    public final i3y h = kotlin.a.b(LazyThreadSafetyMode.NONE, new xlf0(28));
    public final i3y i;

    static {
        kgx[] kgxVarArr = com.yandex.go.taxi.order.queue.repository.a.d;
    }

    public e(on2 on2Var, wnt wntVar, tt2 tt2Var, zuj0 zuj0Var, ljg0 ljg0Var, com.yandex.go.taxi.order.queue.repository.a aVar, fkg0 fkg0Var, com.yandex.go.taxi.order.domain.repositories.e eVar) {
        this.a = wntVar;
        this.b = tt2Var;
        this.c = zuj0Var;
        this.d = ljg0Var;
        this.e = aVar;
        this.f = fkg0Var;
        this.g = eVar;
        this.i = kotlin.a.a(new lr40(on2Var, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o2y0 o2y0Var, String str, String str2, gkg0 gkg0Var, ContinuationImpl continuationImpl) {
        QueueChangePriceInteractor$changePrice$1 queueChangePriceInteractor$changePrice$1;
        int i;
        rjg0 rjg0Var;
        try {
            if (continuationImpl instanceof QueueChangePriceInteractor$changePrice$1) {
                queueChangePriceInteractor$changePrice$1 = (QueueChangePriceInteractor$changePrice$1) continuationImpl;
                int i2 = queueChangePriceInteractor$changePrice$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    queueChangePriceInteractor$changePrice$1.label = i2 - Integer.MIN_VALUE;
                    QueueChangePriceInteractor$changePrice$1 queueChangePriceInteractor$changePrice$12 = queueChangePriceInteractor$changePrice$1;
                    Object obj = queueChangePriceInteractor$changePrice$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = queueChangePriceInteractor$changePrice$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        String str3 = o2y0Var.b().a;
                        QueueChangePriceRequest queueChangePriceRequest = new QueueChangePriceRequest(str3, str2);
                        this.b.getClass();
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        QueueChangePriceInteractor$changePrice$2$1 queueChangePriceInteractor$changePrice$2$1 = new QueueChangePriceInteractor$changePrice$2$1(this, str, queueChangePriceRequest, str3, o2y0Var, gkg0Var, null);
                        queueChangePriceInteractor$changePrice$12.L$0 = null;
                        queueChangePriceInteractor$changePrice$12.L$1 = null;
                        queueChangePriceInteractor$changePrice$12.L$2 = null;
                        queueChangePriceInteractor$changePrice$12.L$3 = null;
                        queueChangePriceInteractor$changePrice$12.L$4 = null;
                        queueChangePriceInteractor$changePrice$12.L$5 = null;
                        queueChangePriceInteractor$changePrice$12.label = 1;
                        if (tje.k0(mdhVar, queueChangePriceInteractor$changePrice$2$1, queueChangePriceInteractor$changePrice$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return sjg0.a;
                }
            }
            if (i != 0) {
            }
            return sjg0.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            BufferedInputStream N = s8o.N(th);
            if (N != null) {
                try {
                    rjg0Var = new rjg0(((QueueChangePriceResponseErrorDto) ((xnt) this.a).b(N, QueueChangePriceResponseErrorDto.Companion.serializer())).a);
                } catch (SerializationException e2) {
                    ((a3y0) this.h.getValue()).b("getError", e2, new xlf0(29));
                    rjg0Var = new rjg0(((avj0) this.c).h(kyh0.error_occurred));
                    QueueAnalytics$Status queueAnalytics$Status = QueueAnalytics$Status.ERROR;
                    ljg0 ljg0Var = this.d;
                    ljg0Var.getClass();
                    ljg0Var.b("QueueOverlay.PriceUpdated", new Pair(ACSPConstants.STATUS, queueAnalytics$Status.getStatus()), new Pair(Constants.KEY_MESSAGE, rjg0Var.a));
                    return rjg0Var;
                }
                QueueAnalytics$Status queueAnalytics$Status2 = QueueAnalytics$Status.ERROR;
                ljg0 ljg0Var2 = this.d;
                ljg0Var2.getClass();
                ljg0Var2.b("QueueOverlay.PriceUpdated", new Pair(ACSPConstants.STATUS, queueAnalytics$Status2.getStatus()), new Pair(Constants.KEY_MESSAGE, rjg0Var.a));
                return rjg0Var;
            }
            rjg0Var = new rjg0(((avj0) this.c).h(kyh0.error_occurred));
            QueueAnalytics$Status queueAnalytics$Status22 = QueueAnalytics$Status.ERROR;
            ljg0 ljg0Var22 = this.d;
            ljg0Var22.getClass();
            ljg0Var22.b("QueueOverlay.PriceUpdated", new Pair(ACSPConstants.STATUS, queueAnalytics$Status22.getStatus()), new Pair(Constants.KEY_MESSAGE, rjg0Var.a));
            return rjg0Var;
        }
        queueChangePriceInteractor$changePrice$1 = new QueueChangePriceInteractor$changePrice$1(this, continuationImpl);
        QueueChangePriceInteractor$changePrice$1 queueChangePriceInteractor$changePrice$122 = queueChangePriceInteractor$changePrice$1;
        Object obj2 = queueChangePriceInteractor$changePrice$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = queueChangePriceInteractor$changePrice$122.label;
    }
}
