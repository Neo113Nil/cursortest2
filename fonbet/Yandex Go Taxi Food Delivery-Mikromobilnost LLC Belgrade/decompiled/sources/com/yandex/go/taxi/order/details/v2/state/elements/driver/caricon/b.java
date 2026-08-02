package com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.response.driver.CarImageDto;
import defpackage.avj0;
import defpackage.edk0;
import defpackage.evu0;
import defpackage.gic;
import defpackage.mgk0;
import defpackage.ngk0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tt2;
import defpackage.vng;
import defpackage.w511;
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
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class b {
    public final gic a;
    public final e b;
    public final zuj0 c;
    public final tt2 d;
    public final edk0 e;
    public final Context f;
    public volatile mgk0 g = new mgk0(0);

    public b(gic gicVar, e eVar, zuj0 zuj0Var, tt2 tt2Var, edk0 edk0Var, Context context) {
        this.a = gicVar;
        this.b = eVar;
        this.c = zuj0Var;
        this.d = tt2Var;
        this.e = edk0Var;
        this.f = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, CarImageDto.CarImageLayers carImageLayers, String str, int i, boolean z, RideCardDriverCarIconRepository$DriverCarType rideCardDriverCarIconRepository$DriverCarType, ContinuationImpl continuationImpl) {
        RideCardDriverCarIconRepository$loadAndCacheIcon$1 rideCardDriverCarIconRepository$loadAndCacheIcon$1;
        int i2;
        Drawable drawable;
        List list;
        bVar.getClass();
        if (continuationImpl instanceof RideCardDriverCarIconRepository$loadAndCacheIcon$1) {
            rideCardDriverCarIconRepository$loadAndCacheIcon$1 = (RideCardDriverCarIconRepository$loadAndCacheIcon$1) continuationImpl;
            int i3 = rideCardDriverCarIconRepository$loadAndCacheIcon$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rideCardDriverCarIconRepository$loadAndCacheIcon$1.label = i3 - Integer.MIN_VALUE;
                Object obj = rideCardDriverCarIconRepository$loadAndCacheIcon$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = rideCardDriverCarIconRepository$loadAndCacheIcon$1.label;
                drawable = null;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    rideCardDriverCarIconRepository$loadAndCacheIcon$1.L$0 = null;
                    rideCardDriverCarIconRepository$loadAndCacheIcon$1.L$1 = str;
                    rideCardDriverCarIconRepository$loadAndCacheIcon$1.L$2 = rideCardDriverCarIconRepository$DriverCarType;
                    rideCardDriverCarIconRepository$loadAndCacheIcon$1.I$0 = i;
                    rideCardDriverCarIconRepository$loadAndCacheIcon$1.Z$0 = z;
                    rideCardDriverCarIconRepository$loadAndCacheIcon$1.label = 1;
                    obj = bVar.c(carImageLayers, z, rideCardDriverCarIconRepository$loadAndCacheIcon$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = rideCardDriverCarIconRepository$loadAndCacheIcon$1.I$0;
                    rideCardDriverCarIconRepository$DriverCarType = (RideCardDriverCarIconRepository$DriverCarType) rideCardDriverCarIconRepository$loadAndCacheIcon$1.L$2;
                    str = (String) rideCardDriverCarIconRepository$loadAndCacheIcon$1.L$1;
                    kotlin.b.b(obj);
                }
                list = (List) obj;
                if ((list.isEmpty() ? list : null) != null) {
                    if (list.isEmpty()) {
                        drawable = bVar.b(rideCardDriverCarIconRepository$DriverCarType);
                    } else {
                        z48 z48Var = (z48) kotlin.collections.a.P(list);
                        gic gicVar = bVar.a;
                        int width = z48Var.b.getWidth();
                        int height = z48Var.b.getHeight();
                        gicVar.getClass();
                        drawable = new BitmapDrawable(bVar.f.getResources(), gic.b(i, width, height, list));
                    }
                }
                if (drawable != null) {
                    bVar.g = new mgk0(str, drawable);
                }
                return drawable;
            }
        }
        rideCardDriverCarIconRepository$loadAndCacheIcon$1 = new RideCardDriverCarIconRepository$loadAndCacheIcon$1(bVar, continuationImpl);
        Object obj3 = rideCardDriverCarIconRepository$loadAndCacheIcon$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = rideCardDriverCarIconRepository$loadAndCacheIcon$1.label;
        drawable = null;
        if (i2 != 0) {
        }
        list = (List) obj3;
        if ((list.isEmpty() ? list : null) != null) {
        }
        if (drawable != null) {
        }
        return drawable;
    }

    public final Drawable b(RideCardDriverCarIconRepository$DriverCarType rideCardDriverCarIconRepository$DriverCarType) {
        Drawable t;
        int i = ngk0.a[rideCardDriverCarIconRepository$DriverCarType.ordinal()];
        edk0 edk0Var = this.e;
        zuj0 zuj0Var = this.c;
        if (i == 1) {
            t = vng.t(edk0Var.getIconType().getFull(), ((avj0) zuj0Var).a);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            t = vng.t(edk0Var.getIconType().getSimple(), ((avj0) zuj0Var).a);
        }
        return t == null ? new FormattedTextConverter$EmptyDrawable() : t;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0163 -> B:11:0x0164). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(CarImageDto.CarImageLayers carImageLayers, boolean z, ContinuationImpl continuationImpl) {
        RideCardDriverCarIconRepository$loadIconParts$1 rideCardDriverCarIconRepository$loadIconParts$1;
        int i;
        Collection arrayList;
        Iterator it;
        boolean z2;
        CarIconPart$Layer carIconPart$Layer;
        Collection collection;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof RideCardDriverCarIconRepository$loadIconParts$1) {
            rideCardDriverCarIconRepository$loadIconParts$1 = (RideCardDriverCarIconRepository$loadIconParts$1) continuationImpl;
            int i2 = rideCardDriverCarIconRepository$loadIconParts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverCarIconRepository$loadIconParts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardDriverCarIconRepository$loadIconParts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverCarIconRepository$loadIconParts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List g = scc.g(new Pair(CarIconPart$Layer.MASK, carImageLayers.a), new Pair(CarIconPart$Layer.SHADOW, carImageLayers.b), new Pair(CarIconPart$Layer.WARM_LIGHT, carImageLayers.c), new Pair(CarIconPart$Layer.SOFT_LIGHT, carImageLayers.d), new Pair(CarIconPart$Layer.HARD_LIGHT, carImageLayers.e), new Pair(CarIconPart$Layer.GLOSSY, carImageLayers.f), new Pair(CarIconPart$Layer.DETAILS, carImageLayers.g));
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
                        z2 = rideCardDriverCarIconRepository$loadIconParts$1.Z$0;
                        arrayList = (Collection) rideCardDriverCarIconRepository$loadIconParts$1.L$8;
                        carIconPart$Layer = (CarIconPart$Layer) rideCardDriverCarIconRepository$loadIconParts$1.L$6;
                        it = (Iterator) rideCardDriverCarIconRepository$loadIconParts$1.L$4;
                        collection = (Collection) rideCardDriverCarIconRepository$loadIconParts$1.L$3;
                        kotlin.b.b(obj);
                        bitmapDrawable = (BitmapDrawable) obj;
                        if (bitmapDrawable != null) {
                            return EmptyList.a;
                        }
                        arrayList.add(new z48(carIconPart$Layer, bitmapDrawable.getBitmap()));
                        arrayList = collection;
                        if (it.hasNext()) {
                            return (List) arrayList;
                        }
                        Pair pair = (Pair) it.next();
                        carIconPart$Layer = (CarIconPart$Layer) pair.getFirst();
                        String str = (String) pair.getSecond();
                        e eVar = this.b;
                        if (z2) {
                            rideCardDriverCarIconRepository$loadIconParts$1.L$0 = null;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$1 = null;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$2 = null;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$3 = arrayList;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$4 = it;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$5 = null;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$6 = carIconPart$Layer;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$7 = null;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$8 = arrayList;
                            rideCardDriverCarIconRepository$loadIconParts$1.Z$0 = z2;
                            rideCardDriverCarIconRepository$loadIconParts$1.label = 1;
                            Object i3 = e.i(eVar, str, null, rideCardDriverCarIconRepository$loadIconParts$1, 14);
                            if (i3 != coroutineSingletons) {
                                collection = arrayList;
                                bitmapDrawable = (BitmapDrawable) i3;
                                if (bitmapDrawable != null) {
                                }
                            }
                        } else {
                            rideCardDriverCarIconRepository$loadIconParts$1.L$0 = null;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$1 = null;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$2 = null;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$3 = arrayList;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$4 = it;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$5 = null;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$6 = carIconPart$Layer;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$7 = null;
                            rideCardDriverCarIconRepository$loadIconParts$1.L$8 = arrayList;
                            rideCardDriverCarIconRepository$loadIconParts$1.Z$0 = z2;
                            rideCardDriverCarIconRepository$loadIconParts$1.label = 2;
                            obj = e.f(eVar, str, null, rideCardDriverCarIconRepository$loadIconParts$1, 6);
                            if (obj != coroutineSingletons) {
                                collection = arrayList;
                                bitmapDrawable = (BitmapDrawable) obj;
                                if (bitmapDrawable != null) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    z2 = rideCardDriverCarIconRepository$loadIconParts$1.Z$0;
                    arrayList = (Collection) rideCardDriverCarIconRepository$loadIconParts$1.L$8;
                    carIconPart$Layer = (CarIconPart$Layer) rideCardDriverCarIconRepository$loadIconParts$1.L$6;
                    it = (Iterator) rideCardDriverCarIconRepository$loadIconParts$1.L$4;
                    collection = (Collection) rideCardDriverCarIconRepository$loadIconParts$1.L$3;
                    kotlin.b.b(obj);
                    bitmapDrawable = (BitmapDrawable) obj;
                    if (bitmapDrawable != null) {
                    }
                }
            }
        }
        rideCardDriverCarIconRepository$loadIconParts$1 = new RideCardDriverCarIconRepository$loadIconParts$1(this, continuationImpl);
        Object obj3 = rideCardDriverCarIconRepository$loadIconParts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverCarIconRepository$loadIconParts$1.label;
        if (i != 0) {
        }
    }
}
