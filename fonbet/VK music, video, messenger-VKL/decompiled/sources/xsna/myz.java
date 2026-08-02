package xsna;

import com.vk.search.params.api.City;
import com.vk.search.params.api.domain.model.SearchLocation;
import com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState;
import com.vk.search.params.impl.presentation.modal.location.mvi.model.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.dyz;
import xsna.tyz;

/* compiled from: LocationSearchFeature.kt */
/* loaded from: classes5.dex */
public final class myz extends wk50<vyz, LocationSearchState, dyz, com.vk.search.params.impl.presentation.modal.location.mvi.model.a> {
    public final hzz f;
    public final f4z<tyz> g;

    public myz(qyz qyzVar, dyz.f fVar, hzz hzzVar) {
        super(fVar, qyzVar);
        this.f = hzzVar;
        this.g = new f4z<>();
        a7f0.a.e(this, hzzVar.d(), null, new qi3(1, this, myz.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 10), null, null, 13);
    }

    @Override // xsna.wk50
    public final void N(LocationSearchState locationSearchState, dyz dyzVar) {
        wfg0 wfg0Var;
        LocationSearchState locationSearchState2 = locationSearchState;
        dyz dyzVar2 = dyzVar;
        LocationSearchState.a aVar = locationSearchState2.b;
        boolean z = dyzVar2 instanceof dyz.f;
        LocationSearchState.b bVar = LocationSearchState.b.C1773b.a;
        if (z) {
            SearchLocation searchLocation = ((dyz.f) dyzVar2).b;
            boolean z2 = searchLocation instanceof SearchLocation.CurrentLocation;
            if ((z2 ? (SearchLocation.CurrentLocation) searchLocation : null) != null) {
                SearchLocation.CurrentLocation currentLocation = (SearchLocation.CurrentLocation) searchLocation;
                wfg0Var = new wfg0(currentLocation.b, currentLocation.c, null, null);
            } else {
                wfg0Var = null;
            }
            if (searchLocation instanceof SearchLocation.City) {
                bVar = new LocationSearchState.b.a(((SearchLocation.City) searchLocation).b);
            } else if (!z2) {
                if (searchLocation != null) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new LocationSearchState.b.a(null);
            }
            T(new a.e(wfg0Var, bVar));
            return;
        }
        boolean equals = dyzVar2.equals(dyz.e.b);
        tyz.e eVar = tyz.e.a;
        a.c cVar = a.c.b;
        tyz.b bVar2 = tyz.b.a;
        f4z<tyz> f4zVar = this.g;
        if (equals) {
            f4zVar.b(bVar2);
            T(new a.f(bVar));
            if (aVar instanceof LocationSearchState.a.c) {
                T(cVar);
                f4zVar.b(eVar);
                return;
            }
            return;
        }
        if (dyzVar2.equals(dyz.d.b)) {
            if (aVar instanceof LocationSearchState.a.e) {
                T(cVar);
                f4zVar.b(eVar);
                return;
            }
            if (aVar instanceof LocationSearchState.a.d) {
                LocationSearchState.a.d dVar = (LocationSearchState.a.d) aVar;
                if (dVar.c) {
                    T(cVar);
                    f4zVar.b(eVar);
                    return;
                }
                LocationSearchState.LocationErrorType locationErrorType = dVar.b;
                if (locationErrorType == LocationSearchState.LocationErrorType.PERMISSION_DENIED) {
                    T(new a.d());
                    f4zVar.b(tyz.d.a);
                    return;
                } else {
                    if (locationErrorType == LocationSearchState.LocationErrorType.SERVICE_DISABLED) {
                        T(new a.d());
                        f4zVar.b(tyz.c.a);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (dyzVar2 instanceof dyz.g) {
            dyz.g gVar = (dyz.g) dyzVar2;
            if (gVar.b) {
                if (!gVar.c) {
                    T(new a.b(LocationSearchState.LocationErrorType.SERVICE_DISABLED));
                    return;
                }
                this.f.c.onNext(s3q0.a);
                if (aVar instanceof LocationSearchState.a.d) {
                    T(cVar);
                    return;
                }
                return;
            }
            LocationSearchState.LocationErrorType locationErrorType2 = LocationSearchState.LocationErrorType.PERMISSION_DENIED;
            if (aVar instanceof LocationSearchState.a.d) {
                LocationSearchState.a.d dVar2 = (LocationSearchState.a.d) aVar;
                if (dVar2.b == locationErrorType2 && dVar2.d) {
                    T(new a.d(false, Boolean.TRUE));
                    return;
                }
            }
            T(new a.b(locationErrorType2));
            return;
        }
        if (dyzVar2 instanceof dyz.b) {
            f4zVar.b(bVar2);
            T(new a.f(new LocationSearchState.b.a(((dyz.b) dyzVar2).b)));
            return;
        }
        if (dyzVar2.equals(dyz.c.b)) {
            if (aVar instanceof LocationSearchState.a.d) {
                LocationSearchState.a.d dVar3 = (LocationSearchState.a.d) aVar;
                if (!dVar3.d || dVar3.b == LocationSearchState.LocationErrorType.FETCH_FAILED) {
                    return;
                }
                f4zVar.b(tyz.a.a);
                return;
            }
            return;
        }
        if (!dyzVar2.equals(dyz.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        LocationSearchState.b bVar3 = locationSearchState2.c;
        if (bVar3 instanceof LocationSearchState.b.a) {
            City city = ((LocationSearchState.b.a) bVar3).a;
            f4zVar.b(new tyz.f(city != null ? new SearchLocation.City(city) : null));
        } else {
            if (!epx.f(bVar3, bVar)) {
                throw new NoWhenBranchMatchedException();
            }
            if (aVar instanceof LocationSearchState.a.b) {
                wfg0 B = ((LocationSearchState.a.b) aVar).B();
                f4zVar.b(new tyz.f(new SearchLocation.CurrentLocation(B.a, B.b)));
            }
        }
    }
}
