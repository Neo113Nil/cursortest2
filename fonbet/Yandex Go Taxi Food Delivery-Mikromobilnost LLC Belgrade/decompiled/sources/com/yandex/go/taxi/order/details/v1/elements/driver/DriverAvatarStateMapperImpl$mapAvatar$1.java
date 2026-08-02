package com.yandex.go.taxi.order.details.v1.elements.driver;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.DriverPictures;
import com.yandex.go.taxi.order.models.api.objects.TaxiOrderAdditionalData;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import com.yandex.go.taxi.order.models.api.response.r7;
import defpackage.aim;
import defpackage.avj0;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.gs70;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.vng;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.FormattedTextConverter$EmptyDrawable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lmb4;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.driver.DriverAvatarStateMapperImpl$mapAvatar$1", f = "DriverAvatarStateMapperImpl.kt", l = {35, 42, 43, 44}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DriverAvatarStateMapperImpl$mapAvatar$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriverAvatarStateMapperImpl$mapAvatar$1(e eVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DriverAvatarStateMapperImpl$mapAvatar$1 driverAvatarStateMapperImpl$mapAvatar$1 = new DriverAvatarStateMapperImpl$mapAvatar$1(this.this$0, this.$order, continuation);
        driverAvatarStateMapperImpl$mapAvatar$1.L$0 = obj;
        return driverAvatarStateMapperImpl$mapAvatar$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriverAvatarStateMapperImpl$mapAvatar$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0168, code lost:
    
        if (r0.emit(new defpackage.mb4(new android.graphics.drawable.BitmapDrawable(r5.e.getResources(), r14), false), r13) == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01b4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0181, code lost:
    
        if (com.yandex.go.taxi.order.details.v1.elements.driver.e.a(r5, r0, r2, r14, r13) == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b2, code lost:
    
        if (r0.emit(new defpackage.mb4(r14, false), r13) != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0099, code lost:
    
        if (r14 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009c, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c1, code lost:
    
        r14 = r13.this$0.b;
        r13.L$0 = r0;
        r13.L$1 = r8;
        r13.L$2 = r2;
        r13.label = 1;
        r14.a.getClass();
        r9 = defpackage.uyj.a;
        r14 = defpackage.tje.k0(defpackage.mdh.b, new com.yandex.go.taxi.order.details.v1.elements.driver.DriverAvatarRepository$takeAvatarFromCache$2(r14, r2, null), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00df, code lost:
    
        if (r14 != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00be, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00bc, code lost:
    
        if (r14 == null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OrderDetailsDriverExperiment a;
        String a2;
        String str;
        SearchInfoResponse$TaxiSearch.PerformerInfoResponse performerInfoResponse;
        SearchInfoResponse$TaxiSearch.PerformerInfoResponse performerInfoResponse2;
        int i;
        List list;
        Iterator it;
        Drawable t;
        n7v n7vVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 1;
        if (i2 == 0) {
            kotlin.b.b(obj);
            gs70 gs70Var = this.this$0.a;
            TaxiOrder taxiOrder = this.$order;
            gs70Var.getClass();
            a = gs70.a(taxiOrder);
            e eVar = this.this$0;
            TaxiOrder taxiOrder2 = this.$order;
            eVar.getClass();
            if (aim.a[taxiOrder2.h.b.ordinal()] == 1) {
                r7 r7Var = taxiOrder2.V().l0;
                SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch = r7Var instanceof SearchInfoResponse$TaxiSearch ? (SearchInfoResponse$TaxiSearch) r7Var : null;
                String str2 = (searchInfoResponse$TaxiSearch == null || (performerInfoResponse2 = searchInfoResponse$TaxiSearch.f) == null) ? null : performerInfoResponse2.g;
                a2 = (str2 == null || !(evu0.J(str2) ^ true)) ? (searchInfoResponse$TaxiSearch == null || (performerInfoResponse = searchInfoResponse$TaxiSearch.f) == null) ? null : performerInfoResponse.h : ((m7x0) eVar.c).a(str2);
            } else {
                n7v a3 = taxiOrder2.b().a();
                String str3 = a3.b;
                a2 = (str3 == null || !(evu0.J(str3) ^ true)) ? a3.a : ((m7x0) eVar.c).a(str3);
            }
            return zy11.a;
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        str = (String) this.L$2;
        a = (OrderDetailsDriverExperiment) this.L$1;
        kotlin.b.b(obj);
        Bitmap bitmap = (Bitmap) obj;
        TaxiOrderAdditionalData b = this.$order.b();
        if (b.a != null) {
            n7v a4 = b.a();
            n7v n7vVar2 = n7v.f;
            if (a4.equals(n7vVar2)) {
                DriverPictures driverPictures = b.a;
                if (driverPictures == null || (n7vVar = driverPictures.b) == null) {
                    n7vVar = n7vVar2;
                }
                if (n7vVar.equals(n7vVar2)) {
                    i = 1;
                    list = a.e;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (cvu0.s(str, (String) it.next(), false)) {
                                break;
                            }
                        }
                    }
                    i3 = 0;
                    if (i == 0 || i3 != 0) {
                        e eVar2 = this.this$0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.I$0 = i;
                        this.I$1 = i3;
                        this.label = 2;
                        t = vng.t(f1h0.driver_avatar_fallback, ((avj0) eVar2.d).a);
                        if (t == null) {
                            t = new FormattedTextConverter$EmptyDrawable();
                        }
                    } else {
                        e eVar3 = this.this$0;
                        if (bitmap != null) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.I$0 = i;
                            this.I$1 = i3;
                            this.label = 3;
                            eVar3.getClass();
                        } else {
                            TaxiOrder taxiOrder3 = this.$order;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.I$0 = i;
                            this.I$1 = i3;
                            this.label = 4;
                        }
                    }
                }
            }
        }
        i = 0;
        list = a.e;
        if (list instanceof Collection) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        i3 = 0;
        if (i == 0) {
        }
        e eVar22 = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.I$0 = i;
        this.I$1 = i3;
        this.label = 2;
        t = vng.t(f1h0.driver_avatar_fallback, ((avj0) eVar22.d).a);
        if (t == null) {
        }
    }
}
