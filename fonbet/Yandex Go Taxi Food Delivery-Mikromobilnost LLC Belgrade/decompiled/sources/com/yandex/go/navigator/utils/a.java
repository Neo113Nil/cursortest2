package com.yandex.go.navigator.utils;

import com.yandex.go.navigator.incidents.experiment.IncidentsAvailabilityExperiment;
import com.yandex.go.navigator.models.ControlButtonDto;
import com.yandex.go.navigator.models.DeeplinkActionDto;
import com.yandex.go.navigator.models.PredefinedButtonsIds;
import defpackage.ame;
import defpackage.bme;
import defpackage.cf50;
import defpackage.dme;
import defpackage.eme;
import defpackage.ipv;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.nhe0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tle;
import defpackage.tls;
import defpackage.tsy0;
import defpackage.ule;
import defpackage.usy0;
import defpackage.v2h0;
import defpackage.w511;
import defpackage.yle;
import defpackage.zts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.navigator.gas_stations.experiment.c a;
    public final ipv b;
    public final com.yandex.go.navigator.share.experiment.c c;

    public a(com.yandex.go.navigator.gas_stations.experiment.c cVar, ipv ipvVar, com.yandex.go.navigator.share.experiment.c cVar2) {
        this.a = cVar;
        this.b = ipvVar;
        this.c = cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r14 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (r14 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PredefinedButtonsIds predefinedButtonsIds, ContinuationImpl continuationImpl) {
        ControlButtonsDtoMapper$createPredefinedButton$1 controlButtonsDtoMapper$createPredefinedButton$1;
        int i;
        if (continuationImpl instanceof ControlButtonsDtoMapper$createPredefinedButton$1) {
            controlButtonsDtoMapper$createPredefinedButton$1 = (ControlButtonsDtoMapper$createPredefinedButton$1) continuationImpl;
            int i2 = controlButtonsDtoMapper$createPredefinedButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                controlButtonsDtoMapper$createPredefinedButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = controlButtonsDtoMapper$createPredefinedButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = controlButtonsDtoMapper$createPredefinedButton$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    switch (eme.a[predefinedButtonsIds.ordinal()]) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            if (((IncidentsAvailabilityExperiment) this.b.a.b()).b) {
                                break;
                            }
                            break;
                        case 5:
                            controlButtonsDtoMapper$createPredefinedButton$1.L$0 = predefinedButtonsIds;
                            controlButtonsDtoMapper$createPredefinedButton$1.label = 1;
                            obj = this.a.a(controlButtonsDtoMapper$createPredefinedButton$1);
                            break;
                        case 6:
                            controlButtonsDtoMapper$createPredefinedButton$1.L$0 = predefinedButtonsIds;
                            controlButtonsDtoMapper$createPredefinedButton$1.label = 2;
                            obj = this.c.a(controlButtonsDtoMapper$createPredefinedButton$1);
                            break;
                        default:
                            w511.b();
                            break;
                    }
                    return null;
                }
                if (i == 1) {
                    predefinedButtonsIds = (PredefinedButtonsIds) controlButtonsDtoMapper$createPredefinedButton$1.L$0;
                    kotlin.b.b(obj);
                    zts ztsVar = (zts) obj;
                    if (ztsVar.c) {
                        return new dme(predefinedButtonsIds.getId(), new usy0(ztsVar.b), new ule(predefinedButtonsIds.getId()), new ame(v2h0.ic_gas_station_icon), true);
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    predefinedButtonsIds = (PredefinedButtonsIds) controlButtonsDtoMapper$createPredefinedButton$1.L$0;
                    kotlin.b.b(obj);
                    if (((cf50) obj).a) {
                        return new dme(predefinedButtonsIds.getId(), new tsy0(kyh0.navigator_share_route_button_title), new yle(predefinedButtonsIds.getId()), new ame(v2h0.ic_share_route), true);
                    }
                }
                return null;
            }
        }
        controlButtonsDtoMapper$createPredefinedButton$1 = new ControlButtonsDtoMapper$createPredefinedButton$1(this, continuationImpl);
        Object obj2 = controlButtonsDtoMapper$createPredefinedButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = controlButtonsDtoMapper$createPredefinedButton$1.label;
        if (i != 0) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c4 -> B:10:0x00c8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d1 -> B:13:0x00d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, tls tlsVar, ContinuationImpl continuationImpl) {
        ControlButtonsDtoMapper$mapToControlButtons$1 controlButtonsDtoMapper$mapToControlButtons$1;
        int i;
        Iterator it;
        Collection collection;
        Object obj;
        String str;
        if (continuationImpl instanceof ControlButtonsDtoMapper$mapToControlButtons$1) {
            controlButtonsDtoMapper$mapToControlButtons$1 = (ControlButtonsDtoMapper$mapToControlButtons$1) continuationImpl;
            int i2 = controlButtonsDtoMapper$mapToControlButtons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                controlButtonsDtoMapper$mapToControlButtons$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = controlButtonsDtoMapper$mapToControlButtons$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = controlButtonsDtoMapper$mapToControlButtons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    collection = arrayList;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) controlButtonsDtoMapper$mapToControlButtons$1.L$10;
                    ControlButtonDto controlButtonDto = (ControlButtonDto) controlButtonsDtoMapper$mapToControlButtons$1.L$7;
                    it = (Iterator) controlButtonsDtoMapper$mapToControlButtons$1.L$5;
                    Collection collection2 = (Collection) controlButtonsDtoMapper$mapToControlButtons$1.L$4;
                    tls tlsVar2 = (tls) controlButtonsDtoMapper$mapToControlButtons$1.L$1;
                    kotlin.b.b(obj2);
                    dme dmeVar = (dme) obj2;
                    if (dmeVar != null) {
                        ControlButtonDto controlButtonDto2 = controlButtonDto;
                        tlsVar = tlsVar2;
                        String str2 = controlButtonDto2.a;
                        usy0 usy0Var = new usy0((String) tlsVar.invoke(controlButtonDto2.d));
                        String str3 = controlButtonDto2.a;
                        DeeplinkActionDto deeplinkActionDto = controlButtonDto2.b;
                        dmeVar = new dme(str2, usy0Var, (deeplinkActionDto != null || (str = deeplinkActionDto.a) == null) ? null : new tle(str3, str), new bme(controlButtonDto2.c), false);
                        collection.add(dmeVar);
                        collection = collection2;
                        if (!it.hasNext()) {
                            controlButtonDto2 = (ControlButtonDto) it.next();
                            nhe0 nhe0Var = PredefinedButtonsIds.Companion;
                            String str4 = controlButtonDto2.a;
                            nhe0Var.getClass();
                            Iterator<E> it2 = PredefinedButtonsIds.a().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it2.next();
                                if (jl40.l(((PredefinedButtonsIds) obj).getId(), str4)) {
                                    break;
                                }
                            }
                            PredefinedButtonsIds predefinedButtonsIds = (PredefinedButtonsIds) obj;
                            if (predefinedButtonsIds != null) {
                                controlButtonsDtoMapper$mapToControlButtons$1.L$0 = null;
                                controlButtonsDtoMapper$mapToControlButtons$1.L$1 = tlsVar;
                                controlButtonsDtoMapper$mapToControlButtons$1.L$2 = null;
                                controlButtonsDtoMapper$mapToControlButtons$1.L$3 = null;
                                controlButtonsDtoMapper$mapToControlButtons$1.L$4 = collection;
                                controlButtonsDtoMapper$mapToControlButtons$1.L$5 = it;
                                controlButtonsDtoMapper$mapToControlButtons$1.L$6 = null;
                                controlButtonsDtoMapper$mapToControlButtons$1.L$7 = controlButtonDto2;
                                controlButtonsDtoMapper$mapToControlButtons$1.L$8 = null;
                                controlButtonsDtoMapper$mapToControlButtons$1.L$9 = null;
                                controlButtonsDtoMapper$mapToControlButtons$1.L$10 = collection;
                                controlButtonsDtoMapper$mapToControlButtons$1.label = 1;
                                Object a = a(predefinedButtonsIds, controlButtonsDtoMapper$mapToControlButtons$1);
                                if (a == obj3) {
                                    return obj3;
                                }
                                tlsVar2 = tlsVar;
                                controlButtonDto = controlButtonDto2;
                                obj2 = a;
                                collection2 = collection;
                                dme dmeVar2 = (dme) obj2;
                                if (dmeVar2 != null) {
                                    tlsVar = tlsVar2;
                                    collection.add(dmeVar2);
                                    collection = collection2;
                                    if (!it.hasNext()) {
                                        return (List) collection;
                                    }
                                }
                            } else {
                                collection2 = collection;
                                String str22 = controlButtonDto2.a;
                                usy0 usy0Var2 = new usy0((String) tlsVar.invoke(controlButtonDto2.d));
                                String str32 = controlButtonDto2.a;
                                DeeplinkActionDto deeplinkActionDto2 = controlButtonDto2.b;
                                dmeVar2 = new dme(str22, usy0Var2, (deeplinkActionDto2 != null || (str = deeplinkActionDto2.a) == null) ? null : new tle(str32, str), new bme(controlButtonDto2.c), false);
                                collection.add(dmeVar2);
                                collection = collection2;
                                if (!it.hasNext()) {
                                }
                            }
                        }
                    }
                }
            }
        }
        controlButtonsDtoMapper$mapToControlButtons$1 = new ControlButtonsDtoMapper$mapToControlButtons$1(this, continuationImpl);
        Object obj22 = controlButtonsDtoMapper$mapToControlButtons$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = controlButtonsDtoMapper$mapToControlButtons$1.label;
        if (i != 0) {
        }
    }
}
