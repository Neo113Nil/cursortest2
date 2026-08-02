package com.yandex.go.taxi.order.map;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.order.map.overlay.traffic.TrafficLightWithSignal$Signal;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment;
import com.yandex.mapkit.geometry.Point;
import defpackage.a901;
import defpackage.ftk0;
import defpackage.gtk0;
import defpackage.htk0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.wls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class g {
    public final ru.yandex.taxi.widget.utils.e a;

    public g(ru.yandex.taxi.widget.utils.e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x01cf -> B:11:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0163 -> B:22:0x0167). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, List list, List list2, List list3, BitmapDrawable bitmapDrawable, int i, wls wlsVar, ContinuationImpl continuationImpl) {
        RoadObjectUiStateMapper$getTrafficLightObjects$1 roadObjectUiStateMapper$getTrafficLightObjects$1;
        int i2;
        Iterator it;
        ArrayList arrayList;
        List list4;
        wls wlsVar2;
        RoadObjectUiStateMapper$getTrafficLightObjects$1 roadObjectUiStateMapper$getTrafficLightObjects$12;
        Iterator it2;
        int i3;
        boolean z2;
        boolean z3;
        int min;
        List list5;
        wls wlsVar3;
        List list6;
        int i4;
        int i5;
        int i6;
        if (continuationImpl instanceof RoadObjectUiStateMapper$getTrafficLightObjects$1) {
            roadObjectUiStateMapper$getTrafficLightObjects$1 = (RoadObjectUiStateMapper$getTrafficLightObjects$1) continuationImpl;
            int i7 = roadObjectUiStateMapper$getTrafficLightObjects$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                roadObjectUiStateMapper$getTrafficLightObjects$1.label = i7 - Integer.MIN_VALUE;
                Object obj = roadObjectUiStateMapper$getTrafficLightObjects$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = roadObjectUiStateMapper$getTrafficLightObjects$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    if (!z) {
                        List A0 = kotlin.collections.a.A0(list2, i);
                        ArrayList arrayList2 = new ArrayList(tcc.n(A0, 10));
                        Iterator it3 = A0.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new gtk0((Point) it3.next(), bitmapDrawable.getBitmap()));
                        }
                        return arrayList2;
                    }
                    List A02 = kotlin.collections.a.A0(list, i);
                    List list7 = list3;
                    Iterator it4 = A02.iterator();
                    it = list7.iterator();
                    arrayList = new ArrayList(Math.min(tcc.n(A02, 10), tcc.n(list7, 10)));
                    list4 = list2;
                    wlsVar2 = wlsVar;
                    roadObjectUiStateMapper$getTrafficLightObjects$12 = roadObjectUiStateMapper$getTrafficLightObjects$1;
                    it2 = it4;
                    i3 = i;
                    z2 = z;
                    if (!it2.hasNext()) {
                    }
                    ArrayList arrayList3 = new ArrayList(arrayList);
                    int size = arrayList3.size();
                    z3 = z2;
                    min = Math.min(list4.size(), i3);
                    list5 = list4;
                    wlsVar3 = wlsVar2;
                    list6 = arrayList3;
                    i4 = size;
                    i5 = i4;
                    i6 = i3;
                    roadObjectUiStateMapper$getTrafficLightObjects$1 = roadObjectUiStateMapper$getTrafficLightObjects$12;
                    if (i4 < min) {
                    }
                } else if (i2 == 1) {
                    int i8 = roadObjectUiStateMapper$getTrafficLightObjects$1.I$0;
                    boolean z4 = roadObjectUiStateMapper$getTrafficLightObjects$1.Z$0;
                    ArrayList arrayList4 = (ArrayList) roadObjectUiStateMapper$getTrafficLightObjects$1.L$13;
                    Point point = (Point) roadObjectUiStateMapper$getTrafficLightObjects$1.L$12;
                    ArrayList arrayList5 = (ArrayList) roadObjectUiStateMapper$getTrafficLightObjects$1.L$9;
                    Iterator it5 = (Iterator) roadObjectUiStateMapper$getTrafficLightObjects$1.L$8;
                    it2 = (Iterator) roadObjectUiStateMapper$getTrafficLightObjects$1.L$7;
                    wls wlsVar4 = (wls) roadObjectUiStateMapper$getTrafficLightObjects$1.L$4;
                    List list8 = (List) roadObjectUiStateMapper$getTrafficLightObjects$1.L$1;
                    kotlin.b.b(obj);
                    RoadObjectUiStateMapper$getTrafficLightObjects$1 roadObjectUiStateMapper$getTrafficLightObjects$13 = roadObjectUiStateMapper$getTrafficLightObjects$1;
                    i3 = i8;
                    z2 = z4;
                    wlsVar2 = wlsVar4;
                    Point point2 = point;
                    RoadObjectUiStateMapper$getTrafficLightObjects$1 roadObjectUiStateMapper$getTrafficLightObjects$14 = roadObjectUiStateMapper$getTrafficLightObjects$13;
                    arrayList = arrayList5;
                    it = it5;
                    arrayList4.add(new gtk0(point2, (Bitmap) obj));
                    roadObjectUiStateMapper$getTrafficLightObjects$12 = roadObjectUiStateMapper$getTrafficLightObjects$14;
                    list4 = list8;
                    if (!it2.hasNext() && it.hasNext()) {
                        Object next = it2.next();
                        point2 = (Point) it.next();
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$0 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$1 = list4;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$2 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$3 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$4 = wlsVar2;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$5 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$6 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$7 = it2;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$8 = it;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$9 = arrayList;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$10 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$11 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$12 = point2;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.L$13 = arrayList;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.Z$0 = z2;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.I$0 = i3;
                        roadObjectUiStateMapper$getTrafficLightObjects$12.label = 1;
                        Object invoke = wlsVar2.invoke((a901) next, roadObjectUiStateMapper$getTrafficLightObjects$12);
                        if (invoke != coroutineSingletons) {
                            list8 = list4;
                            obj = invoke;
                            roadObjectUiStateMapper$getTrafficLightObjects$14 = roadObjectUiStateMapper$getTrafficLightObjects$12;
                            arrayList4 = arrayList;
                            arrayList4.add(new gtk0(point2, (Bitmap) obj));
                            roadObjectUiStateMapper$getTrafficLightObjects$12 = roadObjectUiStateMapper$getTrafficLightObjects$14;
                            list4 = list8;
                            if (!it2.hasNext()) {
                            }
                            ArrayList arrayList32 = new ArrayList(arrayList);
                            int size2 = arrayList32.size();
                            z3 = z2;
                            min = Math.min(list4.size(), i3);
                            list5 = list4;
                            wlsVar3 = wlsVar2;
                            list6 = arrayList32;
                            i4 = size2;
                            i5 = i4;
                            i6 = i3;
                            roadObjectUiStateMapper$getTrafficLightObjects$1 = roadObjectUiStateMapper$getTrafficLightObjects$12;
                            if (i4 < min) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    ArrayList arrayList322 = new ArrayList(arrayList);
                    int size22 = arrayList322.size();
                    z3 = z2;
                    min = Math.min(list4.size(), i3);
                    list5 = list4;
                    wlsVar3 = wlsVar2;
                    list6 = arrayList322;
                    i4 = size22;
                    i5 = i4;
                    i6 = i3;
                    roadObjectUiStateMapper$getTrafficLightObjects$1 = roadObjectUiStateMapper$getTrafficLightObjects$12;
                    if (i4 < min) {
                    }
                } else {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    min = roadObjectUiStateMapper$getTrafficLightObjects$1.I$3;
                    i4 = roadObjectUiStateMapper$getTrafficLightObjects$1.I$2;
                    i5 = roadObjectUiStateMapper$getTrafficLightObjects$1.I$1;
                    i6 = roadObjectUiStateMapper$getTrafficLightObjects$1.I$0;
                    z3 = roadObjectUiStateMapper$getTrafficLightObjects$1.Z$0;
                    Point point3 = (Point) roadObjectUiStateMapper$getTrafficLightObjects$1.L$9;
                    list6 = (List) roadObjectUiStateMapper$getTrafficLightObjects$1.L$8;
                    List list9 = (List) roadObjectUiStateMapper$getTrafficLightObjects$1.L$5;
                    wlsVar3 = (wls) roadObjectUiStateMapper$getTrafficLightObjects$1.L$4;
                    list5 = (List) roadObjectUiStateMapper$getTrafficLightObjects$1.L$1;
                    kotlin.b.b(obj);
                    list6.add(new gtk0(point3, (Bitmap) obj));
                    i4++;
                    list6 = list9;
                    if (i4 < min) {
                        point3 = (Point) list5.get(i4);
                        a901 a901Var = new a901(TrafficLightWithSignal$Signal.UNKNOWN, point3, null, null);
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$0 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$1 = list5;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$2 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$3 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$4 = wlsVar3;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$5 = list6;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$6 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$7 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$8 = list6;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$9 = point3;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$10 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$11 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$12 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.L$13 = null;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.Z$0 = z3;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.I$0 = i6;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.I$1 = i5;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.I$2 = i4;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.I$3 = min;
                        roadObjectUiStateMapper$getTrafficLightObjects$1.label = 2;
                        obj = wlsVar3.invoke(a901Var, roadObjectUiStateMapper$getTrafficLightObjects$1);
                        if (obj != coroutineSingletons) {
                            list9 = list6;
                            list6.add(new gtk0(point3, (Bitmap) obj));
                            i4++;
                            list6 = list9;
                            if (i4 < min) {
                                return list6;
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        roadObjectUiStateMapper$getTrafficLightObjects$1 = new RoadObjectUiStateMapper$getTrafficLightObjects$1(this, continuationImpl);
        Object obj2 = roadObjectUiStateMapper$getTrafficLightObjects$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = roadObjectUiStateMapper$getTrafficLightObjects$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r0 == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.go.taxi.order.map.g] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ArrayList arrayList, RoadObjectSettingsExperiment.TrafficLight trafficLight, List list2, boolean z, int i, wls wlsVar, ContinuationImpl continuationImpl) {
        RoadObjectUiStateMapper$mapTrafficLights$1 roadObjectUiStateMapper$mapTrafficLights$1;
        int i2;
        ArrayList arrayList2;
        BitmapDrawable bitmapDrawable;
        RoadObjectSettingsExperiment.TrafficLight trafficLight2;
        if (continuationImpl instanceof RoadObjectUiStateMapper$mapTrafficLights$1) {
            roadObjectUiStateMapper$mapTrafficLights$1 = (RoadObjectUiStateMapper$mapTrafficLights$1) continuationImpl;
            int i3 = roadObjectUiStateMapper$mapTrafficLights$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                roadObjectUiStateMapper$mapTrafficLights$1.label = i3 - Integer.MIN_VALUE;
                RoadObjectUiStateMapper$mapTrafficLights$1 roadObjectUiStateMapper$mapTrafficLights$12 = roadObjectUiStateMapper$mapTrafficLights$1;
                Object obj = roadObjectUiStateMapper$mapTrafficLights$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = roadObjectUiStateMapper$mapTrafficLights$12.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    String str = trafficLight.d;
                    roadObjectUiStateMapper$mapTrafficLights$12.L$0 = list;
                    roadObjectUiStateMapper$mapTrafficLights$12.L$1 = arrayList;
                    roadObjectUiStateMapper$mapTrafficLights$12.L$2 = trafficLight;
                    roadObjectUiStateMapper$mapTrafficLights$12.L$3 = list2;
                    roadObjectUiStateMapper$mapTrafficLights$12.L$4 = wlsVar;
                    roadObjectUiStateMapper$mapTrafficLights$12.Z$0 = z;
                    roadObjectUiStateMapper$mapTrafficLights$12.I$0 = i;
                    roadObjectUiStateMapper$mapTrafficLights$12.label = 1;
                    obj = ru.yandex.taxi.widget.utils.e.f(this.a, str, null, roadObjectUiStateMapper$mapTrafficLights$12, 6);
                    arrayList2 = arrayList;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        trafficLight2 = (RoadObjectSettingsExperiment.TrafficLight) roadObjectUiStateMapper$mapTrafficLights$12.L$2;
                        kotlin.b.b(obj);
                        return new htk0(trafficLight2.a, trafficLight2.b, (List) obj);
                    }
                    i = roadObjectUiStateMapper$mapTrafficLights$12.I$0;
                    z = roadObjectUiStateMapper$mapTrafficLights$12.Z$0;
                    wlsVar = (wls) roadObjectUiStateMapper$mapTrafficLights$12.L$4;
                    list2 = (List) roadObjectUiStateMapper$mapTrafficLights$12.L$3;
                    trafficLight = (RoadObjectSettingsExperiment.TrafficLight) roadObjectUiStateMapper$mapTrafficLights$12.L$2;
                    ?? r9 = (List) roadObjectUiStateMapper$mapTrafficLights$12.L$1;
                    list = (List) roadObjectUiStateMapper$mapTrafficLights$12.L$0;
                    kotlin.b.b(obj);
                    arrayList2 = r9;
                }
                RoadObjectSettingsExperiment.TrafficLight trafficLight3 = trafficLight;
                List list3 = list;
                boolean z2 = z;
                List list4 = list2;
                ArrayList arrayList3 = arrayList2;
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    return ftk0.a;
                }
                roadObjectUiStateMapper$mapTrafficLights$12.L$0 = null;
                roadObjectUiStateMapper$mapTrafficLights$12.L$1 = null;
                roadObjectUiStateMapper$mapTrafficLights$12.L$2 = trafficLight3;
                roadObjectUiStateMapper$mapTrafficLights$12.L$3 = null;
                roadObjectUiStateMapper$mapTrafficLights$12.L$4 = null;
                roadObjectUiStateMapper$mapTrafficLights$12.L$5 = null;
                roadObjectUiStateMapper$mapTrafficLights$12.Z$0 = z2;
                roadObjectUiStateMapper$mapTrafficLights$12.I$0 = i;
                roadObjectUiStateMapper$mapTrafficLights$12.label = 2;
                Object a = a(z2, list4, list3, arrayList3, bitmapDrawable, i, wlsVar, roadObjectUiStateMapper$mapTrafficLights$12);
                if (a != coroutineSingletons) {
                    obj = a;
                    trafficLight2 = trafficLight3;
                    return new htk0(trafficLight2.a, trafficLight2.b, (List) obj);
                }
                return coroutineSingletons;
            }
        }
        roadObjectUiStateMapper$mapTrafficLights$1 = new RoadObjectUiStateMapper$mapTrafficLights$1(this, continuationImpl);
        RoadObjectUiStateMapper$mapTrafficLights$1 roadObjectUiStateMapper$mapTrafficLights$122 = roadObjectUiStateMapper$mapTrafficLights$1;
        Object obj2 = roadObjectUiStateMapper$mapTrafficLights$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = roadObjectUiStateMapper$mapTrafficLights$122.label;
        if (i2 != 0) {
        }
        RoadObjectSettingsExperiment.TrafficLight trafficLight32 = trafficLight;
        List list32 = list;
        boolean z22 = z;
        List list42 = list2;
        ArrayList arrayList32 = arrayList2;
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable != null) {
        }
    }
}
