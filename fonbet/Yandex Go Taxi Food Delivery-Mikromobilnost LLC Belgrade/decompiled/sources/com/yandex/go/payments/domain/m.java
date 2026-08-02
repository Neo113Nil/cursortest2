package com.yandex.go.payments.domain;

import com.yandex.go.payments.data.PaymentsApi;
import com.yandex.go.payments.data.model.PaymentMethodsBankIcons;
import defpackage.ayz;
import defpackage.cmt;
import defpackage.dai0;
import defpackage.dyz;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.ptw;
import defpackage.x6v;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class m {
    public final PaymentsApi a;
    public final dyz b;
    public final ayz c;

    public m(PaymentsApi paymentsApi, dyz dyzVar, ayz ayzVar) {
        this.a = paymentsApi;
        this.b = dyzVar;
        this.c = ayzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        LpmBankIconInteractor$processUrl$1 lpmBankIconInteractor$processUrl$1;
        int i;
        String str2;
        String str3;
        Map map;
        if (continuationImpl instanceof LpmBankIconInteractor$processUrl$1) {
            lpmBankIconInteractor$processUrl$1 = (LpmBankIconInteractor$processUrl$1) continuationImpl;
            int i2 = lpmBankIconInteractor$processUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lpmBankIconInteractor$processUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lpmBankIconInteractor$processUrl$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lpmBankIconInteractor$processUrl$1.label;
                ayz ayzVar = this.c;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null || evu0.J(str)) {
                        BankModel.Companion.getClass();
                        ayzVar.a.l(BankModel.d);
                        return zy11Var;
                    }
                    String A = dai0.A(str);
                    if (A == null || jl40.l(((BankModel) ayzVar.a.getValue()).a, A)) {
                        return zy11Var;
                    }
                    lpmBankIconInteractor$processUrl$1.L$0 = str;
                    lpmBankIconInteractor$processUrl$1.L$1 = A;
                    lpmBankIconInteractor$processUrl$1.label = 1;
                    Object a = this.b.a(A).a(lpmBankIconInteractor$processUrl$1);
                    if (a != obj2) {
                        str2 = str;
                        str3 = A;
                        obj = a;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                str3 = (String) lpmBankIconInteractor$processUrl$1.L$1;
                str2 = (String) lpmBankIconInteractor$processUrl$1.L$0;
                kotlin.b.b(obj);
                map = (Map) obj;
                if (map.isEmpty()) {
                    ayzVar.a.l(new BankModel(str3, map));
                    return zy11Var;
                }
                lpmBankIconInteractor$processUrl$1.L$0 = null;
                lpmBankIconInteractor$processUrl$1.L$1 = null;
                lpmBankIconInteractor$processUrl$1.L$2 = null;
                lpmBankIconInteractor$processUrl$1.label = 2;
                Object b = b(str3, str2, lpmBankIconInteractor$processUrl$1);
                return b == obj2 ? obj2 : b;
            }
        }
        lpmBankIconInteractor$processUrl$1 = new LpmBankIconInteractor$processUrl$1(this, continuationImpl);
        Object obj3 = lpmBankIconInteractor$processUrl$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lpmBankIconInteractor$processUrl$1.label;
        ayz ayzVar2 = this.c;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        map = (Map) obj3;
        if (map.isEmpty()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(2:20|21))(3:26|27|(2:29|24))|22|(4:25|13|14|15)|24))|33|6|7|(0)(0)|22|(0)|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        throw r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        LpmBankIconInteractor$requestAndSaveBanksIcons$1 lpmBankIconInteractor$requestAndSaveBanksIcons$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Map map;
        dyz dyzVar;
        BankModel bankModel;
        if (continuationImpl instanceof LpmBankIconInteractor$requestAndSaveBanksIcons$1) {
            lpmBankIconInteractor$requestAndSaveBanksIcons$1 = (LpmBankIconInteractor$requestAndSaveBanksIcons$1) continuationImpl;
            int i2 = lpmBankIconInteractor$requestAndSaveBanksIcons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lpmBankIconInteractor$requestAndSaveBanksIcons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lpmBankIconInteractor$requestAndSaveBanksIcons$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lpmBankIconInteractor$requestAndSaveBanksIcons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<Map<String, PaymentMethodsBankIcons>> a = this.a.a(str2, x6v.a);
                    ptw ptwVar = new ptw(26, this);
                    lpmBankIconInteractor$requestAndSaveBanksIcons$1.L$0 = str;
                    lpmBankIconInteractor$requestAndSaveBanksIcons$1.L$1 = null;
                    lpmBankIconInteractor$requestAndSaveBanksIcons$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, ptwVar, lpmBankIconInteractor$requestAndSaveBanksIcons$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bankModel = (BankModel) lpmBankIconInteractor$requestAndSaveBanksIcons$1.L$3;
                        kotlin.b.b(obj);
                        this.c.a.l(bankModel);
                        return zy11.a;
                    }
                    str = (String) lpmBankIconInteractor$requestAndSaveBanksIcons$1.L$0;
                    kotlin.b.b(obj);
                }
                map = (Map) obj;
                BankModel bankModel2 = new BankModel(str, map);
                dyzVar = this.b;
                lpmBankIconInteractor$requestAndSaveBanksIcons$1.L$0 = null;
                lpmBankIconInteractor$requestAndSaveBanksIcons$1.L$1 = null;
                lpmBankIconInteractor$requestAndSaveBanksIcons$1.L$2 = null;
                lpmBankIconInteractor$requestAndSaveBanksIcons$1.L$3 = bankModel2;
                lpmBankIconInteractor$requestAndSaveBanksIcons$1.label = 2;
                if (dyzVar.a(str).d(map, lpmBankIconInteractor$requestAndSaveBanksIcons$1) != coroutineSingletons) {
                    bankModel = bankModel2;
                    this.c.a.l(bankModel);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        lpmBankIconInteractor$requestAndSaveBanksIcons$1 = new LpmBankIconInteractor$requestAndSaveBanksIcons$1(this, continuationImpl);
        Object obj2 = lpmBankIconInteractor$requestAndSaveBanksIcons$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lpmBankIconInteractor$requestAndSaveBanksIcons$1.label;
        if (i != 0) {
        }
        map = (Map) obj2;
        BankModel bankModel22 = new BankModel(str, map);
        dyzVar = this.b;
        lpmBankIconInteractor$requestAndSaveBanksIcons$1.L$0 = null;
        lpmBankIconInteractor$requestAndSaveBanksIcons$1.L$1 = null;
        lpmBankIconInteractor$requestAndSaveBanksIcons$1.L$2 = null;
        lpmBankIconInteractor$requestAndSaveBanksIcons$1.L$3 = bankModel22;
        lpmBankIconInteractor$requestAndSaveBanksIcons$1.label = 2;
        if (dyzVar.a(str).d(map, lpmBankIconInteractor$requestAndSaveBanksIcons$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
