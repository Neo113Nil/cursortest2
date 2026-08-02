package com.yandex.go.logistics.cargo_flow.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.zone.interactors.b;
import com.yandex.go.zone.model.Zone;
import defpackage.atd0;
import defpackage.ffp;
import defpackage.jei;
import defpackage.jl40;
import defpackage.kei;
import defpackage.mud0;
import defpackage.ny61;
import defpackage.oo0;
import defpackage.pv0;
import defpackage.qha1;
import defpackage.tpr;
import defpackage.v5v0;
import defpackage.wxh;
import defpackage.y5i;
import defpackage.z81;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public final class a {
    public final b a;
    public final atd0 b;
    public final com.yandex.go.route.interactor.b c;
    public final ru.yandex.taxi.favorites.data.repo.a d;
    public final v5v0 e;
    public final y5i f;
    public final jei g;

    public a(b bVar, atd0 atd0Var, com.yandex.go.route.interactor.b bVar2, ru.yandex.taxi.favorites.data.repo.a aVar, v5v0 v5v0Var, y5i y5iVar, jei jeiVar) {
        this.a = bVar;
        this.b = atd0Var;
        this.c = bVar2;
        this.d = aVar;
        this.e = v5v0Var;
        this.f = y5iVar;
        this.g = jeiVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(4:20|21|(3:25|(2:26|(2:28|(2:30|31)(1:33))(1:34))|32)|(2:36|37)(2:38|39)))(3:40|(1:42)(2:45|(1:47)(1:49))|44)))|53|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        if (r2 == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
    
        if (r2 == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(mud0 mud0Var, RoutePointType routePointType, ContinuationImpl continuationImpl) {
        DeliveryCargoFlowAddressInteractor$getAddress$1 deliveryCargoFlowAddressInteractor$getAddress$1;
        int i;
        List list;
        if (continuationImpl instanceof DeliveryCargoFlowAddressInteractor$getAddress$1) {
            deliveryCargoFlowAddressInteractor$getAddress$1 = (DeliveryCargoFlowAddressInteractor$getAddress$1) continuationImpl;
            int i2 = deliveryCargoFlowAddressInteractor$getAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryCargoFlowAddressInteractor$getAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryCargoFlowAddressInteractor$getAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryCargoFlowAddressInteractor$getAddress$1.label;
                FavoriteAddress favoriteAddress = null;
                Address address = null;
                Object obj2 = null;
                favoriteAddress = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(mud0Var.c, "home_or_default")) {
                        deliveryCargoFlowAddressInteractor$getAddress$1.L$0 = null;
                        deliveryCargoFlowAddressInteractor$getAddress$1.L$1 = null;
                        deliveryCargoFlowAddressInteractor$getAddress$1.label = 1;
                        obj = this.d.c(false, deliveryCargoFlowAddressInteractor$getAddress$1);
                    } else {
                        zzs zzsVar = mud0Var.a;
                        if (zzsVar == null) {
                            return null;
                        }
                        tpr c = atd0.c(this.b, zzsVar, routePointType, null, Action.FINALIZE, mud0Var.e, null, 32);
                        deliveryCargoFlowAddressInteractor$getAddress$1.L$0 = null;
                        deliveryCargoFlowAddressInteractor$getAddress$1.L$1 = null;
                        deliveryCargoFlowAddressInteractor$getAddress$1.L$2 = null;
                        deliveryCargoFlowAddressInteractor$getAddress$1.label = 2;
                        obj = e.y(c, deliveryCargoFlowAddressInteractor$getAddress$1);
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    address = ((pv0) obj).a;
                    return address;
                }
                kotlin.b.b(obj);
                ffp ffpVar = (ffp) obj;
                if (ffpVar != null && (list = ffpVar.a) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((FavoriteAddress) next).getPlaceType() == PlaceType.HOME) {
                            obj2 = next;
                            break;
                        }
                    }
                    favoriteAddress = (FavoriteAddress) obj2;
                }
                return favoriteAddress != null ? z81.f(favoriteAddress) : this.c.c().h();
            }
        }
        deliveryCargoFlowAddressInteractor$getAddress$1 = new DeliveryCargoFlowAddressInteractor$getAddress$1(this, continuationImpl);
        Object obj3 = deliveryCargoFlowAddressInteractor$getAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCargoFlowAddressInteractor$getAddress$1.label;
        FavoriteAddress favoriteAddress2 = null;
        Address address2 = null;
        Object obj22 = null;
        favoriteAddress2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:21|(1:23))(1:24))|12|13|14))|29|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(mud0 mud0Var, RoutePointType routePointType, ContinuationImpl continuationImpl) {
        DeliveryCargoFlowAddressInteractor$getPickupAddress$1 deliveryCargoFlowAddressInteractor$getPickupAddress$1;
        int i;
        if (continuationImpl instanceof DeliveryCargoFlowAddressInteractor$getPickupAddress$1) {
            deliveryCargoFlowAddressInteractor$getPickupAddress$1 = (DeliveryCargoFlowAddressInteractor$getPickupAddress$1) continuationImpl;
            int i2 = deliveryCargoFlowAddressInteractor$getPickupAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryCargoFlowAddressInteractor$getPickupAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryCargoFlowAddressInteractor$getPickupAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryCargoFlowAddressInteractor$getPickupAddress$1.label;
                Address address = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs zzsVar = mud0Var.a;
                    if (zzsVar == null) {
                        return null;
                    }
                    tpr c = atd0.c(this.b, zzsVar, routePointType, null, Action.FINALIZE, Mode.DELIVERY_NDD.getSerializedName(), null, 32);
                    deliveryCargoFlowAddressInteractor$getPickupAddress$1.L$0 = null;
                    deliveryCargoFlowAddressInteractor$getPickupAddress$1.L$1 = null;
                    deliveryCargoFlowAddressInteractor$getPickupAddress$1.L$2 = null;
                    deliveryCargoFlowAddressInteractor$getPickupAddress$1.label = 1;
                    obj = e.y(c, deliveryCargoFlowAddressInteractor$getPickupAddress$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                address = ((pv0) obj).a;
                return address;
            }
        }
        deliveryCargoFlowAddressInteractor$getPickupAddress$1 = new DeliveryCargoFlowAddressInteractor$getPickupAddress$1(this, continuationImpl);
        Object obj2 = deliveryCargoFlowAddressInteractor$getPickupAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCargoFlowAddressInteractor$getPickupAddress$1.label;
        Address address2 = null;
        if (i != 0) {
        }
        address2 = ((pv0) obj2).a;
        return address2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x007d, code lost:
    
        if (r5 == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mud0 mud0Var, ContinuationImpl continuationImpl) {
        DeliveryCargoFlowAddressInteractor$resolveAndSetAddress$1 deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1;
        int i;
        RoutePointType routePointType;
        Object a;
        Address address;
        mud0 mud0Var2;
        Address address2;
        String str;
        mud0 mud0Var3 = mud0Var;
        try {
            if (continuationImpl instanceof DeliveryCargoFlowAddressInteractor$resolveAndSetAddress$1) {
                deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1 = (DeliveryCargoFlowAddressInteractor$resolveAndSetAddress$1) continuationImpl;
                int i2 = deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.label;
                    com.yandex.go.route.interactor.b bVar = this.c;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        routePointType = mud0Var3.b == 0 ? RoutePointType.POINT_A : RoutePointType.POINT_B;
                        String type = routePointType.getType();
                        String str2 = mud0Var3.d;
                        if (str2 == null) {
                            str2 = "";
                        }
                        this.e.a(type, str2);
                        deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.L$0 = mud0Var3;
                        deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.L$1 = routePointType;
                        deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.label = 1;
                        a = a(mud0Var3, routePointType, deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            address2 = (Address) deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.L$2;
                            mud0Var2 = (mud0) deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                bVar.m(new ZoneAddress(address2, (Zone) obj), null);
                            } catch (Throwable unused) {
                            }
                            mud0Var3 = mud0Var2;
                            int i3 = mud0Var3.b;
                            str = mud0Var3.f;
                            if (str != null) {
                                y5i y5iVar = this.f;
                                if (i3 == 0) {
                                    y5i.q(y5iVar, null, null, null, null, null, str, null, 223);
                                } else {
                                    y5i.n(y5iVar, i3 - 1, null, null, null, null, null, str, null, 446);
                                }
                            }
                            return zy11.a;
                        }
                        RoutePointType routePointType2 = (RoutePointType) deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.L$1;
                        mud0 mud0Var4 = (mud0) deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.L$0;
                        kotlin.b.b(obj);
                        routePointType = routePointType2;
                        mud0Var3 = mud0Var4;
                        a = obj;
                    }
                    address = (Address) a;
                    if (address != null) {
                        int i4 = wxh.a[routePointType.ordinal()];
                        if (i4 == 1) {
                            try {
                                b bVar2 = this.a;
                                String zoneName = address.getZoneName();
                                zzs B = address.B();
                                deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.L$0 = mud0Var3;
                                deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.L$1 = null;
                                deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.L$2 = address;
                                deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.label = 2;
                                obj = bVar2.d(zoneName, B, deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1);
                            } catch (Throwable unused2) {
                                mud0Var2 = mud0Var3;
                            }
                            if (obj != coroutineSingletons) {
                                mud0Var2 = mud0Var3;
                                address2 = address;
                                bVar.m(new ZoneAddress(address2, (Zone) obj), null);
                                mud0Var3 = mud0Var2;
                                int i32 = mud0Var3.b;
                                str = mud0Var3.f;
                                if (str != null) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i4 == 2) {
                            bVar.b(mud0Var3.b - 1, address);
                        }
                        int i322 = mud0Var3.b;
                        str = mud0Var3.f;
                        if (str != null) {
                        }
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            address = (Address) a;
            if (address != null) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
        deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1 = new DeliveryCargoFlowAddressInteractor$resolveAndSetAddress$1(this, continuationImpl);
        Object obj2 = deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCargoFlowAddressInteractor$resolveAndSetAddress$1.label;
        com.yandex.go.route.interactor.b bVar3 = this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(mud0 mud0Var, ContinuationImpl continuationImpl) {
        DeliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1 deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1;
        int i;
        mud0 mud0Var2;
        RoutePointType routePointType;
        Address address;
        Object value;
        if (continuationImpl instanceof DeliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1) {
            deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1 = (DeliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1) continuationImpl;
            int i2 = deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    RoutePointType routePointType2 = mud0Var.b == 0 ? RoutePointType.DELIVERY_NDD_SOURCE : RoutePointType.DELIVERY_NDD_DESTINATION;
                    deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1.L$0 = mud0Var;
                    deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1.L$1 = routePointType2;
                    deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1.label = 1;
                    Serializable b = b(mud0Var, routePointType2, deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1);
                    if (b == serializable) {
                        return serializable;
                    }
                    mud0Var2 = mud0Var;
                    routePointType = routePointType2;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routePointType = (RoutePointType) deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1.L$1;
                    mud0Var2 = (mud0) deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1.L$0;
                    kotlin.b.b(obj);
                }
                address = (Address) obj;
                zy11 zy11Var = zy11.a;
                if (address != null) {
                    int i3 = wxh.a[routePointType.ordinal()];
                    jei jeiVar = this.g;
                    if (i3 == 3) {
                        oo0 k = qha1.k(address, true);
                        r0 r0Var = jeiVar.a.a;
                        do {
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, kei.a((kei) value, k, null, null, 13)));
                    } else if (i3 == 4) {
                        jeiVar.a.a(mud0Var2.b - 1, qha1.k(address, false));
                        return zy11Var;
                    }
                }
                return zy11Var;
            }
        }
        deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1 = new DeliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1(this, continuationImpl);
        Object obj2 = deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCargoFlowAddressInteractor$resolveAndSetPickupAddress$1.label;
        if (i != 0) {
        }
        address = (Address) obj2;
        zy11 zy11Var2 = zy11.a;
        if (address != null) {
        }
        return zy11Var2;
    }
}
