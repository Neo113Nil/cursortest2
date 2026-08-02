package com.yandex.go.scooters.debt.data;

import com.yandex.go.scooters.data.ScootersPaymentApi;
import defpackage.cmt;
import defpackage.ja0;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final ScootersPaymentApi a;
    public final ru.yandex.taxi.scooters.data.a b;

    public a(ScootersPaymentApi scootersPaymentApi, ru.yandex.taxi.scooters.data.a aVar) {
        this.a = scootersPaymentApi;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r12, null, r0) != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersDebtRepaymentRepository$addCorpPaymentId$1 scootersDebtRepaymentRepository$addCorpPaymentId$1;
        int i;
        ScootersPaymentApi scootersPaymentApi;
        if (continuationImpl instanceof ScootersDebtRepaymentRepository$addCorpPaymentId$1) {
            scootersDebtRepaymentRepository$addCorpPaymentId$1 = (ScootersDebtRepaymentRepository$addCorpPaymentId$1) continuationImpl;
            int i2 = scootersDebtRepaymentRepository$addCorpPaymentId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDebtRepaymentRepository$addCorpPaymentId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDebtRepaymentRepository$addCorpPaymentId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDebtRepaymentRepository$addCorpPaymentId$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersDebtRepaymentRepository$addCorpPaymentId$1.L$0 = str;
                    ScootersPaymentApi scootersPaymentApi2 = this.a;
                    scootersDebtRepaymentRepository$addCorpPaymentId$1.L$1 = scootersPaymentApi2;
                    scootersDebtRepaymentRepository$addCorpPaymentId$1.label = 1;
                    Object a = this.b.a(false, scootersDebtRepaymentRepository$addCorpPaymentId$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersPaymentApi = scootersPaymentApi2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11.a;
                }
                scootersPaymentApi = (ScootersPaymentApi) scootersDebtRepaymentRepository$addCorpPaymentId$1.L$1;
                str = (String) scootersDebtRepaymentRepository$addCorpPaymentId$1.L$0;
                b.b(obj);
                cmt<zy11> a2 = scootersPaymentApi.a((Map) obj, new ja0((String) null, (String) null, str, (String) null, 11));
                scootersDebtRepaymentRepository$addCorpPaymentId$1.L$0 = null;
                scootersDebtRepaymentRepository$addCorpPaymentId$1.L$1 = null;
                scootersDebtRepaymentRepository$addCorpPaymentId$1.label = 2;
            }
        }
        scootersDebtRepaymentRepository$addCorpPaymentId$1 = new ScootersDebtRepaymentRepository$addCorpPaymentId$1(this, continuationImpl);
        Object obj2 = scootersDebtRepaymentRepository$addCorpPaymentId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDebtRepaymentRepository$addCorpPaymentId$1.label;
        if (i != 0) {
        }
        cmt<zy11> a22 = scootersPaymentApi.a((Map) obj2, new ja0((String) null, (String) null, str, (String) null, 11));
        scootersDebtRepaymentRepository$addCorpPaymentId$1.L$0 = null;
        scootersDebtRepaymentRepository$addCorpPaymentId$1.L$1 = null;
        scootersDebtRepaymentRepository$addCorpPaymentId$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r12, null, r0) != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ScootersDebtRepaymentRepository$addMobilePaymentId$1 scootersDebtRepaymentRepository$addMobilePaymentId$1;
        int i;
        ScootersPaymentApi scootersPaymentApi;
        if (continuationImpl instanceof ScootersDebtRepaymentRepository$addMobilePaymentId$1) {
            scootersDebtRepaymentRepository$addMobilePaymentId$1 = (ScootersDebtRepaymentRepository$addMobilePaymentId$1) continuationImpl;
            int i2 = scootersDebtRepaymentRepository$addMobilePaymentId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDebtRepaymentRepository$addMobilePaymentId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDebtRepaymentRepository$addMobilePaymentId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDebtRepaymentRepository$addMobilePaymentId$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersDebtRepaymentRepository$addMobilePaymentId$1.L$0 = str;
                    ScootersPaymentApi scootersPaymentApi2 = this.a;
                    scootersDebtRepaymentRepository$addMobilePaymentId$1.L$1 = scootersPaymentApi2;
                    scootersDebtRepaymentRepository$addMobilePaymentId$1.label = 1;
                    Object a = this.b.a(false, scootersDebtRepaymentRepository$addMobilePaymentId$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersPaymentApi = scootersPaymentApi2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11.a;
                }
                scootersPaymentApi = (ScootersPaymentApi) scootersDebtRepaymentRepository$addMobilePaymentId$1.L$1;
                str = (String) scootersDebtRepaymentRepository$addMobilePaymentId$1.L$0;
                b.b(obj);
                cmt<zy11> a2 = scootersPaymentApi.a((Map) obj, new ja0((String) null, str, (String) null, (String) null, 13));
                scootersDebtRepaymentRepository$addMobilePaymentId$1.L$0 = null;
                scootersDebtRepaymentRepository$addMobilePaymentId$1.L$1 = null;
                scootersDebtRepaymentRepository$addMobilePaymentId$1.label = 2;
            }
        }
        scootersDebtRepaymentRepository$addMobilePaymentId$1 = new ScootersDebtRepaymentRepository$addMobilePaymentId$1(this, continuationImpl);
        Object obj2 = scootersDebtRepaymentRepository$addMobilePaymentId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDebtRepaymentRepository$addMobilePaymentId$1.label;
        if (i != 0) {
        }
        cmt<zy11> a22 = scootersPaymentApi.a((Map) obj2, new ja0((String) null, str, (String) null, (String) null, 13));
        scootersDebtRepaymentRepository$addMobilePaymentId$1.L$0 = null;
        scootersDebtRepaymentRepository$addMobilePaymentId$1.L$1 = null;
        scootersDebtRepaymentRepository$addMobilePaymentId$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r12, null, r0) != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ScootersDebtRepaymentRepository$addNequiTokenId$1 scootersDebtRepaymentRepository$addNequiTokenId$1;
        int i;
        ScootersPaymentApi scootersPaymentApi;
        if (continuationImpl instanceof ScootersDebtRepaymentRepository$addNequiTokenId$1) {
            scootersDebtRepaymentRepository$addNequiTokenId$1 = (ScootersDebtRepaymentRepository$addNequiTokenId$1) continuationImpl;
            int i2 = scootersDebtRepaymentRepository$addNequiTokenId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDebtRepaymentRepository$addNequiTokenId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDebtRepaymentRepository$addNequiTokenId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDebtRepaymentRepository$addNequiTokenId$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersDebtRepaymentRepository$addNequiTokenId$1.L$0 = str;
                    ScootersPaymentApi scootersPaymentApi2 = this.a;
                    scootersDebtRepaymentRepository$addNequiTokenId$1.L$1 = scootersPaymentApi2;
                    scootersDebtRepaymentRepository$addNequiTokenId$1.label = 1;
                    Object a = this.b.a(false, scootersDebtRepaymentRepository$addNequiTokenId$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersPaymentApi = scootersPaymentApi2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11.a;
                }
                scootersPaymentApi = (ScootersPaymentApi) scootersDebtRepaymentRepository$addNequiTokenId$1.L$1;
                str = (String) scootersDebtRepaymentRepository$addNequiTokenId$1.L$0;
                b.b(obj);
                cmt<zy11> a2 = scootersPaymentApi.a((Map) obj, new ja0((String) null, (String) null, (String) null, str, 7));
                scootersDebtRepaymentRepository$addNequiTokenId$1.L$0 = null;
                scootersDebtRepaymentRepository$addNequiTokenId$1.L$1 = null;
                scootersDebtRepaymentRepository$addNequiTokenId$1.label = 2;
            }
        }
        scootersDebtRepaymentRepository$addNequiTokenId$1 = new ScootersDebtRepaymentRepository$addNequiTokenId$1(this, continuationImpl);
        Object obj2 = scootersDebtRepaymentRepository$addNequiTokenId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDebtRepaymentRepository$addNequiTokenId$1.label;
        if (i != 0) {
        }
        cmt<zy11> a22 = scootersPaymentApi.a((Map) obj2, new ja0((String) null, (String) null, (String) null, str, 7));
        scootersDebtRepaymentRepository$addNequiTokenId$1.L$0 = null;
        scootersDebtRepaymentRepository$addNequiTokenId$1.L$1 = null;
        scootersDebtRepaymentRepository$addNequiTokenId$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r12, null, r0) != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        ScootersDebtRepaymentRepository$addPaymentId$1 scootersDebtRepaymentRepository$addPaymentId$1;
        int i;
        ScootersPaymentApi scootersPaymentApi;
        if (continuationImpl instanceof ScootersDebtRepaymentRepository$addPaymentId$1) {
            scootersDebtRepaymentRepository$addPaymentId$1 = (ScootersDebtRepaymentRepository$addPaymentId$1) continuationImpl;
            int i2 = scootersDebtRepaymentRepository$addPaymentId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDebtRepaymentRepository$addPaymentId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDebtRepaymentRepository$addPaymentId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDebtRepaymentRepository$addPaymentId$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersDebtRepaymentRepository$addPaymentId$1.L$0 = str;
                    ScootersPaymentApi scootersPaymentApi2 = this.a;
                    scootersDebtRepaymentRepository$addPaymentId$1.L$1 = scootersPaymentApi2;
                    scootersDebtRepaymentRepository$addPaymentId$1.label = 1;
                    Object a = this.b.a(false, scootersDebtRepaymentRepository$addPaymentId$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersPaymentApi = scootersPaymentApi2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11.a;
                }
                scootersPaymentApi = (ScootersPaymentApi) scootersDebtRepaymentRepository$addPaymentId$1.L$1;
                str = (String) scootersDebtRepaymentRepository$addPaymentId$1.L$0;
                b.b(obj);
                cmt<zy11> a2 = scootersPaymentApi.a((Map) obj, new ja0(str, (String) null, (String) null, (String) null, 14));
                scootersDebtRepaymentRepository$addPaymentId$1.L$0 = null;
                scootersDebtRepaymentRepository$addPaymentId$1.L$1 = null;
                scootersDebtRepaymentRepository$addPaymentId$1.label = 2;
            }
        }
        scootersDebtRepaymentRepository$addPaymentId$1 = new ScootersDebtRepaymentRepository$addPaymentId$1(this, continuationImpl);
        Object obj2 = scootersDebtRepaymentRepository$addPaymentId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDebtRepaymentRepository$addPaymentId$1.label;
        if (i != 0) {
        }
        cmt<zy11> a22 = scootersPaymentApi.a((Map) obj2, new ja0(str, (String) null, (String) null, (String) null, 14));
        scootersDebtRepaymentRepository$addPaymentId$1.L$0 = null;
        scootersDebtRepaymentRepository$addPaymentId$1.L$1 = null;
        scootersDebtRepaymentRepository$addPaymentId$1.label = 2;
    }
}
