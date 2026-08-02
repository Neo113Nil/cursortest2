package com.yandex.go.superapp.tracking.data;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.a401;
import defpackage.evu0;
import defpackage.f0z0;
import defpackage.g050;
import defpackage.gic;
import defpackage.k401;
import defpackage.kdc;
import defpackage.l401;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.y301;
import defpackage.y48;
import defpackage.yu0;
import defpackage.z301;
import defpackage.z48;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.ui.api.car.CarIconPart$Layer;

/* loaded from: classes8.dex */
public final class a {
    public final Context a;
    public final tt2 b;
    public final ru.yandex.taxi.widget.utils.e c;
    public final y48 d;
    public final gic e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public a(Context context, tt2 tt2Var, ru.yandex.taxi.widget.utils.e eVar, y48 y48Var, gic gicVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = eVar;
        this.d = y48Var;
        this.e = gicVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0115 -> B:10:0x0118). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, k401 k401Var, ContinuationImpl continuationImpl) {
        TrackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1 trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1;
        int i;
        Collection arrayList;
        Iterator it;
        aVar.getClass();
        if (continuationImpl instanceof TrackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1) {
            trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1 = (TrackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1) continuationImpl;
            int i2 = trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List g = scc.g(new Pair(CarIconPart$Layer.MASK, k401Var.d()), new Pair(CarIconPart$Layer.SHADOW, k401Var.e()), new Pair(CarIconPart$Layer.WARM_LIGHT, k401Var.g()), new Pair(CarIconPart$Layer.SOFT_LIGHT, k401Var.f()), new Pair(CarIconPart$Layer.HARD_LIGHT, k401Var.c()), new Pair(CarIconPart$Layer.GLOSSY, k401Var.b()), new Pair(CarIconPart$Layer.DETAILS, k401Var.a()));
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : g) {
                        if (!evu0.J((String) ((Pair) obj2).getSecond())) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = new ArrayList();
                    it = arrayList2.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CarIconPart$Layer carIconPart$Layer = (CarIconPart$Layer) trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$8;
                    it = (Iterator) trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$5;
                    arrayList = (Collection) trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$3;
                    kotlin.b.b(obj);
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                    z48 z48Var = bitmapDrawable != null ? null : new z48(carIconPart$Layer, bitmapDrawable.getBitmap());
                    if (z48Var != null) {
                        arrayList.add(z48Var);
                    }
                    if (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        CarIconPart$Layer carIconPart$Layer2 = (CarIconPart$Layer) pair.getFirst();
                        String str = (String) pair.getSecond();
                        ru.yandex.taxi.widget.utils.e eVar = aVar.c;
                        trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$0 = null;
                        trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$1 = null;
                        trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$2 = null;
                        trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$3 = arrayList;
                        trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$4 = null;
                        trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$5 = it;
                        trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$6 = null;
                        trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$7 = null;
                        trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$8 = carIconPart$Layer2;
                        trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.L$9 = null;
                        trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.label = 1;
                        Object f = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1, 6);
                        if (f == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = f;
                        carIconPart$Layer = carIconPart$Layer2;
                        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                        if (bitmapDrawable2 != null) {
                        }
                        if (z48Var != null) {
                        }
                        if (it.hasNext()) {
                            return (List) arrayList;
                        }
                    }
                }
            }
        }
        trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1 = new TrackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1(aVar, continuationImpl);
        Object obj3 = trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingCardPlateLayeredImageRepositoryImpl$loadIconParts$1.label;
        if (i != 0) {
        }
    }

    public final Object b(kdc kdcVar, Continuation continuation) {
        return d(new y301(kdcVar), new TrackingCardPlateLayeredImageRepositoryImpl$getColoredDefaultCarImage$2(this, kdcVar, null), (ContinuationImpl) continuation);
    }

    public final Object c(l401 l401Var, Continuation continuation) {
        return d(new z301(l401Var), new TrackingCardPlateLayeredImageRepositoryImpl$getLayeredImage$2(this, l401Var, null), (ContinuationImpl) continuation);
    }

    public final Object d(a401 a401Var, tls tlsVar, ContinuationImpl continuationImpl) {
        Drawable drawable;
        WeakReference weakReference = (WeakReference) this.f.get(a401Var);
        if (weakReference != null && (drawable = (Drawable) weakReference.get()) != null) {
            return drawable;
        }
        g050 g050Var = (g050) this.g.computeIfAbsent(a401Var, new yu0(25, new f0z0(23)));
        this.b.getClass();
        return tje.k0(uyj.a, new TrackingCardPlateLayeredImageRepositoryImpl$withCache$3(g050Var, this, a401Var, tlsVar, null), continuationImpl);
    }
}
