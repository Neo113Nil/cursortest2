package com.yandex.go.taxi.order.details.v1.elements.driver;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import com.yandex.go.taxi.order.models.api.response.r7;
import defpackage.avj0;
import defpackage.evu0;
import defpackage.gic;
import defpackage.gs70;
import defpackage.m4j;
import defpackage.n4h0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tt2;
import defpackage.vng;
import defpackage.z48;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.ui.api.car.CarIconPart$Layer;
import ru.yandex.taxi.widget.FormattedTextConverter$EmptyDrawable;

/* loaded from: classes14.dex */
public final class b {
    public final gs70 a;
    public final gic b;
    public final ru.yandex.taxi.widget.utils.e c;
    public final zuj0 d;
    public final tt2 e;
    public final Context f;

    public b(gs70 gs70Var, gic gicVar, ru.yandex.taxi.widget.utils.e eVar, zuj0 zuj0Var, tt2 tt2Var, Context context) {
        this.a = gs70Var;
        this.b = gicVar;
        this.c = eVar;
        this.d = zuj0Var;
        this.e = tt2Var;
        this.f = context;
    }

    public static String c(TaxiOrder taxiOrder) {
        SearchInfoResponse$TaxiSearch.PerformerInfoResponse performerInfoResponse;
        if (m4j.a[taxiOrder.h.b.ordinal()] != 1) {
            return taxiOrder.V().g.a;
        }
        r7 r7Var = taxiOrder.V().l0;
        SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch = r7Var instanceof SearchInfoResponse$TaxiSearch ? (SearchInfoResponse$TaxiSearch) r7Var : null;
        if (searchInfoResponse$TaxiSearch == null || (performerInfoResponse = searchInfoResponse$TaxiSearch.f) == null) {
            return null;
        }
        return performerInfoResponse.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, int i, boolean z, ContinuationImpl continuationImpl) {
        DetailsCarIconRepository$loadIcon$3 detailsCarIconRepository$loadIcon$3;
        int i2;
        List list;
        if (continuationImpl instanceof DetailsCarIconRepository$loadIcon$3) {
            detailsCarIconRepository$loadIcon$3 = (DetailsCarIconRepository$loadIcon$3) continuationImpl;
            int i3 = detailsCarIconRepository$loadIcon$3.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                detailsCarIconRepository$loadIcon$3.label = i3 - Integer.MIN_VALUE;
                Object obj = detailsCarIconRepository$loadIcon$3.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = detailsCarIconRepository$loadIcon$3.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    detailsCarIconRepository$loadIcon$3.L$0 = null;
                    detailsCarIconRepository$loadIcon$3.I$0 = i;
                    detailsCarIconRepository$loadIcon$3.Z$0 = z;
                    detailsCarIconRepository$loadIcon$3.label = 1;
                    obj = b(taxiOrder, z, detailsCarIconRepository$loadIcon$3);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = detailsCarIconRepository$loadIcon$3.I$0;
                    kotlin.b.b(obj);
                }
                list = (List) obj;
                if ((list.isEmpty() ? list : null) != null) {
                    return null;
                }
                if (list.isEmpty()) {
                    Drawable t = vng.t(n4h0.car_icon_fallback_yellow, ((avj0) this.d).a);
                    return t == null ? new FormattedTextConverter$EmptyDrawable() : t;
                }
                z48 z48Var = (z48) kotlin.collections.a.P(list);
                int width = z48Var.b.getWidth();
                int height = z48Var.b.getHeight();
                this.b.getClass();
                return new BitmapDrawable(this.f.getResources(), gic.b(i, width, height, list));
            }
        }
        detailsCarIconRepository$loadIcon$3 = new DetailsCarIconRepository$loadIcon$3(this, continuationImpl);
        Object obj3 = detailsCarIconRepository$loadIcon$3.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = detailsCarIconRepository$loadIcon$3.label;
        if (i2 != 0) {
        }
        list = (List) obj3;
        if ((list.isEmpty() ? list : null) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0187 -> B:11:0x018b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TaxiOrder taxiOrder, boolean z, ContinuationImpl continuationImpl) {
        DetailsCarIconRepository$loadIconParts$1 detailsCarIconRepository$loadIconParts$1;
        int i;
        Collection arrayList;
        Iterator it;
        boolean z2;
        CarIconPart$Layer carIconPart$Layer;
        boolean z3;
        Collection collection;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof DetailsCarIconRepository$loadIconParts$1) {
            detailsCarIconRepository$loadIconParts$1 = (DetailsCarIconRepository$loadIconParts$1) continuationImpl;
            int i2 = detailsCarIconRepository$loadIconParts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCarIconRepository$loadIconParts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCarIconRepository$loadIconParts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCarIconRepository$loadIconParts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    OrderDetailsDriverExperiment a = gs70.a(taxiOrder);
                    CarIconPart$Layer carIconPart$Layer2 = CarIconPart$Layer.MASK;
                    OrderDetailsDriverExperiment.CarImageLayers carImageLayers = a.c;
                    List g = scc.g(new Pair(carIconPart$Layer2, carImageLayers.a), new Pair(CarIconPart$Layer.SHADOW, carImageLayers.b), new Pair(CarIconPart$Layer.WARM_LIGHT, carImageLayers.c), new Pair(CarIconPart$Layer.SOFT_LIGHT, carImageLayers.d), new Pair(CarIconPart$Layer.HARD_LIGHT, carImageLayers.e), new Pair(CarIconPart$Layer.GLOSSY, carImageLayers.f), new Pair(CarIconPart$Layer.DETAILS, carImageLayers.g));
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : g) {
                        if (!evu0.J((String) ((Pair) obj2).getSecond())) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = new ArrayList(tcc.n(arrayList2, 10));
                    it = arrayList2.iterator();
                    z2 = z;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = detailsCarIconRepository$loadIconParts$1.Z$0;
                        arrayList = (Collection) detailsCarIconRepository$loadIconParts$1.L$10;
                        carIconPart$Layer = (CarIconPart$Layer) detailsCarIconRepository$loadIconParts$1.L$8;
                        it = (Iterator) detailsCarIconRepository$loadIconParts$1.L$6;
                        collection = (Collection) detailsCarIconRepository$loadIconParts$1.L$5;
                        kotlin.b.b(obj);
                        bitmapDrawable = (BitmapDrawable) obj;
                        if (bitmapDrawable != null) {
                            return EmptyList.a;
                        }
                        arrayList.add(new z48(carIconPart$Layer, bitmapDrawable.getBitmap()));
                        z2 = z3;
                        arrayList = collection;
                        if (it.hasNext()) {
                            return (List) arrayList;
                        }
                        Pair pair = (Pair) it.next();
                        carIconPart$Layer = (CarIconPart$Layer) pair.getFirst();
                        String str = (String) pair.getSecond();
                        ru.yandex.taxi.widget.utils.e eVar = this.c;
                        if (z2) {
                            detailsCarIconRepository$loadIconParts$1.L$0 = null;
                            detailsCarIconRepository$loadIconParts$1.L$1 = null;
                            detailsCarIconRepository$loadIconParts$1.L$2 = null;
                            detailsCarIconRepository$loadIconParts$1.L$3 = null;
                            detailsCarIconRepository$loadIconParts$1.L$4 = null;
                            detailsCarIconRepository$loadIconParts$1.L$5 = arrayList;
                            detailsCarIconRepository$loadIconParts$1.L$6 = it;
                            detailsCarIconRepository$loadIconParts$1.L$7 = null;
                            detailsCarIconRepository$loadIconParts$1.L$8 = carIconPart$Layer;
                            detailsCarIconRepository$loadIconParts$1.L$9 = null;
                            detailsCarIconRepository$loadIconParts$1.L$10 = arrayList;
                            detailsCarIconRepository$loadIconParts$1.Z$0 = z2;
                            detailsCarIconRepository$loadIconParts$1.label = 1;
                            Object i3 = ru.yandex.taxi.widget.utils.e.i(eVar, str, null, detailsCarIconRepository$loadIconParts$1, 14);
                            if (i3 != coroutineSingletons) {
                                z3 = z2;
                                collection = arrayList;
                                bitmapDrawable = (BitmapDrawable) i3;
                                if (bitmapDrawable != null) {
                                }
                            }
                        } else {
                            detailsCarIconRepository$loadIconParts$1.L$0 = null;
                            detailsCarIconRepository$loadIconParts$1.L$1 = null;
                            detailsCarIconRepository$loadIconParts$1.L$2 = null;
                            detailsCarIconRepository$loadIconParts$1.L$3 = null;
                            detailsCarIconRepository$loadIconParts$1.L$4 = null;
                            detailsCarIconRepository$loadIconParts$1.L$5 = arrayList;
                            detailsCarIconRepository$loadIconParts$1.L$6 = it;
                            detailsCarIconRepository$loadIconParts$1.L$7 = null;
                            detailsCarIconRepository$loadIconParts$1.L$8 = carIconPart$Layer;
                            detailsCarIconRepository$loadIconParts$1.L$9 = null;
                            detailsCarIconRepository$loadIconParts$1.L$10 = arrayList;
                            detailsCarIconRepository$loadIconParts$1.Z$0 = z2;
                            detailsCarIconRepository$loadIconParts$1.label = 2;
                            Object f = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, detailsCarIconRepository$loadIconParts$1, 6);
                            if (f != coroutineSingletons) {
                                z3 = z2;
                                obj = f;
                                collection = arrayList;
                                bitmapDrawable = (BitmapDrawable) obj;
                                if (bitmapDrawable != null) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    z3 = detailsCarIconRepository$loadIconParts$1.Z$0;
                    arrayList = (Collection) detailsCarIconRepository$loadIconParts$1.L$10;
                    carIconPart$Layer = (CarIconPart$Layer) detailsCarIconRepository$loadIconParts$1.L$8;
                    it = (Iterator) detailsCarIconRepository$loadIconParts$1.L$6;
                    collection = (Collection) detailsCarIconRepository$loadIconParts$1.L$5;
                    kotlin.b.b(obj);
                    bitmapDrawable = (BitmapDrawable) obj;
                    if (bitmapDrawable != null) {
                    }
                }
            }
        }
        detailsCarIconRepository$loadIconParts$1 = new DetailsCarIconRepository$loadIconParts$1(this, continuationImpl);
        Object obj3 = detailsCarIconRepository$loadIconParts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCarIconRepository$loadIconParts$1.label;
        if (i != 0) {
        }
    }
}
