package com.yandex.go.tappable_poi.experiments;

import com.yandex.go.layers.api.presentation.mapkit.MapKitObjectType;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.tappable_poi.experiments.TappablePoiCardExperiment;
import defpackage.hl00;
import defpackage.jbh;
import defpackage.jsq0;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.scc;
import defpackage.t1b0;
import defpackage.tpr;
import java.util.List;
import java.util.Optional;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class c {
    public final t1b0 a;
    public final tpr b;

    public c(rqo rqoVar) {
        TappablePoiCardExperiment.Companion.getClass();
        t1b0 e = ((jbh) rqoVar).e(TappablePoiCardExperiment.e);
        this.a = e;
        this.b = e.a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static Screen b(String str) {
        switch (str.hashCode()) {
            case -2093369835:
                if (str.equals("UNSUPPORTED")) {
                    return Screen.UNSUPPORTED;
                }
                break;
            case -1749151181:
                if (str.equals("SCOOTERS_DISCOVERY")) {
                    return Screen.SCOOTERS_DISCOVERY;
                }
                break;
            case -1677833190:
                if (str.equals("CHOOSE_B")) {
                    return Screen.CHOOSE_B;
                }
                break;
            case -1629579888:
                if (str.equals("DISCOVERY")) {
                    return Screen.DRIVE_DISCOVERY;
                }
                break;
            case -1352877771:
                if (str.equals("ROUTE_SELECTOR")) {
                    return Screen.ROUTE_SELECTOR;
                }
                break;
            case -1212830918:
                if (str.equals("TAXI_MAIN")) {
                    return Screen.TAXI_MAIN;
                }
                break;
            case -1139657850:
                if (str.equals("SUMMARY")) {
                    return Screen.SUMMARY;
                }
                break;
            case -755549641:
                if (str.equals("NAVIGATOR")) {
                    return Screen.NAVIGATOR;
                }
                break;
            case -223630033:
                if (str.equals("TRANSPORT_MAIN")) {
                    return Screen.TRANSPORT_MAIN;
                }
                break;
            case -75883513:
                if (str.equals("ADD_CREDITCARD")) {
                    return Screen.ADD_CREDITCARD;
                }
                break;
            case -38612116:
                if (str.equals("BUNDLED_ORDER_LIST")) {
                    return Screen.BUNDLED_ORDER_LIST;
                }
                break;
            case 2358713:
                if (str.equals("MAIN")) {
                    return Screen.MAIN;
                }
                break;
            case 2402104:
                if (str.equals(JCP.RAW_PREFIX)) {
                    return Screen.NONE;
                }
                break;
            case 75468590:
                if (str.equals("ORDER")) {
                    return Screen.ORDER;
                }
                break;
            case 92857512:
                if (str.equals("ORDER_TRACKING")) {
                    return Screen.ORDER_TRACKING;
                }
                break;
            case 106854465:
                if (str.equals("MOBILITY_HUB")) {
                    return Screen.MOBILITY_HUB;
                }
                break;
            case 134260241:
                if (str.equals("ORDER_DETAILS")) {
                    return Screen.ORDER_DETAILS;
                }
                break;
            case 207430268:
                if (str.equals("WHERE_YOU_ARE")) {
                    return Screen.WHERE_YOU_ARE;
                }
                break;
            case 235624573:
                if (str.equals("NDD_CHOOSE_PVZ")) {
                    return Screen.NDD_CHOOSE_PVZ;
                }
                break;
            case 259485788:
                if (str.equals("INTERCITY_DASHBOARD")) {
                    return Screen.INTERCITY_DASHBOARD;
                }
                break;
            case 414683576:
                if (str.equals("ORDERS_LIST")) {
                    return Screen.ORDERS_LIST;
                }
                break;
            case 451148657:
                if (str.equals("SUMMARY_DRIVE")) {
                    return Screen.SUMMARY_DRIVE;
                }
                break;
            case 558245318:
                if (str.equals("CHARGERS_DISCOVERY")) {
                    return Screen.CHARGERS_DISCOVERY;
                }
                break;
            case 901987077:
                if (str.equals("DELIVERY_DISCOVERY")) {
                    return Screen.DELIVERY_DISCOVERY;
                }
                break;
            case 941683963:
                if (str.equals("DRIVE_DISCOVERY")) {
                    return Screen.DRIVE_DISCOVERY;
                }
                break;
            case 1001355831:
                if (str.equals("FAVORITES")) {
                    return Screen.FAVORITES;
                }
                break;
            case 1493173648:
                if (str.equals("SUMMARY_TRANSPORT")) {
                    return Screen.SUMMARY_TRANSPORT;
                }
                break;
            case 1549036260:
                if (str.equals("MAIN_V4")) {
                    return Screen.MAIN_V4;
                }
                break;
            case 1581015582:
                if (str.equals("DELIVERY_ROUTE")) {
                    return Screen.DELIVERY_ROUTE;
                }
                break;
            case 1763699699:
                if (str.equals("MULTI_AREA")) {
                    return Screen.MULTI_AREA;
                }
                break;
            case 1989559918:
                if (str.equals("MOBILITY_HUB_TRANSPORT_DETAILS")) {
                    return Screen.MOBILITY_HUB_TRANSPORT_DETAILS;
                }
                break;
        }
        return Screen.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Optional optional, Screen screen, DriveState driveState, ContinuationImpl continuationImpl) {
        TappablePoiCardExperimentProvider$getCurrentPoiOptions$1 tappablePoiCardExperimentProvider$getCurrentPoiOptions$1;
        int i;
        List list;
        if (continuationImpl instanceof TappablePoiCardExperimentProvider$getCurrentPoiOptions$1) {
            tappablePoiCardExperimentProvider$getCurrentPoiOptions$1 = (TappablePoiCardExperimentProvider$getCurrentPoiOptions$1) continuationImpl;
            int i2 = tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.L$0 = optional;
                    tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.L$1 = screen;
                    tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.L$2 = driveState;
                    tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.label = 1;
                    obj = this.a.b(tappablePoiCardExperimentProvider$getCurrentPoiOptions$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    driveState = (DriveState) tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.L$2;
                    screen = (Screen) tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.L$1;
                    optional = (Optional) tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.L$0;
                    kotlin.b.b(obj);
                }
                TappablePoiCardExperiment tappablePoiCardExperiment = (TappablePoiCardExperiment) obj;
                if (optional.isPresent() || !tappablePoiCardExperiment.b || ((hl00) optional.get()).e != MapKitObjectType.ORGANISATION || (list = tappablePoiCardExperiment.c) == null) {
                    return null;
                }
                for (Object obj3 : list) {
                    TappablePoiCardExperiment.CardOption cardOption = (TappablePoiCardExperiment.CardOption) obj3;
                    String str = cardOption.a;
                    jsq0 jsq0Var = cardOption.b;
                    if (b(str) == screen && (!scc.g(Screen.ORDER, Screen.ORDERS_LIST, Screen.ORDER_DETAILS, Screen.ORDER_TRACKING).contains(screen) || driveState == null || jsq0Var.a.isEmpty() || jsq0Var.contains(driveState))) {
                        obj2 = obj3;
                        break;
                    }
                }
                return (TappablePoiCardExperiment.CardOption) obj2;
            }
        }
        tappablePoiCardExperimentProvider$getCurrentPoiOptions$1 = new TappablePoiCardExperimentProvider$getCurrentPoiOptions$1(this, continuationImpl);
        Object obj4 = tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tappablePoiCardExperimentProvider$getCurrentPoiOptions$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        TappablePoiCardExperiment tappablePoiCardExperiment2 = (TappablePoiCardExperiment) obj4;
        return optional.isPresent() ? null : null;
    }
}
