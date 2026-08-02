package com.yandex.go.taxi.summary.mobilityhub.mapper;

import defpackage.cvw;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class VerticalHubItemsUiStateMapper$mapItemsUiState$2$1 extends FunctionReferenceImpl implements sls {
    final /* synthetic */ Ref$IntRef $serialNumber;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubItemsUiStateMapper$mapItemsUiState$2$1(Ref$IntRef ref$IntRef) {
        super(0, 0, cvw.class, "nextOfferSerialNumber", "mapItemsUiState$nextOfferSerialNumber(Lkotlin/jvm/internal/Ref$IntRef;)I");
        this.$serialNumber = ref$IntRef;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Ref$IntRef ref$IntRef = this.$serialNumber;
        int i = ref$IntRef.element;
        ref$IntRef.element = i + 1;
        return Integer.valueOf(i);
    }
}
