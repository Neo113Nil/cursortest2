package com.yandex.go.chargers.debt.domain;

import com.yandex.go.chargers.analytics.ChargersError;
import com.yandex.go.chargers.debt.data.ChargersDebtApi;
import com.yandex.go.chargers.debt.data.model.ChargersDebtStatusParams;
import com.yandex.go.chargers.debt.data.model.ChargersDebtStatusResponse;
import com.yandex.go.chargers.error.api.ChargersErrorDetailsDto;
import defpackage.bq9;
import defpackage.cmt;
import defpackage.cy9;
import defpackage.fmt;
import defpackage.hbp0;
import defpackage.ney;
import defpackage.ny61;
import defpackage.rp9;
import defpackage.sp9;
import defpackage.tt2;
import defpackage.u2a;
import defpackage.up9;
import defpackage.vb3;
import defpackage.vp9;
import defpackage.vya;
import defpackage.wwg;
import defpackage.yp9;
import defpackage.yx9;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c implements u2a {
    public final ChargersDebtApi a;
    public final ney b;
    public final bq9 c;
    public final com.yandex.go.chargers.error.data.a d;
    public final vp9 e;
    public final vya f;
    public final hbp0 g;
    public final vb3 h = new vb3(4, this);

    public c(tt2 tt2Var, ChargersDebtApi chargersDebtApi, ney neyVar, bq9 bq9Var, com.yandex.go.chargers.error.data.a aVar, vp9 vp9Var, vya vyaVar) {
        this.a = chargersDebtApi;
        this.b = neyVar;
        this.c = bq9Var;
        this.d = aVar;
        this.e = vp9Var;
        this.f = vyaVar;
        this.g = new hbp0(new ChargersDebtPaymentStatusPollingInteractor$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, null, 6);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(1:12)(2:33|34))(2:35|36))(4:37|38|20|(4:24|(1:26)(1:30)|27|(1:29))(3:22|31|32)))(2:39|(1:41))|13|(4:15|(2:17|18)|20|(0)(0))|31|32))|45|6|7|(0)(0)|13|(0)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        r0.L$0 = r13;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        if (kotlinx.coroutines.a.i(3000, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[Catch: GoApiException -> 0x00cd, TRY_ENTER, TryCatch #0 {GoApiException -> 0x00cd, blocks: (B:15:0x0070, B:20:0x0091, B:22:0x00a5, B:24:0x00ae, B:26:0x00b6, B:27:0x00bc, B:36:0x0053, B:38:0x005b), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5 A[Catch: GoApiException -> 0x00cd, TryCatch #0 {GoApiException -> 0x00cd, blocks: (B:15:0x0070, B:20:0x0091, B:22:0x00a5, B:24:0x00ae, B:26:0x00b6, B:27:0x00bc, B:36:0x0053, B:38:0x005b), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae A[Catch: GoApiException -> 0x00cd, TryCatch #0 {GoApiException -> 0x00cd, blocks: (B:15:0x0070, B:20:0x0091, B:22:0x00a5, B:24:0x00ae, B:26:0x00b6, B:27:0x00bc, B:36:0x0053, B:38:0x005b), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ca -> B:13:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00db -> B:13:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, up9 up9Var, ContinuationImpl continuationImpl) {
        ChargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1 chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1;
        int i;
        fmt fmtVar;
        cVar.getClass();
        if (continuationImpl instanceof ChargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1) {
            chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1 = (ChargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1) continuationImpl;
            int i2 = chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(up9Var instanceof rp9)) {
                        return zy11Var;
                    }
                } else if (i == 1) {
                    up9Var = (up9) chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.L$0;
                    kotlin.b.b(obj);
                    fmtVar = (fmt) obj;
                    if (cVar.c((ChargersDebtStatusResponse) fmtVar.a, fmtVar.e.a("X-YaTraceId"))) {
                        cVar.f.a.g(zy11Var);
                        return zy11Var;
                    }
                    Long l = wwg.l(fmtVar).b;
                    long longValue = l != null ? l.longValue() : 3000L;
                    chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.L$0 = up9Var;
                    chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.L$1 = null;
                    chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.L$2 = null;
                    chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.L$3 = null;
                    chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.label = 2;
                    if (kotlinx.coroutines.a.i(longValue, chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i == 2) {
                    up9Var = (up9) chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    up9Var = (up9) chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.L$0;
                    kotlin.b.b(obj);
                }
                if (kotlinx.coroutines.a.p(chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.get_context())) {
                    cmt<ChargersDebtStatusResponse> b = cVar.a.b(new ChargersDebtStatusParams(((rp9) up9Var).a));
                    chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.L$0 = up9Var;
                    chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.L$1 = null;
                    chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.L$2 = null;
                    chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.L$3 = null;
                    chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(b, null, chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fmtVar = (fmt) obj;
                    if (cVar.c((ChargersDebtStatusResponse) fmtVar.a, fmtVar.e.a("X-YaTraceId"))) {
                    }
                }
                return zy11Var;
            }
        }
        chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1 = new ChargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1(cVar, continuationImpl);
        Object obj2 = chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (kotlinx.coroutines.a.p(chargersDebtPaymentStatusPollingInteractor$pollDebtPaymentStatus$1.get_context())) {
        }
        return zy11Var2;
    }

    @Override // defpackage.u2a
    public final void a() {
        ney neyVar = this.b;
        vb3 vb3Var = this.h;
        neyVar.b(vb3Var, vb3Var);
    }

    public final boolean c(ChargersDebtStatusResponse chargersDebtStatusResponse, String str) {
        ChargersDebtStatusResponse.Status status = chargersDebtStatusResponse.a;
        int i = status == null ? -1 : yp9.a[status.ordinal()];
        vp9 vp9Var = this.e;
        if (i == 1) {
            r0 r0Var = vp9Var.a;
            sp9 sp9Var = new sp9(null);
            r0Var.getClass();
            r0Var.m(null, sp9Var);
            return true;
        }
        if (i != 2) {
            return false;
        }
        ChargersErrorDetailsDto chargersErrorDetailsDto = chargersDebtStatusResponse.b;
        this.d.getClass();
        if (chargersErrorDetailsDto == null) {
            ChargersErrorDetailsDto.Companion.getClass();
            chargersErrorDetailsDto = com.yandex.go.chargers.error.api.a.a();
        }
        String a = chargersErrorDetailsDto.getA();
        cy9 cy9Var = new cy9(a, str, chargersErrorDetailsDto.getB(), chargersErrorDetailsDto.getC());
        yx9.a(ChargersError.Companion, ChargersError.Debt, a, 4);
        vp9Var.a(cy9Var);
        return true;
    }

    @Override // defpackage.u2a
    public final void onDetach() {
        this.b.d(this.h);
    }
}
