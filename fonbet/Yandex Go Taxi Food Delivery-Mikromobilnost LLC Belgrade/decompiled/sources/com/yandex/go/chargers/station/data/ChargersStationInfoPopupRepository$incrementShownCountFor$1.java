package com.yandex.go.chargers.station.data;

import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ChargersStationInfoPopupRepository$incrementShownCountFor$1 extends FunctionReferenceImpl implements wls {
    public static final ChargersStationInfoPopupRepository$incrementShownCountFor$1 b = new ChargersStationInfoPopupRepository$incrementShownCountFor$1(2, 0, Integer.TYPE, "plus", "plus(I)I");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((Number) obj2).intValue() + ((Number) obj).intValue());
    }
}
