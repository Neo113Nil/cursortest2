package com.yandex.go.places.organization.card.impl.domain.interactors.map.walkroute;

import com.yandex.go.places.experiments.walkroute.b;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.jst;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.po21;
import defpackage.sk80;
import defpackage.tk80;
import defpackage.zy11;
import defpackage.zzs;
import io.appmetrica.analytics.BuildConfig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes13.dex */
public final class a {
    public final ru.yandex.taxi.walkroute.a a;
    public final po21 b;
    public final tk80 c;
    public final b d;

    public a(ru.yandex.taxi.walkroute.a aVar, po21 po21Var, tk80 tk80Var, b bVar) {
        this.a = aVar;
        this.b = po21Var;
        this.c = tk80Var;
        this.d = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0077, code lost:
    
        if (r4 == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, ContinuationImpl continuationImpl) {
        OrganizationWalkingRouteInteractor$updateWalkingRoute$1 organizationWalkingRouteInteractor$updateWalkingRoute$1;
        int i;
        zzs zzsVar2;
        Object b;
        mo21 mo21Var;
        zzs a;
        zzs zzsVar3;
        sk80 sk80Var;
        sk80 sk80Var2;
        Iterator it;
        Object next;
        Route route;
        if (continuationImpl instanceof OrganizationWalkingRouteInteractor$updateWalkingRoute$1) {
            organizationWalkingRouteInteractor$updateWalkingRoute$1 = (OrganizationWalkingRouteInteractor$updateWalkingRoute$1) continuationImpl;
            int i2 = organizationWalkingRouteInteractor$updateWalkingRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationWalkingRouteInteractor$updateWalkingRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationWalkingRouteInteractor$updateWalkingRoute$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationWalkingRouteInteractor$updateWalkingRoute$1.label;
                tk80 tk80Var = this.c;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzsVar2 = zzsVar;
                    organizationWalkingRouteInteractor$updateWalkingRoute$1.L$0 = zzsVar2;
                    organizationWalkingRouteInteractor$updateWalkingRoute$1.label = 1;
                    b = b(organizationWalkingRouteInteractor$updateWalkingRoute$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            a = (zzs) organizationWalkingRouteInteractor$updateWalkingRoute$1.L$2;
                            zzsVar3 = (zzs) organizationWalkingRouteInteractor$updateWalkingRoute$1.L$0;
                            kotlin.b.b(obj);
                            sk80Var = (sk80) obj;
                            if (ru.yandex.taxi.map.utils.a.j(a, zzsVar3) <= sk80Var.b) {
                                tk80Var.a(null);
                                return zy11Var;
                            }
                            organizationWalkingRouteInteractor$updateWalkingRoute$1.L$0 = null;
                            organizationWalkingRouteInteractor$updateWalkingRoute$1.L$1 = null;
                            organizationWalkingRouteInteractor$updateWalkingRoute$1.L$2 = null;
                            organizationWalkingRouteInteractor$updateWalkingRoute$1.L$3 = sk80Var;
                            organizationWalkingRouteInteractor$updateWalkingRoute$1.label = 3;
                            Object b2 = this.a.b(a, zzsVar3, organizationWalkingRouteInteractor$updateWalkingRoute$1);
                            if (b2 != obj2) {
                                obj = b2;
                                sk80Var2 = sk80Var;
                                it = ((List) obj).iterator();
                                if (it.hasNext()) {
                                }
                                route = (Route) next;
                                if (route != null) {
                                }
                                tk80Var.a(null);
                                return zy11Var;
                            }
                            return obj2;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sk80Var2 = (sk80) organizationWalkingRouteInteractor$updateWalkingRoute$1.L$3;
                        kotlin.b.b(obj);
                        it = ((List) obj).iterator();
                        if (it.hasNext()) {
                            next = null;
                        } else {
                            next = it.next();
                            if (it.hasNext()) {
                                double a2 = nzs.a((Route) next);
                                do {
                                    Object next2 = it.next();
                                    double a3 = nzs.a((Route) next2);
                                    if (Double.compare(a2, a3) > 0) {
                                        next = next2;
                                        a2 = a3;
                                    }
                                } while (it.hasNext());
                            }
                        }
                        route = (Route) next;
                        if (route != null || route.getGeometry().getPoints().isEmpty()) {
                            tk80Var.a(null);
                            return zy11Var;
                        }
                        if (nzs.a(route) > sk80Var2.a) {
                            tk80Var.a(null);
                            return zy11Var;
                        }
                        tk80Var.a(new WalkingRouteUiState(route.getGeometry().getPoints(), route.getMetadata().getWeight().getTime().getText(), 0.0f, new Float(21.0f), null, null, null, BuildConfig.API_LEVEL));
                        return zy11Var;
                    }
                    zzs zzsVar4 = (zzs) organizationWalkingRouteInteractor$updateWalkingRoute$1.L$0;
                    kotlin.b.b(obj);
                    b = obj;
                    zzsVar2 = zzsVar4;
                }
                mo21Var = (mo21) b;
                if (mo21Var != null) {
                    tk80Var.a(null);
                    return zy11Var;
                }
                a = mo21Var.a();
                organizationWalkingRouteInteractor$updateWalkingRoute$1.L$0 = zzsVar2;
                organizationWalkingRouteInteractor$updateWalkingRoute$1.L$1 = null;
                organizationWalkingRouteInteractor$updateWalkingRoute$1.L$2 = a;
                organizationWalkingRouteInteractor$updateWalkingRoute$1.label = 2;
                Object a4 = this.d.a(organizationWalkingRouteInteractor$updateWalkingRoute$1);
                if (a4 != obj2) {
                    zzsVar3 = zzsVar2;
                    obj = a4;
                    sk80Var = (sk80) obj;
                    if (ru.yandex.taxi.map.utils.a.j(a, zzsVar3) <= sk80Var.b) {
                    }
                }
                return obj2;
            }
        }
        organizationWalkingRouteInteractor$updateWalkingRoute$1 = new OrganizationWalkingRouteInteractor$updateWalkingRoute$1(this, continuationImpl);
        Object obj3 = organizationWalkingRouteInteractor$updateWalkingRoute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationWalkingRouteInteractor$updateWalkingRoute$1.label;
        tk80 tk80Var2 = this.c;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        mo21Var = (mo21) b;
        if (mo21Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        OrganizationWalkingRouteInteractor$userLocation$1 organizationWalkingRouteInteractor$userLocation$1;
        int i;
        try {
            if (continuationImpl instanceof OrganizationWalkingRouteInteractor$userLocation$1) {
                organizationWalkingRouteInteractor$userLocation$1 = (OrganizationWalkingRouteInteractor$userLocation$1) continuationImpl;
                int i2 = organizationWalkingRouteInteractor$userLocation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    organizationWalkingRouteInteractor$userLocation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = organizationWalkingRouteInteractor$userLocation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = organizationWalkingRouteInteractor$userLocation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        po21 po21Var = this.b;
                        organizationWalkingRouteInteractor$userLocation$1.label = 1;
                        obj = ((e) po21Var).f(organizationWalkingRouteInteractor$userLocation$1);
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
                    return (mo21) obj;
                }
            }
            if (i != 0) {
            }
            return (mo21) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Failed to obtain user location for organization walking route");
            return null;
        }
        organizationWalkingRouteInteractor$userLocation$1 = new OrganizationWalkingRouteInteractor$userLocation$1(this, continuationImpl);
        Object obj2 = organizationWalkingRouteInteractor$userLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationWalkingRouteInteractor$userLocation$1.label;
    }
}
