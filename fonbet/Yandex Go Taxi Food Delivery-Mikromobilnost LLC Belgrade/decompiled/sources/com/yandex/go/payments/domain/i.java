package com.yandex.go.payments.domain;

import com.yandex.go.payments.data.PaymentMethodsApi;
import com.yandex.go.payments.data.model.PaymentMethodsBankIcons;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.d8;
import defpackage.eq4;
import defpackage.evu0;
import defpackage.fga0;
import defpackage.hit;
import defpackage.jl40;
import defpackage.mth;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tpr;
import defpackage.x6v;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class i implements eq4 {
    public final fga0 a;
    public final z b;
    public final hit c;
    public final PaymentMethodsApi d;
    public pzt0 e;
    public final kotlinx.coroutines.flow.r0 f = bvf0.c(null);

    public i(fga0 fga0Var, z zVar, hit hitVar, PaymentMethodsApi paymentMethodsApi) {
        this.a = fga0Var;
        this.b = zVar;
        this.c = hitVar;
        this.d = paymentMethodsApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r11 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        if (r11 == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(i iVar, String str, Continuation continuation) {
        BanksIconsRepositoryImpl$processNewBankModelFromUrl$1 banksIconsRepositoryImpl$processNewBankModelFromUrl$1;
        int i;
        BankModel bankModel;
        kotlinx.coroutines.flow.r0 r0Var = iVar.f;
        kotlinx.coroutines.flow.r0 r0Var2 = iVar.f;
        if (continuation instanceof BanksIconsRepositoryImpl$processNewBankModelFromUrl$1) {
            banksIconsRepositoryImpl$processNewBankModelFromUrl$1 = (BanksIconsRepositoryImpl$processNewBankModelFromUrl$1) continuation;
            int i2 = banksIconsRepositoryImpl$processNewBankModelFromUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                banksIconsRepositoryImpl$processNewBankModelFromUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = banksIconsRepositoryImpl$processNewBankModelFromUrl$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = banksIconsRepositoryImpl$processNewBankModelFromUrl$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    BankModel bankModel2 = (BankModel) r0Var.getValue();
                    if (jl40.l(str, bankModel2 != null ? bankModel2.a : null)) {
                        return zy11Var;
                    }
                    banksIconsRepositoryImpl$processNewBankModelFromUrl$1.L$0 = str;
                    banksIconsRepositoryImpl$processNewBankModelFromUrl$1.label = 1;
                    obj = iVar.e(banksIconsRepositoryImpl$processNewBankModelFromUrl$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        BankModel bankModel3 = (BankModel) obj;
                        if (bankModel3 == null) {
                            r0Var2.l(null);
                            return zy11Var;
                        }
                        r0Var.getClass();
                        r0Var.m(null, bankModel3);
                        return zy11Var;
                    }
                    str = (String) banksIconsRepositoryImpl$processNewBankModelFromUrl$1.L$0;
                    kotlin.b.b(obj);
                }
                bankModel = (BankModel) obj;
                if (!jl40.l(str, bankModel.a)) {
                    r0Var.getClass();
                    r0Var.m(null, bankModel);
                    return zy11Var;
                }
                if (str == null || evu0.J(str)) {
                    r0Var2.l(null);
                    return zy11Var;
                }
                banksIconsRepositoryImpl$processNewBankModelFromUrl$1.L$0 = null;
                banksIconsRepositoryImpl$processNewBankModelFromUrl$1.L$1 = null;
                banksIconsRepositoryImpl$processNewBankModelFromUrl$1.label = 2;
                obj = iVar.f(str, banksIconsRepositoryImpl$processNewBankModelFromUrl$1);
            }
        }
        banksIconsRepositoryImpl$processNewBankModelFromUrl$1 = new BanksIconsRepositoryImpl$processNewBankModelFromUrl$1(iVar, continuation);
        Object obj3 = banksIconsRepositoryImpl$processNewBankModelFromUrl$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = banksIconsRepositoryImpl$processNewBankModelFromUrl$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        bankModel = (BankModel) obj3;
        if (!jl40.l(str, bankModel.a)) {
        }
    }

    @Override // defpackage.eq4
    public final String a(String str) {
        Map map;
        PaymentMethodsBankIcons paymentMethodsBankIcons;
        BankModel bankModel = (BankModel) this.f.getValue();
        if (bankModel == null || (map = bankModel.b) == null || (paymentMethodsBankIcons = (PaymentMethodsBankIcons) map.get(str)) == null) {
            return null;
        }
        return paymentMethodsBankIcons.a;
    }

    @Override // defpackage.eq4
    public final tpr b() {
        return new h(new mth(this.f, 4));
    }

    @Override // defpackage.eq4
    public final String c(String str) {
        Map map;
        PaymentMethodsBankIcons paymentMethodsBankIcons;
        BankModel bankModel = (BankModel) this.f.getValue();
        if (bankModel == null || (map = bankModel.b) == null || (paymentMethodsBankIcons = (PaymentMethodsBankIcons) map.get(str)) == null) {
            return null;
        }
        return paymentMethodsBankIcons.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        BanksIconsRepositoryImpl$readFromFile$1 banksIconsRepositoryImpl$readFromFile$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        String str;
        if (continuationImpl instanceof BanksIconsRepositoryImpl$readFromFile$1) {
            banksIconsRepositoryImpl$readFromFile$1 = (BanksIconsRepositoryImpl$readFromFile$1) continuationImpl;
            int i2 = banksIconsRepositoryImpl$readFromFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                banksIconsRepositoryImpl$readFromFile$1.label = i2 - Integer.MIN_VALUE;
                Object obj = banksIconsRepositoryImpl$readFromFile$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = banksIconsRepositoryImpl$readFromFile$1.label;
                z zVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    banksIconsRepositoryImpl$readFromFile$1.label = 1;
                    obj = zVar.b(banksIconsRepositoryImpl$readFromFile$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) banksIconsRepositoryImpl$readFromFile$1.L$0;
                        kotlin.b.b(obj);
                        return new BankModel(str, (Map) obj);
                    }
                    kotlin.b.b(obj);
                }
                String str2 = (String) obj;
                banksIconsRepositoryImpl$readFromFile$1.L$0 = str2;
                banksIconsRepositoryImpl$readFromFile$1.label = 2;
                a = zVar.a(banksIconsRepositoryImpl$readFromFile$1);
                if (a != coroutineSingletons) {
                    obj = a;
                    str = str2;
                    return new BankModel(str, (Map) obj);
                }
                return coroutineSingletons;
            }
        }
        banksIconsRepositoryImpl$readFromFile$1 = new BanksIconsRepositoryImpl$readFromFile$1(this, continuationImpl);
        Object obj2 = banksIconsRepositoryImpl$readFromFile$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = banksIconsRepositoryImpl$readFromFile$1.label;
        z zVar2 = this.b;
        if (i != 0) {
        }
        String str22 = (String) obj2;
        banksIconsRepositoryImpl$readFromFile$1.L$0 = str22;
        banksIconsRepositoryImpl$readFromFile$1.label = 2;
        a = zVar2.a(banksIconsRepositoryImpl$readFromFile$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, ContinuationImpl continuationImpl) {
        BanksIconsRepositoryImpl$requestAndSaveBanksIcons$1 banksIconsRepositoryImpl$requestAndSaveBanksIcons$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Map map;
        z zVar;
        Map map2;
        try {
            if (continuationImpl instanceof BanksIconsRepositoryImpl$requestAndSaveBanksIcons$1) {
                banksIconsRepositoryImpl$requestAndSaveBanksIcons$1 = (BanksIconsRepositoryImpl$requestAndSaveBanksIcons$1) continuationImpl;
                int i2 = banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<Map<String, PaymentMethodsBankIcons>> a = this.d.a(str, x6v.a);
                        d8 d8Var = new d8(6, this);
                        banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.L$0 = str;
                        banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(a, d8Var, banksIconsRepositoryImpl$requestAndSaveBanksIcons$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            map2 = (Map) banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.L$1;
                            str = (String) banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.L$0;
                            kotlin.b.b(obj);
                            return new BankModel(str, map2);
                        }
                        str = (String) banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.L$0;
                        kotlin.b.b(obj);
                    }
                    map = (Map) obj;
                    zVar = this.b;
                    banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.L$0 = str;
                    banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.L$1 = map;
                    banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.label = 2;
                    if (zVar.c(str, map, banksIconsRepositoryImpl$requestAndSaveBanksIcons$1) != coroutineSingletons) {
                        map2 = map;
                        return new BankModel(str, map2);
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            map = (Map) obj;
            zVar = this.b;
            banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.L$0 = str;
            banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.L$1 = map;
            banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.label = 2;
            if (zVar.c(str, map, banksIconsRepositoryImpl$requestAndSaveBanksIcons$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
        banksIconsRepositoryImpl$requestAndSaveBanksIcons$1 = new BanksIconsRepositoryImpl$requestAndSaveBanksIcons$1(this, continuationImpl);
        Object obj2 = banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = banksIconsRepositoryImpl$requestAndSaveBanksIcons$1.label;
    }

    @Override // defpackage.eq4
    public final void init() {
        pzt0 pzt0Var = this.e;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.e = com.yandex.go.coroutines.b.g(this.c.a, null, null, new BanksIconsRepositoryImpl$init$1(this, null), 3);
        }
    }
}
