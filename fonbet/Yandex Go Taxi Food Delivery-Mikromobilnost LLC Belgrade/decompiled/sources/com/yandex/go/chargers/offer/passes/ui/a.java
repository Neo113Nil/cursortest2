package com.yandex.go.chargers.offer.passes.ui;

import com.yandex.go.chargers.error.api.ChargersErrorCode;
import com.yandex.go.chargers.offer.domain.c;
import com.yandex.go.chargers.offer.passes.data.d;
import defpackage.avj0;
import defpackage.bvf0;
import defpackage.cy9;
import defpackage.e2e0;
import defpackage.gp9;
import defpackage.hp9;
import defpackage.ip9;
import defpackage.jia;
import defpackage.jl40;
import defpackage.kia;
import defpackage.kyh0;
import defpackage.nja;
import defpackage.ny61;
import defpackage.oja;
import defpackage.pja;
import defpackage.tpr;
import defpackage.w511;
import defpackage.yt11;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class a implements yt11 {
    public final zuj0 a;
    public final e2e0 b;
    public final com.yandex.go.chargers.offer.passes.domain.a c;
    public final c d;
    public final r0 e = bvf0.c(oja.a);

    public a(zuj0 zuj0Var, e2e0 e2e0Var, com.yandex.go.chargers.offer.passes.domain.a aVar, c cVar) {
        this.a = zuj0Var;
        this.b = e2e0Var;
        this.c = aVar;
        this.d = cVar;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return e.d(this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ChargersPassesPurchasingUiStateInteractor$createOrder$1 chargersPassesPurchasingUiStateInteractor$createOrder$1;
        int i;
        boolean z;
        if (continuationImpl instanceof ChargersPassesPurchasingUiStateInteractor$createOrder$1) {
            chargersPassesPurchasingUiStateInteractor$createOrder$1 = (ChargersPassesPurchasingUiStateInteractor$createOrder$1) continuationImpl;
            int i2 = chargersPassesPurchasingUiStateInteractor$createOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesPurchasingUiStateInteractor$createOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesPurchasingUiStateInteractor$createOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesPurchasingUiStateInteractor$createOrder$1.label;
                if (i != 0) {
                    b.b(obj);
                    chargersPassesPurchasingUiStateInteractor$createOrder$1.L$0 = null;
                    chargersPassesPurchasingUiStateInteractor$createOrder$1.label = 1;
                    obj = this.d.a(str, chargersPassesPurchasingUiStateInteractor$createOrder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                ip9 ip9Var = (ip9) obj;
                z = ip9Var instanceof gp9;
                r0 r0Var = this.e;
                if (!z) {
                    nja njaVar = new nja(((gp9) ip9Var).a);
                    r0Var.getClass();
                    r0Var.m(null, njaVar);
                } else {
                    if (!(ip9Var instanceof hp9)) {
                        w511.b();
                        return null;
                    }
                    pja pjaVar = new pja(((hp9) ip9Var).a);
                    r0Var.getClass();
                    r0Var.m(null, pjaVar);
                }
                return zy11.a;
            }
        }
        chargersPassesPurchasingUiStateInteractor$createOrder$1 = new ChargersPassesPurchasingUiStateInteractor$createOrder$1(this, continuationImpl);
        Object obj2 = chargersPassesPurchasingUiStateInteractor$createOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesPurchasingUiStateInteractor$createOrder$1.label;
        if (i != 0) {
        }
        ip9 ip9Var2 = (ip9) obj2;
        z = ip9Var2 instanceof gp9;
        r0 r0Var2 = this.e;
        if (!z) {
        }
        return zy11.a;
    }

    public final cy9 c() {
        String stringValue = ChargersErrorCode.DVIZH_PURCHASE_ON_OFFER_FAILED.getStringValue();
        ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
        int i = kyh0.chargers_error_dvizh_purchase_failed_title;
        avj0 avj0Var = (avj0) this.a;
        return new cy9(8, stringValue, null, bVar.c(avj0Var.h(i)), bVar.c(avj0Var.h(kyh0.chargers_error_dvizh_purchase_failed_subtitle)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:17|18))(6:19|20|21|(1:23)(1:26)|14|15))(2:27|28))(3:33|34|(2:36|25))|29|(2:31|25)(5:32|21|(0)(0)|14|15)))|44|6|7|(0)(0)|29|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        if (b(r10, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003d, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        defpackage.whb1.c(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
    
        if ((r10 instanceof com.yandex.go.chargers.offer.passes.domain.models.ChargersNoSelectedPaymentMethodException) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        r9 = new defpackage.nja(defpackage.cy9.e);
        r5.getClass();
        r5.m(null, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        r10 = new defpackage.nja(c());
        r5.getClass();
        r5.m(null, r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e A[Catch: all -> 0x003d, CancellationException -> 0x00e4, TryCatch #2 {CancellationException -> 0x00e4, all -> 0x003d, blocks: (B:13:0x0038, B:20:0x004e, B:21:0x0091, B:23:0x009e, B:26:0x00ad, B:28:0x0061, B:29:0x007f, B:34:0x0070), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad A[Catch: all -> 0x003d, CancellationException -> 0x00e4, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00e4, all -> 0x003d, blocks: (B:13:0x0038, B:20:0x004e, B:21:0x0091, B:23:0x009e, B:26:0x00ad, B:28:0x0061, B:29:0x007f, B:34:0x0070), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        ChargersPassesPurchasingUiStateInteractor$purchasePass$1 chargersPassesPurchasingUiStateInteractor$purchasePass$1;
        Object obj;
        int i;
        Object b;
        Object obj2;
        String str3;
        if (continuationImpl instanceof ChargersPassesPurchasingUiStateInteractor$purchasePass$1) {
            chargersPassesPurchasingUiStateInteractor$purchasePass$1 = (ChargersPassesPurchasingUiStateInteractor$purchasePass$1) continuationImpl;
            int i2 = chargersPassesPurchasingUiStateInteractor$purchasePass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesPurchasingUiStateInteractor$purchasePass$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = chargersPassesPurchasingUiStateInteractor$purchasePass$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesPurchasingUiStateInteractor$purchasePass$1.label;
                r0 r0Var = this.e;
                if (i != 0) {
                    b.b(obj3);
                    r0Var.getClass();
                    r0Var.m(null, oja.a);
                    com.yandex.go.chargers.offer.passes.domain.a aVar = this.c;
                    chargersPassesPurchasingUiStateInteractor$purchasePass$1.L$0 = null;
                    chargersPassesPurchasingUiStateInteractor$purchasePass$1.L$1 = str2;
                    chargersPassesPurchasingUiStateInteractor$purchasePass$1.label = 1;
                    if (aVar.a(str, str2, chargersPassesPurchasingUiStateInteractor$purchasePass$1) == obj) {
                        return obj;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj3);
                            return zy11.a;
                        }
                        str3 = (String) chargersPassesPurchasingUiStateInteractor$purchasePass$1.L$1;
                        b.b(obj3);
                        obj2 = ((Result) obj3).getValue();
                        b.b(obj2);
                        if (jl40.l((kia) obj2, jia.a)) {
                            nja njaVar = new nja(c());
                            r0Var.getClass();
                            r0Var.m(null, njaVar);
                        } else {
                            chargersPassesPurchasingUiStateInteractor$purchasePass$1.L$0 = null;
                            chargersPassesPurchasingUiStateInteractor$purchasePass$1.L$1 = null;
                            chargersPassesPurchasingUiStateInteractor$purchasePass$1.L$2 = null;
                            chargersPassesPurchasingUiStateInteractor$purchasePass$1.label = 3;
                        }
                        return zy11.a;
                    }
                    str2 = (String) chargersPassesPurchasingUiStateInteractor$purchasePass$1.L$1;
                    b.b(obj3);
                }
                e2e0 e2e0Var = this.b;
                chargersPassesPurchasingUiStateInteractor$purchasePass$1.L$0 = null;
                chargersPassesPurchasingUiStateInteractor$purchasePass$1.L$1 = str2;
                chargersPassesPurchasingUiStateInteractor$purchasePass$1.label = 2;
                b = d.b(e2e0Var, chargersPassesPurchasingUiStateInteractor$purchasePass$1);
                if (b != obj) {
                    return obj;
                }
                String str4 = str2;
                obj2 = b;
                str3 = str4;
                b.b(obj2);
                if (jl40.l((kia) obj2, jia.a)) {
                }
                return zy11.a;
            }
        }
        chargersPassesPurchasingUiStateInteractor$purchasePass$1 = new ChargersPassesPurchasingUiStateInteractor$purchasePass$1(this, continuationImpl);
        Object obj32 = chargersPassesPurchasingUiStateInteractor$purchasePass$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesPurchasingUiStateInteractor$purchasePass$1.label;
        r0 r0Var2 = this.e;
        if (i != 0) {
        }
        e2e0 e2e0Var2 = this.b;
        chargersPassesPurchasingUiStateInteractor$purchasePass$1.L$0 = null;
        chargersPassesPurchasingUiStateInteractor$purchasePass$1.L$1 = str2;
        chargersPassesPurchasingUiStateInteractor$purchasePass$1.label = 2;
        b = d.b(e2e0Var2, chargersPassesPurchasingUiStateInteractor$purchasePass$1);
        if (b != obj) {
        }
    }
}
