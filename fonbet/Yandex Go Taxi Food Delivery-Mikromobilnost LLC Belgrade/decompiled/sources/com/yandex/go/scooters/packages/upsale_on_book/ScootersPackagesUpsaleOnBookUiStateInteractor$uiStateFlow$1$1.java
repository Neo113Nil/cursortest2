package com.yandex.go.scooters.packages.upsale_on_book;

import defpackage.awn0;
import defpackage.bbo0;
import defpackage.bms;
import defpackage.bvf0;
import defpackage.dbo0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersPackagesUpsaleOnBookUiStateInteractor$uiStateFlow$1$1 extends FunctionReferenceImpl implements bms {
    public final Object i(dbo0 dbo0Var, awn0 awn0Var, boolean z, Continuation continuation) {
        bbo0 bbo0Var = (bbo0) this.receiver;
        bbo0Var.getClass();
        return bvf0.n(new ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2(dbo0Var, awn0Var, bbo0Var, z, null), continuation);
    }

    @Override // defpackage.bms
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return i((dbo0) obj, (awn0) obj2, ((Boolean) obj3).booleanValue(), (Continuation) obj4);
    }
}
