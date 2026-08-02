package com.yandex.go.payments.superapp.payment;

import android.app.Activity;
import androidx.core.os.OperationCanceledException;
import com.yandex.go.payments.api.GooglePayInteractor$GooglePayTokenResult;
import com.yandex.go.payments.googlepay.domain.e;
import defpackage.jvt;
import defpackage.lvt;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.t;

/* loaded from: classes8.dex */
public final class a {
    public final e a;
    public final Activity b;

    public a(Activity activity, e eVar) {
        this.a = eVar;
        this.b = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        GooglePayPaymentsInteractor$hasBoundCardsInGooglePay$1 googlePayPaymentsInteractor$hasBoundCardsInGooglePay$1;
        int i;
        try {
            if (continuationImpl instanceof GooglePayPaymentsInteractor$hasBoundCardsInGooglePay$1) {
                googlePayPaymentsInteractor$hasBoundCardsInGooglePay$1 = (GooglePayPaymentsInteractor$hasBoundCardsInGooglePay$1) continuationImpl;
                int i2 = googlePayPaymentsInteractor$hasBoundCardsInGooglePay$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    googlePayPaymentsInteractor$hasBoundCardsInGooglePay$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = googlePayPaymentsInteractor$hasBoundCardsInGooglePay$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = googlePayPaymentsInteractor$hasBoundCardsInGooglePay$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        e eVar = this.a;
                        googlePayPaymentsInteractor$hasBoundCardsInGooglePay$1.L$0 = null;
                        googlePayPaymentsInteractor$hasBoundCardsInGooglePay$1.label = 1;
                        obj = eVar.f(list, googlePayPaymentsInteractor$hasBoundCardsInGooglePay$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (List) obj;
                }
            }
            if (i != 0) {
            }
            return (List) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return EmptyList.a;
        }
        googlePayPaymentsInteractor$hasBoundCardsInGooglePay$1 = new GooglePayPaymentsInteractor$hasBoundCardsInGooglePay$1(this, continuationImpl);
        Object obj3 = googlePayPaymentsInteractor$hasBoundCardsInGooglePay$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayPaymentsInteractor$hasBoundCardsInGooglePay$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        GooglePayPaymentsInteractor$isGooglePayEnabled$1 googlePayPaymentsInteractor$isGooglePayEnabled$1;
        int i;
        try {
            if (continuationImpl instanceof GooglePayPaymentsInteractor$isGooglePayEnabled$1) {
                googlePayPaymentsInteractor$isGooglePayEnabled$1 = (GooglePayPaymentsInteractor$isGooglePayEnabled$1) continuationImpl;
                int i2 = googlePayPaymentsInteractor$isGooglePayEnabled$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    googlePayPaymentsInteractor$isGooglePayEnabled$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = googlePayPaymentsInteractor$isGooglePayEnabled$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = googlePayPaymentsInteractor$isGooglePayEnabled$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        e eVar = this.a;
                        googlePayPaymentsInteractor$isGooglePayEnabled$1.label = 1;
                        obj = eVar.d(googlePayPaymentsInteractor$isGooglePayEnabled$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    return bool;
                }
            }
            if (i != 0) {
            }
            Boolean bool2 = (Boolean) obj;
            bool2.getClass();
            return bool2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
        googlePayPaymentsInteractor$isGooglePayEnabled$1 = new GooglePayPaymentsInteractor$isGooglePayEnabled$1(this, continuationImpl);
        Object obj2 = googlePayPaymentsInteractor$isGooglePayEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayPaymentsInteractor$isGooglePayEnabled$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(lvt lvtVar, ContinuationImpl continuationImpl) {
        GooglePayPaymentsInteractor$selectGooglePayCard$1 googlePayPaymentsInteractor$selectGooglePayCard$1;
        int i;
        int i2;
        if (continuationImpl instanceof GooglePayPaymentsInteractor$selectGooglePayCard$1) {
            googlePayPaymentsInteractor$selectGooglePayCard$1 = (GooglePayPaymentsInteractor$selectGooglePayCard$1) continuationImpl;
            int i3 = googlePayPaymentsInteractor$selectGooglePayCard$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                googlePayPaymentsInteractor$selectGooglePayCard$1.label = i3 - Integer.MIN_VALUE;
                Object obj = googlePayPaymentsInteractor$selectGooglePayCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayPaymentsInteractor$selectGooglePayCard$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Activity activity = this.b;
                    e eVar = this.a;
                    if (!eVar.m(activity, false, lvtVar)) {
                        ny61.r("selectGooglePayCard error");
                        return null;
                    }
                    t h = eVar.h();
                    googlePayPaymentsInteractor$selectGooglePayCard$1.L$0 = null;
                    googlePayPaymentsInteractor$selectGooglePayCard$1.Z$0 = false;
                    googlePayPaymentsInteractor$selectGooglePayCard$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.A(h, googlePayPaymentsInteractor$selectGooglePayCard$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                GooglePayInteractor$GooglePayTokenResult googlePayInteractor$GooglePayTokenResult = (GooglePayInteractor$GooglePayTokenResult) obj;
                i2 = googlePayInteractor$GooglePayTokenResult != null ? -1 : jvt.a[googlePayInteractor$GooglePayTokenResult.ordinal()];
                if (i2 != 1) {
                    return zy11.a;
                }
                if (i2 == 2) {
                    throw new OperationCanceledException();
                }
                if (i2 != 3) {
                    ny61.r("googlePayCardSelected error");
                    return null;
                }
                ny61.r("googlePayCardSelected error");
                return null;
            }
        }
        googlePayPaymentsInteractor$selectGooglePayCard$1 = new GooglePayPaymentsInteractor$selectGooglePayCard$1(this, continuationImpl);
        Object obj2 = googlePayPaymentsInteractor$selectGooglePayCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayPaymentsInteractor$selectGooglePayCard$1.label;
        if (i != 0) {
        }
        GooglePayInteractor$GooglePayTokenResult googlePayInteractor$GooglePayTokenResult2 = (GooglePayInteractor$GooglePayTokenResult) obj2;
        if (googlePayInteractor$GooglePayTokenResult2 != null) {
        }
        if (i2 != 1) {
        }
    }
}
