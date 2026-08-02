package com.yandex.plus.pay.inapp.google.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.android.billingclient.api.Purchase;
import com.yandex.plus.core.activity.result.internal.c;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.inapp.api.PlusPayInAppProductType;
import com.yandex.plus.pay.inapp.google.internal.operation.d;
import com.yandex.plus.pay.inapp.google.internal.operation.e;
import com.yandex.plus.pay.inapp.google.internal.operation.f;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppInvalidSignatureException;
import defpackage.att;
import defpackage.bwt;
import defpackage.fcd0;
import defpackage.gkc0;
import defpackage.h32;
import defpackage.hs5;
import defpackage.l0g0;
import defpackage.mcd0;
import defpackage.ns5;
import defpackage.ny61;
import defpackage.ocd0;
import defpackage.pb;
import defpackage.pgz;
import defpackage.rcd0;
import defpackage.t7f0;
import defpackage.tcc;
import defpackage.ucd0;
import defpackage.uza;
import defpackage.vms;
import defpackage.w511;
import defpackage.zy11;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class a implements ocd0, l0g0 {
    public final Context a;
    public final pgz b;
    public final c c = c.d;
    public final List d = Collections.synchronizedList(new ArrayList());
    public final gkc0 e;

    public a(Context context, pgz pgzVar) {
        this.a = context;
        this.b = pgzVar;
        this.e = new gkc0(pgzVar);
    }

    public static final com.android.billingclient.api.a f(a aVar) {
        h32 h32Var = new h32(aVar.a);
        h32Var.a = new vms(6);
        h32Var.c = aVar;
        return h32Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[LOOP:0: B:11:0x008a->B:13:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ocd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, PlusPayInAppProductType plusPayInAppProductType, ContinuationImpl continuationImpl) {
        GoogleBilling7PlusPayInAppPaymentFacade$getProducts$1 googleBilling7PlusPayInAppPaymentFacade$getProducts$1;
        int i;
        String str;
        Iterator it;
        if (continuationImpl instanceof GoogleBilling7PlusPayInAppPaymentFacade$getProducts$1) {
            googleBilling7PlusPayInAppPaymentFacade$getProducts$1 = (GoogleBilling7PlusPayInAppPaymentFacade$getProducts$1) continuationImpl;
            int i2 = googleBilling7PlusPayInAppPaymentFacade$getProducts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleBilling7PlusPayInAppPaymentFacade$getProducts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = googleBilling7PlusPayInAppPaymentFacade$getProducts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleBilling7PlusPayInAppPaymentFacade$getProducts$1.label;
                if (i != 0) {
                    b.b(obj);
                    int i3 = att.a[plusPayInAppProductType.ordinal()];
                    if (i3 == 1) {
                        str = "subs";
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        str = "inapp";
                    }
                    d dVar = new d(list, str);
                    GoogleBilling7PlusPayInAppPaymentFacade$getProducts$2 googleBilling7PlusPayInAppPaymentFacade$getProducts$2 = new GoogleBilling7PlusPayInAppPaymentFacade$getProducts$2(this);
                    pgz pgzVar = this.b;
                    com.yandex.plus.pay.inapp.google.common.internal.operation.c cVar = new com.yandex.plus.pay.inapp.google.common.internal.operation.c(pgzVar, new com.yandex.plus.pay.inapp.google.common.internal.operation.b(pgzVar, new com.yandex.plus.pay.inapp.google.internal.operation.decorator.a(googleBilling7PlusPayInAppPaymentFacade$getProducts$2, pgzVar, dVar)));
                    googleBilling7PlusPayInAppPaymentFacade$getProducts$1.L$0 = null;
                    googleBilling7PlusPayInAppPaymentFacade$getProducts$1.L$1 = null;
                    googleBilling7PlusPayInAppPaymentFacade$getProducts$1.label = 1;
                    obj = com.yandex.plus.pay.inapp.google.common.internal.operation.a.a(cVar, zy11.a, googleBilling7PlusPayInAppPaymentFacade$getProducts$1);
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
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new bwt((t7f0) it.next()));
                }
                return arrayList;
            }
        }
        googleBilling7PlusPayInAppPaymentFacade$getProducts$1 = new GoogleBilling7PlusPayInAppPaymentFacade$getProducts$1(this, continuationImpl);
        Object obj2 = googleBilling7PlusPayInAppPaymentFacade$getProducts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleBilling7PlusPayInAppPaymentFacade$getProducts$1.label;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(tcc.n(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008a A[LOOP:0: B:11:0x0084->B:13:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ocd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayInAppProductType plusPayInAppProductType, ContinuationImpl continuationImpl) {
        GoogleBilling7PlusPayInAppPaymentFacade$getPurchases$1 googleBilling7PlusPayInAppPaymentFacade$getPurchases$1;
        int i;
        String str;
        if (continuationImpl instanceof GoogleBilling7PlusPayInAppPaymentFacade$getPurchases$1) {
            googleBilling7PlusPayInAppPaymentFacade$getPurchases$1 = (GoogleBilling7PlusPayInAppPaymentFacade$getPurchases$1) continuationImpl;
            int i2 = googleBilling7PlusPayInAppPaymentFacade$getPurchases$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleBilling7PlusPayInAppPaymentFacade$getPurchases$1.label = i2 - Integer.MIN_VALUE;
                Object obj = googleBilling7PlusPayInAppPaymentFacade$getPurchases$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleBilling7PlusPayInAppPaymentFacade$getPurchases$1.label;
                if (i != 0) {
                    b.b(obj);
                    int i3 = att.a[plusPayInAppProductType.ordinal()];
                    if (i3 == 1) {
                        str = "subs";
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        str = "inapp";
                    }
                    e eVar = new e(str);
                    GoogleBilling7PlusPayInAppPaymentFacade$getPurchases$2 googleBilling7PlusPayInAppPaymentFacade$getPurchases$2 = new GoogleBilling7PlusPayInAppPaymentFacade$getPurchases$2(this);
                    pgz pgzVar = this.b;
                    com.yandex.plus.pay.inapp.google.common.internal.operation.c cVar = new com.yandex.plus.pay.inapp.google.common.internal.operation.c(pgzVar, new com.yandex.plus.pay.inapp.google.common.internal.operation.b(pgzVar, new com.yandex.plus.pay.inapp.google.internal.operation.decorator.a(googleBilling7PlusPayInAppPaymentFacade$getPurchases$2, pgzVar, eVar)));
                    googleBilling7PlusPayInAppPaymentFacade$getPurchases$1.L$0 = null;
                    googleBilling7PlusPayInAppPaymentFacade$getPurchases$1.label = 1;
                    obj = com.yandex.plus.pay.inapp.google.common.internal.operation.a.a(cVar, zy11.a, googleBilling7PlusPayInAppPaymentFacade$getPurchases$1);
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
                Iterable<Purchase> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
                for (Purchase purchase : iterable) {
                    arrayList.add(new rcd0(purchase.a(), purchase.c(), Base64.encodeToString(purchase.b().getBytes(uza.a), 2), purchase.e(), purchase.d(), purchase.f(), purchase.g()));
                }
                return arrayList;
            }
        }
        googleBilling7PlusPayInAppPaymentFacade$getPurchases$1 = new GoogleBilling7PlusPayInAppPaymentFacade$getPurchases$1(this, continuationImpl);
        Object obj2 = googleBilling7PlusPayInAppPaymentFacade$getPurchases$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleBilling7PlusPayInAppPaymentFacade$getPurchases$1.label;
        if (i != 0) {
        }
        Iterable<Purchase> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(tcc.n(iterable2, 10));
        while (r14.hasNext()) {
        }
        return arrayList2;
    }

    @Override // defpackage.ocd0
    public final Object c(rcd0 rcd0Var, ContinuationImpl continuationImpl) {
        fcd0 aVar = rcd0Var.b() ? new com.yandex.plus.pay.inapp.google.internal.operation.a(rcd0Var.a()) : new com.yandex.plus.pay.inapp.google.internal.operation.b(rcd0Var.a());
        GoogleBilling7PlusPayInAppPaymentFacade$completePurchase$2 googleBilling7PlusPayInAppPaymentFacade$completePurchase$2 = new GoogleBilling7PlusPayInAppPaymentFacade$completePurchase$2(this);
        pgz pgzVar = this.b;
        com.yandex.plus.pay.inapp.google.common.internal.operation.c cVar = new com.yandex.plus.pay.inapp.google.common.internal.operation.c(pgzVar, new com.yandex.plus.pay.inapp.google.common.internal.operation.b(pgzVar, new com.yandex.plus.pay.inapp.google.internal.operation.decorator.a(googleBilling7PlusPayInAppPaymentFacade$completePurchase$2, pgzVar, aVar)));
        zy11 zy11Var = zy11.a;
        Object a = com.yandex.plus.pay.inapp.google.common.internal.operation.a.a(cVar, zy11Var, continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00b6, code lost:
    
        if (r15 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x007f, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ocd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(bwt bwtVar, ucd0 ucd0Var, ContinuationImpl continuationImpl) {
        GoogleBilling7PlusPayInAppPaymentFacade$purchase$1 googleBilling7PlusPayInAppPaymentFacade$purchase$1;
        int i;
        t7f0 c;
        Object failure;
        if (continuationImpl instanceof GoogleBilling7PlusPayInAppPaymentFacade$purchase$1) {
            googleBilling7PlusPayInAppPaymentFacade$purchase$1 = (GoogleBilling7PlusPayInAppPaymentFacade$purchase$1) continuationImpl;
            int i2 = googleBilling7PlusPayInAppPaymentFacade$purchase$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleBilling7PlusPayInAppPaymentFacade$purchase$1.label = i2 - Integer.MIN_VALUE;
                Object obj = googleBilling7PlusPayInAppPaymentFacade$purchase$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleBilling7PlusPayInAppPaymentFacade$purchase$1.label;
                int i3 = 1;
                Object obj2 = null;
                if (i != 0) {
                    b.b(obj);
                    if (bwtVar == null) {
                        bwtVar = null;
                    }
                    if (bwtVar == null) {
                        ny61.r("Expected google play product to start purchase");
                        return null;
                    }
                    c = bwtVar.c();
                    googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$0 = null;
                    googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$1 = null;
                    googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$2 = null;
                    googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$3 = c;
                    googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$4 = ucd0Var;
                    googleBilling7PlusPayInAppPaymentFacade$purchase$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(new pb(this.c.c, i3), googleBilling7PlusPayInAppPaymentFacade$purchase$1);
                } else if (i == 1) {
                    ucd0Var = (ucd0) googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$4;
                    c = (t7f0) googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$3;
                    b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    Purchase purchase = (Purchase) obj;
                    String b = purchase.b();
                    String e = purchase.e();
                    pgz pgzVar = this.e.a;
                    int i4 = 0;
                    if (!TextUtils.isEmpty(b)) {
                        if (!TextUtils.isEmpty("") && !TextUtils.isEmpty(e)) {
                            try {
                                PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("", 0)));
                                try {
                                    failure = Base64.decode(e, 0);
                                } catch (Throwable th) {
                                    failure = new Result.Failure(th);
                                }
                                if (Result.a(failure) == null) {
                                    obj2 = failure;
                                } else {
                                    LogPriority logPriority = LogPriority.ERROR;
                                    if (pgzVar.e(logPriority)) {
                                        pgzVar.a(logPriority, "PlusPayGooglePurchaseVerifier", "Base64 decoding failed.");
                                    }
                                }
                                byte[] bArr = (byte[]) obj2;
                                try {
                                    Signature signature = Signature.getInstance(JCP.SIGN_SHA1_RSA_NAME);
                                    signature.initVerify(generatePublic);
                                    signature.update(b.getBytes(uza.a));
                                    if (bArr == null || !signature.verify(bArr)) {
                                        i3 = 0;
                                    }
                                    if (i3 == 0) {
                                        LogPriority logPriority2 = LogPriority.ERROR;
                                        if (pgzVar.e(logPriority2)) {
                                            pgzVar.a(logPriority2, "PlusPayGooglePurchaseVerifier", "Signature verification failed.");
                                        }
                                    }
                                    i4 = i3;
                                } catch (InvalidKeyException unused) {
                                    LogPriority logPriority3 = LogPriority.ERROR;
                                    if (pgzVar.e(logPriority3)) {
                                        pgzVar.a(logPriority3, "PlusPayGooglePurchaseVerifier", "Invalid key specification.");
                                    }
                                } catch (NoSuchAlgorithmException e2) {
                                    String message = e2.getMessage();
                                    throw new IllegalStateException((message != null ? message : "").toString());
                                } catch (SignatureException unused2) {
                                    LogPriority logPriority4 = LogPriority.ERROR;
                                    if (pgzVar.e(logPriority4)) {
                                        pgzVar.a(logPriority4, "PlusPayGooglePurchaseVerifier", "Signature exception.");
                                    }
                                }
                                if (i4 == 0) {
                                    return new rcd0(purchase.a(), purchase.c(), Base64.encodeToString(purchase.b().getBytes(uza.a), 2), purchase.e(), purchase.d(), false, purchase.g());
                                }
                                throw new PlusPayInAppInvalidSignatureException();
                            } catch (NoSuchAlgorithmException e3) {
                                String message2 = e3.getMessage();
                                throw new IllegalStateException((message2 != null ? message2 : "").toString());
                            } catch (InvalidKeySpecException e4) {
                                String str = "Invalid key specification: " + e4;
                                LogPriority logPriority5 = LogPriority.ERROR;
                                if (pgzVar.e(logPriority5)) {
                                    pgzVar.a(logPriority5, "PlusPayGooglePurchaseVerifier", str);
                                }
                                ny61.v(str);
                                return null;
                            }
                        }
                    }
                    LogPriority logPriority6 = LogPriority.ERROR;
                    if (pgzVar.e(logPriority6)) {
                        pgzVar.a(logPriority6, "PlusPayGooglePurchaseVerifier", "Purchase verification failed: missing data.");
                    }
                    if (i4 == 0) {
                    }
                }
                f fVar = new f(c, ucd0Var, (Activity) obj, this.d, this.b);
                GoogleBilling7PlusPayInAppPaymentFacade$purchase$2 googleBilling7PlusPayInAppPaymentFacade$purchase$2 = new GoogleBilling7PlusPayInAppPaymentFacade$purchase$2(this);
                pgz pgzVar2 = this.b;
                com.yandex.plus.pay.inapp.google.common.internal.operation.c cVar = new com.yandex.plus.pay.inapp.google.common.internal.operation.c(pgzVar2, new com.yandex.plus.pay.inapp.google.common.internal.operation.b(pgzVar2, new com.yandex.plus.pay.inapp.google.internal.operation.decorator.a(googleBilling7PlusPayInAppPaymentFacade$purchase$2, pgzVar2, fVar)));
                googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$0 = null;
                googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$1 = null;
                googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$2 = null;
                googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$3 = null;
                googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$4 = null;
                googleBilling7PlusPayInAppPaymentFacade$purchase$1.label = 2;
                obj = com.yandex.plus.pay.inapp.google.common.internal.operation.a.a(cVar, zy11.a, googleBilling7PlusPayInAppPaymentFacade$purchase$1);
            }
        }
        googleBilling7PlusPayInAppPaymentFacade$purchase$1 = new GoogleBilling7PlusPayInAppPaymentFacade$purchase$1(this, continuationImpl);
        Object obj3 = googleBilling7PlusPayInAppPaymentFacade$purchase$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleBilling7PlusPayInAppPaymentFacade$purchase$1.label;
        int i32 = 1;
        Object obj22 = null;
        if (i != 0) {
        }
        f fVar2 = new f(c, ucd0Var, (Activity) obj3, this.d, this.b);
        GoogleBilling7PlusPayInAppPaymentFacade$purchase$2 googleBilling7PlusPayInAppPaymentFacade$purchase$22 = new GoogleBilling7PlusPayInAppPaymentFacade$purchase$2(this);
        pgz pgzVar22 = this.b;
        com.yandex.plus.pay.inapp.google.common.internal.operation.c cVar2 = new com.yandex.plus.pay.inapp.google.common.internal.operation.c(pgzVar22, new com.yandex.plus.pay.inapp.google.common.internal.operation.b(pgzVar22, new com.yandex.plus.pay.inapp.google.internal.operation.decorator.a(googleBilling7PlusPayInAppPaymentFacade$purchase$22, pgzVar22, fVar2)));
        googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$0 = null;
        googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$1 = null;
        googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$2 = null;
        googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$3 = null;
        googleBilling7PlusPayInAppPaymentFacade$purchase$1.L$4 = null;
        googleBilling7PlusPayInAppPaymentFacade$purchase$1.label = 2;
        obj3 = com.yandex.plus.pay.inapp.google.common.internal.operation.a.a(cVar2, zy11.a, googleBilling7PlusPayInAppPaymentFacade$purchase$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ocd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        GoogleBilling7PlusPayInAppPaymentFacade$getConfig$1 googleBilling7PlusPayInAppPaymentFacade$getConfig$1;
        int i;
        if (continuationImpl instanceof GoogleBilling7PlusPayInAppPaymentFacade$getConfig$1) {
            googleBilling7PlusPayInAppPaymentFacade$getConfig$1 = (GoogleBilling7PlusPayInAppPaymentFacade$getConfig$1) continuationImpl;
            int i2 = googleBilling7PlusPayInAppPaymentFacade$getConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleBilling7PlusPayInAppPaymentFacade$getConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = googleBilling7PlusPayInAppPaymentFacade$getConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleBilling7PlusPayInAppPaymentFacade$getConfig$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.plus.pay.inapp.google.internal.operation.c cVar = new com.yandex.plus.pay.inapp.google.internal.operation.c();
                    GoogleBilling7PlusPayInAppPaymentFacade$getConfig$config$1 googleBilling7PlusPayInAppPaymentFacade$getConfig$config$1 = new GoogleBilling7PlusPayInAppPaymentFacade$getConfig$config$1(0, this, a.class, "createBillingClient", "createBillingClient()Lcom/android/billingclient/api/BillingClient;", 0);
                    pgz pgzVar = this.b;
                    com.yandex.plus.pay.inapp.google.common.internal.operation.c cVar2 = new com.yandex.plus.pay.inapp.google.common.internal.operation.c(pgzVar, new com.yandex.plus.pay.inapp.google.common.internal.operation.b(pgzVar, new com.yandex.plus.pay.inapp.google.internal.operation.decorator.a(googleBilling7PlusPayInAppPaymentFacade$getConfig$config$1, pgzVar, cVar)));
                    googleBilling7PlusPayInAppPaymentFacade$getConfig$1.label = 1;
                    obj = com.yandex.plus.pay.inapp.google.common.internal.operation.a.a(cVar2, zy11.a, googleBilling7PlusPayInAppPaymentFacade$getConfig$1);
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
                return new mcd0(((hs5) obj).a());
            }
        }
        googleBilling7PlusPayInAppPaymentFacade$getConfig$1 = new GoogleBilling7PlusPayInAppPaymentFacade$getConfig$1(this, continuationImpl);
        Object obj2 = googleBilling7PlusPayInAppPaymentFacade$getConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleBilling7PlusPayInAppPaymentFacade$getConfig$1.label;
        if (i != 0) {
        }
        return new mcd0(((hs5) obj2).a());
    }

    @Override // defpackage.l0g0
    public final void onPurchasesUpdated(ns5 ns5Var, List list) {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "GoogleBilling7Facade", "onPurchaseUpdate(" + ns5Var + Extension.FIX_SPACE + list + ')');
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((l0g0) it.next()).onPurchasesUpdated(ns5Var, list);
        }
    }
}
