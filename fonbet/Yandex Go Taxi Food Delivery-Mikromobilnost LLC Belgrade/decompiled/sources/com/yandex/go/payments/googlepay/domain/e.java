package com.yandex.go.payments.googlepay.domain;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.TransactionInfo;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PlatformPayAction;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PlatformPayProvider;
import com.yandex.go.payments.cards.domain.model.UserCardProfileParams;
import com.yandex.go.payments.domain.q0;
import com.yandex.go.payments.paymentlist.experiments.CardNetwork;
import com.yandex.go.payments.paymentlist.experiments.GPayAllowedCardNetworksExperiment;
import defpackage.ac20;
import defpackage.chh;
import defpackage.ffx;
import defpackage.fga0;
import defpackage.fvt;
import defpackage.fw4;
import defpackage.g8e;
import defpackage.g9a0;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.hst;
import defpackage.irs;
import defpackage.jqr;
import defpackage.jst;
import defpackage.kt3;
import defpackage.l9z;
import defpackage.lvt;
import defpackage.m6i0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qaa0;
import defpackage.qqo;
import defpackage.qv10;
import defpackage.raa0;
import defpackage.rma0;
import defpackage.rol0;
import defpackage.rs2;
import defpackage.sjh;
import defpackage.sst;
import defpackage.tmx;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.tvt;
import defpackage.tx90;
import defpackage.u691;
import defpackage.uut;
import defpackage.uyj;
import defpackage.v741;
import defpackage.vg10;
import defpackage.w741;
import defpackage.wut;
import defpackage.x741;
import defpackage.xby;
import defpackage.zut;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.t;
import ru.yandex.taxi.analytics.q;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

/* loaded from: classes8.dex */
public final class e implements fvt {
    public static final List x = Collections.singletonList(2);
    public final wut a;
    public final h3y b;
    public final h3y c;
    public final q0 d;
    public final raa0 e;
    public final l9z f;
    public final h3y g;
    public final tt2 h;
    public final fw4 i;
    public final m6i0 j;
    public final h3y k;
    public final fga0 l;
    public final tvt m;
    public final chh n;
    public final irs o;
    public final h3y p;
    public volatile boolean q;
    public final rma0 r;
    public final n0 s;
    public final tmx t;
    public volatile String u;
    public volatile uut v;
    public volatile PaymentDataRequest w;

    public e(Context context, wut wutVar, h3y h3yVar, h3y h3yVar2, q0 q0Var, raa0 raa0Var, l9z l9zVar, h3y h3yVar3, tt2 tt2Var, fw4 fw4Var, m6i0 m6i0Var, h3y h3yVar4, fga0 fga0Var, tvt tvtVar, rs2 rs2Var, chh chhVar, irs irsVar, h3y h3yVar5) {
        this.a = wutVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = q0Var;
        this.e = raa0Var;
        this.f = l9zVar;
        this.g = h3yVar3;
        this.h = tt2Var;
        this.i = fw4Var;
        this.j = m6i0Var;
        this.k = h3yVar4;
        this.l = fga0Var;
        this.m = tvtVar;
        this.n = chhVar;
        this.o = irsVar;
        this.p = h3yVar5;
        this.q = fga0Var.c() == PaymentMethod$Type.GOOGLE_PAY;
        Context applicationContext = context.getApplicationContext();
        int i = rs2Var.a() ? 1 : 3;
        wutVar.getClass();
        v741 v741Var = new v741();
        v741Var.a(i);
        this.r = new rma0(applicationContext, null, x741.a, new w741(v741Var), sst.c);
        this.s = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.t = new tmx(CardNetwork.Companion.serializer());
        this.u = UUID.randomUUID().toString();
        this.v = uut.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, int i, ContinuationImpl continuationImpl) {
        GooglePayInteractorImpl$getApi$1 googlePayInteractorImpl$getApi$1;
        int i2;
        eVar.getClass();
        if (continuationImpl instanceof GooglePayInteractorImpl$getApi$1) {
            googlePayInteractorImpl$getApi$1 = (GooglePayInteractorImpl$getApi$1) continuationImpl;
            int i3 = googlePayInteractorImpl$getApi$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                googlePayInteractorImpl$getApi$1.label = i3 - Integer.MIN_VALUE;
                Object obj = googlePayInteractorImpl$getApi$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = googlePayInteractorImpl$getApi$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    googlePayInteractorImpl$getApi$1.I$0 = i;
                    googlePayInteractorImpl$getApi$1.label = 1;
                    obj = eVar.c(i, googlePayInteractorImpl$getApi$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((h3y) u691.e(((tx90) obj).a, eVar.b, eVar.c)).get();
            }
        }
        googlePayInteractorImpl$getApi$1 = new GooglePayInteractorImpl$getApi$1(eVar, continuationImpl);
        Object obj3 = googlePayInteractorImpl$getApi$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = googlePayInteractorImpl$getApi$1.label;
        if (i2 != 0) {
        }
        return ((h3y) u691.e(((tx90) obj3).a, eVar.b, eVar.c)).get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    public final List b(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            CardNetwork cardNetwork = (CardNetwork) gtq0.j(str, this.t.a);
            if (cardNetwork == null) {
                arrayList.add(str);
                cardNetwork = null;
            }
            if (cardNetwork != null) {
                arrayList2.add(cardNetwork);
            }
        }
        if (!arrayList.isEmpty()) {
            xby.l(jst.e, "GOOGLE_PAY.UNKNOWN_NETWORK_NAMES", null, new IllegalArgumentException(), "Failed to match card networks to known ones: " + arrayList, 2);
        }
        if (arrayList2.isEmpty() && z && !list.isEmpty()) {
            return EmptyList.a;
        }
        if (arrayList2.isEmpty()) {
            irs irsVar = this.o;
            ?? r10 = irsVar.b;
            GPayAllowedCardNetworksExperiment gPayAllowedCardNetworksExperiment = (GPayAllowedCardNetworksExperiment) ((qqo) irsVar.a.getValue()).b();
            ArrayList arrayList3 = r10;
            if (gPayAllowedCardNetworksExperiment.b) {
                List M = kotlin.collections.a.M(gPayAllowedCardNetworksExperiment.c);
                List list2 = r10;
                if (!M.isEmpty()) {
                    list2 = M;
                }
                arrayList3 = list2;
            }
            arrayList2 = arrayList3;
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, ContinuationImpl continuationImpl) {
        GooglePayInteractorImpl$getProfile$1 googlePayInteractorImpl$getProfile$1;
        int i2;
        Object a;
        tx90 tx90Var;
        if (continuationImpl instanceof GooglePayInteractorImpl$getProfile$1) {
            googlePayInteractorImpl$getProfile$1 = (GooglePayInteractorImpl$getProfile$1) continuationImpl;
            int i3 = googlePayInteractorImpl$getProfile$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                googlePayInteractorImpl$getProfile$1.label = i3 - Integer.MIN_VALUE;
                Object obj = googlePayInteractorImpl$getProfile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = googlePayInteractorImpl$getProfile$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    qaa0 a2 = this.e.a();
                    UserCardProfileParams userCardProfileParams = new UserCardProfileParams(a2 != null ? a2.b : null, new Integer(i), this.f.a());
                    googlePayInteractorImpl$getProfile$1.L$0 = null;
                    googlePayInteractorImpl$getProfile$1.I$0 = i;
                    googlePayInteractorImpl$getProfile$1.label = 1;
                    a = this.d.a(userCardProfileParams, googlePayInteractorImpl$getProfile$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (a instanceof Result.Failure) {
                    a = null;
                }
                tx90Var = (tx90) a;
                UserCardProfileName userCardProfileName = tx90Var == null ? tx90Var.a : null;
                if ((tx90Var == null ? tx90Var.a : null) == null) {
                    return tx90Var;
                }
                vg10.o(userCardProfileName, "Unknown or absent profile: ");
                return null;
            }
        }
        googlePayInteractorImpl$getProfile$1 = new GooglePayInteractorImpl$getProfile$1(this, continuationImpl);
        Object obj2 = googlePayInteractorImpl$getProfile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = googlePayInteractorImpl$getProfile$1.label;
        if (i2 != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        tx90Var = (tx90) a;
        if (tx90Var == null) {
        }
        if ((tx90Var == null ? tx90Var.a : null) == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:18|19))(3:20|21|(1:23))|11|(1:13)(1:17)|14|15))|28|6|7|(0)(0)|11|(0)(0)|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0029, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        defpackage.jst.e.k(r8, "Error while determining Google Pay availability");
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: all -> 0x0029, CancellationException -> 0x0086, TryCatch #2 {CancellationException -> 0x0086, all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0049, B:13:0x004d, B:17:0x0052, B:21:0x0039), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: all -> 0x0029, CancellationException -> 0x0086, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0086, all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0049, B:13:0x004d, B:17:0x0052, B:21:0x0039), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        GooglePayInteractorImpl$googlePayEnabled$1 googlePayInteractorImpl$googlePayEnabled$1;
        int i;
        Boolean bool;
        if (continuationImpl instanceof GooglePayInteractorImpl$googlePayEnabled$1) {
            googlePayInteractorImpl$googlePayEnabled$1 = (GooglePayInteractorImpl$googlePayEnabled$1) continuationImpl;
            int i2 = googlePayInteractorImpl$googlePayEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googlePayInteractorImpl$googlePayEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = googlePayInteractorImpl$googlePayEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayInteractorImpl$googlePayEnabled$1.label;
                boolean z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.n.getClass();
                    GooglePayInteractorImpl$googlePayEnabled$supported$1$result$1 googlePayInteractorImpl$googlePayEnabled$supported$1$result$1 = new GooglePayInteractorImpl$googlePayEnabled$supported$1$result$1(this, null);
                    googlePayInteractorImpl$googlePayEnabled$1.label = 1;
                    obj = kotlinx.coroutines.a.w(3000L, googlePayInteractorImpl$googlePayEnabled$supported$1$result$1, googlePayInteractorImpl$googlePayEnabled$1);
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
                bool = (Boolean) obj;
                if (bool == null) {
                    z = bool.booleanValue();
                } else {
                    jst.e.k(new RuntimeException(), "Google Pay support request fails by timeout");
                }
                this.u = UUID.randomUUID().toString();
                ((g9a0) this.k.get()).g(PaymentMethodsAnalytics$PlatformPayProvider.GooglePay, PaymentMethodsAnalytics$PlatformPayAction.SupportedCheck, this.u, null);
                return Boolean.valueOf(z);
            }
        }
        googlePayInteractorImpl$googlePayEnabled$1 = new GooglePayInteractorImpl$googlePayEnabled$1(this, continuationImpl);
        Object obj2 = googlePayInteractorImpl$googlePayEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayInteractorImpl$googlePayEnabled$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        bool = (Boolean) obj2;
        if (bool == null) {
        }
        this.u = UUID.randomUUID().toString();
        ((g9a0) this.k.get()).g(PaymentMethodsAnalytics$PlatformPayProvider.GooglePay, PaymentMethodsAnalytics$PlatformPayAction.SupportedCheck, this.u, null);
        return Boolean.valueOf(z2);
    }

    public final rol0 e() {
        return new rol0(new GooglePayInteractorImpl$googlePayEnabledFlow$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[Catch: all -> 0x00b2, CancellationException -> 0x00bd, TryCatch #2 {CancellationException -> 0x00bd, all -> 0x00b2, blocks: (B:11:0x003e, B:12:0x0080, B:14:0x005c, B:16:0x0062, B:20:0x008c, B:21:0x0099, B:23:0x009f, B:26:0x00ad, B:33:0x0088, B:37:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[Catch: all -> 0x00b2, CancellationException -> 0x00bd, TryCatch #2 {CancellationException -> 0x00bd, all -> 0x00b2, blocks: (B:11:0x003e, B:12:0x0080, B:14:0x005c, B:16:0x0062, B:20:0x008c, B:21:0x0099, B:23:0x009f, B:26:0x00ad, B:33:0x0088, B:37:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[Catch: all -> 0x00b2, CancellationException -> 0x00bd, TryCatch #2 {CancellationException -> 0x00bd, all -> 0x00b2, blocks: (B:11:0x003e, B:12:0x0080, B:14:0x005c, B:16:0x0062, B:20:0x008c, B:21:0x0099, B:23:0x009f, B:26:0x00ad, B:33:0x0088, B:37:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007d -> B:12:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(List list, ContinuationImpl continuationImpl) {
        GooglePayInteractorImpl$hasBoundCardsInGooglePay$1 googlePayInteractorImpl$hasBoundCardsInGooglePay$1;
        int i;
        Iterator it;
        Collection collection;
        try {
            if (continuationImpl instanceof GooglePayInteractorImpl$hasBoundCardsInGooglePay$1) {
                googlePayInteractorImpl$hasBoundCardsInGooglePay$1 = (GooglePayInteractorImpl$hasBoundCardsInGooglePay$1) continuationImpl;
                int i2 = googlePayInteractorImpl$hasBoundCardsInGooglePay$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    googlePayInteractorImpl$hasBoundCardsInGooglePay$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = googlePayInteractorImpl$hasBoundCardsInGooglePay$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = googlePayInteractorImpl$hasBoundCardsInGooglePay$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        List b = b(list, true);
                        ArrayList arrayList = new ArrayList();
                        it = b.iterator();
                        collection = arrayList;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object next = googlePayInteractorImpl$hasBoundCardsInGooglePay$1.L$5;
                        it = (Iterator) googlePayInteractorImpl$hasBoundCardsInGooglePay$1.L$4;
                        collection = (Collection) googlePayInteractorImpl$hasBoundCardsInGooglePay$1.L$3;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            collection.add(next);
                        }
                        if (it.hasNext()) {
                            next = it.next();
                            googlePayInteractorImpl$hasBoundCardsInGooglePay$1.L$0 = null;
                            googlePayInteractorImpl$hasBoundCardsInGooglePay$1.L$1 = null;
                            googlePayInteractorImpl$hasBoundCardsInGooglePay$1.L$2 = null;
                            googlePayInteractorImpl$hasBoundCardsInGooglePay$1.L$3 = collection;
                            googlePayInteractorImpl$hasBoundCardsInGooglePay$1.L$4 = it;
                            googlePayInteractorImpl$hasBoundCardsInGooglePay$1.L$5 = next;
                            googlePayInteractorImpl$hasBoundCardsInGooglePay$1.L$6 = null;
                            googlePayInteractorImpl$hasBoundCardsInGooglePay$1.label = 1;
                            obj = g((CardNetwork) next, googlePayInteractorImpl$hasBoundCardsInGooglePay$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                            if (it.hasNext()) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = ((List) collection).iterator();
                                while (it2.hasNext()) {
                                    String a = this.t.a((CardNetwork) it2.next());
                                    if (a != null) {
                                        arrayList2.add(a);
                                    }
                                }
                                return arrayList2;
                            }
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Error in hasBoundCardsInGooglePay request");
            return EmptyList.a;
        }
        googlePayInteractorImpl$hasBoundCardsInGooglePay$1 = new GooglePayInteractorImpl$hasBoundCardsInGooglePay$1(this, continuationImpl);
        Object obj2 = googlePayInteractorImpl$hasBoundCardsInGooglePay$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayInteractorImpl$hasBoundCardsInGooglePay$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(CardNetwork cardNetwork, ContinuationImpl continuationImpl) {
        GooglePayInteractorImpl$hasBoundCardsInGooglePay$4 googlePayInteractorImpl$hasBoundCardsInGooglePay$4;
        int i;
        Boolean bool;
        boolean z;
        if (continuationImpl instanceof GooglePayInteractorImpl$hasBoundCardsInGooglePay$4) {
            googlePayInteractorImpl$hasBoundCardsInGooglePay$4 = (GooglePayInteractorImpl$hasBoundCardsInGooglePay$4) continuationImpl;
            int i2 = googlePayInteractorImpl$hasBoundCardsInGooglePay$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googlePayInteractorImpl$hasBoundCardsInGooglePay$4.label = i2 - Integer.MIN_VALUE;
                Object obj = googlePayInteractorImpl$hasBoundCardsInGooglePay$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayInteractorImpl$hasBoundCardsInGooglePay$4.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.google.android.gms.wallet.b newBuilder = IsReadyToPayRequest.newBuilder();
                    newBuilder.c(true);
                    newBuilder.a(cardNetwork.getId());
                    newBuilder.b(2);
                    GooglePayInteractorImpl$hasBoundCardsInGooglePay$5 googlePayInteractorImpl$hasBoundCardsInGooglePay$5 = new GooglePayInteractorImpl$hasBoundCardsInGooglePay$5(this, newBuilder.a, null);
                    googlePayInteractorImpl$hasBoundCardsInGooglePay$4.L$0 = cardNetwork;
                    googlePayInteractorImpl$hasBoundCardsInGooglePay$4.L$1 = null;
                    googlePayInteractorImpl$hasBoundCardsInGooglePay$4.label = 1;
                    obj = kotlinx.coroutines.a.w(15000L, googlePayInteractorImpl$hasBoundCardsInGooglePay$5, googlePayInteractorImpl$hasBoundCardsInGooglePay$4);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cardNetwork = (CardNetwork) googlePayInteractorImpl$hasBoundCardsInGooglePay$4.L$0;
                    kotlin.b.b(obj);
                }
                bool = (Boolean) obj;
                if (bool == null) {
                    z = bool.booleanValue();
                } else {
                    jst.e.k(new RuntimeException(), "Google Pay isReadyToPay request fails by timeout with params [network: " + cardNetwork + "]");
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        googlePayInteractorImpl$hasBoundCardsInGooglePay$4 = new GooglePayInteractorImpl$hasBoundCardsInGooglePay$4(this, continuationImpl);
        Object obj2 = googlePayInteractorImpl$hasBoundCardsInGooglePay$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayInteractorImpl$hasBoundCardsInGooglePay$4.label;
        if (i != 0) {
        }
        bool = (Boolean) obj2;
        if (bool == null) {
        }
        return Boolean.valueOf(z);
    }

    public final t h() {
        return kotlinx.coroutines.flow.e.T(this.s, 1);
    }

    public final boolean i(Activity activity, PaymentDataRequest paymentDataRequest) {
        this.w = paymentDataRequest;
        ((q) ((ac20) this.p.get())).h("GooglePay.Started", g8e.z("identifier", this.u));
        wut wutVar = this.a;
        rma0 rma0Var = this.r;
        wutVar.getClass();
        try {
            kt3.b(rma0Var.e(paymentDataRequest), activity, 8778);
            return true;
        } catch (Exception e) {
            jst.e.k(e, "Cannot open Google Pay card selector");
            return false;
        }
    }

    public final tpr j(uut uutVar, zut zutVar) {
        d dVar = new d(new o(new jqr(new rol0(new GooglePayInteractorImpl$requestGooglePayCardId$3(zutVar, this, uutVar, null)), new GooglePayInteractorImpl$requestGooglePayCardId$4(this, null), 3), new GooglePayInteractorImpl$requestGooglePayCardId$5(this, null)), this);
        this.h.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(new o(kotlinx.coroutines.flow.e.F(dVar, mdh.b), new GooglePayInteractorImpl$requestGooglePayCardId$7()), o400.a);
    }

    public final tpr k(zut zutVar) {
        qv10.C(new Object[]{Integer.valueOf(zutVar.a), zutVar.b}, 2, "Google Pay: requestGooglePayCardId: received regionId=%s and serviceToken=%s", jst.e);
        uut uutVar = this.v;
        if (uutVar.d) {
            return j(uutVar, zutVar);
        }
        ny61.r("Google Pay card hasn't been selected");
        return null;
    }

    public final g l() {
        uut uutVar = this.v;
        if (uutVar.d) {
            jst.e.n(String.format("Google Pay: requestGooglePayCardId: token=isDirect=%s", Arrays.copyOf(new Object[]{Boolean.valueOf(uutVar.c)}, 1)));
            return kotlinx.coroutines.flow.e.X(new rol0(new GooglePayInteractorImpl$requestGooglePayCardId$1(this, null)), new GooglePayInteractorImpl$requestGooglePayCardId$$inlined$flatMapLatest$1(null, this, uutVar));
        }
        ny61.r("Google Pay card hasn't been selected");
        return null;
    }

    public final boolean m(Activity activity, boolean z, lvt lvtVar) {
        PaymentMethodTokenizationParameters b;
        TransactionInfo a;
        hst hstVar = jst.e;
        Throwable th = new Throwable();
        Boolean valueOf = Boolean.valueOf(z);
        String e = lvtVar.e();
        Boolean valueOf2 = Boolean.valueOf(!(e == null || e.length() == 0));
        String d = lvtVar.d();
        hstVar.p(String.format("Google Pay: selectGooglePayCard: isUiRequired=%s, withExternalMerchant=%s, withExternalGateway=%s, expectedAmount=%s %s", Arrays.copyOf(new Object[]{valueOf, valueOf2, Boolean.valueOf(!(d == null || d.length() == 0)), lvtVar.a(), lvtVar.c()}, 5)), th);
        this.v = uut.e;
        String e2 = lvtVar.e();
        String d2 = lvtVar.d();
        PaymentDataRequest paymentDataRequest = null;
        if (e2 == null || e2.length() == 0) {
            String str = this.l.b.g().n;
            if (str != null && str.length() != 0) {
                com.google.android.gms.wallet.d newBuilder = PaymentMethodTokenizationParameters.newBuilder();
                newBuilder.c(3);
                newBuilder.a("protocolVersion", "ECv2");
                newBuilder.a("publicKey", str);
                b = newBuilder.b();
            }
            b = null;
        } else {
            if (d2 != null && d2.length() != 0) {
                com.google.android.gms.wallet.d newBuilder2 = PaymentMethodTokenizationParameters.newBuilder();
                newBuilder2.c(1);
                newBuilder2.a("gateway", d2);
                newBuilder2.a("gatewayMerchantId", e2);
                b = newBuilder2.b();
            }
            b = null;
        }
        if (b != null) {
            com.google.android.gms.wallet.a newBuilder3 = CardRequirements.newBuilder();
            Iterator it = b(lvtVar.b(), false).iterator();
            while (it.hasNext()) {
                newBuilder3.a(((CardNetwork) it.next()).getId());
            }
            com.google.android.gms.wallet.c newBuilder4 = PaymentDataRequest.newBuilder();
            com.google.android.gms.wallet.e newBuilder5 = TransactionInfo.newBuilder();
            String a2 = lvtVar.a();
            String c = lvtVar.c();
            if (a2 == null || a2.length() == 0 || c == null || c.length() == 0) {
                newBuilder5.d(1);
                if (c == null || c.length() == 0) {
                    c = "RUB";
                }
                newBuilder5.b(c);
                a = newBuilder5.a();
            } else {
                newBuilder5.c(a2);
                newBuilder5.d(2);
                newBuilder5.b(c);
                a = newBuilder5.a();
            }
            newBuilder4.e(a);
            newBuilder4.a(x);
            newBuilder4.c(newBuilder3.b());
            newBuilder4.d(b);
            newBuilder4.f(z);
            paymentDataRequest = newBuilder4.b();
        }
        if (paymentDataRequest == null) {
            return false;
        }
        return i(activity, paymentDataRequest);
    }
}
