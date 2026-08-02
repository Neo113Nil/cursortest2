package com.yandex.go.scooters.super_passes.upsale_on_book;

import com.yandex.go.scooters.passes.data.model.ScootersSuperPassLegalTermsExperiment;
import defpackage.abo0;
import defpackage.bms;
import defpackage.bvf0;
import defpackage.p2p0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersSuperPassesUpsaleOnBookUiStateInteractor$uiStateFlow$1$1 extends FunctionReferenceImpl implements bms {
    public final Object i(p2p0 p2p0Var, ScootersSuperPassLegalTermsExperiment scootersSuperPassLegalTermsExperiment, boolean z, Continuation continuation) {
        abo0 abo0Var = (abo0) this.receiver;
        abo0Var.getClass();
        return bvf0.n(new ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2(p2p0Var, abo0Var, scootersSuperPassLegalTermsExperiment, z, null), continuation);
    }

    @Override // defpackage.bms
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return i((p2p0) obj, (ScootersSuperPassLegalTermsExperiment) obj2, ((Boolean) obj3).booleanValue(), (Continuation) obj4);
    }
}
