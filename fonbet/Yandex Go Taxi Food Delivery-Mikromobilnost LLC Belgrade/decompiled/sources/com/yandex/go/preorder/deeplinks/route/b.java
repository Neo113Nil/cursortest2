package com.yandex.go.preorder.deeplinks.route;

import android.net.Uri;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import defpackage.b64;
import defpackage.c2l0;
import defpackage.cxq0;
import defpackage.f4v0;
import defpackage.h4l0;
import defpackage.hst;
import defpackage.i3c0;
import defpackage.jst;
import defpackage.ny61;
import defpackage.q0h;
import defpackage.rwp0;
import defpackage.t9j0;
import defpackage.v7v0;
import defpackage.w2h;
import defpackage.wnt;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.api.suggest.Action;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.source.h;

/* loaded from: classes13.dex */
public final class b {
    public final cxq0 a;
    public final h4l0 b;
    public final wnt c;
    public final ru.yandex.taxi.favorites.data.repo.a d;
    public final h e;
    public final w2h f;
    public final q0h g;

    public b(cxq0 cxq0Var, h4l0 h4l0Var, wnt wntVar, ru.yandex.taxi.favorites.data.repo.a aVar, h hVar, w2h w2hVar, q0h q0hVar) {
        this.a = cxq0Var;
        this.b = h4l0Var;
        this.c = wntVar;
        this.d = aVar;
        this.e = hVar;
        this.f = w2hVar;
        this.g = q0hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, c2l0 c2l0Var, List list, ContinuationImpl continuationImpl) {
        IntentDataInteractor$getDestinationPoint$1 intentDataInteractor$getDestinationPoint$1;
        int i;
        zzs zzsVar;
        bVar.getClass();
        if (continuationImpl instanceof IntentDataInteractor$getDestinationPoint$1) {
            intentDataInteractor$getDestinationPoint$1 = (IntentDataInteractor$getDestinationPoint$1) continuationImpl;
            int i2 = intentDataInteractor$getDestinationPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intentDataInteractor$getDestinationPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intentDataInteractor$getDestinationPoint$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intentDataInteractor$getDestinationPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs d = d(c2l0Var.j, list);
                    if (d != null) {
                        return d;
                    }
                    String str = c2l0Var.j;
                    RoutePointType routePointType = RoutePointType.POINT_B;
                    intentDataInteractor$getDestinationPoint$1.L$0 = c2l0Var;
                    intentDataInteractor$getDestinationPoint$1.L$1 = null;
                    intentDataInteractor$getDestinationPoint$1.label = 1;
                    obj = bVar.c(str, routePointType, "destination", intentDataInteractor$getDestinationPoint$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c2l0Var = (c2l0) intentDataInteractor$getDestinationPoint$1.L$0;
                    kotlin.b.b(obj);
                }
                zzsVar = (zzs) obj;
                if (zzsVar == null) {
                    return zzsVar;
                }
                Double d2 = c2l0Var.k;
                Double d3 = c2l0Var.l;
                if (d2 == null || d3 == null) {
                    jst.e.getClass();
                    return null;
                }
                hst hstVar = jst.e;
                String.format("Got destination geo point from URI (lat:%s, lon:%s)", Arrays.copyOf(new Object[]{d2, d3}, 2));
                hstVar.getClass();
                return new zzs(d2.doubleValue(), d3.doubleValue(), 0, null, null, 28);
            }
        }
        intentDataInteractor$getDestinationPoint$1 = new IntentDataInteractor$getDestinationPoint$1(bVar, continuationImpl);
        Object obj3 = intentDataInteractor$getDestinationPoint$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intentDataInteractor$getDestinationPoint$1.label;
        if (i != 0) {
        }
        zzsVar = (zzs) obj3;
        if (zzsVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, c2l0 c2l0Var, List list, ContinuationImpl continuationImpl) {
        IntentDataInteractor$getSourcePoint$1 intentDataInteractor$getSourcePoint$1;
        int i;
        zzs zzsVar;
        bVar.getClass();
        if (continuationImpl instanceof IntentDataInteractor$getSourcePoint$1) {
            intentDataInteractor$getSourcePoint$1 = (IntentDataInteractor$getSourcePoint$1) continuationImpl;
            int i2 = intentDataInteractor$getSourcePoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intentDataInteractor$getSourcePoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intentDataInteractor$getSourcePoint$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intentDataInteractor$getSourcePoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs d = d(c2l0Var.g, list);
                    if (d != null) {
                        return d;
                    }
                    String str = c2l0Var.g;
                    RoutePointType routePointType = RoutePointType.POINT_A;
                    intentDataInteractor$getSourcePoint$1.L$0 = c2l0Var;
                    intentDataInteractor$getSourcePoint$1.L$1 = null;
                    intentDataInteractor$getSourcePoint$1.label = 1;
                    obj = bVar.c(str, routePointType, "source", intentDataInteractor$getSourcePoint$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c2l0Var = (c2l0) intentDataInteractor$getSourcePoint$1.L$0;
                    kotlin.b.b(obj);
                }
                zzsVar = (zzs) obj;
                if (zzsVar == null) {
                    return zzsVar;
                }
                Double d2 = c2l0Var.h;
                Double d3 = c2l0Var.i;
                if (d2 == null || d3 == null) {
                    jst.e.getClass();
                    return null;
                }
                hst hstVar = jst.e;
                String.format("Got source geo point from URI (lat:%s, lon:%s)", Arrays.copyOf(new Object[]{d2, d3}, 2));
                hstVar.getClass();
                return new zzs(d2.doubleValue(), d3.doubleValue(), 0, null, null, 28);
            }
        }
        intentDataInteractor$getSourcePoint$1 = new IntentDataInteractor$getSourcePoint$1(bVar, continuationImpl);
        Object obj3 = intentDataInteractor$getSourcePoint$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intentDataInteractor$getSourcePoint$1.label;
        if (i != 0) {
        }
        zzsVar = (zzs) obj3;
        if (zzsVar == null) {
        }
    }

    public static zzs d(String str, List list) {
        Object obj;
        Object obj2;
        PlaceType.Companion.getClass();
        PlaceType a = i3c0.a(str);
        if (list == null) {
            return null;
        }
        if (a == PlaceType.HOME) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((FavoriteAddress) obj2).getPlaceType() == PlaceType.HOME) {
                    break;
                }
            }
            FavoriteAddress favoriteAddress = (FavoriteAddress) obj2;
            if (favoriteAddress == null) {
                return null;
            }
            jst.e.getClass();
            return new zzs(favoriteAddress.getPoint().a, favoriteAddress.getPoint().b, 0, null, null, 28);
        }
        if (a != PlaceType.WORK) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((FavoriteAddress) obj).getPlaceType() == PlaceType.WORK) {
                break;
            }
        }
        FavoriteAddress favoriteAddress2 = (FavoriteAddress) obj;
        if (favoriteAddress2 == null) {
            return null;
        }
        jst.e.getClass();
        return new zzs(favoriteAddress2.getPoint().a, favoriteAddress2.getPoint().b, 0, null, null, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, RoutePointType routePointType, String str2, ContinuationImpl continuationImpl) {
        IntentDataInteractor$createGeoPointForAddressOrNull$1 intentDataInteractor$createGeoPointForAddressOrNull$1;
        int i;
        String str3;
        h hVar;
        t9j0 t9j0Var;
        Object b;
        f4v0 f4v0Var;
        v7v0 v7v0Var;
        String str4 = str;
        try {
            if (continuationImpl instanceof IntentDataInteractor$createGeoPointForAddressOrNull$1) {
                intentDataInteractor$createGeoPointForAddressOrNull$1 = (IntentDataInteractor$createGeoPointForAddressOrNull$1) continuationImpl;
                int i2 = intentDataInteractor$createGeoPointForAddressOrNull$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    intentDataInteractor$createGeoPointForAddressOrNull$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = intentDataInteractor$createGeoPointForAddressOrNull$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = intentDataInteractor$createGeoPointForAddressOrNull$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (str4 == null) {
                            return null;
                        }
                        rwp0 rwp0Var = new rwp0(routePointType, false);
                        try {
                            String decode = Uri.decode(str4);
                            hVar = this.e;
                            t9j0Var = new t9j0(rwp0Var.c(), routePointType.getType(), decode, rwp0Var.a(), null, rwp0Var.d.get(), null, null, null);
                            intentDataInteractor$createGeoPointForAddressOrNull$1.L$0 = str4;
                            intentDataInteractor$createGeoPointForAddressOrNull$1.L$1 = null;
                            str3 = str2;
                        } catch (Throwable th) {
                            th = th;
                            str3 = str2;
                            jst.e.k(th, b64.l("Error for ", str3, " – search address: ", str4));
                            f4v0Var = null;
                            if (f4v0Var != null) {
                            }
                            if (v7v0Var == null) {
                            }
                        }
                        try {
                            intentDataInteractor$createGeoPointForAddressOrNull$1.L$2 = str3;
                            intentDataInteractor$createGeoPointForAddressOrNull$1.L$3 = null;
                            intentDataInteractor$createGeoPointForAddressOrNull$1.L$4 = null;
                            intentDataInteractor$createGeoPointForAddressOrNull$1.label = 1;
                            hVar.getClass();
                            b = hVar.b(Action.SEARCH, t9j0Var, intentDataInteractor$createGeoPointForAddressOrNull$1);
                            if (b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            jst.e.k(th, b64.l("Error for ", str3, " – search address: ", str4));
                            f4v0Var = null;
                            if (f4v0Var != null) {
                            }
                            if (v7v0Var == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str5 = (String) intentDataInteractor$createGeoPointForAddressOrNull$1.L$2;
                        String str6 = (String) intentDataInteractor$createGeoPointForAddressOrNull$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            b = obj;
                            str3 = str5;
                            str4 = str6;
                        } catch (Throwable th3) {
                            th = th3;
                            str3 = str5;
                            str4 = str6;
                            jst.e.k(th, b64.l("Error for ", str3, " – search address: ", str4));
                            f4v0Var = null;
                            if (f4v0Var != null) {
                            }
                            if (v7v0Var == null) {
                            }
                        }
                    }
                    f4v0Var = (f4v0) b;
                    if (f4v0Var != null) {
                        ArrayList arrayList = f4v0Var.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (obj2 instanceof v7v0) {
                                arrayList2.add(obj2);
                            }
                        }
                        v7v0Var = (v7v0) kotlin.collections.a.R(arrayList2);
                    } else {
                        v7v0Var = null;
                    }
                    if (v7v0Var == null) {
                        return null;
                    }
                    zzs zzsVar = v7v0Var.a;
                    hst hstVar = jst.e;
                    double d = zzsVar.a;
                    hstVar.getClass();
                    return zzsVar;
                }
            }
            if (i != 0) {
            }
            f4v0Var = (f4v0) b;
            if (f4v0Var != null) {
            }
            if (v7v0Var == null) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        intentDataInteractor$createGeoPointForAddressOrNull$1 = new IntentDataInteractor$createGeoPointForAddressOrNull$1(this, continuationImpl);
        Object obj3 = intentDataInteractor$createGeoPointForAddressOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intentDataInteractor$createGeoPointForAddressOrNull$1.label;
    }
}
