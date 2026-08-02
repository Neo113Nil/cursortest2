package com.yandex.mobile.drive.sdk.map;

import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ag00;
import defpackage.bb51;
import defpackage.bgt;
import defpackage.d2r0;
import defpackage.e2r0;
import defpackage.efp0;
import defpackage.es7;
import defpackage.f2r0;
import defpackage.fe5;
import defpackage.jib1;
import defpackage.jl40;
import defpackage.kgp0;
import defpackage.l4r0;
import defpackage.mvg;
import defpackage.n4r0;
import defpackage.ngu0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u1u0;
import defpackage.u621;
import defpackage.vs11;
import defpackage.wls;
import defpackage.xl00;
import defpackage.z2r0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.sdk.map.MapMessenger$setHandlers$1$1", f = "MapMessenger.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MapMessenger$setHandlers$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $handler;
    final /* synthetic */ HashMap<String, Object> $json;
    final /* synthetic */ fe5 $result;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapMessenger$setHandlers$1$1(HashMap hashMap, fe5 fe5Var, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$json = hashMap;
        this.$result = fe5Var;
        this.$handler = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapMessenger$setHandlers$1$1(this.$json, this.$result, this.$handler, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapMessenger$setHandlers$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0287 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        fe5 fe5Var;
        Boolean bool;
        Double d;
        Double d2;
        Double d3;
        Double d4;
        Object z2r0Var;
        String str;
        Boolean bool2;
        Double d5;
        Double d6;
        Double d7;
        Double d8;
        Float f;
        Boolean bool3;
        Double d9;
        Double d10;
        Float f2;
        Float f3;
        ArrayList arrayList;
        Object efp0Var;
        Boolean bool4;
        ArrayList arrayList2;
        Boolean bool5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            HashMap<String, Object> hashMap = this.$json;
            if (hashMap != null) {
                Object obj3 = hashMap.get(Constants.KEY_DATA);
                if (!(obj3 instanceof HashMap)) {
                    obj3 = null;
                }
                HashMap hashMap2 = (HashMap) obj3;
                Object obj4 = hashMap.get("type");
                if (!(obj4 instanceof String)) {
                    obj4 = null;
                }
                String str2 = (String) obj4;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1938783471:
                            if (str2.equals("startPerformanceMetricsCapture")) {
                                obj2 = u1u0.a;
                                break;
                            }
                            break;
                        case -1528379167:
                            if (str2.equals("map/await_loaded") && hashMap2 != null) {
                                Object obj5 = hashMap2.get("timeout");
                                if (!(obj5 instanceof Number)) {
                                    obj5 = null;
                                }
                                Number number = (Number) obj5;
                                if (number != null) {
                                    obj2 = new xl00(number.longValue());
                                    break;
                                }
                            }
                            break;
                        case -1401386552:
                            if (str2.equals("map/set_focus")) {
                                if (hashMap2 != null) {
                                    Object obj6 = hashMap2.get("animate");
                                    if (!(obj6 instanceof Boolean)) {
                                        obj6 = null;
                                    }
                                    bool = (Boolean) obj6;
                                } else {
                                    bool = null;
                                }
                                if (hashMap2 != null) {
                                    Object obj7 = hashMap2.get("left");
                                    if (!(obj7 instanceof Double)) {
                                        obj7 = null;
                                    }
                                    d = (Double) obj7;
                                } else {
                                    d = null;
                                }
                                if (hashMap2 != null) {
                                    Object obj8 = hashMap2.get("top");
                                    if (!(obj8 instanceof Double)) {
                                        obj8 = null;
                                    }
                                    d2 = (Double) obj8;
                                } else {
                                    d2 = null;
                                }
                                if (hashMap2 != null) {
                                    Object obj9 = hashMap2.get("right");
                                    if (!(obj9 instanceof Double)) {
                                        obj9 = null;
                                    }
                                    d3 = (Double) obj9;
                                } else {
                                    d3 = null;
                                }
                                if (hashMap2 != null) {
                                    Object obj10 = hashMap2.get("bottom");
                                    if (!(obj10 instanceof Double)) {
                                        obj10 = null;
                                    }
                                    d4 = (Double) obj10;
                                } else {
                                    d4 = null;
                                }
                                z2r0Var = new z2r0(d != null ? ((float) d.doubleValue()) * vs11.a : 0.0f, d2 != null ? ((float) d2.doubleValue()) * vs11.a : 0.0f, d3 != null ? ((float) d3.doubleValue()) * vs11.a : 0.0f, d4 != null ? ((float) d4.doubleValue()) * vs11.a : 0.0f, !jl40.l(bool, Boolean.FALSE));
                                obj2 = z2r0Var;
                                break;
                            }
                            break;
                        case -1389210975:
                            if (str2.equals("map/set_style")) {
                                if (hashMap2 != null) {
                                    Object obj11 = hashMap2.get("style");
                                    if (!(obj11 instanceof String)) {
                                        obj11 = null;
                                    }
                                    str = (String) obj11;
                                } else {
                                    str = null;
                                }
                                if (str != null) {
                                    obj2 = new l4r0(str);
                                    break;
                                }
                            }
                            break;
                        case -1135482288:
                            if (str2.equals("map/camera_position")) {
                                if (hashMap2 != null) {
                                    Object obj12 = hashMap2.get("reset_azimuth_and_tilt");
                                    if (!(obj12 instanceof Boolean)) {
                                        obj12 = null;
                                    }
                                    bool2 = (Boolean) obj12;
                                } else {
                                    bool2 = null;
                                }
                                if (hashMap2 != null) {
                                    Object obj13 = hashMap2.get("sw_lat");
                                    if (!(obj13 instanceof Double)) {
                                        obj13 = null;
                                    }
                                    d5 = (Double) obj13;
                                } else {
                                    d5 = null;
                                }
                                if (hashMap2 != null) {
                                    Object obj14 = hashMap2.get("sw_lon");
                                    if (!(obj14 instanceof Double)) {
                                        obj14 = null;
                                    }
                                    d6 = (Double) obj14;
                                } else {
                                    d6 = null;
                                }
                                if (hashMap2 != null) {
                                    Object obj15 = hashMap2.get("ne_lat");
                                    if (!(obj15 instanceof Double)) {
                                        obj15 = null;
                                    }
                                    d7 = (Double) obj15;
                                } else {
                                    d7 = null;
                                }
                                if (hashMap2 != null) {
                                    Object obj16 = hashMap2.get("ne_lon");
                                    if (!(obj16 instanceof Double)) {
                                        obj16 = null;
                                    }
                                    d8 = (Double) obj16;
                                } else {
                                    d8 = null;
                                }
                                if (d5 != null) {
                                    double doubleValue = d5.doubleValue();
                                    if (d6 != null) {
                                        Point point = new Point(doubleValue, d6.doubleValue());
                                        if (d7 != null) {
                                            double doubleValue2 = d7.doubleValue();
                                            if (d8 != null) {
                                                z2r0Var = new es7(point, new Point(doubleValue2, d8.doubleValue()), jl40.l(bool2, Boolean.TRUE));
                                                obj2 = z2r0Var;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case -939226637:
                            if (str2.equals("map/set_camera_position")) {
                                if (hashMap2 != null) {
                                    Object obj17 = hashMap2.get("zoom");
                                    if (!(obj17 instanceof Number)) {
                                        obj17 = null;
                                    }
                                    Number number2 = (Number) obj17;
                                    if (number2 != null) {
                                        f = Float.valueOf(number2.floatValue());
                                        if (hashMap2 == null) {
                                            Object obj18 = hashMap2.get("animate");
                                            if (!(obj18 instanceof Boolean)) {
                                                obj18 = null;
                                            }
                                            bool3 = (Boolean) obj18;
                                        } else {
                                            bool3 = null;
                                        }
                                        if (hashMap2 != null) {
                                            Object obj19 = hashMap2.get("lat");
                                            if (!(obj19 instanceof Number)) {
                                                obj19 = null;
                                            }
                                            Number number3 = (Number) obj19;
                                            if (number3 != null) {
                                                d9 = Double.valueOf(number3.doubleValue());
                                                if (hashMap2 != null) {
                                                    Object obj20 = hashMap2.get("lon");
                                                    if (!(obj20 instanceof Number)) {
                                                        obj20 = null;
                                                    }
                                                    Number number4 = (Number) obj20;
                                                    if (number4 != null) {
                                                        d10 = Double.valueOf(number4.doubleValue());
                                                        if (hashMap2 != null) {
                                                            Object obj21 = hashMap2.get("tilt");
                                                            if (!(obj21 instanceof Number)) {
                                                                obj21 = null;
                                                            }
                                                            Number number5 = (Number) obj21;
                                                            if (number5 != null) {
                                                                f2 = Float.valueOf(number5.floatValue());
                                                                if (hashMap2 != null) {
                                                                    Object obj22 = hashMap2.get("azimuth");
                                                                    if (!(obj22 instanceof Number)) {
                                                                        obj22 = null;
                                                                    }
                                                                    Number number6 = (Number) obj22;
                                                                    if (number6 != null) {
                                                                        f3 = Float.valueOf(number6.floatValue());
                                                                        if (d9 != null && d10 != null && f != null && f2 != null && f3 != null) {
                                                                            obj2 = new d2r0(new Point(d9.doubleValue(), d10.doubleValue()), f.floatValue(), f2.floatValue(), f3.floatValue(), !jl40.l(bool3, Boolean.FALSE));
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                f3 = null;
                                                                if (d9 != null) {
                                                                    obj2 = new d2r0(new Point(d9.doubleValue(), d10.doubleValue()), f.floatValue(), f2.floatValue(), f3.floatValue(), !jl40.l(bool3, Boolean.FALSE));
                                                                }
                                                            }
                                                        }
                                                        f2 = null;
                                                        if (hashMap2 != null) {
                                                        }
                                                        f3 = null;
                                                        if (d9 != null) {
                                                        }
                                                    }
                                                }
                                                d10 = null;
                                                if (hashMap2 != null) {
                                                }
                                                f2 = null;
                                                if (hashMap2 != null) {
                                                }
                                                f3 = null;
                                                if (d9 != null) {
                                                }
                                            }
                                        }
                                        d9 = null;
                                        if (hashMap2 != null) {
                                        }
                                        d10 = null;
                                        if (hashMap2 != null) {
                                        }
                                        f2 = null;
                                        if (hashMap2 != null) {
                                        }
                                        f3 = null;
                                        if (d9 != null) {
                                        }
                                    }
                                }
                                f = null;
                                if (hashMap2 == null) {
                                }
                                if (hashMap2 != null) {
                                }
                                d9 = null;
                                if (hashMap2 != null) {
                                }
                                d10 = null;
                                if (hashMap2 != null) {
                                }
                                f2 = null;
                                if (hashMap2 != null) {
                                }
                                f3 = null;
                                if (d9 != null) {
                                }
                            }
                            break;
                        case -133649446:
                            if (str2.equals("map/clear")) {
                                obj2 = ag00.a;
                                break;
                            }
                            break;
                        case 479713422:
                            if (str2.equals("map/screen_to_world")) {
                                if (hashMap2 != null) {
                                    Object obj23 = hashMap2.get(CRLDistributionPointsExtension.POINTS);
                                    if (!(obj23 instanceof List)) {
                                        obj23 = null;
                                    }
                                    List<HashMap> list = (List) obj23;
                                    if (list != null) {
                                        arrayList = new ArrayList();
                                        for (HashMap hashMap3 : list) {
                                            Object obj24 = hashMap3.get(RemoteBioParameters.X);
                                            Object obj25 = hashMap3.get(RemoteBioParameters.Y);
                                            ScreenPoint screenPoint = ((obj24 instanceof Number) && (obj25 instanceof Number)) ? new ScreenPoint(((Number) obj24).floatValue(), ((Number) obj25).floatValue()) : null;
                                            if (screenPoint != null) {
                                                arrayList.add(screenPoint);
                                            }
                                        }
                                        if (arrayList != null) {
                                            efp0Var = new efp0(arrayList);
                                            obj2 = efp0Var;
                                            break;
                                        }
                                    }
                                }
                                arrayList = null;
                                if (arrayList != null) {
                                }
                            }
                            break;
                        case 509410378:
                            if (str2.equals("map/set_type") && hashMap2 != null) {
                                Object obj26 = hashMap2.get("type");
                                if (!(obj26 instanceof String)) {
                                    obj26 = null;
                                }
                                String str3 = (String) obj26;
                                if (str3 != null) {
                                    obj2 = new n4r0(str3);
                                    break;
                                }
                            }
                            break;
                        case 636944377:
                            if (str2.equals("map/screenshot")) {
                                obj2 = kgp0.a;
                                break;
                            }
                            break;
                        case 797265567:
                            if (str2.equals("map/set_camera_zoom_enabled")) {
                                if (hashMap2 != null) {
                                    Object obj27 = hashMap2.get(BackendConfig.Restrictions.ENABLED);
                                    if (!(obj27 instanceof Boolean)) {
                                        obj27 = null;
                                    }
                                    bool4 = (Boolean) obj27;
                                } else {
                                    bool4 = null;
                                }
                                obj2 = new e2r0(!jl40.l(bool4, Boolean.FALSE));
                                break;
                            }
                            break;
                        case 843854398:
                            if (str2.equals("updateCarParks") && hashMap2 != null) {
                                Object obj28 = hashMap2.get(Constants.KEY_DATA);
                                if (!(obj28 != null ? obj28 instanceof String : true)) {
                                    obj28 = null;
                                }
                                String str4 = (String) obj28;
                                if (str4 != null) {
                                    obj2 = new u621(str4);
                                    break;
                                }
                            }
                            break;
                        case 1102746481:
                            if (str2.equals("stopPerformanceMetricsCapture")) {
                                obj2 = ngu0.a;
                                break;
                            }
                            break;
                        case 1588734068:
                            if (str2.equals("map/visible_region")) {
                                obj2 = bgt.a;
                                break;
                            }
                            break;
                        case 1609559952:
                            if (str2.equals("map/world_to_screen")) {
                                if (hashMap2 != null) {
                                    Object obj29 = hashMap2.get(CRLDistributionPointsExtension.POINTS);
                                    if (!(obj29 instanceof List)) {
                                        obj29 = null;
                                    }
                                    List list2 = (List) obj29;
                                    if (list2 != null) {
                                        arrayList2 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (it.hasNext()) {
                                            Point f4 = jib1.f((HashMap) it.next());
                                            if (f4 != null) {
                                                arrayList2.add(f4);
                                            }
                                        }
                                        if (arrayList2 != null) {
                                            efp0Var = new bb51(arrayList2);
                                            obj2 = efp0Var;
                                            break;
                                        }
                                    }
                                }
                                arrayList2 = null;
                                if (arrayList2 != null) {
                                }
                            }
                            break;
                        case 1663085467:
                            if (str2.equals("setCarParksVisible")) {
                                if (hashMap2 != null) {
                                    Object obj30 = hashMap2.get("visible");
                                    if (!(obj30 != null ? obj30 instanceof Boolean : true)) {
                                        obj30 = null;
                                    }
                                    bool5 = (Boolean) obj30;
                                } else {
                                    bool5 = null;
                                }
                                obj2 = new f2r0(!jl40.l(bool5, Boolean.FALSE));
                                break;
                            }
                            break;
                    }
                    if (obj2 != null) {
                        this.$result.a(null);
                        return zy11.a;
                    }
                    wls wlsVar = this.$handler;
                    fe5 fe5Var2 = this.$result;
                    this.L$0 = null;
                    this.L$1 = fe5Var2;
                    this.L$2 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = wlsVar.invoke(obj2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fe5Var = fe5Var2;
                }
            }
            obj2 = null;
            if (obj2 != null) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fe5Var = (fe5) this.L$1;
            kotlin.b.b(obj);
        }
        fe5Var.a(obj instanceof zy11 ? null : obj);
        return zy11.a;
    }
}
