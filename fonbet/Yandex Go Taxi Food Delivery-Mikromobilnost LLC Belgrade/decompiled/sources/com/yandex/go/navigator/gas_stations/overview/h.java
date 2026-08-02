package com.yandex.go.navigator.gas_stations.overview;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewView;
import com.yandex.go.navigator.gas_stations.overview.j;
import com.yandex.go.navigator.gas_stations.repositories.GasStationsFocusRectReadyRequestRepository;
import com.yandex.go.navigator.repository.o;
import com.yandex.go.places.api.navigation.OrganizationCardExternalOverridesConfig$ConfigOption;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import defpackage.ad5;
import defpackage.avj0;
import defpackage.bwa1;
import defpackage.dwh0;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.fg80;
import defpackage.fvs;
import defpackage.gcc0;
import defpackage.gvs;
import defpackage.hcc0;
import defpackage.he80;
import defpackage.ie80;
import defpackage.ity;
import defpackage.jcb1;
import defpackage.je80;
import defpackage.kts;
import defpackage.kyh0;
import defpackage.mvs;
import defpackage.ny61;
import defpackage.ovs;
import defpackage.ows;
import defpackage.pts;
import defpackage.pv0;
import defpackage.pwy0;
import defpackage.qi80;
import defpackage.qoh;
import defpackage.rvs;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tuj;
import defpackage.tus;
import defpackage.w511;
import defpackage.xb50;
import defpackage.xl80;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class h extends ad5 {
    public final a A;
    public final com.yandex.go.navigator.gas_stations.repositories.c B;
    public final ows C;
    public final xb50 D;
    public final com.yandex.go.navigator.a E;
    public final pwy0 F;
    public final o G;
    public final ru.yandex.taxi.deeplinks.e H;
    public final com.yandex.go.navigator.gas_stations.analytics.a I;
    public final kts J;
    public final GasStationsFocusRectReadyRequestRepository K;
    public final n0 L;
    public final mvs x;
    public final zuj0 y;
    public final tus z;

    public h(mvs mvsVar, zuj0 zuj0Var, tus tusVar, a aVar, com.yandex.go.navigator.gas_stations.repositories.c cVar, ows owsVar, xb50 xb50Var, com.yandex.go.navigator.a aVar2, pwy0 pwy0Var, o oVar, ru.yandex.taxi.deeplinks.e eVar, com.yandex.go.navigator.gas_stations.analytics.a aVar3, kts ktsVar, GasStationsFocusRectReadyRequestRepository gasStationsFocusRectReadyRequestRepository) {
        super(fvs.class);
        this.x = mvsVar;
        this.y = zuj0Var;
        this.z = tusVar;
        this.A = aVar;
        this.B = cVar;
        this.C = owsVar;
        this.D = xb50Var;
        this.E = aVar2;
        this.F = pwy0Var;
        this.G = oVar;
        this.H = eVar;
        this.I = aVar3;
        this.J = ktsVar;
        this.K = gasStationsFocusRectReadyRequestRepository;
        this.L = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable Kg(h hVar, GeoObject geoObject, ContinuationImpl continuationImpl) {
        GasStationsOverviewPresenter$getAddress$1 gasStationsOverviewPresenter$getAddress$1;
        int i;
        hVar.getClass();
        if (continuationImpl instanceof GasStationsOverviewPresenter$getAddress$1) {
            gasStationsOverviewPresenter$getAddress$1 = (GasStationsOverviewPresenter$getAddress$1) continuationImpl;
            int i2 = gasStationsOverviewPresenter$getAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsOverviewPresenter$getAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsOverviewPresenter$getAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsOverviewPresenter$getAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs b = bwa1.b(geoObject);
                    if (b == null) {
                        return null;
                    }
                    ru.yandex.taxi.deeplinks.e eVar = hVar.H;
                    gasStationsOverviewPresenter$getAddress$1.L$0 = null;
                    gasStationsOverviewPresenter$getAddress$1.L$1 = null;
                    gasStationsOverviewPresenter$getAddress$1.label = 1;
                    obj = ru.yandex.taxi.deeplinks.e.b(eVar, b, gasStationsOverviewPresenter$getAddress$1, 30);
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
                return ((pv0) obj).a;
            }
        }
        gasStationsOverviewPresenter$getAddress$1 = new GasStationsOverviewPresenter$getAddress$1(hVar, continuationImpl);
        Object obj2 = gasStationsOverviewPresenter$getAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsOverviewPresenter$getAddress$1.label;
        if (i != 0) {
        }
        return ((pv0) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Lg(h hVar, GeoObject geoObject, ContinuationImpl continuationImpl) {
        GasStationsOverviewPresenter$renderSelectionOnArea$1 gasStationsOverviewPresenter$renderSelectionOnArea$1;
        int i;
        hVar.getClass();
        if (continuationImpl instanceof GasStationsOverviewPresenter$renderSelectionOnArea$1) {
            gasStationsOverviewPresenter$renderSelectionOnArea$1 = (GasStationsOverviewPresenter$renderSelectionOnArea$1) continuationImpl;
            int i2 = gasStationsOverviewPresenter$renderSelectionOnArea$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsOverviewPresenter$renderSelectionOnArea$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsOverviewPresenter$renderSelectionOnArea$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsOverviewPresenter$renderSelectionOnArea$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ((fvs) hVar.Dg()).render(new rvs(((avj0) hVar.y).h(kyh0.navigator_selected_station)));
                    List singletonList = Collections.singletonList(geoObject);
                    gasStationsOverviewPresenter$renderSelectionOnArea$1.L$0 = null;
                    gasStationsOverviewPresenter$renderSelectionOnArea$1.L$1 = null;
                    gasStationsOverviewPresenter$renderSelectionOnArea$1.label = 1;
                    obj = hVar.Og(singletonList, gasStationsOverviewPresenter$renderSelectionOnArea$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ((fvs) hVar.Dg()).render(new ovs((List) obj, 0));
                return zy11.a;
            }
        }
        gasStationsOverviewPresenter$renderSelectionOnArea$1 = new GasStationsOverviewPresenter$renderSelectionOnArea$1(hVar, continuationImpl);
        Object obj3 = gasStationsOverviewPresenter$renderSelectionOnArea$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsOverviewPresenter$renderSelectionOnArea$1.label;
        if (i != 0) {
        }
        ((fvs) hVar.Dg()).render(new ovs((List) obj3, 0));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Mg(h hVar, GeoObject geoObject, ContinuationImpl continuationImpl) {
        GasStationsOverviewPresenter$renderSelectionOnRoute$1 gasStationsOverviewPresenter$renderSelectionOnRoute$1;
        Object obj;
        int i;
        int indexOf;
        int i2;
        hVar.getClass();
        if (continuationImpl instanceof GasStationsOverviewPresenter$renderSelectionOnRoute$1) {
            gasStationsOverviewPresenter$renderSelectionOnRoute$1 = (GasStationsOverviewPresenter$renderSelectionOnRoute$1) continuationImpl;
            int i3 = gasStationsOverviewPresenter$renderSelectionOnRoute$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gasStationsOverviewPresenter$renderSelectionOnRoute$1.label = i3 - Integer.MIN_VALUE;
                obj = gasStationsOverviewPresenter$renderSelectionOnRoute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsOverviewPresenter$renderSelectionOnRoute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    indexOf = ((List) hVar.B.c.getValue()).indexOf(geoObject);
                    if (indexOf != -1) {
                        fvs fvsVar = (fvs) hVar.Dg();
                        gasStationsOverviewPresenter$renderSelectionOnRoute$1.L$0 = null;
                        gasStationsOverviewPresenter$renderSelectionOnRoute$1.I$0 = indexOf;
                        gasStationsOverviewPresenter$renderSelectionOnRoute$1.I$1 = indexOf;
                        gasStationsOverviewPresenter$renderSelectionOnRoute$1.label = 1;
                        obj = fvsVar.ke(gasStationsOverviewPresenter$renderSelectionOnRoute$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i2 = indexOf;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                indexOf = gasStationsOverviewPresenter$renderSelectionOnRoute$1.I$1;
                i2 = gasStationsOverviewPresenter$renderSelectionOnRoute$1.I$0;
                kotlin.b.b(obj);
                if (indexOf != ((Number) obj).intValue()) {
                    ((fvs) hVar.Dg()).e8(i2);
                }
                return zy11.a;
            }
        }
        gasStationsOverviewPresenter$renderSelectionOnRoute$1 = new GasStationsOverviewPresenter$renderSelectionOnRoute$1(hVar, continuationImpl);
        obj = gasStationsOverviewPresenter$renderSelectionOnRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsOverviewPresenter$renderSelectionOnRoute$1.label;
        if (i != 0) {
        }
        if (indexOf != ((Number) obj).intValue()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Ng(h hVar, ContinuationImpl continuationImpl) {
        GasStationsOverviewPresenter$renderSuccess$1 gasStationsOverviewPresenter$renderSuccess$1;
        int i;
        ovs ovsVar;
        List list;
        GeoObject geoObject;
        com.yandex.go.navigator.gas_stations.repositories.c cVar = hVar.B;
        if (continuationImpl instanceof GasStationsOverviewPresenter$renderSuccess$1) {
            gasStationsOverviewPresenter$renderSuccess$1 = (GasStationsOverviewPresenter$renderSuccess$1) continuationImpl;
            int i2 = gasStationsOverviewPresenter$renderSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsOverviewPresenter$renderSuccess$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsOverviewPresenter$renderSuccess$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsOverviewPresenter$renderSuccess$1.label;
                ovsVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    GasStationSearchType a = hVar.z.a();
                    int i3 = gvs.a[a.ordinal()];
                    if (i3 == 1) {
                        list = (List) cVar.c.getValue();
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        list = (List) cVar.e.getValue();
                    }
                    ((fvs) hVar.Dg()).render(new rvs(((avj0) hVar.y).f(dwh0.navigator_stations_plurals, list.size())));
                    if (a != GasStationSearchType.ON_ROUTE) {
                        if (cVar.g.getValue() == null) {
                            ovsVar = new ovs(EmptyList.a, 0);
                        }
                        if (ovsVar != null) {
                            ((fvs) hVar.Dg()).render(ovsVar);
                        }
                        return zy11.a;
                    }
                    geoObject = (GeoObject) cVar.h.getValue();
                    gasStationsOverviewPresenter$renderSuccess$1.L$0 = null;
                    gasStationsOverviewPresenter$renderSuccess$1.L$1 = null;
                    gasStationsOverviewPresenter$renderSuccess$1.L$2 = null;
                    gasStationsOverviewPresenter$renderSuccess$1.L$3 = geoObject;
                    gasStationsOverviewPresenter$renderSuccess$1.label = 1;
                    obj = hVar.Og(list, gasStationsOverviewPresenter$renderSuccess$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    geoObject = (GeoObject) gasStationsOverviewPresenter$renderSuccess$1.L$3;
                    kotlin.b.b(obj);
                }
                ovsVar = new ovs((List) obj, geoObject != null ? ((List) hVar.B.c.getValue()).indexOf(geoObject) : 0);
                if (ovsVar != null) {
                }
                return zy11.a;
            }
        }
        gasStationsOverviewPresenter$renderSuccess$1 = new GasStationsOverviewPresenter$renderSuccess$1(hVar, continuationImpl);
        Object obj3 = gasStationsOverviewPresenter$renderSuccess$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsOverviewPresenter$renderSuccess$1.label;
        ovsVar = null;
        if (i != 0) {
        }
        ovsVar = new ovs((List) obj3, geoObject != null ? ((List) hVar.B.c.getValue()).indexOf(geoObject) : 0);
        if (ovsVar != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.go.navigator.gas_stations.overview.b] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.go.navigator.gas_stations.overview.b] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.yandex.go.navigator.gas_stations.overview.b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009b -> B:10:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Og(List list, ContinuationImpl continuationImpl) {
        GasStationsOverviewPresenter$configureCardsStates$1 gasStationsOverviewPresenter$configureCardsStates$1;
        int i;
        Iterator it;
        Collection collection;
        GasStationsOverviewPresenter$configureCardsStates$1 gasStationsOverviewPresenter$configureCardsStates$12;
        if (continuationImpl instanceof GasStationsOverviewPresenter$configureCardsStates$1) {
            gasStationsOverviewPresenter$configureCardsStates$1 = (GasStationsOverviewPresenter$configureCardsStates$1) continuationImpl;
            int i2 = gasStationsOverviewPresenter$configureCardsStates$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsOverviewPresenter$configureCardsStates$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationsOverviewPresenter$configureCardsStates$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsOverviewPresenter$configureCardsStates$1.label;
                final int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    collection = arrayList;
                    gasStationsOverviewPresenter$configureCardsStates$12 = gasStationsOverviewPresenter$configureCardsStates$1;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) gasStationsOverviewPresenter$configureCardsStates$1.L$7;
                    it = (Iterator) gasStationsOverviewPresenter$configureCardsStates$1.L$4;
                    Collection collection2 = (Collection) gasStationsOverviewPresenter$configureCardsStates$1.L$3;
                    kotlin.b.b(obj);
                    gasStationsOverviewPresenter$configureCardsStates$12 = gasStationsOverviewPresenter$configureCardsStates$1;
                    collection.add((pts) obj);
                    collection = collection2;
                    if (it.hasNext()) {
                        final GeoObject geoObject = (GeoObject) it.next();
                        final int i4 = 0;
                        ?? r7 = new sls(this) { // from class: com.yandex.go.navigator.gas_stations.overview.b
                            public final /* synthetic */ h b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                String oid;
                                int i5 = i4;
                                zy11 zy11Var = zy11.a;
                                GeoObject geoObject2 = geoObject;
                                h hVar = this.b;
                                switch (i5) {
                                    case 0:
                                        final j jVar = hVar.x.a;
                                        BusinessObjectMetadata b = jcb1.b(geoObject2);
                                        if (b != null && (oid = b.getOid()) != null) {
                                            qi80 qi80Var = evu0.J(oid) ? null : new qi80(oid, null);
                                            if (qi80Var != null) {
                                                qoh h = tje.h(jVar.o(), null, null, new GasStationsOverviewRouter$launchOrganisationCardRouter$gasStationAddressAsync$1(jVar, geoObject2, null), 3);
                                                jVar.O.g.l(null);
                                                gcc0 gcc0Var = (gcc0) jVar.I.get();
                                                je80 je80Var = je80.u;
                                                OrganizationCardExternalOverridesConfig$ConfigOption[] organizationCardExternalOverridesConfig$ConfigOptionArr = {OrganizationCardExternalOverridesConfig$ConfigOption.WITHOUT_MAP};
                                                he80 he80Var = new he80();
                                                final int i6 = 0;
                                                int i7 = ie80.a[organizationCardExternalOverridesConfig$ConfigOptionArr[0].ordinal()];
                                                final int i8 = 1;
                                                if (i7 == 1) {
                                                    he80Var.h = 186;
                                                } else if (i7 == 2) {
                                                    he80Var.e = new ity();
                                                } else if (i7 == 3) {
                                                    he80Var.a = false;
                                                    he80Var.f = false;
                                                    he80Var.g = false;
                                                } else if (i7 != 4) {
                                                    w511.b();
                                                    break;
                                                } else {
                                                    he80Var.p();
                                                }
                                                ((hcc0) gcc0Var).b(new xl80(tuj.b, qi80Var, fg80.b, null, null, false, null, null, he80Var.a(), null, new sls() { // from class: kvs
                                                    @Override // defpackage.sls
                                                    public final Object invoke() {
                                                        int i9 = i6;
                                                        zy11 zy11Var2 = zy11.a;
                                                        j jVar2 = jVar;
                                                        switch (i9) {
                                                            case 0:
                                                                GasStationsOverviewView gasStationsOverviewView = jVar2.P;
                                                                if (gasStationsOverviewView != null) {
                                                                    gasStationsOverviewView.setVisibility(8);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                GasStationsOverviewView gasStationsOverviewView2 = jVar2.P;
                                                                if (gasStationsOverviewView2 != null) {
                                                                    gasStationsOverviewView2.setVisibility(0);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                        return zy11Var2;
                                                    }
                                                }, new sls() { // from class: kvs
                                                    @Override // defpackage.sls
                                                    public final Object invoke() {
                                                        int i9 = i8;
                                                        zy11 zy11Var2 = zy11.a;
                                                        j jVar2 = jVar;
                                                        switch (i9) {
                                                            case 0:
                                                                GasStationsOverviewView gasStationsOverviewView = jVar2.P;
                                                                if (gasStationsOverviewView != null) {
                                                                    gasStationsOverviewView.setVisibility(8);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                GasStationsOverviewView gasStationsOverviewView2 = jVar2.P;
                                                                if (gasStationsOverviewView2 != null) {
                                                                    gasStationsOverviewView2.setVisibility(0);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                        return zy11Var2;
                                                    }
                                                }, null, 4856), new i(jVar, oid, h, geoObject2));
                                                break;
                                            }
                                        }
                                        break;
                                    case 1:
                                        tje.N(hVar.Jg(), null, null, new GasStationsOverviewPresenter$onGasStationGoToClick$1(geoObject2, hVar, null), 3);
                                        break;
                                    default:
                                        tje.N(hVar.Jg(), null, null, new GasStationsOverviewPresenter$onGasStationGoViaClick$1(geoObject2, hVar, null), 3);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        ?? r8 = new sls(this) { // from class: com.yandex.go.navigator.gas_stations.overview.b
                            public final /* synthetic */ h b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                String oid;
                                int i5 = i3;
                                zy11 zy11Var = zy11.a;
                                GeoObject geoObject2 = geoObject;
                                h hVar = this.b;
                                switch (i5) {
                                    case 0:
                                        final j jVar = hVar.x.a;
                                        BusinessObjectMetadata b = jcb1.b(geoObject2);
                                        if (b != null && (oid = b.getOid()) != null) {
                                            qi80 qi80Var = evu0.J(oid) ? null : new qi80(oid, null);
                                            if (qi80Var != null) {
                                                qoh h = tje.h(jVar.o(), null, null, new GasStationsOverviewRouter$launchOrganisationCardRouter$gasStationAddressAsync$1(jVar, geoObject2, null), 3);
                                                jVar.O.g.l(null);
                                                gcc0 gcc0Var = (gcc0) jVar.I.get();
                                                je80 je80Var = je80.u;
                                                OrganizationCardExternalOverridesConfig$ConfigOption[] organizationCardExternalOverridesConfig$ConfigOptionArr = {OrganizationCardExternalOverridesConfig$ConfigOption.WITHOUT_MAP};
                                                he80 he80Var = new he80();
                                                final int i6 = 0;
                                                int i7 = ie80.a[organizationCardExternalOverridesConfig$ConfigOptionArr[0].ordinal()];
                                                final int i8 = 1;
                                                if (i7 == 1) {
                                                    he80Var.h = 186;
                                                } else if (i7 == 2) {
                                                    he80Var.e = new ity();
                                                } else if (i7 == 3) {
                                                    he80Var.a = false;
                                                    he80Var.f = false;
                                                    he80Var.g = false;
                                                } else if (i7 != 4) {
                                                    w511.b();
                                                    break;
                                                } else {
                                                    he80Var.p();
                                                }
                                                ((hcc0) gcc0Var).b(new xl80(tuj.b, qi80Var, fg80.b, null, null, false, null, null, he80Var.a(), null, new sls() { // from class: kvs
                                                    @Override // defpackage.sls
                                                    public final Object invoke() {
                                                        int i9 = i6;
                                                        zy11 zy11Var2 = zy11.a;
                                                        j jVar2 = jVar;
                                                        switch (i9) {
                                                            case 0:
                                                                GasStationsOverviewView gasStationsOverviewView = jVar2.P;
                                                                if (gasStationsOverviewView != null) {
                                                                    gasStationsOverviewView.setVisibility(8);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                GasStationsOverviewView gasStationsOverviewView2 = jVar2.P;
                                                                if (gasStationsOverviewView2 != null) {
                                                                    gasStationsOverviewView2.setVisibility(0);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                        return zy11Var2;
                                                    }
                                                }, new sls() { // from class: kvs
                                                    @Override // defpackage.sls
                                                    public final Object invoke() {
                                                        int i9 = i8;
                                                        zy11 zy11Var2 = zy11.a;
                                                        j jVar2 = jVar;
                                                        switch (i9) {
                                                            case 0:
                                                                GasStationsOverviewView gasStationsOverviewView = jVar2.P;
                                                                if (gasStationsOverviewView != null) {
                                                                    gasStationsOverviewView.setVisibility(8);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                GasStationsOverviewView gasStationsOverviewView2 = jVar2.P;
                                                                if (gasStationsOverviewView2 != null) {
                                                                    gasStationsOverviewView2.setVisibility(0);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                        return zy11Var2;
                                                    }
                                                }, null, 4856), new i(jVar, oid, h, geoObject2));
                                                break;
                                            }
                                        }
                                        break;
                                    case 1:
                                        tje.N(hVar.Jg(), null, null, new GasStationsOverviewPresenter$onGasStationGoToClick$1(geoObject2, hVar, null), 3);
                                        break;
                                    default:
                                        tje.N(hVar.Jg(), null, null, new GasStationsOverviewPresenter$onGasStationGoViaClick$1(geoObject2, hVar, null), 3);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        final int i5 = 2;
                        ?? r9 = new sls(this) { // from class: com.yandex.go.navigator.gas_stations.overview.b
                            public final /* synthetic */ h b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                String oid;
                                int i52 = i5;
                                zy11 zy11Var = zy11.a;
                                GeoObject geoObject2 = geoObject;
                                h hVar = this.b;
                                switch (i52) {
                                    case 0:
                                        final j jVar = hVar.x.a;
                                        BusinessObjectMetadata b = jcb1.b(geoObject2);
                                        if (b != null && (oid = b.getOid()) != null) {
                                            qi80 qi80Var = evu0.J(oid) ? null : new qi80(oid, null);
                                            if (qi80Var != null) {
                                                qoh h = tje.h(jVar.o(), null, null, new GasStationsOverviewRouter$launchOrganisationCardRouter$gasStationAddressAsync$1(jVar, geoObject2, null), 3);
                                                jVar.O.g.l(null);
                                                gcc0 gcc0Var = (gcc0) jVar.I.get();
                                                je80 je80Var = je80.u;
                                                OrganizationCardExternalOverridesConfig$ConfigOption[] organizationCardExternalOverridesConfig$ConfigOptionArr = {OrganizationCardExternalOverridesConfig$ConfigOption.WITHOUT_MAP};
                                                he80 he80Var = new he80();
                                                final int i6 = 0;
                                                int i7 = ie80.a[organizationCardExternalOverridesConfig$ConfigOptionArr[0].ordinal()];
                                                final int i8 = 1;
                                                if (i7 == 1) {
                                                    he80Var.h = 186;
                                                } else if (i7 == 2) {
                                                    he80Var.e = new ity();
                                                } else if (i7 == 3) {
                                                    he80Var.a = false;
                                                    he80Var.f = false;
                                                    he80Var.g = false;
                                                } else if (i7 != 4) {
                                                    w511.b();
                                                    break;
                                                } else {
                                                    he80Var.p();
                                                }
                                                ((hcc0) gcc0Var).b(new xl80(tuj.b, qi80Var, fg80.b, null, null, false, null, null, he80Var.a(), null, new sls() { // from class: kvs
                                                    @Override // defpackage.sls
                                                    public final Object invoke() {
                                                        int i9 = i6;
                                                        zy11 zy11Var2 = zy11.a;
                                                        j jVar2 = jVar;
                                                        switch (i9) {
                                                            case 0:
                                                                GasStationsOverviewView gasStationsOverviewView = jVar2.P;
                                                                if (gasStationsOverviewView != null) {
                                                                    gasStationsOverviewView.setVisibility(8);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                GasStationsOverviewView gasStationsOverviewView2 = jVar2.P;
                                                                if (gasStationsOverviewView2 != null) {
                                                                    gasStationsOverviewView2.setVisibility(0);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                        return zy11Var2;
                                                    }
                                                }, new sls() { // from class: kvs
                                                    @Override // defpackage.sls
                                                    public final Object invoke() {
                                                        int i9 = i8;
                                                        zy11 zy11Var2 = zy11.a;
                                                        j jVar2 = jVar;
                                                        switch (i9) {
                                                            case 0:
                                                                GasStationsOverviewView gasStationsOverviewView = jVar2.P;
                                                                if (gasStationsOverviewView != null) {
                                                                    gasStationsOverviewView.setVisibility(8);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                GasStationsOverviewView gasStationsOverviewView2 = jVar2.P;
                                                                if (gasStationsOverviewView2 != null) {
                                                                    gasStationsOverviewView2.setVisibility(0);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                        return zy11Var2;
                                                    }
                                                }, null, 4856), new i(jVar, oid, h, geoObject2));
                                                break;
                                            }
                                        }
                                        break;
                                    case 1:
                                        tje.N(hVar.Jg(), null, null, new GasStationsOverviewPresenter$onGasStationGoToClick$1(geoObject2, hVar, null), 3);
                                        break;
                                    default:
                                        tje.N(hVar.Jg(), null, null, new GasStationsOverviewPresenter$onGasStationGoViaClick$1(geoObject2, hVar, null), 3);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        gasStationsOverviewPresenter$configureCardsStates$12.L$0 = null;
                        gasStationsOverviewPresenter$configureCardsStates$12.L$1 = null;
                        gasStationsOverviewPresenter$configureCardsStates$12.L$2 = null;
                        gasStationsOverviewPresenter$configureCardsStates$12.L$3 = collection;
                        gasStationsOverviewPresenter$configureCardsStates$12.L$4 = it;
                        gasStationsOverviewPresenter$configureCardsStates$12.L$5 = null;
                        gasStationsOverviewPresenter$configureCardsStates$12.L$6 = null;
                        gasStationsOverviewPresenter$configureCardsStates$12.L$7 = collection;
                        gasStationsOverviewPresenter$configureCardsStates$12.label = 1;
                        obj = this.A.b(geoObject, r7, r8, r9, gasStationsOverviewPresenter$configureCardsStates$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection2 = collection;
                        collection.add((pts) obj);
                        collection = collection2;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        gasStationsOverviewPresenter$configureCardsStates$1 = new GasStationsOverviewPresenter$configureCardsStates$1(this, continuationImpl);
        Object obj2 = gasStationsOverviewPresenter$configureCardsStates$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsOverviewPresenter$configureCardsStates$1.label;
        final int i32 = 1;
        if (i != 0) {
        }
    }
}
