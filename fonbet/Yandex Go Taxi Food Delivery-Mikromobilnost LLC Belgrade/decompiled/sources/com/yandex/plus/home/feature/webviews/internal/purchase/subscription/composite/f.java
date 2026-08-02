package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.SubscriptionProductException;
import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import defpackage.cd0;
import defpackage.eci0;
import defpackage.ef41;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.skd0;
import defpackage.w511;
import defpackage.zy11;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class f {
    public final com.yandex.plus.home.feature.webviews.internal.purchase.subscription.a a;
    public final com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b b;
    public final g c;
    public final cd0 d;
    public final n0 e;
    public final eci0 f;

    public f(com.yandex.plus.home.feature.webviews.internal.purchase.subscription.a aVar, com.yandex.plus.home.feature.webviews.internal.purchase.subscription.b bVar, g gVar) {
        this.a = aVar;
        this.b = bVar;
        this.c = gVar;
        this.d = new cd0(23, aVar.b, this);
        n0 c = ffx.c(0, 0, null, 7);
        this.e = c;
        this.f = kotlinx.coroutines.flow.e.c(c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError$NoTarget] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError$ParseConfigError] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(SubscriptionConfiguration subscriptionConfiguration, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        CompositeSubscriptionInfoHolder$getProductsWithError$1 compositeSubscriptionInfoHolder$getProductsWithError$1;
        int i;
        Ref$ObjectRef z;
        List list;
        SubscriptionConfiguration.Subscription subscription;
        String targetId;
        Object a;
        Result.Failure failure;
        SubscriptionInfoError subscriptionInfoError;
        Ref$ObjectRef ref$ObjectRef;
        Throwable a2;
        SubscriptionProductException subscriptionProductException;
        T t;
        SubscriptionConfiguration subscriptionConfiguration2 = subscriptionConfiguration;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        try {
            if (continuationImpl instanceof CompositeSubscriptionInfoHolder$getProductsWithError$1) {
                compositeSubscriptionInfoHolder$getProductsWithError$1 = (CompositeSubscriptionInfoHolder$getProductsWithError$1) continuationImpl;
                int i2 = compositeSubscriptionInfoHolder$getProductsWithError$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    compositeSubscriptionInfoHolder$getProductsWithError$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = compositeSubscriptionInfoHolder$getProductsWithError$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = compositeSubscriptionInfoHolder$getProductsWithError$1.label;
                    if (i != 0) {
                        z = qv10.z(obj);
                        if (subscriptionConfiguration2 == null) {
                            z.element = new SubscriptionInfoError.ParseConfigError(str4, str5, str6);
                        }
                        if (subscriptionConfiguration2 != null && (subscription = subscriptionConfiguration2.getSubscription()) != null) {
                            targetId = subscription.getTargetId();
                            if (evu0.J(targetId)) {
                                z.element = new SubscriptionInfoError.NoTarget(str4, str5, str6, subscription.getPaymentMethod().name());
                            } else {
                                try {
                                    g gVar = this.c;
                                    SubscriptionConfiguration.Subscription.PaymentMethod paymentMethod = subscription.getPaymentMethod();
                                    List<String> features = subscription.getFeatures();
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.L$0 = subscriptionConfiguration2;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.L$1 = null;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.L$2 = str4;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.L$3 = str5;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.L$4 = str6;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.L$5 = z;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.L$6 = subscription;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.L$7 = targetId;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.L$8 = null;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.L$9 = null;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.L$10 = null;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.L$11 = null;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.I$0 = 0;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.I$1 = 0;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.I$2 = 0;
                                    compositeSubscriptionInfoHolder$getProductsWithError$1.label = 1;
                                    a = gVar.a(paymentMethod, features, targetId, compositeSubscriptionInfoHolder$getProductsWithError$1);
                                    if (a == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } catch (TimeoutCancellationException e) {
                                    e = e;
                                    failure = new Result.Failure(e);
                                    a = failure;
                                    String str7 = targetId;
                                    ref$ObjectRef = z;
                                    String str8 = str6;
                                    String str9 = str5;
                                    String str10 = str4;
                                    a2 = Result.a(a);
                                    if (a2 != null) {
                                    }
                                    if (a instanceof Result.Failure) {
                                    }
                                    list = (List) a;
                                    z = ref$ObjectRef;
                                    if (list == null) {
                                    }
                                    subscriptionInfoError = (SubscriptionInfoError) z.element;
                                    if (subscriptionInfoError != null) {
                                    }
                                    return new Pair(list, z.element);
                                } catch (Throwable th) {
                                    th = th;
                                    failure = new Result.Failure(th);
                                    a = failure;
                                    String str72 = targetId;
                                    ref$ObjectRef = z;
                                    String str82 = str6;
                                    String str92 = str5;
                                    String str102 = str4;
                                    a2 = Result.a(a);
                                    if (a2 != null) {
                                    }
                                    if (a instanceof Result.Failure) {
                                    }
                                    list = (List) a;
                                    z = ref$ObjectRef;
                                    if (list == null) {
                                    }
                                    subscriptionInfoError = (SubscriptionInfoError) z.element;
                                    if (subscriptionInfoError != null) {
                                    }
                                    return new Pair(list, z.element);
                                }
                            }
                        }
                        list = null;
                        if (list == null) {
                            list = EmptyList.a;
                        }
                        subscriptionInfoError = (SubscriptionInfoError) z.element;
                        if (subscriptionInfoError != null) {
                            skd0.h(PlusLogTag.SUBSCRIPTION, "Error getting subscription info, config=" + subscriptionConfiguration2 + " error=" + subscriptionInfoError, null);
                        }
                        return new Pair(list, z.element);
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str11 = (String) compositeSubscriptionInfoHolder$getProductsWithError$1.L$7;
                    SubscriptionConfiguration.Subscription subscription2 = (SubscriptionConfiguration.Subscription) compositeSubscriptionInfoHolder$getProductsWithError$1.L$6;
                    Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) compositeSubscriptionInfoHolder$getProductsWithError$1.L$5;
                    str6 = (String) compositeSubscriptionInfoHolder$getProductsWithError$1.L$4;
                    String str12 = (String) compositeSubscriptionInfoHolder$getProductsWithError$1.L$3;
                    String str13 = (String) compositeSubscriptionInfoHolder$getProductsWithError$1.L$2;
                    SubscriptionConfiguration subscriptionConfiguration3 = (SubscriptionConfiguration) compositeSubscriptionInfoHolder$getProductsWithError$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        subscription = subscription2;
                        str4 = str13;
                        targetId = str11;
                        a = obj;
                        subscriptionConfiguration2 = subscriptionConfiguration3;
                        z = ref$ObjectRef2;
                        str5 = str12;
                    } catch (TimeoutCancellationException e2) {
                        e = e2;
                        subscription = subscription2;
                        str4 = str13;
                        targetId = str11;
                        z = ref$ObjectRef2;
                        subscriptionConfiguration2 = subscriptionConfiguration3;
                        str5 = str12;
                        failure = new Result.Failure(e);
                        a = failure;
                        String str722 = targetId;
                        ref$ObjectRef = z;
                        String str822 = str6;
                        String str922 = str5;
                        String str1022 = str4;
                        a2 = Result.a(a);
                        if (a2 != null) {
                        }
                        if (a instanceof Result.Failure) {
                        }
                        list = (List) a;
                        z = ref$ObjectRef;
                        if (list == null) {
                        }
                        subscriptionInfoError = (SubscriptionInfoError) z.element;
                        if (subscriptionInfoError != null) {
                        }
                        return new Pair(list, z.element);
                    } catch (Throwable th2) {
                        th = th2;
                        subscription = subscription2;
                        str4 = str13;
                        targetId = str11;
                        z = ref$ObjectRef2;
                        subscriptionConfiguration2 = subscriptionConfiguration3;
                        str5 = str12;
                        failure = new Result.Failure(th);
                        a = failure;
                        String str7222 = targetId;
                        ref$ObjectRef = z;
                        String str8222 = str6;
                        String str9222 = str5;
                        String str10222 = str4;
                        a2 = Result.a(a);
                        if (a2 != null) {
                        }
                        if (a instanceof Result.Failure) {
                        }
                        list = (List) a;
                        z = ref$ObjectRef;
                        if (list == null) {
                        }
                        subscriptionInfoError = (SubscriptionInfoError) z.element;
                        if (subscriptionInfoError != null) {
                        }
                        return new Pair(list, z.element);
                    }
                    String str72222 = targetId;
                    ref$ObjectRef = z;
                    String str82222 = str6;
                    String str92222 = str5;
                    String str102222 = str4;
                    a2 = Result.a(a);
                    if (a2 != null && (a2 instanceof SubscriptionProductException)) {
                        subscriptionProductException = (SubscriptionProductException) a2;
                        String name = subscription.getPaymentMethod().name();
                        if (!(subscriptionProductException instanceof SubscriptionProductException.InvalidPaymentMethod)) {
                            t = new SubscriptionInfoError.InvalidPaymentMethod(str102222, str92222, str82222, str72222, name);
                        } else {
                            if (!(subscriptionProductException instanceof SubscriptionProductException.NoOffersByVendor)) {
                                w511.b();
                                return null;
                            }
                            SubscriptionProductException.NoOffersByVendor noOffersByVendor = (SubscriptionProductException.NoOffersByVendor) subscriptionProductException;
                            t = new SubscriptionInfoError.EmptyProductsByTarget(str102222, str92222, str82222, str72222, noOffersByVendor.getVendorType(), noOffersByVendor.getOffersIds(), name);
                        }
                        ref$ObjectRef.element = t;
                    }
                    if (a instanceof Result.Failure) {
                        a = null;
                    }
                    list = (List) a;
                    z = ref$ObjectRef;
                    if (list == null) {
                    }
                    subscriptionInfoError = (SubscriptionInfoError) z.element;
                    if (subscriptionInfoError != null) {
                    }
                    return new Pair(list, z.element);
                }
            }
            if (i != 0) {
            }
            String str722222 = targetId;
            ref$ObjectRef = z;
            String str822222 = str6;
            String str922222 = str5;
            String str1022222 = str4;
            a2 = Result.a(a);
            if (a2 != null) {
                subscriptionProductException = (SubscriptionProductException) a2;
                String name2 = subscription.getPaymentMethod().name();
                if (!(subscriptionProductException instanceof SubscriptionProductException.InvalidPaymentMethod)) {
                }
                ref$ObjectRef.element = t;
            }
            if (a instanceof Result.Failure) {
            }
            list = (List) a;
            z = ref$ObjectRef;
            if (list == null) {
            }
            subscriptionInfoError = (SubscriptionInfoError) z.element;
            if (subscriptionInfoError != null) {
            }
            return new Pair(list, z.element);
        } catch (CancellationException e3) {
            throw e3;
        }
        compositeSubscriptionInfoHolder$getProductsWithError$1 = new CompositeSubscriptionInfoHolder$getProductsWithError$1(this, continuationImpl);
        Object obj2 = compositeSubscriptionInfoHolder$getProductsWithError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compositeSubscriptionInfoHolder$getProductsWithError$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dd, code lost:
    
        if (r1.e.emit(r13, r6) != r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r13 == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        CompositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1 compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ef41 ef41Var;
        f fVar;
        String str4;
        if (continuationImpl instanceof CompositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1) {
            compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1 = (CompositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1) continuationImpl;
            int i2 = compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1.label = i2 - Integer.MIN_VALUE;
                CompositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1 compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12 = compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1;
                obj = compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$0 = str;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$1 = str2;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$2 = str3;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.label = 1;
                    obj = this.b.a(str, str2, str3, compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12);
                } else if (i == 1) {
                    str3 = (String) compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$2;
                    str2 = (String) compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$1;
                    str = (String) compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$0;
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
                    ef41Var = (ef41) compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$3;
                    str4 = (String) compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$0;
                    kotlin.b.b(obj);
                    fVar = this;
                    Pair pair = (Pair) obj;
                    CompositeSubscriptionInfo.Stories stories = new CompositeSubscriptionInfo.Stories(ef41Var == null ? ef41Var.c : null, (List) pair.getFirst(), (SubscriptionInfoError) pair.getSecond(), str4);
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$0 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$1 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$2 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$3 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$4 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$5 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$6 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.label = 3;
                }
                String str5 = str;
                String str6 = str2;
                String str7 = str3;
                ef41Var = (ef41) obj;
                SubscriptionConfiguration subscriptionConfiguration = ef41Var == null ? ef41Var.c : null;
                compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$0 = str5;
                compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$1 = null;
                compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$2 = null;
                compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$3 = ef41Var;
                compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.label = 2;
                fVar = this;
                obj = fVar.a(subscriptionConfiguration, str6, str7, str5, compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12);
                if (obj != coroutineSingletons) {
                    str4 = str5;
                    Pair pair2 = (Pair) obj;
                    CompositeSubscriptionInfo.Stories stories2 = new CompositeSubscriptionInfo.Stories(ef41Var == null ? ef41Var.c : null, (List) pair2.getFirst(), (SubscriptionInfoError) pair2.getSecond(), str4);
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$0 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$1 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$2 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$3 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$4 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$5 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.L$6 = null;
                    compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$12.label = 3;
                }
                return coroutineSingletons;
            }
        }
        compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1 = new CompositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1(this, continuationImpl);
        CompositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1 compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$122 = compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$1;
        obj = compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$122.label;
        if (i != 0) {
        }
        String str52 = str;
        String str62 = str2;
        String str72 = str3;
        ef41Var = (ef41) obj;
        if (ef41Var == null) {
        }
        compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$122.L$0 = str52;
        compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$122.L$1 = null;
        compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$122.L$2 = null;
        compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$122.L$3 = ef41Var;
        compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$122.label = 2;
        fVar = this;
        obj = fVar.a(subscriptionConfiguration, str62, str72, str52, compositeSubscriptionInfoHolder$updateStorySubscriptionInfo$122);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
