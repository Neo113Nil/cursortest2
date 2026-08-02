package xsna;

import com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.qyz;

/* compiled from: LocationSearchReducer.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class syz extends FunctionReferenceImpl implements izs<LocationSearchState.a, eyz> {
    @Override // xsna.izs
    public final eyz invoke(LocationSearchState.a aVar) {
        int i;
        LocationSearchState.a aVar2 = aVar;
        ((qyz) this.receiver).getClass();
        if (epx.f(aVar2, LocationSearchState.a.c.b)) {
            return new eyz(19, Integer.valueOf(R.string.search_params_my_location_communities_description), null, null);
        }
        if (aVar2 instanceof LocationSearchState.a.e) {
            return new eyz(5, null, Integer.valueOf(R.string.refresh), ((LocationSearchState.a.e) aVar2).b.a);
        }
        if (aVar2 instanceof LocationSearchState.a.f) {
            return new eyz(26, Integer.valueOf(R.string.search_params_my_location_processing_description), null, null);
        }
        if (!(aVar2 instanceof LocationSearchState.a.d)) {
            if (aVar2 instanceof LocationSearchState.a.g) {
                return new eyz(21, null, null, ((LocationSearchState.a.g) aVar2).b.a);
            }
            throw new NoWhenBranchMatchedException();
        }
        LocationSearchState.a.d dVar = (LocationSearchState.a.d) aVar2;
        int i2 = qyz.a.$EnumSwitchMapping$0[dVar.b.ordinal()];
        if (i2 == 1) {
            i = R.string.search_params_my_location_error_permissions_denied;
        } else if (i2 == 2) {
            i = R.string.search_params_my_location_error_service_disabled;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.search_params_my_location_error_fetch_failed;
        }
        return new eyz(11, Integer.valueOf(i), Integer.valueOf(dVar.c ? R.string.search_params_my_location_retry_action : R.string.search_params_my_location_settings_action), null);
    }
}
