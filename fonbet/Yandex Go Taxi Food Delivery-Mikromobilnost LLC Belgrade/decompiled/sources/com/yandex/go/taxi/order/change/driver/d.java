package com.yandex.go.taxi.order.change.driver;

import com.yandex.go.taxi.order.change.common.data.ConfirmChangeResponse;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.a3y0;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.ju8;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.on2;
import defpackage.s8o;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uk70;
import defpackage.uyj;
import defpackage.va9;
import defpackage.w511;
import defpackage.wa9;
import defpackage.we8;
import defpackage.xa9;
import defpackage.ya9;
import defpackage.zn1;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class d {
    public final uk70 a;
    public final tt2 b;
    public final i3y c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public final i3y f = kotlin.a.b(LazyThreadSafetyMode.NONE, new we8(23));

    public d(on2 on2Var, uk70 uk70Var, tt2 tt2Var) {
        this.a = uk70Var;
        this.b = tt2Var;
        this.c = kotlin.a.a(new zn1(on2Var, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, ConfirmChangeResponse confirmChangeResponse, int i, ContinuationImpl continuationImpl) {
        ChangeDriverRepository$handleResponse$1 changeDriverRepository$handleResponse$1;
        int i2;
        boolean b;
        int i3;
        if (continuationImpl instanceof ChangeDriverRepository$handleResponse$1) {
            changeDriverRepository$handleResponse$1 = (ChangeDriverRepository$handleResponse$1) continuationImpl;
            int i4 = changeDriverRepository$handleResponse$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                changeDriverRepository$handleResponse$1.label = i4 - Integer.MIN_VALUE;
                Object obj = changeDriverRepository$handleResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = changeDriverRepository$handleResponse$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    OrderChangesDto.Status status = confirmChangeResponse != null ? confirmChangeResponse.b : null;
                    int i5 = status == null ? -1 : ya9.a[status.ordinal()];
                    if (i5 != -1) {
                        if (i5 == 1) {
                            String str = taxiOrder.a;
                            String str2 = confirmChangeResponse.a;
                            if (str2 == null) {
                                str2 = "";
                            }
                            return new wa9(str, str2);
                        }
                        if (i5 == 2) {
                            b = ((com.yandex.go.taxi.order.cancel.v2.data.d) this.a).b(taxiOrder.a);
                            if (!b || i >= 3) {
                                return new va9(null);
                            }
                            changeDriverRepository$handleResponse$1.L$0 = null;
                            changeDriverRepository$handleResponse$1.L$1 = null;
                            changeDriverRepository$handleResponse$1.L$2 = this;
                            changeDriverRepository$handleResponse$1.L$3 = taxiOrder;
                            changeDriverRepository$handleResponse$1.I$0 = i;
                            changeDriverRepository$handleResponse$1.I$1 = i;
                            changeDriverRepository$handleResponse$1.Z$0 = b;
                            changeDriverRepository$handleResponse$1.label = 1;
                            if (kotlinx.coroutines.a.i(3000L, changeDriverRepository$handleResponse$1) != coroutineSingletons) {
                                i3 = i;
                            }
                        }
                        if (i5 != 3 && i5 != 4) {
                            w511.b();
                            return null;
                        }
                    }
                    a3y0.k((a3y0) this.f.getValue(), null, new ju8(12, confirmChangeResponse), 3);
                    return new va9(confirmChangeResponse);
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                boolean z = changeDriverRepository$handleResponse$1.Z$0;
                i = changeDriverRepository$handleResponse$1.I$1;
                int i6 = changeDriverRepository$handleResponse$1.I$0;
                TaxiOrder taxiOrder2 = (TaxiOrder) changeDriverRepository$handleResponse$1.L$3;
                d dVar = (d) changeDriverRepository$handleResponse$1.L$2;
                kotlin.b.b(obj);
                i3 = i6;
                taxiOrder = taxiOrder2;
                b = z;
                this = dVar;
                changeDriverRepository$handleResponse$1.L$0 = null;
                changeDriverRepository$handleResponse$1.L$1 = null;
                changeDriverRepository$handleResponse$1.L$2 = null;
                changeDriverRepository$handleResponse$1.L$3 = null;
                changeDriverRepository$handleResponse$1.I$0 = i3;
                changeDriverRepository$handleResponse$1.I$1 = i;
                changeDriverRepository$handleResponse$1.Z$0 = b;
                changeDriverRepository$handleResponse$1.label = 2;
                Object b2 = this.b(taxiOrder, i + 1, changeDriverRepository$handleResponse$1);
                return b2 != coroutineSingletons ? coroutineSingletons : b2;
            }
        }
        changeDriverRepository$handleResponse$1 = new ChangeDriverRepository$handleResponse$1(this, continuationImpl);
        Object obj2 = changeDriverRepository$handleResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = changeDriverRepository$handleResponse$1.label;
        if (i2 != 0) {
        }
        changeDriverRepository$handleResponse$1.L$0 = null;
        changeDriverRepository$handleResponse$1.L$1 = null;
        changeDriverRepository$handleResponse$1.L$2 = null;
        changeDriverRepository$handleResponse$1.L$3 = null;
        changeDriverRepository$handleResponse$1.I$0 = i3;
        changeDriverRepository$handleResponse$1.I$1 = i;
        changeDriverRepository$handleResponse$1.Z$0 = b;
        changeDriverRepository$handleResponse$1.label = 2;
        Object b22 = this.b(taxiOrder, i + 1, changeDriverRepository$handleResponse$1);
        if (b22 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(2:19|20))(3:23|24|25))(2:26|27))(3:48|49|(2:51|22))|28|29|30|(1:32)(2:34|(2:45|46)(2:38|(3:44|14|15)(2:41|(2:43|20))))|22))|56|6|7|(0)(0)|28|29|30|(0)(0)|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x011e, code lost:
    
        if (r12 != r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        if (r12 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0130, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0131, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00aa, code lost:
    
        r2 = new kotlin.Result.Failure(r12);
        r12 = r11;
        r11 = r10;
        r10 = r12;
        r12 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TaxiOrder taxiOrder, int i, ContinuationImpl continuationImpl) {
        ChangeDriverRepository$poll$1 changeDriverRepository$poll$1;
        int i2;
        int i3;
        Throwable a;
        boolean b;
        TaxiOrder taxiOrder2;
        ChangeDriverRepository$poll$1 changeDriverRepository$poll$12;
        int i4;
        if (continuationImpl instanceof ChangeDriverRepository$poll$1) {
            changeDriverRepository$poll$1 = (ChangeDriverRepository$poll$1) continuationImpl;
            int i5 = changeDriverRepository$poll$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                changeDriverRepository$poll$1.label = i5 - Integer.MIN_VALUE;
                Object obj = changeDriverRepository$poll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = changeDriverRepository$poll$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    changeDriverRepository$poll$1.L$0 = taxiOrder;
                    changeDriverRepository$poll$1.I$0 = i;
                    changeDriverRepository$poll$1.label = 1;
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new ChangeDriverRepository$makeReorderRequest$2(this, taxiOrder, null), changeDriverRepository$poll$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i2 == 1) {
                    i = changeDriverRepository$poll$1.I$0;
                    taxiOrder = (TaxiOrder) changeDriverRepository$poll$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i2 == 2) {
                        kotlin.b.b(obj);
                        return (xa9) obj;
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (xa9) obj;
                    }
                    boolean z = changeDriverRepository$poll$1.Z$0;
                    i3 = changeDriverRepository$poll$1.I$1;
                    i4 = changeDriverRepository$poll$1.I$0;
                    changeDriverRepository$poll$12 = (ChangeDriverRepository$poll$1) changeDriverRepository$poll$1.L$4;
                    taxiOrder2 = (TaxiOrder) changeDriverRepository$poll$1.L$3;
                    d dVar = (d) changeDriverRepository$poll$1.L$2;
                    kotlin.b.b(obj);
                    b = z;
                    this = dVar;
                    changeDriverRepository$poll$1.L$0 = null;
                    changeDriverRepository$poll$1.L$1 = null;
                    changeDriverRepository$poll$1.L$2 = null;
                    changeDriverRepository$poll$1.L$3 = null;
                    changeDriverRepository$poll$1.L$4 = null;
                    changeDriverRepository$poll$1.I$0 = i4;
                    changeDriverRepository$poll$1.I$1 = i3;
                    changeDriverRepository$poll$1.Z$0 = b;
                    changeDriverRepository$poll$1.label = 4;
                    obj = this.b(taxiOrder2, i3 + 1, changeDriverRepository$poll$12);
                }
                Object obj2 = (ConfirmChangeResponse) obj;
                int i6 = i;
                TaxiOrder taxiOrder3 = taxiOrder;
                i3 = i6;
                a = Result.a(obj2);
                if (a != null) {
                    changeDriverRepository$poll$1.L$0 = null;
                    changeDriverRepository$poll$1.L$1 = null;
                    changeDriverRepository$poll$1.I$0 = i3;
                    changeDriverRepository$poll$1.label = 2;
                    obj = a(taxiOrder3, (ConfirmChangeResponse) obj2, i3, changeDriverRepository$poll$1);
                } else {
                    if (s8o.C(a) || s8o.w(a)) {
                        return new va9(null);
                    }
                    b = ((com.yandex.go.taxi.order.cancel.v2.data.d) this.a).b(taxiOrder3.a);
                    if (!b || i3 >= 3) {
                        obj = new va9(null);
                        return (xa9) obj;
                    }
                    changeDriverRepository$poll$1.L$0 = null;
                    changeDriverRepository$poll$1.L$1 = null;
                    changeDriverRepository$poll$1.L$2 = this;
                    changeDriverRepository$poll$1.L$3 = taxiOrder3;
                    changeDriverRepository$poll$1.L$4 = changeDriverRepository$poll$1;
                    changeDriverRepository$poll$1.I$0 = i3;
                    changeDriverRepository$poll$1.I$1 = i3;
                    changeDriverRepository$poll$1.Z$0 = b;
                    changeDriverRepository$poll$1.label = 3;
                    if (kotlinx.coroutines.a.i(3000L, changeDriverRepository$poll$1) != coroutineSingletons) {
                        taxiOrder2 = taxiOrder3;
                        changeDriverRepository$poll$12 = changeDriverRepository$poll$1;
                        i4 = i3;
                        changeDriverRepository$poll$1.L$0 = null;
                        changeDriverRepository$poll$1.L$1 = null;
                        changeDriverRepository$poll$1.L$2 = null;
                        changeDriverRepository$poll$1.L$3 = null;
                        changeDriverRepository$poll$1.L$4 = null;
                        changeDriverRepository$poll$1.I$0 = i4;
                        changeDriverRepository$poll$1.I$1 = i3;
                        changeDriverRepository$poll$1.Z$0 = b;
                        changeDriverRepository$poll$1.label = 4;
                        obj = this.b(taxiOrder2, i3 + 1, changeDriverRepository$poll$12);
                    }
                }
                return coroutineSingletons;
            }
        }
        changeDriverRepository$poll$1 = new ChangeDriverRepository$poll$1(this, continuationImpl);
        Object obj3 = changeDriverRepository$poll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = changeDriverRepository$poll$1.label;
        if (i2 != 0) {
        }
        Object obj22 = (ConfirmChangeResponse) obj3;
        int i62 = i;
        TaxiOrder taxiOrder32 = taxiOrder;
        i3 = i62;
        a = Result.a(obj22);
        if (a != null) {
        }
        return coroutineSingletons2;
    }
}
