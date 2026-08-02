package xsna;

import com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LocationSearchReducer.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class ryz extends FunctionReferenceImpl implements wzs<LocationSearchState.a, LocationSearchState.b, Boolean> {
    @Override // xsna.wzs
    public final Boolean invoke(LocationSearchState.a aVar, LocationSearchState.b bVar) {
        LocationSearchState.a aVar2 = aVar;
        LocationSearchState.b bVar2 = bVar;
        ((qyz) this.receiver).getClass();
        boolean z = true;
        if (!(bVar2 instanceof LocationSearchState.b.a)) {
            if (!epx.f(bVar2, LocationSearchState.b.C1773b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(aVar2 instanceof LocationSearchState.a.e) && !(aVar2 instanceof LocationSearchState.a.g)) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
