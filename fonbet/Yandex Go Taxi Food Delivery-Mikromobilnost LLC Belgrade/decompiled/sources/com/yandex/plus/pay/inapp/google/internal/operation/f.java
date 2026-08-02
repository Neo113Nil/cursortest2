package com.yandex.plus.pay.inapp.google.internal.operation;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzco;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.inapp.google.common.internal.operation.PlusPayGoogleBillingResponse$Code;
import defpackage.b64;
import defpackage.cma1;
import defpackage.d0g0;
import defpackage.es5;
import defpackage.fcd0;
import defpackage.gcd0;
import defpackage.hcd0;
import defpackage.ks5;
import defpackage.kzo;
import defpackage.ls5;
import defpackage.ns5;
import defpackage.nvo;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.s7f0;
import defpackage.t7f0;
import defpackage.ucd0;
import defpackage.w511;
import defpackage.ymu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class f implements fcd0 {
    public final t7f0 a;
    public final ucd0 b;
    public final Activity c;
    public final List d;
    public final pgz e;
    public final String f;

    public f(t7f0 t7f0Var, ucd0 ucd0Var, Activity activity, List list, pgz pgzVar) {
        this.a = t7f0Var;
        this.b = ucd0Var;
        this.c = activity;
        this.d = list;
        this.e = pgzVar;
        this.f = b64.p(new StringBuilder("purchase("), t7f0Var.c, ')');
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // defpackage.fcd0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(es5 es5Var, ContinuationImpl continuationImpl) {
        PurchaseOperation$execute$1 purchaseOperation$execute$1;
        int i;
        pgz pgzVar;
        s7f0 s7f0Var;
        nvo nvoVar;
        ns5 f;
        int i2;
        String str;
        Object next;
        try {
            if (continuationImpl instanceof PurchaseOperation$execute$1) {
                purchaseOperation$execute$1 = (PurchaseOperation$execute$1) continuationImpl;
                int i3 = purchaseOperation$execute$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    purchaseOperation$execute$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = purchaseOperation$execute$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = purchaseOperation$execute$1.label;
                    pgzVar = this.e;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        t7f0 t7f0Var = this.a;
                        ArrayList arrayList = t7f0Var.h;
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                                if (it.hasNext()) {
                                    int size = ((s7f0) next).b.b.size();
                                    do {
                                        Object next2 = it.next();
                                        int size2 = ((s7f0) next2).b.b.size();
                                        if (size < size2) {
                                            next = next2;
                                            size = size2;
                                        }
                                    } while (it.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            s7f0Var = (s7f0) next;
                        } else {
                            s7f0Var = null;
                        }
                        ls5 ls5Var = new ls5();
                        ls5Var.b = 0;
                        ls5Var.c = true;
                        ymu ymuVar = new ymu(25);
                        ymuVar.b = t7f0Var;
                        if (t7f0Var.a() != null) {
                            t7f0Var.a().getClass();
                            String str2 = t7f0Var.a().c;
                            if (str2 != null) {
                                ymuVar.c = str2;
                            }
                        }
                        if (s7f0Var != null && (str = s7f0Var.a) != null) {
                            if (TextUtils.isEmpty(str)) {
                                ny61.g("offerToken can not be empty");
                                return null;
                            }
                            ymuVar.c = str;
                        }
                        t7f0 t7f0Var2 = (t7f0) ymuVar.b;
                        if (t7f0Var2 == null) {
                            ny61.t("ProductDetails is required for constructing ProductDetailsParams.");
                            return null;
                        }
                        if (t7f0Var2.h != null && ((String) ymuVar.c) == null) {
                            ny61.t("offerToken is required for constructing ProductDetailsParams for subscriptions.");
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList(Collections.singletonList(new ks5(ymuVar)));
                        int i4 = 2;
                        ucd0 ucd0Var = this.b;
                        if (ucd0Var != null) {
                            String str3 = ucd0Var.a;
                            int i5 = d0g0.a[ucd0Var.b.ordinal()];
                            if (i5 == 1) {
                                i2 = 5;
                            } else {
                                if (i5 != 2) {
                                    w511.b();
                                    return null;
                                }
                                i2 = 6;
                            }
                            boolean z = (TextUtils.isEmpty(str3) && TextUtils.isEmpty(null)) ? false : true;
                            boolean isEmpty = TextUtils.isEmpty(null);
                            if (z && !isEmpty) {
                                ny61.g("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                                return null;
                            }
                            if (!z && isEmpty) {
                                ny61.g("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                return null;
                            }
                            nvo nvoVar2 = new nvo();
                            nvoVar2.a = str3;
                            nvoVar2.b = i2;
                            ls5Var = new ls5();
                            ls5Var.a = nvoVar2.a;
                            ls5Var.b = nvoVar2.b;
                        }
                        boolean isEmpty2 = arrayList2.isEmpty();
                        if (isEmpty2) {
                            ny61.g("Details of the products must be provided.");
                            return null;
                        }
                        arrayList2.forEach(new Consumer() { // from class: rd91
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj2) {
                                if (((ks5) obj2) != null) {
                                    return;
                                }
                                ny61.g("ProductDetailsParams cannot be null.");
                            }
                        });
                        kzo kzoVar = new kzo(i4);
                        kzoVar.b = (isEmpty2 || ((ks5) arrayList2.get(0)).a.d().isEmpty()) ? false : true;
                        boolean z2 = (TextUtils.isEmpty(ls5Var.a) && TextUtils.isEmpty(null)) ? false : true;
                        boolean isEmpty3 = TextUtils.isEmpty(null);
                        if (z2 && !isEmpty3) {
                            ny61.g("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                        } else if (ls5Var.c || z2 || !isEmpty3) {
                            nvoVar = new nvo();
                            nvoVar.a = ls5Var.a;
                            nvoVar.b = ls5Var.b;
                            kzoVar.c = nvoVar;
                            kzoVar.x = new ArrayList();
                            kzoVar.w = zzco.m(arrayList2);
                            f = es5Var.f(this.c, kzoVar);
                            if (f.a == 0) {
                                return new gcd0(null, cma1.C0(f));
                            }
                            LogPriority logPriority = LogPriority.DEBUG;
                            if (pgzVar.e(logPriority)) {
                                pgzVar.a(logPriority, "PurchaseOperation", "Started waiting for new purchase");
                            }
                            PurchaseOperation$execute$3 purchaseOperation$execute$3 = new PurchaseOperation$execute$3(this, null);
                            purchaseOperation$execute$1.L$0 = null;
                            purchaseOperation$execute$1.L$1 = null;
                            purchaseOperation$execute$1.L$2 = null;
                            purchaseOperation$execute$1.label = 1;
                            obj = kotlinx.coroutines.a.u(60000L, purchaseOperation$execute$3, purchaseOperation$execute$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            ny61.g("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                        }
                        nvoVar = null;
                        kzoVar.c = nvoVar;
                        kzoVar.x = new ArrayList();
                        kzoVar.w = zzco.m(arrayList2);
                        f = es5Var.f(this.c, kzoVar);
                        if (f.a == 0) {
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (gcd0) obj;
                }
            }
            if (i != 0) {
            }
            return (gcd0) obj;
        } catch (TimeoutCancellationException unused) {
            LogPriority logPriority2 = LogPriority.ERROR;
            if (pgzVar.e(logPriority2)) {
                pgzVar.a(logPriority2, "PurchaseOperation", "Purchase was not completed within 60000 ms");
            }
            return new gcd0(null, new hcd0(PlusPayGoogleBillingResponse$Code.PAYMENT_TIMEOUT, "Timeout of waiting for new purchase"));
        }
        purchaseOperation$execute$1 = new PurchaseOperation$execute$1(this, continuationImpl);
        Object obj2 = purchaseOperation$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = purchaseOperation$execute$1.label;
        pgzVar = this.e;
    }

    @Override // defpackage.fcd0
    public final String getName() {
        return this.f;
    }
}
