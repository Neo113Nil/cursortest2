package com.yandex.go.chargers.offer.plus_dvizh.ui;

import com.yandex.go.chargers.error.api.ChargersErrorCode;
import com.yandex.go.chargers.offer.domain.c;
import defpackage.avj0;
import defpackage.bvf0;
import defpackage.cy9;
import defpackage.e2e0;
import defpackage.ema;
import defpackage.fma;
import defpackage.gp9;
import defpackage.hp9;
import defpackage.ip9;
import defpackage.jl40;
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
    public final com.yandex.go.chargers.offer.plus_dvizh.domain.a b;
    public final e2e0 c;
    public final c d;
    public final r0 e = bvf0.c(oja.a);

    public a(zuj0 zuj0Var, com.yandex.go.chargers.offer.plus_dvizh.domain.a aVar, e2e0 e2e0Var, c cVar) {
        this.a = zuj0Var;
        this.b = aVar;
        this.c = e2e0Var;
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
        ChargersPlusDvizhPurchasingUiStateInteractor$createOrder$1 chargersPlusDvizhPurchasingUiStateInteractor$createOrder$1;
        int i;
        boolean z;
        if (continuationImpl instanceof ChargersPlusDvizhPurchasingUiStateInteractor$createOrder$1) {
            chargersPlusDvizhPurchasingUiStateInteractor$createOrder$1 = (ChargersPlusDvizhPurchasingUiStateInteractor$createOrder$1) continuationImpl;
            int i2 = chargersPlusDvizhPurchasingUiStateInteractor$createOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPlusDvizhPurchasingUiStateInteractor$createOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPlusDvizhPurchasingUiStateInteractor$createOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPlusDvizhPurchasingUiStateInteractor$createOrder$1.label;
                if (i != 0) {
                    b.b(obj);
                    chargersPlusDvizhPurchasingUiStateInteractor$createOrder$1.L$0 = null;
                    chargersPlusDvizhPurchasingUiStateInteractor$createOrder$1.label = 1;
                    obj = this.d.a(str, chargersPlusDvizhPurchasingUiStateInteractor$createOrder$1);
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
        chargersPlusDvizhPurchasingUiStateInteractor$createOrder$1 = new ChargersPlusDvizhPurchasingUiStateInteractor$createOrder$1(this, continuationImpl);
        Object obj2 = chargersPlusDvizhPurchasingUiStateInteractor$createOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPlusDvizhPurchasingUiStateInteractor$createOrder$1.label;
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
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if (b(r9, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f5, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        defpackage.whb1.c(null, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if ((r9 instanceof com.yandex.go.chargers.offer.passes.domain.models.ChargersNoSelectedPaymentMethodException) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        r8 = new defpackage.nja(defpackage.cy9.e);
        r5.getClass();
        r5.m(null, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        r9 = new defpackage.nja(c());
        r5.getClass();
        r5.m(null, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac A[Catch: all -> 0x0041, CancellationException -> 0x00f4, TryCatch #2 {CancellationException -> 0x00f4, all -> 0x0041, blocks: (B:13:0x003c, B:20:0x0056, B:21:0x009f, B:23:0x00ac, B:26:0x00bd, B:28:0x006d, B:29:0x008d, B:34:0x007c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd A[Catch: all -> 0x0041, CancellationException -> 0x00f4, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00f4, all -> 0x0041, blocks: (B:13:0x003c, B:20:0x0056, B:21:0x009f, B:23:0x00ac, B:26:0x00bd, B:28:0x006d, B:29:0x008d, B:34:0x007c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(kotlinx.serialization.json.b bVar, String str, String str2, ContinuationImpl continuationImpl) {
        ChargersPlusDvizhPurchasingUiStateInteractor$purchase$1 chargersPlusDvizhPurchasingUiStateInteractor$purchase$1;
        Object obj;
        int i;
        Object a;
        String str3;
        if (continuationImpl instanceof ChargersPlusDvizhPurchasingUiStateInteractor$purchase$1) {
            chargersPlusDvizhPurchasingUiStateInteractor$purchase$1 = (ChargersPlusDvizhPurchasingUiStateInteractor$purchase$1) continuationImpl;
            int i2 = chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.label;
                r0 r0Var = this.e;
                if (i != 0) {
                    b.b(obj2);
                    r0Var.getClass();
                    r0Var.m(null, oja.a);
                    com.yandex.go.chargers.offer.plus_dvizh.domain.a aVar = this.b;
                    chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$0 = null;
                    chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$1 = null;
                    chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$2 = str2;
                    chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.label = 1;
                    if (aVar.a(str, chargersPlusDvizhPurchasingUiStateInteractor$purchase$1, bVar) == obj) {
                        return obj;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj2);
                            return zy11.a;
                        }
                        str3 = (String) chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$2;
                        b.b(obj2);
                        a = ((Result) obj2).getValue();
                        b.b(a);
                        if (jl40.l((fma) a, ema.a)) {
                            nja njaVar = new nja(c());
                            r0Var.getClass();
                            r0Var.m(null, njaVar);
                        } else {
                            chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$0 = null;
                            chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$1 = null;
                            chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$2 = null;
                            chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$3 = null;
                            chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.label = 3;
                        }
                        return zy11.a;
                    }
                    str2 = (String) chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$2;
                    b.b(obj2);
                }
                e2e0 e2e0Var = this.c;
                chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$0 = null;
                chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$1 = null;
                chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$2 = str2;
                chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.label = 2;
                a = com.yandex.go.chargers.offer.plus_dvizh.data.e.a(e2e0Var, chargersPlusDvizhPurchasingUiStateInteractor$purchase$1);
                if (a != obj) {
                    return obj;
                }
                str3 = str2;
                b.b(a);
                if (jl40.l((fma) a, ema.a)) {
                }
                return zy11.a;
            }
        }
        chargersPlusDvizhPurchasingUiStateInteractor$purchase$1 = new ChargersPlusDvizhPurchasingUiStateInteractor$purchase$1(this, continuationImpl);
        Object obj22 = chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.label;
        r0 r0Var2 = this.e;
        if (i != 0) {
        }
        e2e0 e2e0Var2 = this.c;
        chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$0 = null;
        chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$1 = null;
        chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.L$2 = str2;
        chargersPlusDvizhPurchasingUiStateInteractor$purchase$1.label = 2;
        a = com.yandex.go.chargers.offer.plus_dvizh.data.e.a(e2e0Var2, chargersPlusDvizhPurchasingUiStateInteractor$purchase$1);
        if (a != obj) {
        }
    }
}
