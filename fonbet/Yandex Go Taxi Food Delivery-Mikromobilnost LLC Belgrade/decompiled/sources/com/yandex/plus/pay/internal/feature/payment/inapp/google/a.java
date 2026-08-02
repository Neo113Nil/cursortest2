package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.internal.model.PlusPaySubmitResult;
import com.yandex.plus.pay.internal.model.PlusPaySubscriptionInfo;
import defpackage.dit;
import defpackage.g8e;
import defpackage.gci0;
import defpackage.gzu0;
import defpackage.ike;
import defpackage.iwt;
import defpackage.jqr;
import defpackage.jse;
import defpackage.mdd0;
import defpackage.nq80;
import defpackage.ny61;
import defpackage.ocd0;
import defpackage.oq80;
import defpackage.pq80;
import defpackage.qv10;
import defpackage.rcd0;
import defpackage.rol0;
import defpackage.s1v0;
import defpackage.t1v0;
import defpackage.vcd0;
import defpackage.w511;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.ycd0;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;

/* loaded from: classes2.dex */
public final class a implements vcd0 {
    public final ocd0 a;
    public final gzu0 b;
    public final t1v0 c;
    public final com.yandex.plus.pay.internal.feature.cache.a d;
    public final nq80 e;
    public final mdd0 f;
    public final Set g;
    public final ike h;
    public final gci0 i;

    public a(ocd0 ocd0Var, gzu0 gzu0Var, t1v0 t1v0Var, com.yandex.plus.pay.internal.feature.cache.a aVar, nq80 nq80Var, mdd0 mdd0Var, Set set, jse jseVar) {
        this.a = ocd0Var;
        this.b = gzu0Var;
        this.c = t1v0Var;
        this.d = aVar;
        this.e = nq80Var;
        this.f = mdd0Var;
        this.g = set;
        ike e = qv10.e(jseVar);
        this.h = e;
        k kVar = new k(new jqr(new rol0(new GoogleRestoreSession$restoreAllPurchases$1(this, null)), new GoogleRestoreSession$state$1(this, null), 3), new GoogleRestoreSession$state$2(this, null));
        xsr0.a.getClass();
        this.i = e.R(kVar, e, wsr0.c, ycd0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0122, code lost:
    
        if (r12.c(r13, r8) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ec, code lost:
    
        if (r14 != r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, rcd0 rcd0Var, ContinuationImpl continuationImpl) {
        GoogleRestoreSession$finishPurchase$1 googleRestoreSession$finishPurchase$1;
        int i;
        rcd0 rcd0Var2;
        aVar.getClass();
        if (continuationImpl instanceof GoogleRestoreSession$finishPurchase$1) {
            googleRestoreSession$finishPurchase$1 = (GoogleRestoreSession$finishPurchase$1) continuationImpl;
            int i2 = googleRestoreSession$finishPurchase$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleRestoreSession$finishPurchase$1.label = i2 - Integer.MIN_VALUE;
                GoogleRestoreSession$finishPurchase$1 googleRestoreSession$finishPurchase$12 = googleRestoreSession$finishPurchase$1;
                Object obj = googleRestoreSession$finishPurchase$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleRestoreSession$finishPurchase$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pq80 pq80Var = (pq80) aVar.e;
                    pq80Var.getClass();
                    oq80 oq80Var = new oq80();
                    dit ditVar = pq80Var.a;
                    String str = ditVar.a;
                    LinkedHashMap linkedHashMap = oq80Var.a;
                    linkedHashMap.put("clientSource", str);
                    linkedHashMap.put("clientSubSource", ditVar.b);
                    linkedHashMap.put("isPlusHome", String.valueOf(ditVar.c));
                    linkedHashMap.put("isRestoration", "true");
                    linkedHashMap.put("paymentIntegration", "PaymentSDK");
                    linkedHashMap.put("os", ConstantDeviceInfo.APP_PLATFORM);
                    String a = oq80Var.a();
                    gzu0 gzu0Var = aVar.b;
                    String uuid = UUID.randomUUID().toString();
                    Map f = kotlin.collections.b.f();
                    googleRestoreSession$finishPurchase$12.L$0 = rcd0Var;
                    googleRestoreSession$finishPurchase$12.L$1 = null;
                    googleRestoreSession$finishPurchase$12.label = 1;
                    obj = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.data.a) gzu0Var.a).a(rcd0Var, a, uuid, "", "", f, googleRestoreSession$finishPurchase$12);
                    if (obj != coroutineSingletons) {
                        rcd0Var2 = rcd0Var;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    rcd0Var2 = (rcd0) googleRestoreSession$finishPurchase$12.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    rcd0Var2 = (rcd0) googleRestoreSession$finishPurchase$12.L$0;
                    kotlin.b.b(obj);
                    switch (iwt.a[((PlusPaySubscriptionInfo) obj).getStatus().ordinal()]) {
                        case 1:
                            ocd0 ocd0Var = aVar.a;
                            googleRestoreSession$finishPurchase$12.L$0 = null;
                            googleRestoreSession$finishPurchase$12.L$1 = null;
                            googleRestoreSession$finishPurchase$12.L$2 = null;
                            googleRestoreSession$finishPurchase$12.L$3 = null;
                            googleRestoreSession$finishPurchase$12.label = 3;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            throw new PlusPayException(g8e.o("In app purchase was not completed successfully; orderId = ", rcd0Var2.a), 2);
                        default:
                            w511.b();
                            return null;
                    }
                }
                t1v0 t1v0Var = aVar.c;
                String invoiceId = ((PlusPaySubmitResult) obj).getInvoiceId();
                Set set = aVar.g;
                googleRestoreSession$finishPurchase$12.L$0 = rcd0Var2;
                googleRestoreSession$finishPurchase$12.L$1 = null;
                googleRestoreSession$finishPurchase$12.L$2 = null;
                googleRestoreSession$finishPurchase$12.label = 2;
                obj = ((com.yandex.plus.pay.internal.feature.subscription.b) t1v0Var).a(invoiceId, set, s1v0.a, googleRestoreSession$finishPurchase$12);
            }
        }
        googleRestoreSession$finishPurchase$1 = new GoogleRestoreSession$finishPurchase$1(aVar, continuationImpl);
        GoogleRestoreSession$finishPurchase$1 googleRestoreSession$finishPurchase$122 = googleRestoreSession$finishPurchase$1;
        Object obj2 = googleRestoreSession$finishPurchase$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleRestoreSession$finishPurchase$122.label;
        if (i != 0) {
        }
        t1v0 t1v0Var2 = aVar.c;
        String invoiceId2 = ((PlusPaySubmitResult) obj2).getInvoiceId();
        Set set2 = aVar.g;
        googleRestoreSession$finishPurchase$122.L$0 = rcd0Var2;
        googleRestoreSession$finishPurchase$122.L$1 = null;
        googleRestoreSession$finishPurchase$122.L$2 = null;
        googleRestoreSession$finishPurchase$122.label = 2;
        obj2 = ((com.yandex.plus.pay.internal.feature.subscription.b) t1v0Var2).a(invoiceId2, set2, s1v0.a, googleRestoreSession$finishPurchase$122);
    }

    public final gci0 b() {
        return this.i;
    }
}
