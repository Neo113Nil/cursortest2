package com.yandex.go.taxi.order.network;

import android.os.SystemClock;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.response.OrderCommitResponse;
import com.yandex.go.taxi.order.network.exception.ErrorDuringCommitButOrderCreatedException;
import com.yandex.go.zone.model.Zone;
import defpackage.a3y0;
import defpackage.h3y;
import defpackage.hst;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mpx0;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v0y0;
import defpackage.y3y0;
import defpackage.zxs0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes14.dex */
public final class e {
    public final tse a;
    public final tt2 b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final a3y0 g = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "OrderEagerProvisioningInteractor");
    public final Object h = new Object();
    public zxs0 i;

    public e(tse tseVar, tt2 tt2Var, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
        this.f = h3yVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Preorder preorder, String str, ContinuationImpl continuationImpl) {
        TaxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1 taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1;
        int i;
        try {
            if (continuationImpl instanceof TaxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1) {
                taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1 = (TaxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1) continuationImpl;
                int i2 = taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str2 = preorder.O.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = preorder.b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        v0y0 v0y0Var = new v0y0(str, str2, str3);
                        synchronized (this.h) {
                            zxs0 zxs0Var = this.i;
                            if (zxs0Var == null) {
                                return null;
                            }
                            if (!((v0y0) zxs0Var.a).equals(v0y0Var)) {
                                this.g.getClass();
                                a3y0.h(new String[]{"awaitProcessing"});
                                hst hstVar = jst.e;
                                zxs0 zxs0Var2 = this.i;
                                if (zxs0Var2 != null) {
                                    ((qoh) zxs0Var2.b).a(null);
                                }
                                this.i = null;
                                return null;
                            }
                            this.i = null;
                            qoh qohVar = (qoh) zxs0Var.b;
                            taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1.L$0 = null;
                            taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1.L$1 = null;
                            taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1.L$2 = null;
                            taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1.L$3 = null;
                            taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1.J$0 = elapsedRealtime;
                            taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1.label = 1;
                            obj = qohVar.s(taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    OrderCommitResponse orderCommitResponse = (OrderCommitResponse) obj;
                    SystemClock.elapsedRealtime();
                    this.g.getClass();
                    a3y0.h(new String[]{"awaitProcessing"});
                    hst hstVar2 = jst.e;
                    return orderCommitResponse;
                }
            }
            if (i != 0) {
            }
            OrderCommitResponse orderCommitResponse2 = (OrderCommitResponse) obj;
            SystemClock.elapsedRealtime();
            this.g.getClass();
            a3y0.h(new String[]{"awaitProcessing"});
            hst hstVar22 = jst.e;
            return orderCommitResponse2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (th instanceof ErrorDuringCommitButOrderCreatedException) {
                throw th;
            }
            this.g.b("awaitProcessing", th, new mpx0(17));
            return null;
        }
        taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1 = new TaxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1(this, continuationImpl);
        Object obj2 = taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderEagerProvisioningInteractorImpl$awaitProcessing$1.label;
    }

    public final void b(Preorder preorder) {
        if (((com.yandex.go.taxi.order.perf.experiment.d) ((y3y0) this.d.get())).b().k) {
            ZoneAddress zoneAddress = preorder.G.a;
            Zone zone = zoneAddress != null ? zoneAddress.b : null;
            String str = zone != null ? zone.a : null;
            String str2 = preorder.O.a;
            String str3 = preorder.b;
            if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0 || preorder.I != null || preorder.h().a() == PaymentMethod$Type.GOOGLE_PAY) {
                return;
            }
            v0y0 v0y0Var = new v0y0(str, str2, str3);
            synchronized (this.h) {
                zxs0 zxs0Var = this.i;
                if (jl40.l(zxs0Var != null ? (v0y0) zxs0Var.a : null, v0y0Var)) {
                    return;
                }
                tse tseVar = this.a;
                this.b.getClass();
                sjh sjhVar = uyj.a;
                qoh h = tje.h(tseVar, mdh.b, null, new TaxiOrderEagerProvisioningInteractorImpl$startProcessing$1$deferred$1(this, preorder, str, null), 2);
                zxs0 zxs0Var2 = this.i;
                if (zxs0Var2 != null) {
                    ((qoh) zxs0Var2.b).a(null);
                }
                this.i = new zxs0(v0y0Var, h);
                this.g.getClass();
                a3y0.h(new String[]{"startProcessing"});
                hst hstVar = jst.e;
            }
        }
    }
}
