package xsna;

import com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState;
import com.vk.search.params.impl.presentation.modal.location.mvi.model.a;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LocationSearchReducer.kt */
/* loaded from: classes5.dex */
public final class qyz extends dm50<vyz, com.vk.search.params.impl.presentation.modal.location.mvi.model.a, LocationSearchState> {

    /* compiled from: LocationSearchReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocationSearchState.LocationErrorType.values().length];
            try {
                iArr[LocationSearchState.LocationErrorType.PERMISSION_DENIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocationSearchState.LocationErrorType.SERVICE_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocationSearchState.LocationErrorType.FETCH_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qyz() {
        this(0);
    }

    @Override // xsna.dm50
    public final LocationSearchState c(LocationSearchState locationSearchState, com.vk.search.params.impl.presentation.modal.location.mvi.model.a aVar) {
        LocationSearchState locationSearchState2 = locationSearchState;
        com.vk.search.params.impl.presentation.modal.location.mvi.model.a aVar2 = aVar;
        LocationSearchState.a aVar3 = locationSearchState2.b;
        if (aVar2 instanceof a.e) {
            a.e eVar = (a.e) aVar2;
            wfg0 wfg0Var = eVar.b;
            return new LocationSearchState(wfg0Var == null ? LocationSearchState.a.c.b : new LocationSearchState.a.e(wfg0Var), eVar.c);
        }
        if (aVar2.equals(a.c.b)) {
            return LocationSearchState.a(locationSearchState2, new LocationSearchState.a.f(aVar3 instanceof LocationSearchState.a.InterfaceC1772a ? ((LocationSearchState.a.InterfaceC1772a) aVar3).k() : aVar3 instanceof LocationSearchState.a.b ? ((LocationSearchState.a.b) aVar3).B() : null), null, 2);
        }
        if (aVar2 instanceof a.b) {
            a.b bVar = (a.b) aVar2;
            wfg0 k = aVar3 instanceof LocationSearchState.a.InterfaceC1772a ? ((LocationSearchState.a.InterfaceC1772a) aVar3).k() : aVar3 instanceof LocationSearchState.a.b ? ((LocationSearchState.a.b) aVar3).B() : null;
            LocationSearchState.LocationErrorType locationErrorType = bVar.b;
            return LocationSearchState.a(locationSearchState2, new LocationSearchState.a.d(locationErrorType, locationErrorType == LocationSearchState.LocationErrorType.FETCH_FAILED, false, k), null, 2);
        }
        if (aVar2 instanceof a.C1774a) {
            return LocationSearchState.a(locationSearchState2, new LocationSearchState.a.g(((a.C1774a) aVar2).b), null, 2);
        }
        if (aVar2 instanceof a.f) {
            return LocationSearchState.a(locationSearchState2, null, ((a.f) aVar2).b, 1);
        }
        if (!(aVar2 instanceof a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        a.d dVar = (a.d) aVar2;
        if (!(aVar3 instanceof LocationSearchState.a.d)) {
            return locationSearchState2;
        }
        LocationSearchState.a.d dVar2 = (LocationSearchState.a.d) aVar3;
        boolean z = dVar.b;
        Boolean bool = dVar.c;
        return LocationSearchState.a(locationSearchState2, new LocationSearchState.a.d(dVar2.b, bool != null ? bool.booleanValue() : dVar2.c, z, dVar2.e), null, 2);
    }

    @Override // xsna.dm50
    public final vyz d() {
        return new vyz(e(new k0j(this, 23)), e(new f2s(this, 16)));
    }

    @Override // xsna.dm50
    public final void h(LocationSearchState locationSearchState, vyz vyzVar) {
        LocationSearchState locationSearchState2 = locationSearchState;
        vyz vyzVar2 = vyzVar;
        f(vyzVar2.a, locationSearchState2.b);
        f(vyzVar2.b, locationSearchState2);
    }

    public qyz(int i) {
        super(new LocationSearchState(0));
    }
}
